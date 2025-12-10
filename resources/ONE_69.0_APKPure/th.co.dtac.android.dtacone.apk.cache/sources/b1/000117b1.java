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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneAnyListBinding */
/* loaded from: classes7.dex */
public final class ItemOneAnyListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84448a;
    @NonNull
    public final OneFontTextView tvWarningMessage;

    public ItemOneAnyListBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView) {
        this.f84448a = constraintLayout;
        this.tvWarningMessage = oneFontTextView;
    }

    @NonNull
    public static ItemOneAnyListBinding bind(@NonNull View view) {
        int i = R.id.tvWarningMessage;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            return new ItemOneAnyListBinding((ConstraintLayout) view, oneFontTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneAnyListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneAnyListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_any_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84448a;
    }
}