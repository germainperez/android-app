package cs2340team64.dirtyrat.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import cs2340team64.dirtyrat.R;
import cs2340team64.dirtyrat.model.Auth;

public class LoggedInActivity extends AppCompatActivity implements View.OnClickListener {

    TextView welcomeUser;
    Button logoutButton;
    Button gotoListView;
    Button gotoCreateView;
    Button gotoMapView;
    Auth auth;

    /**
     * activity startup
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logged_in_screen);

        auth = Auth.getInstance();

        welcomeUser = (TextView) findViewById(R.id.welcome_user_text);
        logoutButton = (Button) findViewById(R.id.logout_button);
        gotoListView = (Button) findViewById(R.id.goto_listview);
        gotoCreateView = (Button) findViewById(R.id.goto_create_view);
        gotoMapView = (Button) findViewById(R.id.goto_mapview);

        logoutButton.setOnClickListener(this);
        gotoListView.setOnClickListener(this);
        gotoCreateView.setOnClickListener(this);
        gotoMapView.setOnClickListener(this);

        welcomeUser.setText(auth.getCurrentUserEmail());
    }

    /**
     * Universal click listener for this activity
     * @param view the view that was clicked on
     */
    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.logout_button) {
            logout();
        } else if (view.getId() == R.id.goto_listview) {
            startActivity(new Intent(this, ReportListActivity.class));
        } else if (view.getId() == R.id.goto_create_view) {
            startActivity(new Intent(this, ReportCreateActivity.class));
        } else if (view.getId() == R.id.goto_mapview) {
            startActivity(new Intent(this, ReportMapActivity.class));
        }
    }

    /**
     * logs out and returns to the welcome screen
     */
    public void logout() {
        Intent logout = new Intent(this, MainActivity.class);
        startActivity(logout);
    }
}
