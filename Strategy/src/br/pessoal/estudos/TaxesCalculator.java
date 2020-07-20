package br.pessoal.estudos;

import br.com.pessoal.estudos.objects.Budget;
import br.pessoal.estudos.interfaces.Taxes;

public class TaxesCalculator {

	public void solveTaxes(Taxes taxes, Budget budget) {
		System.out.println("Your taxes for this is: " + (taxes.solveTaxes(budget) * 10) + " Reais");
	}

}
