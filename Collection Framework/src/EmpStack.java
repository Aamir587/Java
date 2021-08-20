import java.util.Stack;
public class EmpStack {

	public static void main(String[] args) {
		


		
		        Emp e1=new Emp(111,"AAA",10000,"SE");
		        Emp e2=new Emp(112,"BBB",20000,"SSE");
		        Emp e3=new Emp(113,"CCC",30000,"TL");
		        
		        Stack<Emp> stk=new Stack<>();
		        stk.push(e1); stk.push(e2); stk.push(e3);
		        
		        System.out.println("Employee Objects Stack : ");
		        System.out.println(stk);
		        
		  
		
		
		
	}

}
