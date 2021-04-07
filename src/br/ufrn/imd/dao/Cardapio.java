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
	
	/*public void adicionarItem(Item item) {
		menu.add(item);
	}*/
	
	public void listarBebidas() {
		System.out.println("--Bebidas--");
		for (Item item : menu) {
			if(item instanceof Bebida) {
				//System.out.println("************************************");
				System.out.println();
				System.out.println(item.getNome() + " (" + ((Bebida)item).getQuantidadeDeMl() + "ml)");
				System.out.println("Preço: R$ " + item.getPreco());
				System.out.println(((Bebida)item).booleanToString());
			}
		}
		//System.out.println("************************************");
		System.out.println();
	}

	public void listarPratos() {
		System.out.println("--Pratos--");
		for (Item item : menu) {
			if(item instanceof Prato) {
				//System.out.println("************************************");
				System.out.println();
				System.out.println(item.getNome() + " - " + ((Prato)item).getDescricao());
				System.out.println("Preço: R$ " + item.getPreco() + " - Serve " + ((Prato)item).getQuantidadeDePessoasServida() + " pessoa(s)");
				System.out.println(((Prato)item).booleanToString());
			}
		}
		//System.out.println("************************************");
		System.out.println();
	}
	
	public void listarTudo() {
		listarPratos();
		listarBebidas();
	}
	
	public void preencherCardapio() {
		Prato frango = new Prato();
		frango.setId(01);
		frango.setNome("Frango Grelhado");
		frango.setPreco(22.50);
		frango.setQuantidadeDePessoasServida(1);
		frango.setDescricao("Acompanha arroz branco e purê de batata.");
		frango.setContemGluten(false);
		menu.add(frango);
		
		Prato carne = new Prato();
		carne.setId(02);
		carne.setNome("Filé Mignon");
		carne.setPreco(27);
		carne.setQuantidadeDePessoasServida(1);
		carne.setDescricao("Acompanha feijão preto e arroz branco.");
		carne.setContemGluten(false);
		menu.add(carne);
		
		Prato peixe = new Prato();
		peixe.setId(03);
		peixe.setNome("Salmão com Alcaparras");
		peixe.setPreco(53.50);
		peixe.setQuantidadeDePessoasServida(2);
		peixe.setDescricao("Acompanha arroz com brócolis e batata doce.");
		peixe.setContemGluten(false);
		menu.add(peixe);
		
		Prato hamburger = new Prato();
		hamburger.setId(04);
		hamburger.setNome("Hamburger da Casa");
		hamburger.setPreco(18);
		hamburger.setQuantidadeDePessoasServida(1);
		hamburger.setDescricao("Acompanha batata frita e molho barbecue");
		hamburger.setContemGluten(true);
		menu.add(hamburger);
		
		Bebida coca = new Bebida();
		coca.setId(05);
		coca.setNome("Coca-Cola Lata");
		coca.setPreco(4.50);
		coca.setQuantidadeDeMl(350);
		coca.setDiet(false);
		coca.setLight(false);
		menu.add(coca);
		
		Bebida suco = new Bebida();
		suco.setId(06);
		suco.setNome("Suco de Laranja");
		suco.setPreco(5.50);
		suco.setQuantidadeDeMl(300);
		suco.setDiet(false);
		suco.setLight(false);
		menu.add(suco);
		
		Bebida guaranaDiet = new Bebida();
		guaranaDiet.setId(07);
		guaranaDiet.setNome("Guaraná Diet Lata");
		guaranaDiet.setPreco(5);
		guaranaDiet.setQuantidadeDeMl(350);
		guaranaDiet.setDiet(true);
		guaranaDiet.setLight(false);
		menu.add(guaranaDiet);
	}
}