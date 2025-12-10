package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.percentlayout.widget.PercentRelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZSubmitPrepaidReadySimBinding */
/* loaded from: classes7.dex */
public final class ZSubmitPrepaidReadySimBinding implements ViewBinding {

    /* renamed from: a */
    public final PercentRelativeLayout f84700a;
    @NonNull
    public final DtacFontButton btnCancel;
    @NonNull
    public final DtacFontButton btnRegisterOnly;
    @NonNull
    public final DtacFontButton btnRegisterWithActivate;

    public ZSubmitPrepaidReadySimBinding(PercentRelativeLayout percentRelativeLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontButton dtacFontButton3) {
        this.f84700a = percentRelativeLayout;
        this.btnCancel = dtacFontButton;
        this.btnRegisterOnly = dtacFontButton2;
        this.btnRegisterWithActivate = dtacFontButton3;
    }

    @NonNull
    public static ZSubmitPrepaidReadySimBinding bind(@NonNull View view) {
        int i = R.id.btnCancel;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.btnRegisterOnly;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.btnRegisterWithActivate;
                DtacFontButton dtacFontButton3 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton3 != null) {
                    return new ZSubmitPrepaidReadySimBinding((PercentRelativeLayout) view, dtacFontButton, dtacFontButton2, dtacFontButton3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZSubmitPrepaidReadySimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZSubmitPrepaidReadySimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_submit_prepaid_ready_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public PercentRelativeLayout getRoot() {
        return this.f84700a;
    }
}
