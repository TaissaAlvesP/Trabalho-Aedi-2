public class Aluno {
    private String nome, email;
    private int matricula;

    //Construtor nome e matrícula
    public Aluno (String nome, int matricula ){
        //Se nome for vazio aparece Zé mané.
        this.nome = (nome == "" ) ? "Zé mané": nome;
        //Se matrícula não tiver 7 dígitos aparece 9999999
        this.matricula = (matricula / 1000000) < 0 ? 9999999 : matricula;
    }
    //Construtor nome, matrícula e email
    public Aluno(String nome, int matricula, String email){
        this.nome = (nome == "" ) ? "Zé mané": nome;
        this.matricula = (matricula / 1000000) < 0 ? 9999999 : matricula;

        //separar o email por arroba
        String[] emailArroba = email.split("@");

        //Verificar se tem palavras dos dois lados do "@".
        if (emailArroba.length == 2 && emailArroba[0] != "" && emailArroba[1] != "") {
            this.email = email;
        } else this.email = "E-mail invalído.";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMatricula() {
        return matricula;
    }

    //Matrícula não pode ser alterada depois de criada.
    /*public void setMatricula(int matricula) {
        this.matricula = matricula;
    }*/

    public String toString (){
        return "Aluno: "+nome+", matrícula: "+matricula+"\nemail "+email;
    }

}
