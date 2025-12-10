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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRegisterTrueOnlineFormBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRegisterTrueOnlineFormBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84204a;
    @NonNull
    public final OneIncludeSwitchModeCameraBinding btnOpenSmartCard;
    @NonNull
    public final OneTabLayout tolFromTabLayout;
    @NonNull
    public final ViewPager tolFromViewPager;

    public FragmentOneRegisterTrueOnlineFormBinding(FrameLayout frameLayout, OneIncludeSwitchModeCameraBinding oneIncludeSwitchModeCameraBinding, OneTabLayout oneTabLayout, ViewPager viewPager) {
        this.f84204a = frameLayout;
        this.btnOpenSmartCard = oneIncludeSwitchModeCameraBinding;
        this.tolFromTabLayout = oneTabLayout;
        this.tolFromViewPager = viewPager;
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineFormBinding bind(@NonNull View view) {
        int i = R.id.btnOpenSmartCard;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneIncludeSwitchModeCameraBinding bind = OneIncludeSwitchModeCameraBinding.bind(findChildViewById);
            int i2 = R.id.tolFromTabLayout;
            OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i2);
            if (oneTabLayout != null) {
                i2 = R.id.tolFromViewPager;
                ViewPager viewPager = (ViewPager) ViewBindings.findChildViewById(view, i2);
                if (viewPager != null) {
                    return new FragmentOneRegisterTrueOnlineFormBinding((FrameLayout) view, bind, oneTabLayout, viewPager);
                }
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_register_true_online_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84204a;
    }
}