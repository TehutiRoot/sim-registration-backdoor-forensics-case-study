package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentUpPassTestDisplayResultOcrBinding */
/* loaded from: classes7.dex */
public final class FragmentUpPassTestDisplayResultOcrBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84319a;
    @NonNull
    public final DtacFontButton btnNext;
    @NonNull
    public final OneFontTextView textViewResultOcr;

    public FragmentUpPassTestDisplayResultOcrBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, OneFontTextView oneFontTextView) {
        this.f84319a = constraintLayout;
        this.btnNext = dtacFontButton;
        this.textViewResultOcr = oneFontTextView;
    }

    @NonNull
    public static FragmentUpPassTestDisplayResultOcrBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.textViewResultOcr;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                return new FragmentUpPassTestDisplayResultOcrBinding((ConstraintLayout) view, dtacFontButton, oneFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentUpPassTestDisplayResultOcrBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentUpPassTestDisplayResultOcrBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_up_pass_test_display_result_ocr, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84319a;
    }
}