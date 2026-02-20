package dev.FelipedBarbosa.itauProject;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.time.OffsetDateTime;

@Service
public class TransacaoService {

    public void validarTransacao(TransacaoRequest transacaoRequest) {

        if (transacaoRequest.getValor().compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Erro: Isso não é uma transação válida, transações devem ter valor maior que zero");
        }
        if (transacaoRequest.getDataHora().isAfter(OffsetDateTime.now())) {
            throw new IllegalArgumentException("Erro: Na data da transação");

        }
        if (transacaoRequest == null) {
            throw new IllegalArgumentException("Erro: corpo da requisição não pode ser vazio");
        }
        if (transacaoRequest.getDataHora() == null) {
            throw new IllegalArgumentException("Erro: dataHora não pode ser nula");
        }
    }
}
