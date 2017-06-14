(function(w,d){var $AA=w['$AA']||{};$AA.config={cookieDomain:null,cookieTries:0,cookieExpireDays:1,className:'AVANSERnumber',retryInterval:200,keepAlive:20*1000,maxKeepAlive:180,maxRetries:50,debug:false};$AA.page={l:w.location.toString(),query:$AA.utilities.querystring(w.location),host:$AA.utilities.host(w.location.toString())};$AA.referrer={l:d.referrer.toString(),query:$AA.utilities.querystring(d.referrer),host:$AA.utilities.host(d.referrer.toString())};$AA.options={};$AA.options.cookieName='_AA';$AA.options.clientId=7442;$AA.options.trackingCode=24;$AA.options.trackUrl=w.location.protocol+'//adriano-AU.avanser.com/t.php';$AA.options.keepaliveUrl=w.location.protocol+'//adriano-AU.avanser.com/k.php';$AA.options.mediums=['paid'];$AA.options.autostart=true;$AA.options.collector='UniversalAnalytics';$AA.options=$AA.merge(w['AvanserOptions'],$AA.options,true);$AA.data=$AA.data||{};$AA.data.collected=false;$AA.data.keepalive={};$AA.data.timer=null;$AA.data.track={};$AA.collectors={UniversalAnalytics:function(fnCallback)
{$AA.log('$AA.collectors.UniversalAnalytics: called ');if($AA.typeOf(this.scriptTries)=='undefined')
this.scriptTries=0;$AA.log('$AA.collectors.UniversalAnalytics: try '+this.scriptTries+'/'+$AA.config.maxRetries);if(this.scriptTries>$AA.config.maxRetries){$AA.log('Universal Analytics script not available');return false;}
var ga=window['ga'];if($AA.typeOf(w['GoogleAnalyticsObject'])!='undefined'&&$AA.typeOf(ga)=='undefined'&&$AA.typeOf(window[GoogleAnalyticsObject])=='function'){ga=window[GoogleAnalyticsObject];}
if($AA.typeOf(ga)=='undefined'||$AA.typeOf(ga)!='function'){this.scriptTries++;$AA.log('$AA.collectors.UniversalAnalytics: new try in '+$AA.config.retryInterval+'ms');setTimeout(function(){$AA.collectors.UniversalAnalytics(fnCallback);},$AA.config.retryInterval);return;}
ga(function(tracker){if($AA.typeOf(ga)=='undefined'||$AA.typeOf(ga.getAll)!='function'){this.scriptTries++;$AA.log('$AA.collectors.UniversalAnalytics: new try in '+$AA.config.retryInterval+'ms');setTimeout(function(){$AA.collectors.UniversalAnalytics(fnCallback);},$AA.config.retryInterval);return;}
if($AA.typeOf(tracker)=='undefined')
tracker=ga.getAll()[0];if($AA.typeOf(tracker)=='undefined'){$AA.log('Universal Analytics tracker object not available');return false;}
$AA.log('$AA.collectors.UniversalAnalytics: tracker found');$AA.config.cookieDomain=tracker.get('cookieDomain');if($AA.data.track.k=='')
$AA.data.track.k=(!$AA.referrer.query.q)?'':$AA.referrer.query.q;$AA.data.track.uc=tracker.get('clientId').split('.')[0];$AA.data.track.sc=tracker.get('clientId').split('.')[1];if($AA.typeOf($AA.page.query.gclid)!='undefined'||$AA.typeOf($AA.page.query.gclsrc)!='undefined'){if(!$AA.options.medium)
$AA.data.track.m='cpc';if(!$AA.options.source)
$AA.data.track.s='google';}
$AA.data.track.cname='UA';$AA.data.collected=true;if(fnCallback&&$AA.typeOf(fnCallback)=='function'){$AA.log('$AA.collectors.UniversalAnalytics: calling {fnCallback}() function');fnCallback();}});return;},GoogleAnalytics:function(fnCallback){$AA.log('$AA.collectors.GoogleAnalytics: called ');if($AA.typeOf(this.scriptTries)=='undefined')
this.scriptTries=0;if(this.scriptTries>$AA.config.maxRetries){$AA.log('Google Analytics cookies not available');return false;}
$AA.log('$AA.collectors.GoogleAnalytics: try '+this.scriptTries+'/'+$AA.config.maxRetries);this.utmz=$AA.cookies.read('__utmz',true);if(this.utmz==''){this.scriptTries++;$AA.log('$AA.collectors.GoogleAnalytics: new try in '+$AA.config.retryInterval+'ms');setTimeout(function(){$AA.collectors.GoogleAnalytics(fnCallback);},$AA.config.retryInterval);return;}
this.utmz=this.utmz;this.utma=$AA.cookies.read('__utma',true);this.utmb=$AA.cookies.read('__utmb',true);this.utmc=$AA.cookies.read('__utmc',true);$AA.log({utmz:this.utmz,utma:this.utma,utmb:this.utmb,utmc:this.utmc})
var pairs=this.utmz.split('.').slice(4).join('.').split('|');var ga={};for(var i=0;i<pairs.length;i++){var temp=pairs[i].split('=');ga[temp[0]]=temp[1];}
$AA.config.cookieDomain=w.location.host;if($AA.data.track.k=='')
$AA.data.track.k=ga.utmctr||'';$AA.data.track.uc=this.utma.split('.')[1]||'';$AA.data.track.sc=this.utmz.split('.')[1]||'';if($AA.typeOf(ga.utmgclid)!='undefined'||$AA.typeOf($AA.page.query.gclid)!='undefined'||$AA.typeOf($AA.page.query.gclsrc)!='undefined'){if(!$AA.options.medium)
$AA.data.track.m='cpc';if(!$AA.options.source)
$AA.data.track.s='google';}
$AA.data.track.cname='GA';$AA.data.collected=true;if(fnCallback&&$AA.typeOf(fnCallback)=='function'){$AA.log('$AA.collectors.GoogleAnalytics: calling {fnCallback}() function');fnCallback();}
return;},Piwik:function(fnCallback){$AA.log('$AA.collectors.Piwik: called ');if($AA.typeOf(this.scriptTries)=='undefined')
this.scriptTries=0;if(this.scriptTries>$AA.config.maxRetries){$AA.log('Piwik not available');return false;}
$AA.log('$AA.collectors.Piwik: try '+this.scriptTries+'/'+$AA.config.maxRetries);if($AA.typeOf(w['Piwik'])=='undefined'||$AA.typeOf(Piwik)=='undefined'||$AA.typeOf(Piwik.getAsyncTracker)!='function'){this.scriptTries++;$AA.log('$AA.collectors.Piwik: new try in '+$AA.config.retryInterval+'ms');setTimeout(function(){$AA.collectors.Piwik(fnCallback);},$AA.config.retryInterval);return;}
var q=$AA.page.query||{};var pTracker=Piwik.getAsyncTracker();var pTracked=pTracker.getVisitorInfo();if($AA.typeOf(pTracker)=='undefined'||$AA.typeOf(pTracked)=='undefined'||$AA.typeOf(pTracked[1])=='undefined'||$AA.typeOf(pTracked[2])=='undefined'){this.scriptTries++;$AA.log('$AA.collectors.Piwik: new try in '+$AA.config.retryInterval+'ms');setTimeout(function(){$AA.collectors.Piwik(fnCallback);},$AA.config.retryInterval);return;}
$AA.config.cookieDomain=w.location.host;var t={};if($AA.data.track.k==''||!$AA.data.track.k)
$AA.data.track.k=pTracker.getAttributionCampaignKeyword()||'';$AA.data.track.uc=pTracked[1]||'';$AA.data.track.sc=pTracked[2]||'';if($AA.data.track.c==''||$AA.data.track.c)
$AA.data.track.c=pTracker.getAttributionCampaignName()||'';if((($AA.data.track.k&&$AA.data.track.k!='')||($AA.data.track.c&&$AA.data.track.c!=''))&&(!q.utm_medium||q.utm_medium=='')){if(!$AA.options.medium)
$AA.data.track.m='cpc';}
if($AA.typeOf($AA.page.query.gclid)!='undefined'||$AA.typeOf($AA.page.query.gclsrc)!='undefined'){if(!$AA.options.source)
$AA.data.track.s='google';if(!$AA.options.medium)
$AA.data.track.m='cpc';}
$AA.data.track.cname='PW';$AA.data.collected=true;if(fnCallback&&$AA.typeOf(fnCallback)=='function'){$AA.log('$AA.collectors.Piwik: calling {fnCallback}() function');fnCallback();}
return;},Sizmek:function(fnCallback)
{$AA.log('$AA.collectors.Sizmek: called ');if($AA.typeOf(this.scriptTries)=='undefined')
this.scriptTries=0;if(this.scriptTries>=$AA.config.maxRetries&&$AA.typeOf(w['SzmkScriptFin'])=='undefined'||w['SzmkScriptFin']==0){$AA.log('Sizmek not available');}else if($AA.typeOf(w['SzmkScriptFin'])=='undefined'||w['SzmkScriptFin']==0){this.scriptTries++;$AA.log('$AA.collectors.Sizmek: new try in '+$AA.config.retryInterval+'ms');setTimeout(function(){$AA.collectors.Sizmek(fnCallback);},$AA.config.retryInterval);return;}
this.scriptTries=0;return $AA.collectors.UniversalAnalytics(fnCallback);},};$AA.core={init:function(){$AA.log('$AA.collectors.init: called');var q=$AA.page.query||{},t={},se=false;$AA.config.cookieDomain=$AA.page.host;t.r=$AA.referrer.l;t.ci=$AA.options.clientId;t.tc=$AA.options.trackingCode;t.p=encodeURIComponent($AA.page.l);if($AA.referrer.host.match(/google\./)&&!$AA.referrer.host.match(/plus\./i)){t.s='google';se=true;}else if($AA.referrer.host.match(/yahoo\./)){t.s='yahoo';se=true;}else if($AA.referrer.host.match(/bing\./)){t.s='bing';se=true;}else if($AA.referrer.host.match(/facebook\./)){t.s='facebook';}else if($AA.referrer.host.match(/linkedin\./)){t.s='linkedin';}else if($AA.referrer.host.match(/twitter\./)){t.s='twitter';}else if($AA.referrer.host.match(/google\./i)&&$AA.referrer.host.match(/plus\./i)){t.s='googleplus';}else if($AA.referrer.host!=''&&$AA.referrer.host.toLowerCase()!=$AA.page.host.toLowerCase()){t.s=$AA.referrer.host;}else{t.s='direct';}
if(se==true){t.m='organic';}else if($AA.referrer.host!=''&&$AA.referrer.host.toLowerCase()!=$AA.page.host.toLowerCase()){t.m='referral';}else{t.m='none';}
if($AA.options.medium&&$AA.options.medium!='')
t.m=$AA.options.medium;else if(q.utm_medium&&q.utm_medium!='')
t.m=q.utm_medium;if($AA.options.source&&$AA.options.source!='')
t.s=$AA.options.source;else if(q.utm_source&&q.utm_source!='')
t.s=q.utm_source;if($AA.options.keyword&&$AA.options.keyword!='')
t.k=$AA.options.keyword;else if(q.keyword&&q.keyword!='')
t.k=q.keyword;else if(q.utm_term&&q.utm_term!='')
t.k=q.utm_term;if($AA.options.content&&$AA.options.content!='')
t.cc=$AA.options.content;else if(q.utm_content&&q.utm_content!='')
t.cc=q.utm_content;if($AA.options.campaign&&$AA.options.campaign!='')
t.c=$AA.options.campaign;else if(q.utm_campaign&&q.utm_campaign!='')
t.c=q.utm_campaign;if($AA.typeOf(t.tc)=='array')t.tc=t.tc.join();t.d='*';if(w.device){var device=w.device;if(device.tablet()){t.d='TAB';}else if(device.mobile()){t.d='MOB';}else if(/^MSIE [6-9]/.test($AA.data.browser)){t.d='OLD';}
$AA.log(device);}
$AA.merge(t,$AA.data.track,true);return true;},findElements:function(className){if($AA.typeOf(d.getElementsByClassName)=='function')
return d.getElementsByClassName(className);var hasClassName=new RegExp("(?:^|\\s)"+className+"(?:$|\\s)");var allElements=d.getElementsByTagName("*");var results=[];var element;for(var i=0;(element=allElements[i])!=null;i++){var elementClass=element.className;if(elementClass&&elementClass.indexOf(className)!=-1&&hasClassName.test(elementClass))
results.push(element);}
return results;},replace:function(t,c,cB,cC,s,l)
{$AA.log('$AA.collectors.replace: called');if($AA.typeOf(s)=='undefined'&&$AA.typeOf(l)=='undefined'){s=cB;l=cC;cB=false;cC=false;}
var cn=((s==true)?$AA.config.className:$AA.config.className+'-'+t);$AA.log('Replacing "'+cn+'" with : '+escape(c));var el=$AA.core.findElements(cn);for(var kk in el){try{el[kk].innerHTML=c;}catch(e){$AA.log({error:e,element:el[kk]});}}
var cn=((s==true)?$AA.config.className+'-A':$AA.config.className+'-A-'+t);$AA.log('Replacing "'+cn+'" with : '+escape(c));var el=$AA.core.findElements(cn);for(var kk in el){try{el[kk].innerHTML=c;}catch(e){$AA.log({error:e,element:el[kk]});}}
if(cB){cn=((s==true)?$AA.config.className+'-B':$AA.config.className+'-B-'+t);$AA.log('Replacing "'+cn+'" with : '+escape(cB));el=$AA.core.findElements(cn);for(var kk in el){try{el[kk].innerHTML=cB;}catch(e){$AA.log({error:e,element:el[kk]});}}}
if(cC){cn=((s==true)?$AA.config.className+'-C':$AA.config.className+'-C-'+t);$AA.log('Replacing "'+cn+'" with : '+escape(cC));el=$AA.core.findElements(cn);for(var kk in el){try{el[kk].innerHTML=cC;}catch(e){$AA.log({error:e,element:el[kk]});}}}
if(!$AA.data.keepalive[t]&&c!=''&&c!='IGNORE')
$AA.data.keepalive[t]=l;},keepAlive:function()
{$AA.log('$AA.collectors.keepAlive: called');if($AA.data.keepalive!={}&&$AA.config.maxKeepAlive>0){var params=[];for(var tc in $AA.data.keepalive){if($AA.typeOf(tc)=='number'||$AA.typeOf(tc)=='string'){params.push('tc['+encodeURIComponent(tc)+']='+encodeURIComponent($AA.data.keepalive[tc]))}}
if(params.length){params.push('ci='+$AA.options.clientId);if(params.length){params=params.join('&');var kaUrl=$AA.options.keepaliveUrl+'?'+params;$AA.utilities.sendlog(kaUrl);$AA.config.maxKeepAlive--;}}}}};$AA.plugins={optimizely:function(){$AA.log('$AA.plugins.optimizely: called');var _optz=w['optimizely'],payload=[];if($AA.typeOf(_optz)=='undefined')
return payload;if(typeof _optz.getAccountId!='function')
return payload;if(typeof _optz.getProjectId!='function')
return payload;var _optz_visitorId=$AA.cookies.read('optimizelyEndUserId',false);if(_optz_visitorId==null||_optz_visitorId==''||_optz_visitorId==false){return payload;}
var _optz_experiments=$AA.cookies.read('optimizelyBuckets',false);if(_optz_experiments==null||_optz_experiments==''||_optz_experiments==false||_optz_experiments=='%7B%7D'||_optz_experiments=='{}'){return payload;}
var _optz_segments=$AA.cookies.read('optimizelySegments',false);if(_optz_segments==null||_optz_segments==''||_optz_segments==false||_optz_segments=='%7B%7D'||_optz_segments=='{}'){_optz_segments=null;}
payload.push('optz[a]='+encodeURIComponent(_optz.getAccountId()));payload.push('optz[p]='+encodeURIComponent(_optz.getProjectId()));payload.push('optz[u]='+encodeURIComponent(_optz_visitorId));payload.push('optz[x]='+encodeURIComponent(_optz_experiments));if(_optz_segments)
payload.push('optz[s]='+encodeURIComponent(_optz_segments));return payload;},datalicious:function(){$AA.log('$AA.plugins.datalicious: called');var options=$AA.options,payload=[];if($AA.typeOf(options.dtl)=='undefined'||$AA.typeOf(options.dtl['pic.s1'])=='undefined')
return payload;payload.push('dtl[pics1]='+encodeURIComponent(options['dtl']['pic.s1']));return payload;},piwik:function(){$AA.log('$AA.plugins.piwik: called');var payload=[];if($AA.typeOf(w['Piwik'])=='undefined'||$AA.typeOf(Piwik.getAsyncTracker)!='function'||$AA.typeOf(Piwik.getAsyncTracker().getVisitorInfo)!='function')
return payload;var info=Piwik.getAsyncTracker().getVisitorInfo();if($AA.typeOf(info[0])!='undefined')
payload.push('pwk[new_visit]='+encodeURIComponent(info[0]));if($AA.typeOf(info[1])!='undefined')
payload.push('pwk[cid]='+encodeURIComponent(info[1]));if($AA.typeOf(info[2])!='undefined')
payload.push('pwk[ctime]='+encodeURIComponent(info[2]));if($AA.typeOf(info[3])!='undefined')
payload.push('pwk[visits]='+encodeURIComponent(info[3]));if($AA.typeOf(info[4])!='undefined')
payload.push('pwk[curr_ts]='+encodeURIComponent(info[4]));if($AA.typeOf(info[5])!='undefined')
payload.push('pwk[prev_ts]='+encodeURIComponent(info[5]));if($AA.typeOf(info[6])!='undefined')
payload.push('pwk[prev_ec_ts]='+encodeURIComponent(info[5]));return payload;},sizmek:function(){$AA.log('$AA.plugins.sizmek: called');var payload=[];if($AA.typeOf(w['SzmkUserID'])=='undefined'||$AA.typeOf(w['SzmkConvID'])=='undefined'||$AA.typeOf(w['SzmkScriptFin'])=='undefined')
return payload;if(w['SzmkScriptFin']==0||w['SzmkScriptFin']==''||w['SzmkUserID']==''||w['SzmkConvID']=='')
return payload;payload['szmk[uid]']=w['SzmkUserID'];payload['szmk[cid]']=w['SzmkConvID'];return payload;},};$AA.push=function()
{$AA.log('$AA.push: called');var t=$AA.data.track,payload=[],pushUrl=$AA.options.trackUrl;if($AA.utilities.inArray('paid',$AA.options.mediums)){if(!$AA.utilities.inArray('cpc',$AA.options.mediums))
$AA.options.mediums.push('cpc');if(!$AA.utilities.inArray('ppc',$AA.options.mediums))
$AA.options.mediums.push('ppc');}
if(!$AA.utilities.inArray('*',$AA.options.mediums)&&!$AA.utilities.inArray(t.m.toLowerCase(),$AA.options.mediums.join(';').toLowerCase().split(';'))){$AA.log('Interrupt. No configuration for medium '+t.m);return false;}
for(var key in t){if($AA.typeOf(t[key])=='number'||$AA.typeOf(t[key])=='string'){payload.push(key+'='+encodeURIComponent(t[key]));}}
for(var p in $AA.plugins){if($AA.typeOf($AA.plugins[p])=='function'){payload=payload.concat($AA.plugins[p](payload));}}
payload.push('collector='+encodeURIComponent($AA.options.collector));pushUrl=pushUrl+'?'+payload.join('&');$AA.log({track:t,url:pushUrl});$AA.utilities.include('AVANSERtrack',pushUrl);if(!$AA.config.hasCookie){var c_name=$AA.options.cookieName+$AA.data.track.uc+$AA.data.track.sc;var c_value=$AA.utilities.toQuerystring($AA.data.track);$AA.log('$AA.push: writing cookie "'+c_name+'"');$AA.cookies.write(c_name,c_value);}
if($AA.data.timer==null){$AA.log('$AA.push: Creating keepAlive timer');$AA.data.timer=setInterval($AA.core.keepAlive,$AA.config.keepAlive)}};$AA.switchMedium=function()
{$AA.log('$AA.switchMedium: called');var ENABLECPC=false;var ENABLEORGANIC=false;var ENABLEREFERRAL=false;var ENABLEDIRECT=false;switch($AA.track.m)
{case'paid':case'ppc':case'cpc':ENABLECPC=true;break;case'organic':ENABLEORGANIC=true;break;case'referral':ENABLEREFERRAL=true;break;default:ENABLEDIRECT=true;break;}
var _cpcList=AvanserAnalytics._document.getElementsByClassName('avanser-cpc');var _organicList=AvanserAnalytics._document.getElementsByClassName('avanser-organic');var _directList=AvanserAnalytics._document.getElementsByClassName('avanser-direct');var _referralList=AvanserAnalytics._document.getElementsByClassName('avanser-referral');for(i=0;i<_cpcList.length;i++)
_cpcList[i].style.display=ENABLECPC?'block':'none';for(i=0;i<_organicList.length;i++)
_organicList[i].style.display=ENABLEORGANIC?'block':'none';for(i=0;i<_directList.length;i++)
_directList[i].style.display=ENABLEDIRECT?'block':'none';for(i=0;i<_referralList.length;i++)
_referralList[i].style.display=ENABLEREFERRAL?'block':'none';return $AA.track.m;};$AA.track=function(options,force){$AA.log('$AA.track: called');$AA.config.hasCookie=false;if($AA.typeOf($AA.collectors[$AA.options.collector])=='undefined'){$AA.log('Selected collector does not exists');return;}
if($AA.typeOf(options)=='function'){options=options();}
if($AA.typeOf(options)!='undefined'&&$AA.typeOf(options)=='object')
$AA.options=$AA.merge(options,$AA.options,force);if($AA.options.autostart==true||$AA.typeOf(force)!='undefined'){$AA.core.init();$AA.collectors[$AA.options.collector](function(){$AA.log('$AA.track: Callback function called');var c_name=$AA.options.cookieName+$AA.data.track.uc+$AA.data.track.sc;var c_value=$AA.cookies.read(c_name);if(c_value!=''){$AA.config.hasCookie=true;$AA.data.track=$AA.utilities.querystring('?'+c_value);$AA.data.track.p=encodeURIComponent($AA.page.l);$AA.data.track.ci=$AA.options.clientId;$AA.data.track.tc=$AA.options.trackingCode;$AA.data.track.tc=$AA.options.trackingCode;if($AA.typeOf($AA.data.track.tc)=='array')
$AA.data.track.tc=$AA.data.track.tc.join();}
$AA.push();});}
return;};w['$AA']=$AA.merge(w['$AA']||{},$AA);$AA.track();w['AvanserReplaceCallback']=w['AvanserCore']=function(tc,fn){$AA.options.trackingCode=tc;$AA.track(null,true);if($AA.typeOf(fn)=='function'){$AA.core.replaceFnTmp=$AA.core.replace;$AA.core.replace=function(t,c,cB,cC,s,l){$AA.core.replaceFnTmp(t,c,cB,cC,s,l);fn();$AA.core.replace=$AA.core.replaceFnTmp;}}};w['AV_chooseNumbers']=w['AvanserChooseCampaign']=function(){if($AA.data.collected==true){return $AA.switchMedium();}
return false;};w['__AUA']=function(a,t,h,s,i){if(a)delete a;return $AA.core.replace(t,h,s,i);};if($AA.typeOf(w['AvanserReplaceReady'])=='function'){$AA.core.replaceFn=$AA.core.replace;$AA.core.replace=function(t,c,cB,cC,s,l){w['AvanserDoReplace']=function(){$AA.core.replaceFn(t,c,cB,cC,s,l);};w['AvanserReplaceReady']();};}})(window,document);