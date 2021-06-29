# The Official DocuSign Monitor Java Client

[![Build status][travis-image]][travis-url]
[![Maven Central status][maven-image]][maven-url]

## Requirements

- Java 1.9+
- Free [Developer Sandbox](https://go.docusign.com/sandbox/productshot/?elqCampaignId=16531)

## Compatibility

- Java 1.9+

## Note

This open-source SDK is provided for cases where you would like to make additional changes that the SDK does not
 provide out-of-the-box. If you simply want to use the SDK with any of the examples shown in the [Developer Center ](https://developers.docusign.com/monitor-api/code-examples), follow the installation instructions below.

## Installation

Note: DocuSign uses **Eclipse** with **Maven** for testing purposes.

### Maven:

1. In Eclipse, create a new project by selecting **File** -> **New** -> **Project**.
2. In the **New Project Wizard** , expand **Maven** , then select **Maven Project.**
3. Leave **Create a simple project** unchecked.
4. Select **Next** , then provide a unique **Group** and **Artifact Id**.
5. In the directory where you've saved your project, open the _pom.xml_ file.
6. In the _pom.xml_ file, locate the **dependencies** node.
7. Add:

```
<dependency>
  <groupId>com.docusign</groupId>
  <artifactId>docusign-monitor-java</artifactId>
  <version>1.0.0</version>
</dependency>
```

8. If your project is still open, restart **Eclipse**.

## Dependencies

This client has the following external dependencies:

- io.swagger:swagger-annotations:jar:1.5.17
- org.glassfish.jersey.core:jersey-client:jar:2.29.1
- org.glassfish.jersey.media:jersey-media-multipart:jar:2.29.1
- org.glassfish.jersey.media:jersey-media-json-jackson:2.29.1
- com.fasterxml.jackson.core:jackson-core:jar:2.10.1
- com.fasterxml.jackson.core:jackson-annotations:jar:2.10.1
- com.fasterxml.jackson.core:jackson-databind:2.10.1
- com.fasterxml.jackson.datatype:jackson-datatype-joda:jar:2.10.1
- com.brsanthu:migbase64:2.2
- junit:junit:jar:4.12
- com.apache.oltu.oauth2:org.apache.oltu.oauth2.client:1.0.2
- com.auth0:java-jwt:3.4.1
- org.bouncycastle:bcprov-jdk15on:1.60

## OAuth Implementations

For details regarding which type of OAuth grant will work best for your DocuSign integration, see the [REST API
 Authentication Overview](https://developers.docusign.com/monitor-api/guides/auth) guide located on the [DocuSign Developer Center](https://developers.docusign.com/).

For security purposes, DocuSign recommends using the Authorization Code Grant flow.

## Support

Log issues against this client through GitHub. We also have an [active developer community on Stack Overflow](https://stackoverflow.com/questions/tagged/docusignapi).

## License

The DocuSign Java Client is licensed under the [MIT License](https://github.com/docusign/docusign-monitor-java-client/blob
/master/LICENSE).


[travis-image]: https://img.shields.io/travis/docusign/docusign-monitor-java-client.svg?style=flat
[travis-url]: https://travis-ci.org/docusign/docusign-monitor-java-client
[maven-image]: https://img.shields.io/maven-central/v/com.docusign/docusign-monitor-java.svg?style=flat
[maven-url]: https://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.docusign%22

### Additional Resources
* [DocuSign Developer Center](https://developers.docusign.com)
* [DocuSign API on Twitter](https://twitter.com/docusignapi)
* [DocuSign For Developers on LinkedIn](https://www.linkedin.com/showcase/docusign-for-developers/)
* [DocuSign For Developers on YouTube](https://www.youtube.com/channel/UCJSJ2kMs_qeQotmw4-lX2NQ)
