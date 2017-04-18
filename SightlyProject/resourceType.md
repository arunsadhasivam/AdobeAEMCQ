NodeType:
=========
/apps/TestWeb/components/page/Testpage1 has sling:resourceType ->   TestWeb/components/page/page

http://localhost:4502/crx/de/index.jsp#/apps/TestWeb/components/page/Testpage1/Testpage1.jsp -> jcr:primaryfile: nt:file

/apps/TestWeb/components/page/Testpage1/Testpage1.jsp/jcr:content -> jcr:data -> actual jsp file or html file.

Note:
======
for template jcr:content  will refer to page 
1)sling:resourceType -- /content/TestWeb/TestWebSite/testwebpage

2)for Actual page http://localhost:4502/crx/de/index.jsp#/apps/TestWeb/components/page/Testpage1/Testpage1.jsp the jcr:content 
will point to actual jsp as jcr:data - binary with hyperlink showing the jsp on click.
