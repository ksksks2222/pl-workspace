/* *
 * ---------------------------------------- *
 * 城市选择组件 v1.0
 * Author: VVG
 * QQ: 83816819
 * Mail: mysheller@163.com
 * http://www.cnblogs.com/NNUF/
 * ---------------------------------------- *
 * Date: 2012-07-10
 * ---------------------------------------- *
 * */

/* *
 * 全局空间 Vcity
 * */
var  Vcity= {};
/* *
 * 静态方法集
 * @name _m
 * */
Vcity._m = {
		/* 选择元素 */
		$:function (arg, context) {
			var tagAll, n, eles = [], i, sub = arg.substring(1);
			context = context || document;
			if (typeof arg == 'string') {
				switch (arg.charAt(0)) {
				case '#':
					return document.getElementById(sub);
					break;
				case '.':
					if (context.getElementsByClassName) return context.getElementsByClassName(sub);
					tagAll = Vcity._m.$('*', context);
					n = tagAll.length;
					for (i = 0; i < n; i++) {
						if (tagAll[i].className.indexOf(sub) > -1) eles.push(tagAll[i]);
					}
					return eles;
					break;
				default:
					return context.getElementsByTagName(arg);
				break;
				}
			}
		},

		/* 绑定事件 */
		on:function (node, type, handler) {
			node.addEventListener ? node.addEventListener(type, handler, false) : node.attachEvent('on' + type, handler);
		},

		/* 获取事件 */
		getEvent:function(event){
			return event || window.event;
		},

		/* 获取事件目标 */
		getTarget:function(event){
			return event.target || event.srcElement;
		},

		/* 获取元素位置 */
		getPos:function (node) {
			var scrollx = document.documentElement.scrollLeft || document.body.scrollLeft,
			scrollt = document.documentElement.scrollTop || document.body.scrollTop;
			var pos = node.getBoundingClientRect();
			return {top:pos.top + scrollt, right:pos.right + scrollx, bottom:pos.bottom + scrollt, left:pos.left + scrollx }
		},

		/* 添加样式名 */
		addClass:function (c, node) {
			if(!node)return;
			node.className = Vcity._m.hasClass(c,node) ? node.className : node.className + ' ' + c ;
		},

		/* 移除样式名 */
		removeClass:function (c, node) {
			var reg = new RegExp("(^|\\s+)" + c + "(\\s+|$)", "g");
			if(!Vcity._m.hasClass(c,node))return;
			node.className = reg.test(node.className) ? node.className.replace(reg, '') : node.className;
		},

		/* 是否含有CLASS */
		hasClass:function (c, node) {
			if(!node || !node.className)return false;
			return node.className.indexOf(c)>-1;
		},

		/* 阻止冒泡 */
		stopPropagation:function (event) {
			event = event || window.event;
			event.stopPropagation ? event.stopPropagation() : event.cancelBubble = true;
		},
		/* 去除两端空格 */
		trim:function (str) {
			return str.replace(/^\s+|\s+$/g,'');
		}
};

/* 所有城市数据,可以按照格式自行添加（北京|beijing|bj），前16条为热门城市 */

