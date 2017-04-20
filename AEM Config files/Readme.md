
To override the location core jar generation:
=============================================
if mvn command below is given
   clean install -PautoInstallPackage 

it no profile is created to override default autoInstallPackage it generate the core-jar in /apos/apps/install/web-api-snapshot1.0.jar
to override the path need to override using the profile parameter and give the path to generate the core module jar
in < slingUrlSuffix> so it generate the jar in meaning full project specific path /apps/scim/install/web-api-snapshot1.0.jar

 <profiles>
	<profile>
		<id>autoInstallPackage</id>
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
						<slingUrlSuffix>/apps/scim/install</slingUrlSuffix>
						<failOnError>true</failOnError>
					</configuration>
				</plugin>
			</plugins>
		</build>
	</profile>
</profiles>
    
    
