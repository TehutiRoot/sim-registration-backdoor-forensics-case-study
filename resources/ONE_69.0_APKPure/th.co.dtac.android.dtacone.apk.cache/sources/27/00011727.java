package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentSuccessfullyPre2postBinding */
/* loaded from: classes7.dex */
public final class FragmentSuccessfullyPre2postBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84310a;
    @NonNull
    public final DtacFontButton buttonBackHome;
    @NonNull
    public final Guideline guideTop;
    @NonNull
    public final ImageView imageIconSuccess;
    @NonNull
    public final DtacFontTextView textCutSimStock;
    @NonNull
    public final DtacFontTextView textHeaderSuccess;
    @NonNull
    public final DtacFontTextView textMessageSuccess;

    public FragmentSuccessfullyPre2postBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, Guideline guideline, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84310a = constraintLayout;
        this.buttonBackHome = dtacFontButton;
        this.guideTop = guideline;
        this.imageIconSuccess = imageView;
        this.textCutSimStock = dtacFontTextView;
        this.textHeaderSuccess = dtacFontTextView2;
        this.textMessageSuccess = dtacFontTextView3;
    }

    @NonNull
    public static FragmentSuccessfullyPre2postBinding bind(@NonNull View view) {
        int i = R.id.buttonBackHome;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.guideTop;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R.id.imageIconSuccess;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.textCutSimStock;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.textHeaderSuccess;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.textMessageSuccess;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                return new FragmentSuccessfullyPre2postBinding((ConstraintLayout) view, dtacFontButton, guideline, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSuccessfullyPre2postBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSuccessfullyPre2postBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_successfully_pre2post, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84310a;
    }
}