Vcity.allCity =['北京|beijing|bj','上海|shanghai|sh', '广州|guangzhou|gz','天津|tianjin|tj','哈尔滨|haerbin|heb','大连|dalian|dl','青岛|qingdao|qd',
                '西安|xian|xa','南京|nanjing|nj', '无锡|wuxi|wx','苏州|shuzhou|sz','厦门|xiamen|xm','成都|chengdu|cd','香港|xianggang|xg','郑州|zhengzhou|zz',
                '杭州|hangzhou|hz','乌鲁木齐|wulumuqi|wlmq','拉萨|lasa|ls','呼和浩特|huhehaote|hhht','丽江|lijiang|lj','太原|taiyuan|ty','包头|baotou|bt','东莞|dongguan|dg',
                '海拉尔|hailaer|hle','济南|jinan|jn','长春|changchun|cc', '石家庄|shijiazhuang|sjz','沈阳|shenyang|sy','威海|weihai|wh','延吉|yanji|yj','榆林|yulin|yl','烟台|yantai|yt',
               '南通|nantong|nt','常州|changzhou|cz','合肥|hefei|hf','宁波|ningbo|nb',
                '温州|wenzhou|wz','徐州|xuzhou|xz','义乌|yiwu|yw','台州|taizhou|tz','深圳|shenzhen|sz','珠海|zhuhai|zh',
               '海口|haikou|hk','三亚|sanya|sy','运城|yuncheng|yc','长沙|changsha|cs','佛山|foshan|fs','福州|fuzhou|fz','江门|jiangmen|jm','南昌|nanchang|nc'
                ,'南宁|nanning|nn','泉州|quanzhou|qz','汕头|shantou|st','武汉|wuhan|wh','中山|zhongshan|zs','重庆|chongqing|cq','昆明|kunming|km',
                '贵阳|guiyang|gy','银川|yinchuan|yc','兰州|lanzhou|lz','喀什|kashi|ks','西宁|xining|xn','绵阳|mianyang|my','西昌|xichang|xc','扬州|yangzhou|yz',
                '镇江|zhenjiang|zj','舟山|zhoushan|zs','绍兴|shaoxing|sx','黄山|huangshan|hs','九江|jiujiang|jj','张家界|zhangjiajie|zjj','桂林|guilin|gl','西双版纳|xishuangbanna|xsbn',
                '湖州|huzhou|hz','九寨沟|jiuzhaigou|jzg','延安|yanan|ya','咸阳|xianyang|xy','宝鸡|baoji|bj','汉中|hanzhong|hz','大同|datong|dt','长治|changzhi|cz','临汾|linfen|lf','秦皇岛|qinhuangdao|qhd',
                '齐齐哈尔|qiqihaer|qqhe','牡丹江|mudanjiang|mdj','吉林|jilin|jy','克拉玛依|kelamayi|klmy','安庆|anqing|aq','鞍山|anshan|as','安阳|anyang|ay','蚌埠|bengbu|bb','保定|baoding|bd','玉溪|yuxi|yx',
                '北海|beihai|bh','常德|changde|cd','赤峰|chifeng|cf','朝阳|chaoyang|cy','滁州|chuzhou|cz','潮州|chaozhou|cz','沧州|cangzhou|cz','池州|chizhou|cz','丹东|dandong|dd','大庆|daqing|dq',
                '东营|dongying|dy','德阳|deyang|dy','恩施|enshi|es','抚顺|fushun|fs','阜新|fuxin|fx','阜阳|fuyang|fy','广元|guangyuan|gy','赣州|ganzhou|gz','邯郸|handan|hd','怀化|huaihua|hh','淮南|huainan|hn',
                '衡水|hengshui|hs','黄石|huangshi|hs','衡阳|hengyang|hy','惠州|huizhou|hz','景德镇|jingdezhen|jdz','金华|jinhua|jh','佳木斯|jiamusi|jms','济宁|jining|jn','嘉峪关|jiayuguan|jyg','锦州|jinzhou|jz',
                '荆州|jingzhou|jz','开封|kaifeng|kf','廊坊|langfang|lf','乐山|leshan|ls','丽水|lishui|ls','龙岩|longyan|ly','洛阳|luoyang|ly','辽阳|liaoyang|ly','辽源|liaoyuan|ly','连云港|lianyungang|lyg',
                '柳州|liuzhou|lz','泸州|luzhou|lz','南充|nanchong|nc','宁德|ningde|nd','南阳|nanyang|ny','盘锦|panjin|pj','衢州|quzhou|qz','上饶|shangrao|sr','韶关|shaoguan|sg','石河子|shihezi|shz',
                '三明|sanming|sm','四平|siping|sp','商丘|shangqiu|sq','十堰|shiyan|sy','泰安|taian|ta','通化|tonghua|th','通辽|tongliao|tl','铜陵|tongling|tl','唐山|tangshan|ts','潍坊|weifang|wf','芜湖|wuhu|wh',
                '万州|wanzhou|wz','梧州|wuzhou|wz','襄阳|xiangyang|xy','新乡|xinxiang|xx','信阳|xinyang|xy','忻州|xinzhou|xz','宜宾|yibin|yb','宜昌|yichang|yc','宜春|yichun|yc','宿州|suzhou|sz','鹰潭|yingtan|yt',
                '岳阳|yueyang|yy','淄博|zibo|zb','自贡|zigong|zg','湛江|zhanjiang|zj','张家口|zhangjiakou|zjk','驻马店|zhumadian|zmd','肇庆|zhaoqing|zq','遵义|zunyi|zy','漳州|zhangzhou|zz','承德|chengde|cd',
                '嘉兴|jiaxing|jx','巢湖|chaohu|ch','湘潭|xiangtan|xt','株洲|zhuzhou|zz','新余|xinyu|xy','六盘水|liupanshui|lps','南平|nanping|np','郴州|chenzhou|cz','枣庄|zaozhuang|zz','酒泉|jiuquan|jq',
                '张掖|zhangye|zy','莆田|putian|pt','河源|heyuan|hy','阳泉|yangquan|yq','娄底|loudi|ld','吉安|jian|ja','咸宁|xianning|xn','邢台|xingtai|xt','鹤壁|hebi|hb','揭阳|jieyang|jy','永州|yongzhou|yz'
                ,'曲靖|qujing|qj','鄂州|ezhou|ez','宣城|xuancheng|xc','马鞍山|maanshan|mas','渭南|weinan|wn','铁岭|tieling|tl','葫芦岛|huludao|hld','聊城|liaocheng|lc','菏泽|heze|hz','亳州|bozhou|bz',
                '漯河|luohe|lh','晋城|jincheng|jc','焦作|jiaozuo|jz','许昌|xuchang|xc','攀枝花|panzhihua|pzh','广安|guangan|ga','日照|rizhao|rz','邵阳|shaoyang|sy','玉林|yulin|yl','荆门|jingmen|jm',
                '益阳|yiyang|yy','绥化|suihua|sh','石嘴山|shizuishan|szs','眉山|meishan|ms','本溪|benxi|bx','盐城|yancheng|yc','濮阳|puyang|py','达州|dazhou|dz','营口|yingkou|yk','松原|songyuan|sy',
                '朔州|shuozhou|sz','德州|dezhou|dz','遂宁|suining|sn','清远|qingyuan|qy','汕尾|shanwei|sw','莱芜|laiwu|lw','晋中|jinzhong|jz','济源|jiyuan|jy','宿迁|suqian|sq','孝感|xiaogan|xg',
                '贵港|guigang|gg','资阳|ziyang|zz','内江|neijiang|nj','防城港|fangchenggang|fcg','六安|luan|la','滨州|binzhou|bz','萍乡|pingxiang|px','仙桃|xiantao|xt','钦州|qinzhou|qz',
                '梅州|meizhou|mz','周口|zhoukou|zk','平顶山|pingdingshan|pd','抚州|fuzhou|fz','黄冈|huanggang|hg','鄂尔多斯|eerduosi|eeds','呼伦贝尔|hulunbeier|hlbe','吕梁|lvliang|ll',
                '大理|dali|dl'];/*******************************************************************/


