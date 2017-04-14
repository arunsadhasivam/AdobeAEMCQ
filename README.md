# AdobeAEMCQ

Adobe plugins:
==============
https://eclipse.adobe.com/aem/dev-tools/ 
OR
type aem in the Eclipse market Place

Install the below plugins populated

1)Aem

2)Sling

https://github.com/Adobe-Marketing-Cloud/aem-eclipse-developer-tools

Architype project
==================

Step 1:
--------

click Window > Preferences and Select Archetype under Maven. Click on ‘Add Remote Catalog'

Step 2:
--------
Give the url ‘https://repo.adobe.com/nexus/content/groups/public/archetype-catalog.xml’ and provide description. Click on Verify and say ‘Ok’

Step 3:
-------
now if you create AEM Sample Template project 'slightly 1.1 or wont support j2ee 1.4' issues wont come.
NOTE:
=====
choose in Adobe AEM application project creation  archetype as 10,9,8,7 whichever your plugin support.

Apply your changes and click on ‘Ok’. Now we should have maven archetypes to create AEM projects. Click here to see how to create an AEM Project
Click on ‘Add Local Catalog’ instead of remote catalog. Browse the xml file and select the same and click ‘Ok’

Eclipse Create Project:
======================

New project > choose AEM sample Multi-Module Project.

you can create simple content , apps module using

1)sling module project

2)sling content project

Apache Sling Plugins:
=====================
http://mirror.cogentco.com/pub/apache/sling/eclipse

it comes with 

1)sling ide tools

2)Sling IDE Tools -Maven

3)Sling IDE Tools - Sightly

Projects:
=========
once installed it shows 2 projects

1)Sling - Apache sling Bundle Project

2)Sling - Apache Content Project.



Apache sling Bundle project
============================

Bundle will generate folder structure as  src\main\java,test, target folder. it is mainly for creating components like
slightly use- api and other components.

Apache Sling Content Project
=============================
jcr_root,jcr_root\apps (jsp), jcr_root\content folder structure . jcr_root\content  with all content folder beneath have .content.xml
files and META_inf\Vault folder to check the files from repository.

To easy check out:
==================
in Sling Bundle Project , it prompt to select artifact(org.apache.sling:sing-bundle-archetype:1.0.4 or org.apache.sling:sing-bundle-archetype:1.0.2) and prompt to enter maven groupid, artifact,version, package

finally it prompt to enter the server you can give port to 4502 to listen and so that you right on server and get the updated files 
from AEM server . instead of manually creating.



Three ways to generate AEM projects
==================================

Either use the AEM Eclipse extension and follow the New Project wizard (choosing AEM Sample Multi-Module Project)...

Or use your mvn skills:

1) use sling plugin if single module.

2) AEM Sample Multi-Module Project - if it involves multi module in pom.xml

2)use  maven script - if we dont want to install plugin.

C:\Workspace\AEM> mvn archetype:generate \
 -DarchetypeGroupId=com.adobe.granite.archetypes \
 -DarchetypeArtifactId=aem-project-archetype \
 -DarchetypeVersion=11-SNAPSHOT
 
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




