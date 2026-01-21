
package michal.rapaport.exweb;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wv=findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        String stringUrl = "https://www.inn.co.il/";
        //בדיקת גיטהאב
        wv.loadUrl(stringUrl);
        wv.setWebViewClient(new MyWebClientbyViewClient());
        //....בדיקה222
    }

    private class MyWebClientbyViewClient extends WebViewClient {
       public boolean shouldOverideUrlLoading(WebView view,String url)
       {
           view.loadUrl(url);
           return true;

       }
    }
}