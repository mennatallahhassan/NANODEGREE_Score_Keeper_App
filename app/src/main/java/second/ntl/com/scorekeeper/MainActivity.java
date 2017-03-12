package second.ntl.com.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int scoreHome = 0;
    public int scoreGuest = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button plusHome = (Button) findViewById(R.id.plus_home_btn);
        plusHome.getBackground().setAlpha(150);
        Button resetBtn = (Button) findViewById(R.id.resetBtn);
        resetBtn.getBackground().setAlpha(225);
    }

    public void increaseHome(View v) {
        scoreHome = scoreHome + 1;
        displayHome(scoreHome);
    }

    public void decreaseHome(View v) {
        scoreHome = scoreHome - 1;
        displayHome(scoreHome);
    }

    public void increaseGuest(View v) {
        scoreGuest = scoreGuest + 1;
        displayGuest(scoreGuest);
    }

    public void decreaseGuest(View v) {
        scoreGuest = scoreGuest - 1;
        displayGuest(scoreGuest);
    }

    private void displayHome(int number) {
        TextView homeScore = (TextView) findViewById(R.id.home_score_text);
        if (number > -1 && number < 100) {
            if (number < 10)
                homeScore.setText("0" + number);
            else
                homeScore.setText("" + number);
        }
    }


    private void displayGuest(int number) {
        TextView guestScore = (TextView) findViewById(R.id.guest_score_text);
        if (number > -1 && number < 100) {
            if (number < 10)
                guestScore.setText("0" + number);
            else
                guestScore.setText("" + number);
        }
    }

    public void reset(View v) {
        TextView homeScore = (TextView) findViewById(R.id.home_score_text);
        homeScore.setText("00");
        TextView guestScore = (TextView) findViewById(R.id.guest_score_text);
        guestScore.setText("00");
    }
}
