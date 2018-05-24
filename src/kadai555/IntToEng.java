package kadai555;



import java.util.Scanner;

public class IntToEng {
	static String s = "";
	static String s2 = "";
	static String[] strnum1 = {"one","two","three","four","five","six","seven","eight","nine"};
	static String[] strnum2 ={"eleven","twelve","thirteen","fourteen","fifteen", "sixteen","seventeen","eighteen","nineteen"};
	static String[] strnum3 = {"ten","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety","one handred"};

    // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }
    
    
    static String sen(int n){//4桁処理
    	if(n%1000==0){
    		return strnum1[(n/1000)-1]+" "+"thousand";
    	}
    	else{
    		String s = translateEng(n-n/1000*1000);
    		String s2 = strnum1[(n/1000)-1]+" "+"thousand";
    		return s2+" "+s;
    	}
    	
    }
    
    static String hyaku(int n){//３桁の処理
     if(n%100==0){
    		return strnum1[(n/100-1)]+" "+"handred" ;
    		
    		
    	}
    
     else {
    	 String s= translateEng(n-n/100*100);
    	 String s2 = strnum1[(n/100)-1]+" "+"handred";
    	 return s2+" "+s;
     }
    	
    	//return "";
    }

    // 数値を英訳する変換するメソッド
    static String translateEng(int n) {//2桁の処理
    	
    	if(n>100 && n<1000) {return hyaku(n);}
    	else if(n==1000){return "thousand";}
    	else if(n>1000){return sen(n);}
    	else{
    	if(n%10==0){return strnum3[(n/10)-1];}
    	
    	else {
    		
    		if(n<10){return strnum1[n-1];}
    		else if(n>10 && n < 20){return strnum2[(n-10)-1];}
    		else {s2 = strnum1[(n-n/10*10)-1];
    		s = strnum3[(n/10)-1];
    		
    		System.out.println(s+" "+s2);
    		return s + " "+s2;

    	}
    		
    	}
    	
    	}
    	
        //return "";
    }
}