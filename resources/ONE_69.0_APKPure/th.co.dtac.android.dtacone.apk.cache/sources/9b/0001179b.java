package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemInfoDeviceSummaryBinding */
/* loaded from: classes7.dex */
public final class ItemInfoDeviceSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84426a;
    @NonNull
    public final ImageView arrowdown;
    @NonNull
    public final DtacFontTextView dtacFontTextView55;
    @NonNull
    public final DtacFontTextView dtacFontTextView57;
    @NonNull
    public final DtacFontTextView dtacFontTextView59;
    @NonNull
    public final Guideline guideline1;
    @NonNull
    public final Guideline guideline2;
    @NonNull
    public final Guideline guideline3;
    @NonNull
    public final Guideline guideline4;
    @NonNull
    public final ConstraintLayout itemLayout;
    @NonNull
    public final ConstraintLayout layoutDescription;
    @NonNull
    public final View status;
    @NonNull
    public final DtacFontTextView tvContractPeriod;
    @NonNull
    public final DtacFontTextView tvContractStartEndDate;
    @NonNull
    public final DtacFontTextView tvDiscount;
    @NonNull
    public final DtacFontTextView tvModel;
    @NonNull
    public final DtacFontTextView tvReason;
    @NonNull
    public final DtacFontTextView tvRemainingPeriod;
    @NonNull
    public final DtacFontTextView tvStatus;

    public ItemInfoDeviceSummaryBinding(ConstraintLayout constraintLayout, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, View view, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10) {
        this.f84426a = constraintLayout;
        this.arrowdown = imageView;
        this.dtacFontTextView55 = dtacFontTextView;
        this.dtacFontTextView57 = dtacFontTextView2;
        this.dtacFontTextView59 = dtacFontTextView3;
        this.guideline1 = guideline;
        this.guideline2 = guideline2;
        this.guideline3 = guideline3;
        this.guideline4 = guideline4;
        this.itemLayout = constraintLayout2;
        this.layoutDescription = constraintLayout3;
        this.status = view;
        this.tvContractPeriod = dtacFontTextView4;
        this.tvContractStartEndDate = dtacFontTextView5;
        this.tvDiscount = dtacFontTextView6;
        this.tvModel = dtacFontTextView7;
        this.tvReason = dtacFontTextView8;
        this.tvRemainingPeriod = dtacFontTextView9;
        this.tvStatus = dtacFontTextView10;
    }

    @NonNull
    public static ItemInfoDeviceSummaryBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.arrowdown;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.dtacFontTextView55;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.dtacFontTextView57;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.dtacFontTextView59;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        i = R.id.guideline1;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline != null) {
                            i = R.id.guideline2;
                            Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline2 != null) {
                                i = R.id.guideline3;
                                Guideline guideline3 = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline3 != null) {
                                    i = R.id.guideline4;
                                    Guideline guideline4 = (Guideline) ViewBindings.findChildViewById(view, i);
                                    if (guideline4 != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                        i = R.id.layoutDescription;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.status))) != null) {
                                            i = R.id.tvContractPeriod;
                                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView4 != null) {
                                                i = R.id.tvContractStartEndDate;
                                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView5 != null) {
                                                    i = R.id.tvDiscount;
                                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView6 != null) {
                                                        i = R.id.tvModel;
                                                        DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView7 != null) {
                                                            i = R.id.tvReason;
                                                            DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView8 != null) {
                                                                i = R.id.tvRemainingPeriod;
                                                                DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView9 != null) {
                                                                    i = R.id.tvStatus;
                                                                    DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView10 != null) {
                                                                        return new ItemInfoDeviceSummaryBinding(constraintLayout, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, guideline, guideline2, guideline3, guideline4, constraintLayout, constraintLayout2, findChildViewById, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static ItemInfoDeviceSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemInfoDeviceSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_info_device_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84426a;
    }
}