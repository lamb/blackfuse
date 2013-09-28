<!DOCTYPE html>
<html>
<head>
<#include "head.ftl">
</head>
<body>
    <div id="wrap">
	  <#include "navbar.ftl">
      <!-- Begin page content -->
      <div class="container">
        <div class="page-header">
          <h1>出错啦...</h1>
        </div>
		<p>
		</p>
		<pre>
		    <code>
${exception}
<#list exception.stackTrace as trace >
  at ${trace}
</#list>
		    </code>
		</pre>
      </div>

      <div id="push"></div>
    </div>
	<#include "footer.ftl">
	<#include "js.ftl">
</body>
</html>