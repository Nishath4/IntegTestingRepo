import com.zoho.cloud.function.Context;
import com.zoho.cloud.function.basic.*;
import java.util.*;
import org.json.simple.JSONObject;
public class Test1 implements ZCFunction
{
	public void runner(Context context, BasicIO basicIO) throws Exception
	{
		JSONObject json = new JSONObject();
		json.put("Nishath","Test1");
		basicIO.write( "Test 1 Running"+json.toJSONString());
	}
}
