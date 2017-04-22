STEP 1:
=======
Need maven  "content-package-maven-plugin" to make the package as content. to generate as zip file.


      <project xmlns="http://maven.apache.org/POM/4.0.0" 
      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
      <modelVersion>4.0.0</modelVersion>
      <parent>
        <groupId>org.scim</groupId>
        <artifactId>scim</artifactId>
        <version>0.0.1-SNAPSHOT</version>
      </parent>
      <artifactId>dependencies</artifactId>
      <name>dependencies</name>
      <packaging>content-package</packaging>

      <description>Maven Dependencies</description>

      <properties>
        <dirPath>${project.build.directory}/${project.artifactId}-${project.version}/jcr_root</dirPath>
      </properties>



      <build>
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
       </plugins>
      </build> 

    </project>
