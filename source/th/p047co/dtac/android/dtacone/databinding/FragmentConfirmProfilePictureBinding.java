package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.isseiaoki.simplecropview.CropImageView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentConfirmProfilePictureBinding */
/* loaded from: classes7.dex */
public final class FragmentConfirmProfilePictureBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83681a;
    @NonNull
    public final ImageView ivCancel;
    @NonNull
    public final ImageView ivSubmit;
    @NonNull
    public final LinearLayout layoutButton;
    @NonNull
    public final CropImageView mCropView;

    public FragmentConfirmProfilePictureBinding(RelativeLayout relativeLayout, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, CropImageView cropImageView) {
        this.f83681a = relativeLayout;
        this.ivCancel = imageView;
        this.ivSubmit = imageView2;
        this.layoutButton = linearLayout;
        this.mCropView = cropImageView;
    }

    @NonNull
    public static FragmentConfirmProfilePictureBinding bind(@NonNull View view) {
        int i = R.id.ivCancel;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivSubmit;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.layoutButton;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.mCropView;
                    CropImageView cropImageView = (CropImageView) ViewBindings.findChildViewById(view, i);
                    if (cropImageView != null) {
                        return new FragmentConfirmProfilePictureBinding((RelativeLayout) view, imageView, imageView2, linearLayout, cropImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentConfirmProfilePictureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentConfirmProfilePictureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_confirm_profile_picture, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83681a;
    }
}
