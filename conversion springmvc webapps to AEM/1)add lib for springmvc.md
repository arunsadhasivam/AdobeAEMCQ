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

check the bundles and check whether it webcore is installed sucessfully.
http://localhost:4502/system/console/bundles


     webapi - Corecom.web.api.webapi.core
     Symbolic Name	com.web.api.webapi.core
     Version	0.0.1.SNAPSHOT

     Bundle Location	G:\workspace\AEM\webapi\core\target\classes
     Last Modification	Wed Apr 26 02:11:58 PDT 2017
     Description	Core bundle for webapi
     Start Level	20
     Exported Packages	com.shop.controller,version=0.0.1
     Imported Packages	javax.servlet from org.apache.felix.http.servlet-api (37)
     javax.servlet.http from org.apache.felix.http.servlet-api (37)
     org.springframework.beans.factory -- Cannot be resolved
     org.springframework.beans.factory.annotation -- Cannot be resolved
     org.springframework.context.annotation -- Cannot be resolved
     org.springframework.core.env -- Cannot be resolved
     org.springframework.dao -- Cannot be resolved
     org.springframework.jdbc.core -- Cannot be resolved
     org.springframework.stereotype -- Cannot be resolved
     org.springframework.ui -- Cannot be resolved
     org.springframework.web -- Cannot be resolved
     org.springframework.web.bind.annotation -- Cannot be resolved
     org.springframework.web.context.support -- Cannot be resolved
     org.springframework.web.servlet -- Cannot be resolved
     org.springframework.web.servlet.config.annotation -- Cannot be resolved
     Manifest Headers	Bnd-LastModified: 1493197916347
     Build-Jdk: 1.8.0_12er1
     Built-By: HOME
     Bundle-Activator: com.shop.servlet.WebInitializer
     Bundle-Description: Core bundle for webapi
     Bundle-ManifestVersion: 2
     Bundle-Name: webapi - Core
     Bundle-SymbolicName: com.web.api.webapi.core
     Bundle-Version: 0.0.1.SNAPSHOT
     Created-By: Apache Maven Bundle Plugin
     Export-Package: com.shop.controller; version="0.0.1"; uses:="javax.servlet.http, org.springframework.stereotype, org.springframework.ui, org.springframework.web.bind.annotation, org.springframework.web.servlet"
     Import-Package: javax.servlet, javax.servlet.http, org.springframework.beans.factory, org.springframework.beans.factory.annotation, org.springframework.context.annotation, org.springframework.core.env, org.springframework.dao, org.springframework.jdbc.core, org.springframework.stereotype, org.springframework.ui, org.springframework.web, org.springframework.web.bind.annotation, org.springframework.web.context.support, org.springframework.web.servlet, org.springframework.web.servlet.config.annotation
     Manifest-Version: 1.0
     Require-Capability: osgi.ee; filter:="(&(osgi.ee=JavaSE)(version=1.6))"
     Tool: Bnd-2.3.0.201405100607
     0.0.1.SNAPSHOT		Installed

NOTE:
=====
it should be Active, if installed then it should shows some error dependency error should be corrected.
when try to install spring mvc jar ,spring context, spring dao by directly download from spring site it shows below error.
because it is not bundle. i.e it should have felix META-INF.mf with properties import,export packages and optional
bundle activator to make treated as bundle. To Automate it we have dependency project along with ui.apps,dependencies,core,content.

ERROR:
======
HTTP ERROR: 500

Problem accessing /system/console/bundles. Reason:

    java.io.IOException: Bundle-SymbolicName header missing, cannot install bundle
