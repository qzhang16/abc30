# demo jsonschema2pojo-maven-plugin with spring boot multiple module
# regarding to deploy 
- "failed to retrieve remote metadata..." this error message is very confusing. Actual root cause is related to the username and password setting. Basically, have to carefully check the user id and password on the repo server settings.
-  to check username and password on Aliyun devops, Enterprise settings -> user management.

# maven release plugin to help scm to github
- setup ssh connection to github from my WSL.
- add maven-release-plugin into the build section.
- add scm with '''
<developerConnection>scm:git:git@github.com:qzhang16/abc30.git</developerConnection>
		<url>https://github.com/qzhang16/abc30</url>
    '''
- run mvn clean release:prepare to input tag info and launch the relase process.

    
