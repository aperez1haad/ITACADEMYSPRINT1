package INTELIJ.SPRINT1TASCA7.N1EX2;

public class TreballadorOnline extends Treballador {
    private static final int tarifaplana = 40;
    public TreballadorOnline(String Nom, String Apellido, int salarioHora) {
        super(Nom, Apellido, salarioHora);
    }
    @Override
    public int calcularSou(int horasTrabajadas){
        return (super.calcularSou(horasTrabajadas))+ tarifaplana;
    }
    @Deprecated
    public int MetodoDeprecatedCalcularSouOnline(int HorasTrabajadas){
        return (super.calcularSou(HorasTrabajadas))+ tarifaplana +150;
    }
}
