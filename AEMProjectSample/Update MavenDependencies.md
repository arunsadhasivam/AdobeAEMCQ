Maven Dependencies:
===================
once you Add the project , it is better to do Right click Maven>  Update Project and check 
project Build path Maven Dependencies is without error. 

Important:
==========
Reason is if your pom.xml have < systempath> tag to download from current local repository maven wont work. since it
needs  jar to bind with the artificat in the < dependency> tag like below.

E.g:
====
below the jar name is webservice_API.0.0.0.jar in this Artificat as maven convention is webservice_API if
the same is present below it works without any problem if in case i rename the jar to webservice_API_1 then i need to
update the below xml as  <systemPath>${project.basedir}/lib/webservice_API_1.0.0.jar</systemPath> and then update Maven Project to
make it bind locally.

    <dependency>
        <groupId>com.sforce.ws</groupId>
        <artifactId>webservice_API</artifactId>
        <version>1.0.0</version>
        <scope>system</scope>
        <systemPath>${project.basedir}/lib/webservice_API.0.0.jar</systemPath>
      </dependency>



