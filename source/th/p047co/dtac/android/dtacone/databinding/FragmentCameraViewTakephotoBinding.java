package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import io.fotoapparat.view.CameraView;
import io.fotoapparat.view.FocusView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentCameraViewTakephotoBinding */
/* loaded from: classes7.dex */
public final class FragmentCameraViewTakephotoBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83659a;
    @NonNull
    public final ImageView bottom;
    @NonNull
    public final FocusView cameraFocusView;
    @NonNull
    public final CameraView cameraView;
    @NonNull
    public final DtacFontTextView captionFace;
    @NonNull
    public final DtacFontTextView captionIdentity;
    @NonNull
    public final DtacFontTextView captionIdentityNumber;
    @NonNull
    public final DtacFontTextView captionNone;
    @NonNull
    public final ImageView capture;
    @NonNull
    public final FrameLayout disableCameraFrame;
    @NonNull
    public final ImageView frameFace;
    @NonNull
    public final ImageView frameIdentity;
    @NonNull
    public final Group framePhotoGroupFace;
    @NonNull
    public final Group framePhotoGroupIdentity;
    @NonNull
    public final Guideline guidelineHorizontal;
    @NonNull
    public final ImageView imageView31;
    @NonNull
    public final ConstraintLayout layoutMessageInfo;
    @NonNull
    public final ImageView leftFace;
    @NonNull
    public final ImageView leftFrameIdentity;
    @NonNull
    public final ImageView middleFace;
    @NonNull
    public final ImageView middleFrameIdentity;
    @NonNull
    public final DtacFontTextView noPermission;
    @NonNull
    public final ImageView rightFace;
    @NonNull
    public final ImageView rightFrameIdentity;
    @NonNull
    public final ImageView topFace;
    @NonNull
    public final ImageView topFrameIdentity;
    @NonNull
    public final ConstraintLayout transitionsContainerCustomerFaceDetect;
    @NonNull
    public final DtacFontTextView tvMessageInfo;
    @NonNull
    public final ConstraintLayout viewFrameTakePhoto;

    public FragmentCameraViewTakephotoBinding(ConstraintLayout constraintLayout, ImageView imageView, FocusView focusView, CameraView cameraView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, ImageView imageView2, FrameLayout frameLayout, ImageView imageView3, ImageView imageView4, Group group, Group group2, Guideline guideline, ImageView imageView5, ConstraintLayout constraintLayout2, ImageView imageView6, ImageView imageView7, ImageView imageView8, ImageView imageView9, DtacFontTextView dtacFontTextView5, ImageView imageView10, ImageView imageView11, ImageView imageView12, ImageView imageView13, ConstraintLayout constraintLayout3, DtacFontTextView dtacFontTextView6, ConstraintLayout constraintLayout4) {
        this.f83659a = constraintLayout;
        this.bottom = imageView;
        this.cameraFocusView = focusView;
        this.cameraView = cameraView;
        this.captionFace = dtacFontTextView;
        this.captionIdentity = dtacFontTextView2;
        this.captionIdentityNumber = dtacFontTextView3;
        this.captionNone = dtacFontTextView4;
        this.capture = imageView2;
        this.disableCameraFrame = frameLayout;
        this.frameFace = imageView3;
        this.frameIdentity = imageView4;
        this.framePhotoGroupFace = group;
        this.framePhotoGroupIdentity = group2;
        this.guidelineHorizontal = guideline;
        this.imageView31 = imageView5;
        this.layoutMessageInfo = constraintLayout2;
        this.leftFace = imageView6;
        this.leftFrameIdentity = imageView7;
        this.middleFace = imageView8;
        this.middleFrameIdentity = imageView9;
        this.noPermission = dtacFontTextView5;
        this.rightFace = imageView10;
        this.rightFrameIdentity = imageView11;
        this.topFace = imageView12;
        this.topFrameIdentity = imageView13;
        this.transitionsContainerCustomerFaceDetect = constraintLayout3;
        this.tvMessageInfo = dtacFontTextView6;
        this.viewFrameTakePhoto = constraintLayout4;
    }

    @NonNull
    public static FragmentCameraViewTakephotoBinding bind(@NonNull View view) {
        int i = R.id.bottom;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.camera_focus_view;
            FocusView focusView = (FocusView) ViewBindings.findChildViewById(view, i);
            if (focusView != null) {
                i = R.id.camera_view;
                CameraView cameraView = (CameraView) ViewBindings.findChildViewById(view, i);
                if (cameraView != null) {
                    i = R.id.captionFace;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.captionIdentity;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.captionIdentityNumber;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                i = R.id.captionNone;
                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView4 != null) {
                                    i = R.id.capture;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = R.id.disableCameraFrame;
                                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (frameLayout != null) {
                                            i = R.id.frameFace;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView3 != null) {
                                                i = R.id.frameIdentity;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView4 != null) {
                                                    i = R.id.framePhotoGroupFace;
                                                    Group group = (Group) ViewBindings.findChildViewById(view, i);
                                                    if (group != null) {
                                                        i = R.id.framePhotoGroupIdentity;
                                                        Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                                                        if (group2 != null) {
                                                            i = R.id.guidelineHorizontal;
                                                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                                            if (guideline != null) {
                                                                i = R.id.imageView31;
                                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView5 != null) {
                                                                    i = R.id.layoutMessageInfo;
                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (constraintLayout != null) {
                                                                        i = R.id.leftFace;
                                                                        ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                        if (imageView6 != null) {
                                                                            i = R.id.leftFrameIdentity;
                                                                            ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                            if (imageView7 != null) {
                                                                                i = R.id.middleFace;
                                                                                ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                if (imageView8 != null) {
                                                                                    i = R.id.middleFrameIdentity;
                                                                                    ImageView imageView9 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                    if (imageView9 != null) {
                                                                                        i = R.id.no_permission;
                                                                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (dtacFontTextView5 != null) {
                                                                                            i = R.id.rightFace;
                                                                                            ImageView imageView10 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                            if (imageView10 != null) {
                                                                                                i = R.id.rightFrameIdentity;
                                                                                                ImageView imageView11 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                if (imageView11 != null) {
                                                                                                    i = R.id.topFace;
                                                                                                    ImageView imageView12 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (imageView12 != null) {
                                                                                                        i = R.id.topFrameIdentity;
                                                                                                        ImageView imageView13 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (imageView13 != null) {
                                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) view;
                                                                                                            i = R.id.tvMessageInfo;
                                                                                                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (dtacFontTextView6 != null) {
                                                                                                                i = R.id.viewFrameTakePhoto;
                                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                                                if (constraintLayout3 != null) {
                                                                                                                    return new FragmentCameraViewTakephotoBinding(constraintLayout2, imageView, focusView, cameraView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, imageView2, frameLayout, imageView3, imageView4, group, group2, guideline, imageView5, constraintLayout, imageView6, imageView7, imageView8, imageView9, dtacFontTextView5, imageView10, imageView11, imageView12, imageView13, constraintLayout2, dtacFontTextView6, constraintLayout3);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentCameraViewTakephotoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentCameraViewTakephotoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_camera_view_takephoto, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83659a;
    }
}
