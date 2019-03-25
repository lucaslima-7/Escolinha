package webservices;

import classes.Notas;
import dao.NotaDAO;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("Notas")
public class NotasResource {

    @Context
    private UriInfo context;

    public NotasResource() {
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Notas> getClientes() {
        List<Notas> lista = new NotaDAO().getNotas();
        return lista;
    }
    
    @GET
    @Path("{id_aluno}")
    @Produces(MediaType.APPLICATION_JSON)
    public Notas getProduto(@PathParam("id_aluno") int id_aluno){
        Notas notas = new NotaDAO().getNotas(id_aluno);
        return notas;
    }
}
