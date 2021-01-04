package br.com.alura.repository;

import br.com.alura.model.Ordem;
import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertSame;

@QuarkusTest
public class OrdemRepositoryTest {

    @InjectMock
    OrdemRepository ordemRepository;

    @Test
    public void deveListAllRetornarOrdensCorretas(){
        Ordem primeiraOrdem = new Ordem();
        Ordem segundaOrdem = new Ordem();
        List<Ordem> ordens = List.of(primeiraOrdem, segundaOrdem);

        Mockito.when(ordemRepository.listAll())
                .thenReturn(ordens);

        assertSame(segundaOrdem, ordemRepository.listAll().get(1));
    }
}