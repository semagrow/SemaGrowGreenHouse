SemaGrow GreenHouse
===================

Building From Source
--------------------

This is the central place to build the SemaGrow Component Stack for local deployment. Therefore, the following
software/tools are required:

* Maven 3
* JDK 1.6

To build the stack, clone this repository, change to the newly created directory and execute

    mvn clean install

Building .rpm and .deb packages can be done by

    mvn rpm::rpm (not yet supported)

Project Structure and Contribution Notes
----------------------------------------

The project consists of multiple modules, two in it's initial phase:

* A testservice for demonstration purposes that converts a passed string to uppercase
* A web application that integrates all service modules and provides GUI

Contributors are expected to create their modules in a similar way as shown by the ``uppercase-testservice``. Components
intended for access via the web frontend must be provided as Java classes and annotated as
[Spring framework](http://www.springsource.org/spring-framework) components (cf. ``Uppercase.java``). Therefore, the
``pom.xml`` of each module must contain dependencies to the Spring framework (cf. ``uppercase-testservice/pom.xml``).

Each module must be able to build independently by executing

    mvn clean install

to ensure it can be properly integrated.