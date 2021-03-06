package gui;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

/**
 * 予測変換実行ボタンのクラス
 * @author Shun Yamashita
 */
public class PredictionButton extends Button {
	private PatternArea parent;

	public PredictionButton(int x, int y, PatternArea parent) {
		super("予測");
		this.parent = parent;
		setPrefWidth(148);
		setupPoint(x, y);
		setupEventListener();
	}

	public void setupPoint(int x, int y) {
		setLayoutX(x);
		setLayoutY(y);
	}

	public void setupEventListener() {
		setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				parent.prediction();
			}
		});
	}
}
