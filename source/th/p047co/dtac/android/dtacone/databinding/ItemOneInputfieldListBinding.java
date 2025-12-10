package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneInputfieldListBinding */
/* loaded from: classes7.dex */
public final class ItemOneInputfieldListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84354a;
    @NonNull
    public final OneTextInputLayoutText inputEditText;

    public ItemOneInputfieldListBinding(ConstraintLayout constraintLayout, OneTextInputLayoutText oneTextInputLayoutText) {
        this.f84354a = constraintLayout;
        this.inputEditText = oneTextInputLayoutText;
    }

    @NonNull
    public static ItemOneInputfieldListBinding bind(@NonNull View view) {
        int i = R.id.inputEditText;
        OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
        if (oneTextInputLayoutText != null) {
            return new ItemOneInputfieldListBinding((ConstraintLayout) view, oneTextInputLayoutText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneInputfieldListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneInputfieldListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_inputfield_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84354a;
    }
}
