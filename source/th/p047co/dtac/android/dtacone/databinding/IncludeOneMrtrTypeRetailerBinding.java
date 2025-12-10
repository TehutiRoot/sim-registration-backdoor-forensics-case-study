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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneMrtrTypeRetailerBinding */
/* loaded from: classes7.dex */
public final class IncludeOneMrtrTypeRetailerBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84274a;
    @NonNull
    public final ConstraintLayout constraintLayout4;
    @NonNull
    public final ImageView onlineRegisterProfileImageView;
    @NonNull
    public final OneFontTextView retailerTypeTextView;
    @NonNull
    public final OneFontTextView retailerTypeTitleTextView;

    public IncludeOneMrtrTypeRetailerBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84274a = constraintLayout;
        this.constraintLayout4 = constraintLayout2;
        this.onlineRegisterProfileImageView = imageView;
        this.retailerTypeTextView = oneFontTextView;
        this.retailerTypeTitleTextView = oneFontTextView2;
    }

    @NonNull
    public static IncludeOneMrtrTypeRetailerBinding bind(@NonNull View view) {
        int i = R.id.constraintLayout4;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.onlineRegisterProfileImageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.retailerTypeTextView;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.retailerTypeTitleTextView;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        return new IncludeOneMrtrTypeRetailerBinding((ConstraintLayout) view, constraintLayout, imageView, oneFontTextView, oneFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeOneMrtrTypeRetailerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneMrtrTypeRetailerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_mrtr_type_retailer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84274a;
    }
}
