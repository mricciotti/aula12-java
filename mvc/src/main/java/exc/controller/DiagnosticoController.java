package exc.controller;
import exc.model.animal;
import exc.model.diagnostico;
import java.util.ArrayList;
import java.util.List;

public class DiagnosticoController {
    private List<animal> animais = new ArrayList<>();
    private List<diagnostico> diagnosticos = new ArrayList<>();

    public void cadastrarAnimal(String nome, String especie, int idade) {
        animal animal = new animal(nome, especie, idade);
        animais.add(animal);
    }

    public void registrarDiagnostico(String nomeAnimal, String descricao) {
        for (animal animal : animais) {
            if (animal.getNome().equalsIgnoreCase(nomeAnimal)) {
                diagnosticos.add(new diagnostico(animal, descricao));
                return;
            }
        }
        throw new IllegalArgumentException("Animal não encontrado.");
    }

    public List<diagnostico> listarDiagnosticos() {
        return diagnosticos;
    }
}