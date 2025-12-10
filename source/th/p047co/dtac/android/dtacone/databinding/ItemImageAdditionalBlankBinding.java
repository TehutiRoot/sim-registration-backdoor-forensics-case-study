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
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemImageAdditionalBlankBinding */
/* loaded from: classes7.dex */
public final class ItemImageAdditionalBlankBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84321a;
    @NonNull
    public final ImageView ivIconPhoto;
    @NonNull
    public final ConstraintLayout layoutBlankAdditional;
    @NonNull
    public final DtacFontTextView tvAdditionalImageTitle;

    public ItemImageAdditionalBlankBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView) {
        this.f84321a = constraintLayout;
        this.ivIconPhoto = imageView;
        this.layoutBlankAdditional = constraintLayout2;
        this.tvAdditionalImageTitle = dtacFontTextView;
    }

    @NonNull
    public static ItemImageAdditionalBlankBinding bind(@NonNull View view) {
        int i = R.id.ivIconPhoto;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i2 = R.id.tvAdditionalImageTitle;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i2);
            if (dtacFontTextView != null) {
                return new ItemImageAdditionalBlankBinding(constraintLayout, imageView, constraintLayout, dtacFontTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemImageAdditionalBlankBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemImageAdditionalBlankBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_image_additional_blank, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84321a;
    }
}
