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

/* renamed from: th.co.dtac.android.dtacone.databinding.RvCommissionReportItemBinding */
/* loaded from: classes7.dex */
public final class RvCommissionReportItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84569a;
    @NonNull
    public final ConstraintLayout commissionContainer;
    @NonNull
    public final View detailBarCommission;
    @NonNull
    public final ImageView imageView2;
    @NonNull
    public final DtacFontTextView tvCommission;
    @NonNull
    public final DtacFontTextView tvCommissionDisplayLabel;
    @NonNull
    public final DtacFontTextView tvCommissionHeader;
    @NonNull
    public final DtacFontTextView tvCommissionRemark;

    public RvCommissionReportItemBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, View view, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f84569a = constraintLayout;
        this.commissionContainer = constraintLayout2;
        this.detailBarCommission = view;
        this.imageView2 = imageView;
        this.tvCommission = dtacFontTextView;
        this.tvCommissionDisplayLabel = dtacFontTextView2;
        this.tvCommissionHeader = dtacFontTextView3;
        this.tvCommissionRemark = dtacFontTextView4;
    }

    @NonNull
    public static RvCommissionReportItemBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.detailBarCommission;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.imageView2;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvCommission;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvCommissionDisplayLabel;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.tvCommissionHeader;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.tvCommissionRemark;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                return new RvCommissionReportItemBinding(constraintLayout, constraintLayout, findChildViewById, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static RvCommissionReportItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static RvCommissionReportItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.rv_commission_report_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84569a;
    }
}
