package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneItemEPinBinding */
/* loaded from: classes7.dex */
public final class OneItemEPinBinding implements ViewBinding {

    /* renamed from: a */
    public final RadioGroup f84492a;
    @NonNull
    public final RadioGroup priceLayout;
    @NonNull
    public final OneRadioButton priceRadioButton;

    public OneItemEPinBinding(RadioGroup radioGroup, RadioGroup radioGroup2, OneRadioButton oneRadioButton) {
        this.f84492a = radioGroup;
        this.priceLayout = radioGroup2;
        this.priceRadioButton = oneRadioButton;
    }

    @NonNull
    public static OneItemEPinBinding bind(@NonNull View view) {
        RadioGroup radioGroup = (RadioGroup) view;
        int i = R.id.priceRadioButton;
        OneRadioButton oneRadioButton = (OneRadioButton) ViewBindings.findChildViewById(view, i);
        if (oneRadioButton != null) {
            return new OneItemEPinBinding(radioGroup, radioGroup, oneRadioButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneItemEPinBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneItemEPinBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_item_e_pin, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RadioGroup getRoot() {
        return this.f84492a;
    }
}
