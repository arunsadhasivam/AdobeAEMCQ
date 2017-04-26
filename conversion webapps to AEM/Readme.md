STEP 1:
=======

go to > 

    webapi.ui.apps
      -src
        -main
          -content
               -jcr_root
                    -apps
                       -webapi (root)
                           -components (
                                -page
                                    -jsps( from springmvc webapps)
                                -content
                            -install
                            -templates

                - META-INF   
                  -vault
                    ->filter.xml
                  
      -pom.xml
  
  
  jcr_root and META-INF are in same hierarchy
                  
STEP 2:
=======

go to \ui.apps\src\main\content\jcr_root\apps\webApi\templates\webApiTemplate\.content.xml

    <?xml version="1.0" encoding="UTF-8"?>
    <jcr:root xmlns:sling="http://sling.apache.org/jcr/sling/1.0" 
    xmlns:cq="http://www.day.com/jcr/cq/1.0" xmlns:jcr="http://www.jcp.org/jcr/1.0"
        jcr:description="api"
        jcr:primaryType="cq:Template"
        jcr:title="api"
        allowedPaths="[/content(/.*)?]"
        ranking="{Long}1">
        <jcr:content
            jcr:primaryType="cq:PageContent"
            sling:resourceType="/webApi/components/page/jsps"/>
    </jcr:root>

NOTE:
====
changed from /webApi/components/page/webapi to   /webApi/components/page/jsps make sure we run from spring mvc main.jsp

Add /etc folder to filter.xml to checkout the files to workspace.


    <?xml version="1.0" encoding="UTF-8"?>
    <workspaceFilter version="1.0">
        <filter root="/apps/webApi">
            <exclude pattern="/apps/apps/install" />
        </filter>
        <filter root="/apps/webApi" />
        <filter root="/etc/clientlibs/webapi" />
    </workspaceFilter>
    
STEP 3:
=======
Check out the files to get folder structure to checkin the actual js , css from eclipse:


     G:\workspace\AEM\webapi\ui.apps\src\main\content\jcr_root>vlt co --force http://
    localhost:4502/crx
    Java HotSpot(TM) 64-Bit Server VM warning: ignoring option PermSize=128m; suppor
    t was removed in 8.0
    Checkout http://localhost:4502/crx/server/-/jcr:root/ with local files using roo
    t at G:\workspace\AEM\webapi\ui.apps\src\main\content\jcr_root
    Connecting via JCR remoting to http://localhost:4502/crx/server
    Checking out / to .
    A etc
    A etc\.content.xml (text/xml)
    A etc\clientlibs
    A etc\clientlibs\.content.xml (text/xml)
    A etc\clientlibs\webapi
    A etc\clientlibs\webapi\css
    A etc\clientlibs\webapi\js
    Checkout done.

 


STEP 4:
=======
right click js,css in the eclipse and select AEM server > export to server by starting the AEM server.
Important:
==========
only if aem server is started then only it allows to publish to Aem server.

G:\workspace\AEM\webapi\ui.apps\src\main\content\jcr_root\etc\clientlibs\webapi\css

G:\workspace\AEM\webapi\ui.apps\src\main\content\jcr_root\etc\clientlibs\webapi\js 

STEP 5:
=======
1)create a folder in crxde /etc/clientlibs/webapps/css, /etc/clientlibs/webapps/js.

2)copy js and css from our spring mvc projects to appropriate folder in eclipse AEM project
  and export to server from eclipse.
3) check whether it is there in http://localhost:4502/crx/de/index.jsp#/etc/clientlibs/webapi/js
http://localhost:4502/crx/de/index.jsp#/etc/clientlibs/webapi/css



STEP 6:
========
check mappings.

flow1 :
=======

content - which is automatically when create a project and assign template from http://localhost:4502/siteadmin

http://localhost:4502/crx/de/index.jsp#/content/WebAPI/api/jcr:content
properties:
===========

cq:template-/apps/webApi/templates/webApiTemplate
sling:resourceType- /apps/webApi/components/page/main.jsp

flow2:
=====

apps- actual web application which we migrate from spring webapps to aem server:
http://localhost:4502/crx/de/index.jsp#/apps/webApi/templates/webApiTemplate
properties:
----------
allowedPaths - /content(/.*)?


http://localhost:4502/crx/de/index.jsp#/apps/webApi/templates/webApiTemplate/jcr:content

properties:
-----------

sling:resourceType - /webApi/components/page/jsps


Step 6:
======
change jsp to point to /etc/clientlib/js, /etc/client/css, /apps/webApi/components/page/layouts for header templates.

        <html>
            <head>
            <link rel="stylesheet" type="text/css"
                href="<%=request.getContextPath()%>/css/style.css" />       
            </head> 


            <script type="text/javascript" src="<%=request.getContextPath()%>/js/ajax.js"></script>
            <script> 
            function onload(){
                var message = document.getElementById('message').value;
                 if(message!=null && message!=''){
                     render(1);
                       document.getElementById('divMessage').innerHTML=message;
                 }else{
                     render(1);
                 } 
            }

            </script> 
            <body  onload="onload()">
            <!-- if this form is there when submit multipart form also this main form gets submitted and go to upload page again it wont go to servlet
               <form name='frmMain'  id='frmMain' method="POST">-->   
            <table  class="mainHeader" >
                    <tr>
                        <td colspan="2" valign="top"><jsp:include
                                page="/layouts/header.jsp"></jsp:include></td>
                    </tr>

                    <tr>
                      <td colspan="2" valign="top">Welcome ADMIN!!!</td>
                    </tr>

                    <tr>
                        <td valign="top">
                            <table class="mainHeader">
                                <tr>
                                    <td width="20%" id="leftPanel" valign="top" class="leftpanel">
                                         <jsp:include page="/jsps/leftpanel.jsp"></jsp:include>
                                         
                                         
  changed to below ways:
  ======================
  
  
      <html>
        <head>
        <link rel="stylesheet" type="text/css"
            href="/etc/clientlibs/webapi/css/style.css" />       
        </head> 
        <script type="text/javascript" src="/etc/clientlibs/webapi/js/ajax.js"></script>
        <script> 
        function onload(){
            var message = document.getElementById('message').value;
             if(message!=null && message!=''){
                 render(1);
                   document.getElementById('divMessage').innerHTML=message;
             }else{
                 render(1);
             } 
        }

        </script> 



        <body  onload="onload()">
        <!-- if this form is there when submit multipart form also this main form gets submitted 
        and go to upload page again it wont go to servlet
           <form name='frmMain'  id='frmMain' method="POST">-->   
        <table  class="mainHeader" >
                <tr>
                    <td colspan="2" valign="top">
            <cq:include script="/apps/webApi/components/page/layouts/header.jsp"/>
                        <jsp:include
                            page="/apps/webApi/components/page/layouts/header.jsp"></jsp:include></td>
                </tr>

                <tr>
                  <td colspan="2" valign="top">Welcome ADMIN!!!</td>
                </tr>

                                <td width="20%" id="leftPanel" valign="top" class="leftpanel">
            <cq:include script="/apps/webApi/components/page/jsps/leftpanel.jsp"/>

                                     <jsp:include page="/apps/webApi/components/page/jsps/leftpanel.jsp"></jsp:include> 

