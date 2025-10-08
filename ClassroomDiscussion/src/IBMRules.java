
public class IBMRules {
	String useAppliances = "Employees can use the appliances";

	void access(Employee e) throws IllegalUsageException {
		if (e.employmentType.equalsIgnoreCase("freshers")) {
			throw new IllegalUsageException();
		}
		else {
			System.out.println("Just ignore the cow dung");
		}
	}
	//if the employee is fresh grads, and of they try to use it, throw illegalusageexception
}
