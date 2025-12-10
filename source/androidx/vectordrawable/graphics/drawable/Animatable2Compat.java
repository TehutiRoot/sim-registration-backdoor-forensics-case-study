package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface Animatable2Compat extends Animatable {

    /* loaded from: classes2.dex */
    public static abstract class AnimationCallback {

        /* renamed from: a */
        public Animatable2.AnimationCallback f37857a;

        /* renamed from: androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback$a */
        /* loaded from: classes2.dex */
        public class C5143a extends Animatable2.AnimationCallback {
            public C5143a() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                AnimationCallback.this.onAnimationEnd(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                AnimationCallback.this.onAnimationStart(drawable);
            }
        }

        /* renamed from: a */
        public Animatable2.AnimationCallback m52580a() {
            if (this.f37857a == null) {
                this.f37857a = new C5143a();
            }
            return this.f37857a;
        }

        public void onAnimationEnd(Drawable drawable) {
        }

        public void onAnimationStart(Drawable drawable) {
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(@NonNull AnimationCallback animationCallback);

    boolean unregisterAnimationCallback(@NonNull AnimationCallback animationCallback);
}
