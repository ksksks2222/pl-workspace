/*
YUI 3.5.1 (build 22)
Copyright 2012 Yahoo! Inc. All rights reserved.
Licensed under the BSD License.
http://yuilibrary.com/license/
*/
YUI.add("event-flick",function(c){var i=((c.config.win&&("ontouchstart" in c.config.win))&&!(c.UA.chrome&&c.UA.chrome<6))?{start:"touchstart",end:"touchend",move:"touchmove"}:{start:"mousedown",end:"mouseup",move:"mousemove"},j="start",m="end",d="move",b="ownerDocument",k="minVelocity",f="minDistance",a="preventDefault",e="_fs",g="_fsh",n="_feh",h="_fmh",l="nodeType";c.Event.define("flick",{on:function(p,o,r){var q=p.on(i[j],this._onStart,this,p,o,r);o[g]=q;},detach:function(q,p,s){var r=p[g],o=p[n];if(r){r.detach();p[g]=null;}if(o){o.detach();p[n]=null;}},processArgs:function(o){var p=(o.length>3)?c.merge(o.splice(3,1)[0]):{};if(!(k in p)){p[k]=this.MIN_VELOCITY;}if(!(f in p)){p[f]=this.MIN_DISTANCE;}if(!(a in p)){p[a]=this.PREVENT_DEFAULT;}return p;},_onStart:function(u,r,x,p){var o=true,w,q,v,t=x._extra.preventDefault,s=u;if(u.touches){o=(u.touches.length===1);u=u.touches[0];}if(o){if(t){if(!t.call||t(u)){s.preventDefault();}}u.flick={time:new Date().getTime()};x[e]=u;w=x[n];v=(r.get(l)===9)?r:r.get(b);if(!w){w=v.on(i[m],c.bind(this._onEnd,this),null,r,x,p);x[n]=w;}x[h]=v.once(i[d],c.bind(this._onMove,this),null,r,x,p);}},_onMove:function(r,p,o,q){var s=o[e];if(s&&s.flick){s.flick.time=new Date().getTime();}},_onEnd:function(C,w,D,s){var A=new Date().getTime(),q=D[e],o=!!q,E=C,r,v,B,y,z,p,x,u,t=D[h];if(t){t.detach();delete D[h];}if(o){if(C.changedTouches){if(C.changedTouches.length===1&&C.touches.length===0){E=C.changedTouches[0];}else{o=false;}}if(o){y=D._extra;B=y[a];if(B){if(!B.call||B(C)){C.preventDefault();}}r=q.flick.time;A=new Date().getTime();v=A-r;z=[E.pageX-q.pageX,E.pageY-q.pageY];if(y.axis){u=y.axis;}else{u=(Math.abs(z[0])>=Math.abs(z[1]))?"x":"y";}p=z[(u==="x")?0:1];x=(v!==0)?p/v:0;if(isFinite(x)&&(Math.abs(p)>=y[f])&&(Math.abs(x)>=y[k])){C.type="flick";C.flick={time:v,distance:p,velocity:x,axis:u,start:q};s.fire(C);}D[e]=null;}}},MIN_VELOCITY:0,MIN_DISTANCE:0,PREVENT_DEFAULT:false});},"3.5.1",{requires:["node-base","event-touch","event-synthetic"]});