package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistrationOptionalImageListBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistrationOptionalImageListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84102a;
    @NonNull
    public final RecyclerView additionalImageRecyclerView;
    @NonNull
    public final View backgroundView;
    @NonNull
    public final OneFontButton nextButton;
    @NonNull
    public final CardView onlineRegisterAdditionalImageInfoCardView;
    @NonNull
    public final ConstraintLayout onlineRegisterAdditionalInfoHeaderLayout;
    @NonNull
    public final AppCompatImageView onlineRegisterAdditionalInfoImageView;
    @NonNull
    public final AppCompatImageView onlineRegisterContactInfoImageView;
    @NonNull
    public final CardView onlineRegisterFaceImageCardView;
    @NonNull
    public final ImageView onlineRegisterFaceImageView;
    @NonNull
    public final CardView onlineRegisterIdCardCardView;
    @NonNull
    public final CardView onlineRegisterIdCardImageCardView;
    @NonNull
    public final ConstraintLayout onlineRegisterIdCardImageInfoHeaderLayout;
    @NonNull
    public final ImageView onlineRegisterIdCardImageView;
    @NonNull
    public final OneFontTextView onlineRegisterInfoHeaderTextView;
    @NonNull
    public final ConstraintLayout onlineRegistrationInputNumberMainLayout;
    @NonNull
    public final OneFontTextView retailerContactInfoHeaderTextView;
    @NonNull
    public final IncludeOneTypeRetailerBinding retailerHeaderTypeLayout;

    public FragmentOneOnlineRegistrationOptionalImageListBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, View view, OneFontButton oneFontButton, CardView cardView, ConstraintLayout constraintLayout2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, CardView cardView2, ImageView imageView, CardView cardView3, CardView cardView4, ConstraintLayout constraintLayout3, ImageView imageView2, OneFontTextView oneFontTextView, ConstraintLayout constraintLayout4, OneFontTextView oneFontTextView2, IncludeOneTypeRetailerBinding includeOneTypeRetailerBinding) {
        this.f84102a = constraintLayout;
        this.additionalImageRecyclerView = recyclerView;
        this.backgroundView = view;
        this.nextButton = oneFontButton;
        this.onlineRegisterAdditionalImageInfoCardView = cardView;
        this.onlineRegisterAdditionalInfoHeaderLayout = constraintLayout2;
        this.onlineRegisterAdditionalInfoImageView = appCompatImageView;
        this.onlineRegisterContactInfoImageView = appCompatImageView2;
        this.onlineRegisterFaceImageCardView = cardView2;
        this.onlineRegisterFaceImageView = imageView;
        this.onlineRegisterIdCardCardView = cardView3;
        this.onlineRegisterIdCardImageCardView = cardView4;
        this.onlineRegisterIdCardImageInfoHeaderLayout = constraintLayout3;
        this.onlineRegisterIdCardImageView = imageView2;
        this.onlineRegisterInfoHeaderTextView = oneFontTextView;
        this.onlineRegistrationInputNumberMainLayout = constraintLayout4;
        this.retailerContactInfoHeaderTextView = oneFontTextView2;
        this.retailerHeaderTypeLayout = includeOneTypeRetailerBinding;
    }

    @NonNull
    public static FragmentOneOnlineRegistrationOptionalImageListBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.additionalImageRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.backgroundView))) != null) {
            i = R.id.nextButton;
            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton != null) {
                i = R.id.onlineRegisterAdditionalImageInfoCardView;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = R.id.onlineRegisterAdditionalInfoHeaderLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.onlineRegisterAdditionalInfoImageView;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView != null) {
                            i = R.id.onlineRegisterContactInfoImageView;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                            if (appCompatImageView2 != null) {
                                i = R.id.onlineRegisterFaceImageCardView;
                                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                                if (cardView2 != null) {
                                    i = R.id.onlineRegisterFaceImageView;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = R.id.onlineRegisterIdCardCardView;
                                        CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, i);
                                        if (cardView3 != null) {
                                            i = R.id.onlineRegisterIdCardImageCardView;
                                            CardView cardView4 = (CardView) ViewBindings.findChildViewById(view, i);
                                            if (cardView4 != null) {
                                                i = R.id.onlineRegisterIdCardImageInfoHeaderLayout;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout2 != null) {
                                                    i = R.id.onlineRegisterIdCardImageView;
                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView2 != null) {
                                                        i = R.id.onlineRegisterInfoHeaderTextView;
                                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView != null) {
                                                            i = R.id.onlineRegistrationInputNumberMainLayout;
                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                            if (constraintLayout3 != null) {
                                                                i = R.id.retailerContactInfoHeaderTextView;
                                                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView2 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.retailerHeaderTypeLayout))) != null) {
                                                                    return new FragmentOneOnlineRegistrationOptionalImageListBinding((ConstraintLayout) view, recyclerView, findChildViewById, oneFontButton, cardView, constraintLayout, appCompatImageView, appCompatImageView2, cardView2, imageView, cardView3, cardView4, constraintLayout2, imageView2, oneFontTextView, constraintLayout3, oneFontTextView2, IncludeOneTypeRetailerBinding.bind(findChildViewById2));
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
    public static FragmentOneOnlineRegistrationOptionalImageListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistrationOptionalImageListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_registration_optional_image_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84102a;
    }
}