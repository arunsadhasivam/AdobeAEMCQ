To automatically install the project through maven 
==================================================

To install the bundle in path specify the path in SlingUrlSuffix.

	<profile>
		<id>autoInstallBundle</id>
		<activation></activation>
		<build>
			<plugins>
				<plugin>
					<groupId>org.apache.sling</groupId>
					<artifactId>maven-sling-plugin</artifactId>
					<configuration>
						<!-- Note that this requires /apps/apps/install to exist!! -->
						<!-- This is typically the case when ui.apps is deployed first -->
						<!-- Otherwise, create /apps/apps/install manually (CRXDE|Lite) -->
						<slingUrlSuffix>/apps/Testweb/install/</slingUrlSuffix>
						<failOnError>true</failOnError>
					</configuration>
				</plugin>
			</plugins>
		</build>
	    </profile>

To call the profile:
====================
* core: Java bundle containing all core functionality like OSGi services, listeners or schedulers, as well as component-related Java code such as servlets or request filters.

* ui.apps: contains the /apps (and /etc) parts of the project, ie JS&CSS clientlibs, components, templates, runmode specific configs as well as Hobbes-tests

* ui.content: contains sample content using the components from the ui.apps

* ui.tests: Java bundle containing JUnit tests that are executed server-side. This bundle is not to be deployed onto production.

* ui.launcher: contains glue code that deploys the ui.tests bundle (and dependent bundles) to the server and triggers the remote JUnit execution

you can create profile for deploy in dev,qa

	c:\ARUN\TestWeb\webapi>mvn clean install -PautoInstallPackage

If you have a running AEM instance you can build and package the whole project and deploy into AEM with 

 	mvn clean install -PautoInstallPackage
    
Or to deploy it to a publish instance, run

    mvn clean install -PautoInstallPackagePublish
    
Or to deploy only the bundle to the author, run

    mvn clean install -PautoInstallBundle
