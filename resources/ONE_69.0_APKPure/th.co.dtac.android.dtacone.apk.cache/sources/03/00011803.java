package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.NewsFeedWebviewBinding */
/* loaded from: classes7.dex */
public final class NewsFeedWebviewBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84530a;
    @NonNull
    public final WebView newsFeedWebview;

    public NewsFeedWebviewBinding(ConstraintLayout constraintLayout, WebView webView) {
        this.f84530a = constraintLayout;
        this.newsFeedWebview = webView;
    }

    @NonNull
    public static NewsFeedWebviewBinding bind(@NonNull View view) {
        int i = R.id.newsFeedWebview;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
        if (webView != null) {
            return new NewsFeedWebviewBinding((ConstraintLayout) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static NewsFeedWebviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NewsFeedWebviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.news_feed_webview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84530a;
    }
}