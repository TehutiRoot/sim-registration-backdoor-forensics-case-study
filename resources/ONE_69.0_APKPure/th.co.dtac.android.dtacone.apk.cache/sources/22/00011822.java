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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogWarningDuplicateBinding */
/* loaded from: classes7.dex */
public final class OneDialogWarningDuplicateBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84561a;
    @NonNull
    public final OneFontTextView alertMessage;
    @NonNull
    public final OneFontButton btnCancel;
    @NonNull
    public final OneFontButton btnOk;
    @NonNull
    public final OneFontTextView tvErrorCode;
    @NonNull
    public final OneFontTextView tvErrorUser;
    @NonNull
    public final OneFontTextView tvTimestamp;

    public OneDialogWarningDuplicateBinding(RelativeLayout relativeLayout, OneFontTextView oneFontTextView, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f84561a = relativeLayout;
        this.alertMessage = oneFontTextView;
        this.btnCancel = oneFontButton;
        this.btnOk = oneFontButton2;
        this.tvErrorCode = oneFontTextView2;
        this.tvErrorUser = oneFontTextView3;
        this.tvTimestamp = oneFontTextView4;
    }

    @NonNull
    public static OneDialogWarningDuplicateBinding bind(@NonNull View view) {
        int i = R.id.alert_message;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.btnCancel;
            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton != null) {
                i = R.id.btnOk;
                OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton2 != null) {
                    i = R.id.tvErrorCode;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.tvErrorUser;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            i = R.id.tvTimestamp;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                return new OneDialogWarningDuplicateBinding((RelativeLayout) view, oneFontTextView, oneFontButton, oneFontButton2, oneFontTextView2, oneFontTextView3, oneFontTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneDialogWarningDuplicateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogWarningDuplicateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_warning_duplicate, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84561a;
    }
}