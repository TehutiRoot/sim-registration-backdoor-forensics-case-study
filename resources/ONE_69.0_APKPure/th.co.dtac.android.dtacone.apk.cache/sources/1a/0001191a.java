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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZSubmitPrepaidPullModeBinding */
/* loaded from: classes7.dex */
public final class ZSubmitPrepaidPullModeBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84809a;
    @NonNull
    public final DtacFontButton btnCancel;
    @NonNull
    public final DtacFontButton btnRegisterWithActivate;

    public ZSubmitPrepaidPullModeBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2) {
        this.f84809a = linearLayout;
        this.btnCancel = dtacFontButton;
        this.btnRegisterWithActivate = dtacFontButton2;
    }

    @NonNull
    public static ZSubmitPrepaidPullModeBinding bind(@NonNull View view) {
        int i = R.id.btnCancel;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.btnRegisterWithActivate;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                return new ZSubmitPrepaidPullModeBinding((LinearLayout) view, dtacFontButton, dtacFontButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZSubmitPrepaidPullModeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZSubmitPrepaidPullModeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_submit_prepaid_pull_mode, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84809a;
    }
}