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
import th.p047co.dtac.android.dtacone.app_one.widget.OneRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemMultiplePhoneNumberBinding */
/* loaded from: classes7.dex */
public final class ItemMultiplePhoneNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84332a;
    @NonNull
    public final OneRadioButton radio;
    @NonNull
    public final ImageView type;

    public ItemMultiplePhoneNumberBinding(ConstraintLayout constraintLayout, OneRadioButton oneRadioButton, ImageView imageView) {
        this.f84332a = constraintLayout;
        this.radio = oneRadioButton;
        this.type = imageView;
    }

    @NonNull
    public static ItemMultiplePhoneNumberBinding bind(@NonNull View view) {
        int i = R.id.radio;
        OneRadioButton oneRadioButton = (OneRadioButton) ViewBindings.findChildViewById(view, i);
        if (oneRadioButton != null) {
            i = R.id.type;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new ItemMultiplePhoneNumberBinding((ConstraintLayout) view, oneRadioButton, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMultiplePhoneNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemMultiplePhoneNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_multiple_phone_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84332a;
    }
}
