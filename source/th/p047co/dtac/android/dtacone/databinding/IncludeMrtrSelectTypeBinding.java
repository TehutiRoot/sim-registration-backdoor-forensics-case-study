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

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeMrtrSelectTypeBinding */
/* loaded from: classes7.dex */
public final class IncludeMrtrSelectTypeBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84252a;
    @NonNull
    public final DtacFontButton btnNormalRegistration;
    @NonNull
    public final DtacFontButton btnWithDevice;

    public IncludeMrtrSelectTypeBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2) {
        this.f84252a = linearLayout;
        this.btnNormalRegistration = dtacFontButton;
        this.btnWithDevice = dtacFontButton2;
    }

    @NonNull
    public static IncludeMrtrSelectTypeBinding bind(@NonNull View view) {
        int i = R.id.btnNormalRegistration;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.btnWithDevice;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                return new IncludeMrtrSelectTypeBinding((LinearLayout) view, dtacFontButton, dtacFontButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeMrtrSelectTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeMrtrSelectTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_mrtr_select_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84252a;
    }
}
