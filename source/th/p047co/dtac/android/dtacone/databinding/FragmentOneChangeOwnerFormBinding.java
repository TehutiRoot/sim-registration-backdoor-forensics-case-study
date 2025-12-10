package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneChangeOwnerFormBinding */
/* loaded from: classes7.dex */
public final class FragmentOneChangeOwnerFormBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83904a;
    @NonNull
    public final OneFontButton btnConfirm;
    @NonNull
    public final ConstraintLayout rootLayout;
    @NonNull
    public final NestedScrollView scrollView;
    @NonNull
    public final OneTabLayout tabLayout;
    @NonNull
    public final OneFontTextView tvPhoneNumber;
    @NonNull
    public final OneFontTextView tvPhoneNumberRegister;
    @NonNull
    public final OneFontTextView tvTitleEdit;
    @NonNull
    public final WrapContentViewPager viewPager;

    public FragmentOneChangeOwnerFormBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, ConstraintLayout constraintLayout, NestedScrollView nestedScrollView2, OneTabLayout oneTabLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, WrapContentViewPager wrapContentViewPager) {
        this.f83904a = nestedScrollView;
        this.btnConfirm = oneFontButton;
        this.rootLayout = constraintLayout;
        this.scrollView = nestedScrollView2;
        this.tabLayout = oneTabLayout;
        this.tvPhoneNumber = oneFontTextView;
        this.tvPhoneNumberRegister = oneFontTextView2;
        this.tvTitleEdit = oneFontTextView3;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static FragmentOneChangeOwnerFormBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.rootLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                i = R.id.tabLayout;
                OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i);
                if (oneTabLayout != null) {
                    i = R.id.tvPhoneNumber;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.tvPhoneNumberRegister;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.tvTitleEdit;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                i = R.id.viewPager;
                                WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                                if (wrapContentViewPager != null) {
                                    return new FragmentOneChangeOwnerFormBinding(nestedScrollView, oneFontButton, constraintLayout, nestedScrollView, oneTabLayout, oneFontTextView, oneFontTextView2, oneFontTextView3, wrapContentViewPager);
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
    public static FragmentOneChangeOwnerFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneChangeOwnerFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_change_owner_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83904a;
    }
}
