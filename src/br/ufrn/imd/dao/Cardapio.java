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
	
	public Item getItemEspecifico(int id) {
		for(Item item : menu) {
			if(item.getId() == id) {
				return item;
			}
		}
		return null;
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
		Item frango = new Prato();
		frango.setId(1);
		frango.setNome("Frango Grelhado");
		frango.setPreco(22.50);
		((Prato)frango).setQuantidadeDePessoasServida(1);
		((Prato)frango).setDescricao("Acompanha arroz branco e purê de batata.");
		((Prato)frango).setContemGluten(false);
		menu.add(frango);
		
		Item carne = new Prato();
		carne.setId(2);
		carne.setNome("Filé Mignon");
		carne.setPreco(27);
		((Prato)carne).setQuantidadeDePessoasServida(1);
		((Prato)carne).setDescricao("Acompanha feijão preto e arroz branco.");
		((Prato)carne).setContemGluten(false);
		menu.add(carne);
		
		Item peixe = new Prato();
		peixe.setId(3);
		peixe.setNome("Salmão com Alcaparras");
		peixe.setPreco(53.50);
		((Prato)peixe).setQuantidadeDePessoasServida(2);
		((Prato)peixe).setDescricao("Acompanha arroz branco e batata doce.");
		((Prato)peixe).setContemGluten(false);
		menu.add(peixe);
		
		Item hamburger = new Prato();
		hamburger.setId(4);
		hamburger.setNome("Hamburger da Casa");
		hamburger.setPreco(18);
		((Prato)hamburger).setQuantidadeDePessoasServida(1);
		((Prato)hamburger).setDescricao("Acompanha batata frita e molho barbecue");
		((Prato)hamburger).setContemGluten(true);
		menu.add(hamburger);
		
		Item agua = new Bebida();
		agua.setId(5);
		agua.setNome("Água Mineral Garrafa");
		agua.setPreco(3.50);
		((Bebida)agua).setQuantidadeDeMl(500);
		((Bebida)agua).setDiet(false);
		((Bebida)agua).setLight(false);
		menu.add(agua);
		
		Item suco = new Bebida();
		suco.setId(6);
		suco.setNome("Suco de Laranja Copo");
		suco.setPreco(5.50);
		((Bebida)suco).setQuantidadeDeMl(300);
		((Bebida)suco).setDiet(false);
		((Bebida)suco).setLight(false);
		menu.add(suco);
		
		Item coca = new Bebida();
		coca.setId(7);
		coca.setNome("Coca-Cola Lata");
		coca.setPreco(4.50);
		((Bebida)coca).setQuantidadeDeMl(350);
		((Bebida)coca).setDiet(false);
		((Bebida)coca).setLight(false);
		menu.add(coca);
		
		Item guaranaDiet = new Bebida();
		guaranaDiet.setId(8);
		guaranaDiet.setNome("Guaraná Diet Lata");
		guaranaDiet.setPreco(5);
		((Bebida)guaranaDiet).setQuantidadeDeMl(350);
		((Bebida)guaranaDiet).setDiet(true);
		((Bebida)guaranaDiet).setLight(false);
		menu.add(guaranaDiet);
	}
}