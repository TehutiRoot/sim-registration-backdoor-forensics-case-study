package androidx.core.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class GestureDetectorCompat {

    /* renamed from: a */
    public final InterfaceC4110a f34160a;

    /* renamed from: androidx.core.view.GestureDetectorCompat$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4110a {
        /* renamed from: a */
        void mo57005a(boolean z);

        /* renamed from: b */
        void mo57004b(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        /* renamed from: c */
        boolean mo57003c(MotionEvent motionEvent);

        /* renamed from: d */
        boolean mo57002d();
    }

    /* renamed from: androidx.core.view.GestureDetectorCompat$b */
    /* loaded from: classes2.dex */
    public static class C4111b implements InterfaceC4110a {

        /* renamed from: a */
        public final GestureDetector f34161a;

        public C4111b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f34161a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.GestureDetectorCompat.InterfaceC4110a
        /* renamed from: a */
        public void mo57005a(boolean z) {
            this.f34161a.setIsLongpressEnabled(z);
        }

        @Override // androidx.core.view.GestureDetectorCompat.InterfaceC4110a
        /* renamed from: b */
        public void mo57004b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f34161a.setOnDoubleTapListener(onDoubleTapListener);
        }

        @Override // androidx.core.view.GestureDetectorCompat.InterfaceC4110a
        /* renamed from: c */
        public boolean mo57003c(MotionEvent motionEvent) {
            return this.f34161a.onTouchEvent(motionEvent);
        }

        @Override // androidx.core.view.GestureDetectorCompat.InterfaceC4110a
        /* renamed from: d */
        public boolean mo57002d() {
            return this.f34161a.isLongpressEnabled();
        }
    }

    public GestureDetectorCompat(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean isLongpressEnabled() {
        return this.f34160a.mo57002d();
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return this.f34160a.mo57003c(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setIsLongpressEnabled(boolean z) {
        this.f34160a.mo57005a(z);
    }

    public void setOnDoubleTapListener(@Nullable GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f34160a.mo57004b(onDoubleTapListener);
    }

    public GestureDetectorCompat(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener, @Nullable Handler handler) {
        this.f34160a = new C4111b(context, onGestureListener, handler);
    }
}
