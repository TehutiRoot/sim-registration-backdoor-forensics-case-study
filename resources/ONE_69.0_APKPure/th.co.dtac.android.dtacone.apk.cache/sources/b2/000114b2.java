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
import com.google.android.material.appbar.AppBarLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacToolbar;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityRtrCommissionHistoryBinding */
/* loaded from: classes7.dex */
public final class ActivityRtrCommissionHistoryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83677a;
    @NonNull
    public final AppBarLayout appBarLayout;
    @NonNull
    public final FrameLayout commissionContainer;
    @NonNull
    public final ConstraintLayout rootLayout;
    @NonNull
    public final DtacToolbar toolbar;
    @NonNull
    public final DtacFontTextView tvToolbarTitle;

    public ActivityRtrCommissionHistoryBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, DtacToolbar dtacToolbar, DtacFontTextView dtacFontTextView) {
        this.f83677a = constraintLayout;
        this.appBarLayout = appBarLayout;
        this.commissionContainer = frameLayout;
        this.rootLayout = constraintLayout2;
        this.toolbar = dtacToolbar;
        this.tvToolbarTitle = dtacFontTextView;
    }

    @NonNull
    public static ActivityRtrCommissionHistoryBinding bind(@NonNull View view) {
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = R.id.commissionContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.toolbar;
                DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
                if (dtacToolbar != null) {
                    i = R.id.tv_toolbar_title;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        return new ActivityRtrCommissionHistoryBinding(constraintLayout, appBarLayout, frameLayout, constraintLayout, dtacToolbar, dtacFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityRtrCommissionHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityRtrCommissionHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_rtr_commission_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83677a;
    }
}