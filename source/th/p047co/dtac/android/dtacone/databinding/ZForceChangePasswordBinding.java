package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZForceChangePasswordBinding */
/* loaded from: classes7.dex */
public final class ZForceChangePasswordBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84605a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final AdjustableImageView ivForceChangePassword;

    public ZForceChangePasswordBinding(RelativeLayout relativeLayout, DtacFontButton dtacFontButton, AdjustableImageView adjustableImageView) {
        this.f84605a = relativeLayout;
        this.btnConfirm = dtacFontButton;
        this.ivForceChangePassword = adjustableImageView;
    }

    @NonNull
    public static ZForceChangePasswordBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.ivForceChangePassword;
            AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
            if (adjustableImageView != null) {
                return new ZForceChangePasswordBinding((RelativeLayout) view, dtacFontButton, adjustableImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZForceChangePasswordBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZForceChangePasswordBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_force_change_password, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84605a;
    }
}
