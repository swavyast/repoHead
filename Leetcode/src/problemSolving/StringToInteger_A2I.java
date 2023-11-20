package problemSolving;

public class StringToInteger_A2I {
	final int length = 0;
    public int myAtoi(String s) throws NumberFormatException{
    	int result=0;
    	int sign=1;
    	int len=0;
    	int fst=0;
    	int snd=0;
    	int lfst=0;
    	int lsnd=0;
    	if(s.startsWith("^ "));
    	s=s.replaceAll("^ ", "");
    	if(s.startsWith("^+")) {
    		s=s.replaceFirst("+", "");
    		sign=1;
    	}
    	if(s.startsWith("^-")) {
    		s=s.replaceFirst("-", "");
    		sign=-1;
    	}
    	if(s.startsWith("^+/-")) {
    		s=s.replaceAll("^+-", "");
    		result=0;
    	}
    	if(s.startsWith("^+-")) {
    		s=s.replaceAll("^+-", "");
    		result=0;
    	}
    	for(int i=0;i<s.length()&&len<=10&&s.charAt(i)>='0'&&s.charAt(i)<='9';i++) {
    		if(len==0&&i==0)
    			fst=Character.getNumericValue(s.charAt(i));
    		if(len==1&&i==1)
    			snd=Character.getNumericValue(s.charAt(i));
    		if(len==9&&i==9)
    			lsnd=Character.getNumericValue(s.charAt(i));
    		if(len==10&&i==10)
    			lfst=Character.getNumericValue(s.charAt(i));
    		if(len<10) {
    		result=result*10+Character.getNumericValue(s.charAt(i));
    		len++;
    		}else if(len==10) {
    			if (sign==1&&fst > 2) {
					result = 2147483647;
				} else if (fst == 2 && snd > 1) {
					result = 0;
				} else if (lsnd > 4) {
					result = 0;
				} else if (lsnd == 4 && lfst > 7) {
					result = 0;
				} else {
					if (sign==-1&&fst >2) {
						result = -2147483648;
					} else if (fst == 2 && snd > 1) {
						result = -2147483648;
					} else if (lsnd > 4) {
						result = -2147483648;
					} else if (lsnd == 4 && lfst >= 8) {
						result = -2147483648;
					} 
				}
			} else {
				if (result > 2147483647) {
					result = 2147483647;
				} else if(result < -2147483648){
					result = -2147483648;
				}
    		}	
    	}
        return result*sign;
    }
    public static void main(String[] args) throws NumberFormatException, NullPointerException{
    	StringToInteger_A2I sa2i=new StringToInteger_A2I();
		int res=sa2i.myAtoi("+-12");
		System.out.println(res);
	}
}
/*    	
    	//eliminate whitespaces
    	// check for + and - signs : + is positive - is negative
    	// read input until next non digit character
    	// convert digits into integer
    	// determine the 32 bit range 
    	// return integer as final result
    	 * 
    	 * 
    	 *     public int myAtoi(String s) {
    	int result=0;
    	if(s.startsWith("+")||s.startsWith("-")||s.startsWith("\\s")) {
    		s=s.replaceAll("\\W*[a-z][A-Z]*", "");
    		s=s.replaceAll("\s", "");
    		result=Integer.parseInt(s);
    	}else {
    		result = 0;
    	}
        return result;
    }
    	 * 
    	 * 
    	s=s.strip();
    	if(s.isBlank()||s.isEmpty()) {
    		result=0;
    	}else if(s.startsWith("+")) {
    		System.out.println("String contains positive integer");
    		sign="+";
    		trim=s.substring(1);
    		if(trim.startsWith("")||trim.startsWith(" "))
    		trim=trim.substring(1);
    		if(Pattern.matches(regx, trim)){
    		//System.out.println(true);
    		temp=sign+trim;
    		result=Integer.parseInt(temp);
    		}else{
    			System.err.println("String is not integer : characters need to be processed");
    			trim1=trim.toCharArray();
    			for(int i=0;i<trim1.length;i++) {
    				if(trim1[i]==0 || trim1[i]==1 || trim1[i]==2 || trim1[i]==3 || trim1[i]==4 || trim1[i]==5 || 
    						trim1[i]==6 || trim1[i]==7 || trim1[i]==8 || trim1[i]==9) {
    					trim2[i]=trim1[i];
    		    		temp=sign+trim2.toString();
    		    		result=Integer.parseInt(temp);
    				}
    			}
    		}

    	}else if(s.startsWith("-")) {
    		System.out.println("String contains negative integer");
    		sign="-";
    		trim=s.substring(1);
    		if(trim.startsWith("")||trim.startsWith(" "))
    		trim=trim.substring(1);
    		temp=sign+trim;
    		result=Integer.parseInt(temp);
    	}else {
    		System.out.println("String contains positive integer");
    		temp=sign+trim;
    		result=Integer.parseInt(temp);
    	}
    	
    	
    	    	if(s.startsWith("\s")) {
    		System.out.println("whitespace removal");
    		s=s.replaceAll("\s", "");
    		System.out.println(s);
    		if(s.startsWith("+") || s.startsWith("-"))
    			s=s.replaceAll("\\W", "");
    		System.out.println(s);
    		if(s.startsWith("\\d*")) {
    			for(int i=0;i<s.length()&&s.charAt(i)<'0'&&s.charAt(i)>9;i++)
    				s=s.substring(0, i);
    			System.out.println(s);
    			result=Integer.parseInt(s);
    		}
 
    	}else if(s.startsWith("+") || s.startsWith("-")) {
    		System.out.println(" sign removal ");
    		if(s.startsWith("+"))
    			sign=1;
    		else
    			sign=-1;
    		s.replaceAll("\\W", "");
    	}else {

    		}
    		
    		
    		
    		
    		    		if(result>2147483647)
    			result=2147483647;
    		else if(result<-2147483648)
    			result=-2147483648;
*/