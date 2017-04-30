It is very important to remember that every time you open eclipse it is important done this.


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

