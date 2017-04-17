flow
====

/content

e.g
====
2 hierarchy:

1)/content
=======

/content/Testweb/english/en/index.html

/content/Testweb/english/en/index.html
====================================


properties :
------------

jcr:primaryType - cq:page

/content/Testweb/english/en/index.html/jcr:content
================================================

properties :
------------
cq:template: /apps/TestWeb/template/testTemplate


/content/Testweb/english/en/index.html/jcr:content/bodyparsys
===========================================================

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

2.1) /apps/Testweb/templates
=============================

properties:
-----------

allowedpaths: /content(/.*)?

  /apps/Testweb/templates/jcr:content
  ====================================
  
  jcr:primaryType : cq:PageContent.
  
  /apps/symantec/components/page/TestPage
  =============================================
   
   properties:
   -----------
   
   componentGroup - .hidden
   
    /apps/symantec/components/page/TestPage/header.html
    ========================================================
    
    properties:
    ----------
    jcr:primaryType - nt:file.
    
    
     /apps/symantec/components/page/TestPage/jcr:content
    =============================================================
    
    properties:
   -------------
    jcr:primaryType - nt:resource.
    
    
    /apps/symantec/components/page/TestPage/dialog.xml
    =============================================================
    
    properties:
    -----------
    jcr:primaryType - nt:resource.
    
    
    /apps/symantec/components/page/TestPage/dialog.xml
    ========================================================
    
    properties:
    -----------
    
    jcr:primaryType - cq:dialog.
    
    
    /apps/symantec/components/page/TestPage/dialog.xml/ items
    ===============================================================
        
    properties:
    -----------
    jcr:primaryType - cq:widgetCollection
    
     /apps/symantec/components/page/TestPage/dialog.xml/ items/ tabs
     ===============================================================
        
     properties:
     -----------
    
     jcr:primaryType - cq:TabPanel
    
     /apps/symantec/components/page/TestPage/dialog.xml/ items/tabs/items
     ====================================================================
          
      properties:
      -----------
    
      jcr:primaryType -  cq:widgetCollection
      
      
       /apps/symantec/components/page/TestPage/dialog.xml/ items/tabs/items / index
       =============================================================================
          properties:
          -----------
    
          path -  /apps/TestPage/components/page/tab/index.json
          
        /apps/symantec/components/page/TestPage/dialog.xml/ items/tabs/items / main
       =============================================================================
       
          properties:
          -----------
    
          path -  /apps/TestPage/components/page/tab/main.json
             
         /apps/symantec/components/page/TestPage/dialog.xml/ items/tabs/items / contact
       =================================================================================
       
         properties:
          -----------
    
          path -  /apps/TestPage/components/page/tab/contact.json
          
      
      
     
     
    
    
    
   
   
   
  





  


