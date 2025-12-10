package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeMrtrPrepaidReregistFormBinding */
/* loaded from: classes7.dex */
public final class IncludeMrtrPrepaidReregistFormBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84354a;
    @NonNull
    public final FrameLayout contentButton;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    public final DtacTabLayout tabLayout;
    @NonNull
    public final DtacFontTextView tvPhoneNumber;
    @NonNull
    public final DtacFontTextView tvPhoneNumberRegister;
    @NonNull
    public final WrapContentViewPager viewPager;

    public IncludeMrtrPrepaidReregistFormBinding(LinearLayout linearLayout, FrameLayout frameLayout, LinearLayout linearLayout2, DtacTabLayout dtacTabLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, WrapContentViewPager wrapContentViewPager) {
        this.f84354a = linearLayout;
        this.contentButton = frameLayout;
        this.rootLayout = linearLayout2;
        this.tabLayout = dtacTabLayout;
        this.tvPhoneNumber = dtacFontTextView;
        this.tvPhoneNumberRegister = dtacFontTextView2;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static IncludeMrtrPrepaidReregistFormBinding bind(@NonNull View view) {
        int i = R.id.contentButton;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.tabLayout;
            DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
            if (dtacTabLayout != null) {
                i = R.id.tvPhoneNumber;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvPhoneNumberRegister;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.viewPager;
                        WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                        if (wrapContentViewPager != null) {
                            return new IncludeMrtrPrepaidReregistFormBinding(linearLayout, frameLayout, linearLayout, dtacTabLayout, dtacFontTextView, dtacFontTextView2, wrapContentViewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeMrtrPrepaidReregistFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeMrtrPrepaidReregistFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_mrtr_prepaid_reregist_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84354a;
    }
}