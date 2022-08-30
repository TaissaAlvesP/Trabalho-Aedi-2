public class AlunoDePosGraduacao extends Aluno{
    private int graduacao;
    private int inicioSemestre;
    private String curso;

    public AlunoDePosGraduacao (String nome, int matricula, String email){
        super(nome, matricula, email);
    }
    public AlunoDeGraduacao()

    public int getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(int graduacao) {
        this.graduacao = graduacao;
    }

    public int getInicioSemestre() {
        return inicioSemestre;
    }

    public void setInicioSemestre(int inicioSemestre) {
        this.inicioSemestre = inicioSemestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
