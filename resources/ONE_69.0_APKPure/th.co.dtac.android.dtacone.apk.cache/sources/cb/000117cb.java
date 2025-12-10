package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.makeramen.roundedimageview.RoundedImageView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneRetailerOnlineOptionalImageBinding */
/* loaded from: classes7.dex */
public final class ItemOneRetailerOnlineOptionalImageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84474a;
    @NonNull
    public final IncludeOneAdditionalImageBinding incAdditionalImage;
    @NonNull
    public final RoundedImageView onlineRegisterIdCardImageImageView;
    @NonNull
    public final ConstraintLayout onlineRegisterIdCardImageItem;

    public ItemOneRetailerOnlineOptionalImageBinding(ConstraintLayout constraintLayout, IncludeOneAdditionalImageBinding includeOneAdditionalImageBinding, RoundedImageView roundedImageView, ConstraintLayout constraintLayout2) {
        this.f84474a = constraintLayout;
        this.incAdditionalImage = includeOneAdditionalImageBinding;
        this.onlineRegisterIdCardImageImageView = roundedImageView;
        this.onlineRegisterIdCardImageItem = constraintLayout2;
    }

    @NonNull
    public static ItemOneRetailerOnlineOptionalImageBinding bind(@NonNull View view) {
        int i = R.id.incAdditionalImage;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            IncludeOneAdditionalImageBinding bind = IncludeOneAdditionalImageBinding.bind(findChildViewById);
            int i2 = R.id.onlineRegisterIdCardImageImageView;
            RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i2);
            if (roundedImageView != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                return new ItemOneRetailerOnlineOptionalImageBinding(constraintLayout, bind, roundedImageView, constraintLayout);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneRetailerOnlineOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneRetailerOnlineOptionalImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_retailer_online_optional_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84474a;
    }
}