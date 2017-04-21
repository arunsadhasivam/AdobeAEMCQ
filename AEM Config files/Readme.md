
To override the location core jar generation:
=============================================
if mvn command below is given
   clean install -PautoInstallPackage 

it no profile is created to override default autoInstallPackage it generate the core-jar in /apos/apps/install/web-api-snapshot1.0.jar
to override the path need to override using the profile parameter and give the path to generate the core module jar
in < slingUrlSuffix> so it generate the jar in meaning full project specific path /apps/TestWeb/install/web-api-snapshot1.0.jar

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
							<slingUrlSuffix>/apps/TestWeb/install</slingUrlSuffix>
							<failOnError>true</failOnError>
						</configuration>
					</plugin>
				</plugins>
			</build>
		</profile>
	</profiles>

NOTE:
=====
maven-sling-plugin artifact means jar name maven-sling-plugin-2.2.0.jar!\META-INF\maven\plugin.xml
will be read below content definition for configuration in plugin.xml.
 
pom.xml
=======
maven-sling-plugin-2.2.0.jar!\META-INF\maven\org.apache.sling\maven-sling-plugin\pom.xml
ArtificatId will only be referenced in file.

    <artifactId>maven-sling-plugin</artifactId>
    <version>2.2.0</version>
    <packaging>maven-plugin</packaging>



when seeing the maven-sling-plugin artifact

https://mvnrepository.com/artifact/org.apache.sling/maven-sling-plugin/2.2.0

	<parameter>
          <name>slingUrlSuffix</name>
          <type>java.lang.String</type>
          <required>false</required>
          <editable>true</editable>
          <description>An optional url suffix which will be appended to the <code>sling.url</code>
		for use as the real target url. This allows to configure different target URLs
		in each POM, while using the same common <code>sling.url</code> in a parent
		POM (eg. <code>sling.url=http://localhost:8080</code> and
		<code>sling.urlSuffix=/project/specific/path</code>). This is typically used
		in conjunction with WebDAV or SlingPostServlet deployment methods.</description>
        </parameter>
