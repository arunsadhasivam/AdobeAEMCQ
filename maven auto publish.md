
create a different profile for dev,qa,prod
==========================================
have aem-api.jar in classpath.


<profile>
      <id>DevAppInstall</id>
      <build>
        <plugins>
          <plugin>
            <groupId>com.day.jcr.vault</groupId>
            <artifactId>content-package-maven-plugin</artifactId>
            <executions>
              
              <execution>
                <id>install-package-author</id>
                <goals>
                  <goal>install</goal>
                </goals>
                <configuration>
                  <targetURL>${cq.dev.smt.author.protocol}://${cq.dev.author.host}:${cq.dev.author.port}/crx/packmgr/service.jsp</targetURL>
                  <failOnError>true</failOnError>
                  <failOnMissingEmbed>true</failOnMissingEmbed>
                  <userId>${user-dev}</userId>
                  <password>${password-dev}</password>
                </configuration>
              </execution>
              
              <execution>
                <id>install-package-publish</id>
                <goals>
                  <goal>install</goal>
                </goals>
                <configuration>
                  <targetURL>${cq.dev.publish.protocol}://${cq.dev.publish.host}:${cq.dev.publish.port}/crx/packmgr/service.jsp</targetURL>
                  <failOnError>true</failOnError>
                  <failOnMissingEmbed>true</failOnMissingEmbed>
                  <userId>${user-dev}</userId>
                  <password>${password-dev}</password>
                </configuration>
              </execution>
            </executions>
          </plugin>
        </plugins>
      </build>
    </profile>
    
    
    set properties to be used in cli
    ================================
    <pom>
     <properties>
     <password-dev>admin</password-dev>
     </properties>
    
    </pom>
    run:
    ====
    Profiles can be explicitly specified using the -P CLI option.
    
    This option takes an argument that is a comma-delimited list of profile-ids to use. When this option is specified, the
    profile(s) specified in the option argument will be activated in addition to any profiles 
    which are activated by their activation configuration or the <activeProfiles> section in settings.xml.
    Profiles can be activated in the Maven settings, via the <activeProfiles> section.
    This section takes a list of <activeProfile> elements, each containing a profile-id inside.
    
    E.g:
    ====
    mvn groupId:artifactId:goal -P profile-1,profile-2
     -D, --define <arg>
    Defines a system property
    
    mvn clean install -PDevAppInstall -Dpassword-dev="admin"
    password-dev is a properties file
