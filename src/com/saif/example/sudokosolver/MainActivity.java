package com.saif.example.sudokosolver;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources.NotFoundException;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	Button solve, clear;
	TextView top;
	EditText[][] et = new EditText[9][9];
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_layout);
		initialize();
		setListener();
	}

	private void setListener() {
		// TODO Auto-generated method stub
		solve.setOnClickListener(this);
		clear.setOnClickListener(this);

	}

	private void initialize() {
		// TODO Auto-generated method stub
		solve = (Button) findViewById(R.id.bSolve);
		clear = (Button) findViewById(R.id.bClear);

		top = (TextView) findViewById(R.id.tvTop);

		et[0][0] = (EditText) findViewById(R.id.et00);
		et[0][1] = (EditText) findViewById(R.id.et01);
		et[0][2] = (EditText) findViewById(R.id.et02);
		et[0][3] = (EditText) findViewById(R.id.et03);
		et[0][4] = (EditText) findViewById(R.id.et04);
		et[0][5] = (EditText) findViewById(R.id.et05);
		et[0][6] = (EditText) findViewById(R.id.et06);
		et[0][7] = (EditText) findViewById(R.id.et07);
		et[0][8] = (EditText) findViewById(R.id.et08);

		et[1][0] = (EditText) findViewById(R.id.et10);
		et[1][1] = (EditText) findViewById(R.id.et11);
		et[1][2] = (EditText) findViewById(R.id.et12);
		et[1][3] = (EditText) findViewById(R.id.et13);
		et[1][4] = (EditText) findViewById(R.id.et14);
		et[1][5] = (EditText) findViewById(R.id.et15);
		et[1][6] = (EditText) findViewById(R.id.et16);
		et[1][7] = (EditText) findViewById(R.id.et17);
		et[1][8] = (EditText) findViewById(R.id.et18);

		et[2][0] = (EditText) findViewById(R.id.et20);
		et[2][1] = (EditText) findViewById(R.id.et21);
		et[2][2] = (EditText) findViewById(R.id.et22);
		et[2][3] = (EditText) findViewById(R.id.et23);
		et[2][4] = (EditText) findViewById(R.id.et24);
		et[2][5] = (EditText) findViewById(R.id.et25);
		et[2][6] = (EditText) findViewById(R.id.et26);
		et[2][7] = (EditText) findViewById(R.id.et27);
		et[2][8] = (EditText) findViewById(R.id.et28);

		et[3][0] = (EditText) findViewById(R.id.et30);
		et[3][1] = (EditText) findViewById(R.id.et31);
		et[3][2] = (EditText) findViewById(R.id.et32);
		et[3][3] = (EditText) findViewById(R.id.et33);
		et[3][4] = (EditText) findViewById(R.id.et34);
		et[3][5] = (EditText) findViewById(R.id.et35);
		et[3][6] = (EditText) findViewById(R.id.et36);
		et[3][7] = (EditText) findViewById(R.id.et37);
		et[3][8] = (EditText) findViewById(R.id.et38);

		et[4][0] = (EditText) findViewById(R.id.et40);
		et[4][1] = (EditText) findViewById(R.id.et41);
		et[4][2] = (EditText) findViewById(R.id.et42);
		et[4][3] = (EditText) findViewById(R.id.et43);
		et[4][4] = (EditText) findViewById(R.id.et44);
		et[4][5] = (EditText) findViewById(R.id.et45);
		et[4][6] = (EditText) findViewById(R.id.et46);
		et[4][7] = (EditText) findViewById(R.id.et47);
		et[4][8] = (EditText) findViewById(R.id.et48);

		et[5][0] = (EditText) findViewById(R.id.et50);
		et[5][1] = (EditText) findViewById(R.id.et51);
		et[5][2] = (EditText) findViewById(R.id.et52);
		et[5][3] = (EditText) findViewById(R.id.et53);
		et[5][4] = (EditText) findViewById(R.id.et54);
		et[5][5] = (EditText) findViewById(R.id.et55);
		et[5][6] = (EditText) findViewById(R.id.et56);
		et[5][7] = (EditText) findViewById(R.id.et57);
		et[5][8] = (EditText) findViewById(R.id.et58);

		et[6][0] = (EditText) findViewById(R.id.et60);
		et[6][1] = (EditText) findViewById(R.id.et61);
		et[6][2] = (EditText) findViewById(R.id.et62);
		et[6][3] = (EditText) findViewById(R.id.et63);
		et[6][4] = (EditText) findViewById(R.id.et64);
		et[6][5] = (EditText) findViewById(R.id.et65);
		et[6][6] = (EditText) findViewById(R.id.et66);
		et[6][7] = (EditText) findViewById(R.id.et67);
		et[6][8] = (EditText) findViewById(R.id.et68);

		et[7][0] = (EditText) findViewById(R.id.et70);
		et[7][1] = (EditText) findViewById(R.id.et71);
		et[7][2] = (EditText) findViewById(R.id.et72);
		et[7][3] = (EditText) findViewById(R.id.et73);
		et[7][4] = (EditText) findViewById(R.id.et74);
		et[7][5] = (EditText) findViewById(R.id.et75);
		et[7][6] = (EditText) findViewById(R.id.et76);
		et[7][7] = (EditText) findViewById(R.id.et77);
		et[7][8] = (EditText) findViewById(R.id.et78);

		et[8][0] = (EditText) findViewById(R.id.et80);
		et[8][1] = (EditText) findViewById(R.id.et81);
		et[8][2] = (EditText) findViewById(R.id.et82);
		et[8][3] = (EditText) findViewById(R.id.et83);
		et[8][4] = (EditText) findViewById(R.id.et84);
		et[8][5] = (EditText) findViewById(R.id.et85);
		et[8][6] = (EditText) findViewById(R.id.et86);
		et[8][7] = (EditText) findViewById(R.id.et87);
		et[8][8] = (EditText) findViewById(R.id.et88);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bSolve:
			int[][] m = new int[9][9];
			int[][] n;
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					try {
						m[i][j] = Integer.parseInt(et[i][j].getText()
								.toString().substring(0, 1));

					} catch (NotFoundException e) {
						m[i][j] = 0;
					} catch (StringIndexOutOfBoundsException e) {
						m[i][j] = 0;
					}

				}
			}
			String nm = "";
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					nm = nm + m[i][j];
				}
			}

			try {
				Solver s = new Solver(m, 3);
				if (s.check()) {
					// "Congratulations your puzzle has been solved"
					n = s.getSolution();
					for (int i = 0; i < 9; i++) {
						for (int j = 0; j < 9; j++) {
							String kl = "" + n[i][j];
							et[i][j].setText(kl);

						}
					}
					top.setText("Congratulations your puzzle has been solved");
					break;
				} else {
					top.setText("Please enter a valid Puzzle");
					break;
				}
			} catch (NotFoundException e) {
				top.setText("Please enter a valid Puzzle");
				nm += "\n" + "error";
				break;
			}

		case R.id.bClear:
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					et[i][j].setText("");

				}
			}
			top.setText("Welcome!! Fill the puzzle and press Solve");
			break;

		}
	}
}
