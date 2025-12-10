package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.cameraview.CameraView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTouchView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneCameraPureBinding */
/* loaded from: classes7.dex */
public final class IncludeOneCameraPureBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84258a;
    @NonNull
    public final DtacFontButton btnTakePhoto;
    @NonNull
    public final CameraView cameraView;
    @NonNull
    public final DtacFontTextView cameraViewTitle;
    @NonNull
    public final RelativeLayout circleTakePhoto;
    @NonNull
    public final DtacTouchView viewFocus;

    public IncludeOneCameraPureBinding(FrameLayout frameLayout, DtacFontButton dtacFontButton, CameraView cameraView, DtacFontTextView dtacFontTextView, RelativeLayout relativeLayout, DtacTouchView dtacTouchView) {
        this.f84258a = frameLayout;
        this.btnTakePhoto = dtacFontButton;
        this.cameraView = cameraView;
        this.cameraViewTitle = dtacFontTextView;
        this.circleTakePhoto = relativeLayout;
        this.viewFocus = dtacTouchView;
    }

    @NonNull
    public static IncludeOneCameraPureBinding bind(@NonNull View view) {
        int i = R.id.btnTakePhoto;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.cameraView;
            CameraView cameraView = (CameraView) ViewBindings.findChildViewById(view, i);
            if (cameraView != null) {
                i = R.id.camera_view_title;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.circleTakePhoto;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.viewFocus;
                        DtacTouchView dtacTouchView = (DtacTouchView) ViewBindings.findChildViewById(view, i);
                        if (dtacTouchView != null) {
                            return new IncludeOneCameraPureBinding((FrameLayout) view, dtacFontButton, cameraView, dtacFontTextView, relativeLayout, dtacTouchView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeOneCameraPureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneCameraPureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_camera_pure, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84258a;
    }
}
