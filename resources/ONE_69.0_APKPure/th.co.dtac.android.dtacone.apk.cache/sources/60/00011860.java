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

/* renamed from: th.co.dtac.android.dtacone.databinding.OnePre2postPackageDescItemBinding */
/* loaded from: classes7.dex */
public final class OnePre2postPackageDescItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84623a;
    @NonNull
    public final OneFontTextView bulletTextView;
    @NonNull
    public final OneFontTextView descItemTextView;

    public OnePre2postPackageDescItemBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84623a = constraintLayout;
        this.bulletTextView = oneFontTextView;
        this.descItemTextView = oneFontTextView2;
    }

    @NonNull
    public static OnePre2postPackageDescItemBinding bind(@NonNull View view) {
        int i = R.id.bulletTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.descItemTextView;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                return new OnePre2postPackageDescItemBinding((ConstraintLayout) view, oneFontTextView, oneFontTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnePre2postPackageDescItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnePre2postPackageDescItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_pre2post_package_desc_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84623a;
    }
}