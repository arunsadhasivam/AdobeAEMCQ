
STEP 1:
========
install vault by download from adobe aem cloud

https://www.adobeaemcloud.com/content/companies/public/adobe/filevault/filevault.html

or else it has in /opt directly just unzip it.

unzip C:\AEM New Server\crx-quickstart\opt\filevault\filevalut.zip which is default there.

C:\AEM\crx-quickstart\opt\filevault\filevault\vault-cli-3.1.6\bin.


STEP 2:
=======

Add C:\AEM New Server\crx-quickstart\opt\filevault\vault-cli-3.1.6\bin to path system environment variable. to run
from command prompt.

STEP 3:
=======
Checking out the repository 

command:
========
    
    c:\Arun> svn co http://svn.server.com/repos/myproject
    
STEP 4:
=======

Synchronizing with the repository
==================================

You need to synchronize filevault with the repository. To do this:
In the command line, navigate to content/jcr_root.
Check out the repository by typing the following (substituting your port number for 4502 and your admin passwords):

Two ways to check out project

1)command line:
===============
       	
    c:\Arun> vlt --credentials admin:admin co --force http://localhost:4502/crx
   
2)vaultClipse:
===============
check whether any vaultclipse shown else  check below:

go to Help > installation Details > Installed software > VaultClipse > Update.


To check out files from CRX repository create following directory structure:

    ├───jcr_root
    └───META-INF
           └───vault

Under vault folder create filter.xml file with below content and save the file

    <?xml version="1.0" encoding="UTF-8"?>
    <workspaceFilter version="1.0">
    <filter root="/apps/apps">
        <exclude pattern="/apps/TestWeb/content" />
    </filter>
    <filter root="/apps/TestWeb/" />
    <filter root="/etc/design/apps" />
    </workspaceFilter>

Now open command prompt and go to "jcr_root" folder and enter command - "vlt --credentials : co http://localhost:4502/crx --force", this will check out all files under "/apps/TestWeb/" which we defined in filter.xml file. We can also exclude files by using exclude tag based on the need.

it ignore /apps/TestWeb/content folder.




