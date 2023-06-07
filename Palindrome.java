import javax.swing.*;
public class Palindrome {

        JFrame f;
        JLabel l1,l2;
        JTextField t1,t2;
        JButton b1,b2,b3;
        private boolean isPalindrome(String str){
            String reversedString = new StringBuilder(str).reverse().toString();
            return str.equalsIgnoreCase(reversedString);
        }

        private String extractVowels(String str){
            String vowels ="";
            str = str.toLowerCase();
            for (int i=0;i<str.length();i++){
                char c =str.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    vowels += c;
                }
            }
            return vowels;
        }
            public Palindrome()
                {
                    f = new JFrame("Test");

                    l1 = new JLabel("Input");
                    l1.setBounds(50, 50 ,100,30);

                    t1 = new JTextField("");
                    t1.setBounds(160,50,200,30);

                    l2 = new JLabel("Result");
                    l2.setBounds(50,100,100,30);

                    t2=new JTextField("");
                    t2.setBounds(160,100,200,30);

                    b1= new JButton("Check Palindrome");
                    b1.setBounds(120,150,150,30);

                    b2= new JButton("Find Reverse");
                    b2.setBounds(280,150,150,30);

                    b3= new JButton("Print Vowels");
                    b3.setBounds(440,150,150,30);

                    b1.addActionListener(e ->{
                        String inputString = t1.getText();
                        if(isPalindrome(inputString)){
                            t2.setText("The input is Palidrome");
                        }else{
                            t2.setText("The input is Not Palindrome");
                        }
                    });

                       b2.addActionListener(e->{
                           String inputString = t1.getText();
                          String reversedString = new StringBuilder(inputString).reverse().toString();
                               t2.setText("Reversed String" + reversedString);
                           });

                        b3.addActionListener(e->{
                            String inputString = t1.getText();
                            String vowelString = extractVowels(inputString);
                            t2.setText("Vowel in the String" +vowelString);
                        });

                        f.add(l1);
                        f.add(t1);
                        f.add(l2);
                        f.add(t2);
                        f.add(b1);
                        f.add(b2);
                        f.add(b3);
                        f.setSize(1000,1000);
                        f.setLayout(null);
                        f.setVisible(true);

               }

               public static void main(String[] args){
            new Palindrome();}
               }

