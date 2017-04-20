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
you can create profile for deploy in dev,qa

	c:\ARUN\TestWeb\webapi>mvn clean install -PautoInstallPackage
