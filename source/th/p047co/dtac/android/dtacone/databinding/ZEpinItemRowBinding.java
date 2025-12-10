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
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZEpinItemRowBinding */
/* loaded from: classes7.dex */
public final class ZEpinItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final RadioGroup f84602a;
    @NonNull
    public final RadioGroup rdbGroupPrice;
    @NonNull
    public final DtacRadioButton rdbPrice;

    public ZEpinItemRowBinding(RadioGroup radioGroup, RadioGroup radioGroup2, DtacRadioButton dtacRadioButton) {
        this.f84602a = radioGroup;
        this.rdbGroupPrice = radioGroup2;
        this.rdbPrice = dtacRadioButton;
    }

    @NonNull
    public static ZEpinItemRowBinding bind(@NonNull View view) {
        RadioGroup radioGroup = (RadioGroup) view;
        int i = R.id.rdbPrice;
        DtacRadioButton dtacRadioButton = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
        if (dtacRadioButton != null) {
            return new ZEpinItemRowBinding(radioGroup, radioGroup, dtacRadioButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZEpinItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZEpinItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_epin_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RadioGroup getRoot() {
        return this.f84602a;
    }
}
