
public class Land extends Card
{

	private String LandType="";

		
		public Land(String name, String ability, int redManaCost, int blueManaCost, int greenManaCost,
				int whiteManaCost, int blackManaCost, int colourlessManaCost,
				String landType) 
		{
			super(name, ability, redManaCost, blueManaCost,
					greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost);
			LandType = landType;
		}
		public String getLandType() {
			return LandType;
		}
		public void setLandType(String landType) {
			LandType = landType;
		}

		
		
}
