package tpexceptions;

public class Test {
	public static void main(String[] args)
	{
		try {
			double x=Double.parseDouble(args[0]);
			double n=Double.parseDouble(args[1]);
			if(n==0)
			{
				throw new ArithmeticException("n doit etre >0");
			}
			if(x<0)
			{
				throw new NegatifException("x doit etre >0");
			}
			System.out.println(Mathematique.f(n,x));
		}catch(ArrayIndexOutOfBoundsException A)
		{
			System.out.println("Vous devriez entrer deux nombres sur la ligne de commande pour que ça fonctionne" +A.getMessage());
		}
		catch(NumberFormatException N)
		{
			System.out.println("Les arguments doivent être des nombres"+N.getMessage());
		}
		catch(ArithmeticException Ar)
		{
			System.out.println("mauvais calcule"+Ar.getMessage());
		}
		catch(NegatifException Neg)
		{
			System.out.println("mauvais calcule"+ Neg.getMessage());
		}

		}
	
	

	

}
