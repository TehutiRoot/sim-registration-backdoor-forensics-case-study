package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.MrtrDialogAlertConfirmBinding */
/* loaded from: classes7.dex */
public final class MrtrDialogAlertConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84525a;
    @NonNull
    public final AppCompatImageView alertIcon;
    @NonNull
    public final FrameLayout alertIconExit;
    @NonNull
    public final DtacFontTextView alertMessage;
    @NonNull
    public final DtacFontTextView alertSubMessage;
    @NonNull
    public final DtacFontTextView alertTitle;
    @NonNull
    public final DtacFontButton btnCancel;
    @NonNull
    public final DtacFontButton btnOk;

    public MrtrDialogAlertConfirmBinding(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2) {
        this.f84525a = relativeLayout;
        this.alertIcon = appCompatImageView;
        this.alertIconExit = frameLayout;
        this.alertMessage = dtacFontTextView;
        this.alertSubMessage = dtacFontTextView2;
        this.alertTitle = dtacFontTextView3;
        this.btnCancel = dtacFontButton;
        this.btnOk = dtacFontButton2;
    }

    @NonNull
    public static MrtrDialogAlertConfirmBinding bind(@NonNull View view) {
        int i = R.id.alert_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.alert_icon_exit;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.alert_message;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.alert_sub_message;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.alert_title;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.btnCancel;
                            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                            if (dtacFontButton != null) {
                                i = R.id.btnOk;
                                DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                                if (dtacFontButton2 != null) {
                                    return new MrtrDialogAlertConfirmBinding((RelativeLayout) view, appCompatImageView, frameLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontButton, dtacFontButton2);
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
    public static MrtrDialogAlertConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static MrtrDialogAlertConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.mrtr_dialog_alert_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84525a;
    }
}