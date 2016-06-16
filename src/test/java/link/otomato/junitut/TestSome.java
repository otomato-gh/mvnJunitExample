package link.otomato.junitut;
 
import static junit.framework.TestCase.fail;
import org.junit.Test;
 
public class TestSome {
	 
	    @Test
		        public void testcaseFirst()
			    {
				            System.out.println("First testcase executed");
					        }
	     
	        @Test
			    public void testcaseSecond()
			        {
					        System.out.println("Second testcase executed");
						fail("Accessed the element which does not exist");
						    }
		 
		    @Test
			        public void testcaseThird()
				    {
					            System.out.println("Third testcase executed");
						        }
		     
		        @Test
				    public void otherTestcase()
				        {
						        System.out.println("Another testcase executed");
							    }
}
