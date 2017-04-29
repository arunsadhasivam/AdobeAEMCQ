in Eclipse you can see AEM server , you could see AEM server only to
the project which is connected to crx.

NOTE:
====
if you give the below command only ui.apps is connect /sync to crx. hence when for instance
you create a NEW SERVER  > Adode > Adobe Experience Manager> select the Maven module projects.

NOTE:
=====
To avoid issues close all maven module which create in view. have only one root project which has
all other projects like core,ui.apps,dependencies.

    -webapi 
        -core
         -ui.apps
         -dependencies.


G:\workspace\AEM\webapi\ui.apps\src\main\content\jcr_root>vlt --credentials admi
n:admin co --force http://localhost:4502/crx
