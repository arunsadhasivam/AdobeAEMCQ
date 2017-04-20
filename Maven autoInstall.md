To automatically install the project through maven 
==================================================

To install the bundle in path specify the path in SlingUrlSuffix.
dfasfmkasdf
	ddadfadf	
<profile>
	<id>autoInstallBundle</id>
	<activation></activation>
	<build>
		<plugins>
			<plugin>
				<groupId>org.apache.sling</groupId>
				<artifactId>maven-sling-plugin</artifactId>
				<configuration>
					<!-- Note that this requires /apps/symantec/install to exist!! -->
					<!-- This is typically the case when ui.apps is deployed first -->
					<!-- Otherwise, create /apps/symantec/install manually (CRXDE|Lite) -->
					<slingUrlSuffix>/apps/symantec/install/</slingUrlSuffix>
					<failOnError>true</failOnError>
				</configuration>
			</plugin>
		</plugins>
	</build>
</profile>
