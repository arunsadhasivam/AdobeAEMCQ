
Structure with in repository:
==============================
You must not change anything in the libs/ path. For configuration and other changes
copy the item in libs/ to apps/ and make any changes within apps/.

/apps
======
Application related; includes component definitions specific to your website.

/content
==========
Content created for your website.

/etc
====
Initialization and configuration information.

/home
=====
User and Group information.

/libs
=====
Libraries and definitions that belong to the core of CQ WCM.
/tmp
=====
Temporary working area.

/var
====
Files that change and are updated by the system; such as audit logs, statistics, event-handling.

Configuring CQDE:
=================
If the location of your installation is different from above (for example, another host, port or context
path) you also need to update the CRX server endpoint. This is the location where CQDE can find
the CRX WebDAV server. This can be done in the configuration section of the CQDE servlet which
is available on the Felix Management Console (http://localhost:4502/system/console/
configMgr ).
When CQDE is started, it sends information about the users environment to CQ5; including
version, OS and a profile ID. CQ5 stores this information under /etc/cqde/profiles, where
each profile must have its own folder. The standard profile is default. The profile folder contains
XSLT templates for generating CQDE project and classpath files, as well as additional settings.




