public class PaintFill{

	public static boolean fillColor(Color [][] screen, int r, int c, Color nColor){
		if (screen[r][c] == nColor) return false;
		return fillColor(screen, r, c, screen[r][c], nColor);	
	}

	public static boolean fillColor(Color [][] screen, int r, int c, Color oldColor, Color nColor){
		if (r < 0 || r >= screen.length || c < 0 || c >= screen[0].length) return false;

		if (screen[r][c] == oldColor){
			screen[r][c] = nColor;
			fillColor(screen, r + 1, c, oldColor, nColor);
			fillColor(screen, r - 1, c, oldColor, nColor);
			fillColor(screen, r, c + 1, oldColor, nColor);
			fillColor(screen, r, c - 1, oldColor, nColor);
		}
		return true;
	}

	public static void main(String...ar){
		Color [][] screen = new Color[5][5];
		for (int i = 0; i < screen.length; i++){
			for(int j = 0; j < screen[0].length; j++){
				screen[i][j] = Color.RED;
			}
		}

		System.out.println(fillColor(screen, 2, 2, Color.GREEN));
		for (int i = 0; i < screen.length; i++){
			for(int j = 0; j < screen[0].length; j++){
				System.out.println(screen[i][j].name());
			}
		}
	}
}

enum Color{
 
	RED, GREEN, BLUE, BLACK, YELLOW, PINK,BROWN

}

