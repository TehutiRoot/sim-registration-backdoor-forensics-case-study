package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrPerformanceBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrPerformanceBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84284a;
    @NonNull
    public final IncludeUserProfileSectionBinding retailerProfileBox;
    @NonNull
    public final DtacTabLayout tabLayout;
    @NonNull
    public final WrapContentViewPager viewPager;

    public FragmentRtrPerformanceBinding(LinearLayout linearLayout, IncludeUserProfileSectionBinding includeUserProfileSectionBinding, DtacTabLayout dtacTabLayout, WrapContentViewPager wrapContentViewPager) {
        this.f84284a = linearLayout;
        this.retailerProfileBox = includeUserProfileSectionBinding;
        this.tabLayout = dtacTabLayout;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static FragmentRtrPerformanceBinding bind(@NonNull View view) {
        int i = R.id.retailer_profile_box;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            IncludeUserProfileSectionBinding bind = IncludeUserProfileSectionBinding.bind(findChildViewById);
            int i2 = R.id.tabLayout;
            DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i2);
            if (dtacTabLayout != null) {
                i2 = R.id.viewPager;
                WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i2);
                if (wrapContentViewPager != null) {
                    return new FragmentRtrPerformanceBinding((LinearLayout) view, bind, dtacTabLayout, wrapContentViewPager);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRtrPerformanceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrPerformanceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_performance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84284a;
    }
}