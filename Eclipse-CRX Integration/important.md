It is very important to remember that every time you open eclipse it is important done this.


NOTE:
====
only ui.apps has facility to export files to server.
right click on ui.apps main project not project under webapi only ui.apps separate module> 
i.e only 

important:
==========
    c:\AEM\ui.apps  support Export to crx functionality.
    c:\AEM\webapi\ui.apps  does not support Export to crx functionality.

Repository AEMserver(instance created manually)
will apply export filter from ui.apps/src/main/content/META-INF/valut/filter.xml


STEP 1:
=======
right click project > Maven > Update Project to make sure that the project pom.xml 
is in sync with the project workspace.

STEP 2:
=======
connect to server using below command:

G:\workspace\AEM\webapi>vlt --credentials admin:admin co --force http://localhost:4502/crx



STEP 3:
======
double click on the AEM server and change the port if it is first time to 4502.
Start the AEM server.

Make sure the port is correct , else you get below error.

    No repository found at http://localhost:8080/
    http://localhost:8080/server/-/jcr:root : Unauthorized
    http://localhost:8080/crx/-/jcr:root : Unauthorized
    No repository found at http://localhost:8080/
    http://localhost:8080/server/-/jcr:root : Unauthorized
    http://localhost:8080/crx/-/jcr:root : Unauthorized


STEP 4:
======
once server started able to check in to the crx AEM server.


CAUTION:
========
As you can see it send handshake to authorize eclipse by copying file  C:\Users\HOME\.vault\auth.xml.
so when copied files from local or overriding file make sure this file not get overrided 

    G:\workspace\AEM\webapi\jcr_root>vlt --credentials admin:admin co --force http:/
    /localhost:4502/crx
    Java HotSpot(TM) 64-Bit Server VM warning: ignoring option PermSize=128m; suppor
    t was removed in 8.0
    Checkout http://localhost:4502/crx/server/-/jcr:root/ with local files using roo
    t at G:\workspace\AEM\webapi\jcr_root
    Connecting via JCR remoting to http://localhost:4502/crx/server
    [WARN ] Credentials for http://localhost:4502/crx/server/-/jcr:root/ updated in
    C:\Users\HOME\.vault\auth.xml.
    Checking out / to .


Auth.xml file
=============
>C:\Users\HOME\.vault\auth.xml
=========================================================

    <?xml version="1.0" encoding="UTF-8"?>
    <auth version="1.0">
      <repository uri="http://localhost:4502/crx/server/null">
        <credentials type="simple">
          <user name="admin" password="{DES}91ae948f163e084946ca0cb101170d7b"/>
        </credentials>
      </repository>
    </auth>
