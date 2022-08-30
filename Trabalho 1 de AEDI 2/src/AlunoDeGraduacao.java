class AlunoDeGraduacao extends Aluno {
    private int anoEntrada ;
    private int previsaoParaTerminar;
    private String curso;
    private String faraPosGraduacao;
    private float mediaNotas;


    //Extendendo a classe aluno para aluno de graduação.
    public AlunoDeGraduacao(String nome, int matricula, String email) {
        super(nome, matricula, email);
    }

    public AlunoDeGraduacao(String nome, int matricula, String email, String curso, int anoEntrada){
        super(nome, matricula, email);
        this.curso=curso;
        this.anoEntrada = anoEntrada;
    }


    public AlunoDeGraduacao(String nome, int matricula, String email, int previsaoParaTerminar){
        super ( nome, matricula, email);
        this.previsaoParaTerminar = (previsaoParaTerminar>0)?previsaoParaTerminar:00;

    }
    public AlunoDeGraduacao (String nome, int matricula, String email, String faraPosGraduacao){
        super(nome, matricula, email);
        this.faraPosGraduacao = faraPosGraduacao;

    }

    public AlunoDeGraduacao(String nome, int matricula, String email, float mediaNotas){
        super(nome, matricula, email);
        this.setMediaNotas(mediaNotas);
    }

    public int getAnoEntrada() {
        return anoEntrada;
    }

    public void setAnoEntrada(int anoEntrada) {
        this.anoEntrada = anoEntrada;
    }

    public int getPrevisaoParaTerminar() {
        return previsaoParaTerminar;
    }

    public void setPrevisaoParaTerminar(int previsaoParaTerminar) {
        this.previsaoParaTerminar = previsaoParaTerminar;
    }

    public String getFaraPosGraduacao() {
        return faraPosGraduacao;
    }

    public void setFaraPosGraduacao(String faraPosGraduacao) {
        this.faraPosGraduacao = faraPosGraduacao;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMediaNotas() {
        return mediaNotas;
    }

    public void setMediaNotas(float mediaNotas) {
        this.mediaNotas = mediaNotas;
    }

    public String toString (){
        return toString()+"Curso: "+curso+"\nAno de entrada: "+anoEntrada+"\nPrevisão para terminar: "+previsaoParaTerminar+"\nFará pós graduação? "+faraPosGraduacao;
    }
}
