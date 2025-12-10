package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OnePostpaidPackageDescItemBinding */
/* loaded from: classes7.dex */
public final class OnePostpaidPackageDescItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84507a;
    @NonNull
    public final OneFontTextView tvBullet;
    @NonNull
    public final OneFontTextView tvDescItem;

    public OnePostpaidPackageDescItemBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84507a = constraintLayout;
        this.tvBullet = oneFontTextView;
        this.tvDescItem = oneFontTextView2;
    }

    @NonNull
    public static OnePostpaidPackageDescItemBinding bind(@NonNull View view) {
        int i = R.id.tvBullet;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.tvDescItem;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                return new OnePostpaidPackageDescItemBinding((ConstraintLayout) view, oneFontTextView, oneFontTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnePostpaidPackageDescItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnePostpaidPackageDescItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_postpaid_package_desc_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84507a;
    }
}
