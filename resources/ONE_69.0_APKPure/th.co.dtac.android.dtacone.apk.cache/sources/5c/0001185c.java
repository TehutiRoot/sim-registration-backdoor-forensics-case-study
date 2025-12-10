package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OnePostpaidPackageMessageItemBinding */
/* loaded from: classes7.dex */
public final class OnePostpaidPackageMessageItemBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84619a;
    @NonNull
    public final DtacCardView cardView;
    @NonNull
    public final OneFontTextView tvPackageMessage;

    public OnePostpaidPackageMessageItemBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, OneFontTextView oneFontTextView) {
        this.f84619a = dtacCardView;
        this.cardView = dtacCardView2;
        this.tvPackageMessage = oneFontTextView;
    }

    @NonNull
    public static OnePostpaidPackageMessageItemBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.tvPackageMessage;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            return new OnePostpaidPackageMessageItemBinding(dtacCardView, dtacCardView, oneFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnePostpaidPackageMessageItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnePostpaidPackageMessageItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_postpaid_package_message_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84619a;
    }
}