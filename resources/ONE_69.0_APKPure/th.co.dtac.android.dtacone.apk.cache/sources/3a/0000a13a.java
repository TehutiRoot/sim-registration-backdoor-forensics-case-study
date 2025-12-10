package com.google.android.material.bottomsheet;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes4.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {

    /* renamed from: a */
    public boolean f49314a;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialogFragment$b */
    /* loaded from: classes4.dex */
    public class C6836b extends BottomSheetBehavior.BottomSheetCallback {
        public C6836b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
            if (i == 5) {
                BottomSheetDialogFragment.this.m45572o();
            }
        }
    }

    public BottomSheetDialogFragment() {
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (!m45570q(false)) {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (!m45570q(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    /* renamed from: o */
    public final void m45572o() {
        if (this.f49314a) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new BottomSheetDialog(getContext(), getTheme());
    }

    /* renamed from: p */
    public final void m45571p(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f49314a = z;
        if (bottomSheetBehavior.getState() == 5) {
            m45572o();
            return;
        }
        if (getDialog() instanceof BottomSheetDialog) {
            ((BottomSheetDialog) getDialog()).m45579k();
        }
        bottomSheetBehavior.addBottomSheetCallback(new C6836b());
        bottomSheetBehavior.setState(5);
    }

    /* renamed from: q */
    public final boolean m45570q(boolean z) {
        Dialog dialog = getDialog();
        if (dialog instanceof BottomSheetDialog) {
            BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
            BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
            if (behavior.isHideable() && bottomSheetDialog.getDismissWithAnimation()) {
                m45571p(behavior, z);
                return true;
            }
            return false;
        }
        return false;
    }

    @SuppressLint({"ValidFragment"})
    public BottomSheetDialogFragment(@LayoutRes int i) {
        super(i);
    }
}