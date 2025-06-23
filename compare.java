public class compare {
    public static void main(String[] args) {
        //Compare To
        String name1 = "Atanu";
        String name2 = "Mandal";

        //it follows 3 conditions:----
        //1. s1 > s2 : +ve
        //2. s1 < s2 : -ve
        //3. s1 == s2 : 0
        if (name1.compareTo(name2) == 0) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
