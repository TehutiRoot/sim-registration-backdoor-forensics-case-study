package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.NonNull;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.gifdecoder.GifDecoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.gif.GifFrameLoader;
import com.bumptech.glide.util.Preconditions;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class GifDrawable extends Drawable implements GifFrameLoader.FrameCallback, Animatable, Animatable2Compat {
    public static final int LOOP_FOREVER = -1;
    public static final int LOOP_INTRINSIC = 0;

    /* renamed from: a */
    public final C5893a f42422a;

    /* renamed from: b */
    public boolean f42423b;

    /* renamed from: c */
    public boolean f42424c;

    /* renamed from: d */
    public boolean f42425d;

    /* renamed from: e */
    public boolean f42426e;

    /* renamed from: f */
    public int f42427f;

    /* renamed from: g */
    public int f42428g;

    /* renamed from: h */
    public boolean f42429h;

    /* renamed from: i */
    public Paint f42430i;

    /* renamed from: j */
    public Rect f42431j;

    /* renamed from: k */
    public List f42432k;

    /* renamed from: com.bumptech.glide.load.resource.gif.GifDrawable$a */
    /* loaded from: classes3.dex */
    public static final class C5893a extends Drawable.ConstantState {

        /* renamed from: a */
        public final GifFrameLoader f42433a;

        public C5893a(GifFrameLoader gifFrameLoader) {
            this.f42433a = gifFrameLoader;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new GifDrawable(this);
        }
    }

    @Deprecated
    public GifDrawable(Context context, GifDecoder gifDecoder, BitmapPool bitmapPool, Transformation<Bitmap> transformation, int i, int i2, Bitmap bitmap) {
        this(context, gifDecoder, transformation, i, i2, bitmap);
    }

    /* renamed from: a */
    public final Drawable.Callback m50142a() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    /* renamed from: b */
    public final Rect m50141b() {
        if (this.f42431j == null) {
            this.f42431j = new Rect();
        }
        return this.f42431j;
    }

    /* renamed from: c */
    public final Paint m50140c() {
        if (this.f42430i == null) {
            this.f42430i = new Paint(2);
        }
        return this.f42430i;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List list = this.f42432k;
        if (list != null) {
            list.clear();
        }
    }

    /* renamed from: d */
    public final void m50139d() {
        List list = this.f42432k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Animatable2Compat.AnimationCallback) this.f42432k.get(i)).onAnimationEnd(this);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        if (this.f42425d) {
            return;
        }
        if (this.f42429h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m50141b());
            this.f42429h = false;
        }
        canvas.drawBitmap(this.f42422a.f42433a.m50133c(), (Rect) null, m50141b(), m50140c());
    }

    /* renamed from: e */
    public final void m50138e() {
        this.f42427f = 0;
    }

    /* renamed from: f */
    public final void m50137f() {
        Preconditions.checkArgument(!this.f42425d, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f42422a.f42433a.m50130f() == 1) {
            invalidateSelf();
        } else if (!this.f42423b) {
            this.f42423b = true;
            this.f42422a.f42433a.m50115u(this);
            invalidateSelf();
        }
    }

    /* renamed from: g */
    public final void m50136g() {
        this.f42423b = false;
        this.f42422a.f42433a.m50114v(this);
    }

    public ByteBuffer getBuffer() {
        return this.f42422a.f42433a.m50134b();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f42422a;
    }

    public Bitmap getFirstFrame() {
        return this.f42422a.f42433a.m50131e();
    }

    public int getFrameCount() {
        return this.f42422a.f42433a.m50130f();
    }

    public int getFrameIndex() {
        return this.f42422a.f42433a.m50132d();
    }

    public Transformation<Bitmap> getFrameTransformation() {
        return this.f42422a.f42433a.m50128h();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f42422a.f42433a.m50127i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f42422a.f42433a.m50123m();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int getSize() {
        return this.f42422a.f42433a.m50124l();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f42423b;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f42429h = true;
    }

    @Override // com.bumptech.glide.load.resource.gif.GifFrameLoader.FrameCallback
    public void onFrameReady() {
        if (m50142a() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (getFrameIndex() == getFrameCount() - 1) {
            this.f42427f++;
        }
        int i = this.f42428g;
        if (i != -1 && this.f42427f >= i) {
            m50139d();
            stop();
        }
    }

    public void recycle() {
        this.f42425d = true;
        this.f42422a.f42433a.m50135a();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.f42432k == null) {
            this.f42432k = new ArrayList();
        }
        this.f42432k.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        m50140c().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        m50140c().setColorFilter(colorFilter);
    }

    public void setFrameTransformation(Transformation<Bitmap> transformation, Bitmap bitmap) {
        this.f42422a.f42433a.m50119q(transformation, bitmap);
    }

    public void setLoopCount(int i) {
        int i2 = -1;
        if (i <= 0 && i != -1 && i != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i == 0) {
            int m50126j = this.f42422a.f42433a.m50126j();
            if (m50126j != 0) {
                i2 = m50126j;
            }
            this.f42428g = i2;
            return;
        }
        this.f42428g = i;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Preconditions.checkArgument(!this.f42425d, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f42426e = z;
        if (!z) {
            m50136g();
        } else if (this.f42424c) {
            m50137f();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f42424c = true;
        m50138e();
        if (this.f42426e) {
            m50137f();
        }
    }

    public void startFromFirstFrame() {
        Preconditions.checkArgument(!this.f42423b, "You cannot restart a currently running animation.");
        this.f42422a.f42433a.m50118r();
        start();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f42424c = false;
        m50136g();
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List list = this.f42432k;
        if (list != null && animationCallback != null) {
            return list.remove(animationCallback);
        }
        return false;
    }

    public GifDrawable(Context context, GifDecoder gifDecoder, Transformation<Bitmap> transformation, int i, int i2, Bitmap bitmap) {
        this(new C5893a(new GifFrameLoader(Glide.get(context), gifDecoder, i, i2, transformation, bitmap)));
    }

    public GifDrawable(C5893a c5893a) {
        this.f42426e = true;
        this.f42428g = -1;
        this.f42422a = (C5893a) Preconditions.checkNotNull(c5893a);
    }
}
