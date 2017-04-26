After changing and setting eclipse with crxde jsps , css and js
we need springmvc servlet to make it works for action binding with jsp.

for compiling springmvc source need all springmvc jars. so create a dependency project in maven
and build the bundle to be installed in AEM by following steps.

Step 1:
========
copy all spring mvc source to eclipse webapi\core\src ( core module) 
convert the project to java nature .so that all core,apps,content,dependencies are
generated with .classpath.


STEP 2:
======

create a new > Maven Module > create dependencies module by choosing ParentProject as webapi.
also make sure artificat and groupid of new dependencies project map with
groupid , artificatid of webapi main pom.xml

dependencies pom.xml
webapi/dependencies/pom.xml
---------------------------

     <parent>
        <groupId>com.web.api</groupId>
 		<artifactId>webapi</artifactId>
        <version>0.0.1-SNAPSHOT</version>
        <relativePath>../pom.xml</relativePath>
    </parent>
    <artifactId>webapi.dependencies</artifactId>
    <packaging>bundle</packaging>
    
    
    
main webapi/pom.xml
-------------------
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.web.api</groupId>
    <artifactId>webapi</artifactId>
    <packaging>pom</packaging>
    <version>0.0.1-SNAPSHOT</version>
    <description>webapi</description>
    <modules>
      <module>core</module>
      <module>ui.apps</module>
      <module>dependencies</module>
    </modules>

if not artifactid,groupid of new pom.xml not mapped correctly with root pom.xml below
error will occurs. since from root webapi/pom.xml it reference dependencies module of maven.

[ERROR]     Non-resolvable parent POM for com.web.api:webapi.dependencies:[unkno
wn-version]: Could not find artifact com.web.api:webapi:pom:1.0-SNAPSHOT and 'pa
rent.relativePath' points at wrong local POM @ line 4, column 13 -> [Help 2]
[ERROR]



