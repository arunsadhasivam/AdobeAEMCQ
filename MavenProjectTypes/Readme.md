Maven has below hierarchy

project structure:
==================
below is project structure

	 webapi(root)
     -core(components, servlets,UCMUse sightly components)
         -src
         -pom.xml
		 -ui.apps(ui)
         -src
			   -pom.xml
		-pom.xml

when running the main project releated ui.apps and core will run.


  [INFO]
  
  [INFO] webApi ............................................ SUCCESS [  0.425 s]
  
  [INFO] web - Core ........................................ FAILURE [  1.292 s]
  
  [INFO] web - UI apps ..................................... SKIPPED
  
  [INFO] ------------------------------------------------------------------------

