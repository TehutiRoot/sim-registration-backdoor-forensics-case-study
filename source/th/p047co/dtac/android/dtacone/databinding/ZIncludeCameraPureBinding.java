package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.cameraview.CameraView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacTouchView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeCameraPureBinding */
/* loaded from: classes7.dex */
public final class ZIncludeCameraPureBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84617a;
    @NonNull
    public final DtacFontButton btnTakePhoto;
    @NonNull
    public final DtacFontTextView cameraViewTitle;
    @NonNull
    public final CameraView cameraview;
    @NonNull
    public final RelativeLayout circleTakePhoto;
    @NonNull
    public final DtacTouchView viewFocus;

    public ZIncludeCameraPureBinding(View view, DtacFontButton dtacFontButton, DtacFontTextView dtacFontTextView, CameraView cameraView, RelativeLayout relativeLayout, DtacTouchView dtacTouchView) {
        this.f84617a = view;
        this.btnTakePhoto = dtacFontButton;
        this.cameraViewTitle = dtacFontTextView;
        this.cameraview = cameraView;
        this.circleTakePhoto = relativeLayout;
        this.viewFocus = dtacTouchView;
    }

    @NonNull
    public static ZIncludeCameraPureBinding bind(@NonNull View view) {
        int i = R.id.btnTakePhoto;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.camera_view_title;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.cameraview;
                CameraView cameraView = (CameraView) ViewBindings.findChildViewById(view, i);
                if (cameraView != null) {
                    i = R.id.circleTakePhoto;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.viewFocus;
                        DtacTouchView dtacTouchView = (DtacTouchView) ViewBindings.findChildViewById(view, i);
                        if (dtacTouchView != null) {
                            return new ZIncludeCameraPureBinding(view, dtacFontButton, dtacFontTextView, cameraView, relativeLayout, dtacTouchView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeCameraPureBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.z_include_camera_pure, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84617a;
    }
}
