AEM script support
====================
https://docs.adobe.com/docs/en/aem/6-0.html

All Sling scripts are stored in subfolders of either /apps or /libs, which will be searched in this order

AEM Supported scripts can be checked by viewing the below path of aem configuration:

http://localhost:4502/system/console/config/slingscripting.txt.

For example, consider a request to access the resource
    /content/corporate/jobs/developer.print.a4.html
of type
    sling:resourceType="hr/jobs"

Assuming we have the following list of scripts in the correct location:

    1)GET.esp
    
    2)jobs.esp
    
    3)html.esp
    
    4)print.esp
    
    5)print.html.esp
    
    6)print/a4.esp
    
    7)print/a4/html.esp
    
    8)print/a4.html.esp

Then the order of preference would be (8) - (7) - (6) - (5) - (4) - (3) - (2) - (1).

In addition to the resource types (primarily defined by the sling:resourceType property) there is also the resource super type. This is generally indicated by the sling:resourceSuperType property. These super types are also considered when trying to find a script. The advantage of resource super types is that they may form a hierarchy of resources where the default resource type sling/servlet/default (used by the default servlets) is effectively the root.

The resource super type of a resource may be defined in two ways:

1) by the sling:resourceSuperType property of the resource.

2) by the sling:resourceSuperType property of the node to which the sling:resourceType points.


For example:

    /
        a
        b
            sling:resourceSuperType = a
        c
            sling:resourceSuperType = b
        x
            sling:resourceType = c
        y
            sling:resourceType = c
            sling:resourceSuperType = a

The type hierarchy of /x is [ c, b, a, <default>] while for /y the hierarchy is [ c, a, <default>] because /y has the sling:resourceSuperType property whereas /x does not and therefore its supertype is taken from its resource type.
