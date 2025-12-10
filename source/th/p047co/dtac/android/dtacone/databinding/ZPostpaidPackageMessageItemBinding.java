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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZPostpaidPackageMessageItemBinding */
/* loaded from: classes7.dex */
public final class ZPostpaidPackageMessageItemBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84685a;
    @NonNull
    public final DtacCardView cardView;
    @NonNull
    public final DtacFontTextView tvPackageMessage;

    public ZPostpaidPackageMessageItemBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, DtacFontTextView dtacFontTextView) {
        this.f84685a = dtacCardView;
        this.cardView = dtacCardView2;
        this.tvPackageMessage = dtacFontTextView;
    }

    @NonNull
    public static ZPostpaidPackageMessageItemBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.tvPackageMessage;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new ZPostpaidPackageMessageItemBinding(dtacCardView, dtacCardView, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZPostpaidPackageMessageItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZPostpaidPackageMessageItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_postpaid_package_message_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84685a;
    }
}
