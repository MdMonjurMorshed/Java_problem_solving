public class gcd_of_string{
    public String gcd_string(String str1,String str2){
        System.out.println(str1 + " " +  str2);
        int min_length=Math.min(str1.length(),str2.length());
        System.out.println(min_length);
        // if(str1+str2!=str2+str1){

        //     return "";
        // }
        // if(str1==str2){
        //     System.out.println("str1 and str2 is equal");
        //     return str1;
        // }else if(str1.length()>str2.length()){
        //     System.out.println(str1.substring(0, str2.length()));
        //     return gcd_string(str1.substring(0, str2.length()), str2);
        // }else{
        //     System.out.println(str2.substring(0, str1.length()));
        //     return  gcd_string(str2.substring(0, str1.length()), str1);
        // }
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