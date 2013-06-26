# openshift-resthub-jpa-quickstarts

Create your gear with the jbossews2.0 cartridge or with the [tomcat 7.0 community](https://github.com/AtosWorldline/openshift-cartridge-tomcat-community).

Create a Resthub JPA project 

    $ mvn archetype:generate -DarchetypeArtifactId=resthub-jpa-backbonejs-archetype -DarchetypeGroupId=org.resthub -DarchetypeVersion=2.1.0

Add `.openshift` dir : https://github.com/Filirom1/openshift-resthub-jpa-quickstarts/commit/10d28fb82a87b256d2c611e0eb8d4d7a77bc1f91

Change your pom.xml to deploy a `ROOT.war` into the `webapps` openshift directory. : https://github.com/Filirom1/openshift-resthub-jpa-quickstarts/commit/f92e39e2930b78995146df03966ddf04b45ab4bf

Fix home page : https://github.com/Filirom1/openshift-resthub-jpa-quickstarts/commit/241840ecb3e3a8dc19353a01fb22d3756369634c

Connect to MySQL : https://github.com/Filirom1/openshift-resthub-jpa-quickstarts/commit/6786a30bd4ec30da1c3535cbf36f5736d03d488d
