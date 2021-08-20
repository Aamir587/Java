import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

import org.omg.PortableInterceptor.NON_EXISTENT;

import java.sql.*;

public class Collectionss {

	public static void main(String[] args) {
		int i=0, rightanswer=0, wronganswer=0 , not_attempt=0;
		ArrayList answer = new ArrayList();
		ArrayList useranswer =new ArrayList(Arrays.asList("Programmin language", "Class", "Java Programmin tool", "Class", "Run time error"));  
		
		Map<Integer,String> correctanswers = new LinkedHashMap<Integer,String>();
		Map<Integer,String> useranswers = new LinkedHashMap<Integer,String>();
		
		useranswers.put(1, "Programmin Language");
		useranswers.put(2, "Java Programmin Tool");
		useranswers.put(3, "Object");
		useranswers.put(4, "");
		useranswers.put(5, "");

		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","1234");
			String qr = " select * from sample;";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(qr) ;
			
			while(rs.next())
			{
				String ans =  rs.getString("answer");
				int id = rs.getInt("qid");
								
				do{
					
					correctanswers.put(id, ans);
			//	 	answer.add(ans);
				      break;
										
				}while(i<2);
								
			}
			
			System.out.println("Correct Answers : "+correctanswers+"\n");
			System.out.println("Users Answers   : "+useranswers+"\n");
			
		label1 : for (Map.Entry<Integer,String> userentry : useranswers.entrySet())
			{
				int ukey = userentry.getKey();
				String uans = userentry.getValue();
				if(uans==null || uans.equals("") || uans.length()==0  ) {
					
				
					
					not_attempt++;
					continue label1;
					
				}
				
//				System.out.println("key : "+ukey+"  Value  :  "+uans);
				
//				Map<Integer,String> nhm = new LinkedHashMap<Integer,String>();
				
					
//				for (Map.Entry<Integer,String> dbentry : correctanswers.entrySet())
//				{
				//	int ckey = dbentry.getKey();
				//	String cans = dbentry.getValue();
					
				String crt_ans = correctanswers.get(ukey);
				
				
				
				if(crt_ans.equalsIgnoreCase(uans)) 
				{
					
					rightanswer++;
					
					
				}
				else
					 {
						
						wronganswer++;
					}
					
				 
	
						 
//					 }
					 
				}
				
					
					
				
				
				
//				for (Map.Entry<Integer,String> correctentry : correctanswers.entrySet())
//				{
//					
//					int ckey = userentry.getKey();
//					String cans = userentry.getValue();
//					
//					if(ukey == ckey && ) {
//						
//					}
//					
			System.out.println("No. of correct answers :"+rightanswer+" " );
			System.out.println("No. of Wrong answers :"+wronganswer+" " );	
			System.out.println("No. of Non Attempt answers :"+not_attempt+" " );	
		
				}
				
				
			
			

			
			
			
	//		answer.retainAll(useranswer);
	//		System.out.println("Common Answers  : "+answer);
			
	//		System.out.println(answer.get(1));
	
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		
		
	}

}
