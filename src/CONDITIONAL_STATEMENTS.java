import java.util.Scanner;
public class CONDITIONAL_STATEMENTS
{
    public static void main(String[] args)
    {
        char ch;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a character:");
                ch = sc.next().charAt(0);

        //else-if ladder statement
                if(ch=='a')
		        {
			        System.out.println("vowel");
		        }
                else if(ch=='e')
		        {
			        System.out.println("vowel");
		        }
		        else if(ch=='i')
		        {
                    System.out.println("vowel");
		        }
		        else if(ch=='o')
		        {
			        System.out.println("vowel");
		        }
		        else if(ch=='u')
		        {
			        System.out.println("vowel");
		        }
		        else
		        {
			        System.out.println("not vowel");
		        }

        //if-else statement
		        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
        			System.out.println("vowel");
		        }
        		else
    			{
    				System.out.println("not vowel");
    			}

        //switch statement
                switch(ch)
                {
                    case 'a':
                        System.out.println("vowel");
                        break;
                    case 'e':
                        System.out.println("vowel");
                        break;
                    case 'i':
                    case 'u':
                    case 'o':
                        System.out.println("vowel");
                        break;
                    default:
                        System.out.println("not vowel");
                }

        //enhanced switch statement
                switch (ch)
                {
                    case 'a', 'e' -> System.out.println("vowel");
                    case 'i', 'u', 'o' -> System.out.println("vowel");
                    default -> System.out.println("not vowel");
                }
                

        }
    }

