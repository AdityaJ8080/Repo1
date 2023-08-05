package tc1;

import java.util.ArrayList;
import java.util.List;

public class TestCaseCreator {
	public static void main (String[] args) {
		
	TestCase tc1 = new TestCase();
	tc1.TestCaseId = 01;
	tc1.TestCaseName = "testcase for usability";
	tc1.TestCaseDesc = "Test for Font sizes and element alignments in a web page";
	
	TestStep ts1 = new TestStep();
	ts1.TestStepNumber = 01;
	ts1.StepDesc = "usability";
	ts1.StepExpected = "Allignment hould appear";
	
	TestStep ts2 = new TestStep();
	ts2.TestStepNumber = 02;
	ts2.StepDesc = "font size";
	ts2.StepExpected = "Arial should appear";

	List<TestStep> StepList = new ArrayList<>();
	StepList.add(ts1);
	StepList.add(ts2);
	
	tc1.TestSteps = StepList;
	
	System.out.println(tc1.TestCaseName);
	System.out.println(tc1.TestSteps.get(0).StepDesc);	
	}
}
