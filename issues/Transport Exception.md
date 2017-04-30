
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

G:\workspace\AEM\webapi\ui.apps\src\main\content\jcr_root\etc\clientlibs\webApi
