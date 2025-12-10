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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemBankImageBinding */
/* loaded from: classes7.dex */
public final class ItemBankImageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84408a;
    @NonNull
    public final ImageView ivBank;
    @NonNull
    public final ConstraintLayout layoutBank;

    public ItemBankImageBinding(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2) {
        this.f84408a = constraintLayout;
        this.ivBank = imageView;
        this.layoutBank = constraintLayout2;
    }

    @NonNull
    public static ItemBankImageBinding bind(@NonNull View view) {
        int i = R.id.ivBank;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new ItemBankImageBinding(constraintLayout, imageView, constraintLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemBankImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemBankImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_bank_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84408a;
    }
}