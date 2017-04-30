After installing the application in aem.

After running pom.xml of root webapi.
the webapi/webcore bundle installed in the aem bundle console .

To install all the spring jar as bundle i.e META-INF with import, export added to
support osgi. otherwise 404 jar error shown jar is not a bundle.
below shown core project is not "activated" it is just installed.

      486	 webapi - Corecom.web.api.webapi.core
      Symbolic Name	com.web.api.webapi.core
      Version	0.0.1.SNAPSHOT
      Bundle Location	G:\workspace\AEM\webapi\core\target\classes
      Last Modification	Sat Apr 29 23:18:28 PDT 2017
      Description	Core bundle for webapi
      Start Level	20
      Exported Packages	com.shop.config,version=0.0.1
      com.shop.constant,version=0.0.1
      com.shop.controller,version=0.0.1
      com.shop.dao,version=0.0.1
      com.shop.dao.jdbc,version=0.0.1
      com.shop.domain,version=0.0.1
      com.shop.service,version=0.0.1
      com.shop.servlet,version=0.0.1
      Imported Packages	com.shop.config from com.web.api.webapi.core (486)
      com.shop.dao from com.web.api.webapi.core (486)
      com.shop.domain from com.web.api.webapi.core (486)
      com.shop.service from com.web.api.webapi.core (486)
      javax.servlet,version=[3.1,4) from org.apache.felix.http.servlet-api (37)
      javax.servlet.http,version=[3.1,4) from org.apache.felix.http.servlet-api (37)

errors:
======
below errors shown while installed.
 
      
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
      org.springframework.web.context -- Cannot be resolved
      org.springframework.web.context.support -- Cannot be resolved
      org.springframework.web.servlet -- Cannot be resolved
      org.springframework.web.servlet.config.annotation -- Cannot be resolved
      Manifest Headers	Bnd-LastModified: 1493498585142
      Build-Jdk: 1.8.0_121
      Built-By: HOME
      Bundle-Description: Core bundle for webapi
      Bundle-ManifestVersion: 2
      Bundle-Name: webapi - Core
      Bundle-SymbolicName: com.web.api.webapi.core
      Bundle-Version: 0.0.1.SNAPSHOT
      Created-By: Apache Maven Bundle Plugin
      Export-Package: com.shop.config; uses:="org.springframework.context.annotation, org.springframework.web.servlet.config.annotation"; version="0.0.1", com.shop.constant; version="0.0.1", com.shop.controller; uses:="com.shop.domain, javax.servlet.http, org.springframework.stereotype, org.springframework.ui, org.springframework.web.bind.annotation, org.springframework.web.servlet"; version="0.0.1", com.shop.dao; uses:="com.shop.domain, org.springframework.beans.factory, org.springframework.jdbc.core, org.springframework.stereotype"; version="0.0.1", com.shop.dao.jdbc; version="0.0.1", com.shop.domain; version="0.0.1", com.shop.service; uses:="com.shop.domain, org.springframework.stereotype"; version="0.0.1", com.shop.servlet; uses:="javax.servlet, org.springframework.context.annotation, org.springframework.web"; version="0.0.1"
      Import-Package: com.shop.config, com.shop.dao, com.shop.domain, com.shop.service, javax.servlet; version="[3.1, 4)", javax.servlet.http; version="[3.1, 4)", org.springframework.beans.factory, org.springframework.beans.factory.annotation, org.springframework.context.annotation, org.springframework.core.env, org.springframework.dao, org.springframework.jdbc.core, org.springframework.stereotype, org.springframework.ui, org.springframework.web, org.springframework.web.bind.annotation, org.springframework.web.context, org.springframework.web.context.support, org.springframework.web.servlet, org.springframework.web.servlet.config.annotation
      Manifest-Version: 1.0
      Require-Capability: osgi.ee; filter:="(&(osgi.ee=JavaSE)(version=1.6))"
      Tool: Bnd-3.3.0.201609221906
      0.0.1.SNAPSHOT		Installed	
