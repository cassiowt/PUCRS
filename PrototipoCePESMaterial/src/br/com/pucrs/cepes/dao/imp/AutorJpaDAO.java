package br.com.pucrs.cepes.dao.imp;

import javax.persistence.EntityManager;

import br.com.pucrs.cepes.dao.GenericDAO;
import br.com.pucrs.cepes.util.JpaUtil;
import br.pucrs.cepes.model.material.Autor;

public class AutorJpaDAO implements GenericDAO<Autor> {

	static EntityManager fabrica = JpaUtil.getFactory();
	
	@Override
	public void salvar(Autor obj) {
		
		try {
			fabrica.getTransaction().begin();
			if (obj.getId()<0) {
				fabrica.persist(obj);
			} else {
				fabrica.merge(obj);
			}
			fabrica.flush();
			fabrica.getTransaction().commit();
		} catch (Exception ex) {
			fabrica.getTransaction().rollback();
		} finally {
			fabrica.close();
		}

	}

	@Override
	public void excluir(Autor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterar(Autor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listar() {
		// TODO Auto-generated method stub
		
	}

}
