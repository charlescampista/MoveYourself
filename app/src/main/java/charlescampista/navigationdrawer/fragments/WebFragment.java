package charlescampista.navigationdrawer.fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import charlescampista.navigationdrawer.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class WebFragment extends Fragment {

    WebView wvWebContent;

    String link;

    public WebFragment() {
        // Required empty public constructor
    }

    public WebFragment(String link){
        this.link = link;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_web, container, false);

        wvWebContent = (WebView) view.findViewById(R.id.wvWebContent);
        wvWebContent.getSettings().setJavaScriptEnabled(true);
        wvWebContent.getSettings().setLoadWithOverviewMode(true);
        wvWebContent.getSettings().setUseWideViewPort(true);
        //wvWebContent.getSettings().setBuiltInZoomControls(true);
        wvWebContent.getSettings().setPluginState(WebSettings.PluginState.ON);
        wvWebContent.setWebViewClient(new WebViewClient());
        wvWebContent.loadUrl(link);

        return view;
    }

}
