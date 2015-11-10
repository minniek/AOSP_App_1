package bu.edu.aosp_app_1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView bu_wv, umich_wv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bu_wv = (WebView) findViewById(R.id.bu_wv);
        umich_wv = (WebView) findViewById(R.id.umich_wv);

        final FloatingActionButton bu_fab = (FloatingActionButton) findViewById(R.id.bu_fab);
        bu_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Process ID: " + android.os.Process.myPid(), Snackbar.LENGTH_LONG).show();
                bu_wv.setWebViewClient(new WebViewClient());
                bu_wv.loadUrl("http://www.bu.edu");
            }
        });

        final FloatingActionButton umich_fab = (FloatingActionButton) findViewById(R.id.umich_fab);
        umich_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Process ID: " + android.os.Process.myPid(), Snackbar.LENGTH_LONG).show();
                umich_wv.setWebViewClient(new WebViewClient());
                umich_wv.loadUrl("http://www.umich.edu");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
