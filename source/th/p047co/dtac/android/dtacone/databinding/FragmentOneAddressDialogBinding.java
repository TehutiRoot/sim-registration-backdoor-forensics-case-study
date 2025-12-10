package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneAddressDialogBinding */
/* loaded from: classes7.dex */
public final class FragmentOneAddressDialogBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83885a;
    @NonNull
    public final View addressBottomLine;
    @NonNull
    public final AppCompatImageView backButtonImageView;
    @NonNull
    public final AppCompatImageView closeButtonImageView;
    @NonNull
    public final WrapContentViewPager oneAddressViewPager;
    @NonNull
    public final ConstraintLayout selectAddressHeaderLayout;
    @NonNull
    public final OneFontTextView selectAddressTitleTextView;

    public FragmentOneAddressDialogBinding(ConstraintLayout constraintLayout, View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, WrapContentViewPager wrapContentViewPager, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView) {
        this.f83885a = constraintLayout;
        this.addressBottomLine = view;
        this.backButtonImageView = appCompatImageView;
        this.closeButtonImageView = appCompatImageView2;
        this.oneAddressViewPager = wrapContentViewPager;
        this.selectAddressHeaderLayout = constraintLayout2;
        this.selectAddressTitleTextView = oneFontTextView;
    }

    @NonNull
    public static FragmentOneAddressDialogBinding bind(@NonNull View view) {
        int i = R.id.addressBottomLine;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.backButtonImageView;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.closeButtonImageView;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = R.id.oneAddressViewPager;
                    WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                    if (wrapContentViewPager != null) {
                        i = R.id.selectAddressHeaderLayout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.selectAddressTitleTextView;
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                return new FragmentOneAddressDialogBinding((ConstraintLayout) view, findChildViewById, appCompatImageView, appCompatImageView2, wrapContentViewPager, constraintLayout, oneFontTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneAddressDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneAddressDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_address_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83885a;
    }
}
