To make jar availables for all modules like ui.apps,ui.content,core dependencies project is needed.

STEPS 1:
========
create a depencies project by create NEW > maven Module > select webapi for e.g as root maven project.

STEP 2:
=======
while creating "select check box  saying basic architype project " so dependencies bundle , content creation can be avoided.

STEP 3:
=======
Add dependencies project to root maven if not added in < module > webapi.dependencies < / module> tag.

STEP 4:
=======

IMPORTANT:
===========
best to close the reference project  to avoid issue.

maven root project itself enough since project structure below should alone be open.

	 -webapi(ROOT BELOW ALL ARE SUB MODULES UNDER ROOT)
   	    -core
            -ui.apps
            -ui.content
            -webapi.dependencies.

