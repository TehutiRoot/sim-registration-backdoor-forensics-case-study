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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncGotoHistoryBinding */
/* loaded from: classes7.dex */
public final class ZIncGotoHistoryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84611a;
    @NonNull
    public final ConstraintLayout btnReloadHistory;
    @NonNull
    public final ConstraintLayout constraintLayout;
    @NonNull
    public final ConstraintLayout gotoLoadHistoryContainer;
    @NonNull
    public final ImageView ivIcoReload;
    @NonNull
    public final DtacFontTextView tvBtnLabel;
    @NonNull
    public final DtacFontTextView tvLine2;

    public ZIncGotoHistoryBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84611a = constraintLayout;
        this.btnReloadHistory = constraintLayout2;
        this.constraintLayout = constraintLayout3;
        this.gotoLoadHistoryContainer = constraintLayout4;
        this.ivIcoReload = imageView;
        this.tvBtnLabel = dtacFontTextView;
        this.tvLine2 = dtacFontTextView2;
    }

    @NonNull
    public static ZIncGotoHistoryBinding bind(@NonNull View view) {
        int i = R.id.btnReloadHistory;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.constraintLayout;
            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout2 != null) {
                ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                i = R.id.ivIcoReload;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.tvBtnLabel;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.tvLine2;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            return new ZIncGotoHistoryBinding(constraintLayout3, constraintLayout, constraintLayout2, constraintLayout3, imageView, dtacFontTextView, dtacFontTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncGotoHistoryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncGotoHistoryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_inc_goto_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84611a;
    }
}
