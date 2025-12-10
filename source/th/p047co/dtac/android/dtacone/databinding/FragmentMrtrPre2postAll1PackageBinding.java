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
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPre2postAll1PackageBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPre2postAll1PackageBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacSwipeRefresh f83848a;
    @NonNull
    public final ConstraintLayout constraint;
    @NonNull
    public final ZIncludePackageSetBinding incPackageSet;
    @NonNull
    public final DtacSwipeRefresh swipeRefreshLayout;

    public FragmentMrtrPre2postAll1PackageBinding(DtacSwipeRefresh dtacSwipeRefresh, ConstraintLayout constraintLayout, ZIncludePackageSetBinding zIncludePackageSetBinding, DtacSwipeRefresh dtacSwipeRefresh2) {
        this.f83848a = dtacSwipeRefresh;
        this.constraint = constraintLayout;
        this.incPackageSet = zIncludePackageSetBinding;
        this.swipeRefreshLayout = dtacSwipeRefresh2;
    }

    @NonNull
    public static FragmentMrtrPre2postAll1PackageBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.constraint;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incPackageSet))) != null) {
            DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) view;
            return new FragmentMrtrPre2postAll1PackageBinding(dtacSwipeRefresh, constraintLayout, ZIncludePackageSetBinding.bind(findChildViewById), dtacSwipeRefresh);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPre2postAll1PackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPre2postAll1PackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_pre2post_all1_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacSwipeRefresh getRoot() {
        return this.f83848a;
    }
}
