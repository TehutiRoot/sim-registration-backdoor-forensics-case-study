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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneVerifyPasswordDialogBinding */
/* loaded from: classes7.dex */
public final class OneVerifyPasswordDialogBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84543a;
    @NonNull
    public final DtacClearableEditText edtPassword;
    @NonNull
    public final OneButtonOkCancelBinding incButtonOkCancel;
    @NonNull
    public final OneFontTextView tvErrorCode;
    @NonNull
    public final OneFontTextView tvErrorMessage;
    @NonNull
    public final OneFontTextView tvKycMessage;

    public OneVerifyPasswordDialogBinding(RelativeLayout relativeLayout, DtacClearableEditText dtacClearableEditText, OneButtonOkCancelBinding oneButtonOkCancelBinding, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84543a = relativeLayout;
        this.edtPassword = dtacClearableEditText;
        this.incButtonOkCancel = oneButtonOkCancelBinding;
        this.tvErrorCode = oneFontTextView;
        this.tvErrorMessage = oneFontTextView2;
        this.tvKycMessage = oneFontTextView3;
    }

    @NonNull
    public static OneVerifyPasswordDialogBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.edtPassword;
        DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
        if (dtacClearableEditText != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incButtonOkCancel))) != null) {
            OneButtonOkCancelBinding bind = OneButtonOkCancelBinding.bind(findChildViewById);
            i = R.id.tvErrorCode;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.tvErrorMessage;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.tvKycMessage;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        return new OneVerifyPasswordDialogBinding((RelativeLayout) view, dtacClearableEditText, bind, oneFontTextView, oneFontTextView2, oneFontTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneVerifyPasswordDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneVerifyPasswordDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_verify_password_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84543a;
    }
}