Vcity.allCity2 =['北京|beijing|b','天津|tianjin|t','哈尔滨|haerbin|h','大连|dalian|d','青岛|qingdao|q','呼和浩特|huhehaote|h','太原|taiyuan|t','包头|baotou|b','海拉尔|hailaer|h','济南|jinan|j','长春|changchun|c','石家庄|shijiazhuang|s','沈阳|shenyang|s','威海|weihai|w','延吉|yanji|y','榆林|yulin|y','烟台|yantai|y','上海|shanghai|s','南京|nanjing|n','无锡|wuxi|w','苏州|suzhou|s','南通|nantong|n','常州|changzhou|c','合肥|hefei|h','宁波|ningbo|n','温州|wenzhou|w','徐州|xuzhou|x','义乌|yiwu|y','台州|taizhou|t','厦门|xiamen|x','深圳|shenzhen|s','珠海|zhuhai|z','广州|guangzhou|g','海口|haikou|h','三亚|sanya|s','运城|yuncheng|y','长沙|changsha|c','东莞|dongguan|d','佛山|foshan|f','福州|fuzhou|f','江门|jiangmen|j','南昌|nanchang|n','南宁|nanning|n','泉州|quanzhou|q','汕头|shantou|s','武汉|wuhan|w','中山|zhongshan|z','郑州|zhengzhou|z','重庆|chongqing|c','西安|xian|x','成都|chengdu|c','昆明|kunming|k','贵阳|guiyang|g','乌鲁木齐|wulumuqi|w','拉萨|lasa|l','银川|yinchuan|y','兰州|lanzhou|l','喀什|kashen|k','西宁|xining|x','绵阳|mianyang|m','西昌|xichang|x','扬州|yangzhou|y','镇江|zhenjiang|z','舟山|zhoushan|z','绍兴|shaoxing|s','黄山|huangshan|h','九江|jiujiang|j','张家界|zhangjiajie|z','桂林|guilin|g','西双版纳|xishuangbanna|x','丽江|lijiang|l','湖州|huzhou|h','九寨沟|jiuzhaigou|j','延安|yanan|y','咸阳|xianyang|x','宝鸡|baoji|b','汉中|hanzhong|h','大同|datong|d','长治|changzhi|c','临汾|linfen|l','秦皇岛|qinhuangdao|q','齐齐哈尔|qiqihaer|q','牡丹江|mudanjiang|m','吉林|jilin|j','克拉玛依|kelamayi|k','安庆|anqing|a','鞍山|anshan|a','安阳|anyang|a','蚌埠|bengbu|b','保定|baoding|b','玉溪|yuxi|y','北海|beihai|b','常德|changde|c','赤峰|chifeng|c','朝阳|zhaoyang|z','滁州|chuzhou|c','潮州|chaozhou|c','沧州|cangzhou|c','池州|chizhou|c','丹东|dandong|d','大庆|daqing|d','东营|dongying|d','德阳|deyang|d','恩施|enshi|e','抚顺|fushun|f','阜新|fuxin|f','阜阳|fuyang|f','广元|guangyuan|g','赣州|ganzhou|g','邯郸|handan|h','怀化|huaihua|h','淮南|huainan|h','衡水|hengshui|h','黄石|huangshi|h','衡阳|hengyang|h','惠州|huizhou|h','景德镇|jingdezhen|j','金华|jinhua|j','佳木斯|jiamusi|j','济宁|jining|j','嘉峪关|jiayuguan|j','锦州|jinzhou|j','荆州|jingzhou|j','开封|kaifeng|k','廊坊|langfang|l','乐山|leshan|l','丽水|lishui|l','龙岩|longyan|l','洛阳|luoyang|l','辽阳|liaoyang|l','辽源|liaoyuan|l','连云港|lianyungang|l','柳州|liuzhou|l','泸州|luzhou|l','南充|nanchong|n','宁德|ningde|n','南阳|nanyang|n','盘锦|panjin|p','衢州|quzhou|q','上饶|shangrao|s','韶关|shaoguan|s','石河子|shihezi|s','三明|sanming|s','四平|siping|s','商丘|shangqiu|s','十堰|shiyan|s','泰安|taian|t','通化|tonghua|t','通辽|tongliao|t','铜陵|tongling|t','唐山|tangshan|t','潍坊|weifang|w','芜湖|wuhu|w','万州|wanzhou|w','梧州|wuzhou|w','襄阳|xiangyang|x','新乡|xinxiang|x','信阳|xinyang|x','忻州|xinzhou|x','宜宾|yibin|y','宜昌|yichang|y','宜春|yichun|y','宿州|suzhou|s','鹰潭|yingtan|y','岳阳|yueyang|y','淄博|zibo|z','自贡|zigong|z','湛江|zhanjiang|z','张家口|zhangjiakou|z','驻马店|zhumadian|z','肇庆|zhaoqing|z','遵义|zunyi|z','漳州|zhangzhou|z','承德|chengde|c','嘉兴|jiaxing|j','巢湖|chaohu|c','湘潭|xiangtan|x','株洲|zhuzhou|z','新余|xinyu|x','六盘水|liupanshui|l','南平|nanping|n','郴州|chenzhou|c','枣庄|zaozhuang|z','酒泉|jiuquan|j','张掖|zhangye|z','莆田|putian|p','河源|heyuan|h','阳泉|yangquan|y','娄底|loudi|l','吉安|jian|j','咸宁|xianning|x','邢台|xingtai|x','鹤壁|hebi|h','揭阳|jieyang|j','永州|yongzhou|y','曲靖|qujing|q','鄂州|ezhou|e','宣城|xuancheng|x','马鞍山|maanshan|m','渭南|weinan|w','铁岭|tieling|t','葫芦岛|huludao|h','聊城|liaocheng|l','菏泽|heze|h','亳州|bozhou|b','漯河|luohe|l','晋城|jincheng|j','焦作|jiaozuo|j','许昌|xuchang|x','攀枝花|panzhihua|p','广安|guangan|g','日照|rizhao|r','邵阳|shaoyang|s','玉林|yulin|y','荆门|jingmen|j','益阳|yiyang|y','绥化|suihua|s','石嘴山|shizuishan|s','眉山|meishan|m','本溪|benxi|b','盐城|yancheng|y','濮阳|puyang|p','达州|dazhou|d','营口|yingkou|y','松原|songyuan|s','朔州|shuozhou|s','德州|dezhou|d','遂宁|suining|s','清远|qingyuan|q','汕尾|shanwei|s','莱芜|laiwu|l','晋中|jinzhong|j','济源|jiyuan|j','宿迁|suqian|s','孝感|xiaogan|x','贵港|guigang|g','资阳|ziyang|z','内江|neijiang|n','防城港|fangchenggang|f','六安|luan|l','滨州|binzhou|b','萍乡|pingxiang|p','仙桃|xiantao|x','钦州|qinzhou|q','梅州|meizhou|m','周口|zhoukou|z','平顶山|pingdingshan|p','抚州|fuzhou|f','黄冈|huanggang|h','鄂尔多斯|eerduosi|e','呼伦贝尔|hulunbeier|h','吕梁|lvliang|l','大理|dali|d','香港|xianggang|x'];/* 正则表达式 筛选中文城市名、拼音、首字母 */
/*******************************************************************/
for(var i=0;i<Vcity.allCity2.length;i++){
	for(var q=0;q<Vcity.allCity.length;q++){
		if(Vcity.allCity2[i].split("|")[0]==Vcity.allCity[q].split("|")[0]){
			Vcity.allCity2[i]=Vcity.allCity[q];
		}
	}
}




