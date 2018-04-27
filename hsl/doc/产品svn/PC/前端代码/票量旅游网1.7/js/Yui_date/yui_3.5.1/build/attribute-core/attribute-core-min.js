/*
YUI 3.5.1 (build 22)
Copyright 2012 Yahoo! Inc. All rights reserved.
Licensed under the BSD License.
http://yuilibrary.com/license/
*/
YUI.add("attribute-core",function(c){c.State=function(){this.data={};};c.State.prototype={add:function(v,w,y){var x=this.data;x[v]=x[v]||{};x[v][w]=y;},addAll:function(v,x){var w;for(w in x){if(x.hasOwnProperty(w)){this.add(v,w,x[w]);}}},remove:function(v,w){var x=this.data;if(x[v]){delete x[v][w];}},removeAll:function(v,x){var w=this.data;if(!x){if(w[v]){delete w[v];}}else{c.each(x,function(z,y){if(c.Lang.isString(y)){this.remove(v,y);}else{this.remove(v,z);}},this);}},get:function(v,w){var x=this.data;return(x[v])?x[v][w]:undefined;},getAll:function(w,v){var y=this.data,x;if(!v){c.each(y[w],function(A,z){x=x||{};x[z]=A;});}else{x=y[w];}return x;}};var i=c.Object,d=c.Lang,q=".",k="getter",j="setter",l="readOnly",r="writeOnce",p="initOnly",u="validator",f="value",m="valueFn",o="lazyAdd",t="added",h="_bypassProxy",b="initializing",g="initValue",a="lazy",n="isLazyAdd",e;function s(w,v,x){this._initAttrHost(w,v,x);}s.INVALID_VALUE={};e=s.INVALID_VALUE;s._ATTR_CFG=[j,k,u,f,m,r,l,o,h];s.prototype={_initAttrHost:function(w,v,x){this._state=new c.State();this._initAttrs(w,v,x);},addAttr:function(w,v,y){var z=this,B=z._state,A,x;v=v||{};y=(o in v)?v[o]:y;if(y&&!z.attrAdded(w)){B.addAll(w,{lazy:v,added:true});}else{if(!z.attrAdded(w)||B.get(w,n)){x=(f in v);if(x){A=v.value;delete v.value;}v.added=true;v.initializing=true;B.addAll(w,v);if(x){z.set(w,A);}B.remove(w,b);}}return z;},attrAdded:function(v){return !!this._state.get(v,t);},get:function(v){return this._getAttr(v);},_isLazyAttr:function(v){return this._state.get(v,a);},_addLazyAttr:function(x,v){var y=this._state,w=y.get(x,a);y.add(x,n,true);y.remove(x,a);this.addAttr(x,w);},set:function(v,w){return this._setAttr(v,w);},_set:function(v,w){return this._setAttr(v,w,null,true);},_setAttr:function(x,A,v,y){var E=true,w=this._state,B=this._stateProxy,H,D,G,I,z,C,F;if(x.indexOf(q)!==-1){G=x;I=x.split(q);x=I.shift();}if(this._isLazyAttr(x)){this._addLazyAttr(x);}H=w.getAll(x,true)||{};D=(!(f in H));if(B&&x in B&&!H._bypassProxy){D=false;}C=H.writeOnce;F=H.initializing;if(!D&&!y){if(C){E=false;}if(H.readOnly){E=false;}}if(!F&&!y&&C===p){E=false;}if(E){if(!D){z=this.get(x);}if(I){A=i.setValue(c.clone(z),I,A);if(A===undefined){E=false;}}if(E){if(!this._fireAttrChange||F){this._setAttrVal(x,G,z,A);}else{this._fireAttrChange(x,G,z,A,v);}}}return this;},_getAttr:function(x){var y=this,C=x,z=y._state,A,v,B,w;if(x.indexOf(q)!==-1){A=x.split(q);x=A.shift();}if(y._tCfgs&&y._tCfgs[x]){w={};w[x]=y._tCfgs[x];delete y._tCfgs[x];y._addAttrs(w,y._tVals);}if(y._isLazyAttr(x)){y._addLazyAttr(x);}B=y._getStateVal(x);v=z.get(x,k);if(v&&!v.call){v=this[v];}B=(v)?v.call(y,B,C):B;B=(A)?i.getValue(B,A):B;return B;},_getStateVal:function(v){var w=this._stateProxy;return w&&(v in w)&&!this._state.get(v,h)?w[v]:this._state.get(v,f);},_setStateVal:function(v,x){var w=this._stateProxy;if(w&&(v in w)&&!this._state.get(v,h)){w[v]=x;}else{this._state.add(v,f,x);}},_setAttrVal:function(H,G,C,A){var I=this,D=true,F=this._state.getAll(H,true)||{},y=F.validator,B=F.setter,E=F.initializing,x=this._getStateVal(H),w=G||H,z,v;if(y){if(!y.call){y=this[y];}if(y){v=y.call(I,A,w);if(!v&&E){A=F.defaultValue;v=true;}}}if(!y||v){if(B){if(!B.call){B=this[B];}if(B){z=B.call(I,A,w);if(z===e){D=false;}else{if(z!==undefined){A=z;}}}}if(D){if(!G&&(A===x)&&!d.isObject(A)){D=false;}else{if(!(g in F)){F.initValue=A;}I._setStateVal(H,A);}}}else{D=false;}return D;},setAttrs:function(v){return this._setAttrs(v);},_setAttrs:function(w){for(var v in w){if(w.hasOwnProperty(v)){this.set(v,w[v]);}}return this;},getAttrs:function(v){return this._getAttrs(v);},_getAttrs:function(y){var A=this,C={},z,w,v,B,x=(y===true);y=(y&&!x)?y:i.keys(A._state.data);for(z=0,w=y.length;z<w;z++){v=y[z];B=A.get(v);if(!x||A._getStateVal(v)!=A._state.get(v,g)){C[v]=A.get(v);}}return C;},addAttrs:function(v,w,x){var y=this;if(v){y._tCfgs=v;y._tVals=y._normAttrVals(w);y._addAttrs(v,y._tVals,x);y._tCfgs=y._tVals=null;}return y;},_addAttrs:function(w,x,y){var A=this,v,z,B;for(v in w){if(w.hasOwnProperty(v)){z=w[v];z.defaultValue=z.value;B=A._getAttrInitVal(v,z,A._tVals);if(B!==undefined){z.value=B;}if(A._tCfgs[v]){delete A._tCfgs[v];}A.addAttr(v,z,y);}}},_protectAttrs:function(w){if(w){w=c.merge(w);for(var v in w){if(w.hasOwnProperty(v)){w[v]=c.merge(w[v]);}}}return w;},_normAttrVals:function(v){return(v)?c.merge(v):null;},_getAttrInitVal:function(v,w,y){var z,x;if(!w.readOnly&&y&&y.hasOwnProperty(v)){z=y[v];}else{z=w.value;x=w.valueFn;if(x){if(!x.call){x=this[x];}if(x){z=x.call(this,v);}}}return z;},_initAttrs:function(w,v,z){w=w||this.constructor.ATTRS;var y=c.Base,x=c.BaseCore,A=(y&&c.instanceOf(this,y)),B=(!A&&x&&c.instanceOf(this,x));if(w&&!A&&!B){this.addAttrs(this._protectAttrs(w),v,z);}}};c.AttributeCore=s;},"3.5.1");