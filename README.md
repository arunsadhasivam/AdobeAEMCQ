# AdobeAEMCQ

Adobe plugins:
==============

https://github.com/Adobe-Marketing-Cloud/aem-eclipse-developer-tools

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



Two ways to generate AEM projects
==================================

Either use the AEM Eclipse extension and follow the New Project wizard (choosing AEM Sample Multi-Module Project)...

Or use your mvn skills:

1) use sling plugin

2)use  maven script

mvn archetype:generate \
 -DarchetypeGroupId=com.adobe.granite.archetypes \
 -DarchetypeArtifactId=aem-project-archetype \
 -DarchetypeVersion=11-SNAPSHOT
