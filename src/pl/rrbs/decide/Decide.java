package pl.rrbs.decide;

/**
 * Class for having more verbose boolean values. Usage:
 * <ol>
 * <li> Define some empty enum with nice name, i.e. enum CatchAllPokemons {}</li>
 * <li> Use as parameter in method instead of boolean i.e. void goOnJourney(Decide&lt;CatchAllPokemons&gt; catchAll)</li>
 * <li> Use in code i.e. goOnJourney(Decide.DoNot(CatchAllPokemons.class))</li>
 * </ol>
 */
public final class Decide<T extends Enum<T>> {
    @SuppressWarnings("rawtypes")
	private static final Decide POSITIVE = new Decide(true);
    @SuppressWarnings("rawtypes")
    private static final Decide NEGATIVE = new Decide(false);

    @SuppressWarnings({ "unchecked" })
    private static <T extends Enum<T>> Decide<T> getPositiveAnswer(Class<T> clazz) {
        return POSITIVE;
    }

    @SuppressWarnings({ "unchecked" })
    public static <T extends Enum<T>> Decide<T> getNegativeAnswer(Class<T> clazz) {
        return NEGATIVE;
    }

    public static <T extends Enum<T>> Decide<T> Do(Class<T> clazz) {
        return getPositiveAnswer(clazz);
    }

    public static <T extends Enum<T>> Decide<T> DoNot(Class<T> clazz) {
        return getNegativeAnswer(clazz);
    }

    public static <T extends Enum<T>> Decide<T> With(Class<T> clazz) {
        return getPositiveAnswer(clazz);
    }

    public static <T extends Enum<T>> Decide<T> Without(Class<T> clazz) {
        return getNegativeAnswer(clazz);
    }
    
    private boolean isDecisionPositive;

    private Decide(boolean isDecisionPositive) {
        this.isDecisionPositive = isDecisionPositive;
    }

    public boolean asBool() {
        return isDecisionPositive;
    }
}
