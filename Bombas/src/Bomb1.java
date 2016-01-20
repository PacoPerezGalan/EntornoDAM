
public class Bomb1 {
	public static void main(String[] args) {
		String frase;
		String fraseCodificada;
		
		char [] abecedario={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		String [] numeros={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27"};
		frase="paco y pablo te envian saludos";
		fraseCodificada="";
		
		for(int i=0;i<frase.length();i++){
			for(int j=0;j<abecedario.length;j++){
				if(abecedario[j]==frase.charAt(i)){
					fraseCodificada=fraseCodificada+numeros[j]+" ";
				}
				
			}
			if(frase.charAt(i)==' '){
				fraseCodificada=fraseCodificada+"/";
			}
		}
		System.out.println(fraseCodificada);
	
    }
}
