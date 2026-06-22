public class StringMethods2 {

    public static void main(String[] args) {
        
        int age = 145;
        String StringAge = String.valueOf(age);
        System.out.println(age+5); //150
        System.out.println(StringAge+5); //1455
        
        //String.valueOf() 
        //is used in Java to convert any data type (such as int, double, char, boolean, etc.) into a String.

     
     
        //method is used to replace a character or sequence of characters with another character/string in a String.
        //replace() 
        String sentence = "Old Debjit hate Unnecessary drama";
        String newSentence = sentence.replace("Old Debjit","New Debjit");

        System.out.println(sentence);
        System.out.println(newSentence);
        
     //method checks whether a string contains a specific sequence of characters.
      //returns true or false.
      //contains()
        System.out.println(sentence.contains("Debjit")); //-->TRUE


        String sentence = "I love java,java is a good language";
        String substring = sentence.substring(2,5); // 2-->inclusive & 5-->Exclusive
        // print --> lov , (5)--> the ending index is exclusive, so the character at that index is not taken.
        System.out.println(substring);



        //split()
        //It splits a string into an array of substrings based on a specified delimiter.
        String words[]=sentence.split(" ") // you can put-->(any charecter sequence)
        for(String word:words){
            System.out.println(word);


        //Converts a Java String into a character toCharArray().
        //toCharArray()
            String color = "Green";
            char letters[]= color.toCharArray();

            for(char letter:letters) {
                System.out.println(letter);
            }
         

            //isEmpty()
            //Checks whether a Java String is empty (contains no characters)
            //returns true or false.
            String Human = "";
            if(Human.isEmpty()){
                System.out.println("empty");
            }


        }
        

    }
    
}
