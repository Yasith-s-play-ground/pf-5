import java.io.IOError;
import java.io.IOException;
import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.sql.SQLException;
import java.util.List;

class Demo6 {
    void myMethod(@Min int x, @Max int y) throws IOException {
    }

    protected strictfp <T extends Serializable, E extends Exception & Serializable> void myMethod2(List<T> myList) throws E {
    }

    private native synchronized int myMethod1()[][][];

    private native synchronized int[][][] myMethod2();

    public @Min
    static <@Max T> int myMethod3(List<?> names, final T... something)[] {
        return new int[0];
    }

    //public synchronized @Min <@Max K, Y extends Error,@Test DEP extends Min & Max> void something(@Test List<? super Serializable> something, @Test @Min Set < ?extends Serializable> mySet) throws Y{}

    protected @SafeVarargs synchronized strictfp static <@Max T> @Test int[]  welcome(final int x, T t, String ... args)@Test[] @Test [] throws IOException, IOError, SQLException {return null;}
}

@interface Min {
}
@Target(ElementType.TYPE_USE)
@interface Test {
}

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@interface Max {
}