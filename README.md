# Phone Number to a List of Words

Example Java code of how to convert any N digit phone number to a list of
corresponding words formed from the phone key pad digits 0 through 9.  
<br/>
![Telephone Keypad](../master/Telephone-keypad.png)
<br/>
**Note:  key pad number 0 and 1 do not map to any letters.**
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
* mvn exec:java -Dexec.mainClass="phonetowords.PhoneToWords" -Dexec.args="4261408"


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
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to /Users/jsimone/projects/phone_to_words/target/test-classes
[INFO] 
[INFO] --- maven-surefire-plugin:2.18.1:test (default-test) @ phone_to_words ---
[INFO] Surefire report directory: /Users/jsimone/projects/phone_to_words/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running phonetowords.PhoneToWordsTest
Tests run: 14, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.2 sec - in phonetowords.PhoneToWordsTest

Results :

Tests run: 14, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.514 s
[INFO] Finished at: 2017-07-18T18:00:03-04:00
[INFO] Final Memory: 17M/304M
[INFO] ------------------------------------------------------------------------
</pre>

### Sample Output 1
<pre>
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] Building phone_to_words 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- exec-maven-plugin:1.6.0:java (default-cli) @ phone_to_words ---
Phone Number: 228
AAT
AAU
AAV
ABT
ABU
ABV
ACT
ACU
ACV
BAT
BAU
BAV
BBT
BBU
BBV
BCT
BCU
BCV
CAT
CAU
CAV
CBT
CBU
CBV
CCT
CCU
CCV
Total Number of words: 27
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.459 s
[INFO] Finished at: 2017-07-18T18:05:25-04:00
[INFO] Final Memory: 12M/245M
[INFO] ------------------------------------------------------------------------
</pre>


### Sample Output 2
<pre>
[INFO] Scanning for projects...
[INFO] 
[INFO] ------------------------------------------------------------------------
[INFO] Building phone_to_words 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] --- exec-maven-plugin:1.6.0:java (default-cli) @ phone_to_words ---
Phone Number: 4261408
GAMGT
GAMGU
GAMGV
GAMHT
GAMHU
GAMHV
GAMIT
GAMIU
GAMIV
GANGT
GANGU
GANGV
GANHT
GANHU
GANHV
GANIT
GANIU
GANIV
GAOGT
GAOGU
GAOGV
GAOHT
GAOHU
GAOHV
GAOIT
GAOIU
GAOIV
GBMGT
GBMGU
GBMGV
GBMHT
GBMHU
GBMHV
GBMIT
GBMIU
GBMIV
GBNGT
GBNGU
GBNGV
GBNHT
GBNHU
GBNHV
GBNIT
GBNIU
GBNIV
GBOGT
GBOGU
GBOGV
GBOHT
GBOHU
GBOHV
GBOIT
GBOIU
GBOIV
GCMGT
GCMGU
GCMGV
GCMHT
GCMHU
GCMHV
GCMIT
GCMIU
GCMIV
GCNGT
GCNGU
GCNGV
GCNHT
GCNHU
GCNHV
GCNIT
GCNIU
GCNIV
GCOGT
GCOGU
GCOGV
GCOHT
GCOHU
GCOHV
GCOIT
GCOIU
GCOIV
HAMGT
HAMGU
HAMGV
HAMHT
HAMHU
HAMHV
HAMIT
HAMIU
HAMIV
HANGT
HANGU
HANGV
HANHT
HANHU
HANHV
HANIT
HANIU
HANIV
HAOGT
HAOGU
HAOGV
HAOHT
HAOHU
HAOHV
HAOIT
HAOIU
HAOIV
HBMGT
HBMGU
HBMGV
HBMHT
HBMHU
HBMHV
HBMIT
HBMIU
HBMIV
HBNGT
HBNGU
HBNGV
HBNHT
HBNHU
HBNHV
HBNIT
HBNIU
HBNIV
HBOGT
HBOGU
HBOGV
HBOHT
HBOHU
HBOHV
HBOIT
HBOIU
HBOIV
HCMGT
HCMGU
HCMGV
HCMHT
HCMHU
HCMHV
HCMIT
HCMIU
HCMIV
HCNGT
HCNGU
HCNGV
HCNHT
HCNHU
HCNHV
HCNIT
HCNIU
HCNIV
HCOGT
HCOGU
HCOGV
HCOHT
HCOHU
HCOHV
HCOIT
HCOIU
HCOIV
IAMGT
IAMGU
IAMGV
IAMHT
IAMHU
IAMHV
IAMIT
IAMIU
IAMIV
IANGT
IANGU
IANGV
IANHT
IANHU
IANHV
IANIT
IANIU
IANIV
IAOGT
IAOGU
IAOGV
IAOHT
IAOHU
IAOHV
IAOIT
IAOIU
IAOIV
IBMGT
IBMGU
IBMGV
IBMHT
IBMHU
IBMHV
IBMIT
IBMIU
IBMIV
IBNGT
IBNGU
IBNGV
IBNHT
IBNHU
IBNHV
IBNIT
IBNIU
IBNIV
IBOGT
IBOGU
IBOGV
IBOHT
IBOHU
IBOHV
IBOIT
IBOIU
IBOIV
ICMGT
ICMGU
ICMGV
ICMHT
ICMHU
ICMHV
ICMIT
ICMIU
ICMIV
ICNGT
ICNGU
ICNGV
ICNHT
ICNHU
ICNHV
ICNIT
ICNIU
ICNIV
ICOGT
ICOGU
ICOGV
ICOHT
ICOHU
ICOHV
ICOIT
ICOIU
ICOIV
Total Number of words: 243
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 0.519 s
[INFO] Finished at: 2017-07-18T18:12:05-04:00
[INFO] Final Memory: 12M/309M
[INFO] ------------------------------------------------------------------------
</pre>