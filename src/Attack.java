public class Attack implements Global{
public attacks[] = {all attacks}

private interface standard{
	public static void execute();
}

private class Tackle implements standard {
	public final Type type = NORMAL;
	public final AoE aoe = SINGLE;
	public final boolean isSpezial = false;
	public final boolean makesContact = true;

	public final String description = "A physical attack in which the user charges and slams into the target with its whole body.";

	public final byte strength = 40;
	public final byte accuracy = 100;
	public final byte priority = 0;
	public final byte cost = 10;

	public static void execute() {
		return;
	}
}
}
