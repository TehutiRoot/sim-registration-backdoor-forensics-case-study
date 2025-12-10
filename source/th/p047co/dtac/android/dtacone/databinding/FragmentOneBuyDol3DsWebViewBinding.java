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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneBuyDol3DsWebViewBinding */
/* loaded from: classes7.dex */
public final class FragmentOneBuyDol3DsWebViewBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83886a;
    @NonNull
    public final WebView oneBuyDol3DsWebView;

    public FragmentOneBuyDol3DsWebViewBinding(ConstraintLayout constraintLayout, WebView webView) {
        this.f83886a = constraintLayout;
        this.oneBuyDol3DsWebView = webView;
    }

    @NonNull
    public static FragmentOneBuyDol3DsWebViewBinding bind(@NonNull View view) {
        int i = R.id.oneBuyDol3DsWebView;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
        if (webView != null) {
            return new FragmentOneBuyDol3DsWebViewBinding((ConstraintLayout) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneBuyDol3DsWebViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneBuyDol3DsWebViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_buy_dol3_ds_web_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83886a;
    }
}
