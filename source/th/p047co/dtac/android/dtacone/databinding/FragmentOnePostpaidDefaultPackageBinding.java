package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidDefaultPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidDefaultPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84022a;
    @NonNull
    public final OneFontTextView allPackageTextView;
    @NonNull
    public final OneFontTextView niceNumberDescriptionTextView;
    @NonNull
    public final ConstraintLayout niceNumberLayout;
    @NonNull
    public final OnePostpaidPackageItemRowBinding packageView;
    @NonNull
    public final LinearLayout showAllPackageLayout;
    @NonNull
    public final OneFontTextView tvTitle;

    public FragmentOnePostpaidDefaultPackageBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, ConstraintLayout constraintLayout2, OnePostpaidPackageItemRowBinding onePostpaidPackageItemRowBinding, LinearLayout linearLayout, OneFontTextView oneFontTextView3) {
        this.f84022a = constraintLayout;
        this.allPackageTextView = oneFontTextView;
        this.niceNumberDescriptionTextView = oneFontTextView2;
        this.niceNumberLayout = constraintLayout2;
        this.packageView = onePostpaidPackageItemRowBinding;
        this.showAllPackageLayout = linearLayout;
        this.tvTitle = oneFontTextView3;
    }

    @NonNull
    public static FragmentOnePostpaidDefaultPackageBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.allPackageTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.niceNumberDescriptionTextView;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.niceNumberLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.packageView))) != null) {
                    OnePostpaidPackageItemRowBinding bind = OnePostpaidPackageItemRowBinding.bind(findChildViewById);
                    i = R.id.showAllPackageLayout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.tvTitle;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            return new FragmentOnePostpaidDefaultPackageBinding((ConstraintLayout) view, oneFontTextView, oneFontTextView2, constraintLayout, bind, linearLayout, oneFontTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidDefaultPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidDefaultPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_default_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84022a;
    }
}
