package br.pessoal.estudos.taxes.kind;

import br.com.pessoal.estudos.objects.Budget;
import br.pessoal.estudos.interfaces.Taxes;

public class Icms implements Taxes {

	private static final Double FIX_VALUE = 50.0;
	
	@Override
	public double solveTaxes(Budget budget) {
		return ((budget.getValue() * 0.05)+FIX_VALUE);

	}

}
