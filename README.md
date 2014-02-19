#Doco
Doco (Document Converter) is a lightweight Java library used to convert (from and to) indexed Documents provided by Search API in Google App Engine.

### Homepage
http://www.vidolima.com/projects/doco

# How to Use Doco


### @DocumentId
Doco by default assume the name of the class as index id
```java
// the name of the index id will be "Foo"
@Document
public class Foo {}
```

But you can set the index id as you want using the parameter "name"
```java
@Document(name = "customIndexId")
public class Foo {}
```

### Requirements
* Java 1.5+
* Google App Engine Java SDK 1.8.5+

### TODO
* Default type for: NUMBER, DATE and GEO_POINT
* Convert collections

### See Also
Search API documentation
https://developers.google.com/appengine/docs/java/search/

### License
Doco is released under the terms of the MIT license.
