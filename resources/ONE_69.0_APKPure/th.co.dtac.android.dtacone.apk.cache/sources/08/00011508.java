package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentChangeMainPackBinding */
/* loaded from: classes7.dex */
public final class FragmentChangeMainPackBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83763a;
    @NonNull
    public final LinearLayout btnChangeProOnly;
    @NonNull
    public final LinearLayout btnChangeProWithProserm;
    @NonNull
    public final LinearLayout btnChangeProWithTopup;
    @NonNull
    public final ImageView btnSelectPackage;
    @NonNull
    public final DtacEditText etIdCardNumber;
    @NonNull
    public final DtacEditText etMainPackage;
    @NonNull
    public final DtacClearableEditText etPhoneNumber;
    @NonNull
    public final RelativeLayout layoutInput;
    @NonNull
    public final RelativeLayout layoutMainPackage;
    @NonNull
    public final TextInputLayout textInputLayoutIdCardNumber;
    @NonNull
    public final TextInputLayout textInputLayoutPromotion;
    @NonNull
    public final View vLineSeparate;
    @NonNull
    public final View viewForClickSelectPackage;

    public FragmentChangeMainPackBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ImageView imageView, DtacEditText dtacEditText, DtacEditText dtacEditText2, DtacClearableEditText dtacClearableEditText, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, View view, View view2) {
        this.f83763a = linearLayout;
        this.btnChangeProOnly = linearLayout2;
        this.btnChangeProWithProserm = linearLayout3;
        this.btnChangeProWithTopup = linearLayout4;
        this.btnSelectPackage = imageView;
        this.etIdCardNumber = dtacEditText;
        this.etMainPackage = dtacEditText2;
        this.etPhoneNumber = dtacClearableEditText;
        this.layoutInput = relativeLayout;
        this.layoutMainPackage = relativeLayout2;
        this.textInputLayoutIdCardNumber = textInputLayout;
        this.textInputLayoutPromotion = textInputLayout2;
        this.vLineSeparate = view;
        this.viewForClickSelectPackage = view2;
    }

    @NonNull
    public static FragmentChangeMainPackBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.btnChangeProOnly;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btnChangeProWithProserm;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.btnChangeProWithTopup;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout3 != null) {
                    i = R.id.btnSelectPackage;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.etIdCardNumber;
                        DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacEditText != null) {
                            i = R.id.etMainPackage;
                            DtacEditText dtacEditText2 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                            if (dtacEditText2 != null) {
                                i = R.id.etPhoneNumber;
                                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                                if (dtacClearableEditText != null) {
                                    i = R.id.layoutInput;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout != null) {
                                        i = R.id.layoutMainPackage;
                                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                        if (relativeLayout2 != null) {
                                            i = R.id.textInputLayoutIdCardNumber;
                                            TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                            if (textInputLayout != null) {
                                                i = R.id.textInputLayoutPromotion;
                                                TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                if (textInputLayout2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparate))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.viewForClickSelectPackage))) != null) {
                                                    return new FragmentChangeMainPackBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, imageView, dtacEditText, dtacEditText2, dtacClearableEditText, relativeLayout, relativeLayout2, textInputLayout, textInputLayout2, findChildViewById, findChildViewById2);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentChangeMainPackBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChangeMainPackBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_change_main_pack, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83763a;
    }
}