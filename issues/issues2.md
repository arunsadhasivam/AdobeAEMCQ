issue in bundle:
=======================

  <build>
        <plugins>
            <plugin>
                <groupId>org.apache.felix</groupId>
                <artifactId>maven-scr-plugin</artifactId>
            </plugin>
            <plugin>
                <groupId>org.apache.felix</groupId>
                <artifactId>maven-bundle-plugin</artifactId>
                <extensions>true</extensions>
                <configuration>
                    <instructions>
                        <!--
                        <Embed-Dependency>
                            artifactId1,
                            artifactId2;inline=true
                        </Embed-Dependency>
                        -->
                        <Sling-Model-Packages>
                            com.shop
                        </Sling-Model-Packages>
                    </instructions>
                </configuration>
            </plugin>
        </plugins>
    </build>
    
    
  [ERROR] Bundle com.web.api:webapi.core:bundle:0.0.1-SNAPSHOT : The default packa
ge '.' is not permitted by the Import-Package syntax.
 This can be caused by compile errors in Eclipse because Eclipse creates
valid class files regardless of compile errors.
The following package(s) import from the default package null
[ERROR] Error(s) found in bundle configuration
[INFO] ------------------------------------------------------------------------
[INFO] Reactor Summary:
[INFO]
[INFO] webapi ............................................. SUCCESS [  0.943 s]
[INFO] webapi - Core ...................................... FAILURE [  3.800 s]
[INFO] webapi - UI apps ................................... SKIPPED
[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 8.154 s
[INFO] Finished at: 2017-04-26T02:03:40-07:00
[INFO] Final Memory: 16M/214M
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.felix:maven-bundle-plugin:2.5.3:bundle
 (default-bundle) on project webapi.core: Error(s) found in bundle configuration
 -> [Help 1]
