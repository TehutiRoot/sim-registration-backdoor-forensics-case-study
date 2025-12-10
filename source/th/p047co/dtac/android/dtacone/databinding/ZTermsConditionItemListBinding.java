package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZTermsConditionItemListBinding */
/* loaded from: classes7.dex */
public final class ZTermsConditionItemListBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84702a;
    @NonNull
    public final DtacFontTextView tvTermsCondition;

    public ZTermsConditionItemListBinding(CardView cardView, DtacFontTextView dtacFontTextView) {
        this.f84702a = cardView;
        this.tvTermsCondition = dtacFontTextView;
    }

    @NonNull
    public static ZTermsConditionItemListBinding bind(@NonNull View view) {
        int i = R.id.tvTermsCondition;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new ZTermsConditionItemListBinding((CardView) view, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZTermsConditionItemListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZTermsConditionItemListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_terms_condition_item_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84702a;
    }
}
