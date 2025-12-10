package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayout;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneTextInputLayoutTextBinding */
/* loaded from: classes7.dex */
public final class OneTextInputLayoutTextBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84534a;
    @NonNull
    public final ImageView btnClearText;
    @NonNull
    public final OneEditText edtText;
    @NonNull
    public final OneTextInputLayout textInputLayout;

    public OneTextInputLayoutTextBinding(RelativeLayout relativeLayout, ImageView imageView, OneEditText oneEditText, OneTextInputLayout oneTextInputLayout) {
        this.f84534a = relativeLayout;
        this.btnClearText = imageView;
        this.edtText = oneEditText;
        this.textInputLayout = oneTextInputLayout;
    }

    @NonNull
    public static OneTextInputLayoutTextBinding bind(@NonNull View view) {
        int i = R.id.btnClearText;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.edtText;
            OneEditText oneEditText = (OneEditText) ViewBindings.findChildViewById(view, i);
            if (oneEditText != null) {
                i = R.id.textInputLayout;
                OneTextInputLayout oneTextInputLayout = (OneTextInputLayout) ViewBindings.findChildViewById(view, i);
                if (oneTextInputLayout != null) {
                    return new OneTextInputLayoutTextBinding((RelativeLayout) view, imageView, oneEditText, oneTextInputLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneTextInputLayoutTextBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneTextInputLayoutTextBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_text_input_layout_text, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84534a;
    }
}
