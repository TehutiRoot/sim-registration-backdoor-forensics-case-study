package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTabLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidFormBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidFormBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84024a;
    @NonNull
    public final OneIncludeSwitchModeCameraBinding btnOpenSmartCard;
    @NonNull
    public final OneTabLayout postpaidFromTabLayout;
    @NonNull
    public final ViewPager postpaidFromViewPager;

    public FragmentOnePostpaidFormBinding(FrameLayout frameLayout, OneIncludeSwitchModeCameraBinding oneIncludeSwitchModeCameraBinding, OneTabLayout oneTabLayout, ViewPager viewPager) {
        this.f84024a = frameLayout;
        this.btnOpenSmartCard = oneIncludeSwitchModeCameraBinding;
        this.postpaidFromTabLayout = oneTabLayout;
        this.postpaidFromViewPager = viewPager;
    }

    @NonNull
    public static FragmentOnePostpaidFormBinding bind(@NonNull View view) {
        int i = R.id.btnOpenSmartCard;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneIncludeSwitchModeCameraBinding bind = OneIncludeSwitchModeCameraBinding.bind(findChildViewById);
            int i2 = R.id.postpaidFromTabLayout;
            OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i2);
            if (oneTabLayout != null) {
                i2 = R.id.postpaidFromViewPager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i2);
                if (viewPager != null) {
                    return new FragmentOnePostpaidFormBinding((FrameLayout) view, bind, oneTabLayout, viewPager);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84024a;
    }
}
