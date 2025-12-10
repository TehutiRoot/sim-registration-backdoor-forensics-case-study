package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZButtonConfirmCancelBinding */
/* loaded from: classes7.dex */
public final class ZButtonConfirmCancelBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84590a;
    @NonNull
    public final DtacFontButton btnCancel;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final LinearLayout lnlContainerButtonOkCancel;

    public ZButtonConfirmCancelBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, LinearLayout linearLayout2) {
        this.f84590a = linearLayout;
        this.btnCancel = dtacFontButton;
        this.btnConfirm = dtacFontButton2;
        this.lnlContainerButtonOkCancel = linearLayout2;
    }

    @NonNull
    public static ZButtonConfirmCancelBinding bind(@NonNull View view) {
        int i = R.id.btn_cancel;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.btn_confirm;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new ZButtonConfirmCancelBinding(linearLayout, dtacFontButton, dtacFontButton2, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZButtonConfirmCancelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZButtonConfirmCancelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_button_confirm_cancel, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84590a;
    }
}
