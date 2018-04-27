/*
YUI 3.5.1 (build 22)
Copyright 2012 Yahoo! Inc. All rights reserved.
Licensed under the BSD License.
http://yuilibrary.com/license/
*/
YUI.add("datatable-base-deprecated",function(c){var w=c.Lang,g=w.isValue,F=c.Lang.sub,d=c.Node,t=d.create,p=c.ClassNameManager.getClassName,q="datatable",r="column",H="focus",K="keydown",h="mouseenter",o="mouseleave",k="mouseup",z="mousedown",C="click",v="dblclick",e=p(q,"columns"),B=p(q,"data"),b=p(q,"msg"),l=p(q,"liner"),E=p(q,"first"),i=p(q,"last"),u=p(q,"even"),A=p(q,"odd"),D="<table></table>",x="<col></col>",I='<thead class="'+e+'"></thead>',f='<tbody class="'+B+'"></tbody>',J='<th id="{id}" rowspan="{rowspan}" colspan="{colspan}" class="{classnames}" abbr="{abbr}"><div class="'+l+'">{value}</div></th>',G='<tr id="{id}"></tr>',a='<td headers="{headers}" class="{classnames}"><div class="'+l+'">{value}</div></td>',j="{value}",n='<tbody class="'+b+'"></tbody>';function m(L){m.superclass.constructor.apply(this,arguments);}c.mix(m,{NAME:"column",ATTRS:{id:{valueFn:"_defaultId",readOnly:true},key:{valueFn:"_defaultKey"},field:{valueFn:"_defaultField"},label:{valueFn:"_defaultLabel"},children:{value:null},abbr:{value:""},classnames:{readOnly:true,getter:"_getClassnames"},formatter:{},emptyCellValue:{value:"",validator:c.Lang.isString},sortable:{value:false},editor:{},width:{},resizeable:{},minimized:{},minWidth:{},maxAutoWidth:{}}});c.extend(m,c.Widget,{_defaultId:function(){return c.guid();},_defaultKey:function(){return c.guid();},_defaultField:function(){return this.get("key");},_defaultLabel:function(){return this.get("key");},_afterAbbrChange:function(L){this._uiSetAbbr(L.newVal);},keyIndex:null,headers:null,colSpan:1,rowSpan:1,parent:null,thNode:null,initializer:function(L){},destructor:function(){},_getClassnames:function(){return c.ClassNameManager.getClassName(r,this.get("key").replace(/[^\w\-]/g,""));},syncUI:function(){this._uiSetAbbr(this.get("abbr"));},_uiSetAbbr:function(L){this.thNode.set("abbr",L);}});c.Column=m;function y(L){y.superclass.constructor.apply(this,arguments);}c.mix(y,{NAME:"columnset",ATTRS:{definitions:{setter:"_setDefinitions"}}});c.extend(y,c.Base,{_setDefinitions:function(L){return c.clone(L);},tree:null,idHash:null,keyHash:null,keys:null,initializer:function(){var L=[],Q={},R={},P=[],O=this.get("definitions"),M=this;function N(Z,Y,X){var U=0,T=Y.length,W,V,S;Z++;if(!L[Z]){L[Z]=[];}for(;U<T;++U){W=Y[U];W=w.isString(W)?{key:W}:W;V=new c.Column(W);W.yuiColumnId=V.get("id");Q[V.get("id")]=V;R[V.get("key")]=V;if(X){V.parent=X;}if(w.isArray(W.children)){S=W.children;V._set("children",S);M._setColSpans(V,W);M._cascadePropertiesToChildren(V,S);if(!L[Z+1]){L[Z+1]=[];}N(Z,S,V);}else{V.keyIndex=P.length;P.push(V);}L[Z].push(V);}Z--;}N(-1,O);this.tree=L;this.idHash=Q;this.keyHash=R;this.keys=P;this._setRowSpans();this._setHeaders();},destructor:function(){},_cascadePropertiesToChildren:function(O,M){var N=0,L=M.length,P;for(;N<L;++N){P=M[N];if(O.get("className")&&(P.className===undefined)){P.className=O.get("className");}if(O.get("editor")&&(P.editor===undefined)){P.editor=O.get("editor");}if(O.get("formatter")&&(P.formatter===undefined)){P.formatter=O.get("formatter");}if(O.get("resizeable")&&(P.resizeable===undefined)){P.resizeable=O.get("resizeable");}if(O.get("sortable")&&(P.sortable===undefined)){P.sortable=O.get("sortable");}if(O.get("hidden")){P.hidden=true;}if(O.get("width")&&(P.width===undefined)){P.width=O.get("width");}if(O.get("minWidth")&&(P.minWidth===undefined)){P.minWidth=O.get("minWidth");}if(O.get("maxAutoWidth")&&(P.maxAutoWidth===undefined)){P.maxAutoWidth=O.get("maxAutoWidth");}}},_setColSpans:function(N,M){var O=0;function L(R){var S=R.children,Q=0,P=S.length;for(;Q<P;++Q){if(w.isArray(S[Q].children)){L(S[Q]);}else{O++;}}}L(M);N.colSpan=O;},_setRowSpans:function(){function L(N){var O=1,Q,P,M,S;function R(X,W){W=W||1;var V=0,T=X.length,U;for(;V<T;++V){U=X[V];if(w.isArray(U.children)){W++;R(U.children,W);W--;}else{if(U.get&&w.isArray(U.get("children"))){W++;R(U.get("children"),W);W--;}else{if(W>O){O=W;}}}}}for(M=0;M<N.length;M++){Q=N[M];R(Q);for(S=0;S<Q.length;S++){P=Q[S];if(!w.isArray(P.get("children"))){P.rowSpan=O;}}O=1;}}L(this.tree);},_setHeaders:function(){var Q,O,N=this.keys,M=0,L=N.length;function P(S,R){S.push(R.get("id"));if(R.parent){P(S,R.parent);}}for(;M<L;++M){Q=[];O=N[M];P(Q,O);O.headers=Q.reverse().join(" ");}},getColumn:function(){}});c.Columnset=y;function s(L){s.superclass.constructor.apply(this,arguments);}c.mix(s,{NAME:"dataTable",ATTRS:{columnset:{setter:"_setColumnset"},recordset:{valueFn:"_initRecordset",setter:"_setRecordset"},summary:{},caption:{},thValueTemplate:{value:j},tdValueTemplate:{value:j},trTemplate:{value:G}},HTML_PARSER:{}});c.extend(s,c.Widget,{thTemplate:J,tdTemplate:a,_theadNode:null,_tbodyNode:null,_msgNode:null,_setColumnset:function(L){return w.isArray(L)?new c.Columnset({definitions:L}):L;},_afterColumnsetChange:function(L){this._uiSetColumnset(L.newVal);},_setRecordset:function(L){if(w.isArray(L)){L=new c.Recordset({records:L});}L.addTarget(this);return L;},_afterRecordsetChange:function(L){this._uiSetRecordset(L.newVal);},_afterRecordsChange:function(L){this._uiSetRecordset(this.get("recordset"));},_afterSummaryChange:function(L){this._uiSetSummary(L.newVal);},_afterCaptionChange:function(L){this._uiSetCaption(L.newVal);},destructor:function(){this.get("recordset").removeTarget(this);},renderUI:function(){this._addTableNode(this.get("contentBox"));this._addColgroupNode(this._tableNode);this._addTheadNode(this._tableNode);this._addTbodyNode(this._tableNode);this._addMessageNode(this._tableNode);this._addCaptionNode(this._tableNode);},_addTableNode:function(L){if(!this._tableNode){this._tableNode=L.appendChild(t(D));}return this._tableNode;},_addColgroupNode:function(N){var L=this.get("columnset").keys.length,M=0,O=["<colgroup>"];for(;M<L;++M){O.push(x);}O.push("</colgroup>");this._colgroupNode=N.insertBefore(t(O.join("")),N.get("firstChild"));return this._colgroupNode;},_addTheadNode:function(L){if(L){this._theadNode=L.insertBefore(t(I),this._colgroupNode.next());return this._theadNode;}},_addTbodyNode:function(L){this._tbodyNode=L.appendChild(t(f));
return this._tbodyNode;},_addMessageNode:function(L){this._msgNode=L.insertBefore(t(n),this._tbodyNode);return this._msgNode;},_addCaptionNode:function(L){this._captionNode=c.Node.create("<caption></caption>");},bindUI:function(){this.after({columnsetChange:this._afterColumnsetChange,summaryChange:this._afterSummaryChange,captionChange:this._afterCaptionChange,recordsetChange:this._afterRecordsChange,"recordset:tableChange":this._afterRecordsChange});},delegate:function(L){if(L==="dblclick"){this.get("boundingBox").delegate.apply(this.get("boundingBox"),arguments);}else{this.get("contentBox").delegate.apply(this.get("contentBox"),arguments);}},syncUI:function(){this._uiSetColumnset(this.get("columnset"));this._uiSetRecordset(this.get("recordset"));this._uiSetSummary(this.get("summary"));this._uiSetCaption(this.get("caption"));},_uiSetSummary:function(L){L=g(L)?L:"";this._tableNode.set("summary",L);},_uiSetCaption:function(N){var L=this._captionNode,M=L.inDoc(),O=N?(!M&&"prepend"):(M&&"removeChild");L.setContent(N||"");if(O){this._tableNode[O](L);}},_uiSetColumnset:function(P){var M=P.tree,R=this._theadNode,N=0,L=M.length,O=R.get("parentNode"),Q=R.next();R.remove();R.get("children").remove(true);for(;N<L;++N){this._addTheadTrNode({thead:R,columns:M[N],id:""},(N===0),(N===L-1));}O.insert(R,Q);},_addTheadTrNode:function(N,L,M){N.tr=this._createTheadTrNode(N,L,M);this._attachTheadTrNode(N);},_createTheadTrNode:function(S,M,R){var Q=t(F(this.get("trTemplate"),S)),O=0,N=S.columns,L=N.length,P;if(M){Q.addClass(E);}if(R){Q.addClass(i);}for(;O<L;++O){P=N[O];this._addTheadThNode({value:P.get("label"),column:P,tr:Q});}return Q;},_attachTheadTrNode:function(L){L.thead.appendChild(L.tr);},_addTheadThNode:function(L){L.th=this._createTheadThNode(L);this._attachTheadThNode(L);L.column.thNode=L.th;},_createTheadThNode:function(M){var L=M.column;M.id=L.get("id");M.colspan=L.colSpan;M.rowspan=L.rowSpan;M.abbr=L.get("abbr");M.classnames=L.get("classnames");M.value=F(this.get("thValueTemplate"),M);return t(F(this.thTemplate,M));},_attachTheadThNode:function(L){L.tr.appendChild(L.th);},_uiSetRecordset:function(O){var X=this,T=this._tbodyNode,W=T.get("parentNode"),P=T.next(),N=this.get("columnset").keys,R=this.get("tdValueTemplate"),L={},U,Q,S,M,V;T.remove();T=null;U=this._addTbodyNode(this._tableNode);U.remove();this._tbodyNode=U;L.tbody=U;L.rowTemplate=this.get("trTemplate");L.columns=[];for(Q=N.length-1;Q>=0;--Q){M=N[Q];L.columns[Q]={column:M,fields:M.get("field"),classnames:M.get("classnames"),emptyCellValue:M.get("emptyCellValue")};V=M.get("formatter");if(w.isFunction(V)){V=c.bind(this._functionFormatter,this,V);}else{if(!w.isString(V)){V=R;}V=c.bind(this._templateFormatter,this,V);}L.columns[Q].formatter=V;}for(Q=0,S=O.size();Q<S;++Q){L.record=O.item(Q);L.data=L.record.get("data");L.rowindex=Q;this._addTbodyTrNode(L);}W.insert(this._tbodyNode,P);},_functionFormatter:function(L,N){var M=L.call(this,N);return(M!==undefined)?M:N.emptyCellValue;},_templateFormatter:function(L,M){if(M.value===undefined){M.value=M.emptyCellValue;}return F(L,M);},_addTbodyTrNode:function(M){var L=M.tbody.one("#"+M.record.get("id"));M.tr=L||this._createTbodyTrNode(M);this._attachTbodyTrNode(M);},_createTbodyTrNode:function(P){var N=P.columns,M,L,O;P.tr=t(F(P.rowTemplate,{id:P.record.get("id")}));for(M=0,L=N.length;M<L;++M){O=N[M];P.column=O.column;P.field=O.fields;P.classnames=O.classnames;P.formatter=O.formatter;P.emptyCellValue=O.emptyCellValue;this._addTbodyTdNode(P);}return P.tr;},_attachTbodyTrNode:function(Q){var N=Q.tbody,P=Q.tr,M=Q.rowindex,O=N.get("children").item(M)||null,L=(M%2);if(L){P.replaceClass(u,A);}else{P.replaceClass(A,u);}N.insertBefore(P,O);},_addTbodyTdNode:function(L){L.td=this._createTbodyTdNode(L);this._attachTbodyTdNode(L);delete L.td;},createCell:function(L){return L&&(L.td||(L.td=t(F(this.tdTemplate,L))));},_createTbodyTdNode:function(L){L.headers=L.column.headers;L.value=this.formatDataCell(L);return L.td||this.createCell(L);},_attachTbodyTdNode:function(L){L.tr.appendChild(L.td);},formatDataCell:function(L){L.value=L.data[L.field];return L.formatter.call(this,L);},_initRecordset:function(){return new c.Recordset({records:[]});}});c.namespace("DataTable").Base=s;},"3.5.1",{requires:["recordset-base","widget","substitute","event-mouseenter"]});