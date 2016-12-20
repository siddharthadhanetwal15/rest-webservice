import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by siddhartha.dhanetwal on 12/20/2016.
 */
@ApplicationPath("/")
public class MyApp extends Application{
    @Override
    public Set<Class<?>> getClasses() {
        HashSet hs=new HashSet<Class<?>>();
        hs.add(HelloWorld.class);
        return hs;
    }
}
