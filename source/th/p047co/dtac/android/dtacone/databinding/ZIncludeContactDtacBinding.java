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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeContactDtacBinding */
/* loaded from: classes7.dex */
public final class ZIncludeContactDtacBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84619a;
    @NonNull
    public final LinearLayout contactDtac;
    @NonNull
    public final LinearLayout firstPageLlTextHelper;

    public ZIncludeContactDtacBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f84619a = linearLayout;
        this.contactDtac = linearLayout2;
        this.firstPageLlTextHelper = linearLayout3;
    }

    @NonNull
    public static ZIncludeContactDtacBinding bind(@NonNull View view) {
        int i = R.id.contact_dtac;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            LinearLayout linearLayout2 = (LinearLayout) view;
            return new ZIncludeContactDtacBinding(linearLayout2, linearLayout, linearLayout2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeContactDtacBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeContactDtacBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_contact_dtac, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84619a;
    }
}
