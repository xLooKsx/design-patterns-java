package br.pessoal.estudos;

import br.com.pessoal.estudos.objects.Budget;
import br.pessoal.estudos.interfaces.Taxes;
import br.pessoal.estudos.taxes.kind.Iccc;
import br.pessoal.estudos.taxes.kind.Icms;
import br.pessoal.estudos.taxes.kind.Iss;

/*
 * @author: Lucas Oliveira
 */
public class Main {
	
	/*
	 * This strategy pattern makes the behavior of your code changes according
	 *  to the interface implementation, so you just need to implement and use the
	 *  right class
	 */

	public static void main(String[] args) {
		
		TaxesCalculator calculator = new TaxesCalculator();
		
		Budget budget = new Budget(500.0);
		
		Taxes icms = new Icms();
		Taxes iss = new Iss();
		

		calculator.solveTaxes(iss, budget);
		calculator.solveTaxes(icms, budget);
		
		Taxes iccc = new Iccc();
		calculator.solveTaxes(iccc, budget);
		
		
	}

}
