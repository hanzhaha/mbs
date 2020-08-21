<#macro htmlMeta>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=10, user-scalable=yes">
</#macro>
<#macro htmlCss cssLibraries=[] csses=[]>
	<link rel="stylesheet" href="/webjars/bootstrap/4.3.1/css/bootstrap.css">
	<#list cssLibraries as library>
		<link rel="stylesheet" type="text/css" href="${library}">
	</#list>
	<#list csses as css>
		<link rel="stylesheet" type="text/css" href="/static/css/${css}.css">
	</#list>
</#macro>
<#macro htmlScript scriptLibraries=[] scripts=[]>
	<script src="/webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	<script src="/webjars/jquery/3.0.0/jquery.min.js"></script>
	<#list scriptLibraries as library>
		<script type="text/javascript" src="${library}"></script>
	</#list>
	<#list scripts as script>
		<script type="text/javascript" src="/static/js/${script}.js"></script>
	</#list>
	
</#macro>
<#macro htmlhead title="" cssLibraries=[] csses=[] scriptLibraries=[] scripts=[]>
<!DOCTYPE html>
<html>
<head>
	<@htmlMeta />
	<title>${title?html}</title>
	<@htmlCss cssLibraries=cssLibraries csses=csses/>
</head>
</#macro>
<#macro htmlbody scriptLibraries=[] scripts=[]>
<body>
	<@htmlScript scriptLibraries=scriptLibraries scripts=scripts/>
	<#nested>
</body>
</html>
</#macro>