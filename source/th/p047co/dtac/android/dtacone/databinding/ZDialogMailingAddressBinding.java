package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacToolbar;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZDialogMailingAddressBinding */
/* loaded from: classes7.dex */
public final class ZDialogMailingAddressBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f84599a;
    @NonNull
    public final AppBarLayout appBar;
    @NonNull
    public final FrameLayout contentLayout;
    @NonNull
    public final CoordinatorLayout coordinator;
    @NonNull
    public final DtacToolbar toolbar;
    @NonNull
    public final DtacFontTextView tvToolbarTitle;
    @NonNull
    public final WrapContentViewPager viewPager;

    public ZDialogMailingAddressBinding(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FrameLayout frameLayout, CoordinatorLayout coordinatorLayout2, DtacToolbar dtacToolbar, DtacFontTextView dtacFontTextView, WrapContentViewPager wrapContentViewPager) {
        this.f84599a = coordinatorLayout;
        this.appBar = appBarLayout;
        this.contentLayout = frameLayout;
        this.coordinator = coordinatorLayout2;
        this.toolbar = dtacToolbar;
        this.tvToolbarTitle = dtacFontTextView;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static ZDialogMailingAddressBinding bind(@NonNull View view) {
        int i = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = R.id.contentLayout;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) view;
                i = R.id.toolbar;
                DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
                if (dtacToolbar != null) {
                    i = R.id.tv_toolbar_title;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.viewPager;
                        WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                        if (wrapContentViewPager != null) {
                            return new ZDialogMailingAddressBinding(coordinatorLayout, appBarLayout, frameLayout, coordinatorLayout, dtacToolbar, dtacFontTextView, wrapContentViewPager);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZDialogMailingAddressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZDialogMailingAddressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_dialog_mailing_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f84599a;
    }
}
