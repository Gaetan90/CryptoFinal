import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Base64;
//import commons.codec.binary.Base64;
import java.util.Scanner;

public class Crypto {

	//private byte [] input= orig.getBytes("UTF-8");
	public File file = new File("C:/Users/Gaetan90/Desktop/fichierCrypter/liste_francais.txt");
	public static Scanner scanner; 
	public static String keyS = "vrhpaf";
	public int spos = 0;
	public Crypto() throws FileNotFoundException{
	}

	
	public String decode_operation(String s,String keyS){
        try{
            byte [] output= s.getBytes("US-ASCII");
            byte [] key= keyS.getBytes();
            for (int pos = 0; pos < output.length; ++pos) {
            	int posMod = pos%6;
            	 if(this.spos>5){
                 	this.spos=0;
                 }
            		output[pos] = (byte) (output[pos] ^ key[spos]);
                    this.spos++;
                
            }
            this.spos++;
            return new String(output, "UTF-8");
        }catch(Exception e){

        }
        return null;
    }
	
	public String decrypte2(String str,String keyS){
        try{
            byte [] output= str.getBytes("ISO-8859-1");
            byte [] key= keyS.getBytes();
            for (int pos = 0; pos < output.length; ++pos) {
            	int posMod = pos%6;
            	 if(this.spos>5){
                 	this.spos=0;
                 }
            		output[pos] = (byte) (output[pos] ^ key[spos]);
                    this.spos++;
                
            }
            this.spos++;
            return new String(output, "UTF-8");
        }catch(Exception e){

        }
        return null;
	}
	
	public String decrypte(String str,String key){
		int[] strInt = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
        	strInt[i] = Integer.valueOf(str.charAt(i));
        }
        String output = "";        
        for(int i = 0; i < strInt.length; i++) {
            output += (char) ((strInt[i] - 48) ^ (int) key.charAt(i % (key.length() - 1)));
        }
        return output;
	}
	
//	public static String decode_operation(String s, String keyS){
//		int spos = 0;
//		try{
//				byte [] output=  s.getBytes("US-ASCII"); 
//				byte [] key = keyS.getBytes();
//				byte [] s1 = "\n".getBytes("UTF-8");
//				for (int pos = 0; pos < output.length; ++pos) {
//					if(output[pos] != s1[0]){
//						output[pos] = (byte) (output[pos] ^ key[spos]);
//			            ++spos;
//			            if (spos >= key.length) {
//			                spos = 0;
//			            }
//					}
//		            
//				}
//				int lineNum = 0;
//				System.out.println(keyS +"  ----  "+ new String(output, "UTF-8"));
//				
//				return new String(output, "UTF-8");
//			
//        
//        }catch(Exception e){
//        	return null;
//        }
//	
//	}
	
	
}
