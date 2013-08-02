SemaGrow GreenHouse
===================

Usage Instructions
------------------

Paste this snippet into your ``pom.xml`` to declare dependencies

    <dependency>
        <groupId>eu.semagrow</groupId>
        <artifactId>semagrow-greenhouse</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>

You also need to state in your ``pom.xml`` from which repository it should fetch the dependency

    <repositories>
        <repository>
            <id>SemaGrowGreenHouse-mvn-repo</id>
            <url>https://raw.github.com/semagrow/SemaGrowGreenHouse/mvn-repo/</url>
            <snapshots>
                <enabled>true</enabled>
                <updatePolicy>always</updatePolicy>
            </snapshots>
        </repository>
    </repositories>

Building From Source
--------------------

This is the central place to build the SemaGrow Component Stack for local deployment. Therefore, the following
software/tools are required:

* [Maven 3](http://maven.apache.org/)
* [JDK 1.7](http://www.oracle.com/technetwork/java/javase/downloads/jdk7-downloads-1880260.html)

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

in the respective module subdirectory to ensure it proper integration.