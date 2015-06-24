package br.pucrs.cepes.dao;

public interface GenericDAO<T> {

	public void salvar(T obj);
	public void excluir(T obj);
	public void alterar(T obj);
	public void consultar(T obj);
}
