package INTELIJ.SPRINT1TASCA7.N1EX2;

public class TreballadorPresencial extends Treballador {
    private static int benzina = 150;
    public TreballadorPresencial(String Nom, String Apellido, int salarioHora) {
        super(Nom, Apellido, salarioHora);
    }
    @Override
    public int calcularSou(int horasTrabajadas) {
        return (super.calcularSou(horasTrabajadas))+ benzina;
    }
    @Deprecated
    public int metodoDeprecatedCalcularSouPresencial(int horasTrabajadas){
        return (super.calcularSou(horasTrabajadas));
    }
}
