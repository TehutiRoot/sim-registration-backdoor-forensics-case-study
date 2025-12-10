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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OnePostpaidPackageSetGroupBinding */
/* loaded from: classes7.dex */
public final class OnePostpaidPackageSetGroupBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84511a;
    @NonNull
    public final CardView cvPackageList;
    @NonNull
    public final OneFontTextView tvPackageSetGroup;

    public OnePostpaidPackageSetGroupBinding(CardView cardView, CardView cardView2, OneFontTextView oneFontTextView) {
        this.f84511a = cardView;
        this.cvPackageList = cardView2;
        this.tvPackageSetGroup = oneFontTextView;
    }

    @NonNull
    public static OnePostpaidPackageSetGroupBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i = R.id.tv_package_set_group;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            return new OnePostpaidPackageSetGroupBinding(cardView, cardView, oneFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnePostpaidPackageSetGroupBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnePostpaidPackageSetGroupBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_postpaid_package_set_group, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84511a;
    }
}