/*******************************************************************/


Vcity.regEx = /^([\u4E00-\u9FA5\uf900-\ufa2d]+)\|(\w+)\|(\w)\w*$/i;
Vcity.regExChiese = /([\u4E00-\u9FA5\uf900-\ufa2d]+)/;

/* *
 * 格式化城市数组为对象oCity，按照a-h,i-p,q-z,hot热门城市分组：
 * {HOT:{hot:[]},ABCDEFGH:{a:[1,2,3],b:[1,2,3]},IJKLMNOP:{i:[1.2.3],j:[1,2,3]},QRSTUVWXYZ:{}}
 * */

(function () {
	/*var citys = Vcity.allCity, match, letter,
            regEx = Vcity.regEx,
            reg2 = /^[a-h]$/i, reg3 = /^[i-p]$/i, reg4 = /^[q-z]$/i;
    if (!Vcity.oCity) {
        Vcity.oCity = {hot:{},ABCD:{},EFGH:{}, IJKLP:{},MNOP:{}, QRSTU:{},VWXYZ:{}};
        //console.log(citys.length);
        for (var i = 0, n = citys.length; i < n; i++) {
            match = regEx.exec(citys[i]);
            letter = match[3].toUpperCase();
            if (reg2.test(letter)) {
                if (!Vcity.oCity.ABCDEFGH[letter]) Vcity.oCity.ABCDEFGH[letter] = [];
                Vcity.oCity.ABCDEFGH[letter].push(match[1]);
            } else if (reg3.test(letter)) {
                if (!Vcity.oCity.IJKLMNOP[letter]) Vcity.oCity.IJKLMNOP[letter] = [];
                Vcity.oCity.IJKLMNOP[letter].push(match[1]);
            } else if (reg4.test(letter)) {
                if (!Vcity.oCity.QRSTUVWXYZ[letter]) Vcity.oCity.QRSTUVWXYZ[letter] = [];
                Vcity.oCity.QRSTUVWXYZ[letter].push(match[1]);
            }
	 *//* 热门城市 前16条 *//*
            if(i<16){
                if(!Vcity.oCity.hot['hot']) Vcity.oCity.hot['hot'] = [];
                Vcity.oCity.hot['hot'].push(match[1]);
            }
        }
    }*/

	var citys = Vcity.allCity, match, letter,
	regEx = Vcity.regEx,
	reg2 = /^[a-d]$/i, reg3 = /^[e-h]$/i, reg4 = /^[i-l]$/i, reg5 = /^[m-p]$/i, reg6 = /^[q-u]$/i, reg7 = /^[v-z]$/i;
	if (!Vcity.oCity) {
		Vcity.oCity = {hot:{},ABCD:{},EFGH:{}, IJKL:{},MNOP:{}, QRSTU:{},VWXYZ:{}};
		//console.log(citys.length);
		for (var i = 0, n = citys.length; i < n; i++) {
			match = regEx.exec(citys[i]);
			letter = match[3].toUpperCase();
			if (reg2.test(letter)) {
				if (!Vcity.oCity.ABCD[letter]) Vcity.oCity.ABCD[letter] = [];
				Vcity.oCity.ABCD[letter].push(match[1]);
			} else if (reg3.test(letter)) {
				if (!Vcity.oCity.EFGH[letter]) Vcity.oCity.EFGH[letter] = [];
				Vcity.oCity.EFGH[letter].push(match[1]);
			} else if (reg4.test(letter)) {
				if (!Vcity.oCity.IJKL[letter]) Vcity.oCity.IJKL[letter] = [];
				Vcity.oCity.IJKL[letter].push(match[1]);
			}
			else if (reg5.test(letter)) {
				if (!Vcity.oCity.MNOP[letter]) Vcity.oCity.MNOP[letter] = [];
				Vcity.oCity.MNOP[letter].push(match[1]);
			}
			else if (reg6.test(letter)) {
				if (!Vcity.oCity.QRSTU[letter]) Vcity.oCity.QRSTU[letter] = [];
				Vcity.oCity.QRSTU[letter].push(match[1]);
			}
			else if (reg7.test(letter)) {
				if (!Vcity.oCity.VWXYZ[letter]) Vcity.oCity.VWXYZ[letter] = [];
				Vcity.oCity.VWXYZ[letter].push(match[1]);
			}
			/* 热门城市 前16条 */
			if(i<16){
				if(!Vcity.oCity.hot['hot']) Vcity.oCity.hot['hot'] = [];
				Vcity.oCity.hot['hot'].push(match[1]);
			}
		}
	}
})();
/* 城市HTML模板 */
Vcity._template = [
                   '<p class="tip">热门城市(支持汉字/拼音)</p>',
                   '<ul>',
                   '<li class="on">热门城市</li>',
                   '<li>ABCD</li>',
                   '<li>EFGH</li>',
                   '<li>IJKL</li>',

                   '<li>MNOP</li>',
                   '<li>QRSTU</li>',
                   '<li>VWXYZ</li>',
                   '</ul>'
                   ];

