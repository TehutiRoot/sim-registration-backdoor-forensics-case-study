package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import androidx.core.view.MotionEventCompat;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

/* loaded from: classes3.dex */
public class PhotoViewAttacher implements View.OnTouchListener, InterfaceC21571pK0, View.OnLayoutChangeListener {

    /* renamed from: B */
    public static float f43697B = 3.0f;

    /* renamed from: C */
    public static float f43698C = 1.75f;

    /* renamed from: D */
    public static float f43699D = 1.0f;

    /* renamed from: E */
    public static int f43700E = 200;

    /* renamed from: F */
    public static int f43701F = 1;

    /* renamed from: h */
    public ImageView f43710h;

    /* renamed from: i */
    public GestureDetector f43711i;

    /* renamed from: j */
    public C0435GA f43712j;

    /* renamed from: p */
    public OnMatrixChangedListener f43718p;

    /* renamed from: q */
    public OnPhotoTapListener f43719q;

    /* renamed from: r */
    public OnOutsidePhotoTapListener f43720r;

    /* renamed from: s */
    public View.OnClickListener f43721s;

    /* renamed from: t */
    public View.OnLongClickListener f43722t;

    /* renamed from: u */
    public OnScaleChangedListener f43723u;

    /* renamed from: v */
    public OnSingleFlingListener f43724v;

    /* renamed from: w */
    public RunnableC6173e f43725w;

    /* renamed from: y */
    public float f43727y;

    /* renamed from: a */
    public Interpolator f43703a = new AccelerateDecelerateInterpolator();

    /* renamed from: b */
    public int f43704b = f43700E;

    /* renamed from: c */
    public float f43705c = f43699D;

    /* renamed from: d */
    public float f43706d = f43698C;

    /* renamed from: e */
    public float f43707e = f43697B;

    /* renamed from: f */
    public boolean f43708f = true;

    /* renamed from: g */
    public boolean f43709g = false;

    /* renamed from: k */
    public final Matrix f43713k = new Matrix();

    /* renamed from: l */
    public final Matrix f43714l = new Matrix();

    /* renamed from: m */
    public final Matrix f43715m = new Matrix();

    /* renamed from: n */
    public final RectF f43716n = new RectF();

    /* renamed from: o */
    public final float[] f43717o = new float[9];

    /* renamed from: x */
    public int f43726x = 2;

    /* renamed from: z */
    public boolean f43728z = true;

    /* renamed from: A */
    public ImageView.ScaleType f43702A = ImageView.ScaleType.FIT_CENTER;

