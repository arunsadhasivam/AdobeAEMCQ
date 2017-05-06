ISSUE 1:
========
once after installing the bundler below error
http://localhost:4502/system/console/bundles

488	 webapi - Corecom.shop.webapi.core
Symbolic Name	com.shop.webapi.core
Version	0.0.1.SNAPSHOT
Bundle Location	jcrinstall:/apps/webApi/install/webapi.core-0.0.1-SNAPSHOT.jar
Last Modification	Sat May 06 14:25:37 PDT 2017
Description	Core bundle for webapi
Start Level	20
Exported Packages	

org.springframework.aop.aspectj.annotation -- Cannot be resolved
org.springframework.aop.aspectj.autoproxy -- Cannot be resolved
org.springframework.aop.config-- Cannot be resolved
org.springframework.aop.framework-- Cannot be resolved
org.springframework.aop.framework.adapter,-- Cannot be resolved
org.springframework.aop.framework.autoproxy-- Cannot be resolved

SOLUTION:
=========
to make springframework as a part of bundle added below line to export to bundle.

<plugin>
				<groupId>org.apache.felix</groupId>
				<artifactId>maven-bundle-plugin</artifactId>
				<version>2.5.0</version>
				<inherited>true</inherited>

				<configuration>
					<instructions>
						<Export-Package>org.springframework.*</Export-Package>
						<!-- <Private-Package>org.foo.myproject.*</Private-Package>
						<Bundle-Activator>org.foo.myproject.impl1.Activator</Bundle-Activator> -->
					</instructions>
				</configuration>
</plugin>

      
ISSUE 2:
========
once added all springframework* below issue.
    com.google.protobuf -- Cannot be resolved
        com.googlecode.protobuf.format -- Cannot be resolved
        com.ibm.wsspi.uow -- Cannot be resolved
        com.jamonapi -- Cannot be resolved
        com.jamonapi.utils -- Cannot be resolved
        com.lowagie.text -- Cannot be resolved
        com.lowagie.text.pdf -- Cannot be resolved
        com.mchange.v2.c3p0 -- Cannot be resolved
        com.rometools.rome.feed -- Cannot be resolved
        com.rometools.rome.feed.atom -- Cannot be resolved
        com.rometools.rome.feed.rss -- Cannot be resolved
        com.rometools.rome.io -- Cannot be resolved
        com.squareup.okhttp -- Cannot be resolved
        com.sun.net.httpserver -- Cannot be resolved and overwritten by Boot Delegation
