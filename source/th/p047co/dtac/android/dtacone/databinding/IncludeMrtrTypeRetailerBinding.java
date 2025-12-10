package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeMrtrTypeRetailerBinding */
/* loaded from: classes7.dex */
public final class IncludeMrtrTypeRetailerBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84253a;
    @NonNull
    public final ImageView ivProfilePicture;
    @NonNull
    public final DtacFontTextView tvTypeRetailerTitle;
    @NonNull
    public final DtacFontTextView tvTypeRetailerValue;

    public IncludeMrtrTypeRetailerBinding(ConstraintLayout constraintLayout, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84253a = constraintLayout;
        this.ivProfilePicture = imageView;
        this.tvTypeRetailerTitle = dtacFontTextView;
        this.tvTypeRetailerValue = dtacFontTextView2;
    }

    @NonNull
    public static IncludeMrtrTypeRetailerBinding bind(@NonNull View view) {
        int i = R.id.ivProfilePicture;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tvTypeRetailerTitle;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvTypeRetailerValue;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    return new IncludeMrtrTypeRetailerBinding((ConstraintLayout) view, imageView, dtacFontTextView, dtacFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeMrtrTypeRetailerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeMrtrTypeRetailerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_mrtr_type_retailer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84253a;
    }
}
