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
    public final InterfaceC4092a f34248a;

    /* renamed from: androidx.core.view.GestureDetectorCompat$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC4092a {
        /* renamed from: a */
        void mo56955a(boolean z);

        /* renamed from: b */
        void mo56954b(GestureDetector.OnDoubleTapListener onDoubleTapListener);

        /* renamed from: c */
        boolean mo56953c(MotionEvent motionEvent);

        /* renamed from: d */
        boolean mo56952d();
    }

    /* renamed from: androidx.core.view.GestureDetectorCompat$b */
    /* loaded from: classes2.dex */
    public static class C4093b implements InterfaceC4092a {

        /* renamed from: a */
        public final GestureDetector f34249a;

        public C4093b(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
            this.f34249a = new GestureDetector(context, onGestureListener, handler);
        }

        @Override // androidx.core.view.GestureDetectorCompat.InterfaceC4092a
        /* renamed from: a */
        public void mo56955a(boolean z) {
            this.f34249a.setIsLongpressEnabled(z);
        }

        @Override // androidx.core.view.GestureDetectorCompat.InterfaceC4092a
        /* renamed from: b */
        public void mo56954b(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
            this.f34249a.setOnDoubleTapListener(onDoubleTapListener);
        }

        @Override // androidx.core.view.GestureDetectorCompat.InterfaceC4092a
        /* renamed from: c */
        public boolean mo56953c(MotionEvent motionEvent) {
            return this.f34249a.onTouchEvent(motionEvent);
        }

        @Override // androidx.core.view.GestureDetectorCompat.InterfaceC4092a
        /* renamed from: d */
        public boolean mo56952d() {
            return this.f34249a.isLongpressEnabled();
        }
    }

    public GestureDetectorCompat(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public boolean isLongpressEnabled() {
        return this.f34248a.mo56952d();
    }

    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        return this.f34248a.mo56953c(motionEvent);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void setIsLongpressEnabled(boolean z) {
        this.f34248a.mo56955a(z);
    }

    public void setOnDoubleTapListener(@Nullable GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f34248a.mo56954b(onDoubleTapListener);
    }

    public GestureDetectorCompat(@NonNull Context context, @NonNull GestureDetector.OnGestureListener onGestureListener, @Nullable Handler handler) {
        this.f34248a = new C4093b(context, onGestureListener, handler);
    }
}