AFter maven script run
=======================
command:
========    
    G:\workspace\AEM\webapi>mvn  clean install -PautoInstallPackage

    --
    [INFO] Installing G:\workspace\AEM\webapi\dependencies\target\dependencies-0.0.1
    -SNAPSHOT.jar to C:\Users\HOME\.m2\repository\com\web\api\dependencies\0.0.1-SNA
    PSHOT\dependencies-0.0.1-SNAPSHOT.jar

    Reactor Summary:

    webapi ............................................. SUCCESS [ 24.184 s]
    webapi - Core ...................................... SUCCESS [ 13.731 s]
    webapi - UI apps ................................... SUCCESS [  3.843 s]
    dependencies ....................................... SUCCESS [  1.875 s]
    ------------------------------------------------------------------------
    BUILD SUCCESS

check whether jar files are installed.

    1)got to http://localhost:4502/crx/packmgr/index.jsp

    it should show webapi.ui.apps-0.0.1-SNAPSHOT.zip installed !!! sucessfully.

    2) go to bundles http://localhost:4502/system/console/bundles
    check whether core jar webapi.core-0.0.1-SNAPSHOT.jar is installed  
    3)go to apps http://localhost:4502/crx/de/index.jsp#/apps/webApi/templates/webApiTemplate  
    i.e /apps/webApi/templates/webApiTemplate  and then in jcr:content make sure allowed path /conent/(*/)?
    is set.
    
iMPORTANT:
==========
    3)WHEN creating the page through siteadmin page http://localhost:4502/siteadmin# when try to select
    the template in site admin , created page in /apps folder comes only when attribute
    in crxde path apps/webApi/templates/webApiTemplate has "allowedpaths" with some context path like /content/WebApi or
     /content/webApi(/.*)? or /content(/.*)?
