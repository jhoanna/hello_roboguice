package isla.jhoanna.helloroboguice;

import roboguice.activity.RoboActivity;
import roboguice.inject.InjectResource;
import roboguice.inject.InjectView;
import android.os.Bundle;
import android.widget.TextView;

public class HelloActivity extends RoboActivity {
	@InjectView(R.id.textViewHello)				TextView textViewHello;
	@InjectResource(R.string.hello_roboguice)	String helloRoboGuice;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello);
		textViewHello.setText(helloRoboGuice);
	}
}
