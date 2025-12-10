package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogConfirmWithWarningBinding */
/* loaded from: classes7.dex */
public final class DialogConfirmWithWarningBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83618a;
    @NonNull
    public final DtacFontButton buttonNo;
    @NonNull
    public final DtacFontButton buttonYes;
    @NonNull
    public final DtacFontTextView confirmMessage;
    @NonNull
    public final DtacFontTextView confirmTitle;
    @NonNull
    public final Guideline guidelineVertical;
    @NonNull
    public final DtacFontTextView warningMessage;

    public DialogConfirmWithWarningBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, Guideline guideline, DtacFontTextView dtacFontTextView3) {
        this.f83618a = constraintLayout;
        this.buttonNo = dtacFontButton;
        this.buttonYes = dtacFontButton2;
        this.confirmMessage = dtacFontTextView;
        this.confirmTitle = dtacFontTextView2;
        this.guidelineVertical = guideline;
        this.warningMessage = dtacFontTextView3;
    }

    @NonNull
    public static DialogConfirmWithWarningBinding bind(@NonNull View view) {
        int i = R.id.buttonNo;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.buttonYes;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.confirmMessage;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.confirmTitle;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.guidelineVertical;
                        Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                        if (guideline != null) {
                            i = R.id.warningMessage;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                return new DialogConfirmWithWarningBinding((ConstraintLayout) view, dtacFontButton, dtacFontButton2, dtacFontTextView, dtacFontTextView2, guideline, dtacFontTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogConfirmWithWarningBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogConfirmWithWarningBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_confirm_with_warning, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83618a;
    }
}
