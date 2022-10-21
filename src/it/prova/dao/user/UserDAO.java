package it.prova.dao.user;

import java.util.Date;
import java.util.List;

import it.prova.dao.IBaseDAO;
import it.prova.model.User;

public interface UserDAO extends IBaseDAO<User> {

	public List<User> findAllUsernameStartsWith(String iniziale) throws Exception;

	public List<User> findAllCreatedBefore(Date dataConfronto) throws Exception;

	public List<User> findBySurnameAndNameStartsWith(String cognomeInput, String inzialeNomeInput) throws Exception;

	public User logInto(String loginInput, String passwordInput) throws Exception;

}
