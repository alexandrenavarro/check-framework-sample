

/**
 * <p>ImmutableClass. </p>
 *
 * @author anavarro - Apr 23, 2013
 *
 */
//@Immutable
public final class ImmutableClass {
    final private String name;

    /**
     * Constructor.
     *
     * @param aName
     */
    private ImmutableClass(final String aName) {
        super();
        this.name = aName;
    }

    /**
     * getName.
     *
     * @return
     */
    public String getName() {
        return this.name;
    }
    
    
}
