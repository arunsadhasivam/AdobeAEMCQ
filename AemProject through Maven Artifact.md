Generate Aem project through Mvn script rather than sling Eclipse Plugin:
==========================================================================

C:\Workspace\AEM>mvn org.apache.maven.plugins:maven-archetype-plugin:2.4:generat
e -DarchetypeGroupId=com.adobe.granite.archetypes  -DarchetypeArtifactId=aem-pro
ject-archetype -DarchetypeVersion=10 -DarchetypeCatalog=https://repo.adobe.com/n
exus/content/groups/public/


[INFO] Scanning for projects...

[INFO]

[INFO] ------------------------------------------------------------------------

[INFO] Building Maven Stub Project (No POM) 1

[INFO] ------------------------------------------------------------------------

[INFO]

[INFO] >>> maven-archetype-plugin:2.4:generate (default-cli) > generate-sources
@ standalone-pom >>>

[INFO]

[INFO] <<< maven-archetype-plugin:2.4:generate (default-cli) < generate-sources
@ standalone-pom <<<

[INFO]

[INFO] --- maven-archetype-plugin:2.4:generate (default-cli) @ standalone-pom --
-

[INFO] Generating project in Interactive mode

[INFO] Archetype repository not defined. Using the one from [com.adobe.granite.a
rchetypes:aem-project-archetype:8 -> https://repo.adobe.com/nexus/content/groups
/public] found in catalog https://repo.adobe.com/nexus/content/groups/public/

Define value for property 'groupId': : com.test

Define value for property 'artifactId': : aem

Define value for property 'version':  1.0-SNAPSHOT: :

Define value for property 'package':  com.test: :

Define value for property 'appsFolderName': :

Define value for property 'artifactName': :

Define value for property 'componentGroupName': :

Define value for property 'contentFolderName': :

Define value for property 'cssId': :

Define value for property 'packageGroup': :

Define value for property 'siteName': :
[WARNING] Archetype is not fully configured

[INFO] Using property: groupId = com.test

[INFO] Using property: artifactId = aem

[INFO] Using property: version = 1.0-SNAPSHOT

[INFO] Using property: package = com.test

Define value for property 'appsFolderName': :

Define value for property 'artifactName': :

Define value for property 'componentGroupName': :

Define value for property 'contentFolderName': : content

Define value for property 'cssId': : css

Define value for property 'packageGroup': : package

Define value for property 'siteName': : site

[WARNING] Archetype is not fully configured

[INFO] Using property: groupId = com.test

[INFO] Using property: artifactId = aem

[INFO] Using property: version = 1.0-SNAPSHOT

[INFO] Using property: package = com.test

Define value for property 'appsFolderName': : apps

Define value for property 'artifactName': : aem1

Define value for property 'componentGroupName': : components

[INFO] Using property: contentFolderName = content

[INFO] Using property: cssId = css

[INFO] Using property: packageGroup = package

[INFO] Using property: siteName = site

Confirm properties configuration:

groupId: com.test

artifactId: aem

version: 1.0-SNAPSHOT

package: com.test

appsFolderName: apps

artifactName: aem1

componentGroupName: components

contentFolderName: content

cssId: css

packageGroup: package

siteName: site

Y: : Y
[INFO] -------------------------------------------------------------------------
---
[INFO] Using following parameters for creating project from Archetype: aem-proje
ct-archetype:10
[INFO] -------------------------------------------------------------------------
---
[INFO] Parameter: groupId, Value: com.test

[INFO] Parameter: artifactId, Value: aem

[INFO] Parameter: version, Value: 1.0-SNAPSHOT

[INFO] Parameter: package, Value: com.test

[INFO] Parameter: packageInPathFormat, Value: com/test

[INFO] Parameter: artifactName, Value: aem1

[INFO] Parameter: componentGroupName, Value: components

[INFO] Parameter: groupId, Value: com.test

[INFO] Parameter: contentFolderName, Value: content

[INFO] Parameter: siteName, Value: site

[INFO] Parameter: appsFolderName, Value: apps

[INFO] Parameter: version, Value: 1.0-SNAPSHOT

[INFO] Parameter: cssId, Value: css

[INFO] Parameter: package, Value: com.test

[INFO] Parameter: packageGroup, Value: package

[INFO] Parameter: artifactId, Value: aem

[INFO] Parent element not overwritten in C:\Workspace\AEM\aem\core\pom.xml

[INFO] Parent element not overwritten in C:\Workspace\AEM\aem\ui.apps\pom.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\colctrl\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\colctrl\clientlib\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\colctrl\clientlib\css.txt

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\colctrl\clientlib\style.css

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\helloworld\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\helloworld\_cq_dialog\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\helloworld\dialog.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\helloworld\helloworld.html

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\image\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\image\_cq_editConfig.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\text\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\textimage\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\textimage\clientlib\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\textimage\clientlib\css.txt

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\textimage\clientlib\style.css

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\components\content\title\.content.xml
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\logo\.content.xml
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\page\.content.xml
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\page\clientlib\.content.xml
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\page\clientlib\css.txt
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\page\clientlib\style.css
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\page\page.html
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\page\partials\footlibs.html
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\page\partials\head.html
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\page\partials\head.js
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\page\partials\headlibs.html
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\page\partials\main.html
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\page\partials\main.js
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\topnav\.content.xml
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\topnav\clientlib\.content.xml
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\topnav\clientlib\css.txt
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\topnav\clientlib\style.css
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\topnav\topnav.html
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\components\structure\topnav\topnav.js
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j

