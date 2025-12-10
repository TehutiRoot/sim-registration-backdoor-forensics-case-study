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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemHeaderServiceBinding */
/* loaded from: classes7.dex */
public final class ItemHeaderServiceBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84423a;
    @NonNull
    public final DtacFontTextView tvGroupServiceTitle;

    public ItemHeaderServiceBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView) {
        this.f84423a = linearLayout;
        this.tvGroupServiceTitle = dtacFontTextView;
    }

    @NonNull
    public static ItemHeaderServiceBinding bind(@NonNull View view) {
        int i = R.id.tvGroupServiceTitle;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new ItemHeaderServiceBinding((LinearLayout) view, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemHeaderServiceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemHeaderServiceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_header_service, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84423a;
    }
}