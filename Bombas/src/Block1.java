
public class Block1 {

public static void main(String[] args) {
	String frase;
	String fraseCodificada;
	String substituto4=" ";
	String fraseDescodificada;

	fraseCodificada="apocm44eopenm4cuihisom";
	frase="";
	fraseDescodificada="";
	for(int i=0;i<fraseCodificada.length();i=i+2){
		frase=frase+fraseCodificada.charAt(i+1)+fraseCodificada.charAt(i); 
	}
	//frase.replaceAll("4",substituto4);
	for(int y=0;y<frase.length();y++){
	    if(frase.charAt(y)=='4'){
	    	fraseDescodificada=fraseDescodificada+substituto4;
	    	
	    }else{
	    	fraseDescodificada=fraseDescodificada+frase.charAt(y);	    	
	    }
	
	}
	System.out.println(fraseDescodificada);
	}
	
	

}

