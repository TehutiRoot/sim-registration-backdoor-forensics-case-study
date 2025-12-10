package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZPostpaidNiceNumberBarBinding */
/* loaded from: classes7.dex */
public final class ZPostpaidNiceNumberBarBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84793a;
    @NonNull
    public final ConstraintLayout barNicenumber;
    @NonNull
    public final DtacFontTextView minPriceValue1;

    public ZPostpaidNiceNumberBarBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView) {
        this.f84793a = constraintLayout;
        this.barNicenumber = constraintLayout2;
        this.minPriceValue1 = dtacFontTextView;
    }

    @NonNull
    public static ZPostpaidNiceNumberBarBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.min_price_value1;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new ZPostpaidNiceNumberBarBinding(constraintLayout, constraintLayout, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZPostpaidNiceNumberBarBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZPostpaidNiceNumberBarBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_postpaid_nice_number_bar, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84793a;
    }
}