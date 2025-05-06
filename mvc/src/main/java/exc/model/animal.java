package exc.model;

public class animal {
    private String nome;
    private String especie;
    private int idade;

    public animal(String nome, String especie, int idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public String getEspecie() { return especie; }
    public int getIdade() { return idade; }
}