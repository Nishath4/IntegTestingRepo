import com.zoho.cloud.function.Context;
import com.zoho.cloud.function.basic.*;
import java.util.*;
public class Test1 implements ZCFunction
{
	public void runner(Context context, BasicIO basicIO) throws Exception
	{
		basicIO.write( "Test 2 Running" );
	}
}
