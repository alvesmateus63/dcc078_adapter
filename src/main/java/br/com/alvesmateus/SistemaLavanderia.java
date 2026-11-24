package br.com.alvesmateus;

public class SistemaLavanderia {
    public String processarPedido(ServicoLavagem maquina, double pesoEmKg) {
        return maquina.lavarRoupas(pesoEmKg);
    }
}
