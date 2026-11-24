package br.com.alvesmateus;

public class MaquinaAntigaAdapter implements ServicoLavagem {
    private final MaquinaIndustrialAntiga maquinaAntiga;
    private static final double FATOR_KG_PARA_LIBRAS = 2.20462;

    public MaquinaAntigaAdapter(MaquinaIndustrialAntiga maquinaAntiga) {
        this.maquinaAntiga = maquinaAntiga;
    }

    @Override
    public String lavarRoupas(double pesoEmKg) {
        double pesoConvertido = pesoEmKg * FATOR_KG_PARA_LIBRAS;
        return maquinaAntiga.iniciarCicloEmLibras(pesoConvertido);
    }
}
