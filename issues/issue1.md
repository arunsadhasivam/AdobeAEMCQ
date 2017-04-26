Error:
======
  [ERROR] Failed to execute goal org.apache.felix:maven-scr-plugin:1.20.0:scr (gen
  erate-scr-scrdescriptor) on project webapi.core: No annotation processors found

Reason:
=======
if no sling web servlets java in classpath.
if not using sling framework for calling servlet comment this line pom.xml core.


        <!--   Apache Felix SCR Plugin -->
        <plugin>
            <groupId>org.apache.felix</groupId>
            <artifactId>maven-scr-plugin</artifactId>
            <version>1.20.0</version>
            <executions>
                <execution>
                    <id>generate-scr-scrdescriptor</id>
                    <goals>
                        <goal>scr</goal>
                    </goals>
                    <configuration>
                        Private service properties for all services.
                        <properties>
                            <service.vendor>Adobe</service.vendor>
                        </properties>
                    </configuration>
                </execution>
            </executions>
            <configuration>
                       <outputDirectory>${project.build.directory}/classes</outputDirectory>
            </configuration>
            <dependencies>
                <dependency>
                    <groupId>org.slf4j</groupId>
                    <artifactId>slf4j-simple</artifactId>
                    <version>1.5.11</version>
                </dependency>
            </dependencies>
        </plugin>
