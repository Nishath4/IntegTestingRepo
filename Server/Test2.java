import java.util.*;
import com.zoho.*;
public class Test2 implements ZohoFunction{
	public void runner(Context context, FuncParam funcParam){
		String sampleInput = funcParam.get( "sampleInput" );
		context.write( "Nishath" );
		context.log( "log" );
	}
}