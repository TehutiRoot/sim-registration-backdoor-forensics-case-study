package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleTrueReviewAdditionalImageBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleTrueReviewAdditionalImageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84040a;
    @NonNull
    public final OneFontButton navigateToSignaturePageButton;
    @NonNull
    public final OneFontTextView oneDeviceSaleAddMorePhotoTextView;
    @NonNull
    public final ConstraintLayout oneDeviceSaleImageLayout;
    @NonNull
    public final ImageView oneDeviceSaleNoImageImageView;
    @NonNull
    public final ConstraintLayout oneDeviceSaleNoImageLayout;
    @NonNull
    public final LinearLayoutCompat oneDeviceSaleSlideImageLayout;
    @NonNull
    public final OneFontTextView oneDeviceSaleTakeMorePhotoCountTextView;
    @NonNull
    public final ImageView oneDeviceSaleTakeMorePhotoImageView;
    @NonNull
    public final ConstraintLayout oneDeviceSaleTakeMorePhotoLayout;

    public FragmentOneDeviceSaleTrueReviewAdditionalImageBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneFontTextView oneFontTextView, ConstraintLayout constraintLayout2, ImageView imageView, ConstraintLayout constraintLayout3, LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView2, ImageView imageView2, ConstraintLayout constraintLayout4) {
        this.f84040a = constraintLayout;
        this.navigateToSignaturePageButton = oneFontButton;
        this.oneDeviceSaleAddMorePhotoTextView = oneFontTextView;
        this.oneDeviceSaleImageLayout = constraintLayout2;
        this.oneDeviceSaleNoImageImageView = imageView;
        this.oneDeviceSaleNoImageLayout = constraintLayout3;
        this.oneDeviceSaleSlideImageLayout = linearLayoutCompat;
        this.oneDeviceSaleTakeMorePhotoCountTextView = oneFontTextView2;
        this.oneDeviceSaleTakeMorePhotoImageView = imageView2;
        this.oneDeviceSaleTakeMorePhotoLayout = constraintLayout4;
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueReviewAdditionalImageBinding bind(@NonNull View view) {
        int i = R.id.navigateToSignaturePageButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.oneDeviceSaleAddMorePhotoTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.oneDeviceSaleImageLayout;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.oneDeviceSaleNoImageImageView;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.oneDeviceSaleNoImageLayout;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout2 != null) {
                            i = R.id.oneDeviceSaleSlideImageLayout;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = R.id.oneDeviceSaleTakeMorePhotoCountTextView;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    i = R.id.oneDeviceSaleTakeMorePhotoImageView;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = R.id.oneDeviceSaleTakeMorePhotoLayout;
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout3 != null) {
                                            return new FragmentOneDeviceSaleTrueReviewAdditionalImageBinding((ConstraintLayout) view, oneFontButton, oneFontTextView, constraintLayout, imageView, constraintLayout2, linearLayoutCompat, oneFontTextView2, imageView2, constraintLayout3);
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
    public static FragmentOneDeviceSaleTrueReviewAdditionalImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueReviewAdditionalImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_true_review_additional_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84040a;
    }
}