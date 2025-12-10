package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.SalesOrderDiscountItemBinding */
/* loaded from: classes7.dex */
public final class SalesOrderDiscountItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84574a;
    @NonNull
    public final ImageView buttonBin;
    @NonNull
    public final DtacFontTextView discountCode;
    @NonNull
    public final DtacFontTextView discountItemPrice;
    @NonNull
    public final DtacFontTextView discountName;
    @NonNull
    public final View dividerHorizon;
    @NonNull
    public final ConstraintLayout extraAdvance;
    @NonNull
    public final DtacFontTextView extraAdvanceAmount;
    @NonNull
    public final DtacFontTextView extraAdvanceText;
    @NonNull
    public final Group groupContract;
    @NonNull
    public final ImageView imageTime;
    @NonNull
    public final LinearLayout layoutContract;
    @NonNull
    public final DtacFontTextView textContract;
    @NonNull
    public final DtacFontTextView textContractMonth;
    @NonNull
    public final DtacFontTextView textMonth;

    public SalesOrderDiscountItemBinding(ConstraintLayout constraintLayout, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, View view, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, Group group, ImageView imageView2, LinearLayout linearLayout, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8) {
        this.f84574a = constraintLayout;
        this.buttonBin = imageView;
        this.discountCode = dtacFontTextView;
        this.discountItemPrice = dtacFontTextView2;
        this.discountName = dtacFontTextView3;
        this.dividerHorizon = view;
        this.extraAdvance = constraintLayout2;
        this.extraAdvanceAmount = dtacFontTextView4;
        this.extraAdvanceText = dtacFontTextView5;
        this.groupContract = group;
        this.imageTime = imageView2;
        this.layoutContract = linearLayout;
        this.textContract = dtacFontTextView6;
        this.textContractMonth = dtacFontTextView7;
        this.textMonth = dtacFontTextView8;
    }

    @NonNull
    public static SalesOrderDiscountItemBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buttonBin;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.discountCode;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.discountItemPrice;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.discountName;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider_horizon))) != null) {
                        i = R.id.extraAdvance;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.extraAdvanceAmount;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                i = R.id.extraAdvanceText;
                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView5 != null) {
                                    i = R.id.groupContract;
                                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                                    if (group != null) {
                                        i = R.id.imageTime;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = R.id.layoutContract;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = R.id.textContract;
                                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView6 != null) {
                                                    i = R.id.textContractMonth;
                                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView7 != null) {
                                                        i = R.id.textMonth;
                                                        DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView8 != null) {
                                                            return new SalesOrderDiscountItemBinding((ConstraintLayout) view, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, findChildViewById, constraintLayout, dtacFontTextView4, dtacFontTextView5, group, imageView2, linearLayout, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8);
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
    public static SalesOrderDiscountItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static SalesOrderDiscountItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.sales_order_discount_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84574a;
    }
}
