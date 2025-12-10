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
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeReadIdCardBinding */
/* loaded from: classes7.dex */
public final class OneIncludeReadIdCardBinding implements ViewBinding {

    /* renamed from: a */
    public final PercentRelativeLayout f84482a;
    @NonNull
    public final FrameLayout btnOpenCamera;
    @NonNull
    public final OneFontButton btnSwitchMode;
    @NonNull
    public final ImageView ivSmartCard;
    @NonNull
    public final OneFontButton tvCameraMode;
    @NonNull
    public final OneFontTextView tvWarning;

    public OneIncludeReadIdCardBinding(PercentRelativeLayout percentRelativeLayout, FrameLayout frameLayout, OneFontButton oneFontButton, ImageView imageView, OneFontButton oneFontButton2, OneFontTextView oneFontTextView) {
        this.f84482a = percentRelativeLayout;
        this.btnOpenCamera = frameLayout;
        this.btnSwitchMode = oneFontButton;
        this.ivSmartCard = imageView;
        this.tvCameraMode = oneFontButton2;
        this.tvWarning = oneFontTextView;
    }

    @NonNull
    public static OneIncludeReadIdCardBinding bind(@NonNull View view) {
        int i = R.id.btnOpenCamera;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.btnSwitchMode;
            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton != null) {
                i = R.id.ivSmartCard;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.tvCameraMode;
                    OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                    if (oneFontButton2 != null) {
                        i = R.id.tvWarning;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            return new OneIncludeReadIdCardBinding((PercentRelativeLayout) view, frameLayout, oneFontButton, imageView, oneFontButton2, oneFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeReadIdCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeReadIdCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_read_id_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public PercentRelativeLayout getRoot() {
        return this.f84482a;
    }
}
