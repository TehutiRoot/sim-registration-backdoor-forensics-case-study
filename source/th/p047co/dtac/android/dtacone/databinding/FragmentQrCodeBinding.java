package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.fotoapparat.view.CameraView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentQrCodeBinding */
/* loaded from: classes7.dex */
public final class FragmentQrCodeBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84154a;
    @NonNull
    public final ImageView bottom;
    @NonNull
    public final DtacFontTextView cameraCaption;
    @NonNull
    public final CameraView cameraView;
    @NonNull
    public final ImageView frameFace;
    @NonNull
    public final Group framePhotoGroupFace;
    @NonNull
    public final ImageView leftFace;
    @NonNull
    public final DtacFontTextView noPermission;
    @NonNull
    public final ImageView previewPhoto;
    @NonNull
    public final ImageView qrLogo;
    @NonNull
    public final ImageView rightFace;
    @NonNull
    public final ImageView topFace;
    @NonNull
    public final ConstraintLayout transitionsContainerCustomerFaceDetect;
    @NonNull
    public final ConstraintLayout viewFrameTakePhoto;

    public FragmentQrCodeBinding(ConstraintLayout constraintLayout, ImageView imageView, DtacFontTextView dtacFontTextView, CameraView cameraView, ImageView imageView2, Group group, ImageView imageView3, DtacFontTextView dtacFontTextView2, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3) {
        this.f84154a = constraintLayout;
        this.bottom = imageView;
        this.cameraCaption = dtacFontTextView;
        this.cameraView = cameraView;
        this.frameFace = imageView2;
        this.framePhotoGroupFace = group;
        this.leftFace = imageView3;
        this.noPermission = dtacFontTextView2;
        this.previewPhoto = imageView4;
        this.qrLogo = imageView5;
        this.rightFace = imageView6;
        this.topFace = imageView7;
        this.transitionsContainerCustomerFaceDetect = constraintLayout2;
        this.viewFrameTakePhoto = constraintLayout3;
    }

    @NonNull
    public static FragmentQrCodeBinding bind(@NonNull View view) {
        int i = R.id.bottom;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.camera_caption;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.cameraView;
                CameraView cameraView = (CameraView) ViewBindings.findChildViewById(view, i);
                if (cameraView != null) {
                    i = R.id.frameFace;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.framePhotoGroupFace;
                        Group group = (Group) ViewBindings.findChildViewById(view, i);
                        if (group != null) {
                            i = R.id.leftFace;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.no_permission;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.previewPhoto;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView4 != null) {
                                        i = R.id.qr_logo;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView5 != null) {
                                            i = R.id.rightFace;
                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView6 != null) {
                                                i = R.id.topFace;
                                                ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView7 != null) {
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                    i = R.id.viewFrameTakePhoto;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout2 != null) {
                                                        return new FragmentQrCodeBinding(constraintLayout, imageView, dtacFontTextView, cameraView, imageView2, group, imageView3, dtacFontTextView2, imageView4, imageView5, imageView6, imageView7, constraintLayout, constraintLayout2);
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
    public static FragmentQrCodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentQrCodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_qr_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84154a;
    }
}
