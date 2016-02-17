import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class app {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/newguy", (request, response) -> {
      HashMap model = new HashMap();

      Tamagotchi myTamagotchi = request.session().attribute("pet");
      String name;
      if (myTamagotchi == null) {
        name = request.queryParams("name");
        myTamagotchi = new Tamagotchi(name);
        request.session().attribute("pet", myTamagotchi);
      } else {
        name = myTamagotchi.getTamagotchiName();
      }

      String action = request.queryParams("action");
      if (action != null) {
      if (action.equals("play")) {
        myTamagotchi.play();
        }
      }
      model.put("myTamagotchi", myTamagotchi);
      model.put("template", "templates/newguy.vtl");
      return new ModelAndView(model, layout);
      }, new VelocityTemplateEngine());
  }
}
