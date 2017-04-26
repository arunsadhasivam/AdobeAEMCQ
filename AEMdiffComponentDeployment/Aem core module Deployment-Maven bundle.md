 AEM core module:
 ===================
 
 AEM core module bundle as aem felix bundle. to make it work need maven plugin "maven-bundle-plugin"
 if not include in maven core module below error will occur.
 
 
     G:\workspace\AEM\webapi>mvn -PautoInstallPackage install
     [INFO] Scanning for projects...
     [ERROR] [ERROR] Some problems were encountered while processing the POMs:
     [ERROR] Unknown packaging: bundle @ com.web.api:webapi.core:[unknown-version], G
     :\workspace\AEM\webapi\core\pom.xml, line 27, column 16
      @
     [ERROR] The build could not read 1 project -> [Help 1]
     [ERROR]
     [ERROR]   The project com.web.api:webapi.core:0.0.1-SNAPSHOT (G:\workspace\AEM\w
     ebapi\core\pom.xml) has 1 error
     [ERROR]     Unknown packaging: bundle @ com.web.api:webapi.core:[unknown-version
     ], G:\workspace\AEM\webapi\core\pom.xml, line 27, column 16
     [ERROR]

error:
=======
Unknown packaging: bundle because it needs maven plugin "maven-bundl-plugin" as below
   
      <parent>
         <groupId>com.web.api</groupId>
         <artifactId>webapi</artifactId>
         <version>0.0.1-SNAPSHOT</version>
         <relativePath>../pom.xml</relativePath>
     </parent>
     <artifactId>webapi.core</artifactId>
     <packaging>bundle</packaging>
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

                             <Embed-Dependency>
                                 artifactId1,
                                 artifactId2;inline=true
                             </Embed-Dependency>

                             <Sling-Model-Packages>
                                 com.shop
                             </Sling-Model-Packages>
                         </instructions>
                     </configuration>
                 </plugin>
             </plugins>
         </build> 
