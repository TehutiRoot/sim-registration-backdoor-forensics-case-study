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

/* renamed from: th.co.dtac.android.dtacone.databinding.OnePackageRowShowOnlyBinding */
/* loaded from: classes7.dex */
public final class OnePackageRowShowOnlyBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84615a;
    @NonNull
    public final OneFontTextView itemName;

    public OnePackageRowShowOnlyBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView) {
        this.f84615a = constraintLayout;
        this.itemName = oneFontTextView;
    }

    @NonNull
    public static OnePackageRowShowOnlyBinding bind(@NonNull View view) {
        int i = R.id.itemName;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            return new OnePackageRowShowOnlyBinding((ConstraintLayout) view, oneFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnePackageRowShowOnlyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnePackageRowShowOnlyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_package_row_show_only, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84615a;
    }
}