package view;

import controller.Sapo;

public class Principal
{

	public static void main(String[] args)
	{
		for (int id = 0; id < 5; id++)
		{
			Thread ThreadSapos = (Thread) new Sapo(100, 5, id);
			ThreadSapos.start();
		}
	}

}