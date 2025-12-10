package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneDeviceSalePromotionalListBinding */
/* loaded from: classes7.dex */
public final class ItemOneDeviceSalePromotionalListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84459a;
    @NonNull
    public final ImageView buttonBin;
    @NonNull
    public final OneFontTextView discountCode;
    @NonNull
    public final OneFontTextView discountItemPrice;
    @NonNull
    public final OneFontTextView discountName;
    @NonNull
    public final View dividerHorizon;
    @NonNull
    public final ConstraintLayout extraAdvance;
    @NonNull
    public final OneFontTextView extraAdvanceAmount;
    @NonNull
    public final OneFontTextView extraAdvanceText;
    @NonNull
    public final Group groupContract;
    @NonNull
    public final ImageView imageTime;
    @NonNull
    public final LinearLayoutCompat layoutContract;
    @NonNull
    public final OneFontTextView textContract;
    @NonNull
    public final OneFontTextView textContractMonth;
    @NonNull
    public final OneFontTextView textMonthUnit;

    public ItemOneDeviceSalePromotionalListBinding(ConstraintLayout constraintLayout, ImageView imageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, View view, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, Group group, ImageView imageView2, LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8) {
        this.f84459a = constraintLayout;
        this.buttonBin = imageView;
        this.discountCode = oneFontTextView;
        this.discountItemPrice = oneFontTextView2;
        this.discountName = oneFontTextView3;
        this.dividerHorizon = view;
        this.extraAdvance = constraintLayout2;
        this.extraAdvanceAmount = oneFontTextView4;
        this.extraAdvanceText = oneFontTextView5;
        this.groupContract = group;
        this.imageTime = imageView2;
        this.layoutContract = linearLayoutCompat;
        this.textContract = oneFontTextView6;
        this.textContractMonth = oneFontTextView7;
        this.textMonthUnit = oneFontTextView8;
    }

    @NonNull
    public static ItemOneDeviceSalePromotionalListBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buttonBin;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.discountCode;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.discountItemPrice;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.discountName;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.divider_horizon))) != null) {
                        i = R.id.extraAdvance;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.extraAdvanceAmount;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                i = R.id.extraAdvanceText;
                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView5 != null) {
                                    i = R.id.groupContract;
                                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                                    if (group != null) {
                                        i = R.id.imageTime;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = R.id.layoutContract;
                                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                            if (linearLayoutCompat != null) {
                                                i = R.id.textContract;
                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView6 != null) {
                                                    i = R.id.textContractMonth;
                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView7 != null) {
                                                        i = R.id.textMonthUnit;
                                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView8 != null) {
                                                            return new ItemOneDeviceSalePromotionalListBinding((ConstraintLayout) view, imageView, oneFontTextView, oneFontTextView2, oneFontTextView3, findChildViewById, constraintLayout, oneFontTextView4, oneFontTextView5, group, imageView2, linearLayoutCompat, oneFontTextView6, oneFontTextView7, oneFontTextView8);
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
    public static ItemOneDeviceSalePromotionalListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneDeviceSalePromotionalListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_device_sale_promotional_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84459a;
    }
}