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
      HashMap<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  get("/newguy", (request, response) -> {
      HashMap<String, Object> model = new HashMap<String, Object>();
      String newName = request.queryParams("name");

      Tamagotchi myTamagotchi = new Tamagotchi(newName);
      String newGuy = myTamagotchi.getTamagotchiName();
      model.put("newGuy", newGuy);
      model.put("template", "templates/newguy.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
