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
    public boolean f49302a;

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetDialogFragment$b */
    /* loaded from: classes4.dex */
    public class C6847b extends BottomSheetBehavior.BottomSheetCallback {
        public C6847b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        public void onStateChanged(View view, int i) {
            if (i == 5) {
                BottomSheetDialogFragment.this.m45596o();
            }
        }
    }

    public BottomSheetDialogFragment() {
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        if (!m45594q(false)) {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        if (!m45594q(true)) {
            super.dismissAllowingStateLoss();
        }
    }

    /* renamed from: o */
    public final void m45596o() {
        if (this.f49302a) {
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
    public final void m45595p(BottomSheetBehavior bottomSheetBehavior, boolean z) {
        this.f49302a = z;
        if (bottomSheetBehavior.getState() == 5) {
            m45596o();
            return;
        }
        if (getDialog() instanceof BottomSheetDialog) {
            ((BottomSheetDialog) getDialog()).m45603k();
        }
        bottomSheetBehavior.addBottomSheetCallback(new C6847b());
        bottomSheetBehavior.setState(5);
    }

    /* renamed from: q */
    public final boolean m45594q(boolean z) {
        Dialog dialog = getDialog();
        if (dialog instanceof BottomSheetDialog) {
            BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
            BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
            if (behavior.isHideable() && bottomSheetDialog.getDismissWithAnimation()) {
                m45595p(behavior, z);
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
