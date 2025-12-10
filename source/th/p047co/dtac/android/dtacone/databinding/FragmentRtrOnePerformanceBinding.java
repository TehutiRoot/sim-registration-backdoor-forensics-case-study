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
import th.p047co.dtac.android.dtacone.app_one.widget.OneTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrOnePerformanceBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrOnePerformanceBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84176a;
    @NonNull
    public final IncludeOneUserProfileSectionBinding retailerProfileBox;
    @NonNull
    public final OneTabLayout tabLayout;
    @NonNull
    public final WrapContentViewPager viewPager;

    public FragmentRtrOnePerformanceBinding(LinearLayout linearLayout, IncludeOneUserProfileSectionBinding includeOneUserProfileSectionBinding, OneTabLayout oneTabLayout, WrapContentViewPager wrapContentViewPager) {
        this.f84176a = linearLayout;
        this.retailerProfileBox = includeOneUserProfileSectionBinding;
        this.tabLayout = oneTabLayout;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static FragmentRtrOnePerformanceBinding bind(@NonNull View view) {
        int i = R.id.retailer_profile_box;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            IncludeOneUserProfileSectionBinding bind = IncludeOneUserProfileSectionBinding.bind(findChildViewById);
            int i2 = R.id.tabLayout;
            OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i2);
            if (oneTabLayout != null) {
                i2 = R.id.viewPager;
                WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i2);
                if (wrapContentViewPager != null) {
                    return new FragmentRtrOnePerformanceBinding((LinearLayout) view, bind, oneTabLayout, wrapContentViewPager);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRtrOnePerformanceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrOnePerformanceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_one_performance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84176a;
    }
}
