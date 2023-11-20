package problemSolving;

import java.util.regex.Pattern;

public class RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
    	boolean res=false;
    	if(p.contains("*")) {
    		p.replaceAll("[*]", "\\*");
    		if(p.charAt(2)=='*') {
    			res=false;
    		}
    		}else if(p.contains("+")) {
    		p.replaceAll("[+]*", "\\+");
    		}else if(p.contains("^")) {
    		p.replaceAll("[^]*", "\\^");
    		}
    	
    		if(Pattern.matches(p, s))
    		res=true;
        return res;
    }
	public static void main(String[] args) {
		RegularExpressionMatching rex=new RegularExpressionMatching();
		boolean result=rex.isMatch("abc", "a***bc");
		System.out.println(result);
	}
	
	

}

/*
if(p.contains("*")) {
p.replaceFirst("[*]*", "\\*");
}else if(p.contains("+")) {
p.replaceAll("[+]*", "\\+");
}else if(p.contains("^")) {
p.replaceAll("[^]*", "\\^");
}else 
*/