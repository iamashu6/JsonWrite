package mockHackthon;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;

public class MyClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new FileReader(new File("C:\\Users\\Ashutosh Ranjan\\Downloads\\CPU.txt")));
		
		JSONObject obj=new JSONObject();
		String s;
		int count=1;
		//DecimalFormat d=new DecimalFormat("#0.00");
		//Float maxi = null;
		while((s=br.readLine())!=null)
		{
		     if(s.isEmpty() || s.trim().equals("") || s.trim().equals("\n")){
		            continue;
		        }else{
		            
		            String[] data = s.split(" ");
		            System.out.println(data[14]);
		          //  List list=new ArrayList();
		           // list.add(data[14]);
		        //    Comparator<Float> cmp=(i1,i2)->i1.compareTo(i2);
		         //  maxi=(Float) list.stream().max(cmp).get();
		       //   String st= d.format(data[14]); 
		          
		          obj.put(count+"s",data[14]);
		           count++; 
		        
		           
		        }
		    
		}
		
		//System.out.println(maxi);
		try
		{
			FileWriter fw=new FileWriter("C:\\Users\\Ashutosh Ranjan\\Downloads\\output.json");
			fw.write(obj.toJSONString());
			fw.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		 System.out.println("Json File Created"+obj);
		 
	}


}
