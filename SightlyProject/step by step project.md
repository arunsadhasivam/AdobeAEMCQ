Step 1:
======

By default it has 2 folder /apps and /content

1)http://localhost:4502/crx/de/index.jsp#/apps

2)http://localhost:4502/crx/de/index.jsp#/content

/apps
=====
-/apps/TestWeb/components
   /apps/TestWeb/components/content
   /apps/TestWeb/components/page
   
-/apps/TestWeb/templates
  -content
  
/content
========
/content/TestWeb/jcr:content
/content/TestWeb/TestWebSite
   

website --> TestWeb
http://localhost:4502/siteadmin#/content/TestWeb/TestWebSite/en
Create New Site> Initial Chapters -> Journal , Forum,members


STEP 2:
=======
create templates,components inside apps folder. > 

http://localhost:4502/crx/de/index.jsp#/apps/TestWeb
http://localhost:4502/crx/de/index.jsp#/apps/TestWeb/components

http://localhost:4502/crx/de/index.jsp#/apps/TestWeb/components/page
http://localhost:4502/crx/de/index.jsp#/apps/TestWeb/components/content




go to http://localhost:4502/crx/de/index.jsp#/apps/TestWeb/templates

give the template resource to point to page.
/TestWeb/components/page/TestPage

/apps/TestWeb/temlates/TestWebTemplate/
=======================================
	properties:
	-----------

	template allowed paths to be -/content(/.*)?



/apps/TestWeb/temlates/TestWebTemplate/jcr:content
==================================================
	properties:
	-----------
	sling:resourceType - /TestWeb/components/page/TestPage


STEP 3:
=======
create a page component as with above sling:resourceType specified while creating template.

/apps/TestWeb/components/page/
===============================
create a page component inside page TestPage.

	properties:
	------------
	jcr:primaryType - cq:component

it gets created as /apps/TestWeb/components/page/TestPage/TestPage.html
once create a TestPage  /apps/TestWeb/components/page/TestPage/ component inside page folder
TestPage.jsp gets created automatically.

change TestPage.jsp - TestPage.html

/apps/TestWeb/components/page/TestPage/
========================================
	properties:
	------------
	jcr:data - whole content of jsp TestPage.html below content will be there.


following lines generated automatically.

<%--

  TestPage component.

  

--%>

<html> <body>	Hai Sample Test Web Page</body></html> 

<sly data-sly-include="/libs/wcm/core/components/init/init.jsp" data-sly-unwrap/>

<%@include file="/libs/foundation/global.jsp"%>

/apps/TestWeb/components/page/Testpage
=======================================

properties:
-----------

primaryType: cq:Component

SuperType: TestWeb/components/page/page

TestWeb/components/page/page is a component

/libs/wcm/core/components/init/init.jsp


TestWeb/components/page/page
============================

properties:
------------

primaryType: cq:Component

sling:resourceSuperType: wcm/foundation/components/page

NOTE: it works through inheritance.

VERY IMPORTANT:
===============
if no inheritance to page component (wcm/foundation/components/page) to page component it will not render.

STEP 4:
=======

got to http://localhost:4502/welcome and click TestWeb site http://localhost:4502/siteadmin#/content/TestWeb 
create a site refering template  http://localhost:4502/siteadmin#/content/TestWeb/TestWebSite

TestWebSite - site created.

http://localhost:4502/siteadmin#/content/TestWeb

STEP 5:
======
confirm whether content created go to http://localhost:4502/crx/de/index.jsp#/content/TestWeb/TestWebSite

it should create a TestWebSite inside content folder


/content/TestWeb/TestWebSite
=============================
properties
-----------
jcr:primaryType - cq:page


/content/TestWeb/TestWebSite/jcr:content
=========================================
properties
-----------
cq:template - /apps/TestWeb/templates/TestWebTemplate
jcr:primaryType- cq:pageContent.

http://localhost:4502/crx/de/index.jsp#/content/TestWeb/TestWebSite




STEP 6:
=======
web page can be accessed from /content .
http://localhost:4502/content/TestWeb/TestWebSite.html


when accessing above page it wont show any thing because page component is needed.

so when creating a page specify supertype as page.
http://localhost:4502/crx/de/index.jsp#/apps/TestWeb/components/page

Label: TestPage
Title: TestPage
SuperType: TestWeb/components/page/page


TestWeb/components/page/page is a component

STEP 7:
=======
http://localhost:4502/editor.html/content/TestWeb/TestWebSite.html

<sly data-sly-include="/libs/wcm/core/components/init/init.jsp" data-sly-unwrap/>

if this line is added it open in edit mode else it just open web page only


