import javax.swing.JOptionPane;

public class graphLibPK
{
	@SuppressWarnings("unused")
	private RENDER_API chosenAPI = RENDER_API.JAVA_2D; //Stores the chosen API
	private boolean lockAPI = false; //Locks the api. Don't know of a way to draw in both
	public enum RENDER_API
	{
		JAVA_2D, OPENGL
	}
	private graphLibPK()
	{
	}
	public void selectAPI(RENDER_API APIChoice)
	{
		if(lockAPI == true)
		{
			JOptionPane.showMessageDialog(null,
				    "Eggs are not supposed to be green.",
				    "A plain message",
				    JOptionPane.PLAIN_MESSAGE);
		}
		chosenAPI = APIChoice;
	}
}
