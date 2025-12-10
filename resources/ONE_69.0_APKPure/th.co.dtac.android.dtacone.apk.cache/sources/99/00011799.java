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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemImageAdditionalBinding */
/* loaded from: classes7.dex */
public final class ItemImageAdditionalBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84424a;
    @NonNull
    public final RoundedImageView ivAdditional;
    @NonNull
    public final ImageView ivTackAgain;
    @NonNull
    public final DtacFontTextView tvImageNameTitle;

    public ItemImageAdditionalBinding(ConstraintLayout constraintLayout, RoundedImageView roundedImageView, ImageView imageView, DtacFontTextView dtacFontTextView) {
        this.f84424a = constraintLayout;
        this.ivAdditional = roundedImageView;
        this.ivTackAgain = imageView;
        this.tvImageNameTitle = dtacFontTextView;
    }

    @NonNull
    public static ItemImageAdditionalBinding bind(@NonNull View view) {
        int i = R.id.ivAdditional;
        RoundedImageView roundedImageView = (RoundedImageView) ViewBindings.findChildViewById(view, i);
        if (roundedImageView != null) {
            i = R.id.ivTackAgain;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvImageNameTitle;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new ItemImageAdditionalBinding((ConstraintLayout) view, roundedImageView, imageView, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemImageAdditionalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemImageAdditionalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_image_additional, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84424a;
    }
}