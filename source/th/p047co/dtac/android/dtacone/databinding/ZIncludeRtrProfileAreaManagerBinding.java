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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeRtrProfileAreaManagerBinding */
/* loaded from: classes7.dex */
public final class ZIncludeRtrProfileAreaManagerBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84649a;
    @NonNull
    public final DtacFontTextView tvManager;
    @NonNull
    public final DtacFontTextView tvManagerLabel;

    public ZIncludeRtrProfileAreaManagerBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84649a = linearLayout;
        this.tvManager = dtacFontTextView;
        this.tvManagerLabel = dtacFontTextView2;
    }

    @NonNull
    public static ZIncludeRtrProfileAreaManagerBinding bind(@NonNull View view) {
        int i = R.id.tvManager;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvManagerLabel;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                return new ZIncludeRtrProfileAreaManagerBinding((LinearLayout) view, dtacFontTextView, dtacFontTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeRtrProfileAreaManagerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeRtrProfileAreaManagerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_rtr_profile_area_manager, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84649a;
    }
}
