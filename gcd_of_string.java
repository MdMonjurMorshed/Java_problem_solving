public class gcd_of_string{
    public String gcd_string(String str1,String str2){
        System.out.println(str1 + " " +  str2);
        int min_length=Math.min(str1.length(),str2.length());
        System.out.println(min_length);
       
        StringBuilder  str_build= new StringBuilder();
        for (int i=0;i<min_length; i++){
            if (str1.charAt((i))==str2.charAt(i)){
                str_build.append(str1.charAt(i));
                System.out.println(str_build);

            }else{
                break;
            }
            
        }
        System.out.println(str_build.isEmpty());
        if (str_build.isEmpty()){
            return "' '";
        }
        return str_build.toString();

    }
    public static void main( String[] args){
        gcd_of_string gcd=new gcd_of_string();
        System.out.println("dfasmfm");
        String output=gcd.gcd_string("BDSC", "ABC");
        System.out.println("this is some thing about gcd"+ output);
        // gcd.gcd_string("ABCABD", "ABC");
    }
}