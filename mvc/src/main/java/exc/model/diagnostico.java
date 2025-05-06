package exc.model;

public class diagnostico {
    private animal animal;
    private String descricao;

    public diagnostico(animal animal, String descricao) {
        this.animal = animal;
        this.descricao = descricao;
    }

    public animal getAnimal() { return animal; }
    public String getDescricao() { return descricao; }
}