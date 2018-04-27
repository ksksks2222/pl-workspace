/*
YUI 3.5.1 (build 22)
Copyright 2012 Yahoo! Inc. All rights reserved.
Licensed under the BSD License.
http://yuilibrary.com/license/
*/
YUI.add("event-valuechange",function(e){var c="_valuechange",d="value",a,b={POLL_INTERVAL:50,TIMEOUT:10000,_poll:function(k,g){var i=k._node,j=g.e,f=i&&i.value,l=k._data&&k._data[c],h,m;if(!i||!l){b._stopPolling(k);return;}m=l.prevVal;if(f!==m){l.prevVal=f;h={_event:j,currentTarget:(j&&j.currentTarget)||k,newVal:f,prevVal:m,target:(j&&j.target)||k};e.Object.each(l.notifiers,function(n){n.fire(h);});b._refreshTimeout(k);}},_refreshTimeout:function(g,f){if(!g._node){return;}var h=g.getData(c);b._stopTimeout(g);h.timeout=setTimeout(function(){b._stopPolling(g,f);},b.TIMEOUT);},_startPolling:function(h,g,f){if(!h.test("input,textarea")){return;}var i=h.getData(c);if(!i){i={prevVal:h.get(d)};h.setData(c,i);}i.notifiers||(i.notifiers={});if(i.interval){if(f.force){b._stopPolling(h,g);}else{i.notifiers[e.stamp(g)]=g;return;}}i.notifiers[e.stamp(g)]=g;i.interval=setInterval(function(){b._poll(h,i,f);},b.POLL_INTERVAL);b._refreshTimeout(h,g);},_stopPolling:function(g,f){if(!g._node){return;}var h=g.getData(c)||{};clearInterval(h.interval);delete h.interval;b._stopTimeout(g);if(f){h.notifiers&&delete h.notifiers[e.stamp(f)];}else{h.notifiers={};}},_stopTimeout:function(f){var g=f.getData(c)||{};clearTimeout(g.timeout);delete g.timeout;},_onBlur:function(g,f){b._stopPolling(g.currentTarget,f);},_onFocus:function(h,g){var f=h.currentTarget,i=f.getData(c);if(!i){i={};f.setData(c,i);}i.prevVal=f.get(d);b._startPolling(f,g,{e:h});},_onKeyDown:function(g,f){b._startPolling(g.currentTarget,f,{e:g});},_onKeyUp:function(g,f){if(g.charCode===229||g.charCode===197){b._startPolling(g.currentTarget,f,{e:g,force:true});}},_onMouseDown:function(g,f){b._startPolling(g.currentTarget,f,{e:g});},_onSubscribe:function(k,h,j,g){var l,i,f;i={blur:b._onBlur,focus:b._onFocus,keydown:b._onKeyDown,keyup:b._onKeyUp,mousedown:b._onMouseDown};l=j._valuechange={};if(g){l.delegated=true;l.getNodes=function(){return k.all("input,textarea").filter(g);};l.getNodes().each(function(m){if(!m.getData(c)){m.setData(c,{prevVal:m.get(d)});}});j._handles=e.delegate(i,k,g,null,j);}else{if(!k.test("input,textarea")){return;}if(!k.getData(c)){k.setData(c,{prevVal:k.get(d)});}j._handles=k.on(i,null,null,j);}},_onUnsubscribe:function(h,g,f){var i=f._valuechange;f._handles&&f._handles.detach();if(i.delegated){i.getNodes().each(function(j){b._stopPolling(j,f);});}else{b._stopPolling(h,f);}}};a={detach:b._onUnsubscribe,on:b._onSubscribe,delegate:b._onSubscribe,detachDelegate:b._onUnsubscribe,publishConfig:{emitFacade:true}};e.Event.define("valuechange",a);e.Event.define("valueChange",a);e.ValueChange=b;},"3.5.1",{requires:["event-focus","event-synthetic"]});