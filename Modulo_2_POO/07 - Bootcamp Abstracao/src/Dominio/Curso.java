package Dominio;

public class Curso extends Conteudo{
    

    private int cargaHoraia;

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraia;
    }

    public int getCargaHoraia() {
        return cargaHoraia;
    }

    public void setCargaHoraia(int cargaHoraia) {
        this.cargaHoraia = cargaHoraia;
    }

    public String toString() {
        return "Curso{  titulo: " + getTitulo() + " descricao: "+ getDescricao() + " carga horaria: " + cargaHoraia +" }";
    }

    
}
