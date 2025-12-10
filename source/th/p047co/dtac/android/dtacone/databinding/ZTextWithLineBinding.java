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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZTextWithLineBinding */
/* loaded from: classes7.dex */
public final class ZTextWithLineBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84704a;
    @NonNull
    public final DtacFontTextView tvOtherPrice;

    public ZTextWithLineBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView) {
        this.f84704a = linearLayout;
        this.tvOtherPrice = dtacFontTextView;
    }

    @NonNull
    public static ZTextWithLineBinding bind(@NonNull View view) {
        int i = R.id.tvOtherPrice;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new ZTextWithLineBinding((LinearLayout) view, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZTextWithLineBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZTextWithLineBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_text_with_line, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84704a;
    }
}
