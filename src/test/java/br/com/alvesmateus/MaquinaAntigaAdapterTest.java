package br.com.alvesmateus;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaquinaAntigaAdapterTest {
    private ServicoLavagem adapter;

    @BeforeEach
    void setUp() {
        MaquinaIndustrialAntiga maquinaLegada = new MaquinaIndustrialAntiga();
        adapter = new MaquinaAntigaAdapter(maquinaLegada);
    }

    @Test
    @DisplayName("Deve converter 10 kg para libras e retornar a mensagem formatada da máquina antiga")
    void deveConverterPesoERetornarMensagemCorreta() {
        double pesoEmKg = 10.0;

        String esperado = "Máquina processando " + String.format("%.2f", 22.0462) + " lbs de roupas.";

        String resultado = adapter.lavarRoupas(pesoEmKg);

        assertEquals(esperado, resultado);
    }

    @Test
    @DisplayName("Deve lidar corretamente com peso zero")
    void deveLidarComPesoZero() {
        String esperado = "Máquina processando " + String.format("%.2f", 0.0) + " lbs de roupas.";

        String resultado = adapter.lavarRoupas(0.0);

        assertEquals(esperado, resultado);
    }
}
