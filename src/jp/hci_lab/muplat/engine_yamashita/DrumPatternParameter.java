package engine_yamashita;

/**
 * ドラムパターンを決める際に必要なパラメータのクラス
 * @author Shun Yamashita
 */
public class DrumPatternParameter {
	private double climax; // 盛り上がり度
	private double speed;  // 疾走感
	private double rhythm; // リズミカル度

	public DrumPatternParameter(double climax, double speed, double rhythm) {
		this.climax = climax;
		this.speed  = speed;
		this.rhythm = rhythm;
	}

	public double getClimax() { return climax; }
	public double getSpeed() { return speed; }
	public double getRhythm() { return rhythm; }
}