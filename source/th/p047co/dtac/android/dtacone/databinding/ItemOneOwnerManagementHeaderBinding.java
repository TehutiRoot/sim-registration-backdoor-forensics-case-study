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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneOwnerManagementHeaderBinding */
/* loaded from: classes7.dex */
public final class ItemOneOwnerManagementHeaderBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84359a;
    @NonNull
    public final OneFontTextView ownerTransactionHeaderTextView;

    public ItemOneOwnerManagementHeaderBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView) {
        this.f84359a = constraintLayout;
        this.ownerTransactionHeaderTextView = oneFontTextView;
    }

    @NonNull
    public static ItemOneOwnerManagementHeaderBinding bind(@NonNull View view) {
        int i = R.id.ownerTransactionHeaderTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            return new ItemOneOwnerManagementHeaderBinding((ConstraintLayout) view, oneFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneOwnerManagementHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneOwnerManagementHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_owner_management_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84359a;
    }
}
