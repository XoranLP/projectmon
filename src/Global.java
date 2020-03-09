public interface Global{
  public enum Abilities {INTIMIDATE};
  public enum AoE       {SINGLE, ENEMY, FIELD, WEATHER, SELF};
  public enum Attacks   {TACKLE};
  public enum EggGroup  {UNKNOWN, AMORPHOUS, DITTO, DRAGON, FAIRY, FIELD , FLYING, HUMANOID, BUG, MINERAL, MONSTER, PLANT, WATER1, WATER2, WATER3};
  public enum Gender    {NONE, MALE, FEMALE};
  public enum Item      {};
  public enum Nature    {HARDY, LONELY, BRAVE, ADAMANT, NAUGHTY, BOLD, DOCILE, RELAXED, IMPISH, LAX, TIMID, HASTY, SERIOUS, JOLLY, NAIVE, MODEST, MILD, QUIET, BASHFUL, RASH, CALM, GENTLE, SASSY, CAREFUL, QUIRKY};
  public enum Stats     {KP, ATK, VERT, SPATK, SPVERT, INIT};
  public enum Types     {NORMAL, FIGHTING, FLYING, POISON, GROUND, ROCK, BUG, GHOST, STEEL, FIRE, WATER, GRASS, ELECTRIC, PSYCHIC, ICE, DRAGON, DARK, FAIRY};
  public enum Weather   {STANDARD, SUNNY, RAINY, SANDSTORM, BLIZZARD, WINDY, FOGGY};
  public final byte effectivity = {
  //NORMAL, FIGHTING, FLYING, POISON, GROUND, ROCK, BUG, GHOST, STEEL, FIRE, WATER, GRASS, ELECTRIC, PSYCHIC, ICE, DRAGON, DARK, FAIRY
  {  0,  0,  0,  0,  0, -1,  0, -2, -1,  0,  0,  0,  0,  0,  0,  0,  0,  0}, //NORMAL
  {  1,  0, -1, -1,  0,  1, -1, -2,  1,  0,  0,  0,  0, -1,  1,  0,  1, -1}, //FIGHTING
  {  0,  1,  0,  0, -2, -1,  1,  0, -1,  0,  0,  1, -1,  0,  0,  0,  0,  0}, //FLYING
  {  0,  0,  0, -1, -1, -1   0, -1, -2,  0,  0,  1,  0,  0,  0,  0,  0,  1}, //POISON
  {  0,  0, -2,  1,  0,  1, -1,  0,  1,  1,  0, -1,  1,  0,  0,  0,  0,  0}, //GROUND
  {  0, -1,  1,  0, -1,  0,  1,  0, -1,  1,  0,  0,  0,  0,  1,  0,  0,  0}, //ROCK
  {  0, -1, -1, -1,  0,  0,  0, -1, -1, -1,  0,  1,  0,  1,  0,  0,  1, -1}, //BUG
  { -2,  0,  0,  0,  0,  0,  0,  1,  0,  0,  0,  0,  0,  1,  0,  0, -1,  0}, //GHOST
  {  0,  0,  0,  0,  0,  1,  0,  0, -1, -1, -1,  0, -1,  0,  1,  0,  0,  1}, //STEEL
  {  0,  0,  0,  0,  0, -1,  1,  0,  1, -1, -1,  1,  0,  0,  1, -1,  0,  0}, //FIRE
  {  0,  0,  0,  0,  1,  1,  0,  0,  0,  1, -1, -1,  0,  0,  0, -1,  0,  0}, //WATER
  {  0,  0, -1, -1,  1,  1, -1,  0, -1, -1,  1, -1,  0,  0,  0, -1,  0,  0}, //GRASS
  {  0,  0,  1,  0, -2,  0,  0,  0,  0,  0,  1, -1, -1,  0,  0, -1,  0,  0}, //ELECTRIC
  {  0,  1,  0,  1,  0,  0,  0,  0, -1,  0,  0,  0,  0, -1,  0,  0, -2,  0}, //PSYCHIC
  {  0,  0,  1,  0,  1,  0,  0,  0, -1, -1, -1,  1,  0,  0, -1,  1,  0,  0}, //ICE
  {  0,  0,  0,  0,  0,  0,  0,  0, -1,  0,  0,  0,  0,  0,  0,  1,  0, -2}, //DRAGON
  {  0, -1,  0,  0,  0,  0,  0,  1,  0,  0,  0,  0,  0,  1,  0,  0, -1, -1}, //DARK
  {  0,  1,  0, -1,  0,  0,  0,  0, -1, -1,  0,  0,  0,  0,  0,  1,  1,  0}  //FAIRY
};
