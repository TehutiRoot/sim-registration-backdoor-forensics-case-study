package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentBuyDol3dsWebViewBinding */
/* loaded from: classes7.dex */
public final class FragmentBuyDol3dsWebViewBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83644a;
    @NonNull
    public final WebView webView;

    public FragmentBuyDol3dsWebViewBinding(FrameLayout frameLayout, WebView webView) {
        this.f83644a = frameLayout;
        this.webView = webView;
    }

    @NonNull
    public static FragmentBuyDol3dsWebViewBinding bind(@NonNull View view) {
        int i = R.id.webView;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
        if (webView != null) {
            return new FragmentBuyDol3dsWebViewBinding((FrameLayout) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentBuyDol3dsWebViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBuyDol3dsWebViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_buy_dol_3ds_web_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83644a;
    }
}
