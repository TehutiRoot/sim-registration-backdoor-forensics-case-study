package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.chrisbanes.photoview.PhotoView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPreviewImageBinding */
/* loaded from: classes7.dex */
public final class FragmentPreviewImageBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84256a;
    @NonNull
    public final PhotoView ivCard;
    @NonNull
    public final ImageView ivClose;
    @NonNull
    public final ProgressBar progressBar;
    @NonNull
    public final View vModal;

    public FragmentPreviewImageBinding(RelativeLayout relativeLayout, PhotoView photoView, ImageView imageView, ProgressBar progressBar, View view) {
        this.f84256a = relativeLayout;
        this.ivCard = photoView;
        this.ivClose = imageView;
        this.progressBar = progressBar;
        this.vModal = view;
    }

    @NonNull
    public static FragmentPreviewImageBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.ivCard;
        PhotoView photoView = (PhotoView) ViewBindings.findChildViewById(view, i);
        if (photoView != null) {
            i = R.id.ivClose;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                if (progressBar != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vModal))) != null) {
                    return new FragmentPreviewImageBinding((RelativeLayout) view, photoView, imageView, progressBar, findChildViewById);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPreviewImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_preview_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84256a;
    }
}