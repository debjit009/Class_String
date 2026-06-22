public class StringBasic {
    public static void main(String[] args) {
        String name = "Debjit";
        String sameName = "Debjit";
        String newName = new String("Debjit Das");  // java is case sensitive nature 

        System.out.println(name);
        System.out.println(newName);

        if(name == sameName){
        System.out.println("Both are same");
        }
        
         if(name == newName){ // whenever we compare (==) non-premetive data java check refarences.
            System.out.println("Both are same");
         }else{
             System.out.println("Both are not same");
            }




        // Comparing two String in java --> using equals() methods

        if(name.equals(newName)){
            System.out.println("name and newame have same values");

        }else{
            System.out.println("Not same");


           // using equalsIgnore()methods

            if(name.equalsIgnoreCase(newName)){
                System.out.println("name and newame have same values");

            }else{
                System.out.println("Not same");
            }


            
        }
    }    
    
}