    /* renamed from: com.github.chrisbanes.photoview.PhotoViewAttacher$a */
    /* loaded from: classes3.dex */
    public class C6169a extends GestureDetector.SimpleOnGestureListener {
        public C6169a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (PhotoViewAttacher.this.f43724v == null || PhotoViewAttacher.this.getScale() > PhotoViewAttacher.f43699D || MotionEventCompat.getPointerCount(motionEvent) > PhotoViewAttacher.f43701F || MotionEventCompat.getPointerCount(motionEvent2) > PhotoViewAttacher.f43701F) {
                return false;
            }
            return PhotoViewAttacher.this.f43724v.onFling(motionEvent, motionEvent2, f, f2);
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            if (PhotoViewAttacher.this.f43722t != null) {
                PhotoViewAttacher.this.f43722t.onLongClick(PhotoViewAttacher.this.f43710h);
            }
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.PhotoViewAttacher$b */
    /* loaded from: classes3.dex */
    public class GestureDetector$OnDoubleTapListenerC6170b implements GestureDetector.OnDoubleTapListener {
        public GestureDetector$OnDoubleTapListenerC6170b() {
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            try {
                float scale = PhotoViewAttacher.this.getScale();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (scale < PhotoViewAttacher.this.getMediumScale()) {
                    PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                    photoViewAttacher.setScale(photoViewAttacher.getMediumScale(), x, y, true);
                } else if (scale >= PhotoViewAttacher.this.getMediumScale() && scale < PhotoViewAttacher.this.getMaximumScale()) {
                    PhotoViewAttacher photoViewAttacher2 = PhotoViewAttacher.this;
                    photoViewAttacher2.setScale(photoViewAttacher2.getMaximumScale(), x, y, true);
                } else {
                    PhotoViewAttacher photoViewAttacher3 = PhotoViewAttacher.this;
                    photoViewAttacher3.setScale(photoViewAttacher3.getMinimumScale(), x, y, true);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
            return true;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTapEvent(MotionEvent motionEvent) {
            return false;
        }

        @Override // android.view.GestureDetector.OnDoubleTapListener
        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (PhotoViewAttacher.this.f43721s != null) {
                PhotoViewAttacher.this.f43721s.onClick(PhotoViewAttacher.this.f43710h);
            }
            RectF displayRect = PhotoViewAttacher.this.getDisplayRect();
            if (displayRect != null) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (displayRect.contains(x, y)) {
                    float width = (x - displayRect.left) / displayRect.width();
                    float height = (y - displayRect.top) / displayRect.height();
                    if (PhotoViewAttacher.this.f43719q != null) {
                        PhotoViewAttacher.this.f43719q.onPhotoTap(PhotoViewAttacher.this.f43710h, width, height);
                        return true;
                    }
                    return true;
                } else if (PhotoViewAttacher.this.f43720r != null) {
                    PhotoViewAttacher.this.f43720r.onOutsidePhotoTap(PhotoViewAttacher.this.f43710h);
                    return false;
                } else {
                    return false;
                }
            }
            return false;
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.PhotoViewAttacher$c */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C6171c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43731a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f43731a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43731a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43731a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f43731a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.PhotoViewAttacher$d */
    /* loaded from: classes3.dex */
    public class RunnableC6172d implements Runnable {

        /* renamed from: a */
        public final float f43732a;

        /* renamed from: b */
        public final float f43733b;

        /* renamed from: c */
        public final long f43734c = System.currentTimeMillis();

        /* renamed from: d */
        public final float f43735d;

        /* renamed from: e */
        public final float f43736e;

        public RunnableC6172d(float f, float f2, float f3, float f4) {
            this.f43732a = f3;
            this.f43733b = f4;
            this.f43735d = f;
            this.f43736e = f2;
        }

        /* renamed from: a */
        public final float m49274a() {
            return PhotoViewAttacher.this.f43703a.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f43734c)) * 1.0f) / PhotoViewAttacher.this.f43704b));
        }

