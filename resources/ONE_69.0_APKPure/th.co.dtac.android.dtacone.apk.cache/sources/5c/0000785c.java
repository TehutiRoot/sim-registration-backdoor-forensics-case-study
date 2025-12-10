package p000;

import android.os.Build;
import android.view.View;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bf0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC19260bf0 extends WindowInsetsAnimationCompat.Callback implements Runnable, OnApplyWindowInsetsListener, View.OnAttachStateChangeListener {

    /* renamed from: c */
    public final WindowInsetsHolder f39152c;

    /* renamed from: d */
    public boolean f39153d;

    /* renamed from: e */
    public boolean f39154e;

    /* renamed from: f */
    public WindowInsetsCompat f39155f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunnableC19260bf0(WindowInsetsHolder composeInsets) {
        super(!composeInsets.getConsumes());
        Intrinsics.checkNotNullParameter(composeInsets, "composeInsets");
        this.f39152c = composeInsets;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        this.f39155f = insets;
        this.f39152c.updateImeAnimationTarget(insets);
        if (this.f39153d) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f39154e) {
            this.f39152c.updateImeAnimationSource(insets);
            WindowInsetsHolder.update$default(this.f39152c, insets, 0, 2, null);
        }
        if (this.f39152c.getConsumes()) {
            WindowInsetsCompat CONSUMED = WindowInsetsCompat.CONSUMED;
            Intrinsics.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
            return CONSUMED;
        }
        return insets;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onEnd(WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f39153d = false;
        this.f39154e = false;
        WindowInsetsCompat windowInsetsCompat = this.f39155f;
        if (animation.getDurationMillis() != 0 && windowInsetsCompat != null) {
            this.f39152c.updateImeAnimationSource(windowInsetsCompat);
            this.f39152c.updateImeAnimationTarget(windowInsetsCompat);
            WindowInsetsHolder.update$default(this.f39152c, windowInsetsCompat, 0, 2, null);
        }
        this.f39155f = null;
        super.onEnd(animation);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public void onPrepare(WindowInsetsAnimationCompat animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f39153d = true;
        this.f39154e = true;
        super.onPrepare(animation);
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsCompat onProgress(WindowInsetsCompat insets, List runningAnimations) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        Intrinsics.checkNotNullParameter(runningAnimations, "runningAnimations");
        WindowInsetsHolder.update$default(this.f39152c, insets, 0, 2, null);
        if (this.f39152c.getConsumes()) {
            WindowInsetsCompat CONSUMED = WindowInsetsCompat.CONSUMED;
            Intrinsics.checkNotNullExpressionValue(CONSUMED, "CONSUMED");
            return CONSUMED;
        }
        return insets;
    }

    @Override // androidx.core.view.WindowInsetsAnimationCompat.Callback
    public WindowInsetsAnimationCompat.BoundsCompat onStart(WindowInsetsAnimationCompat animation, WindowInsetsAnimationCompat.BoundsCompat bounds) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f39153d = false;
        WindowInsetsAnimationCompat.BoundsCompat onStart = super.onStart(animation, bounds);
        Intrinsics.checkNotNullExpressionValue(onStart, "super.onStart(animation, bounds)");
        return onStart;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.requestApplyInsets();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f39153d) {
            this.f39153d = false;
            this.f39154e = false;
            WindowInsetsCompat windowInsetsCompat = this.f39155f;
            if (windowInsetsCompat != null) {
                this.f39152c.updateImeAnimationSource(windowInsetsCompat);
                WindowInsetsHolder.update$default(this.f39152c, windowInsetsCompat, 0, 2, null);
                this.f39155f = null;
            }
        }
    }
}