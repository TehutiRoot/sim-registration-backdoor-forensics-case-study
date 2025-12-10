package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator;

/* renamed from: Ic */
/* loaded from: classes.dex */
public class DialogC0599Ic extends Dialog {

    /* renamed from: a */
    public final View f2725a;

    /* renamed from: Ic$a */
    /* loaded from: classes.dex */
    public class C0600a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f2726a;

        public C0600a(boolean z) {
            this.f2726a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f2726a) {
                DialogC0599Ic.super.dismiss();
            }
        }
    }

    public DialogC0599Ic(Context context, View view) {
        super(context);
        this.f2725a = view;
    }

    /* renamed from: b */
    public final void m68000b(boolean z) {
        float f;
        long j;
        float f2 = 1.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        if (!z) {
            f2 = 0.0f;
        }
        if (z) {
            j = 250;
        } else {
            j = 150;
        }
        this.f2725a.setScaleX(f);
        this.f2725a.setScaleY(f);
        this.f2725a.animate().scaleX(f2).scaleY(f2).setDuration(j).setInterpolator(new LinearOutSlowInInterpolator()).setListener(new C0600a(z)).start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        m68000b(false);
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            dismiss();
            return true;
        }
        return false;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        m68000b(true);
        super.show();
    }
}