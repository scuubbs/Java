
//   Georgia Tech class - Intro to OOP java #1 ..... Homework #2.. Simple console calculator 5/28/23.. RSC
//

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args){
		System.out.println(" Welcome to console calculator");
		System.out.println(" OPERATIONS:");
		System.out.println(" Add, sub, mul, div, lex");
		System.out.println("");
		System.out.println(" Enter: operation_name parm1 parm2");
		boolean err = false;
		Scanner input = new Scanner(System.in);
		while(!err) {
			String sel = input.next();
			System.out.println(" operation selected - "+sel);
			switch(sel.toLowerCase()) {

				case "add":
					if(!input.hasNextDouble()){
						err = true;
						break;
					} else {
						double val1 = input.nextDouble();
						if(!input.hasNextDouble()){
							err = true;
							break;
						} else {
							double val2 = input.nextDouble();
							double val3 = val1 + val2;
							System.out.println(val1+"+"+val2+"="+val3);
						}
					}
					break;



				case "sub":
					if(!input.hasNextDouble()){
						err = true;
						break;
					} else {
						double val1 = input.nextDouble();
						if(!input.hasNextDouble()){
							err = true;
							break;
						} else {
							double val2 = input.nextDouble();
							double val3 = val1 - val2;
							System.out.println(val1+"-"+val2+"="+val3);
						}
					}
					break;



				case "mul":
					if(!input.hasNextDouble()){
						err = true;
						break;
					} else {
						double val1 = input.nextDouble();
						if(!input.hasNextDouble()){
							err = true;
							break;
						} else {
							double val2 = input.nextDouble();
							double val3 = val1 * val2;
							System.out.println(val1+"*"+val2+"="+val3);
						}
					}
					break;



				case "div":
					if(!input.hasNextDouble()){
						err = true;
						break;
					} else {
						double val1 = input.nextDouble();
						if(!input.hasNextDouble()){
							err = true;
							break;
						} else {
							double val2 = input.nextDouble();
							if(val2==0){
								err=true;
								System.out.println(" Divide by zero error... Terminating  ");
								break;
							}
							double val3 = val1 / val2;
							System.out.println(val1+"-"+val2+"="+val3);
						}
					}
					break;

				case "lex":
					String parm1 = input.next();
					String parm2 = input.next();
					int cresult = parm1.compareTo(parm2);
					if(cresult==0) System.out.println(parm1+" is the same as "+parm2);
					if(cresult>0) System.out.println(parm1+" is greater than "+parm2);
					if(cresult<0) System.out.println(parm1+" is less than "+parm2);
					
				break;
				
				default:
					System.out.println("Bad operation input... Terminating");
					err = true;
					break;
				
			}
						
		}

	 
	}
}