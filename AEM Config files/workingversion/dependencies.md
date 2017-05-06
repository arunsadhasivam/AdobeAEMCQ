    <project>
      <parent>
        <artifactId>test</artifactId>
        <groupId>com.test</groupId>
        <version>0.0.1-SNAPSHOT</version>
        <relativePath>../pom.xml</relativePath>
      </parent>
      <!-- ====================================================================== -->
      <!-- P R O J E C T D E S C R I P T I O N -->
      <!-- ====================================================================== -->
      <artifactId>test.dependencies</artifactId>
      <packaging>content-package</packaging>
      <name>test - Dependencies</name>
      <description>Dependency Bundle for test</description>
      <properties>
        <dirPath>${project.build.directory}/${project.artifactId}-${project.version}/jcr_root</dirPath>
      </properties>


      </project>


       <build>
        <sourceDirectory>src/assembly</sourceDirectory>
        <resources>
          <resource>
            <filtering>false</filtering>
            <directory>${dirPath}</directory>
            <excludes>
              <exclude>**/.vlt</exclude>
              <exclude>**/.vltignore</exclude>
            </excludes>
          </resource>
        </resources>
        <plugins>
          <plugin>
            <groupId>com.day.jcr.vault</groupId>
            <artifactId>content-package-maven-plugin</artifactId>
            <extensions>true</extensions>
            <executions>
              <execution>
                <phase>package</phase>
                <goals>
                  <goal>package</goal>
                </goals>
              </execution>
            </executions>
          </plugin>
          <plugin>
            <artifactId>maven-assembly-plugin</artifactId>
            <executions>
              <execution>
                <phase>prepare-package</phase>
                <goals>
                  <goal>single</goal>
                </goals>
              </execution>
            </executions>
            <configuration>
              <appendAssemblyId>false</appendAssemblyId>
              <descriptors>
                <descriptor>src/assembly/assembly.xml</descriptor>
              </descriptors>
              <finalName>vault-work</finalName>
            </configuration>
          </plugin>
          <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-resources-plugin</artifactId>
            <executions>
              <execution>
                <phase>package</phase>
                <goals>
                  <goal>resources</goal>
                </goals>
              </execution>
            </executions>
            <configuration>
              <includeEmptyDirs>true</includeEmptyDirs>
            </configuration>
          </plugin>
        </plugins>
      </build>
      <!-- ====================================================================== -->
      <!-- P R O F I L E S -->
      <!-- ====================================================================== -->
      <profiles>
        <profile>
          <id>autoInstallPackage</id>
          <activation></activation>
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
                  <targetURL>http://${aem.host}:${aem.port}/crx/packmgr/service.jsp</targetURL>
                  <failOnError>true</failOnError>
                  <failOnMissingEmbed>true</failOnMissingEmbed>
                </configuration>
              </plugin>
            </plugins>
          </build>
        </profile>
  </project>