/* *
 * 城市控件构造函数
 * @CitySelector
 * */

Vcity.CitySelector = function () {
	this.initialize.apply(this, arguments);
};

Vcity.CitySelector.prototype = {

		constructor:Vcity.CitySelector,

		/* 初始化 */

		initialize :function (options) {
			var input = options.input;
			this.input = Vcity._m.$('#'+ input);
			this.inputEvent();
		},

		/* *
		 * @createWarp
		 * 创建城市BOX HTML 框架
		 * */

		createWarp:function(){
			var inputPos = Vcity._m.getPos(this.input);
			var div = this.rootDiv = document.createElement('div');
			var that = this;

			// 设置DIV阻止冒泡
			Vcity._m.on(this.rootDiv,'click',function(event){
				Vcity._m.stopPropagation(event);
			});

			// 设置点击文档隐藏弹出的城市选择框
			Vcity._m.on(document, 'click', function (event) {
				event = Vcity._m.getEvent(event);
				var target = Vcity._m.getTarget(event);
				if(target == that.input) return false;
				//console.log(target.className);

				if (that.cityBox)Vcity._m.addClass('hide', that.cityBox);
				if (that.ul)Vcity._m.addClass('hide', that.ul);
				if(that.myIframe)Vcity._m.addClass('hide',that.myIframe);
			});
			div.className = 'citySelector';
			div.style.position = 'absolute';
			div.style.left = inputPos.left + 'px';
			div.style.top = inputPos.bottom + 'px';
			div.style.zIndex = 999999;

			// 判断是否IE6，如果是IE6需要添加iframe才能遮住SELECT框
			var isIe = (document.all) ? true : false;
			var isIE6 = this.isIE6 = isIe && !window.XMLHttpRequest;
			if(isIE6){
				var myIframe = this.myIframe =  document.createElement('iframe');
				myIframe.frameborder = '0';
				myIframe.src = 'about:blank';
				myIframe.style.position = 'absolute';
				myIframe.style.zIndex = '-1';
				this.rootDiv.appendChild(this.myIframe);
			}

			var childdiv = this.cityBox = document.createElement('div');
			childdiv.className = 'cityBox';
			childdiv.id = 'cityBox';
			childdiv.innerHTML = Vcity._template.join('');
			var hotCity = this.hotCity =  document.createElement('div');
			hotCity.className = 'hotCity';
			childdiv.appendChild(hotCity);
			div.appendChild(childdiv);
			this.createHotCity();
		},

		/* *
		 * @createHotCity
		 * TAB下面DIV：hot,a-h,i-p,q-z 分类HTML生成，DOM操作
		 * {HOT:{hot:[]},ABCDEFGH:{a:[1,2,3],b:[1,2,3]},IJKLMNOP:{},QRSTUVWXYZ:{}}
		 **/

		createHotCity:function(){
			var odiv,odl,odt,odd,odda=[],str,key,ckey,sortKey,regEx = Vcity.regEx,
			oCity = Vcity.oCity;
			for(key in oCity){
				odiv = this[key] = document.createElement('div');
				// 先设置全部隐藏hide
				odiv.className = key + ' ' + 'cityTab hide';
				sortKey=[];
				for(ckey in oCity[key]){
					sortKey.push(ckey);
					// ckey按照ABCDEDG顺序排序
					sortKey.sort();
				}
				for(var j=0,k = sortKey.length;j<k;j++){
					odl = document.createElement('dl');
					odt = document.createElement('dt');
					odd = document.createElement('dd');
					odt.innerHTML = sortKey[j] == 'hot'?'&nbsp;':sortKey[j];
					odda = [];
					for(var i=0,n=oCity[key][sortKey[j]].length;i<n;i++){
						str = '<a >' + oCity[key][sortKey[j]][i] + '</a>';
						odda.push(str);
					}
					odd.innerHTML = odda.join('');
					odl.appendChild(odt);
					odl.appendChild(odd);
					odiv.appendChild(odl);
				}

				// 移除热门城市的隐藏CSS
				Vcity._m.removeClass('hide',this.hot);
				this.hotCity.appendChild(odiv);
			}
			document.body.appendChild(this.rootDiv);
			/* IE6 */
			this.changeIframe();

			this.tabChange();
			this.linkEvent();
		},

		/* *
		 *  tab按字母顺序切换
		 *  @ tabChange
		 * */

		tabChange:function(){
			var lis = Vcity._m.$('li',this.cityBox);
			var divs = Vcity._m.$('div',this.hotCity);
			var that = this;
			for(var i=0,n=lis.length;i<n;i++){
				lis[i].index = i;
				lis[i].onclick = function(){
					for(var j=0;j<n;j++){
						Vcity._m.removeClass('on',lis[j]);

						Vcity._m.addClass('hide',divs[j]);
					}
					Vcity._m.addClass('on',this);
					Vcity._m.removeClass('hide',divs[this.index]);
					/* IE6 改变TAB的时候 改变Iframe 大小*/
					that.changeIframe();
				};
			}
		},

		/* *
		 * 城市LINK事件
		 *  @linkEvent
		 * */

		linkEvent:function(){
			var links = Vcity._m.$('a',this.hotCity);
			var that = this;
			for(var i=0,n=links.length;i<n;i++){
				links[i].onclick = function(){
					that.input.value = this.innerHTML;

					Vcity._m.addClass('hide',that.cityBox);
					//list页面更改目的地
					if(typeof changeDirect=="function"){
						changeDirect(that.input.value);
					}
					/* 点击城市名的时候隐藏myIframe */
					Vcity._m.addClass('hide',that.myIframe);
				}
			}
		},

		/* *
		 * INPUT城市输入框事件
		 * @inputEvent
		 * */

		inputEvent:function(){
			var that = this;
			Vcity._m.on(this.input,'click',function(event){
				event = event || window.event;
				if(!that.cityBox){
					that.createWarp();
				}else if(!!that.cityBox && Vcity._m.hasClass('hide',that.cityBox)){
					// slideul 不存在或者 slideul存在但是是隐藏的时候 两者不能共存
					if(!that.ul || (that.ul && Vcity._m.hasClass('hide',that.ul))){
						Vcity._m.removeClass('hide',that.cityBox);

						/* IE6 移除iframe 的hide 样式 */
						//alert('click');
						Vcity._m.removeClass('hide',that.myIframe);
						that.changeIframe();
					}
				}
			});
			Vcity._m.on(this.input,'focus',function(){
				that.input.select();
				if(that.input.value == '城市名') that.input.value = '';
			});
			Vcity._m.on(this.input,'blur',function(){
				if(that.input.value == '') that.input.value = '城市名';
			});
			Vcity._m.on(this.input,'keyup',function(event){
				event = event || window.event;
				var keycode = event.keyCode;

				Vcity._m.addClass('hide',that.cityBox);
				that.createUl();

				/* 移除iframe 的hide 样式 */
				Vcity._m.removeClass('hide',that.myIframe);

				// 下拉菜单显示的时候捕捉按键事件
				if(that.ul && !Vcity._m.hasClass('hide',that.ul) && !that.isEmpty){
					that.KeyboardEvent(event,keycode);
				}
			});
		},

		/* *
		 * 生成下拉选择列表
		 * @ createUl
		 * */

		createUl:function () {
			//console.log('createUL');
			var str;
			var value = Vcity._m.trim(this.input.value);
			// 当value不等于空的时候执行
			if (value !== '') {
				var reg = new RegExp("^" + value + "|\\|" + value, 'gi');
				// 此处需设置中文输入法也可用onpropertychange
				var searchResult = [];
				for (var i = 0, n = Vcity.allCity.length; i < n; i++) {
					if (reg.test(Vcity.allCity[i])) {
						var match = Vcity.regEx.exec(Vcity.allCity[i]);
						if (searchResult.length !== 0) {
							str = '<li><b class="cityname">' + match[1] + '</b><b class="cityspell">' + match[2] + '</b></li>';
						} else {
							str = '<li class="on"><b class="cityname">' + match[1] + '</b><b class="cityspell">' + match[2] + '</b></li>';
						}
						searchResult.push(str);
					}
				}
				/*for (var i = 0, n = Vcity.allCity2.length; i < n; i++) {
                if (reg.test(Vcity.allCity2[i])) {
                    var match = Vcity.regEx.exec(Vcity.allCity2[i]);
                    if (searchResult.length !== 0) {
                        str = '<li><b class="cityname">' + match[1] + '</b><b class="cityspell">' + match[2] + '</b></li>';
                    } else {
                        str = '<li class="on"><b class="cityname">' + match[1] + '</b><b class="cityspell">' + match[2] + '</b></li>';
                    }
                    searchResult.push(str);
                }
            }*/
				this.isEmpty = false;
				// 如果搜索数据为空
				if (searchResult.length == 0) {
					this.isEmpty = true;
					str = '<li class="empty">对不起，没有找到数据 "<em>' + value + '</em>"</li>';
					searchResult.push(str);
				}
				// 如果slideul不存在则添加ul
				if (!this.ul) {
					var ul = this.ul = document.createElement('ul');
					ul.className = 'cityslide';
					this.rootDiv && this.rootDiv.appendChild(ul);
					// 记录按键次数，方向键
					this.count = 0;
				} else if (this.ul && Vcity._m.hasClass('hide', this.ul)) {
					this.count = 0;
					Vcity._m.removeClass('hide', this.ul);
				}
				this.ul.innerHTML = searchResult.join('');

				/* IE6 */
				this.changeIframe();

				// 绑定Li事件
				this.liEvent();
			}else{

				Vcity._m.addClass('hide',this.ul);
				Vcity._m.removeClass('hide',this.cityBox);

				Vcity._m.removeClass('hide',this.myIframe);

				this.changeIframe();
			}
		},

		/* IE6的改变遮罩SELECT 的 IFRAME尺寸大小 */
		changeIframe:function(){
			if(!this.isIE6)return;
			this.myIframe.style.width = this.rootDiv.offsetWidth + 'px';
			this.myIframe.style.height = this.rootDiv.offsetHeight + 'px';
		},

		/* *
		 * 特定键盘事件，上、下、Enter键
		 * @ KeyboardEvent
		 * */

		KeyboardEvent:function(event,keycode){
			var lis = Vcity._m.$('li',this.ul);
			var len = lis.length;
			switch(keycode){
			case 40: //向下箭头↓
				this.count++;
				if(this.count > len-1) this.count = 0;
				for(var i=0;i<len;i++){
					Vcity._m.removeClass('on',lis[i]);
				}
				Vcity._m.addClass('on',lis[this.count]);
				break;
			case 38: //向上箭头↑
				this.count--;
				if(this.count<0) this.count = len-1;
				for(i=0;i<len;i++){
					Vcity._m.removeClass('on',lis[i]);
				}
				Vcity._m.addClass('on',lis[this.count]);
				break;
			case 13: // enter键
				this.input.value = Vcity.regExChiese.exec(lis[this.count].innerHTML)[0];

				Vcity._m.addClass('hide',this.ul);
				Vcity._m.addClass('hide',this.ul);
				/* IE6 */
				Vcity._m.addClass('hide',this.myIframe);
				break;
			default:
				break;
			}
		},

		/* *
		 * 下拉列表的li事件
		 * @ liEvent
		 * */

		liEvent:function(){
			var that = this;
			var lis = Vcity._m.$('li',this.ul);
			for(var i = 0,n = lis.length;i < n;i++){
				Vcity._m.on(lis[i],'click',function(event){
					event = Vcity._m.getEvent(event);
					var target = Vcity._m.getTarget(event);
					that.input.value = Vcity.regExChiese.exec(target.innerHTML)[0];
					//alert(4)
					Vcity._m.addClass('hide',that.ul);
					/* IE6 下拉菜单点击事件 */
					Vcity._m.addClass('hide',that.myIframe);
				});
				Vcity._m.on(lis[i],'mouseover',function(event){
					event = Vcity._m.getEvent(event);
					var target = Vcity._m.getTarget(event);
					Vcity._m.addClass('on',target);
				});
				Vcity._m.on(lis[i],'mouseout',function(event){
					event = Vcity._m.getEvent(event);
					var target = Vcity._m.getTarget(event);
					Vcity._m.removeClass('on',target);
				})
			}

		}
};



