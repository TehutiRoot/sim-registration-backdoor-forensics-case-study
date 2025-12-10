package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneTextInputPinBinding */
/* loaded from: classes7.dex */
public final class OneTextInputPinBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84645a;
    @NonNull
    public final OneCustomClearableEditText edtConfirmPin;
    @NonNull
    public final ImageView ivClearText;

    public OneTextInputPinBinding(FrameLayout frameLayout, OneCustomClearableEditText oneCustomClearableEditText, ImageView imageView) {
        this.f84645a = frameLayout;
        this.edtConfirmPin = oneCustomClearableEditText;
        this.ivClearText = imageView;
    }

    @NonNull
    public static OneTextInputPinBinding bind(@NonNull View view) {
        int i = R.id.edtConfirmPin;
        OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
        if (oneCustomClearableEditText != null) {
            i = R.id.ivClearText;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new OneTextInputPinBinding((FrameLayout) view, oneCustomClearableEditText, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneTextInputPinBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneTextInputPinBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_text_input_pin, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84645a;
    }
}