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
import th.p047co.dtac.android.dtacone.app_one.widget.OneCheckBox;
import th.p047co.dtac.android.dtacone.app_one.widget.OneClearableEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneBundleItemBinding */
/* loaded from: classes7.dex */
public final class ItemOneBundleItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84451a;
    @NonNull
    public final OneCheckBox checkBoxBundleItem;
    @NonNull
    public final OneClearableEditText edtIMEINumber;
    @NonNull
    public final ImageView imgIMEI;

    public ItemOneBundleItemBinding(ConstraintLayout constraintLayout, OneCheckBox oneCheckBox, OneClearableEditText oneClearableEditText, ImageView imageView) {
        this.f84451a = constraintLayout;
        this.checkBoxBundleItem = oneCheckBox;
        this.edtIMEINumber = oneClearableEditText;
        this.imgIMEI = imageView;
    }

    @NonNull
    public static ItemOneBundleItemBinding bind(@NonNull View view) {
        int i = R.id.checkBoxBundleItem;
        OneCheckBox oneCheckBox = (OneCheckBox) ViewBindings.findChildViewById(view, i);
        if (oneCheckBox != null) {
            i = R.id.edtIMEINumber;
            OneClearableEditText oneClearableEditText = (OneClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneClearableEditText != null) {
                i = R.id.imgIMEI;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    return new ItemOneBundleItemBinding((ConstraintLayout) view, oneCheckBox, oneClearableEditText, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneBundleItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneBundleItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_bundle_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84451a;
    }
}