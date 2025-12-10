package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemInputfieldListBinding */
/* loaded from: classes7.dex */
public final class ItemInputfieldListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84427a;
    @NonNull
    public final ImageButton btnClearText;
    @NonNull
    public final DtacEditText inputEditText;
    @NonNull
    public final TextInputLayout inputLayout;

    public ItemInputfieldListBinding(ConstraintLayout constraintLayout, ImageButton imageButton, DtacEditText dtacEditText, TextInputLayout textInputLayout) {
        this.f84427a = constraintLayout;
        this.btnClearText = imageButton;
        this.inputEditText = dtacEditText;
        this.inputLayout = textInputLayout;
    }

    @NonNull
    public static ItemInputfieldListBinding bind(@NonNull View view) {
        int i = R.id.btnClearText;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.inputEditText;
            DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
            if (dtacEditText != null) {
                i = R.id.inputLayout;
                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                if (textInputLayout != null) {
                    return new ItemInputfieldListBinding((ConstraintLayout) view, imageButton, dtacEditText, textInputLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemInputfieldListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemInputfieldListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_inputfield_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84427a;
    }
}