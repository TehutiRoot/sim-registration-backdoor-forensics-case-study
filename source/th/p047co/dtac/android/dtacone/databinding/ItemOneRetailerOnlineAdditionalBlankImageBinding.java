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
import com.makeramen.roundedimageview.RoundedImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneRetailerOnlineAdditionalBlankImageBinding */
/* loaded from: classes7.dex */
public final class ItemOneRetailerOnlineAdditionalBlankImageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84364a;
    @NonNull
    public final RoundedImageView additionalImageView;
    @NonNull
    public final ImageView ivIconPhoto;
    @NonNull
    public final ConstraintLayout layoutBlankAdditional;
    @NonNull
    public final OneFontTextView tvAdditionalImageTitle;

    public ItemOneRetailerOnlineAdditionalBlankImageBinding(ConstraintLayout constraintLayout, RoundedImageView roundedImageView, ImageView imageView, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView) {
        this.f84364a = constraintLayout;
        this.additionalImageView = roundedImageView;
        this.ivIconPhoto = imageView;
        this.layoutBlankAdditional = constraintLayout2;
        this.tvAdditionalImageTitle = oneFontTextView;
    }

    @NonNull
    public static ItemOneRetailerOnlineAdditionalBlankImageBinding bind(@NonNull View view) {
        int i = R.id.additionalImageView;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i);
        if (roundedImageView != null) {
            i = R.id.ivIconPhoto;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.tvAdditionalImageTitle;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new ItemOneRetailerOnlineAdditionalBlankImageBinding(constraintLayout, roundedImageView, imageView, constraintLayout, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneRetailerOnlineAdditionalBlankImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneRetailerOnlineAdditionalBlankImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_retailer_online_additional_blank_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84364a;
    }
}
