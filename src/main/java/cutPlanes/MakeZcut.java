package cutPlanes;

import ij.IJ;
import ij.ImageJ;
import ij.plugin.PlugIn;

public class MakeZcut implements PlugIn {

	@Override
	public void run(String arg0) {
		
		
		IJ.showMessage("gan");
		
	}
	
	
	public static void main(String[] args) {
		
		
		new ImageJ();
		new MakeZcut().run(null);
		
	}
	
	
	

}
