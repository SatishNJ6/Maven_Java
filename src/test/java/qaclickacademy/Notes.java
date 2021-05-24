package qaclickacademy;

/**
 * Hello world!
 *
 */
public class Notes

{
	public static void main(String[] args)
	// 1. qaclickacademy is GroupID in pom.xml file
	// 2. MavenJava is ArtifactID in pom.xml file

	// 3. Selenium, RestAPI and Appium uses the same java API
	// 4. created 2 test cases in each class
	// 5. maven sure-fire plugin is used to run all the test cases present in
	// src/test/java folder in maven project(IQ)

	// 6. mvn clean deletes all the temporary files in project(this has to be
	// executed from project level)

	// 7. mvn compile is used to check the syntax errors in code, will be useful in
	// jenkins bcoz there we cant debug the code

	// 8. mvn test triggers the actual test execution

	// 9. first we need to clean the project, then compile, finally we have to
	// execute test cases

	// 10. if we give only mvn test, it will clean, compile and execute the test
	// cases, will be useful in jenkins

	// 11. mvn test first it will go to project(local) folder .m2 folder and checks
	// for all the dependencies, first it will check in local folder, if it is not
	// available here, then it will go and search in maven repository

	// 12. we can ran test case in cmd prompt by navigating to that project folder
	// even after closing eclipse, for this class names should contain "Test' at the
	// end of class names in project and also @Test in methods - running tc at test
	// folder level

	// 13. we can run all the test classes at one shot in TestNg.xml file by
	// integrating with maven, with the help of maven sure-fire plugin by
	// configuring xml file in pom.xml configurations - running
	// test cases in testng xml file

	// 14. running single class in cmd prompt -> mvn -Dtest-classname Test

	// 15. Maven profiling-> this profiling is used to run specific suites like
	// regression ,smoke..etc(refer to profiles configurations in pom.xml), create 2
	// separate
	// testng.xml files for smoke and regression -> command to run in cmd prompt ->
	// mvn test -pRegression, now it runs only Regression suite, same thing for
	// other suites -> mvn test -pSmoke
	{
		System.out.println("Hello World!");
	}
}
