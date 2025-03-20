package Exercicios.Ponto;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class RegistroPonto {
    private Empregado funcionario;
    private LocalDateTime horarioEntrada;
    private LocalDateTime horarioSaida;

    public RegistroPonto(Empregado funcionario, LocalDateTime horarioEntrada) {
        this.funcionario = funcionario;
        this.horarioEntrada = horarioEntrada;
    }

    public void registrarSaida(LocalDateTime horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public long calcularHorasTrabalhadas() {
        if (horarioSaida != null) {
            return ChronoUnit.HOURS.between(horarioEntrada, horarioSaida);
        }
        return 0;
    }

    public Empregado getFuncionario() {
        return funcionario;
    }

    @Override
    public String toString() {
        String entrada = horarioEntrada != null ? horarioEntrada.toString() : "N/A";
        String saida = horarioSaida != null ? horarioSaida.toString() : "N/A";
        return "Funcionário: " + funcionario.getNome() + ", Entrada: " + entrada + ", Saída: " + saida;
    }
}

