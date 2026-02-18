package dev.FelipedBarbosa.itauProject;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transacao {
    private BigDecimal valor;
    private LocalDate dataHora;
}
