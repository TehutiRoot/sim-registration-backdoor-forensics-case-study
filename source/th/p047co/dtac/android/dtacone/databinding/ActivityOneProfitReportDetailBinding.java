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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacToolbar;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneProfitReportDetailBinding */
/* loaded from: classes7.dex */
public final class ActivityOneProfitReportDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83555a;
    @NonNull
    public final AppBarLayout appBarLayout;
    @NonNull
    public final FrameLayout frameContainer;
    @NonNull
    public final ConstraintLayout rootLayout;
    @NonNull
    public final DtacToolbar toolbar;
    @NonNull
    public final OneFontTextView tvToolbarTitle;

    public ActivityOneProfitReportDetailBinding(ConstraintLayout constraintLayout, AppBarLayout appBarLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, DtacToolbar dtacToolbar, OneFontTextView oneFontTextView) {
        this.f83555a = constraintLayout;
        this.appBarLayout = appBarLayout;
        this.frameContainer = frameLayout;
        this.rootLayout = constraintLayout2;
        this.toolbar = dtacToolbar;
        this.tvToolbarTitle = oneFontTextView;
    }

    @NonNull
    public static ActivityOneProfitReportDetailBinding bind(@NonNull View view) {
        int i = R.id.appBarLayout;
        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
        if (appBarLayout != null) {
            i = R.id.frameContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.toolbar;
                DtacToolbar dtacToolbar = (DtacToolbar) ViewBindings.findChildViewById(view, i);
                if (dtacToolbar != null) {
                    i = R.id.tv_toolbar_title;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        return new ActivityOneProfitReportDetailBinding(constraintLayout, appBarLayout, frameLayout, constraintLayout, dtacToolbar, oneFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneProfitReportDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneProfitReportDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_profit_report_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83555a;
    }
}
