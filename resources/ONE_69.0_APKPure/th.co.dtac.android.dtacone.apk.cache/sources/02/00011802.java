package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.NadOutboundCustomTabLayoutBinding */
/* loaded from: classes7.dex */
public final class NadOutboundCustomTabLayoutBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84529a;
    @NonNull
    public final ImageView tabImageView;
    @NonNull
    public final OneFontTextView tabTextView;

    public NadOutboundCustomTabLayoutBinding(LinearLayout linearLayout, ImageView imageView, OneFontTextView oneFontTextView) {
        this.f84529a = linearLayout;
        this.tabImageView = imageView;
        this.tabTextView = oneFontTextView;
    }

    @NonNull
    public static NadOutboundCustomTabLayoutBinding bind(@NonNull View view) {
        int i = R.id.tabImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tabTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                return new NadOutboundCustomTabLayoutBinding((LinearLayout) view, imageView, oneFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static NadOutboundCustomTabLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static NadOutboundCustomTabLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.nad_outbound_custom_tab_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84529a;
    }
}