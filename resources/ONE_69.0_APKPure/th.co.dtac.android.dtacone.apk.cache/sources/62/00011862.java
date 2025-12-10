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

/* renamed from: th.co.dtac.android.dtacone.databinding.OnePre2postPackageMessageItemBinding */
/* loaded from: classes7.dex */
public final class OnePre2postPackageMessageItemBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84625a;
    @NonNull
    public final DtacCardView cardView;
    @NonNull
    public final OneFontTextView tvPackageMessage;

    public OnePre2postPackageMessageItemBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, OneFontTextView oneFontTextView) {
        this.f84625a = dtacCardView;
        this.cardView = dtacCardView2;
        this.tvPackageMessage = oneFontTextView;
    }

    @NonNull
    public static OnePre2postPackageMessageItemBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.tvPackageMessage;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            return new OnePre2postPackageMessageItemBinding(dtacCardView, dtacCardView, oneFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OnePre2postPackageMessageItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OnePre2postPackageMessageItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_pre2post_package_message_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84625a;
    }
}