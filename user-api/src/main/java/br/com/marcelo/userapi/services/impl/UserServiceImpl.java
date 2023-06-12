package br.com.marcelo.userapi.services.impl;

import br.com.marcelo.userapi.Repositories.UserRepository;
import br.com.marcelo.userapi.domain.User;
import br.com.marcelo.userapi.services.UserService;
import br.com.marcelo.userapi.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    private final Environment env;

    @Override
    public User findById(Long id) {
        log.info("PAYROLL SERVICE ::: Get request on " + env.getProperty("local.server.port") + " port");
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Object not found"));
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

}
