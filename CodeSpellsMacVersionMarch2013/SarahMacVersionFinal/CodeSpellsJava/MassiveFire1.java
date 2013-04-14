import june.*;
import java.util.*;

public class MassiveFire1 extends Spell
{
  public void cast()
  { 
    Enchanted area   = getByName("Area 1");

    area.grow(10);

    EnchantedList list = area.findWithin();

    for(Enchanted thing : list)
    {
      thing.onFire(true);
    }
  }
}
