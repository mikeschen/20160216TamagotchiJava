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
    mFoodCount = MAX_FOOD;
  }
  //click submit btn

  public Object play() {
    mFoodCount -= 1;
    if (mFoodCount == 0) {
      return "I'm Hungry!";
    } else {
      return mFoodCount;
    }
  }

  public Object feed() {
    mFoodCount += 1;
    if (mFoodCount == 10) {
      return "I'm Full";
    } else {
      return mFoodCount;
    }
  }

  public String getTamagotchiName() {
    return mTamagotchiName;
  }
}
