import java.util.Scanner;



class calculator
{

    public static void main(String args[])
    {
        char ans;
        
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Give number #1");
        float no1 = sc1.nextInt();
        System.out.println("Number one is:" +no1);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Give number #2");
        float no2 = sc2.nextInt();
        System.out.println("Number two is:" +no2);


        Scanner sc3 = new Scanner(System.in);
        System.out.println("Choose what to do with the numbers\n");
        System.out.println("Accepted Symbols: +, -, *, /\n");
        ans = sc3.next().charAt(0);
        while ( ans != '/' && ans != '+' && ans != '-' && ans != '*')
        {
            
            System.out.println("Choose what to do with the numbers\n");
            System.out.println("Accepted Symbols: +, -, *, /\n");
            ans = sc3.next().charAt(0);  
        }


        if (ans == '-') {
            
            System.out.println("You selected substract\n");
            substract class1 = new substract();
            class1.subs(no1, no2); 

        }

        else if (ans == '+'){

            System.out.println("You selected addition\n");
            add class2 = new add();
            class2.sum(no1, no2);

        }

        else if (ans == '/'){

            System.out.println("You selected division\n");
            divide class3 = new divide();
            class3.dvd(no1, no2);

        }

        else if (ans == '*'){

            System.out.println("You selected proliferation\n");
            multiply class4 = new multiply();
            class4.mlp(no1, no2);

        }

        
    }    
}
