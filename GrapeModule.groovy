@Grapes(
    @Grab(group='org.apache.commons',module='commons-lang3',version='3.4')
)
import org.apache.commons.lang3.text.WordUtils
String name = "Olimpian Anthony Adam"
WordUtils wu=new WordUtils()
println wu.initials(name)

//This will download the dependencies from maven and provide the output as initials
//http://docs.groovy-lang.org/latest/html/documentation/grape.html
//JDBC drivers,
/*
@GrabConfig(systemClassLoader=true)
@Grab(group='mysql', module='mysql-connector-java', version='5.1.6')
*/
/*Apache Commons
https://commons.apache.org/proper/commons-lang/javadocs/api-release/org/apache/commons/lang3/text/package-summary.html
https://commons.apache.org/proper/commons-lang/javadocs/api-release/org/apache/commons/lang3/text/WordUtils.html#initials-java.lang.String-
*/

//Maven
//https://search.maven.org/artifact/com.hynnet/commons-lang3/3.4/jar