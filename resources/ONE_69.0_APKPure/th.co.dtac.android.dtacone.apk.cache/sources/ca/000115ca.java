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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidMutiFormBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidMutiFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83961a;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final ZIncludeSwitchModeCameraBinding btnOpenSmartCard;
    @NonNull
    public final RelativeLayout registrationBox;
    @NonNull
    public final DtacTabLayout tabLayout;
    @NonNull
    public final WrapContentViewPager viewPager;

    public FragmentMrtrPrepaidMutiFormBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, ZIncludeSwitchModeCameraBinding zIncludeSwitchModeCameraBinding, RelativeLayout relativeLayout, DtacTabLayout dtacTabLayout, WrapContentViewPager wrapContentViewPager) {
        this.f83961a = constraintLayout;
        this.btnOk = dtacFontButton;
        this.btnOpenSmartCard = zIncludeSwitchModeCameraBinding;
        this.registrationBox = relativeLayout;
        this.tabLayout = dtacTabLayout;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static FragmentMrtrPrepaidMutiFormBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnOk;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.btnOpenSmartCard))) != null) {
            ZIncludeSwitchModeCameraBinding bind = ZIncludeSwitchModeCameraBinding.bind(findChildViewById);
            i = R.id.registration_box;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.tabLayout;
                DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
                if (dtacTabLayout != null) {
                    i = R.id.viewPager;
                    WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                    if (wrapContentViewPager != null) {
                        return new FragmentMrtrPrepaidMutiFormBinding((ConstraintLayout) view, dtacFontButton, bind, relativeLayout, dtacTabLayout, wrapContentViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPrepaidMutiFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidMutiFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_muti_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83961a;
    }
}