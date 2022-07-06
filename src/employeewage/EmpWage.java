package employeewage;

public class EmpWage {

	public static void main(String[] args) {
			System.out.println("Welcome to employee wage computation");
				/**
				 * generating random number 0, 1, 2 
				 * if o then Employee is Absent
				 * if 1 then present
				 * if 2 then Employee is doing Half day
				 */
			int employeePresent=1;
			int wagePerhour=20;
			int empHour=8;
			int ispresent= (int) (Math.floor(Math.random()*10)%2);
			if(ispresent==employeePresent) {
				System.out.println("Employee is Present");
			System.out.println("Employee Wage for day=" +empHour*wagePerhour);
			}
			else {
				System.out.println("Employee is Absent");
				System.out.println("Employee Wage for day= 0");

		}
	}
}
