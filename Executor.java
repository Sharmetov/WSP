package wsp;

import java.util.ArrayList;

public class Executor extends Employee{
		//who send it ,time of sendning, techtopic
		public static ArrayList<Order> orders;
		
		public Executor() {
			super();
			// TODO construct me	
		}
		
		public Executor(ArrayList<Order> orders) {
			super(login, password) ;
			this.orders = orders ;
		}
		
		public Executor() {
			super(firstName, lastName, id, salary);
			// TODO construct me	
			
		}
		
		public void viewOrders(Order o) {
			// TODO implement me
			System.out.println(orders);
		}
		
		public void addAcceptOrder(Order o) {
			// TODO implement me
			orders.add(o) ;
//			while(!o.process) {
//				orders.remove(o) ;
//			}
		}
		
		public void addExecuteOrder(Order o) {
			// TODO implement me
			// ??? 
			o.execute();
		}
		
		public void rejectOrder(Order o) {
			// TODO implement me
			order
		}
		
		public boolean equals(Object obj) {
			// TODO implement me
			if(this == obj) return true ;
			if(!super.equals(obj)) return false ;
			if(getClass() != obj.getClass()) return false;
			Executor other = (Executor)obj ;
			if(orders != other.orders) return false ;
			return true;	
		}
		
		
		public int hashCode() {
			// TODO implement me
			final int prime =  31 ;
			int result = super.hashCode() ;
			result += 17*result ;
			return result ;
		}

		@Override
		public boolean view() {
			// TODO Auto-generated method stub
			return false;
		}
		
}
