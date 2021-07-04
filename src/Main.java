public class Main {

    public static void main(String[] args) {
        boolean isLanjut = true;
        
        while (isLanjut) {
            new GBK();
            isLanjut = GBK.isLoop();
        }
    }
}
