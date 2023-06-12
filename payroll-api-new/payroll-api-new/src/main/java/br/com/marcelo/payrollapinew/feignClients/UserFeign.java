package br.com.marcelo.payrollapinew.feignClients;

import br.com.marcelo.payrollapinew.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "user-api")
public interface UserFeign {

    @GetMapping(value = "/api/users/{id}")
    ResponseEntity<User> findById(@PathVariable long id);

    @GetMapping
    ResponseEntity<List<User>> findAll();

}
