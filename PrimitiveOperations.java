public class PrimitiveOperations {
    public static void  main(String[] args){
        int prim1 = 55;
        double prim2 = 15.5;
	double total = prim1+prim2/2;
	System.out.println("order of ops no paren..."+total);
	total = (prim1+prim2)/2;
	System.out.println("order of ops no paren..."+total);
        System.out.println("prim1:"+prim1);
        System.out.println("prim2:"+prim2);

        double primquo = prim1 * prim2;
	System.out.println("prim1*prim2="+primquo);

        float intf = (float) prim1;
	System.out.println("Float of integer"+intf);
	
        int fint = (int) prim2;
	System.out.println("Integer from float:"+fint);

        char cvar = 'A';
        System.out.println("Char cvar:"+cvar);

        char cvar2 = (char) (((int) cvar) + 32);
        System.out.println("numerical op char: "+cvar2);

	for (int i = 50; i > 0; i -= 10) {
   		System.out.print(i);
	}
	
    }
}
