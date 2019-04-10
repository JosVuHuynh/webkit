package huynhvu.jos.demowebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnSearch;
    Button btnHtml;
    EditText editUrl;
    WebView webview;
    //static html strin g data
    String customHtml = "<html><body><h1>Hello, This is Demo WebView</h1>" +
            "<h1>Heading 1</h1><h2>Heading 2</h2><h3>Heading 3</h3>" +
            "<p>This is a sample paragraph of static HTML In Web view</p>" +
            "</body></html>";
    // load static html data on a web view
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        webview.setWebViewClient(new WebViewClient());
        //webview.loadUrl("file:///assets/index.html");
//        WebSettings webSetting = webview.getSettings();
//        webSetting.setBuiltInZoomControls(true);
//        webSetting.setJavaScriptEnabled(true);

        webview.setWebViewClient(new WebViewClient());

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Url=editUrl.getText().toString();
                //webview.loadUrl("https://"+Url);
                webview.loadUrl("file:///assets/index.html");

            }
        });
        btnHtml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webview.getSettings().setJavaScriptEnabled(true);
                webview.loadData(customHtml, "text/html", "UTF-8");
            }
        });
    }
    protected void Anhxa(){
        btnSearch=(Button) findViewById(R.id.btnGo);
        btnHtml =(Button) findViewById(R.id.btnHtml);
        editUrl=(EditText) findViewById(R.id.editUrl);
        webview=(WebView) findViewById(R.id.webview);

    }
}
