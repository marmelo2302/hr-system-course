package br.com.marcelo.userapi.services;

import br.com.marcelo.userapi.domain.User;

import java.util.List;

public interface UserService {

    User findById(Long id);
    List<User> findAll();

}
