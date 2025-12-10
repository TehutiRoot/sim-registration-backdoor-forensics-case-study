package com.google.android.material.sidesheet;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.google.android.material.R;

/* loaded from: classes4.dex */
public class SideSheetDialog extends AbstractDialogC7072a {

    /* renamed from: o */
    public static final int f50786o = R.attr.sideSheetDialogTheme;

    /* renamed from: p */
    public static final int f50787p = R.style.Theme_Material3_Light_SideSheetDialog;

    /* renamed from: com.google.android.material.sidesheet.SideSheetDialog$a */
    /* loaded from: classes4.dex */
    public class C7071a extends SideSheetCallback {
        public C7071a() {
        }

        @Override // com.google.android.material.sidesheet.SideSheetCallback, p000.TG1
        public void onSlide(View view, float f) {
        }

        @Override // com.google.android.material.sidesheet.SideSheetCallback, p000.TG1
        public void onStateChanged(View view, int i) {
            if (i == 5) {
                SideSheetDialog.this.cancel();
            }
        }
    }

    public SideSheetDialog(@NonNull Context context) {
        this(context, 0);
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a, android.app.Dialog, android.content.DialogInterface
    public /* bridge */ /* synthetic */ void cancel() {
        super.cancel();
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a
    /* renamed from: g */
    public void mo44063g(Sheet sheet) {
        sheet.addCallback(new C7071a());
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a
    /* renamed from: i */
    public Sheet mo44061i(FrameLayout frameLayout) {
        return SideSheetBehavior.from(frameLayout);
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a
    public /* bridge */ /* synthetic */ boolean isDismissWithSheetAnimationEnabled() {
        return super.isDismissWithSheetAnimationEnabled();
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a
    /* renamed from: k */
    public int mo44059k() {
        return R.id.m3_side_sheet;
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a
    /* renamed from: l */
    public int mo44058l() {
        return R.layout.m3_side_sheet_dialog;
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a
    /* renamed from: n */
    public int mo44056n() {
        return 3;
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCancelable(boolean z) {
        super.setCancelable(z);
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a, android.app.Dialog
    public /* bridge */ /* synthetic */ void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@LayoutRes int i) {
        super.setContentView(i);
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a
    public /* bridge */ /* synthetic */ void setDismissWithSheetAnimationEnabled(boolean z) {
        super.setDismissWithSheetAnimationEnabled(z);
    }

    public SideSheetDialog(@NonNull Context context, @StyleRes int i) {
        super(context, i, f50786o, f50787p);
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a
    @NonNull
    public SideSheetBehavior<? extends View> getBehavior() {
        Sheet behavior = super.getBehavior();
        if (behavior instanceof SideSheetBehavior) {
            return (SideSheetBehavior) behavior;
        }
        throw new IllegalStateException("The view is not associated with SideSheetBehavior");
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@Nullable View view) {
        super.setContentView(view);
    }

    @Override // com.google.android.material.sidesheet.AbstractDialogC7072a, androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public /* bridge */ /* synthetic */ void setContentView(@Nullable View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
    }
}
