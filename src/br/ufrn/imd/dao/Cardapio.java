package br.ufrn.imd.dao;

import java.util.ArrayList;
import br.ufrn.imd.modelo.Item;
import br.ufrn.imd.modelo.Bebida;
import br.ufrn.imd.modelo.Prato;

public class Cardapio {
	
	private ArrayList<Item> menu;
	
	public Cardapio() {
		menu = new ArrayList<Item>();
		preencherCardapio();
	}
	
	public String listarBebidas() {
		String output = "";
		
		for (Item item : menu) {
			if(item instanceof Bebida) {
				output += "\n";
				output += item.getNome() + " (" + ((Bebida)item).getQuantidadeDeMl() + "ml)" + "\n";
				output += "Preço: R$ " + item.getPreco() + "\n";
				output += ((Bebida)item).booleanToString();
				output += "\n";
			}
		}
		return output;
	}

	public String listarPratos() {
		String output = "";
		
		for (Item item : menu) {
			if(item instanceof Prato) {
				output += "\n";
				output += item.getNome() + " - " + ((Prato)item).getDescricao() + "\n";
				output += "Preço: R$ " + item.getPreco() + " - Serve " + ((Prato)item).getQuantidadeDePessoasServida() + " pessoa(s)" + "\n";
				output += ((Prato)item).booleanToString();
				output += "\n";
			}
		}
		return output;
	}
	
	public void preencherCardapio() {
		Prato frango = new Prato();
		frango.setId(1);
		frango.setNome("Frango Grelhado");
		frango.setPreco(22.50);
		frango.setQuantidadeDePessoasServida(1);
		frango.setDescricao("Acompanha arroz branco e purê de batata.");
		frango.setContemGluten(false);
		menu.add(frango);
		
		Prato carne = new Prato();
		carne.setId(2);
		carne.setNome("Filé Mignon");
		carne.setPreco(27);
		carne.setQuantidadeDePessoasServida(1);
		carne.setDescricao("Acompanha feijão preto e arroz branco.");
		carne.setContemGluten(false);
		menu.add(carne);
		
		Prato peixe = new Prato();
		peixe.setId(3);
		peixe.setNome("Salmão com Alcaparras");
		peixe.setPreco(53.50);
		peixe.setQuantidadeDePessoasServida(2);
		peixe.setDescricao("Acompanha arroz branco e batata doce.");
		peixe.setContemGluten(false);
		menu.add(peixe);
		
		Prato hamburger = new Prato();
		hamburger.setId(4);
		hamburger.setNome("Hamburger da Casa");
		hamburger.setPreco(18);
		hamburger.setQuantidadeDePessoasServida(1);
		hamburger.setDescricao("Acompanha batata frita e molho barbecue");
		hamburger.setContemGluten(true);
		menu.add(hamburger);
		
		Bebida agua = new Bebida();
		agua.setId(5);
		agua.setNome("Água Mineral Garrafa");
		agua.setPreco(3.50);
		agua.setQuantidadeDeMl(500);
		agua.setDiet(false);
		agua.setLight(false);
		menu.add(agua);
		
		Bebida suco = new Bebida();
		suco.setId(6);
		suco.setNome("Suco de Laranja Copo");
		suco.setPreco(5.50);
		suco.setQuantidadeDeMl(300);
		suco.setDiet(false);
		suco.setLight(false);
		menu.add(suco);
		
		Bebida coca = new Bebida();
		coca.setId(7);
		coca.setNome("Coca-Cola Lata");
		coca.setPreco(4.50);
		coca.setQuantidadeDeMl(350);
		coca.setDiet(false);
		coca.setLight(false);
		menu.add(coca);
		
		Bebida guaranaDiet = new Bebida();
		guaranaDiet.setId(8);
		guaranaDiet.setNome("Guaraná Diet Lata");
		guaranaDiet.setPreco(5);
		guaranaDiet.setQuantidadeDeMl(350);
		guaranaDiet.setDiet(true);
		guaranaDiet.setLight(false);
		menu.add(guaranaDiet);
	}
}