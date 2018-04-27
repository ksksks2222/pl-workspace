$(function(){

	// --------------- 局部变量 ---------------
	// 优惠后的支付金额
	var _shouldMoney = parseFloat($(".payAmount").html());
	// 需要支付的金额
	var _payAmount = parseFloat($(".payAmount").html());

	/**********************************************时间格式化***************************************************/
	function getTime(date) {
		var now = "";
		now = date.getFullYear() + "-"; //读英文就行了
		var month = (date.getMonth() + 1).toString();
		if (month.length == 1) {
			month = "0" + month;
		}
		now = now + month + "-";//取月的时候取的是当前月-1如果想取当前月+1就可以了
		var d = date.getDate().toString();
		if (d.length == 1) {
			d = "0" + d;
		}
		now = now + d + " ";
		var hour = date.getHours().toString();
		if (hour.length == 1) {
			hour = "0" + hour;
		}
		now = now + hour + ":";
		var minute = date.getMinutes().toString();
		if (minute.length == 1) {
			minute = "0" + minute;
		}
		now = now + minute + ":";
		var sec = date.getSeconds().toString();
		if (sec.length == 1) {
			sec = "0" + sec;
		}
		now = now + sec + "";
		return now;
	}

	/**********************************************用户选择使用卡券***************************************************/
	function nouse(){
		//代金券部分
		$("#optionValue").hide();
		$("#useCondition").hide();
		$("#daijinquan").val("0");//初始化代金券金额
		$("#couponValue").val("");//初始化卡券
		//清除选项
		$(".Vouchers").each(function(){
			$(this).removeClass("VouchersClick");
			$(this).removeClass("disabled");
		})
		//$("#youhui").html("0.00");//初始化卡券金额
		$("#money label").html("0.00");
		$("#payMoney").html(_payAmount.toFixed(2));
	}

	if(_payAmount == 0){
		$(".yhxx").hide();
		$(".kqhide").hide();
	}

	nouse();

	var $youhui=$("#money label");//优惠金额
	//var $xianjinquan=$("#xianjinquan");//现金券
	var $daijinquan=$("#daijinquan");//代金券
	/*选择*/
	$(".fly_saleSel i").click(function () {
		$(".fly_saleSel .fly_pay_cli").removeClass();
		$(this).addClass("fly_pay_cli");
		var className = $(".fly_use i").attr("class");
		if (className == 'fly_pay_cli') {
			$(".fly_sales").show();
		} else {
			nouse();
			$(".fly_sales").hide();
		}
	});

	$('#nouse').click(function () {
		nouse();
	});

	/**********************************************页面加载查询卡券列表***************************************************/
	var orderPrice=_shouldMoney.toFixed(2);//订单金额
	var contextPath=$("#contextPath").val();
	$.ajax({
		type : "post",
		async : false,
		url : contextPath+"/coupon/selectCoupon?usedKind=3&orderPrice="+ orderPrice,
		success : function(data) {
			var coupons=eval('(' + data+ ')');
			var voucher="";
			var cashcoupon="";
			var count=0;
			$.each(coupons,function(msg,item){
				count+=1;
				if(item.baseInfo.couponActivity.baseInfo.couponType==1){
					voucher+=" <li class='checekdfaceValue l' name='"+item.id+"' style='cursor:pointer;' data-price='"+item.baseInfo.couponActivity.baseInfo.faceValue+"'>"+item.baseInfo.couponActivity.baseInfo.faceValue+"元优惠券</li>";
				}else{
					var date = new Date(item.baseInfo.couponActivity.useConditionInfo.endDate);
					cashcoupon+="<li><i class='checkboxq usecoupons orderbox Vouchers' re='false' value='"+item.id+"' "
						+"isShareNotSameType='"+item.baseInfo.couponActivity.useConditionInfo.isShareNotSameType+"'"
						+"isShareSameKind='"+item.baseInfo.couponActivity.useConditionInfo.isShareSameKind+"' money='"+item.baseInfo.couponActivity.baseInfo.faceValue+"'"
						+"data-price='"+item.baseInfo.couponActivity.baseInfo.faceValue+"'/>"+"<span class='money'> 使用"+item.baseInfo.couponActivity.baseInfo.faceValue+"元</span>"
						+"<span class='grey fly_payTs yahei h4 color9'>订单满 "+item.baseInfo.couponActivity.useConditionInfo.minOrderPrice+"元可使用,有效期至"+getTime(date)+"</span>";
					if(item.baseInfo.couponActivity.useConditionInfo.isShareNotSameType!=true){
						cashcoupon+="<span class='tips'>不能与代金券同时使用</span>";
					}else if(item.baseInfo.couponActivity.useConditionInfo.isShareSameKind!=true){
						cashcoupon+="<span class='tips'>不能与现金券同时使用</span>"	;
					}
					cashcoupon+="</li>";
				}
			})
			$("#position").html(count);//卡券数量
			$("#cashcoupon").append(cashcoupon);

			if(voucher!=""){
				$(".selectNav").append(voucher);
			}else{
				$("#options").remove();
			}
		}
	})
	/**********************************************点击代金券,查询使用条件和期限***************************************************/
	$(document).on("click",".selectNav li",function(){//下拉列表选值
		/************前端代码start***************/
		var optionsValue=$(this).html();
		var forDom=$(this).parent().attr("for");
		$("#"+forDom).html(optionsValue);
		$(this).parents(".selectNav").css({"display":"none"});
		/************前端代码end***************/
		var couponId=$(this).attr("name");
		var selectd = $(".selectd").html();
		//禁止掉现金券不能和代金券同时使用的
		$("[issharenotsametype='false']").each(function(){
			//$(this).addClass("disabled");
			$(this).removeClass("VouchersClick");
		})
		//保存卡券id
		$("#useCouponIDs").val(couponId);
		//保存金额
		$("#daijinquan").val($(this).attr("data-price"));
		//计算优惠
		finalTotal();
	});
	/**********************************************点击复选框选择卡券***************************************************/
	$(".usecoupons").on("click",function(event) {
		//去掉或者选中标识符 1为选中 2为取消
		var identification=1;
		//判断当前的复选框是否选中
		var checked=$(this).hasClass("VouchersClick");
		var benshen=$(this);

		if(checked==false){
			benshen.addClass("VouchersClick");
			//得到当前的是否可以叠加
			var IsShareNotSameTypes=$(this).attr("isShareNotSameType");
			var IsShareSameKinds=$(this).attr("isShareSameKind");

			//不同类型和同意类型都不能叠加
			if(IsShareNotSameTypes != "true"&&IsShareSameKinds!= "true"){
				//取消其他已选中代金券和现金券
				$(".Vouchers").each(function(){
					$(".Vouchers").removeClass("VouchersClick");
					$(this).addCLass("VouchersClick");
				});
				//取消代金券选择
				if($("#use").hasClass("VouchersClick")){
					$("#use").click();
				}
			}
			//同类型能叠加,不同类型不能叠加
			if(IsShareNotSameTypes!="true"&&IsShareSameKinds=="true"){
				//取消代金券选择
				if($("#use").hasClass("VouchersClick")){
					$("#use").click();
				}
			}
			//不同同类型能叠加,同类型不能叠加
			if(IsShareNotSameTypes=="true"&&IsShareSameKinds!="true"){
				//取消其他已选中代金券和现金券
				$(".Vouchers").each(function(){
					$(".Vouchers").removeClass("VouchersClick");
					$(this).addCLass("VouchersClick");
				});
			}
		}else{
			$(this).removeClass("VouchersClick");
		}
		finalTotal();

	});
	//下拉框通用
	//下拉框通用
	$(document).on("click",".companySelect",function(){
		$('.selectNav').hide();
		$(this).next(".selectNav").show();
	});


	/**********************************************点击代金券单选框***************************************************/
	$("#use").click(function(){
		if($(this).hasClass("VouchersClick")){
			//取消代金券
			$(this).removeClass("VouchersClick");
			//保存卡券id
			$("#useCouponIDs").val("");
			//保存金额
			$("#daijinquan").val(0);
			$("#optionValue").hide();
			$("#useCondition").hide();
		}else{
			//选中代金券
			$(this).addClass("VouchersClick");
			$("#optionValue").show();
			$("#optionValue").html("请选择现金券");
		}

	})

	/**********************************************提交支付信息***************************************************/
	$(".save").click(function() {
		//修改服务条款
		$("#need").click(function(){
			$(this).toggleClass("radio_on");//服务条款
		});
		$("#checkbox").click(function(){     //服务条款
			$(this).toggleClass("yesChoice");
		});
		if($("#checkbox").hasClass("yesChoice")) {
			//判断代金券是否勾选
			var use=$("#use").hasClass("VouchersClick");
			var selectd=$("#optionValue").html();
			var useCouponIDs="";
			if(use==true){
				var useCouponIDs = $("#useCouponIDs").val();//卡券的id
			}
			if(useCouponIDs!=""){
				useCouponIDs+=",";
			}
			var msg=useCouponIDs;
			//得到复选框所以的ID
			$(".usecoupons").each(function(i){
				if($(this).hasClass("VouchersClick")){
					msg+=$(this).attr("value")+",";
				}

			})
			msg= msg.substring(0, msg.length - 1);
			$("#useCouponIDs").val(msg);
			//判断选中的是使用还是不使用
			var notuse=$("#nouse").hasClass("fly_pay_cli");
			if(notuse){
				$("#shouldmoneys").val(_shouldMoney.toFixed(2));
				$("#myform").submit();
			}else{

				//获取卡券进行验证时需要的各个参数
				if(use==true&&selectd=="请选择优惠券"&&msg!=""){
					alert("请选择优惠券");
				}else{
					var dealerOrderId = $("#dealerOrderId").val();//订单号
					var payPrice = _payAmount;//最低限额
					//提交订单之前验证用户选择的卡券是否可用
					$.ajax({
						type : "post",
						async : false,
						url : contextPath+'/couponcontroller/getCouponUsed',
						dataType : "text",
						data : {
							'useCouponIDs' : msg,
							'dealerOrderId' : dealerOrderId,
							'payPrice' : payPrice
						},
						success : function(data) {
							if (data == "success") {
								$("#shouldmoneys").val(_shouldMoney.toFixed(2));
								$('#payMoney').html(_shouldMoney.toFixed(2));
								$("#myform").submit();
							} else {
								alert(data);
								return false;
							}
						},
						error : function(msg) {
							alert(msg);
						}
					});
				}
			}
		}else{
			alert("请选择服务条款");
		}
	});
//切换卡券时 重新计算
	$(".fly_saleSel i,.fly_sales").click(function(){
		setTimeout(function(){
			finalTotal();
		},100);
	});

});

function finalTotal(){
	var xianjinPrice=0;
	var daijinquanPrice=parseInt($("#daijinquan").val());
	$("#cashcoupon .VouchersClick").each(function(){
		xianjinPrice+=parseInt($(this).attr("data-price"));
	});
	var youhui=parseFloat(daijinquanPrice+xianjinPrice).toFixed(2);
	//计算优惠金额
	$("#money label").html(youhui);
	var final=(parseFloat($(".payAmount").html()).toFixed(2)-youhui);
	if(final<0){
		final=0;
	}
	//计算总额
	$(".yue").html(parseFloat(final).toFixed(2));
}