package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogOneDeviceSaleOneIdOneDeviceBinding */
/* loaded from: classes7.dex */
public final class DialogOneDeviceSaleOneIdOneDeviceBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83728a;
    @NonNull
    public final OneFontButton btnCancel;
    @NonNull
    public final OneFontButton btnOk;
    @NonNull
    public final OneFontTextView tvAlertMessage;
    @NonNull
    public final OneFontTextView tvAlertMessageAllow;
    @NonNull
    public final OneFontTextView tvAlertMessageIdDevice;
    @NonNull
    public final OneFontTextView tvErrorUser;
    @NonNull
    public final OneFontTextView tvTimestamp;

    public DialogOneDeviceSaleOneIdOneDeviceBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5) {
        this.f83728a = constraintLayout;
        this.btnCancel = oneFontButton;
        this.btnOk = oneFontButton2;
        this.tvAlertMessage = oneFontTextView;
        this.tvAlertMessageAllow = oneFontTextView2;
        this.tvAlertMessageIdDevice = oneFontTextView3;
        this.tvErrorUser = oneFontTextView4;
        this.tvTimestamp = oneFontTextView5;
    }

    @NonNull
    public static DialogOneDeviceSaleOneIdOneDeviceBinding bind(@NonNull View view) {
        int i = R.id.btnCancel;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btnOk;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.tvAlertMessage;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.tvAlertMessageAllow;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.tvAlertMessageIdDevice;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            i = R.id.tvErrorUser;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                i = R.id.tvTimestamp;
                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView5 != null) {
                                    return new DialogOneDeviceSaleOneIdOneDeviceBinding((ConstraintLayout) view, oneFontButton, oneFontButton2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5);
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
    public static DialogOneDeviceSaleOneIdOneDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogOneDeviceSaleOneIdOneDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_one_device_sale_one_id_one_device, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83728a;
    }
}