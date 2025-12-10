package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZSimRItemRowBinding */
/* loaded from: classes7.dex */
public final class ZSimRItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84696a;
    @NonNull
    public final DtacCardView cardviewSimR;
    @NonNull
    public final DtacFontTextView registerTvSimR;

    public ZSimRItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, DtacFontTextView dtacFontTextView) {
        this.f84696a = dtacCardView;
        this.cardviewSimR = dtacCardView2;
        this.registerTvSimR = dtacFontTextView;
    }

    @NonNull
    public static ZSimRItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.register_tv_sim_r;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new ZSimRItemRowBinding(dtacCardView, dtacCardView, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZSimRItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZSimRItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_sim_r_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84696a;
    }
}
