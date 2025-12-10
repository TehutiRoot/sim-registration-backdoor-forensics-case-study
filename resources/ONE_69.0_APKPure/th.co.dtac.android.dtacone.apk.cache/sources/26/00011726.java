package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentSuccessfullyBinding */
/* loaded from: classes7.dex */
public final class FragmentSuccessfullyBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84309a;
    @NonNull
    public final DtacFontButton btnGoHome;
    @NonNull
    public final Guideline guidelineTop;
    @NonNull
    public final ImageView imageIconSuccess;
    @NonNull
    public final LinearLayout layoutNewSimCardNumber;
    @NonNull
    public final DtacFontTextView textHeaderSuccess;
    @NonNull
    public final DtacFontTextView textMessageSuccess;
    @NonNull
    public final TextView textViewNewSimNumber;
    @NonNull
    public final TextView textViewNewSimNumberLabel;

    public FragmentSuccessfullyBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, Guideline guideline, ImageView imageView, LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, TextView textView, TextView textView2) {
        this.f84309a = constraintLayout;
        this.btnGoHome = dtacFontButton;
        this.guidelineTop = guideline;
        this.imageIconSuccess = imageView;
        this.layoutNewSimCardNumber = linearLayout;
        this.textHeaderSuccess = dtacFontTextView;
        this.textMessageSuccess = dtacFontTextView2;
        this.textViewNewSimNumber = textView;
        this.textViewNewSimNumberLabel = textView2;
    }

    @NonNull
    public static FragmentSuccessfullyBinding bind(@NonNull View view) {
        int i = R.id.btn_go_home;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.guidelineTop;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R.id.imageIconSuccess;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.layoutNewSimCardNumber;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.textHeaderSuccess;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.textMessageSuccess;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.textViewNewSimNumber;
                                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                                if (textView != null) {
                                    i = R.id.textViewNewSimNumberLabel;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                                    if (textView2 != null) {
                                        return new FragmentSuccessfullyBinding((ConstraintLayout) view, dtacFontButton, guideline, imageView, linearLayout, dtacFontTextView, dtacFontTextView2, textView, textView2);
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
    public static FragmentSuccessfullyBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSuccessfullyBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_successfully, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84309a;
    }
}