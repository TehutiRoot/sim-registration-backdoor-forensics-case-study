package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentLoginBinding */
/* loaded from: classes7.dex */
public final class FragmentLoginBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83760a;
    @NonNull
    public final ImageView btnClearTextPassword;
    @NonNull
    public final ImageView btnClearTextUsername;
    @NonNull
    public final OneFontTextView btnForgotPassword;
    @NonNull
    public final RelativeLayout btnLogIn;
    @NonNull
    public final DtacEditText etPassword;
    @NonNull
    public final DtacEditText etPhoneNumber;
    @NonNull
    public final ImageView ivAppIcon;
    @NonNull
    public final RelativeLayout layoutInputInfo;
    @NonNull
    public final RelativeLayout layoutSignIn;
    @NonNull
    public final RelativeLayout layoutVersion;
    @NonNull
    public final ProgressBar progressClickLogin;
    @NonNull
    public final RelativeLayout rootLayout;
    @NonNull
    public final TextInputLayout textInputLayoutPassword;
    @NonNull
    public final TextInputLayout textInputLayoutUsername;
    @NonNull
    public final OneFontTextView tvAppOneVersion;
    @NonNull
    public final OneFontTextView tvBtnLogin;
    @NonNull
    public final OneFontTextView tvOneSignIn;
    @NonNull
    public final View vLineSeparate;

    public FragmentLoginBinding(NestedScrollView nestedScrollView, ImageView imageView, ImageView imageView2, OneFontTextView oneFontTextView, RelativeLayout relativeLayout, DtacEditText dtacEditText, DtacEditText dtacEditText2, ImageView imageView3, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, ProgressBar progressBar, RelativeLayout relativeLayout5, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, View view) {
        this.f83760a = nestedScrollView;
        this.btnClearTextPassword = imageView;
        this.btnClearTextUsername = imageView2;
        this.btnForgotPassword = oneFontTextView;
        this.btnLogIn = relativeLayout;
        this.etPassword = dtacEditText;
        this.etPhoneNumber = dtacEditText2;
        this.ivAppIcon = imageView3;
        this.layoutInputInfo = relativeLayout2;
        this.layoutSignIn = relativeLayout3;
        this.layoutVersion = relativeLayout4;
        this.progressClickLogin = progressBar;
        this.rootLayout = relativeLayout5;
        this.textInputLayoutPassword = textInputLayout;
        this.textInputLayoutUsername = textInputLayout2;
        this.tvAppOneVersion = oneFontTextView2;
        this.tvBtnLogin = oneFontTextView3;
        this.tvOneSignIn = oneFontTextView4;
        this.vLineSeparate = view;
    }

    @NonNull
    public static FragmentLoginBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnClearTextPassword;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.btnClearTextUsername;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.btnForgotPassword;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.btnLogIn;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null) {
                        i = R.id.etPassword;
                        DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacEditText != null) {
                            i = R.id.etPhoneNumber;
                            DtacEditText dtacEditText2 = (DtacEditText) ViewBindings.findChildViewById(view, i);
                            if (dtacEditText2 != null) {
                                i = R.id.ivAppIcon;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.layoutInputInfo;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout2 != null) {
                                        i = R.id.layoutSignIn;
                                        RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                        if (relativeLayout3 != null) {
                                            i = R.id.layoutVersion;
                                            RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout4 != null) {
                                                i = R.id.progressClickLogin;
                                                ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                                                if (progressBar != null) {
                                                    i = R.id.rootLayout;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                    if (relativeLayout5 != null) {
                                                        i = R.id.textInputLayoutPassword;
                                                        TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                        if (textInputLayout != null) {
                                                            i = R.id.textInputLayoutUsername;
                                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                            if (textInputLayout2 != null) {
                                                                i = R.id.tvAppOneVersion;
                                                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView2 != null) {
                                                                    i = R.id.tvBtnLogin;
                                                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView3 != null) {
                                                                        i = R.id.tvOneSignIn;
                                                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparate))) != null) {
                                                                            return new FragmentLoginBinding((NestedScrollView) view, imageView, imageView2, oneFontTextView, relativeLayout, dtacEditText, dtacEditText2, imageView3, relativeLayout2, relativeLayout3, relativeLayout4, progressBar, relativeLayout5, textInputLayout, textInputLayout2, oneFontTextView2, oneFontTextView3, oneFontTextView4, findChildViewById);
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
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentLoginBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentLoginBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_login, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83760a;
    }
}
