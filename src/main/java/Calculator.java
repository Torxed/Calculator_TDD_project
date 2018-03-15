package main;

import java.util.*;

import calclogic.CalcLogic;

public class Calculator {

    public static void main(String[] args) throws Exception {

        CalcLogic cl = new CalcLogic();

        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();

        //Split the String before and after these characters.
        String regex = "(?=[-+*/%A-Za-z])|(?<=[-+*/%A-Za-z])";


        //Put each token into this array.
        String[] expr = expression.split(regex);


        //Create a stack for digits, operands and letters.
        Stack stNr = new Stack();
        Stack stOp = new Stack();
        Stack stL = new Stack();

        //Test
        for (String s : expr) {

            //Check weather the token is a digit, operand or letter.
            //Adds the token to its correct stack.
            if(s.matches("(\\d+)")) {
                stNr.push(s);
            } else if (s.matches("([-+*/%])")) {
                stOp.push(s);
            } else {
                stL.push(s);
            }
        }

        //If our input had a letter stL will be populated.
        //Then our expression is not valid.
        if (!stL.isEmpty()) {
            throw new Exception ("Not a valid expression!");
        }

        //Reverse the stack so pop() will have the same order as input.
        Collections.reverse(stNr);

        //Checking that our reverse worked.
        System.out.println(stNr.peek());

        //Test where input is 44+4
        //Assign our digits as doubles.
        double f = Double.parseDouble((String) stNr.pop());
        double s = Double.parseDouble((String) stNr.pop());

        //Calls method add() to calculate our expression.
        double result = cl.add(f, s);

        //Print result.
        System.out.println(result);



    }


}
