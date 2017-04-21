  Important:
  ===========
  
  It is important that all maven sub modules ( multi module project) should have this added in pom.xml.
  i.e all modules ui.apps,core,dependencies,content has  profile with autoInstallPackage (local install) , autoInstallPackagePublish
  for publishing mode installation to make sure all modules do in sync all the task to publish in CRXDE
  
  
