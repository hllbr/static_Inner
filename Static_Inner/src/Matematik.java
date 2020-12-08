
public class Matematik {//Matematiğin kendi sınıfının bir classı olsun diye bir static class tanımlaması yapıyoruz
    private static double pi = Math.PI ;
    
    public static class Alan{
        public static void daire_alan(int yarı_cap){//Metoduda static tanımlarsak
            System.out.println("Dairenizin alanı : "+(yarı_cap*yarı_cap*pi));
            //burada yukarda tanımladığımız piyi direkt kullanamıyor bizim bu özelliği kullanmamız için yukarıdaki tanımladığımız piyi de static yapıya almamız gerekiyor
        }
        
    }
    
}
