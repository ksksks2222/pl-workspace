
(function ($) {
	function ok123(){
		if(document.getElementById("container")){
			var w=window.screen.width;
			if($("#container").find(".vertical").find("li").eq(0).hasClass("active")){
				$("#header1").show();
				$("#header2").hide();
				
				/*if(true){
					if(!!window.ActiveXObject || "ActiveXObject" in window){
						$("body").css({"background-image":"url(img/first-pic.jpg)",
						"background-size":"100% 107.5%"});
						$("#section0").css("background-image","none");
						
						if(navigator.appVersion.indexOf("MSIE 8.0")>-1){
							document.body.style.filter="progid:DXImageTransform.Microsoft.AlphaImageLoader("
							+"src='img/first-pic.jpg',sizingMethod='scale');";
						}
					}else{
						if($(window).width()<1600){
							$("body").css({"background-image":"url(img/first-pic.jpg)",
							"background-size":"100% 107.5%"});
							$("#section0").css("background-image","none");
						}
					}
					
				}*/
			}else{
				$("#header1").hide();
				$("#header2").show();
				
				/*if(!!window.ActiveXObject || "ActiveXObject" in window){
					$("body").css("background-image","none");
					$("#section0").css("background-image","url(img/first-pic.jpg)");
				}else{
					if($(window).width()<1600){
						$("body").css("background-image","none");
						$("#section0").css("background-image","url(img/first-pic.jpg)");
					}
				}*/
				
			}
		}
	}
	
    $.fn.XSwitch = function (options) {
        return this.each(function () {
            var _this = $(this),
                instance = _this.data('XSwitch');

            if (!instance) {
                instance = new XSwitch(_this, options);
                _this.data('XSwitch', instance);
            }

            if ($.type(options) === 'string') {
                return instance[options]();
            }
        });
    }

    $.fn.XSwitch.defaults = {
        selectors: {
            sections: '.sections',
            section: '.section',
            page: '.pages',
            active: '.active'
        },
        index: 0,
        easing: 'ease',
        duration: 1200,
        loop: false,
        pagination: true,
        keyboard: true,
        direction: 'vertical',
        callback: ok123
    }


    var _prefix = (function (temp) {
        var aPrefix = ['webkit', 'moz', 'o', 'ms'],
            props = '';
        for (var i = 0, len = aPrefix.length; i < len; i ++) {
            props = aPrefix[i] + 'Transition';
            if (temp.style[props] !== undefined) {
                return '-' + aPrefix[i].toLowerCase() + '-';
            }
            return false;
        }
    })(document.createElement('div'));

    var XSwitch = (function () {
        function XSwitch(element, options) {

            this.settings = $.extend(true, $.fn.XSwitch.defaults, options);
            this.element = element;
            this.init();
        }
        XSwitch.prototype = {

            init: function () {
                var _this = this;
                this.selectors = this.settings.selectors;

                this.sections = this.element.find(this.selectors.sections);
                this.section = this.sections.find(this.selectors.section);


                this.direction = this.settings.direction === 'vertical' ? true : false;

                this.pagesCount = this.pagesCount();

                this.index = (this.settings.index >=0 && this.settings.index < this.pagesCount) ? this.settings.index : 0;

                this.canScroll = true;


                if (!this.direction) {
                    _initLayout(_this);
                }

                if (this.settings.pagination) {
                    _initPaging(_this);
                }

                _initEvent(_this);
            },

            pagesCount: function () {
                return this.section.size();
            },

            switchLength: function () {
                return this.duration ? this.element.height() : this.element.width();
            },

            prve: function () {
                var _this = this;

                if (this.index > 0) {
                    this.index --;
                } else if (this.settings.loop) {
                    this.index = this.pagesCount - 1;
                }
                _scrollPage(_this);
            },

            next: function () {
                var _this = this;
                if (this.index < this.pagesCount) {
                    this.index ++;
                } else if (this.settings.loop) {
                    this.index = 0;
                }
                _scrollPage(_this);
            }
        };

        function _initLayout(_this) {
            var width = (_this.pagesCount * 100) + '%',
                cellWidth = (100 / _this.pagesCount).toFixed(2) + '%';

            _this.sections.width(width);
            _this.section.width(cellWidth).css('float', 'left');
        }

        function _initPaging(_this) {

            var pagesClass = _this.selectors.page.substring(1),
                pageHtml = '<ul class="' + pagesClass + '">';
            _this.activeClass = _this.selectors.active.substring(1);

            for (var i = 0, len = _this.pagesCount; i < len; i ++) {
                pageHtml += '<li></li>';
            }
            pageHtml += '</ul>';

            _this.element.append(pageHtml);
            var pages = _this.element.find(_this.selectors.page);
            _this.pageItem = pages.find('li');
            _this.pageItem.eq(_this.index).addClass(_this.activeClass);
            if (_this.direction) {
                pages.addClass('vertical');
            } else {
                pages.addClass('horizontal');
            }
        }

        function _initEvent(_this) {
			$(".box-r").find(".go-index").eq(0).on('click',function(){
				$(".vertical").find("li").removeClass("active");
				$(".vertical").find("li").eq(0).addClass("active");
				_this.index = 0;
                _scrollPage(_this);
			});
			$(".box-r").find(".go-index").eq(1).on('click',function(){
				$(".vertical").find("li").removeClass("active");
				$(".vertical").find("li").eq(2).addClass("active");
				_this.index = 2;
                _scrollPage(_this);
			});
			$(".box-r").find(".go-index").eq(2).on('click',function(){
				$(".vertical").find("li").removeClass("active");
				$(".vertical").find("li").eq(3).addClass("active");
				_this.index = 3;
                _scrollPage(_this);
			});
			$(".box-r").find(".go-index").eq(3).on('click',function(){
				$(".vertical").find("li").removeClass("active");
				$(".vertical").find("li").eq(5).addClass("active");
				_this.index = 5;
                _scrollPage(_this);
			});
			
			$(".box-r").eq(1).find(".go-index").eq(0).on('click',function(){
				$(".vertical").find("li").removeClass("active");
				$(".vertical").find("li").eq(0).addClass("active");
				_this.index = 0;
                _scrollPage(_this);
			});
			$(".box-r").eq(1).find(".go-index").eq(1).on('click',function(){
				$(".vertical").find("li").removeClass("active");
				$(".vertical").find("li").eq(2).addClass("active");
				_this.index = 2;
                _scrollPage(_this);
			});
			$(".box-r").eq(1).find(".go-index").eq(2).on('click',function(){
				$(".vertical").find("li").removeClass("active");
				$(".vertical").find("li").eq(3).addClass("active");
				_this.index = 3;
                _scrollPage(_this);
			});
			$(".box-r").eq(1).find(".go-index").eq(3).on('click',function(){
				$(".vertical").find("li").removeClass("active");
				$(".vertical").find("li").eq(5).addClass("active");
				_this.index = 5;
                _scrollPage(_this);
			});

            _this.element.on('click', _this.selectors.page + ' li', function () {
                _this.index = $(this).index();
                _scrollPage(_this);
            });

            _this.element.on('mousewheel DOMMouseScroll', function (e) {

                if (!_this.canScroll) {
                    return;
                }

                var delta = -e.originalEvent.detail || -e.originalEvent.deltaY || e.originalEvent.wheelDelta;

                if (delta > 0 && (_this.index && !_this.settings.loop || _this.settings.loop)) {
                    _this.prve();
                } else if (delta < 0 && (_this.index < (_this.pagesCount - 1) && !_this.settings.loop || _this.settings.loop)) {
                    _this.next();
                }
            });

            if (_this.settings.keyboard) {
                $(window).on('keydown', function (e) {
                    var keyCode = e.keyCode;
                    if (keyCode === 37 || keyCode === 38) {
                        _this.prve();
                    } else if (keyCode === 39 || keyCode === 40) {
                        _this.next();
                    }
                });
            }

            $(window).resize(function () {
                var currentLength = _this.switchLength(),
                    offset = _this.settings.direction ? _this.section.eq(_this.index).offset().top : _this.section.eq(_this.index).offset().left;

                if (Math.abs(offset) > currentLength / 2 && _this.index < (_this.pagesCount - 1)) {
                    _this.index ++;
                }
                if (_this.index) {
                    _scrollPage(_this);
                }
            });

            _this.sections.on('transitionend webkitTransitionEnd oTransitionEnd otransitionend', function () {
                _this.canScroll = true;
                if (_this.settings.callback && $.type(_this.settings.callback) === 'function') {
                    _this.settings.callback();
                }
            });
        }

        function _scrollPage(_this) {
            var dest = _this.section.eq(_this.index).position();
            if (!dest) {
                return;
            }
            _this.canScroll = false;
            if (_prefix) {
                _this.sections.css(_prefix + 'transition', 'all ' + _this.settings.duration + 'ms ' + _this.settings.easing);
                var translate = _this.direction ? 'translateY(-' + dest.top + 'px)' : 'translateX(-' + dest.left + 'px)';
                _this.sections.css(_prefix + 'transform', translate);
            } else {
                var animateCss = _this.direction ? {top: -dest.top} : {left: -dest.left};
                _this.sections.animate(animateCss, _this.settings.duration, function () {
                    _this.canScroll = true;
                    if (_this.settings.callback && $.type(_this.settings.callback) === 'function') {
                        _this.settings.callback();
                    }
                });
            }

            if (_this.settings.pagination) {
                _this.pageItem.eq(_this.index).addClass(_this.activeClass).siblings('li').removeClass(_this.activeClass);
            }
        }
        return XSwitch;
    })();

})(jQuery);

