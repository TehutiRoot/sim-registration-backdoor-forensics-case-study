package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.percentlayout.widget.PercentRelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import jp.p022co.cyberagent.android.gpuimage.GPUImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZPhotoItemListBinding */
/* loaded from: classes7.dex */
public final class ZPhotoItemListBinding implements ViewBinding {

    /* renamed from: a */
    public final PercentRelativeLayout f84682a;
    @NonNull
    public final FrameLayout imageBox;
    @NonNull
    public final ImageView ivCancel;
    @NonNull
    public final GPUImageView ivPhoto;
    @NonNull
    public final DtacFontTextView tvCardType;

    public ZPhotoItemListBinding(PercentRelativeLayout percentRelativeLayout, FrameLayout frameLayout, ImageView imageView, GPUImageView gPUImageView, DtacFontTextView dtacFontTextView) {
        this.f84682a = percentRelativeLayout;
        this.imageBox = frameLayout;
        this.ivCancel = imageView;
        this.ivPhoto = gPUImageView;
        this.tvCardType = dtacFontTextView;
    }

    @NonNull
    public static ZPhotoItemListBinding bind(@NonNull View view) {
        int i = R.id.imageBox;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.ivCancel;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.ivPhoto;
                GPUImageView gPUImageView = (GPUImageView) ViewBindings.findChildViewById(view, i);
                if (gPUImageView != null) {
                    i = R.id.tvCardType;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        return new ZPhotoItemListBinding((PercentRelativeLayout) view, frameLayout, imageView, gPUImageView, dtacFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZPhotoItemListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZPhotoItemListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_photo_item_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public PercentRelativeLayout getRoot() {
        return this.f84682a;
    }
}
