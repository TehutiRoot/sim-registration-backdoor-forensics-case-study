package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMnpIdFormBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMnpIdFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83788a;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final ZIncludeSwitchModeCameraBinding btnOpenSmartCard;
    @NonNull
    public final RelativeLayout registrationBox;
    @NonNull
    public final ZIncludeSwitchModeCameraBinding switchModeToSmartCard;
    @NonNull
    public final DtacTabLayout tabLayout;
    @NonNull
    public final WrapContentViewPager viewPager;

    public FragmentMrtrMnpIdFormBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, ZIncludeSwitchModeCameraBinding zIncludeSwitchModeCameraBinding, RelativeLayout relativeLayout, ZIncludeSwitchModeCameraBinding zIncludeSwitchModeCameraBinding2, DtacTabLayout dtacTabLayout, WrapContentViewPager wrapContentViewPager) {
        this.f83788a = constraintLayout;
        this.btnOk = dtacFontButton;
        this.btnOpenSmartCard = zIncludeSwitchModeCameraBinding;
        this.registrationBox = relativeLayout;
        this.switchModeToSmartCard = zIncludeSwitchModeCameraBinding2;
        this.tabLayout = dtacTabLayout;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static FragmentMrtrMnpIdFormBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.btnOk;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.btnOpenSmartCard))) != null) {
            ZIncludeSwitchModeCameraBinding bind = ZIncludeSwitchModeCameraBinding.bind(findChildViewById);
            i = R.id.registration_box;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.switchModeToSmartCard))) != null) {
                ZIncludeSwitchModeCameraBinding bind2 = ZIncludeSwitchModeCameraBinding.bind(findChildViewById2);
                i = R.id.tabLayout;
                DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
                if (dtacTabLayout != null) {
                    i = R.id.viewPager;
                    WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                    if (wrapContentViewPager != null) {
                        return new FragmentMrtrMnpIdFormBinding((ConstraintLayout) view, dtacFontButton, bind, relativeLayout, bind2, dtacTabLayout, wrapContentViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMnpIdFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMnpIdFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_mnp_id_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83788a;
    }
}
