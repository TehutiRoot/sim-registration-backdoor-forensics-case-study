package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.PhotoListItemBinding */
/* loaded from: classes7.dex */
public final class PhotoListItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84555a;
    @NonNull
    public final ImageView dotRequire;
    @NonNull
    public final FrameLayout framePhoto;
    @NonNull
    public final ImageView imageCamera;
    @NonNull
    public final ImageView imageViewPhoto;
    @NonNull
    public final DtacFontTextView textViewLabel;

    public PhotoListItemBinding(ConstraintLayout constraintLayout, ImageView imageView, FrameLayout frameLayout, ImageView imageView2, ImageView imageView3, DtacFontTextView dtacFontTextView) {
        this.f84555a = constraintLayout;
        this.dotRequire = imageView;
        this.framePhoto = frameLayout;
        this.imageCamera = imageView2;
        this.imageViewPhoto = imageView3;
        this.textViewLabel = dtacFontTextView;
    }

    @NonNull
    public static PhotoListItemBinding bind(@NonNull View view) {
        int i = R.id.dotRequire;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.framePhoto;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.imageCamera;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.imageViewPhoto;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = R.id.textViewLabel;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            return new PhotoListItemBinding((ConstraintLayout) view, imageView, frameLayout, imageView2, imageView3, dtacFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PhotoListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PhotoListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.photo_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84555a;
    }
}
