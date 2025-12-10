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
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneChangeProHappyBinding */
/* loaded from: classes7.dex */
public final class FragmentOneChangeProHappyBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84011a;
    @NonNull
    public final LinearLayout btnChangeProOnly;
    @NonNull
    public final LinearLayout btnChangeProWithProserm;
    @NonNull
    public final LinearLayout btnChangeProWithTopup;
    @NonNull
    public final ImageView btnSelectPackage;
    @NonNull
    public final LinearLayout chgProHappyLLayout;
    @NonNull
    public final OneEditText etIdCardNumber;
    @NonNull
    public final OneEditText etMainPackage;
    @NonNull
    public final OneCustomClearableEditText etPhoneNumber;
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

    public FragmentOneChangeProHappyBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, ImageView imageView, LinearLayout linearLayout5, OneEditText oneEditText, OneEditText oneEditText2, OneCustomClearableEditText oneCustomClearableEditText, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, View view, View view2) {
        this.f84011a = linearLayout;
        this.btnChangeProOnly = linearLayout2;
        this.btnChangeProWithProserm = linearLayout3;
        this.btnChangeProWithTopup = linearLayout4;
        this.btnSelectPackage = imageView;
        this.chgProHappyLLayout = linearLayout5;
        this.etIdCardNumber = oneEditText;
        this.etMainPackage = oneEditText2;
        this.etPhoneNumber = oneCustomClearableEditText;
        this.layoutInput = relativeLayout;
        this.layoutMainPackage = relativeLayout2;
        this.textInputLayoutIdCardNumber = textInputLayout;
        this.textInputLayoutPromotion = textInputLayout2;
        this.vLineSeparate = view;
        this.viewForClickSelectPackage = view2;
    }

    @NonNull
    public static FragmentOneChangeProHappyBinding bind(@NonNull View view) {
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
                        i = R.id.chgProHappyLLayout;
                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout4 != null) {
                            i = R.id.etIdCardNumber;
                            OneEditText oneEditText = (OneEditText) ViewBindings.findChildViewById(view, i);
                            if (oneEditText != null) {
                                i = R.id.etMainPackage;
                                OneEditText oneEditText2 = (OneEditText) ViewBindings.findChildViewById(view, i);
                                if (oneEditText2 != null) {
                                    i = R.id.etPhoneNumber;
                                    OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                    if (oneCustomClearableEditText != null) {
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
                                                        return new FragmentOneChangeProHappyBinding((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, imageView, linearLayout4, oneEditText, oneEditText2, oneCustomClearableEditText, relativeLayout, relativeLayout2, textInputLayout, textInputLayout2, findChildViewById, findChildViewById2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneChangeProHappyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneChangeProHappyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_change_pro_happy, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84011a;
    }
}