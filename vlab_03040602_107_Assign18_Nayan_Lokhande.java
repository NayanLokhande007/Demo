package program;
import java.util.*;
import  java.io.*;  
import  org.apache.poi.xssf.usermodel.XSSFSheet;  
import  org.apache.poi.xssf.usermodel.XSSFWorkbook;  
import  org.apache.poi.xssf.usermodel.XSSFRow; 
public class vlab_03040602_107_Assign18_Nayan_Lokhande {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			try
			   {
					System.out.println("How Many Questions do u want");
					int qn=sc.nextInt();
					
					//declare file name to be create   
					String filename = "E:\\Nayan_Eclipse_workspace\\Excel\\vlab_03040602_107_Assign18_Nayan_Lokhande.xlsx";  
					//creating an instance of HSSFWorkbook class  
					XSSFWorkbook workbook = new XSSFWorkbook();  
					//invoking creatSheet() method and passing the name of the sheet to be created   
					XSSFSheet sheet2 = workbook.createSheet("Instructions"); 
					XSSFSheet sheet = workbook.createSheet("Questions"); 
					//creating the 0th row using the createRow() method  
					XSSFRow rowhead = sheet.createRow((short)0);  
					//creating cell by using the createCell() method and setting the values to the cell by using the setCellValue() method  
					rowhead.createCell(0).setCellValue("Sr. No");  
					rowhead.createCell(1).setCellValue("Question Type"); 
					rowhead.createCell(2).setCellValue("Answer Type"); 
					rowhead.createCell(3).setCellValue("Topic Number"); 
					rowhead.createCell(4).setCellValue("Question (Text Only)");  
					rowhead.createCell(5).setCellValue("Correct Answer 1");
					rowhead.createCell(6).setCellValue("Correct Answer 2"); 
					rowhead.createCell(7).setCellValue("Correct Answer 3"); 
					rowhead.createCell(8).setCellValue("Correct Answer 4"); 
					rowhead.createCell(9).setCellValue("Wrong Answer 1");  
					rowhead.createCell(10).setCellValue("Wrong Answer 2");
					rowhead.createCell(11).setCellValue("Wrong Answer 3");
					//rowhead.createCell(12).setCellValue("Wrong Answer 4");
					rowhead.createCell(12).setCellValue("Time in seconds"); 
					rowhead.createCell(13).setCellValue("Difficulty Level"); 
					rowhead.createCell(14).setCellValue("Question (Image/ Audio/ Video)");
					rowhead.createCell(15).setCellValue("Contributor's Registered mailId");
					rowhead.createCell(16).setCellValue("Solution (Text Only)");
					rowhead.createCell(17).setCellValue("Solution (Image/ Audio/ Video)");
					rowhead.createCell(18).setCellValue("Variation Number");
					
