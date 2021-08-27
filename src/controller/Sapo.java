package controller;

import java.util.Random;

public class Sapo extends Thread
{
	private int puloMax, percurso, id;
	static int i = 1;

	public Sapo(int percurso, int puloMax, int id)
	{
		this.percurso = percurso;
		this.puloMax = puloMax;
		this.id = id;
	}

	@Override
	public void run() 
	{
		puloSapo();
	}

	private void puloSapo()
	{
		Random random = new Random();
		int pulo;
		int posicao = 0;

		while (posicao < percurso)
		{
			pulo = random.nextInt(puloMax + 1);
			posicao += pulo;
			System.out.println("Sapo " + id + " pulou " + pulo + " metros - faltam: " + (percurso - posicao) + " metros");
		}
		System.out.println("\n||||||||||||||||||||||||||||||||||||||||\n"
				+ "    Sapo " + id + " chegou a linha de chegada." + "\n               " + i + "º colocado"
						+ "\n||||||||||||||||||||||||||||||||||||||||\n");
		i++;
	}
}