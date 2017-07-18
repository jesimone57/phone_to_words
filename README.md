# Phone Number to a List of Words

Example Java code of how to convert any N digit phone number to a list of
corresponding words formed from the phone key pad digits 0 through 9.  
Note:  key pad number 0 and 1 do not map to any letters.
<p/>
This solution is a completely original solution and does not use recursion or a 
stack to create the result set.
<p/>
This example code comes with a set of unit tests to validate and verify the 
correct operation of the code.  Note, edge cases are also considered.

### Prerequisites
* Java 1.7+
* git
* maven 3.3+

### To execute the code
* git clone https://github.com/jesimone57/phone_to_words.git
* mvn clean compile
* mvn test
* mvn exec:java -Dexec.mainClass="phonetowords.PhoneToWords"

### Unit test results
<pre>
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] Building phone_to_words 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ phone_to_words ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 0 resource
[INFO] 
[INFO] --- maven-compiler-plugin:3.3:compile (default-compile) @ phone_to_words ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ phone_to_words ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/jsimone/projects/phone_to_words/src/test/resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.3:testCompile (default-testCompile) @ phone_to_words ---
[INFO] Nothing to compile - all classes are up to date
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ phone_to_words ---
[INFO] Surefire report directory: /Users/jsimone/projects/phone_to_words/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running phonetowords.PhoneToWordsTest
Tests run: 9, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.067 sec - in phonetowords.PhoneToWordsTest

Results :

Tests run: 9, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.893 s
[INFO] Finished at: 2017-07-18T10:34:46-04:00
[INFO] Final Memory: 11M/309M
[INFO] ------------------------------------------------------------------------
</pre>

### Sample Ouput
<pre>
Phone Number: 9677549
WMPPJGW
WMPPJGX
WMPPJGY
WMPPJGZ
WMPPJHW
WMPPJHX
WMPPJHY
WMPPJHZ
WMPPJIW
WMPPJIX
WMPPJIY
WMPPJIZ
WMPPKGW
WMPPKGX
WMPPKGY
WMPPKGZ
...
ZOSSLHY
ZOSSLHZ
ZOSSLIW
ZOSSLIX
ZOSSLIY
ZOSSLIZ
Total Number of words: 6912
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.600 s
[INFO] Finished at: 2017-07-18T10:15:41-04:00
[INFO] Final Memory: 12M/309M
[INFO] ------------------------------------------------------------------------
</pre>