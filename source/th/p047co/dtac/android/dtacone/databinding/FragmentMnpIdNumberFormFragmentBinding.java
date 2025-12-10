package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMnpIdNumberFormFragmentBinding */
/* loaded from: classes7.dex */
public final class FragmentMnpIdNumberFormFragmentBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83762a;
    @NonNull
    public final OneFontButton btnOk;
    @NonNull
    public final CardView cardview;
    @NonNull
    public final OneFontTextView prepaidRegisterTvCardRegister;
    @NonNull
    public final OneFontTextView prepaidRegisterTvPhoneNumber;
    @NonNull
    public final RelativeLayout registrationBox;
    @NonNull
    public final OneTabLayout tabLayout;
    @NonNull
    public final WrapContentViewPager viewPager;

    public FragmentMnpIdNumberFormFragmentBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, CardView cardView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, RelativeLayout relativeLayout, OneTabLayout oneTabLayout, WrapContentViewPager wrapContentViewPager) {
        this.f83762a = constraintLayout;
        this.btnOk = oneFontButton;
        this.cardview = cardView;
        this.prepaidRegisterTvCardRegister = oneFontTextView;
        this.prepaidRegisterTvPhoneNumber = oneFontTextView2;
        this.registrationBox = relativeLayout;
        this.tabLayout = oneTabLayout;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static FragmentMnpIdNumberFormFragmentBinding bind(@NonNull View view) {
        int i = R.id.btnOk;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.cardview;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.prepaid_register_tv_card_register;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.prepaid_register_tv_phone_number;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.registration_box;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            i = R.id.tabLayout;
                            OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i);
                            if (oneTabLayout != null) {
                                i = R.id.viewPager;
                                WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                                if (wrapContentViewPager != null) {
                                    return new FragmentMnpIdNumberFormFragmentBinding((ConstraintLayout) view, oneFontButton, cardView, oneFontTextView, oneFontTextView2, relativeLayout, oneTabLayout, wrapContentViewPager);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMnpIdNumberFormFragmentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMnpIdNumberFormFragmentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mnp_id_number_form_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83762a;
    }
}
