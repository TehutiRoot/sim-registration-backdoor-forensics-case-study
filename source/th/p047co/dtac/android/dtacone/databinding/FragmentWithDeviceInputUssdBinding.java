package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacNewClearableEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentWithDeviceInputUssdBinding */
/* loaded from: classes7.dex */
public final class FragmentWithDeviceInputUssdBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84225a;
    @NonNull
    public final RelativeLayout btnNext;
    @NonNull
    public final DtacNewClearableEditText etInputUssd;
    @NonNull
    public final ImageView ivWithDeviceBackground;
    @NonNull
    public final LinearLayout layoutContent;
    @NonNull
    public final RelativeLayout layoutHeader;
    @NonNull
    public final ProgressBar progressClickLogin;
    @NonNull
    public final TextInputLayout textInputLayoutUsername;
    @NonNull
    public final DtacFontTextView tvBtnLogin;
    @NonNull
    public final DtacFontTextView tvInputUssdTitle;
    @NonNull
    public final DtacFontTextView tvUssdValue;
    @NonNull
    public final View vBackgroundWhite;
    @NonNull
    public final View vGuildLine;

    public FragmentWithDeviceInputUssdBinding(NestedScrollView nestedScrollView, RelativeLayout relativeLayout, DtacNewClearableEditText dtacNewClearableEditText, ImageView imageView, LinearLayout linearLayout, RelativeLayout relativeLayout2, ProgressBar progressBar, TextInputLayout textInputLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, View view, View view2) {
        this.f84225a = nestedScrollView;
        this.btnNext = relativeLayout;
        this.etInputUssd = dtacNewClearableEditText;
        this.ivWithDeviceBackground = imageView;
        this.layoutContent = linearLayout;
        this.layoutHeader = relativeLayout2;
        this.progressClickLogin = progressBar;
        this.textInputLayoutUsername = textInputLayout;
        this.tvBtnLogin = dtacFontTextView;
        this.tvInputUssdTitle = dtacFontTextView2;
        this.tvUssdValue = dtacFontTextView3;
        this.vBackgroundWhite = view;
        this.vGuildLine = view2;
    }

    @NonNull
    public static FragmentWithDeviceInputUssdBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.btnNext;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.etInputUssd;
            DtacNewClearableEditText dtacNewClearableEditText = (DtacNewClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacNewClearableEditText != null) {
                i = R.id.ivWithDeviceBackground;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.layoutContent;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.layoutHeader;
                        RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout2 != null) {
                            i = R.id.progressClickLogin;
                            ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(view, i);
                            if (progressBar != null) {
                                i = R.id.textInputLayoutUsername;
                                TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                if (textInputLayout != null) {
                                    i = R.id.tvBtnLogin;
                                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView != null) {
                                        i = R.id.tvInputUssdTitle;
                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView2 != null) {
                                            i = R.id.tvUssdValue;
                                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vBackgroundWhite))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.vGuildLine))) != null) {
                                                return new FragmentWithDeviceInputUssdBinding((NestedScrollView) view, relativeLayout, dtacNewClearableEditText, imageView, linearLayout, relativeLayout2, progressBar, textInputLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, findChildViewById, findChildViewById2);
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
    public static FragmentWithDeviceInputUssdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentWithDeviceInputUssdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_with_device_input_ussd, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84225a;
    }
}
