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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimPrepaidFormBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimPrepaidFormBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83739a;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final CardView cardview;
    @NonNull
    public final DtacFontTextView prepaidRegisterTvCardRegister;
    @NonNull
    public final DtacFontTextView prepaidRegisterTvPhoneNumber;
    @NonNull
    public final RelativeLayout registrationBox;
    @NonNull
    public final DtacTabLayout tabLayout;
    @NonNull
    public final WrapContentViewPager viewPager;

    public FragmentEsimPrepaidFormBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, CardView cardView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, RelativeLayout relativeLayout, DtacTabLayout dtacTabLayout, WrapContentViewPager wrapContentViewPager) {
        this.f83739a = constraintLayout;
        this.btnOk = dtacFontButton;
        this.cardview = cardView;
        this.prepaidRegisterTvCardRegister = dtacFontTextView;
        this.prepaidRegisterTvPhoneNumber = dtacFontTextView2;
        this.registrationBox = relativeLayout;
        this.tabLayout = dtacTabLayout;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static FragmentEsimPrepaidFormBinding bind(@NonNull View view) {
        int i = R.id.btnOk;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.cardview;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.prepaid_register_tv_card_register;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.prepaid_register_tv_phone_number;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.registration_box;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            i = R.id.tabLayout;
                            DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
                            if (dtacTabLayout != null) {
                                i = R.id.viewPager;
                                WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                                if (wrapContentViewPager != null) {
                                    return new FragmentEsimPrepaidFormBinding((ConstraintLayout) view, dtacFontButton, cardView, dtacFontTextView, dtacFontTextView2, relativeLayout, dtacTabLayout, wrapContentViewPager);
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
    public static FragmentEsimPrepaidFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimPrepaidFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_prepaid_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83739a;
    }
}
