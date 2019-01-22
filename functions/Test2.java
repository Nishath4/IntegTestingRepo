import com.zoho.cloud.function.Context;
import com.zoho.cloud.function.basic.*;
import java.util.*;
public class HelloWorld implements ZCFunction
{
	public void runner(Context context, BasicIO basicIO) throws Exception
	{
		String sampleInput = basicIO.get( "sampleInput" );
		basicIO.write( "Test2" );
	}
