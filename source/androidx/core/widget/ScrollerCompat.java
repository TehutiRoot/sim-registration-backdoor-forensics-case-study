package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

@Deprecated
/* loaded from: classes2.dex */
public final class ScrollerCompat {

    /* renamed from: a */
    public OverScroller f34414a;

    public ScrollerCompat(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator != null) {
            overScroller = new OverScroller(context, interpolator);
        } else {
            overScroller = new OverScroller(context);
        }
        this.f34414a = overScroller;
    }

    @Deprecated
    public static ScrollerCompat create(Context context) {
        return create(context, null);
    }

    @Deprecated
    public void abortAnimation() {
        this.f34414a.abortAnimation();
    }

    @Deprecated
    public boolean computeScrollOffset() {
        return this.f34414a.computeScrollOffset();
    }

    @Deprecated
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f34414a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Deprecated
    public float getCurrVelocity() {
        return this.f34414a.getCurrVelocity();
    }

    @Deprecated
    public int getCurrX() {
        return this.f34414a.getCurrX();
    }

    @Deprecated
    public int getCurrY() {
        return this.f34414a.getCurrY();
    }

    @Deprecated
    public int getFinalX() {
        return this.f34414a.getFinalX();
    }

    @Deprecated
    public int getFinalY() {
        return this.f34414a.getFinalY();
    }

    @Deprecated
    public boolean isFinished() {
        return this.f34414a.isFinished();
    }

    @Deprecated
    public boolean isOverScrolled() {
        return this.f34414a.isOverScrolled();
    }

    @Deprecated
    public void notifyHorizontalEdgeReached(int i, int i2, int i3) {
        this.f34414a.notifyHorizontalEdgeReached(i, i2, i3);
    }

    @Deprecated
    public void notifyVerticalEdgeReached(int i, int i2, int i3) {
        this.f34414a.notifyVerticalEdgeReached(i, i2, i3);
    }

    @Deprecated
    public boolean springBack(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.f34414a.springBack(i, i2, i3, i4, i5, i6);
    }

    @Deprecated
    public void startScroll(int i, int i2, int i3, int i4) {
        this.f34414a.startScroll(i, i2, i3, i4);
    }

    @Deprecated
    public static ScrollerCompat create(Context context, Interpolator interpolator) {
        return new ScrollerCompat(context, interpolator);
    }

    @Deprecated
    public void fling(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.f34414a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Deprecated
    public void startScroll(int i, int i2, int i3, int i4, int i5) {
        this.f34414a.startScroll(i, i2, i3, i4, i5);
    }
}
