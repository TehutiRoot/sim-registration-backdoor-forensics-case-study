package androidx.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class EdgeEffectCompat {

    /* renamed from: a */
    public final EdgeEffect f34465a;

    /* renamed from: androidx.core.widget.EdgeEffectCompat$a */
    /* loaded from: classes2.dex */
    public static class C4197a {
        @DoNotInline
        /* renamed from: a */
        public static void m56477a(EdgeEffect edgeEffect, float f, float f2) {
            edgeEffect.onPull(f, f2);
        }
    }

    /* renamed from: androidx.core.widget.EdgeEffectCompat$b */
    /* loaded from: classes2.dex */
    public static class C4198b {
        @DoNotInline
        /* renamed from: a */
        public static EdgeEffect m56476a(Context context, AttributeSet attributeSet) {
            try {
                return new EdgeEffect(context, attributeSet);
            } catch (Throwable unused) {
                return new EdgeEffect(context);
            }
        }

        @DoNotInline
        /* renamed from: b */
        public static float m56475b(EdgeEffect edgeEffect) {
            try {
                return edgeEffect.getDistance();
            } catch (Throwable unused) {
                return 0.0f;
            }
        }

        @DoNotInline
        /* renamed from: c */
        public static float m56474c(EdgeEffect edgeEffect, float f, float f2) {
            try {
                return edgeEffect.onPullDistance(f, f2);
            } catch (Throwable unused) {
                edgeEffect.onPull(f, f2);
                return 0.0f;
            }
        }
    }

    @Deprecated
    public EdgeEffectCompat(Context context) {
        this.f34465a = new EdgeEffect(context);
    }

    @NonNull
    public static EdgeEffect create(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C4198b.m56476a(context, attributeSet);
        }
        return new EdgeEffect(context);
    }

    public static float getDistance(@NonNull EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C4198b.m56475b(edgeEffect);
        }
        return 0.0f;
    }

    public static float onPullDistance(@NonNull EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C4198b.m56474c(edgeEffect, f, f2);
        }
        onPull(edgeEffect, f, f2);
        return f;
    }

    @Deprecated
    public boolean draw(Canvas canvas) {
        return this.f34465a.draw(canvas);
    }

    @Deprecated
    public void finish() {
        this.f34465a.finish();
    }

    @Deprecated
    public boolean isFinished() {
        return this.f34465a.isFinished();
    }

    @Deprecated
    public boolean onAbsorb(int i) {
        this.f34465a.onAbsorb(i);
        return true;
    }

    @Deprecated
    public boolean onPull(float f) {
        this.f34465a.onPull(f);
        return true;
    }

    @Deprecated
    public boolean onRelease() {
        this.f34465a.onRelease();
        return this.f34465a.isFinished();
    }

    @Deprecated
    public void setSize(int i, int i2) {
        this.f34465a.setSize(i, i2);
    }

    @Deprecated
    public boolean onPull(float f, float f2) {
        onPull(this.f34465a, f, f2);
        return true;
    }

    public static void onPull(@NonNull EdgeEffect edgeEffect, float f, float f2) {
        C4197a.m56477a(edgeEffect, f, f2);
    }
}