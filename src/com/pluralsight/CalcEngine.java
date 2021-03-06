package com.pluralsight;

/**
 *
 * @author luis.moran
 */
public class CalcEngine {

    public static void main(String[] args) {
        
        MathEquation[] equations = new MathEquation[4];
        
        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 25.0d, 92.0d);
        equations[2] = new MathEquation('s', 225.0d, 17.0d);
        equations[3] = new MathEquation('m', 11.0d, 3.0d);
        
        for(MathEquation equation : equations){
            equation.execute();
            System.out.print("Result = ");
            System.out.println(equation.getResult());
        }
        
        System.out.println();
        System.out.println("Using Overload");
        System.out.println();
        
        double leftDouble = 9.0d;
        double rightDouble = 4.0d;
        
        MathEquation equationOverload = new MathEquation('d');
        equationOverload.execute(leftDouble, rightDouble);
        System.out.println("Result = ");
        System.out.println(equationOverload.getResult());
    }

}
