package be.intecbrussel;

public class TextApp {
    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("Hello this is an example of a sentence containing words");

        System.out.println("*** Words containing 'e' ***");
        tp.printFilteredWords((String s) -> s.contains("e"));

        System.out.println("*** Short words ***");
        tp.printFilteredWords((String s) -> s.length() <=3);

        System.out.println("*** Words starting with 't' ***");
        tp.printFilteredWords((String s) -> s.startsWith("t"));

        System.out.println("*** Words with 'e' as the second letter ***");
        tp.printFilteredWords((String s) -> s.indexOf("e") == 1);

        System.out.println("*** Words with two 'e's in them ***");
        tp.printFilteredWords(new WordFilter() {
            @Override
            public boolean isValid(String s) {
                int n = 0;
                for(int i = 0; i < s.length(); i++){
                    if (s.contains("l")){
                        n++;
                    }
                }
                if(n >= 2){
                    System.out.println(s);;
                }

            return false;}
        });
//        tp.printFilteredWords(new WordFilter() {
//            @Override
//            public boolean isValid(String s) {
//                return s.contains("e");
//            }
//        });
//        System.out.println("*** Long words ***");
//        tp.printFilteredWords(new WordFilter() {
//            @Override
//            public boolean isValid(String s) {
//                return s.length() > 4;
//            }
//        });
//        System.out.println("*** Words starting with 'q' ***");
//        tp.printFilteredWords(new WordFilter() {
//            @Override
//            public boolean isValid(String s) {
//                return s.startsWith("q");
//            }
//        });
    }
}
