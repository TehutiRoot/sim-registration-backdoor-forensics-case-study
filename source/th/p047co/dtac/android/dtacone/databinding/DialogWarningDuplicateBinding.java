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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogWarningDuplicateBinding */
/* loaded from: classes7.dex */
public final class DialogWarningDuplicateBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83638a;
    @NonNull
    public final DtacFontTextView alertMessage;
    @NonNull
    public final DtacFontButton btnCancel;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final DtacFontTextView tvErrorCode;
    @NonNull
    public final DtacFontTextView tvErrorUser;
    @NonNull
    public final DtacFontTextView tvTimestamp;

    public DialogWarningDuplicateBinding(RelativeLayout relativeLayout, DtacFontTextView dtacFontTextView, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f83638a = relativeLayout;
        this.alertMessage = dtacFontTextView;
        this.btnCancel = dtacFontButton;
        this.btnOk = dtacFontButton2;
        this.tvErrorCode = dtacFontTextView2;
        this.tvErrorUser = dtacFontTextView3;
        this.tvTimestamp = dtacFontTextView4;
    }

    @NonNull
    public static DialogWarningDuplicateBinding bind(@NonNull View view) {
        int i = R.id.alert_message;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.btnCancel;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.btnOk;
                DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton2 != null) {
                    i = R.id.tvErrorCode;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.tvErrorUser;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.tvTimestamp;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                return new DialogWarningDuplicateBinding((RelativeLayout) view, dtacFontTextView, dtacFontButton, dtacFontButton2, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogWarningDuplicateBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogWarningDuplicateBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_warning_duplicate, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83638a;
    }
}
