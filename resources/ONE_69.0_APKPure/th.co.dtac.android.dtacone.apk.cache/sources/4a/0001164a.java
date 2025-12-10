package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneNadOutboundListBinding */
/* loaded from: classes7.dex */
public final class FragmentOneNadOutboundListBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84089a;
    @NonNull
    public final TabLayout nadOutboundTabLayout;
    @NonNull
    public final ViewPager2 nadOutboundViewPager;

    public FragmentOneNadOutboundListBinding(LinearLayout linearLayout, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.f84089a = linearLayout;
        this.nadOutboundTabLayout = tabLayout;
        this.nadOutboundViewPager = viewPager2;
    }

    @NonNull
    public static FragmentOneNadOutboundListBinding bind(@NonNull View view) {
        int i = R.id.nadOutboundTabLayout;
        TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(view, i);
        if (tabLayout != null) {
            i = R.id.nadOutboundViewPager;
            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(view, i);
            if (viewPager2 != null) {
                return new FragmentOneNadOutboundListBinding((LinearLayout) view, tabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneNadOutboundListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneNadOutboundListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_nad_outbound_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84089a;
    }
}