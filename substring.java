// strings are immutable
public class substring {
    public static void main(String[] args) {
        String sentence = "atanuMandal";

        String name = sentence.substring(0,5);

        // String name = sentence.substring(0); // eta mane by default eta 0 theke puro length ta niye nebe
        
        System.out.println(name);
    }
}
