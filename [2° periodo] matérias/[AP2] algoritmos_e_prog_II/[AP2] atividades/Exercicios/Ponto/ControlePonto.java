package Exercicios.Ponto;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ControlePonto {
    private ArrayList<Empregado> funcionarios;
    private ArrayList<RegistroPonto> registros;

    public ControlePonto() {
        funcionarios = new ArrayList<>();
        registros = new ArrayList<>();
    }

    public void adicionarFuncionario(Empregado funcionario) {
        funcionarios.add(funcionario);
        System.out.println("Funcionário adicionado: " + funcionario.getNome());
    }

    public void registrarEntrada(Empregado funcionario) {
        RegistroPonto registro = new RegistroPonto(funcionario, LocalDateTime.now());
        registros.add(registro);
        System.out.println("Entrada registrada para " + funcionario.getNome() + " às " + LocalDateTime.now());
    }

    public void registrarSaida(Empregado funcionario) {
        for (RegistroPonto registro : registros) {
            if (registro.getFuncionario().getCpf().equals(funcionario.getCpf()) && registro.calcularHorasTrabalhadas() == 0) {
                registro.registrarSaida(LocalDateTime.now());
                System.out.println("Saída registrada para " + funcionario.getNome() + " às " + LocalDateTime.now());
                return;
            }
        }
        System.out.println("Erro: entrada não encontrada para o funcionário " + funcionario.getNome());
    }

    public void exibirRelatorio() {
        System.out.println("Relatório de Pontos:");
        for (RegistroPonto registro : registros) {
            System.out.println(registro + " - Horas Trabalhadas: " + registro.calcularHorasTrabalhadas());
        }
    }

    public Empregado buscarFuncionarioPorCpf(String cpf) {
        for (Empregado funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                return funcionario;
            }
        }
        return null;
    }
}
