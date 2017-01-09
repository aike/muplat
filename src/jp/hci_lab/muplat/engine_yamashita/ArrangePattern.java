package engine_yamashita;

/**
 * アレンジパターンをまとめたクラス
 * @author Shun Yamashita
 */
public class ArrangePattern {
	private String patternName;
	private DistGuitarPattern distGuitarPattern;
	private BassPattern bassPattern;
	private DrumPattern drumPattern;

	public ArrangePattern(String patternName) {
		this.patternName = patternName;
		this.distGuitarPattern = new DistGuitarPattern();
		this.bassPattern = new BassPattern();
		this.drumPattern = new DrumPattern();
	}

	public String getPatternName() { return patternName; }
	public DistGuitarPattern getDistGuitarPattern() { return distGuitarPattern; }
	public void setDistGuitarPattern(DistGuitarPattern distGuitarPattern) { this.distGuitarPattern = distGuitarPattern; }
	public BassPattern getBassPattern() { return bassPattern; }
	public void setBassPattern(BassPattern bassPattern) { this.bassPattern = bassPattern; }
	public DrumPattern getDrumPattern() { return drumPattern; }
	public void setDrumPattern(DrumPattern drumPattern) { this.drumPattern = drumPattern; }
}
