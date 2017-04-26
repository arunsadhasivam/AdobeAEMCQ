AEM AppsModule:
===============
Aem app module need to be export as zip file. to export as zip need content-type maven plugin "content-package-maven-plugin".
         <parent>
            <groupId>com.web.api</groupId>
            <artifactId>webapi</artifactId>
            <version>0.0.1-SNAPSHOT</version>
          </parent>
          <groupId>com.web.api</groupId>
          <artifactId>webapi.ui.apps</artifactId>
          <version>0.0.1-SNAPSHOT</version>
          <packaging>content-package</packaging>

          <profile>
              <id>autoInstallPackagePublish</id>
              <activation />
              <build>
                <plugins>
                  <plugin>
                    <groupId>com.day.jcr.vault</groupId>
                    <artifactId>content-package-maven-plugin</artifactId>
                    <executions>
                      <execution>
                        <id>install-package</id>
                        <goals>
                          <goal>install</goal>
                        </goals>
                      </execution>
                    </executions>
                    <configuration>
                      <targetURL>http://localhost:4503/crx/packmgr/service.jsp</targetURL>
                      <failOnError>true</failOnError>
                      <failOnMissingEmbed>true</failOnMissingEmbed>
                    </configuration>
                  </plugin>
                </plugins>
