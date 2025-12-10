package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZTutorialLaserIdDialogBinding */
/* loaded from: classes7.dex */
public final class ZTutorialLaserIdDialogBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84819a;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final ImageView imageView;
    @NonNull
    public final DtacFontTextView tvTutorialMessage;

    public ZTutorialLaserIdDialogBinding(RelativeLayout relativeLayout, DtacFontButton dtacFontButton, ImageView imageView, DtacFontTextView dtacFontTextView) {
        this.f84819a = relativeLayout;
        this.btnOk = dtacFontButton;
        this.imageView = imageView;
        this.tvTutorialMessage = dtacFontTextView;
    }

    @NonNull
    public static ZTutorialLaserIdDialogBinding bind(@NonNull View view) {
        int i = R.id.btnOk;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.imageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvTutorialMessage;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new ZTutorialLaserIdDialogBinding((RelativeLayout) view, dtacFontButton, imageView, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZTutorialLaserIdDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZTutorialLaserIdDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_tutorial_laser_id_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84819a;
    }
}