				  for(int j=1;j<=qn;j++)
				  {
					Random r=new Random(); 
					
					String[] arr= Var();
					String v1=arr[1];
					String v2=arr[0];
					
					int n1=r.nextInt(2,10);
					int n2=r.nextInt(2,20);
					int n3=r.nextInt(20,50);
					
					String c1="$"+v2+"$";
					String c2="$"+n2+v2+"$";
					String ca[]= {c1,c2};
					int b=r.nextInt(ca.length);
					String Ans=ca[b];
					String c11="$"+v2+"$<br>";
					String c21="$"+n2+v2+"$<br>";
					String ca1[]= {c11,c21};
					String ans=ca1[b];
					String c111=""+v2+"<br>";
					String c211=""+n2+v2+"<br>";
					String ca11[]= {c111,c211};
					String Eans=ca11[b];
					
					String eqn1="​​$"+v1+"\\, +\\, ....\\, = "+n3+"$";
					String eqn2="​​$"+n1+v1+"\\, +\\, ....\\, = "+n3+"$";
					String eqn3="​​$"+v1+"\\, -\\, .... \\,= "+n3+"$";
					String eqn4="​​$"+n1+v1+"\\, -\\, ....\\, = "+n3+"$";
					
					String eqn11="​​$"+v1+"+"+Eans+" = "+n3+"$";
					String eqn21="​​$"+n1+v1+"+"+Eans+" = "+n3+"$";
					String eqn31="​​$"+v1+"-"+Eans+" = "+n3+"$";
					String eqn41="​​$"+n1+v1+"-"+Eans+" = "+n3+"$";
					
					String eq[]= {eqn1,eqn2,eqn3,eqn4};
					int a=r.nextInt(eq.length);
					String eq1[]= {eqn11,eqn21,eqn31,eqn41};
					String eqn=eq[a];
					String equation=eq1[a];
					String Que="​​​​Complete the equation ​​"+eqn+" which will make it a linear equation in two variables, from the given options.<br>"
							+ "​​# "+eqn+" हे दिलेले समीकरण ​​दोन चलातील रेषीय समीकरण होण्यासाठीचा खालीलपैकी योग्य पर्याय निवडा.<br>";
					
					
					
					//Generating Wrong answers
					
					String w1="$"+v1+"$";
					String w2="$"+n2+v1+"$";
					String w3="$"+n2+v1+"^2$";
					String w4="$"+n2+"$";
					String w5="$"+v1+"^2$";
					String w6="$"+n2+v1+"^3$";
					String w7="$"+v1+"^3$";
					String w8="$"+v2+"^2$";
					String w9="$"+v2+"^3$";
					String w10="$"+n2+v2+"^2$";
					String w11="$"+n2+v2+"^3$";
					
					 String WA[]= {w1,w2,w3,w4,w5,w6,w7,w8,w9,w10,w11};
				        int ar[]=GetIndex();
				        
				    String wa1=WA[ar[0]]; 
				    String wa2=WA[ar[1]];  
				    String wa3=WA[ar[2]];  
				    
				        ArrayList<String>Q=new ArrayList<String>();
						ArrayList<String>W=new ArrayList<String>();//It is used to store wrong answer
						W.add(WA[ar[0]]);
						W.add(WA[ar[1]]);
						W.add(WA[ar[2]]);
						
						HashSet<String> hs=new HashSet<String>();
						hs.add(WA[ar[0]]);
						hs.add(WA[ar[1]]);
						hs.add(WA[ar[2]]);
						  

			       String Eqn="";
					
					String solution="​Ans : "+Ans+"<br>"
							+ "For an expression to be a linear equation in two variables, "
							+ "it is required that,<br>"
							+ "$i)$ it should have two sides which are equated, <br>"
							+ "$ii)$ should have two variables and <br>"
							+ "$iii)$ the degree of both variables should be one.<br>"
							+ "Of the given options, only ​with "+Ans+","
							+ " we get the equation as "+equation
							+" and this fulfills all the conditions"
							+ " to be a linear equation in two variables.<br> "
							+"Therefore "+Ans+" is the answer.<br>"
							+ "#​उत्तर : "+Ans+"<br>"
							+ "कोणतीही बैजिक राशी ही दोन चलातील रेषीय समीकरण असण्यासाठी<br> "
							+ "$i)$ त्या राशीला दोन बाजू समान असायला हव्यात <br>"
							+ "$ii)$ त्यात दोन चल असायला हवेत <br>"
							+ "$iii)$ त्या दोन्ही चलांचा घातांक एक असायला हवा .<br>"
							+ "दिलेल्या पर्यायांपैकी फक्त "+Ans+" हाच पर्याय वापरून आपल्याला  "+equation+" अशी राशी देतो "
							+ "आणि ही राशी दोन चलातील रेषीय समीकरण असण्यासाठीचे सर्व निकष पूर्ण करते.<br>"
							+" म्हणून "+Ans+" हे उत्तर आहे.<br>";
					
					
					
					if(Q.contains(Que) || W.contains(Ans) ||hs.size()!=W.size())
					 {
						j--;
					 } 
					else
				     { 
		                Q.add(Que);
						XSSFRow row = sheet.createRow((short)j);  
						row.createCell(0).setCellValue(j);  
						row.createCell(1).setCellValue("Text"); 
						row.createCell(2).setCellValue(1);  
						row.createCell(3).setCellValue("03040602");  
						row.createCell(4).setCellValue(Que); //Question
						row.createCell(5).setCellValue(ans);  //Answer
						//row.createCell(6).setCellValue("");  
					   //	row.createCell(7).setCellValue("");  
						//row.createCell(8).setCellValue(""); 
						row.createCell(9).setCellValue(WA[ar[0]]+"<br>"); //w1
						row.createCell(10).setCellValue(WA[ar[1]]+"<br>"); //w2
						row.createCell(11).setCellValue(WA[ar[2]]+"<br>"); //w3
						row.createCell(12).setCellValue(90); 
						row.createCell(13).setCellValue(1); 
						//row.createCell(14).setCellValue(""); 
						row.createCell(15).setCellValue("nayanlokhande007@gmail.com"); 
						row.createCell(16).setCellValue(solution);//solution 
						//row.createCell(17).setCellValue(""); 
						row.createCell(18).setCellValue(107); 
				     }
				   }
			        try
				     {
				       FileOutputStream fileOut = new FileOutputStream(filename);  
				       workbook.write(fileOut);  
				       //closing the Stream  
				       fileOut.close();  
				       //closing the workbook  
			           //workbook.close();  
				       //prints the message on the console  
				       System.out.println("Excel file has been generated successfully.");  
				     }   
				    catch (Exception e)   
				     {  
				      e.printStackTrace();  
				     }
			     }//end of try
			    catch(Exception e)
			    {
					
			    }
		}
    
  }	//end of main
	
	
	static int[] GetIndex()
	{
		Random r=new Random();
		int arr[]=new int[3];
		ArrayList<Integer>al=new ArrayList<Integer>();
		int count=0;
		while(count!=3)
		{
			int a=r.nextInt(0,11);
			if(!(al.contains(a)))
			{
				al.add(a);
				count++;
			}
		
		}
		//System.out.println(al);
		for(int i=0;i<3;i++)
		{
			arr[i]=al.get(i);
		}
		return arr;
	}
	static String[] Var()
	{
		Random r=new Random();
		String var[]=new String[2];
		String Chr[]= {"a","b","c","d","f","g","h","m","n","p","q","r","s","t","u","v","w","x","y","z"};
        int chi=r.nextInt(Chr.length);
        int chi2=0;
        String v1="";
        v1=Chr[chi];
       if(chi==Chr.length-1)
       {
    	 chi2=chi-1;   
       }
       else if(chi==0)
       {
    	   chi2=1;
       }
       else
       {
    	   chi2=chi+1;
       }
       
       String v2=Chr[chi2]; 
       //System.out.println(v1);
      // System.out.println(v2);
       var[0]=v2;
       var[1]=v1;
       return var;
	}
	 
	
}

