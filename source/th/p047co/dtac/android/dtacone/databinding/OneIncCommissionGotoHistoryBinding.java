package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncCommissionGotoHistoryBinding */
/* loaded from: classes7.dex */
public final class OneIncCommissionGotoHistoryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84455a;
    @NonNull
    public final ConstraintLayout btnReloadHistory;
    @NonNull
    public final ConstraintLayout constraintLayout;
    @NonNull
    public final ConstraintLayout gotoLoadHistoryContainer;
    @NonNull
    public final ImageView ivCalendarCommission;
    @NonNull
    public final ImageView ivIcoReload;
    @NonNull
    public final OneFontTextView tvBtnLabel;
    @NonNull
    public final OneFontTextView tvLine2;

    public OneIncCommissionGotoHistoryBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ImageView imageView, ImageView imageView2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84455a = constraintLayout;
        this.btnReloadHistory = constraintLayout2;
        this.constraintLayout = constraintLayout3;
        this.gotoLoadHistoryContainer = constraintLayout4;
        this.ivCalendarCommission = imageView;
        this.ivIcoReload = imageView2;
        this.tvBtnLabel = oneFontTextView;
        this.tvLine2 = oneFontTextView2;
    }

    @NonNull
    public static OneIncCommissionGotoHistoryBinding bind(@NonNull View view) {
        int i = R.id.btnReloadHistory;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.constraintLayout;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                i = R.id.ivCalendarCommission;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ivIcoReload;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.tvBtnLabel;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.tvLine2;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                return new OneIncCommissionGotoHistoryBinding(constraintLayout3, constraintLayout, constraintLayout2, constraintLayout3, imageView, imageView2, oneFontTextView, oneFontTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncCommissionGotoHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncCommissionGotoHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_inc_commission_goto_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84455a;
    }
}
