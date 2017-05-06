AEM deployment:
================
Aem requires below project type deployment as module.

1)core module to be deployed as jar declared in pom.xml as < packaging> bundle < packaging >.

2)ui module(ui.apps) -deployed as zip and 

3)content Module(ui.content) to be deployed as zip file and
whole project should be run as single pom.xml.
web api pom.xml is declared as < packaging> pom </ packaging >  pom type packaging in maven.

The parent webapi project has embedded with 3 modules core,ui,content.


[INFO] Embedding --- Embedded: groupId=org.test.TestWeb,artifactId=scimApi.core,
filter=false,excludeTransitive=false,target=/apps/apps/install/ ---

[INFO] Embedding org.test.core:jar:0.0.1-SNAPSHOT (from C:\ARUN
\workspace\TestWeb\webApi\core\target\webapi.core-0.0.1-SNAPSHOT.jar) -> jc
r_root/apps/apps/install/webapi.core-0.0.1-SNAPSHOT.jar

[INFO] Installing org/test/scim/scimApi.core/0.0.1-SNAPSHOT/scimApi.core-0.0
.1-SNAPSHOT.jar

[INFO] Writing OBR metadata

[INFO] Installing C:\ARUN\workspace\TestWeb\webApi\ui.apps\target\scimApi.ui
.apps-0.0.1-SNAPSHOT.zip to C:\Users\arunkumar_sadhasivam\.m2\repository\org\test\scim\webapi.ui.apps\0.0.1-SNAPSHOT\webapi.ui.apps-0.0.1-SNAPSHOT.zip

NOTE:
=====

core - bundle as jar since in pom.xml given < packaging > bundle </ packaging> type as bundle.

ui- bundle as zip file since in pom.xml given < packaging > content-package </ packaging>  content-package type to bundle as zip file.

final log
==========

[INFO] Reactor Summary:

[INFO]

[INFO] webapi ............................................ SUCCESS [  0.388 s]

[INFO] web - Core ........................................ SUCCESS [  3.348 s]

[INFO] web - UI apps ..................................... SUCCESS [  0.888 s]

[INFO] ------------------------------------------------------------------------

[INFO] BUILD SUCCESS
