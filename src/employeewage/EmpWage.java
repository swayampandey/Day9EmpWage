package employeewage;

public class EmpWage {

	public static void main(String[] args) {
			System.out.println("Welcome to employee wage computation");
				/**
				 * generating random number 0, 1, 2 
				 * if o then Employee is Absent
				 * if 1 then present
				 * if 2 then Employee is doing Half day
				 * initializing variables
				 */
			int employeePresent=1;
			int employeePartTime=2;
			int EmpHours=8;
			int PartTimeHour=4;
			int WagePerHour=20;
			int WorkingdayMonth=20;
			int ispresent= (int) (Math.floor(Math.random()*10)%3);
			switch(ispresent) {
			case 0:
				System.out.println("Employee is Present");
				System.out.println("Employee wage for month=" +EmpHours*WagePerHour*WorkingdayMonth);
				break;
			case 1:
				System.out.println("Employee is doing Part time");
				System.out.println("Employee part time wage for month=" +PartTimeHour*WagePerHour*WorkingdayMonth);
				break;
			default :
				System.out.println("Employee is Absent");
				System.out.println("Employee Wage for Month= 0");
			}
		}
	}

