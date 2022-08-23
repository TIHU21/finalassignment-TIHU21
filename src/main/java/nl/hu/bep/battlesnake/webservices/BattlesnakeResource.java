package nl.hu.bep.battlesnake.webservices;

import nl.hu.bep.battlesnake.model.GameInfo;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

class moveResponse {
    public String move;
    public String shout;
//    public moveResponse(String move, String shout) {
//        this.move
//    }
}

@Path("/snake")
public class BattlesnakeResource {
    @GET
    @Produces((MediaType.APPLICATION_JSON))
    public Response getInfo() {
        GameInfo information = new GameInfo();
        information.setAuthor("TIHU21");
        return Response.ok(information).build();
    }
    @POST
    @Path("/start")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response startGame() {

        return Response.ok().build();
    }
    @POST
    @Path("/end")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response endGame() {

        return Response.ok().build();
    }
    @POST
    @Path("/move")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response moveGame() { //Maak klasse moveRequest met attributen die je (in DummyBody.json)
        moveResponse move = new moveResponse();
        move.move = "up";
        move.shout = "Going up";

        return Response.ok(move).build();
    }
}

