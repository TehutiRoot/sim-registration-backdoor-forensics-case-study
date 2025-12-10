package androidx.core.view;

import android.view.WindowInsetsAnimationController;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;

/* loaded from: classes2.dex */
public final class WindowInsetsAnimationControllerCompat {

    /* renamed from: a */
    public final C4167b f34267a;

    /* renamed from: androidx.core.view.WindowInsetsAnimationControllerCompat$a */
    /* loaded from: classes2.dex */
    public static class C4166a extends C4167b {

        /* renamed from: a */
        public final WindowInsetsAnimationController f34268a;

        public C4166a(WindowInsetsAnimationController windowInsetsAnimationController) {
            this.f34268a = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.C4167b
        /* renamed from: a */
        public void mo56721a(boolean z) {
            this.f34268a.finish(z);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.C4167b
        /* renamed from: b */
        public float mo56720b() {
            float currentAlpha;
            currentAlpha = this.f34268a.getCurrentAlpha();
            return currentAlpha;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.C4167b
        /* renamed from: c */
        public float mo56719c() {
            float currentFraction;
            currentFraction = this.f34268a.getCurrentFraction();
            return currentFraction;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.C4167b
        /* renamed from: d */
        public Insets mo56718d() {
            android.graphics.Insets currentInsets;
            currentInsets = this.f34268a.getCurrentInsets();
            return Insets.toCompatInsets(currentInsets);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.C4167b
        /* renamed from: e */
        public Insets mo56717e() {
            android.graphics.Insets hiddenStateInsets;
            hiddenStateInsets = this.f34268a.getHiddenStateInsets();
            return Insets.toCompatInsets(hiddenStateInsets);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.C4167b
        /* renamed from: f */
        public Insets mo56716f() {
            android.graphics.Insets shownStateInsets;
            shownStateInsets = this.f34268a.getShownStateInsets();
            return Insets.toCompatInsets(shownStateInsets);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.C4167b
        /* renamed from: g */
        public int mo56715g() {
            int types;
            types = this.f34268a.getTypes();
            return types;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.C4167b
        /* renamed from: h */
        public boolean mo56714h() {
            boolean isCancelled;
            isCancelled = this.f34268a.isCancelled();
            return isCancelled;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.C4167b
        /* renamed from: i */
        public boolean mo56713i() {
            boolean isFinished;
            isFinished = this.f34268a.isFinished();
            return isFinished;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.C4167b
        /* renamed from: j */
        public void mo56712j(Insets insets, float f, float f2) {
            android.graphics.Insets platformInsets;
            WindowInsetsAnimationController windowInsetsAnimationController = this.f34268a;
            if (insets == null) {
                platformInsets = null;
            } else {
                platformInsets = insets.toPlatformInsets();
            }
            windowInsetsAnimationController.setInsetsAndAlpha(platformInsets, f, f2);
        }
    }

    /* renamed from: androidx.core.view.WindowInsetsAnimationControllerCompat$b */
    /* loaded from: classes2.dex */
    public static class C4167b {
        /* renamed from: a */
        public abstract void mo56721a(boolean z);

        /* renamed from: b */
        public abstract float mo56720b();

        /* renamed from: c */
        public abstract float mo56719c();

        /* renamed from: d */
        public abstract Insets mo56718d();

        /* renamed from: e */
        public abstract Insets mo56717e();

        /* renamed from: f */
        public abstract Insets mo56716f();

        /* renamed from: g */
        public abstract int mo56715g();

        /* renamed from: h */
        public abstract boolean mo56714h();

        /* renamed from: i */
        public abstract boolean mo56713i();

        /* renamed from: j */
        public abstract void mo56712j(Insets insets, float f, float f2);
    }

    public WindowInsetsAnimationControllerCompat(WindowInsetsAnimationController windowInsetsAnimationController) {
        this.f34267a = new C4166a(windowInsetsAnimationController);
    }

    public void finish(boolean z) {
        this.f34267a.mo56721a(z);
    }

    public float getCurrentAlpha() {
        return this.f34267a.mo56720b();
    }

    @FloatRange(from = 0.0d, m64743to = 1.0d)
    public float getCurrentFraction() {
        return this.f34267a.mo56719c();
    }

    @NonNull
    public Insets getCurrentInsets() {
        return this.f34267a.mo56718d();
    }

    @NonNull
    public Insets getHiddenStateInsets() {
        return this.f34267a.mo56717e();
    }

    @NonNull
    public Insets getShownStateInsets() {
        return this.f34267a.mo56716f();
    }

    public int getTypes() {
        return this.f34267a.mo56715g();
    }

    public boolean isCancelled() {
        return this.f34267a.mo56714h();
    }

    public boolean isFinished() {
        return this.f34267a.mo56713i();
    }

    public boolean isReady() {
        if (!isFinished() && !isCancelled()) {
            return true;
        }
        return false;
    }

    public void setInsetsAndAlpha(@Nullable Insets insets, @FloatRange(from = 0.0d, m64743to = 1.0d) float f, @FloatRange(from = 0.0d, m64743to = 1.0d) float f2) {
        this.f34267a.mo56712j(insets, f, f2);
    }
}
