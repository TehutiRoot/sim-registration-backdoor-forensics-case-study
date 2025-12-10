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

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneTypeRetailerBinding */
/* loaded from: classes7.dex */
public final class IncludeOneTypeRetailerBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84284a;
    @NonNull
    public final ImageView profileImageView;
    @NonNull
    public final OneFontTextView retailerTypeTextView;
    @NonNull
    public final OneFontTextView retailerTypeTitleTextView;

    public IncludeOneTypeRetailerBinding(ConstraintLayout constraintLayout, ImageView imageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84284a = constraintLayout;
        this.profileImageView = imageView;
        this.retailerTypeTextView = oneFontTextView;
        this.retailerTypeTitleTextView = oneFontTextView2;
    }

    @NonNull
    public static IncludeOneTypeRetailerBinding bind(@NonNull View view) {
        int i = R.id.profileImageView;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.retailerTypeTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.retailerTypeTitleTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    return new IncludeOneTypeRetailerBinding((ConstraintLayout) view, imageView, oneFontTextView, oneFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeOneTypeRetailerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneTypeRetailerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_type_retailer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84284a;
    }
}
