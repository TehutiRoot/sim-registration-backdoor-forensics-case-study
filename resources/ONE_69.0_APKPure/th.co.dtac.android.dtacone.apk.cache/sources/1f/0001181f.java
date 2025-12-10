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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogSelectSellerConfirmBinding */
/* loaded from: classes7.dex */
public final class OneDialogSelectSellerConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84558a;
    @NonNull
    public final OneFontTextView tvTitleName;

    public OneDialogSelectSellerConfirmBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView) {
        this.f84558a = constraintLayout;
        this.tvTitleName = oneFontTextView;
    }

    @NonNull
    public static OneDialogSelectSellerConfirmBinding bind(@NonNull View view) {
        int i = R.id.tvTitleName;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            return new OneDialogSelectSellerConfirmBinding((ConstraintLayout) view, oneFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneDialogSelectSellerConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogSelectSellerConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_select_seller_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84558a;
    }
}