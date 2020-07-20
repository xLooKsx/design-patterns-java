package br.pessoal.estudos.taxes.kind;

import br.com.pessoal.estudos.objects.Budget;
import br.pessoal.estudos.interfaces.Taxes;

public class Iccc implements Taxes {

	@Override
	public double solveTaxes(Budget budget) {
		if (budget.getValue() < 100) {
			return (budget.getValue() * 0.05);
		}else if (budget.getValue() > 3000) {
			return ((budget.getValue() * 0.08) + 30);
		}
		
		return budget.getValue() * 0.08;
	}

}
