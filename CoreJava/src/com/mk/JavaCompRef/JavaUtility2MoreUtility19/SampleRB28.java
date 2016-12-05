package com.mk.JavaCompRef.JavaUtility2MoreUtility19;

//listing 28
import java.util.*;

// Default version (English).
public class SampleRB28 extends ListResourceBundle {
	protected Object[][] getContents() {
		Object[][] resources = new Object[3][2];

		resources[0][0] = "title";
		resources[0][1] = "My Program";

		resources[1][0] = "StopText";
		resources[1][1] = "Stop";

		resources[2][0] = "StartText";
		resources[2][1] = "Start";

		return resources;
	}
}
