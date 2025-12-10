package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacLaserIdEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZVerifyPasswordKycDialogBinding */
/* loaded from: classes7.dex */
public final class ZVerifyPasswordKycDialogBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84711a;
    @NonNull
    public final DtacLaserIdEditText edtLaserId;
    @NonNull
    public final DtacClearableEditText edtPassword;
    @NonNull
    public final ZButtonOkCancelBinding incButtonOkCancel;
    @NonNull
    public final DtacFontTextView tvErrorCode;
    @NonNull
    public final DtacFontTextView tvErrorMessage;
    @NonNull
    public final DtacFontTextView tvKycMessage;

    public ZVerifyPasswordKycDialogBinding(RelativeLayout relativeLayout, DtacLaserIdEditText dtacLaserIdEditText, DtacClearableEditText dtacClearableEditText, ZButtonOkCancelBinding zButtonOkCancelBinding, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84711a = relativeLayout;
        this.edtLaserId = dtacLaserIdEditText;
        this.edtPassword = dtacClearableEditText;
        this.incButtonOkCancel = zButtonOkCancelBinding;
        this.tvErrorCode = dtacFontTextView;
        this.tvErrorMessage = dtacFontTextView2;
        this.tvKycMessage = dtacFontTextView3;
    }

    @NonNull
    public static ZVerifyPasswordKycDialogBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.edtLaserId;
        DtacLaserIdEditText dtacLaserIdEditText = (DtacLaserIdEditText) ViewBindings.findChildViewById(view, i);
        if (dtacLaserIdEditText != null) {
            i = R.id.edtPassword;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incButtonOkCancel))) != null) {
                ZButtonOkCancelBinding bind = ZButtonOkCancelBinding.bind(findChildViewById);
                i = R.id.tvErrorCode;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvErrorMessage;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.tvKycMessage;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            return new ZVerifyPasswordKycDialogBinding((RelativeLayout) view, dtacLaserIdEditText, dtacClearableEditText, bind, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZVerifyPasswordKycDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZVerifyPasswordKycDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_verify_password_kyc_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84711a;
    }
}
