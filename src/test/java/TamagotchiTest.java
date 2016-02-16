import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class TamagotchiTest {

  @Test
  public void tamagotchi_instantiatesCorrectly() {
    Tamagotchi testTamagotchi = new Tamagotchi("Grendel");
    assertEquals(true, testTamagotchi instanceof Tamagotchi);
  }

  @Test
  public void TamagotchiHasAName() {
    Tamagotchi testTamagotchi = new Tamagotchi("Grendel");
    assertEquals("Grendel", testTamagotchi.getTamagotchiName());
  }

  @Test
  public void TamagotchiisEmpty() {
    Tamagotchi testTamagotchi = new Tamagotchi("Grendel");
    assertEquals(true, testTamagotchi.isEmpty());
  }

  @Test
  public void TamagotchiisFull() {
    Tamagotchi testTamagotchi = new Tamagotchi("Grendel");
    testTamagotchi.load();
    assertEquals(false, testTamagotchi.isEmpty());
  }



  // @Test
  // public void tamagotchi_instantiatesCorrectly() {
  //   Tamagotchi myPet = new Tamagotchi("lil dragon");
  //   assertEquals("lil dragon", myPet.getName());
  //   assertEquals(10, myPet.getFoodLevel());
  //   assertEquals(10, myPet.getSleepLevel());
  //   assertEquals(10, myPet.getActivityLevel());
  // }
}
