Maven has below hierarchy

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
	  pom.xml(root pom.xml)

when running the main project releated ui.apps and core will run.


  [INFO]
  
  [INFO] webApi ............................................ SUCCESS [  0.425 s]
  
  [INFO] web - Core ........................................ FAILURE [  1.292 s]
  
  [INFO] web - UI apps ..................................... SKIPPED
  
  [INFO] ------------------------------------------------------------------------

 

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
===============
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
	 
NOTE:
=====
root pom.xml packaging is declared as "pom" only packaging type "pom" can have  module tag i.e packaging type pom
can only embed other project bundles.

in Overview section it shows " Only projects 'pom' packaging can declare modules"


	 

	  
