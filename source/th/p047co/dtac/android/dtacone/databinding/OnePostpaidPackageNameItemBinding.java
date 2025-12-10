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

/* renamed from: th.co.dtac.android.dtacone.databinding.OnePostpaidPackageNameItemBinding */
/* loaded from: classes7.dex */
public final class OnePostpaidPackageNameItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84510a;
    @NonNull
    public final ConstraintLayout cardView;
    @NonNull
    public final View divider;
    @NonNull
    public final ImageView imageView15;
    @NonNull
    public final OneFontTextView tvPackageName;

    public OnePostpaidPackageNameItemBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, ImageView imageView, OneFontTextView oneFontTextView) {
        this.f84510a = constraintLayout;
        this.cardView = constraintLayout2;
        this.divider = view;
        this.imageView15 = imageView;
        this.tvPackageName = oneFontTextView;
    }

    @NonNull
    public static OnePostpaidPackageNameItemBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.divider;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.imageView15;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvPackageName;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new OnePostpaidPackageNameItemBinding(constraintLayout, constraintLayout, findChildViewById, imageView, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnePostpaidPackageNameItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnePostpaidPackageNameItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_postpaid_package_name_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84510a;
    }
}