cr_root\apps\apps\config.author\com.day.cq.wcm.mobile.core.impl.MobileEmulatorPr
ovider-apps.xml
[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\config\org.apache.sling.commons.log.LogManager.factory.config-
apps.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\i18n\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\i18n\fr.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\templates\page-content\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\templates\page-home\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\tests\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\tests\SampleTests.js

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\apps\tests\js.txt

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\sling\servlet\errorhandler\404.html

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\apps\sling\servlet\errorhandler\ResponseStatus.java

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\_jcr_content\page\logo\image

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\_jcr_content\page\logo\image.dir\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\clientlib-all\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\clientlib-all\README.md

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\clientlib-all\css.txt

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\clientlib-all\js.txt

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\clientlib-site\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\clientlib-site\README.md

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\clientlib-site\css.txt

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\clientlib-site\js.txt

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\clientlib-site\script.js

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\clientlib-site\style.css

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.apps\src\main\content\j
cr_root\etc\designs\apps\favicon.ico
[INFO] Parent element not overwritten in C:\Workspace\AEM\aem\ui.content\pom.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\content\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\content\_jcr_content\image\file

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\content\_jcr_content\image\file.dir\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\content\_jcr_content\image\file.dir\_jcr_content\_dam_thumbna
ils\_dam_thumbnail_319.png

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\content\en\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\content\en\_jcr_content\image\file

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\content\en\_jcr_content\image\file.dir\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\content\en\_jcr_content\image\file.dir\_jcr_content\_dam_thum
bnails\_dam_thumbnail_319.png

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\content\fr\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\content\fr\_jcr_content\image\file

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\content\fr\_jcr_content\image\file.dir\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\content\fr\_jcr_content\image\file.dir\_jcr_content\_dam_thum
bnails\_dam_thumbnail_319.png

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\dam\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\dam\content\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\dam\content\asset.jpg\.content.xml

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\dam\content\asset.jpg\_jcr_content\renditions\cq5dam.thumbnai
l.140.100.png

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\dam\content\asset.jpg\_jcr_content\renditions\cq5dam.thumbnai
l.319.319.png

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\dam\content\asset.jpg\_jcr_content\renditions\cq5dam.thumbnai
l.48.48.png

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\dam\content\asset.jpg\_jcr_content\renditions\cq5dam.web.1280
.1280.jpeg

[WARNING] CP Don't override file C:\Workspace\AEM\aem\ui.content\src\main\conten
t\jcr_root\content\dam\content\asset.jpg\_jcr_content\renditions\original.dir\.c
ontent.xml

[INFO] Parent element not overwritten in C:\Workspace\AEM\aem\it.tests\pom.xml

[INFO] Parent element not overwritten in C:\Workspace\AEM\aem\it.launcher\pom.xm
l

[INFO] project created from Archetype in dir: C:\Workspace\AEM\aem

[INFO] ------------------------------------------------------------------------

[INFO] BUILD SUCCESS

[INFO] ------------------------------------------------------------------------

[INFO] Total time: 01:01 min

[INFO] Finished at: 2017-04-13T15:23:18-07:00

[INFO] Final Memory: 16M/485M

[INFO] ------------------------------------------------------------------------


OUTPUT:
=======

C:\Workspace\AEM\aem \core

      C:\Workspace\AEM\aem \core\src
      
      C:\Workspace\AEM\aem \core\src \main
      
      C:\Workspace\AEM\aem \core\src \test
      
      C:\Workspace\AEM\aem \core\pom.xml
         

C:\Workspace\AEM\aem \it.launcher

     C:\Workspace\AEM\aem \it.launcher\src
     
     C:\Workspace\AEM\aem \it.launcher\pom.xml

C:\Workspace\AEM\aem \it.tests

    C:\Workspace\AEM\aem \it.tests\src
    
    C:\Workspace\AEM\aem \it.tests\pom.xml

C:\Workspace\AEM\aem \ui.apps

    C:\Workspace\AEM\aem \ui.apps\src
    
    C:\Workspace\AEM\aem\ui.apps\src\main\content
    
    C:\Workspace\AEM\aem\ui.apps\src\main\content\jcr_root
    
    C:\Workspace\AEM\aem\ui.apps\src\main\content\jcr_root\apps
    
      --->C:\Workspace\AEM\aem\ui.apps\src\main\content\jcr_root\apps\apps
    
     --->C:\Workspace\AEM\aem\ui.apps\src\main\content\jcr_root\apps\sling
     
     --->C:\Workspace\AEM\aem\ui.apps\src\main\content\jcr_root\apps\.content
     
         
     C:\Workspace\AEM\aem\ui.apps\src\main\content\jcr_root\etc

     C:\Workspace\AEM\aem\ui.apps\src\main\content\jcr_root\etc\designs

    C:\Workspace\AEM\aem\ui.apps\src\main\content\jcr_root\etc\designs\apps

    C:\Workspace\AEM\aem\ui.apps\src\main\content\META-INF
    
    C:\Workspace\AEM\aem \ui.apps\pom.xml
    
    


C:\Workspace\AEM\aem \ui.content

C:\Workspace\AEM\aem\ui.content\src\main\content

C:\Workspace\AEM\aem\ui.content\src\main\content\jcr_root

C:\Workspace\AEM\aem\ui.content\src\main\content\META-INF







C:\Workspace\AEM>
