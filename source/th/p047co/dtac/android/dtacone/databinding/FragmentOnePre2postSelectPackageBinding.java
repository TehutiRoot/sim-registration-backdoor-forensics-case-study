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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2postSelectPackageBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2postSelectPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84077a;
    @NonNull
    public final OneIncludePre2postSelectListBinding includeList;
    @NonNull
    public final IncludeOnePre2postSectionSelectedBinding includeSectionSelected;
    @NonNull
    public final ConstraintLayout root;

    public FragmentOnePre2postSelectPackageBinding(ConstraintLayout constraintLayout, OneIncludePre2postSelectListBinding oneIncludePre2postSelectListBinding, IncludeOnePre2postSectionSelectedBinding includeOnePre2postSectionSelectedBinding, ConstraintLayout constraintLayout2) {
        this.f84077a = constraintLayout;
        this.includeList = oneIncludePre2postSelectListBinding;
        this.includeSectionSelected = includeOnePre2postSectionSelectedBinding;
        this.root = constraintLayout2;
    }

    @NonNull
    public static FragmentOnePre2postSelectPackageBinding bind(@NonNull View view) {
        int i = R.id.includeList;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneIncludePre2postSelectListBinding bind = OneIncludePre2postSelectListBinding.bind(findChildViewById);
            int i2 = R.id.includeSectionSelected;
            View findChildViewById2 = ViewBindings.findChildViewById(view, i2);
            if (findChildViewById2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new FragmentOnePre2postSelectPackageBinding(constraintLayout, bind, IncludeOnePre2postSectionSelectedBinding.bind(findChildViewById2), constraintLayout);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePre2postSelectPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2postSelectPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2post_select_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84077a;
    }
}
