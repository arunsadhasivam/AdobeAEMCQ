issue 1:
========

[DEBUG] << "<crx version="1.0.22" user="admin" workspace="crx.default">[\r][\n]"

[DEBUG] << "  <request>[\r][\n]"

[DEBUG] << "    <param name="file" value="webapi.core-0.0.1-SNAPSHOT.jar"/>[\r]

[\n]"

[DEBUG] << "    <param name="install" value="true"/>[\r][\n]"

[DEBUG] << "  </request>[\r][\n]"

[DEBUG] << "  <response>[\r][\n]"

[DEBUG] << "    <status code="500">java.io.IOException: Zip File is not a conten
t package. Missing 'jcr_root'.</status>[\r][\n]"

[DEBUG] << "  </response>[\r][\n]"

[DEBUG] << "</crx>[\r][\n]"

[DEBUG] Resorting to protocol version default close connection policy

[DEBUG] Should NOT close connection, using HTTP/1.1

[DEBUG] Releasing connection back to connection manager.

[ERROR] Request failed: java.io.IOException: Zip File is not a content package.
Missing 'jcr_root'. (500)


Reason:
========
for core if packaging is set as bundle then vault to pull using filter.xml is not supported.it should be packaging 
content package maven project i.e < packaging >content-package </ packaging>
usually content module, dependencies modules where all jars needed for core,ui,content will be placed will be content-package type.

    <artifactId>scimApi.core</ artifactId>
    <packaging>bundle</ packaging>
    
    
    <plugin>
        <groupId>com.day.jcr.vault</groupId>
        <artifactId>content-package-maven-plugin</artifactId>
        <extensions>true</extensions>
        <configuration>
          <filterSource>${basedir}/META-INF/vault/filter.xml</filterSource>
          <verbose>true</verbose>
          <failOnError>true</failOnError>
          <group>scim Content Package</group>
          <embeddeds>
            <embedded>
               <groupId>org.test.scim</groupId>
      		   <artifactId>webApi</artifactId>
              <target>/apps/TestWeb/install</target>
            </embedded>
          </embeddeds>
        </configuration>
      </plugin>
            
 
 
