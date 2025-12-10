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
import th.p047co.dtac.android.dtacone.widget.view.DtacCheckBox;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemBundleItemBinding */
/* loaded from: classes7.dex */
public final class ItemBundleItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84306a;
    @NonNull
    public final DtacCheckBox checkBoxBundleItem;
    @NonNull
    public final DtacClearableEditText edtIMEINumber;
    @NonNull
    public final ImageView imgIMEI;

    public ItemBundleItemBinding(ConstraintLayout constraintLayout, DtacCheckBox dtacCheckBox, DtacClearableEditText dtacClearableEditText, ImageView imageView) {
        this.f84306a = constraintLayout;
        this.checkBoxBundleItem = dtacCheckBox;
        this.edtIMEINumber = dtacClearableEditText;
        this.imgIMEI = imageView;
    }

    @NonNull
    public static ItemBundleItemBinding bind(@NonNull View view) {
        int i = R.id.checkBoxBundleItem;
        DtacCheckBox dtacCheckBox = (DtacCheckBox) ViewBindings.findChildViewById(view, i);
        if (dtacCheckBox != null) {
            i = R.id.edtIMEINumber;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.imgIMEI;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    return new ItemBundleItemBinding((ConstraintLayout) view, dtacCheckBox, dtacClearableEditText, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemBundleItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemBundleItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_bundle_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84306a;
    }
}
