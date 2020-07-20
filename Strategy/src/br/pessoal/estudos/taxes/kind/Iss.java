package br.pessoal.estudos.taxes.kind;

import br.com.pessoal.estudos.objects.Budget;
import br.pessoal.estudos.interfaces.Taxes;

public class Iss implements Taxes {

	@Override
	public double solveTaxes(Budget budget) {
		return budget.getValue() * 0.06;

	}

}
