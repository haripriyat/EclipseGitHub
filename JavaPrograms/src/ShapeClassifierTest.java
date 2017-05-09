
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.Before;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ShapeClassifierTest {
	private String inputShapeArgs;

	
	private String expectedResult;
	private ShapeClassifier shapeClassifier;

	@Before
	public void initialize() {
		shapeClassifier = new ShapeClassifier();
	}

	// Each parameter should be placed as an argument here
	// Every time runner triggers, it will pass the arguments
	// from parameters we defined in primeNumbers() method


	
	public ShapeClassifierTest(String inputShapeArgs,
			String expectedResult) {
      this.inputShapeArgs = inputShapeArgs;

      this.expectedResult = expectedResult;
   }

	@Parameterized.Parameters
	public static Collection shapeParams() {
		return Arrays.asList(new Object[][] {
			 {"null,null,null,10,,,","No"}, {"Ellipse,Large,No,60,41","No"},{"Ellipse,Small,Yes,103,90,,","No"},{"Ellipse,Small,Yes,3,3,,","No"},
			 {"Equilateral,Large,No,70,70,70","No"}, {"Rectangle,Large,Yes,100,104,100,104","Yes"} , {"Square,Large,Yes,100,100,100,100","Yes"}
			 ,{"Rectangle,Large,No,92,24,46,90,92", "No"},			
			
			
			{ "Ellipse,Small,null,78,92,,", "No" },   { "Ellipse,Large,Yes,102,68,,", "Yes" } ,
			 { "Scalene,Large,Yes,100,103,104,", "Yes" } , { "Isosceles,Small,Yes,2,4,4,", "Yes" } 
			 
			 , {"Line,Small,Yes,8,,,", "Yes"}, {"null,null,null,106,,,","No"},
			 {"Line,Large,Yes,202","Yes"},

			 
			 {"Circle,Large,null,76,89,,", "No"}, {"Circle,Small,No,90,101,,", "No"},
			 {"Equilateral,null,No,92,24,46,", "No"}
			 
			 
			 
			

		});
	}

	// This test will run 4 times since we have 5 parameters defined
	@Test
	public void testShapeClassifier() {
		System.out.println("Parameterized Number is : " + inputShapeArgs);
		assertEquals(expectedResult, shapeClassifier.evaluateGuess(inputShapeArgs));
	}
	 

}