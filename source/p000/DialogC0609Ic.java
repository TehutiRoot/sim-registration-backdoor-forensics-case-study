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
public class DialogC0609Ic extends Dialog {

    /* renamed from: a */
    public final View f2553a;

    /* renamed from: Ic$a */
    /* loaded from: classes.dex */
    public class C0610a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f2554a;

        public C0610a(boolean z) {
            this.f2554a = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f2554a) {
                DialogC0609Ic.super.dismiss();
            }
        }
    }

    public DialogC0609Ic(Context context, View view) {
        super(context);
        this.f2553a = view;
    }

    /* renamed from: b */
    public final void m67887b(boolean z) {
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
        this.f2553a.setScaleX(f);
        this.f2553a.setScaleY(f);
        this.f2553a.animate().scaleX(f2).scaleY(f2).setDuration(j).setInterpolator(new LinearOutSlowInInterpolator()).setListener(new C0610a(z)).start();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        m67887b(false);
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
        m67887b(true);
        super.show();
    }
}
