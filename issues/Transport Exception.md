
ISSUE:
======
Failed exporting: JcrResult[ success:false, exception: org.apache.sling.ide.transport.RepositoryException - 
 javax.jcr.InvalidItemStateException: /etc/clientlibs/webapi/css/defaultTheme.css/jcr:content]

Reason:
======
if any folder mapping between eclipse and actual repository changes need to run the sync vlt to make in sync

e.g
i changed the folder name from webapi to webApi to maintain uniformity. i changed manually in crx
and changed the below filter.xml and ui.apps/src/main/content/jcr_root/ etc/clientlibs/webApi (instead of old webapi).

Also i changed the same in filter.xml but once changed filter.xml need to run the vlt script.

     <workspaceFilter version="1.0">
        <filter root="/apps/webApi">
            <exclude pattern="/apps/apps/install" />
        </filter>
        <filter root="/apps/webApi" />
        <filter root="/etc/clientlibs/webApi" />
    </workspaceFilter>

path changed:
=============
G:\AEM\webapi\ui.apps\src\main\content\jcr_root\etc\clientlibs\webApi

Actual exception:
=================
see below  /etc/clientlibs/webApi from webapi change only showing exception
  
     Failed publishing path=/etc/clientlibs/webApi/js/ajax.js, result=JcrResult[ success:false, 
    exception: org.apache.sling.ide.transport.RepositoryException - javax.jcr.InvalidItemStateException:
    /etc/clientlibs/webapi/js/ajax.js/jcr:content]


    G:\workspace\AEM\webapi\jcr_root>vlt --credentials admin:admin co --force http:/
    /localhost:4502/crx
    Java HotSpot(TM) 64-Bit Server VM warning: ignoring option PermSize=128m; suppor
    t was removed in 8.0
    Checkout http://localhost:4502/crx/server/-/jcr:root/ with local files using roo
    t at G:\workspace\AEM\webapi\jcr_root
    Connecting via JCR remoting to http://localhost:4502/crx/server
    [WARN ] Credentials for http://localhost:4502/crx/server/-/jcr:root/ updated in
    C:\Users\HOME\.vault\auth.xml.
    Checking out / to .

TO DEBUG
========
to debug below exception even after running above vlt sync command if below issue persist.


    Failed publishing path=/etc/clientlibs/webApi/js/ajax.js, result=JcrResult[ success:false, 
    exception: org.apache.sling.ide.transport.RepositoryException - javax.jcr.InvalidItemStateException:
    /etc/clientlibs/webapi/js/ajax.js/jcr:content]


STEP 1:
=======
goto .vlt between /etc/clientlibs/webApi if timestamp if still point old one it causes issue.
e.g:below vlt file has old entry
\AEM\webapi\ui.apps\src\main\content\jcr_root\etc\clientlibs\webApi\js\.vlt

    <entries path="/etc/clientlibs/webapi/js">
      <entry name="ajax.js" rp="" ap="/etc/clientlibs/webapi/js/ajax.js">
        <base date="2017-04-29T13:46:08.000-07:00" md5="98424aee65e14e431fa5ce16dd4aedf2" contentType="application/javascript" size="2827"/>
        <work date="2017-04-29T13:46:08.000-07:00" md5="98424aee65e14e431fa5ce16dd4aedf2" contentType="application/javascript" size="2827"/>
      </entry>
    </entries>
    
SOLUTION: 
=========
Delete whole folder and checkout latest from crxde , so it automatically creates latest .vlt file and it works!!!!
