package com.google.android.gms.internal.base;

import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* loaded from: classes3.dex */
public final class zak extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public int f45445a;

    /* renamed from: b */
    public long f45446b;

    /* renamed from: c */
    public int f45447c;

    /* renamed from: d */
    public int f45448d;

    /* renamed from: e */
    public int f45449e;

    /* renamed from: f */
    public int f45450f;

    /* renamed from: g */
    public boolean f45451g;

    /* renamed from: h */
    public boolean f45452h;

    /* renamed from: i */
    public C20336i92 f45453i;

    /* renamed from: j */
    public Drawable f45454j;

    /* renamed from: k */
    public Drawable f45455k;

    /* renamed from: l */
    public boolean f45456l;

    /* renamed from: m */
    public boolean f45457m;

    /* renamed from: n */
    public boolean f45458n;

    /* renamed from: o */
    public int f45459o;

    public zak(@Nullable Drawable drawable, @Nullable Drawable drawable2) {
        this(null);
        drawable = drawable == null ? C20164h92.f62427a : drawable;
        this.f45454j = drawable;
        drawable.setCallback(this);
        C20336i92 c20336i92 = this.f45453i;
        c20336i92.f62725b = drawable.getChangingConfigurations() | c20336i92.f62725b;
        drawable2 = drawable2 == null ? C20164h92.f62427a : drawable2;
        this.f45455k = drawable2;
        drawable2.setCallback(this);
        C20336i92 c20336i922 = this.f45453i;
        c20336i922.f62725b = drawable2.getChangingConfigurations() | c20336i922.f62725b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
        if (r0 == 0) goto L15;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void draw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            int r0 = r7.f45445a
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L3b
            if (r0 == r1) goto Lb
        L9:
            r4 = 1
            goto L44
        Lb:
            long r0 = r7.f45446b
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L9
            long r0 = android.os.SystemClock.uptimeMillis()
            long r4 = r7.f45446b
            long r0 = r0 - r4
            int r4 = r7.f45449e
            float r4 = (float) r4
            float r0 = (float) r0
            float r0 = r0 / r4
            r1 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 < 0) goto L27
            r4 = 1
            goto L28
        L27:
            r4 = 0
        L28:
            if (r4 == 0) goto L2c
            r7.f45445a = r2
        L2c:
            float r0 = java.lang.Math.min(r0, r1)
            int r1 = r7.f45447c
            float r1 = (float) r1
            float r1 = r1 * r0
            r0 = 0
            float r1 = r1 + r0
            int r0 = (int) r1
            r7.f45450f = r0
            goto L44
        L3b:
            long r4 = android.os.SystemClock.uptimeMillis()
            r7.f45446b = r4
            r7.f45445a = r1
            r4 = 0
        L44:
            int r0 = r7.f45450f
            boolean r1 = r7.f45451g
            android.graphics.drawable.Drawable r5 = r7.f45454j
            android.graphics.drawable.Drawable r6 = r7.f45455k
            if (r4 == 0) goto L63
            if (r1 == 0) goto L53
            if (r0 != 0) goto L58
            goto L54
        L53:
            r2 = r0
        L54:
            r5.draw(r8)
            r0 = r2
        L58:
            int r1 = r7.f45448d
            if (r0 != r1) goto L62
            r6.setAlpha(r1)
            r6.draw(r8)
        L62:
            return
        L63:
            if (r1 == 0) goto L6c
            int r1 = r7.f45448d
            int r1 = r1 - r0
            r5.setAlpha(r1)
            r2 = 1
        L6c:
            r5.draw(r8)
            if (r2 == 0) goto L76
            int r1 = r7.f45448d
            r5.setAlpha(r1)
        L76:
            if (r0 <= 0) goto L83
            r6.setAlpha(r0)
            r6.draw(r8)
            int r8 = r7.f45448d
            r6.setAlpha(r8)
        L83:
            r7.invalidateSelf()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.base.zak.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C20336i92 c20336i92 = this.f45453i;
        return changingConfigurations | c20336i92.f62724a | c20336i92.f62725b;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public final Drawable.ConstantState getConstantState() {
        if (zac()) {
            this.f45453i.f62724a = getChangingConfigurations();
            return this.f45453i;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.f45454j.getIntrinsicHeight(), this.f45455k.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.f45454j.getIntrinsicWidth(), this.f45455k.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (!this.f45458n) {
            this.f45459o = Drawable.resolveOpacity(this.f45454j.getOpacity(), this.f45455k.getOpacity());
            this.f45458n = true;
        }
        return this.f45459o;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @CanIgnoreReturnValue
    public final Drawable mutate() {
        if (!this.f45452h && super.mutate() == this) {
            if (zac()) {
                this.f45454j.mutate();
                this.f45455k.mutate();
                this.f45452h = true;
            } else {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f45454j.setBounds(rect);
        this.f45455k.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f45450f == this.f45448d) {
            this.f45450f = i;
        }
        this.f45448d = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f45454j.setColorFilter(colorFilter);
        this.f45455k.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final Drawable zaa() {
        return this.f45455k;
    }

    public final void zab(int i) {
        this.f45447c = this.f45448d;
        this.f45450f = 0;
        this.f45449e = ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION;
        this.f45445a = 1;
        invalidateSelf();
    }

    public final boolean zac() {
        if (!this.f45456l) {
            boolean z = false;
            if (this.f45454j.getConstantState() != null && this.f45455k.getConstantState() != null) {
                z = true;
            }
            this.f45457m = z;
            this.f45456l = true;
        }
        return this.f45457m;
    }

    public zak(C20336i92 c20336i92) {
        this.f45445a = 0;
        this.f45448d = 255;
        this.f45450f = 0;
        this.f45451g = true;
        this.f45453i = new C20336i92(c20336i92);
    }
}
