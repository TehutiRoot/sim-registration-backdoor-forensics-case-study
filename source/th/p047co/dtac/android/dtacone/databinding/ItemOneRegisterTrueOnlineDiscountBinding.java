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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneRegisterTrueOnlineDiscountBinding */
/* loaded from: classes7.dex */
public final class ItemOneRegisterTrueOnlineDiscountBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84363a;
    @NonNull
    public final ImageView imageView45;
    @NonNull
    public final OneFontTextView tvItem;

    public ItemOneRegisterTrueOnlineDiscountBinding(ConstraintLayout constraintLayout, ImageView imageView, OneFontTextView oneFontTextView) {
        this.f84363a = constraintLayout;
        this.imageView45 = imageView;
        this.tvItem = oneFontTextView;
    }

    @NonNull
    public static ItemOneRegisterTrueOnlineDiscountBinding bind(@NonNull View view) {
        int i = R.id.imageView45;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tvItem;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                return new ItemOneRegisterTrueOnlineDiscountBinding((ConstraintLayout) view, imageView, oneFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneRegisterTrueOnlineDiscountBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneRegisterTrueOnlineDiscountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_register_true_online_discount, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84363a;
    }
}
