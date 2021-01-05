package br.com.alura.resource;

import br.com.alura.model.Usuario;

<<<<<<< HEAD
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
=======
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
>>>>>>> bb09f0c86be65059967533178cc772867909359a

@Path("/usuarios")
public class UsuarioResource {

    @POST
<<<<<<< HEAD
    @PermitAll
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(Usuario usuario){
        Usuario.inserir(usuario);
    }

    @GET
    @RolesAllowed("ADMIN")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Usuario> listar(){
        return Usuario.listAll();
=======
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public void inserir(Usuario usuario){
        Usuario.persist(usuario);
>>>>>>> bb09f0c86be65059967533178cc772867909359a
    }

}
