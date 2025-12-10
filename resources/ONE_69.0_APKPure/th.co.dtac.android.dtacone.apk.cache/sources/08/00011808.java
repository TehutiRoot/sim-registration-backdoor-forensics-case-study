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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneAlertConfirmDialogBinding */
/* loaded from: classes7.dex */
public final class OneAlertConfirmDialogBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84535a;
    @NonNull
    public final AppCompatImageView alertIcon;
    @NonNull
    public final FrameLayout alertIconExit;
    @NonNull
    public final OneFontTextView alertMessage;
    @NonNull
    public final OneFontTextView alertSubMessage;
    @NonNull
    public final OneFontButton btnCancel;
    @NonNull
    public final OneFontButton btnOk;

    public OneAlertConfirmDialogBinding(RelativeLayout relativeLayout, AppCompatImageView appCompatImageView, FrameLayout frameLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontButton oneFontButton, OneFontButton oneFontButton2) {
        this.f84535a = relativeLayout;
        this.alertIcon = appCompatImageView;
        this.alertIconExit = frameLayout;
        this.alertMessage = oneFontTextView;
        this.alertSubMessage = oneFontTextView2;
        this.btnCancel = oneFontButton;
        this.btnOk = oneFontButton2;
    }

    @NonNull
    public static OneAlertConfirmDialogBinding bind(@NonNull View view) {
        int i = R.id.alert_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.alert_icon_exit;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.alert_message;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.alert_sub_message;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.btnCancel;
                        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                        if (oneFontButton != null) {
                            i = R.id.btnOk;
                            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                            if (oneFontButton2 != null) {
                                return new OneAlertConfirmDialogBinding((RelativeLayout) view, appCompatImageView, frameLayout, oneFontTextView, oneFontTextView2, oneFontButton, oneFontButton2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneAlertConfirmDialogBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneAlertConfirmDialogBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_alert_confirm_dialog, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84535a;
    }
}