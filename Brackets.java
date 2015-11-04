package challenge;

import java.util.Stack;

public class Brackets {
	
public static void main(String args[])
{
	String []values={"(){}","{()}","()","()","{}","}"};
	char next1 = 0;
	
	String[] finals = new String[values.length];

	String temp= "NO";

	for (int i=0;i<values.length;i++)
	{

	String value = values[i];


	for(int j=0;j<value.length();j=j+2)
	{

	char first = value.charAt(j);
	
	if(j+1<value.length())
	next1 =value.charAt(j+1);

	else

	temp="NO";

	if (first == '{' && next1 == '}' ||first == '(' && next1 == ')' ||first == '[' && next1 == ']')
	temp="YES";
	else
	temp="NO";
	}
	System.out.println(temp);
	finals[i] = temp;

	}

	//return finals;
	
		
}



public static String[] getResult(String[] strs){
	String[] result=new String[strs.length];
	for(int i=0;i<strs.length;i++){
		
		if(check(strs[i])){			 
		 result[i] = "YES";
		}else{
		result[i] = "NO";
		}
		
	}
	return result;
}	
 

public static boolean check(String str){
	Stack<Character> st = new Stack<Character>();
    for(int j=0;j<str.length();j++){
    	if(str.charAt(j)=='(' || str.charAt(j)=='{' || str.charAt(j)=='['){
    		st.push(str.charAt(j));
    	}
    	else if(st.isEmpty() ){
    		return false;
    	}
    	else if(str.charAt(j)==')'){
    		if(st.peek() == '(')
    			st.pop();
    		else
    			return false;
    	}else if(str.charAt(j)=='}'){
    		if(st.peek()=='{')
    			st.pop();
    		else
    			return false;
    		
    	}else if(str.charAt(j)==']'){
    		if(st.peek() == '[')
    			st.pop();
    		else
    			return false;
    	}
    }
    if(st.isEmpty())
    	return true;
    else
    	return false;
	
}

}
