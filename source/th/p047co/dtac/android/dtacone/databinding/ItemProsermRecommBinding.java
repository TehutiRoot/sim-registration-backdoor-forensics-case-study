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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemProsermRecommBinding */
/* loaded from: classes7.dex */
public final class ItemProsermRecommBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84389a;
    @NonNull
    public final Guideline gl72;
    @NonNull
    public final ImageView ivCart;
    @NonNull
    public final ImageView ivNet;
    @NonNull
    public final ImageView ivType;
    @NonNull
    public final ImageView ivValid;
    @NonNull
    public final DtacFontTextView tvCommission;
    @NonNull
    public final DtacFontTextView tvDescription;
    @NonNull
    public final DtacFontTextView tvNet;
    @NonNull
    public final DtacFontTextView tvPackageGroupType;
    @NonNull
    public final DtacFontTextView tvPrice;
    @NonNull
    public final DtacFontTextView tvPriceLabel;
    @NonNull
    public final DtacFontTextView tvTitle;
    @NonNull
    public final DtacFontTextView tvValidity;
    @NonNull
    public final View vgCommissionColor;
    @NonNull
    public final View vgDivide;
    @NonNull
    public final View vgVBar;

    public ItemProsermRecommBinding(ConstraintLayout constraintLayout, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, View view, View view2, View view3) {
        this.f84389a = constraintLayout;
        this.gl72 = guideline;
        this.ivCart = imageView;
        this.ivNet = imageView2;
        this.ivType = imageView3;
        this.ivValid = imageView4;
        this.tvCommission = dtacFontTextView;
        this.tvDescription = dtacFontTextView2;
        this.tvNet = dtacFontTextView3;
        this.tvPackageGroupType = dtacFontTextView4;
        this.tvPrice = dtacFontTextView5;
        this.tvPriceLabel = dtacFontTextView6;
        this.tvTitle = dtacFontTextView7;
        this.tvValidity = dtacFontTextView8;
        this.vgCommissionColor = view;
        this.vgDivide = view2;
        this.vgVBar = view3;
    }

    @NonNull
    public static ItemProsermRecommBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        int i = R.id.gl72;
        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
        if (guideline != null) {
            i = R.id.ivCart;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.ivNet;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.ivType;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = R.id.ivValid;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView4 != null) {
                            i = R.id.tvCommission;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.tvDescription;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.tvNet;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        i = R.id.tvPackageGroupType;
                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView4 != null) {
                                            i = R.id.tvPrice;
                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView5 != null) {
                                                i = R.id.tvPriceLabel;
                                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView6 != null) {
                                                    i = R.id.tvTitle;
                                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView7 != null) {
                                                        i = R.id.tvValidity;
                                                        DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView8 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vgCommissionColor))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.vgDivide))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.vgVBar))) != null) {
                                                            return new ItemProsermRecommBinding((ConstraintLayout) view, guideline, imageView, imageView2, imageView3, imageView4, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, findChildViewById, findChildViewById2, findChildViewById3);
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
    public static ItemProsermRecommBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemProsermRecommBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_proserm_recomm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84389a;
    }
}
