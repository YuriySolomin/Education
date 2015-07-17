package education;

/**
 * Created with IntelliJ IDEA.
 * User: solomin-y
 * Date: 7/17/15
 * Time: 10:03 AM

 */
public interface BaseService {

    public <T> T execute(T... parameters);
}
