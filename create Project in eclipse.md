
STEP 1:
=======
create NEW > select wizard > type aem > Aem Sample Multi-mode project.

STEP 2:
=======
choose archetype latest

STEP 3:
=======
Name: Test
group id : org.test
Artificat id :test 


choose Advanced:
================

  artifactName:Test
  
  package group:package
  
  appsFolderName:apps
  
  contentFolderName:content
  
  cssId:css
  
  componentGroupName:component
  
  siteName:site
  
  ignore slightly error and  create project
  
STEP 4:
======

Maven Project will be Test inside this
test(artificat id)
  ---core

  ---it.launcher

  ---it.tests

  ---ui.apps

  ---ui.content

Also it shows as separate maven project like core, ui.apps separately but it is single project only , in view it shows 

project under test as core ,ui.apps , it.launcher,ui.apps,ui.content and again separate core ,ui.apps , it.launcher,ui.apps,ui.content

project. but when you check the file path it is same path. just in view it shows like that.


if any error shows on separate maven project i.e like core , right click on core  Maven > update Project to make it compile

then only you can src gets compiled and class file gets generated otherwise it wont get generated.
