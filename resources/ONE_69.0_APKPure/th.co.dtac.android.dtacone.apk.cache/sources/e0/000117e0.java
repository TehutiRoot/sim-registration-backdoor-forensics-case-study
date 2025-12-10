package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemPostpaidReservedNumberBinding */
/* loaded from: classes7.dex */
public final class ItemPostpaidReservedNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84495a;
    @NonNull
    public final ImageView arrow;
    @NonNull
    public final View bottomBorder;
    @NonNull
    public final ConstraintLayout reserveNumberLayout;
    @NonNull
    public final OneFontTextView reserveNumberTextView;

    public ItemPostpaidReservedNumberBinding(ConstraintLayout constraintLayout, ImageView imageView, View view, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView) {
        this.f84495a = constraintLayout;
        this.arrow = imageView;
        this.bottomBorder = view;
        this.reserveNumberLayout = constraintLayout2;
        this.reserveNumberTextView = oneFontTextView;
    }

    @NonNull
    public static ItemPostpaidReservedNumberBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.bottomBorder))) != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.reserveNumberTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                return new ItemPostpaidReservedNumberBinding(constraintLayout, imageView, findChildViewById, constraintLayout, oneFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemPostpaidReservedNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemPostpaidReservedNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_postpaid_reserved_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84495a;
    }
}