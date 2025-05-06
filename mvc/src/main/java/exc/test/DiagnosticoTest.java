package exc.test;

import exc.controller.DiagnosticoController;
import exc.model.diagnostico;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class DiagnosticoControllerTest {

    @Test
    public void testCadastroEConsultaAnimal() {
        DiagnosticoController ctrl = new DiagnosticoController();
        ctrl.cadastrarAnimal("Rex", "Cachorro", 5);
        ctrl.registrarDiagnostico("Rex", "Gripe Canina");
        List<diagnostico> lista = ctrl.listarDiagnosticos();
        assertEquals(1, lista.size());
        assertEquals("Rex", lista.get(0).getAnimal().getNome());
    }

    @Test
    public void testAnimalNaoEncontrado() {
        DiagnosticoController ctrl = new DiagnosticoController();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ctrl.registrarDiagnostico("Bidu", "Pulgas");
        });
        assertEquals("Animal não encontrado.", exception.getMessage());
    }
}