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

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogConfirmChangePackageBinding */
/* loaded from: classes7.dex */
public final class DialogConfirmChangePackageBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83713a;
    @NonNull
    public final DtacFontButton buttonConfirm;
    @NonNull
    public final DtacFontButton buttonNo;
    @NonNull
    public final DtacFontTextView confirmMessage;
    @NonNull
    public final DtacFontTextView confirmMessage1;
    @NonNull
    public final DtacFontTextView confirmMessage10;
    @NonNull
    public final DtacFontTextView confirmMessage11;
    @NonNull
    public final DtacFontTextView confirmMessage2;
    @NonNull
    public final DtacFontTextView confirmMessage3;
    @NonNull
    public final DtacFontTextView confirmMessage4;
    @NonNull
    public final DtacFontTextView confirmMessage5;
    @NonNull
    public final DtacFontTextView confirmTitle;
    @NonNull
    public final Guideline guidelineVertical;
    @NonNull
    public final ImageView imageView12;
    @NonNull
    public final ImageView imageView7;
    @NonNull
    public final ImageView imageView8;
    @NonNull
    public final ImageView imageView9;

    public DialogConfirmChangePackageBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, Guideline guideline, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4) {
        this.f83713a = constraintLayout;
        this.buttonConfirm = dtacFontButton;
        this.buttonNo = dtacFontButton2;
        this.confirmMessage = dtacFontTextView;
        this.confirmMessage1 = dtacFontTextView2;
        this.confirmMessage10 = dtacFontTextView3;
        this.confirmMessage11 = dtacFontTextView4;
        this.confirmMessage2 = dtacFontTextView5;
        this.confirmMessage3 = dtacFontTextView6;
        this.confirmMessage4 = dtacFontTextView7;
        this.confirmMessage5 = dtacFontTextView8;
        this.confirmTitle = dtacFontTextView9;
        this.guidelineVertical = guideline;
        this.imageView12 = imageView;
        this.imageView7 = imageView2;
        this.imageView8 = imageView3;
        this.imageView9 = imageView4;
    }

    @NonNull
    public static DialogConfirmChangePackageBinding bind(@NonNull View view) {
        int i = R.id.buttonConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.buttonNo;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.confirmMessage;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.confirmMessage1;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.confirmMessage10;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.confirmMessage11;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                i = R.id.confirmMessage2;
                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView5 != null) {
                                    i = R.id.confirmMessage3;
                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView6 != null) {
                                        i = R.id.confirmMessage4;
                                        DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView7 != null) {
                                            i = R.id.confirmMessage5;
                                            DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView8 != null) {
                                                i = R.id.confirmTitle;
                                                DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView9 != null) {
                                                    i = R.id.guidelineVertical;
                                                    Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                                                    if (guideline != null) {
                                                        i = R.id.imageView12;
                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView != null) {
                                                            i = R.id.imageView7;
                                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView2 != null) {
                                                                i = R.id.imageView8;
                                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView3 != null) {
                                                                    i = R.id.imageView9;
                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                    if (imageView4 != null) {
                                                                        return new DialogConfirmChangePackageBinding((ConstraintLayout) view, dtacFontButton, dtacFontButton2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, guideline, imageView, imageView2, imageView3, imageView4);
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
    public static DialogConfirmChangePackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogConfirmChangePackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_confirm_change_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83713a;
    }
}