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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnlineStoreBinding */
/* loaded from: classes7.dex */
public final class FragmentOnlineStoreBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84235a;
    @NonNull
    public final WebView webViewOnlineStore;

    public FragmentOnlineStoreBinding(ConstraintLayout constraintLayout, WebView webView) {
        this.f84235a = constraintLayout;
        this.webViewOnlineStore = webView;
    }

    @NonNull
    public static FragmentOnlineStoreBinding bind(@NonNull View view) {
        int i = R.id.webViewOnlineStore;
        WebView webView = (WebView) ViewBindings.findChildViewById(view, i);
        if (webView != null) {
            return new FragmentOnlineStoreBinding((ConstraintLayout) view, webView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnlineStoreBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnlineStoreBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_online_store, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84235a;
    }
}