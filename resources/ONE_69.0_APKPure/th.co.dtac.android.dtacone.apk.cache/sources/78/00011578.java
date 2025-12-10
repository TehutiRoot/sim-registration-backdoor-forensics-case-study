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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrIdFormBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrIdFormBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83878a;
    @NonNull
    public final ZIncludeSwitchModeCameraBinding btnOpenSmartCard;
    @NonNull
    public final DtacTabLayout tabLayout;
    @NonNull
    public final ViewPager viewPager;

    public FragmentMrtrIdFormBinding(NestedScrollView nestedScrollView, ZIncludeSwitchModeCameraBinding zIncludeSwitchModeCameraBinding, DtacTabLayout dtacTabLayout, ViewPager viewPager) {
        this.f83878a = nestedScrollView;
        this.btnOpenSmartCard = zIncludeSwitchModeCameraBinding;
        this.tabLayout = dtacTabLayout;
        this.viewPager = viewPager;
    }

    @NonNull
    public static FragmentMrtrIdFormBinding bind(@NonNull View view) {
        int i = R.id.btnOpenSmartCard;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            ZIncludeSwitchModeCameraBinding bind = ZIncludeSwitchModeCameraBinding.bind(findChildViewById);
            int i2 = R.id.tabLayout;
            DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i2);
            if (dtacTabLayout != null) {
                i2 = R.id.viewPager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i2);
                if (viewPager != null) {
                    return new FragmentMrtrIdFormBinding((NestedScrollView) view, bind, dtacTabLayout, viewPager);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrIdFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrIdFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_id_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83878a;
    }
}