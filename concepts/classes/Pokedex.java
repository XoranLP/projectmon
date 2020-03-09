public class Pokedex {
  /**/
}


private class Entry {
  private boolean b;
  public static void activate() {this.b = True;}

  String entry = "";
  public static String getEntry() {return b?entry : "? ? ?";}
}


private class Pokemon {
  pubic Pokemon(String) {
    //Parse Pokemon
  }

  int weight;
  int hight;

  Entry entries = new Entry[5] // {met, hatched, owned, defeated, leveled};
  getEntries() {
    String output;
    for (entry: entries) {
      output.append(entry.getEntry() + "\n\n");
    }
    return output;
  }
}
