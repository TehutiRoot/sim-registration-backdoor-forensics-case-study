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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneProsermRecommBinding */
/* loaded from: classes7.dex */
public final class ItemOneProsermRecommBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84471a;
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
    public final OneFontTextView tvCommission;
    @NonNull
    public final OneFontTextView tvDescription;
    @NonNull
    public final OneFontTextView tvNet;
    @NonNull
    public final OneFontTextView tvPackageGroupType;
    @NonNull
    public final OneFontTextView tvPrice;
    @NonNull
    public final OneFontTextView tvPriceLabel;
    @NonNull
    public final OneFontTextView tvTitle;
    @NonNull
    public final OneFontTextView tvValidity;
    @NonNull
    public final View vgCommissionColor;
    @NonNull
    public final View vgDivide;
    @NonNull
    public final View vgVBar;

    public ItemOneProsermRecommBinding(ConstraintLayout constraintLayout, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, View view, View view2, View view3) {
        this.f84471a = constraintLayout;
        this.gl72 = guideline;
        this.ivCart = imageView;
        this.ivNet = imageView2;
        this.ivType = imageView3;
        this.ivValid = imageView4;
        this.tvCommission = oneFontTextView;
        this.tvDescription = oneFontTextView2;
        this.tvNet = oneFontTextView3;
        this.tvPackageGroupType = oneFontTextView4;
        this.tvPrice = oneFontTextView5;
        this.tvPriceLabel = oneFontTextView6;
        this.tvTitle = oneFontTextView7;
        this.tvValidity = oneFontTextView8;
        this.vgCommissionColor = view;
        this.vgDivide = view2;
        this.vgVBar = view3;
    }

    @NonNull
    public static ItemOneProsermRecommBinding bind(@NonNull View view) {
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
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.tvDescription;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    i = R.id.tvNet;
                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView3 != null) {
                                        i = R.id.tvPackageGroupType;
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            i = R.id.tvPrice;
                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView5 != null) {
                                                i = R.id.tvPriceLabel;
                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView6 != null) {
                                                    i = R.id.tvTitle;
                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView7 != null) {
                                                        i = R.id.tvValidity;
                                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView8 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vgCommissionColor))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.vgDivide))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.vgVBar))) != null) {
                                                            return new ItemOneProsermRecommBinding((ConstraintLayout) view, guideline, imageView, imageView2, imageView3, imageView4, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, findChildViewById, findChildViewById2, findChildViewById3);
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
    public static ItemOneProsermRecommBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneProsermRecommBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_proserm_recomm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84471a;
    }
}