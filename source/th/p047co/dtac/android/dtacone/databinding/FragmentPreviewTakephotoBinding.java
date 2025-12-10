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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPreviewTakephotoBinding */
/* loaded from: classes7.dex */
public final class FragmentPreviewTakephotoBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84153a;
    @NonNull
    public final ImageView bottom;
    @NonNull
    public final DtacFontButton buttonConfirm;
    @NonNull
    public final DtacFontButton buttonDeletePhoto;
    @NonNull
    public final DtacFontButton buttonRetake;
    @NonNull
    public final ImageView imageViewPreviewPhoto;
    @NonNull
    public final FrameLayout transitionsContainerCustomerFaceDetect;
    @NonNull
    public final ConstraintLayout viewFrameTakePhoto;

    public FragmentPreviewTakephotoBinding(FrameLayout frameLayout, ImageView imageView, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontButton dtacFontButton3, ImageView imageView2, FrameLayout frameLayout2, ConstraintLayout constraintLayout) {
        this.f84153a = frameLayout;
        this.bottom = imageView;
        this.buttonConfirm = dtacFontButton;
        this.buttonDeletePhoto = dtacFontButton2;
        this.buttonRetake = dtacFontButton3;
        this.imageViewPreviewPhoto = imageView2;
        this.transitionsContainerCustomerFaceDetect = frameLayout2;
        this.viewFrameTakePhoto = constraintLayout;
    }

    @NonNull
    public static FragmentPreviewTakephotoBinding bind(@NonNull View view) {
        int i = R.id.bottom;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.buttonConfirm;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.buttonDeletePhoto;
                DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton2 != null) {
                    i = R.id.buttonRetake;
                    DtacFontButton dtacFontButton3 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                    if (dtacFontButton3 != null) {
                        i = R.id.imageViewPreviewPhoto;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            FrameLayout frameLayout = (FrameLayout) view;
                            i = R.id.viewFrameTakePhoto;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                return new FragmentPreviewTakephotoBinding(frameLayout, imageView, dtacFontButton, dtacFontButton2, dtacFontButton3, imageView2, frameLayout, constraintLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentPreviewTakephotoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPreviewTakephotoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_preview_takephoto, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84153a;
    }
}
