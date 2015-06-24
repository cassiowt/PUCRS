package br.pucrs.cepes.dao.imp;

import javax.persistence.EntityManager;

import br.pucrs.cepes.dao.GenericDAO;
import br.pucrs.cepes.model.material.Autor;
import br.pucrs.cepes.util.JpaUtil;

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
