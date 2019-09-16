package HW3;



public class IsGrimString implements Comp730830StringUtils {
	public Object doWork (String args) {

	public boolean doWorkReturnBoolean(String args) {
		

		String str = "welcome to grgr";  /** given a string */

		if(str.contains("grgr")) {    /** looking to see if the string contains grgr */
			System.out.println("is_grim");   /** print if true */
		}
		else
			System.out.println("isnot_grim");   /** print if not true */

	}

public String getMyName() {
	return "IsGrimString() Class";
}