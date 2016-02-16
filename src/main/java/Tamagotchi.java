import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class Tamagotchi {
  public static final int MAX_FOOD = 10;
  private String mTamagotchiName;
  private int mFoodCount;

  public Tamagotchi(String TamagotchiName) {
    mTamagotchiName = TamagotchiName;
    mFoodCount = 0;
  }

  public boolean isEmpty() {
    return mFoodCount == 0;
  }

  public void load() {
    mFoodCount = MAX_FOOD;
  }

  public String getTamagotchiName() {
    return mTamagotchiName;
  }
}
