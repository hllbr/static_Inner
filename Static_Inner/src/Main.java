
public class Main {
    public static void main(String[] args) {
        //Burada obje oluştururken onstaticte olduğu gibi matematikten başlamamıza gerek yok 
        //Çünkü burada bizim classımız static bir yapıda
        Matematik.Alan alan = new Matematik.Alan();//Static IIner class'ta obje oluşturma 
        //daire alan static tanımlansada bu yapdıa herhangi bir sıkıntı çıkmaz
        
        alan.daire_alan(5);
        
        //daire alan staticse tanımlama daha basite indirgene biliyor
        Matematik.Alan.daire_alan(7);
    }
    
}
