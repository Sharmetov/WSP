package wsp;

public abstract class Employee extends User{
		protected int salary;
		
		public Employee() {
			super();
			// TODO construct me	
		}

		public Employee(int salary) {
			super(login, password);
			super(firstName, lastName, id) ;
			this.salary = salary ;
			// TODO construct me	
		}
		
		public void sendOrderToExecutor(Order order) {
			
		}
		
		public String toString() {
			// TODO implement me
			return super.toString() + "Salary: " + salary ;	
		}
		
}
