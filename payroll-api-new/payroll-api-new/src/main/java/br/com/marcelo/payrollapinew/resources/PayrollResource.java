package br.com.marcelo.payrollapinew.resources;

import br.com.marcelo.payrollapinew.domain.Payroll;
import br.com.marcelo.payrollapinew.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    private final PayrollService service;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable long workerId, @RequestBody Payroll payment) {
        return ResponseEntity.ok().body(service.getPayment(workerId,payment));
    }

}
