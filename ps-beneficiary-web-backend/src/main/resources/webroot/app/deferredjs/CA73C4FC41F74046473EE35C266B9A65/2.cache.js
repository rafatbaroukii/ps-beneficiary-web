$wnd.app.runAsyncCallback2("var uE='Error parsing JSON: ',wE='com.progressoft.workshop.layout.client.ui.views';function gb(b){var c=ib();var d=b.replace(/[\\xad\\u0600-\\u0603\\u06dd\\u070f\\u17b4\\u17b5\\u200b-\\u200f\\u2028-\\u202e\\u2060-\\u2064\\u206a-\\u206f\\ufeff\\ufff9-\\ufffb]/g,function(a){return fb(a,c)});return d}\nfm(318,1,{});_.N=function Sd(){return null};_.O=function Td(){return null};_.P=function Ud(){return null};_.Q=function Vd(){return null};_.R=function Wd(){return null};fm(105,318,{});_.N=function ke(){return this};function oe(a){w(this);this.g=!a?null:F(a,a.v());this.f=a;B(this);this.w()}\nfm(73,4,dD,oe);fm(255,318,{});_.O=function te(){if(this!=pe){return null}return this};fm(39,318,{39:1});_.P=function Ae(){return this};fm(29,318,{29:1});_.Q=function Me(){return this};function We(b,c){var d;if(c){try{d=JSON.parse(b)}catch(a){return Ye(uE+a)}}else{b=gb(b);try{d=eval('('+b+')')}catch(a){return Ye(uE+a)}}var e=Pe[typeof d];return e?e(d):Ze(typeof d)}\nfunction Xe(b){Qe();var c;if(b==null){throw Ql(new Jt)}if(b.length==0){throw Ql(new ot('empty argument'))}try{return We(b,false)}catch(a){a=Pl(a);if(ag(a,19)){c=a;throw Ql(new oe(c))}else throw Ql(a)}}\nfunction Ye(a){throw Ql(new ne(a))}\nfm(49,318,{49:1});_.R=function cf(){return this};function Bm(a){if(a==null){throw Ql(new Kt('html is null'))}this.a=a}\nfm(59,1,{59:1,331:1,3:1},Bm);_.r=function Cm(a){if(!ag(a,59)){return false}return Rt(this.a,Vf(Vf(a,331),59).a)};_.s=function Dm(){return hC(this.a)};var mh=Ws('com.google.gwt.safehtml.shared','OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml',59);fm(148,1,{});_.D=function _n(){xn();Ao(new ms)};function ao(){}\nfm(74,1,{74:1},ao);var Ch=Ws(PD,'DynamicServiceRoot',74);function eo(){eo=gm;co=new ao}\nvar co;function fo(){}\nfm(278,1,{},fo);_.cb=function go(a){return eo(),eo(),true};var Dh=Ws(PD,'ServiceRootMatcher/lambda$2$Type',278);function ko(){ko=gm;jo=PC((Qs(Hh),Hh.j))}\nfunction lo(a){a.b=a.c;a.b.eb();return a}\nfunction mo(a){xn();Uq(Vf(wn.a,286),Pq(Vf(sn.a,108),(Qs(hj),hj.b)));a.b=a.a}\nfm(137,1,{});var jo;var Hh=Ws(RD,'BaseClientPresenter',137);function no(){}\nfm(208,1,{},no);_.eb=function oo(){RC((ko(),jo),'Presenter '+hj+' Have already been initialized.')};var Fh=Ws(RD,'BaseClientPresenter/lambda$0$Type',208);function po(a){this.a=a}\nfm(209,1,{},po);_.eb=function qo(){mo(this.a)};var Gh=Ws(RD,'BaseClientPresenter/lambda$1$Type',209);function ro(a){!a.c&&(a.c=lo(new _r));return a.c}\nfunction vo(a){O.call(this,a)}\nfm(85,4,dD,vo);var Kh=Ws(RD,'PresentersRepository/PresenterNotFoundException',85);function wo(a){!a.b&&(a.b=new ns);return a.b}\nfunction yo(a){O.call(this,a)}\nfm(165,4,dD,yo);var Nh=Ws(SD,'ViewsRepository/ViewNotFoundException',165);function Ao(a){if(!r(a.e,a.d))throw Ql(new Mo('Request have already been sent'));a.e.fb(new Lo)}\nfunction Bo(){throw Ql(new Mo('This request have already been completed!.'))}\nfm(139,1,{});var Qh=Ws(TD,'BaseRequest',139);function Co(a){this.a=a}\nfm(210,1,{},Co);_.fb=function Do(a){Ho(this.a)};var Oh=Ws(TD,'BaseRequest/lambda$0$Type',210);function Eo(){}\nfm(211,1,{},Eo);_.fb=function Fo(a){Bo()};var Ph=Ws(TD,'BaseRequest/lambda$1$Type',211);function Go(a){Qq(Vf((xn(),sn).a,108),nr(Vf(tn.a,285),a.c).a);RC(($r(),Zr),(Qs(hj),'Main context received at presenter '+hj.g));a.e=a.b}\nfunction Ho(a){a.e=a.a;Vf((xn(),ln).a,289).gb(a)}\nfm(140,139,{});var Sh=Ws(TD,'ClientRequest',140);function Io(a){this.a=a}\nfm(212,1,{},Io);_.fb=function Jo(a){Go(this.a)};var Rh=Ws(TD,'ClientRequest/lambda$0$Type',212);function Ko(a){!a.a&&(a.a=new bs);return a.a}\nfunction Mo(a){O.call(this,a)}\nfm(89,4,dD,Mo);var Vh=Ws(TD,'Request/InvalidRequestState',89);function Ro(a){O.call(this,a)}\nfm(171,4,dD,Ro);var Yh=Ws(TD,'RequestRestSendersRepository/SenderNotFoundException',171);function To(a){O.call(this,a)}\nfm(160,4,dD,To);var $h=Ws(TD,'RequestsRepository/RequestKeyNotFoundException',160);function Uo(){N.call(this)}\nfm(262,4,dD,Uo);var ai=Ws('com.progressoft.brix.domino.api.shared.history','HistoryToken/TokenCannotBeNullException',262);function Wo(a){if(a==null)return null;return a}\nfunction Zo(a){var b;b=a.Q();if(!b){throw Ql(new wC('Expected a json object, but was given: null'))}return b}\nfm(323,1,hD);var ei=Ws('com.progressoft.brix.domino.api.shared.request','ServerResponse',323);fm(68,1,XD);_.D=function lp(){this.a.D()};fm(322,320,{});_.U=function xp(){return vp};var qi=Ws(YD,'ServerFailedRequestGwtEvent',322);function yp(a){Op((Vf((xn(),on).a,111),new Bp(a)))}\nfunction zp(){wp();xn()}\nfm(106,322,{},zp);_.T=function Ap(a){Vf(a,110);null._b()};var pi=Ws(YD,'ServerFailedRequestEvent',106);function Bp(a){this.a=a}\nfm(275,1,{},Bp);_.db=function Cp(){return this.a};var oi=Ws(YD,'ServerFailedRequestEvent/GWTRequestEvent',275);fm(325,320,{});_.U=function Fp(){return Dp};var ti=Ws(YD,'ServerSuccessRequestGwtEvent',325);function Gp(a){Op((Vf((xn(),on).a,111),new Jp(a)))}\nfunction Hp(){Ep();xn()}\nfm(283,325,{},Hp);_.T=function Ip(a){Vf(a,110);null._b()};var si=Ws(YD,'ServerSuccessRequestEvent',283);function Jp(a){this.a=a}\nfm(284,1,{},Jp);_.db=function Kp(){return this.a};var ri=Ws(YD,'ServerSuccessRequestEvent/GWTRequestEvent',284);function bq(a){new oq(a)}\nfm(173,1,{},bq);var zi=Ws($D,'StateHistory/DominoHistoryState',173);fm(176,1,{});_.D=function kq(){null._b(new bq(this.a))};function lq(a,b){if(b==null)return lq(a,gD);return Vf(pB(qB(kw(Zt(Zt(Zt(Xt(b,'!',''),'\\\\?',0)[0],'\\\\#',0)[0],'/',0)),new rq),OA(new pq,new XA,new fB,nf(gf(fl,1),kD,23,0,[(SA(),QA)]))),9)}\nfunction mq(a){if(a.indexOf('?')==-1)return new Nx;return Vf(pB(tB(kw(Zt(Zt(Zt(a,'\\\\?',0)[1],'\\\\#',0)[0],'&',0)),new tq),OA(new _A,new gB,new iB,nf(gf(fl,1),kD,23,0,[(SA(),QA)]))),31)}\nfunction nq(a){if(a.indexOf('#')!=-1)return Zt(a,'\\\\#',0)[1];return ''}\nfunction oq(a){this.a=new Dy;this.b=new Nx;if(a==null)throw Ql(new Uo);mu(this.a,lq(this,a));yu(this.b,mq(a));nq(a)}\nfm(263,1,{},oq);var Hi=Ws($D,'StateHistoryToken',263);function pq(){}\nfm(265,1,{},pq);_.ib=function qq(){return new Dy};var Ei=Ws($D,'StateHistoryToken/0methodref$ctor$Type',265);function rq(){}\nfm(264,1,{},rq);_.cb=function sq(a){return $f(a).length!=0};var Fi=Ws($D,'StateHistoryToken/lambda$5$Type',264);function tq(){}\nfm(266,1,{},tq);_.hb=function uq(a){return Zt($f(a),'=',0)};var Gi=Ws($D,'StateHistoryToken/lambda$6$Type',266);function Pq(a,b){if(Lu(a.a,b))return $f(Ku(a.a,b));throw Ql(new vo(b))}\nfunction Qq(a,b){if(Lu(a.b,b))return ro(Vf(Ku(a.b,b),35));throw Ql(new vo(b))}\nfunction Uq(a,b){if(Lu(a.a,b))return wo(Vf(Ku(a.a,b),55));throw Ql(new yo(b))}\nfm(153,1,cE);_.gb=function ar(a){Gb(1,new br(a))};function er(a,b){a.a=b}\nfunction kr(a,b){if(Iu(a.a,b))return Ko(Vf(Ju(a.a,b),66));throw Ql(new Ro(b))}\nfunction nr(a,b){if(Lu(a.a,b))return Vf(Ku(a.a,b),46);throw Ql(new To('Request Key ['+b+']'))}\nfunction tr(a,b){xn();Gb(2,new jp((Vf(kn.a,109),new vr(a,b))))}\nfunction vr(a,b){this.b=a;this.a=b}\nfm(196,1,{},vr);_.X=function wr(a){QC((sr(),rr),vE+this.a+']',a)};_.D=function xr(){var a;er(this.b.a,null._b());xn();as((a=kr(Vf(un.a,288),null._b()._b()),null._b(),a))};var Xi=Ws(dE,'RequestAsyncRunner/RequestAsyncTask',196);function yr(a,b){tr(a.a,b)}\nfm(155,1,cE);_.gb=function Ar(a){yr(this,kg(a))};function $r(){$r=gm;ko();Zr=PC((Qs(hj),hj.j))}\nfunction _r(){$r();this.a=new no;this.c=new po(this)}\nfm(138,137,{},_r);var Zr;function as(a){var b;hs(a.a,new GC((eo(),b=(xn(),Vf(Vf(nn.a,77),44).b),Vf(az(rB(qB(new vB(null,new xz(b,16)),new fo)),co),74),eo(),xn(),Vf(Vf(nn.a,77),44).a)));gs(a.a,new cs)}\nfunction bs(){this.a=new is}\nfm(273,1,{},bs);var mj=Ws(gE,'LayoutServerRequestSender',273);function cs(){}\nfm(274,1,{},cs);_.kb=function es(a,b){Gp(new Hp)};_.jb=function ds(a,b){yp(new zp)};var jj=Ws(gE,'LayoutServerRequestSender/1',274);function fs(a){var b;if(!a.a){b=(qC(),qC(),pC);a.a=new GC(b)}return a.a}\nfunction gs(b,c){var d;d=EC(FC(fs(b),'LayoutRequest'));Ed(d.b,'Accept',aE);Ed(d.b,uD,aE);zC(d,(qC(),qe(),qe(),pe));try{AC(d,new ks(d,c,d))}catch(a){a=Pl(a);if(ag(a,22)){yp(new zp)}else throw Ql(a)}}\nfunction hs(a,b){a.a=b}\nfunction is(){}\nfm(276,1,{},is);_.a=null;var lj=Ws(gE,'LayoutServerRequestSender_LayoutServerRequestService_Generated_RestServiceProxy_',276);function js(b){var c;try{return qs((Qe(),Xe(b.a.d.a.responseText)))}catch(a){a=Pl(a);if(ag(a,5)){c=a;throw Ql(new JC(c))}else throw Ql(a)}}\nfunction ks(a,b,c){this.a=c;Mq.call(this,a,b)}\nfm(277,99,{},ks);_.lb=function ls(){return js(this)};var kj=Ws(gE,'LayoutServerRequestSender_LayoutServerRequestService_Generated_RestServiceProxy_/1',277);function ms(){xn();this.d=new Co(this);this.b=new Eo;this.c=(Qs(oj),oj.b);this.e=this.d;this.a=new Io(this)}\nfm(141,140,{},ms);function ns(){$wnd.alert('hello');this.a=new os;(Hs(),Fs).body.appendChild(this.a.a)}\nfm(280,1,{},ns);var pj=Ws(wE,'DefaultLayoutView',280);fm(324,1,{});var qj=Ws(wE,'Layout',324);function os(){var a;this.a=Zf((Hs(),Fs).createElement('div'),$wnd.HTMLElement);this.a.innerHTML=(a=new iu,a.a+='<app-header reveals data-element=\"header\">  <app-toolbar>   <paper-icon-button icon=\"menu\" onclick=\"drawer.toggle()\"><\\/paper-icon-button>   <div main-title>   My app  <\\/div>   <paper-icon-button icon=\"delete\"><\\/paper-icon-button>   <paper-icon-button icon=\"search\"><\\/paper-icon-button>   <paper-icon-button icon=\"close\"><\\/paper-icon-button>  <\\/app-toolbar> <\\/app-header> <app-drawer id=\"drawer\" swipe-open data-element=\"drawer\"><\\/app-drawer>',new Bm(a.a)).a;this.c==null?(this.c=Zf(this.a.querySelector('[data-element=header]'),$wnd.HTMLElement)):OC(this.a,'header',this.c);this.b==null?(this.b=Zf(this.a.querySelector('[data-element=drawer]'),$wnd.HTMLElement)):OC(this.a,'drawer',this.b)}\nfm(282,324,{},os);var rj=Ws(wE,'Templated_Layout',282);function ps(){}\nfm(279,323,hD,ps);var sj=Ws('com.progressoft.workshop.layout.shared.response','LayoutResponse',279);function qs(a){var b,c;if(!a||!!a.O()){return null}b=Zo(a);c=new ps;Wo(lC(Ee(b,'serverMessage')));return c}\nfunction iu(){Is.call(this,'')}\nfm(43,82,{115:1},iu);function mu(a,b){var c,d,e;VB(b);c=false;for(e=b.wb();e.Ib();){d=e.Jb();c=c|(Cy(a,d,a.c.b,a.c),true)}return c}\nfunction yu(a,b){var c,d;VB(b);for(d=b.Eb().wb();d.Ib();){c=Vf(d.Jb(),10);Mu(a,c.Rb(),c.Sb())}}\nfm(309,1,jE);_.Db=function Au(a){return !!xu(this,a)};fm(180,309,jE);_.Db=function Qu(a){return Iu(this,a)};function kw(a){return new vB(null,jw(a,a.length))}\nfm(216,1,jE);_.Db=function ix(a){return this.b.Db(a)};function az(a,b){return a.a!=null?a.a:b}\nfunction WA(){throw Ql(new pt(\"Can't assign multiple values to the same key\"))}\nfunction _A(){}\nfm(228,1,{},_A);_.ib=function aB(){return new Nx};var jl=Ws(rE,'Collectors/22methodref$ctor$Type',228);function gB(){}\nfm(229,1,{},gB);_.nb=function hB(a,b){var c,d;c=Vf(b,51)[0];d=Vf(b,51)[1];a.Db(c)?a.Gb(c,(a.Fb(c),WA())):a.Gb(c,d)};var nl=Ws(rE,'Collectors/lambda$23$Type',229);function iB(){}\nfm(230,1,{},iB);var ol=Ws(rE,'Collectors/lambda$24$Type',230);function rB(a){var b;mB(a);b=new JB;if(a.a.Wb(b)){return _y(),new cz(VB(b.a))}return _y(),_y(),$y}\nfunction lC(a){var b;if(!a||!!a.O()){return null}b=a.R();if(!b){if(!!a.N()||!!a.P()){return a.t()}throw Ql(new wC('Expected a json string, but was given: '+a))}return b.a}\nfunction wC(a){O.call(this,a)}\nfm(104,4,dD,wC);var Dl=Ws(bE,'JsonEncoderDecoder/DecodingException',104);function JC(a){P.call(this,'Response was NOT a valid JSON document',a)}\nfm(281,4,dD,JC);var Hl=Ws(bE,'ResponseFormatException',281);function OC(a,b,c){var d;if(c==null){throw Ql(new Kt('New element must not be null in TemplateUtils.replaceElement()'))}d=Zf(a.querySelector('[data-element='+b+']'),$wnd.HTMLElement);d!=null&&d.parentNode!=null&&d.parentNode.replaceChild(c,d)}\nYC(Fb)(2);\n//# sourceMappingURL=src/CA73C4FC41F74046473EE35C266B9A65_sourceMap2.json \n//# sourceURL=app-2.js\n")
