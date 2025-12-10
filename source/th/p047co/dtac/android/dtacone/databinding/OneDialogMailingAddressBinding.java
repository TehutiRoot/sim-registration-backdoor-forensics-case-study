package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacToolbar;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogMailingAddressBinding */
/* loaded from: classes7.dex */
public final class OneDialogMailingAddressBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84443a;
    @NonNull
    public final ConstraintLayout constraint;
    @NonNull
    public final FrameLayout contentLayout;
    @NonNull
    public final DtacToolbar toolbar;
    @NonNull
    public final OneFontTextView tvToolbarTitle;
    @NonNull
    public final WrapContentViewPager viewPager;

    public OneDialogMailingAddressBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, FrameLayout frameLayout, DtacToolbar dtacToolbar, OneFontTextView oneFontTextView, WrapContentViewPager wrapContentViewPager) {
        this.f84443a = constraintLayout;
        this.constraint = constraintLayout2;
        this.contentLayout = frameLayout;
        this.toolbar = dtacToolbar;
        this.tvToolbarTitle = oneFontTextView;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static OneDialogMailingAddressBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.contentLayout;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.toolbar;
            DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
            if (dtacToolbar != null) {
                i = R.id.tv_toolbar_title;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.viewPager;
                    WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                    if (wrapContentViewPager != null) {
                        return new OneDialogMailingAddressBinding(constraintLayout, constraintLayout, frameLayout, dtacToolbar, oneFontTextView, wrapContentViewPager);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneDialogMailingAddressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogMailingAddressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_mailing_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84443a;
    }
}