        @Override // java.lang.Runnable
        public void run() {
            float m49274a = m49274a();
            float f = this.f43735d;
            PhotoViewAttacher.this.onScale((f + ((this.f43736e - f) * m49274a)) / PhotoViewAttacher.this.getScale(), this.f43732a, this.f43733b);
            if (m49274a < 1.0f) {
                AbstractC17084xu.m370a(PhotoViewAttacher.this.f43710h, this);
            }
        }
    }

    /* renamed from: com.github.chrisbanes.photoview.PhotoViewAttacher$e */
    /* loaded from: classes3.dex */
    public class RunnableC6173e implements Runnable {

        /* renamed from: a */
        public final OverScroller f43738a;

        /* renamed from: b */
        public int f43739b;

        /* renamed from: c */
        public int f43740c;

        public RunnableC6173e(Context context) {
            this.f43738a = new OverScroller(context);
        }

        /* renamed from: a */
        public void m49273a() {
            this.f43738a.forceFinished(true);
        }

        /* renamed from: b */
        public void m49272b(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            RectF displayRect = PhotoViewAttacher.this.getDisplayRect();
            if (displayRect == null) {
                return;
            }
            int round = Math.round(-displayRect.left);
            float f = i;
            if (f < displayRect.width()) {
                i6 = Math.round(displayRect.width() - f);
                i5 = 0;
            } else {
                i5 = round;
                i6 = i5;
            }
            int round2 = Math.round(-displayRect.top);
            float f2 = i2;
            if (f2 < displayRect.height()) {
                i8 = Math.round(displayRect.height() - f2);
                i7 = 0;
            } else {
                i7 = round2;
                i8 = i7;
            }
            this.f43739b = round;
            this.f43740c = round2;
            if (round != i6 || round2 != i8) {
                this.f43738a.fling(round, round2, i3, i4, i5, i6, i7, i8, 0, 0);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f43738a.isFinished() && this.f43738a.computeScrollOffset()) {
                int currX = this.f43738a.getCurrX();
                int currY = this.f43738a.getCurrY();
                PhotoViewAttacher.this.f43715m.postTranslate(this.f43739b - currX, this.f43740c - currY);
                PhotoViewAttacher photoViewAttacher = PhotoViewAttacher.this;
                photoViewAttacher.m49276w(photoViewAttacher.m49281r());
                this.f43739b = currX;
                this.f43740c = currY;
                AbstractC17084xu.m370a(PhotoViewAttacher.this.f43710h, this);
            }
        }
    }

    public PhotoViewAttacher(ImageView imageView) {
        this.f43710h = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.f43727y = 0.0f;
        this.f43712j = new C0435GA(imageView.getContext(), this);
        GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new C6169a());
        this.f43711i = gestureDetector;
        gestureDetector.setOnDoubleTapListener(new GestureDetector$OnDoubleTapListenerC6170b());
    }

    public void getDisplayMatrix(Matrix matrix) {
        matrix.set(m49281r());
    }

    public RectF getDisplayRect() {
        m49283p();
        return m49282q(m49281r());
    }

    public Matrix getImageMatrix() {
        return this.f43714l;
    }

    public float getMaximumScale() {
        return this.f43707e;
    }

    public float getMediumScale() {
        return this.f43706d;
    }

    public float getMinimumScale() {
        return this.f43705c;
    }

    public float getScale() {
        return (float) Math.sqrt(((float) Math.pow(m49278u(this.f43715m, 0), 2.0d)) + ((float) Math.pow(m49278u(this.f43715m, 3), 2.0d)));
    }

    public ImageView.ScaleType getScaleType() {
        return this.f43702A;
    }

    public void getSuppMatrix(Matrix matrix) {
        matrix.set(this.f43715m);
    }

    public boolean isZoomEnabled() {
        return this.f43728z;
    }

    /* renamed from: n */
    public final void m49285n() {
        RunnableC6173e runnableC6173e = this.f43725w;
        if (runnableC6173e != null) {
            runnableC6173e.m49273a();
            this.f43725w = null;
        }
    }

    /* renamed from: o */
    public final void m49284o() {
        if (m49283p()) {
            m49276w(m49281r());
        }
    }

    @Override // p000.InterfaceC21571pK0
    public void onDrag(float f, float f2) {
        if (this.f43712j.m68287e()) {
            return;
        }
        this.f43715m.postTranslate(f, f2);
        m49284o();
        ViewParent parent = this.f43710h.getParent();
        if (this.f43708f && !this.f43712j.m68287e() && !this.f43709g) {
            int i = this.f43726x;
            if ((i == 2 || ((i == 0 && f >= 1.0f) || (i == 1 && f <= -1.0f))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        } else if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // p000.InterfaceC21571pK0
    public void onFling(float f, float f2, float f3, float f4) {
        RunnableC6173e runnableC6173e = new RunnableC6173e(this.f43710h.getContext());
        this.f43725w = runnableC6173e;
        runnableC6173e.m49272b(m49279t(this.f43710h), m49280s(this.f43710h), (int) f3, (int) f4);
        this.f43710h.post(this.f43725w);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m49275x(this.f43710h.getDrawable());
    }

    @Override // p000.InterfaceC21571pK0
    public void onScale(float f, float f2, float f3) {
        if (getScale() < this.f43707e || f < 1.0f) {
            if (getScale() > this.f43705c || f > 1.0f) {
                OnScaleChangedListener onScaleChangedListener = this.f43723u;
                if (onScaleChangedListener != null) {
                    onScaleChangedListener.onScaleChange(f, f2, f3);
                }
                this.f43715m.postScale(f, f, f2, f3);
                m49284o();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.f43728z
            r1 = 0
            if (r0 == 0) goto L95
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = p000.B02.m69032c(r0)
            if (r0 == 0) goto L95
            int r0 = r12.getAction()
            r2 = 1
            if (r0 == 0) goto L45
            if (r0 == r2) goto L1b
            r3 = 3
            if (r0 == r3) goto L1b
            goto L51
        L1b:
            float r0 = r10.getScale()
            float r3 = r10.f43705c
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L51
            android.graphics.RectF r0 = r10.getDisplayRect()
            if (r0 == 0) goto L51
            com.github.chrisbanes.photoview.PhotoViewAttacher$d r9 = new com.github.chrisbanes.photoview.PhotoViewAttacher$d
            float r5 = r10.getScale()
            float r6 = r10.f43705c
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            r11 = 1
            goto L52
        L45:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L4e
            r11.requestDisallowInterceptTouchEvent(r2)
        L4e:
            r10.m49285n()
        L51:
            r11 = 0
        L52:
            GA r0 = r10.f43712j
            if (r0 == 0) goto L89
            boolean r11 = r0.m68287e()
            GA r0 = r10.f43712j
            boolean r0 = r0.m68288d()
            GA r3 = r10.f43712j
            boolean r3 = r3.m68286f(r12)
            if (r11 != 0) goto L72
            GA r11 = r10.f43712j
            boolean r11 = r11.m68287e()
            if (r11 != 0) goto L72
            r11 = 1
            goto L73
        L72:
            r11 = 0
        L73:
            if (r0 != 0) goto L7f
            GA r0 = r10.f43712j
            boolean r0 = r0.m68288d()
            if (r0 != 0) goto L7f
            r0 = 1
            goto L80
        L7f:
            r0 = 0
        L80:
            if (r11 == 0) goto L85
            if (r0 == 0) goto L85
            r1 = 1
        L85:
            r10.f43709g = r1
            r1 = r3
            goto L8a
        L89:
            r1 = r11
        L8a:
            android.view.GestureDetector r11 = r10.f43711i
            if (r11 == 0) goto L95
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto L95
            r1 = 1
        L95:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.chrisbanes.photoview.PhotoViewAttacher.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: p */
    public final boolean m49283p() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        RectF m49282q = m49282q(m49281r());
        if (m49282q == null) {
            return false;
        }
        float height = m49282q.height();
        float width = m49282q.width();
        float m49280s = m49280s(this.f43710h);
        float f6 = 0.0f;
        if (height <= m49280s) {
            int i = C6171c.f43731a[this.f43702A.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    m49280s = (m49280s - height) / 2.0f;
                    f2 = m49282q.top;
                } else {
                    m49280s -= height;
                    f2 = m49282q.top;
                }
                f3 = m49280s - f2;
            } else {
                f = m49282q.top;
                f3 = -f;
            }
        } else {
            f = m49282q.top;
            if (f <= 0.0f) {
                f2 = m49282q.bottom;
                if (f2 >= m49280s) {
                    f3 = 0.0f;
                }
                f3 = m49280s - f2;
            }
            f3 = -f;
        }
        float m49279t = m49279t(this.f43710h);
        if (width <= m49279t) {
            int i2 = C6171c.f43731a[this.f43702A.ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    f4 = (m49279t - width) / 2.0f;
                    f5 = m49282q.left;
                } else {
                    f4 = m49279t - width;
                    f5 = m49282q.left;
                }
                f6 = f4 - f5;
            } else {
                f6 = -m49282q.left;
            }
            this.f43726x = 2;
        } else {
            float f7 = m49282q.left;
            if (f7 > 0.0f) {
                this.f43726x = 0;
                f6 = -f7;
            } else {
                float f8 = m49282q.right;
                if (f8 < m49279t) {
                    f6 = m49279t - f8;
                    this.f43726x = 1;
                } else {
                    this.f43726x = -1;
                }
            }
        }
        this.f43715m.postTranslate(f6, f3);
        return true;
    }

    /* renamed from: q */
    public final RectF m49282q(Matrix matrix) {
        Drawable drawable = this.f43710h.getDrawable();
        if (drawable != null) {
            this.f43716n.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(this.f43716n);
            return this.f43716n;
        }
        return null;
    }

    /* renamed from: r */
    public final Matrix m49281r() {
        this.f43714l.set(this.f43713k);
        this.f43714l.postConcat(this.f43715m);
        return this.f43714l;
    }

    /* renamed from: s */
    public final int m49280s(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f43708f = z;
    }

    public void setBaseRotation(float f) {
        this.f43727y = f % 360.0f;
        update();
        setRotationBy(this.f43727y);
        m49284o();
    }

    public boolean setDisplayMatrix(Matrix matrix) {
        if (matrix != null) {
            if (this.f43710h.getDrawable() == null) {
                return false;
            }
            this.f43715m.set(matrix);
            m49276w(m49281r());
            m49283p();
            return true;
        }
        throw new IllegalArgumentException("Matrix cannot be null");
    }

    public void setMaximumScale(float f) {
        B02.m69034a(this.f43705c, this.f43706d, f);
        this.f43707e = f;
    }

    public void setMediumScale(float f) {
        B02.m69034a(this.f43705c, f, this.f43707e);
        this.f43706d = f;
    }

    public void setMinimumScale(float f) {
        B02.m69034a(f, this.f43706d, this.f43707e);
        this.f43705c = f;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f43721s = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.f43711i.setOnDoubleTapListener(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f43722t = onLongClickListener;
    }

    public void setOnMatrixChangeListener(OnMatrixChangedListener onMatrixChangedListener) {
        this.f43718p = onMatrixChangedListener;
    }

    public void setOnOutsidePhotoTapListener(OnOutsidePhotoTapListener onOutsidePhotoTapListener) {
        this.f43720r = onOutsidePhotoTapListener;
    }

    public void setOnPhotoTapListener(OnPhotoTapListener onPhotoTapListener) {
        this.f43719q = onPhotoTapListener;
    }

    public void setOnScaleChangeListener(OnScaleChangedListener onScaleChangedListener) {
        this.f43723u = onScaleChangedListener;
    }

    public void setOnSingleFlingListener(OnSingleFlingListener onSingleFlingListener) {
        this.f43724v = onSingleFlingListener;
    }

    public void setRotationBy(float f) {
        this.f43715m.postRotate(f % 360.0f);
        m49284o();
    }

    public void setRotationTo(float f) {
        this.f43715m.setRotate(f % 360.0f);
        m49284o();
    }

    public void setScale(float f) {
        setScale(f, false);
    }

    public void setScaleLevels(float f, float f2, float f3) {
        B02.m69034a(f, f2, f3);
        this.f43705c = f;
        this.f43706d = f2;
        this.f43707e = f3;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (B02.m69031d(scaleType) && scaleType != this.f43702A) {
            this.f43702A = scaleType;
            update();
        }
    }

    public void setZoomInterpolator(Interpolator interpolator) {
        this.f43703a = interpolator;
    }

    public void setZoomTransitionDuration(int i) {
        this.f43704b = i;
    }

    public void setZoomable(boolean z) {
        this.f43728z = z;
        update();
    }

    /* renamed from: t */
    public final int m49279t(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: u */
    public final float m49278u(Matrix matrix, int i) {
        matrix.getValues(this.f43717o);
        return this.f43717o[i];
    }

    public void update() {
        if (this.f43728z) {
            m49275x(this.f43710h.getDrawable());
        } else {
            m49277v();
        }
    }

    /* renamed from: v */
    public final void m49277v() {
        this.f43715m.reset();
        setRotationBy(this.f43727y);
        m49276w(m49281r());
        m49283p();
    }

    /* renamed from: w */
    public final void m49276w(Matrix matrix) {
        RectF m49282q;
        this.f43710h.setImageMatrix(matrix);
        if (this.f43718p != null && (m49282q = m49282q(matrix)) != null) {
            this.f43718p.onMatrixChanged(m49282q);
        }
    }

    /* renamed from: x */
    public final void m49275x(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float m49279t = m49279t(this.f43710h);
        float m49280s = m49280s(this.f43710h);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f43713k.reset();
        float f = intrinsicWidth;
        float f2 = m49279t / f;
        float f3 = intrinsicHeight;
        float f4 = m49280s / f3;
        ImageView.ScaleType scaleType = this.f43702A;
        if (scaleType == ImageView.ScaleType.CENTER) {
            this.f43713k.postTranslate((m49279t - f) / 2.0f, (m49280s - f3) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f2, f4);
            this.f43713k.postScale(max, max);
            this.f43713k.postTranslate((m49279t - (f * max)) / 2.0f, (m49280s - (f3 * max)) / 2.0f);
        } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f2, f4));
            this.f43713k.postScale(min, min);
            this.f43713k.postTranslate((m49279t - (f * min)) / 2.0f, (m49280s - (f3 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, m49279t, m49280s);
            if (((int) this.f43727y) % BitmapUtil.IMAGE_180_DEGREE != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            int i = C6171c.f43731a[this.f43702A.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            this.f43713k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                        }
                    } else {
                        this.f43713k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                    }
                } else {
                    this.f43713k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                }
            } else {
                this.f43713k.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            }
        }
        m49277v();
    }

    public void setScale(float f, boolean z) {
        setScale(f, this.f43710h.getRight() / 2, this.f43710h.getBottom() / 2, z);
    }

    public void setScale(float f, float f2, float f3, boolean z) {
        if (f < this.f43705c || f > this.f43707e) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.f43710h.post(new RunnableC6172d(getScale(), f, f2, f3));
            return;
        }
        this.f43715m.setScale(f, f, f2, f3);
        m49284o();
    }
}
