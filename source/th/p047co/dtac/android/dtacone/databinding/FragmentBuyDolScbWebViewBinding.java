package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentBuyDolScbWebViewBinding */
/* loaded from: classes7.dex */
public final class FragmentBuyDolScbWebViewBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83653a;
    @NonNull
    public final WebView webView;

    public FragmentBuyDolScbWebViewBinding(LinearLayout linearLayout, WebView webView) {
        this.f83653a = linearLayout;
        this.webView = webView;
    }

    @NonNull
    public static FragmentBuyDolScbWebViewBinding bind(@NonNull View view) {
        int i = R.id.webView;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
        if (webView != null) {
            return new FragmentBuyDolScbWebViewBinding((LinearLayout) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBuyDolScbWebViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBuyDolScbWebViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_buy_dol_scb_web_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83653a;
    }
}
