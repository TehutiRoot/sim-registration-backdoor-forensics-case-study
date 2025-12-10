package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneBankBinding */
/* loaded from: classes7.dex */
public final class ItemOneBankBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84343a;
    @NonNull
    public final AppCompatImageView arrowImageView;
    @NonNull
    public final AppCompatImageView bankBrandImageView;
    @NonNull
    public final ConstraintLayout bankItem;
    @NonNull
    public final OneFontTextView bankNameTextView;

    public ItemOneBankBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView) {
        this.f84343a = constraintLayout;
        this.arrowImageView = appCompatImageView;
        this.bankBrandImageView = appCompatImageView2;
        this.bankItem = constraintLayout2;
        this.bankNameTextView = oneFontTextView;
    }

    @NonNull
    public static ItemOneBankBinding bind(@NonNull View view) {
        int i = R.id.arrowImageView;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.bankBrandImageView;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.bankNameTextView;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new ItemOneBankBinding(constraintLayout, appCompatImageView, appCompatImageView2, constraintLayout, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneBankBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneBankBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_bank, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84343a;
    }
}
