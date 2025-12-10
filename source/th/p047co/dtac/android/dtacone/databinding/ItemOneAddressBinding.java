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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneAddressBinding */
/* loaded from: classes7.dex */
public final class ItemOneAddressBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84340a;
    @NonNull
    public final ConstraintLayout oneAddressItem;
    @NonNull
    public final OneFontTextView oneAddressItemTextView;

    public ItemOneAddressBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView) {
        this.f84340a = constraintLayout;
        this.oneAddressItem = constraintLayout2;
        this.oneAddressItemTextView = oneFontTextView;
    }

    @NonNull
    public static ItemOneAddressBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.oneAddressItemTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            return new ItemOneAddressBinding(constraintLayout, constraintLayout, oneFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneAddressBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneAddressBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_address, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84340a;
    }
}
