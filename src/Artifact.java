
public class Artifact extends Card 
{

	
	private String ArtifactType="";

	public Artifact(String name, String ability, int redManaCost, int blueManaCost, int greenManaCost,
			int whiteManaCost, int blackManaCost, int colourlessManaCost,
			String artifactType) {
		super(name, ability, redManaCost, blueManaCost,
				greenManaCost, whiteManaCost, blackManaCost, colourlessManaCost);
		ArtifactType = artifactType;
	}

	public String getArtifactType() {
		return ArtifactType;
	}

	public void setArtifactType(String artifactType) {
		ArtifactType = artifactType;
	}
	
	
}
