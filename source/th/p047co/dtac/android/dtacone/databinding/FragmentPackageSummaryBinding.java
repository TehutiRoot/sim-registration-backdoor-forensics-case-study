package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPackageSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentPackageSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84136a;
    @NonNull
    public final DtacTabLayout tabLayout;
    @NonNull
    public final ViewPager viewPager;

    public FragmentPackageSummaryBinding(NestedScrollView nestedScrollView, DtacTabLayout dtacTabLayout, ViewPager viewPager) {
        this.f84136a = nestedScrollView;
        this.tabLayout = dtacTabLayout;
        this.viewPager = viewPager;
    }

    @NonNull
    public static FragmentPackageSummaryBinding bind(@NonNull View view) {
        int i = R.id.tabLayout;
        DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
        if (dtacTabLayout != null) {
            i = R.id.viewPager;
            ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i);
            if (viewPager != null) {
                return new FragmentPackageSummaryBinding((NestedScrollView) view, dtacTabLayout, viewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPackageSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPackageSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_package_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84136a;
    }
}
