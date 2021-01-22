[![License: GPL v3](https://img.shields.io/badge/License-GPLv3-blue.svg)](https://www.gnu.org/licenses/gpl-3.0)

**Help me build more open-source projects by becoming my sponsor.*

# JPA to CDI Events

This project will convert JPA events (create, update, remove) to CDI.

A typical use case would be if you wanted to received a notification whenever an entity has been modified
and do some processing afterwards like triggering a script.

## Execution

To run this application you must have docker installed on your local machine.

Run Wildfly in docker with the following command:

```sh
docker run --name wildfly_21 -p 8080:8080 -p 9990:9990 -it jboss/wildfly:21.0.1.Final /opt/jboss/wildfly/bin/standalone.sh -b 0.0.0.0 -bmanagement 0.0.0.0
```

Set the Wildfly admin and password by running WILDFLY_HOME/bin/add-user.bat.

```sh
docker exec -it wildfly_21 /opt/jboss/wildfly/bin/add-user.sh
```

With the following choices:

Type of user: Management User

User: admin

Details of new user: a. Update the existing user and password and roles

Password: admin

Group: Admin

Deploy and run this application in Wildfly using maven (must be executed in the project's root directory):

```sh
mvn install wildfly:deploy
```

It will prompt for username and password. Enter admin/admin.

Check the log in Wildfly and you should see the observer logs.

To undeploy:

```sh
mvn wildfly:undeploy
```

See our example for Spring https://github.com/czetsuya/jpa-to-spring-events

## Authors

 * **Edward P. Legaspi** - *Java Architect* - [czetsuya](https://github.com/czetsuya)
