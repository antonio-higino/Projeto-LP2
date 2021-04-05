package br.ufrn.imd.controle;

import java.util.ArrayList;
import br.ufrn.imd.modelo.Item;
import br.ufrn.imd.modelo.Bebida;
import br.ufrn.imd.modelo.Prato;

public class Cardapio {
	
	private ArrayList<Item> menu;
	
	public Cardapio() {
		menu = new ArrayList<Item>();
	}
	
	public void adicionarItem(Item item) {
		menu.add(item);
	}
	
	public void listarBebidas() {
		System.out.println("--Bebidas--");
		for (Item item : menu) {
			if(item instanceof Bebida) {
				System.out.println("************************************");
				System.out.println(item.getNome() + " (" + ((Bebida)item).getQuantidadeDeMl() + ")" + " - R$ " + item.getPreco());
				System.out.println(((Bebida)item).booleanToString());
			}
		}
		System.out.println("************************************");
	}

	public void listarPratos() {
		System.out.println("--Pratos--");
		for (Item item : menu) {
			if(item instanceof Prato) {
				System.out.println("************************************");
				System.out.println(item.getNome() + " - Serve " + ((Prato)item).getQuantidadeDePessoasServida() + " pessoas" + " - R$ " + item.getPreco());
				System.out.println("Ingredientes :" + ((Prato)item).getIngredientes());
				System.out.println(((Prato)item).booleanToString());
			}
		}
		System.out.println("************************************");
	}
	
	public void listarTudo() {}
}