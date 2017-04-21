STEP 1:
=======

create New > Aem Sample multi-module project > choose com.adobe.granite.archetypes of 10

then choose artifactid,group,version > choose Advanced choose the folder names like cssid,service,component,template,site,package Name
it generates below structure.


project structure:
==================
below is project structure

     webapi(root)
       -core(components, servlets,UCMUse sightly components)
          -src
          -pom.xml(core pom.xml)
       -ui.apps(ui)
          -src
          -pom.xml(ui)
        -webapi.dependencies
           -src
           -pom.xml(webapi.depencies)
     pom.xml(root pom.xml)



main pom.xml
============
     <packaging>pom</packaging>
     <modules>
        <module>dependencies</module>
        <module>core</module>
        <module>ui.apps</module>
      </modules>

core pom.xml
============
    <parent>
        <artifactId>TestWeb</artifactId>
        <groupId>com.test</groupId>
        <version>0.0.1-SNAPSHOT</version>
        <relativePath>../pom.xml</relativePath>
      </parent>
     <artifactId>TestWeb.core</artifactId>
      <packaging>bundle</packaging>
      <name>TestWeb - Core</name>
      <description>Core bundle for TestWeb</description>

ui.apps pom.xml
================
    <parent>
        <artifactId>TestWeb</artifactId>
        <groupId>com.test</groupId>
        <version>0.0.1-SNAPSHOT</version>
        <relativePath>../pom.xml</relativePath>
      </parent>

     <artifactId>TestWeb.ui.apps</artifactId>
     <packaging>content-package</packaging>
     <name>TestWe - UI</name>
         <description>UI apps package for TestWeb</description>


when running the main project releated ui.apps and core will run.

[INFO]

[INFO] webApi ............................................ SUCCESS [ 0.425 s]

[INFO] web - Core ........................................ FAILURE [ 1.292 s]

[INFO] web - UI apps ..................................... SKIPPED

[INFO] ------------------------------------------------------------------------

The above script fails because it could able to refer some jar files need to run the web-core webservices like jersey.jar.
sow we need a depencies module in maven to make it work!!!.

STEP 2: Add dependency project:
================================

To make it part of the webapi root project.

in eclipse create new Maven Module > module project >

Module name : webapi.dependencies

parent : webapi(root)

next > choose catalog > AEM >

choose com.day.jcr.vault > multimodule-content-package-archetype  1.0.2

IMPORTANT:
==========
we choose above multimodule-content-package-archetype because we want to bundle as zip file through maven and automatically install in AEM.

i.e in pom.xml it creates a tag < packaging>content-package</ packaging>
so it bundle as zip and install in aem packmgr -http://localhost:4502/crx/packmgr/index.jsp



