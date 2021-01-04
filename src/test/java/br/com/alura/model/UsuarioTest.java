package br.com.alura.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import io.quarkus.panache.mock.PanacheMock;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@QuarkusTest
public class UsuarioTest {

    @Test
    public void deveFindByIdOptionalRetornarUsuarioCorreto(){
        PanacheMock.mock(Usuario.class);

        Usuario user = new Usuario();
        Optional<PanacheEntityBase> usuarioOptional = Optional.of(user);

        Mockito.when(Usuario.findByIdOptional(89))
                .thenReturn(usuarioOptional);

        assertSame(user, Usuario.findByIdOptional(89).get());

    }
}