$(function () {
    $('[data-XSwitch]').XSwitch();
})

$(function () {
   $(".box-r").find(".go-index").eq(1).hover(function(){
	   $(this).find(".drop-ul").show();
   },function(){
	   $(this).find(".drop-ul").hide();
   });
   
   $(".box-r").find(".drop-ul").eq(1).hover(function(){
	   $(this).show();
   },function(){
	   $(this).hide();
   });
   
   $(".box-r").eq(1).find(".go-index").eq(1).hover(function(){
	   $(this).find(".drop-ul-2").show();
   },function(){
	   $(this).find(".drop-ul-2").hide();
   });
   
   $(".box-r").eq(1).find(".drop-ul-2").eq(1).hover(function(){
	   $(this).show();
   },function(){
	   $(this).hide();
   });
   
   $(".box-r").eq(1).find(".go-index").eq(1).mouseenter(function(){
	   $(this).find(".drop-ul-2").show();
   });
   $(".box-r").eq(1).find(".go-index").eq(1).mouseleave(function(){
	   $(this).find(".drop-ul-2").hide();
   });
})

$(function () {
   $(".drop-ul .drop-li").on("click",function(e){
	   e.stopPropagation();
	   window.open("building.html","_blank");
   });
   
   $(".drop-ul-2 .drop-li-2").on("click",function(e){
	   e.stopPropagation();
	   window.open("building.html","_blank");
   });
})
