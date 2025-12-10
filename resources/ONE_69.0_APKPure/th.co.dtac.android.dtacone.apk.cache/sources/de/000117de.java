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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemPhoneNumberBinding */
/* loaded from: classes7.dex */
public final class ItemPhoneNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84493a;
    @NonNull
    public final ConstraintLayout content;
    @NonNull
    public final OneFontTextView tvNumber;

    public ItemPhoneNumberBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView) {
        this.f84493a = constraintLayout;
        this.content = constraintLayout2;
        this.tvNumber = oneFontTextView;
    }

    @NonNull
    public static ItemPhoneNumberBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.tvNumber;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            return new ItemPhoneNumberBinding(constraintLayout, constraintLayout, oneFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemPhoneNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemPhoneNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_phone_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84493a;
    }
}