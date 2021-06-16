package br.com.alura.manager.dao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import br.com.alura.manager.model.Enterprise;

public class Bank {

	private static List<Enterprise> listEnterprise = new ArrayList<Enterprise>();
	private static Integer key = 1;
	
	static {
		var enterprise = new Enterprise();
		var enterprise2 = new Enterprise();		
		enterprise.setId(key++);
		enterprise.setName("Zup");
		enterprise2.setId(key++);
		enterprise2.setName("Google");
		listEnterprise.add(enterprise);
		listEnterprise.add(enterprise2);
		
	}
	
	public void save(Enterprise enterprise) {
		enterprise.setId(Bank.key++);
		listEnterprise.add(enterprise);
	}
	
	public List<Enterprise> getEnterprise(){
		return Bank.listEnterprise;
	}

	public void removeEnterprise(Integer id) {
		Iterator<Enterprise> it = listEnterprise.iterator();
		while (it.hasNext()) {
			Enterprise enter = it.next();
			if(enter.getId().equals(id)) it.remove();
		}
	}

	public Enterprise findById(Integer id) {
		for (Enterprise enterprise : listEnterprise) {
			if (enterprise.getId().equals(id)) return enterprise;
		}
		return null;
	}

}
