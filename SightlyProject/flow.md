flow
====

/content

flow 1 :
=========
  content - (/content/Testweb/english/en/index.html/ jcr:content) --> /apps/TestWeb/templates/testTemplate

  template - /apps/TestWeb/templates/testTemplate  -->   /apps/TestWeb/components/page/TestPage


flow 2 :
=========
/apps/TestWeb/templates/testTemplate
e.g
====
2 hierarchy:



1)/content
==========

/content/Testweb/english/en/index.html

/content/Testweb/english/en/index.html
====================================


properties :
------------

jcr:primaryType - cq:page

/content/Testweb/english/en/index.html/ jcr:content
====================================================

properties :
------------
cq:template: /apps/TestWeb/templates/testTemplate


/content/Testweb/english/en/index.html/ jcr:content/bodyparsys
===============================================================

properties:
-----------
sling:resourceType : foundataion/component/parsys

jcr:primaryType : nt:unstructured.




2)/apps
=======

apps has 2 parts.

  1)templates

  2)components. components has  2 parts.
     1)/content
     
     2)/page

2.1) /apps/TestWeb/templates/testTemplate
=========================================

properties:
-----------

allowedpaths: /content(/.*)?

  /apps/TestWeb/templates/testTemplate/jcr:content
  =================================================
  
  jcr:primaryType : cq:PageContent.
  
  it also support refer another template or design.
  
  cq:template - /apps/ TestWeb/templates/homepage
  
  cq:allowedTemplates- /apps/TestWeb/Page1
  
  cq:designPath - /etc/design/TestWeb
  
  /apps/TestWeb/components/page/TestPage
  =============================================
   
   properties:
   -----------
   
   componentGroup - .hidden
   
    /apps/TestWeb/components/page/TestPage/header.html
    ========================================================
    
   properties:
   ----------
    jcr:primaryType - nt:file.
    
    
   /apps/Testweb/components/page/TestPage/jcr:content
   =============================================================
    
   properties:
   -----------
    jcr:primaryType - nt:resource.
    
    
    /apps/Testweb/components/page/TestPage/dialog.xml
    =============================================================
    
   properties:
   ------------
    jcr:primaryType - nt:resource.
    
    
    /apps/Testweb/components/page/TestPage/dialog.xml
    ========================================================
    
   properties:
   -----------
    
   jcr:primaryType - cq:dialog.
    
    
    /apps/Testweb/components/page/TestPage/dialog.xml/ items
    ===============================================================
        
    properties:
    -----------
    jcr:primaryType - cq:widgetCollection
    
   /apps/Testweb/components/page/TestPage/dialog.xml/ items/ tabs
   ===============================================================
        
    properties:
    -----------
    
     jcr:primaryType - cq:TabPanel
    
   
   /apps/Testweb/components/page/TestPage/dialog.xml/ items/tabs/items
   ====================================================================
          
   properties:
   -----------
    
   jcr:primaryType -  cq:widgetCollection
      
         
    /apps/Testweb/components/page/TestPage/dialog.xml/ items/tabs/items / index
    ============================================================================
          properties:
          -----------
    
          path -  /apps/TestPage/components/page/tab/index.json
   
   
     /apps/Testweb/components/page/TestPage/dialog.xml/ items/tabs/items / main
     =============================================================================
          properties:
          -----------
    
          path -  /apps/TestPage/components/page/tab/main.json
   
   
      /apps/Testweb/components/page/TestPage/dialog.xml/ items/tabs/items / contact
      =================================================================================
         properties:
          -----------
    
          path -  /apps/TestPage/components/page/tab/contact.json
          
      
      
     
     
    
    
    
   
   
   
  





  


