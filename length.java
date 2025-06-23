public class length {
        public static void main(String[] args) {
        //concatenation  --------- it means 'add/sum'
        String firstName  = "Atanu";
        String lastName  = "Mandal";

        String fullName = firstName + " " + lastName;   //" " dutor modhe space anar jonno

        System.out.println(fullName.length());  // this is length function


        // charAt function --- konta koto no index e ache seta dekhabe
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

        }


    
}
