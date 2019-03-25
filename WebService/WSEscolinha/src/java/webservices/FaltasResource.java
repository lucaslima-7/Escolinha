package webservices;

import classes.Faltas;
import dao.FaltaDAO;
import java.util.List;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("Faltas")
public class FaltasResource {

    @Context
    private UriInfo context;

    public FaltasResource() {
    }
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Faltas> getFaltas() {
        List<Faltas> lista = new FaltaDAO().getFaltas();
        return lista;
    }
    
    @GET
    @Path("{id_aluno}")
    @Produces(MediaType.APPLICATION_JSON)
    public Faltas getFaltas(@PathParam("id_aluno") int id_aluno){
        Faltas faltas = new FaltaDAO().getFaltas(id_aluno);
        return faltas;
    }
}
