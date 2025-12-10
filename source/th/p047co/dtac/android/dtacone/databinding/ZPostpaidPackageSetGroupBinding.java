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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZPostpaidPackageSetGroupBinding */
/* loaded from: classes7.dex */
public final class ZPostpaidPackageSetGroupBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84687a;
    @NonNull
    public final CardView cvPackageList;
    @NonNull
    public final DtacFontTextView tvPackageSetGroup;

    public ZPostpaidPackageSetGroupBinding(CardView cardView, CardView cardView2, DtacFontTextView dtacFontTextView) {
        this.f84687a = cardView;
        this.cvPackageList = cardView2;
        this.tvPackageSetGroup = dtacFontTextView;
    }

    @NonNull
    public static ZPostpaidPackageSetGroupBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i = R.id.tv_package_set_group;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            return new ZPostpaidPackageSetGroupBinding(cardView, cardView, dtacFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZPostpaidPackageSetGroupBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZPostpaidPackageSetGroupBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_postpaid_package_set_group, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84687a;
    }
}
