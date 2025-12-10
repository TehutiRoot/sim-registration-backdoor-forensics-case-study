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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZButtonOkBinding */
/* loaded from: classes7.dex */
public final class ZButtonOkBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84701a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final LinearLayout lnlContainerButtonOkCancel;

    public ZButtonOkBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, LinearLayout linearLayout2) {
        this.f84701a = linearLayout;
        this.btnConfirm = dtacFontButton;
        this.lnlContainerButtonOkCancel = linearLayout2;
    }

    @NonNull
    public static ZButtonOkBinding bind(@NonNull View view) {
        int i = R.id.btn_confirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            return new ZButtonOkBinding(linearLayout, dtacFontButton, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZButtonOkBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZButtonOkBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_button_ok, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84701a;
    }
}