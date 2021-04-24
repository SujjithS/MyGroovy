//Groovy Operators

/*
find operator(=~)    - you can directly use the find operator =~ to build a java.util.reger.Matcher instance

match operator(==~)    - The match operator (==~) is a slight variation of the find operator, that does not return a Matcher but a boolean and requires a strict match of the input string:

Pattern Operator(~string)    - The pattern operator (~) provides a simple way to create a java.util.regex.Pattern instance:
*/

//Regex Expressions(Regular expressions)        https://www.regular-expressions.info/refquick.html

/*
abc     - matches any string that contains a followed b followed by c

b[aeiou]t    - matches "bat","bet","bit","bot" & "but"

<TAG\b[^>]*>(.*?)</TAG>    - matches the opening and closing pair of a specific HTML tag

\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}\b    -matches any email address

*/

//----------------------------------------------------------------------------------------------//

//Java sample pattern

import java.util.regex.*;
Pattern pattern=Pattern.compile("abc")
Pattern pattern1=Pattern.compile("a\\b")    //if you want to print a/b you need to give a//b
println pattern
println pattern1
println pattern.class
println pattern1.class

//What patterns will look like in Groovy

String slashy=/a\b/
println slashy.class    //This will be a trouble when the input is https://neginflictions.blogsop.com/blog1/

String url=$/https://neginflictions.blogsop.com/blog1/$
println url.class

def pattern2 = ~/a\b/
println pattern.class

// Find | Match
//Find
def text="of all the jin joints in the whole town, whole world, she walked into mine"
def text1="all the jin joints"
def pattern = ~/all the jin joints/
def finder= text=~pattern
println finder    //prints an instance - java.util.regex.Matcher[pattern=all the jin joints region=0,74 lastmatch=]
println finder.size()    //1
//Match
def matcher = text==~pattern
println matcher    //false- since the matcher and the text is not the entire match
def matcher1 = text1==~pattern
println matcher1    //true- since text1 and pattern are exact matches

if(matcher1)
{print "it is a perfect match"}

//Replace the found string literal using replaceFirst()

def text="of all the jin joints in the whole town, whole world, she walked into mine"
def pattern = ~/jin joints/
text=text.replaceFirst(pattern,"Beer parlor")
println text