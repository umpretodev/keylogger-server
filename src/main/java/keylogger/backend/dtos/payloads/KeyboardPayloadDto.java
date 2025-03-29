package keylogger.backend.dtos.payloads;

import jakarta.validation.constraints.NotBlank;

public record KeyboardPayloadDto(
    @NotBlank(message = "Logs cannot be empty")
    String keypress
    ) {}
