package androidx.appcompat.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.DrawableCompat;
import ch.qos.logback.core.net.SyslogConstants;

/* loaded from: classes.dex */
public class DrawableContainerCompat extends Drawable implements Drawable.Callback {

    /* renamed from: a */
    public AbstractC2115d f9171a;

    /* renamed from: b */
    public Rect f9172b;

    /* renamed from: c */
    public Drawable f9173c;

    /* renamed from: d */
    public Drawable f9174d;

    /* renamed from: f */
    public boolean f9176f;

    /* renamed from: h */
    public boolean f9178h;

    /* renamed from: i */
    public Runnable f9179i;

    /* renamed from: j */
    public long f9180j;

    /* renamed from: k */
    public long f9181k;

    /* renamed from: l */
    public C2114c f9182l;

    /* renamed from: e */
    public int f9175e = 255;

    /* renamed from: g */
    public int f9177g = -1;

    /* renamed from: androidx.appcompat.graphics.drawable.DrawableContainerCompat$a */
    /* loaded from: classes.dex */
    public class RunnableC2112a implements Runnable {
        public RunnableC2112a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DrawableContainerCompat.this.m64488a(true);
            DrawableContainerCompat.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.DrawableContainerCompat$b */
    /* loaded from: classes.dex */
    public static class C2113b {
        /* renamed from: a */
        public static boolean m64481a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m64480b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m64479c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.DrawableContainerCompat$c */
    /* loaded from: classes.dex */
    public static class C2114c implements Drawable.Callback {

        /* renamed from: a */
        public Drawable.Callback f9184a;

        /* renamed from: a */
        public Drawable.Callback m64478a() {
            Drawable.Callback callback = this.f9184a;
            this.f9184a = null;
            return callback;
        }

        /* renamed from: b */
        public C2114c m64477b(Drawable.Callback callback) {
            this.f9184a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f9184a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f9184a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.DrawableContainerCompat$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2115d extends Drawable.ConstantState {

        /* renamed from: A */
        public int f9185A;

        /* renamed from: B */
        public int f9186B;

        /* renamed from: C */
        public boolean f9187C;

        /* renamed from: D */
        public ColorFilter f9188D;

        /* renamed from: E */
        public boolean f9189E;

        /* renamed from: F */
        public ColorStateList f9190F;

        /* renamed from: G */
        public PorterDuff.Mode f9191G;

        /* renamed from: H */
        public boolean f9192H;

        /* renamed from: I */
        public boolean f9193I;

        /* renamed from: a */
        public final DrawableContainerCompat f9194a;

        /* renamed from: b */
        public Resources f9195b;

        /* renamed from: c */
        public int f9196c;

        /* renamed from: d */
        public int f9197d;

        /* renamed from: e */
        public int f9198e;

        /* renamed from: f */
        public SparseArray f9199f;

        /* renamed from: g */
        public Drawable[] f9200g;

        /* renamed from: h */
        public int f9201h;

        /* renamed from: i */
        public boolean f9202i;

        /* renamed from: j */
        public boolean f9203j;

        /* renamed from: k */
        public Rect f9204k;

        /* renamed from: l */
        public boolean f9205l;

        /* renamed from: m */
        public boolean f9206m;

        /* renamed from: n */
        public int f9207n;

        /* renamed from: o */
        public int f9208o;

        /* renamed from: p */
        public int f9209p;

        /* renamed from: q */
        public int f9210q;

        /* renamed from: r */
        public boolean f9211r;

        /* renamed from: s */
        public int f9212s;

        /* renamed from: t */
        public boolean f9213t;

        /* renamed from: u */
        public boolean f9214u;

        /* renamed from: v */
        public boolean f9215v;

        /* renamed from: w */
        public boolean f9216w;

        /* renamed from: x */
        public boolean f9217x;

        /* renamed from: y */
        public boolean f9218y;

        /* renamed from: z */
        public int f9219z;

        public AbstractC2115d(AbstractC2115d abstractC2115d, DrawableContainerCompat drawableContainerCompat, Resources resources) {
            Resources resources2;
            int i;
            this.f9202i = false;
            this.f9205l = false;
            this.f9217x = true;
            this.f9185A = 0;
            this.f9186B = 0;
            this.f9194a = drawableContainerCompat;
            if (resources != null) {
                resources2 = resources;
            } else if (abstractC2115d != null) {
                resources2 = abstractC2115d.f9195b;
            } else {
                resources2 = null;
            }
            this.f9195b = resources2;
            if (abstractC2115d != null) {
                i = abstractC2115d.f9196c;
            } else {
                i = 0;
            }
            int m64484f = DrawableContainerCompat.m64484f(resources, i);
            this.f9196c = m64484f;
            if (abstractC2115d != null) {
                this.f9197d = abstractC2115d.f9197d;
                this.f9198e = abstractC2115d.f9198e;
                this.f9215v = true;
                this.f9216w = true;
                this.f9202i = abstractC2115d.f9202i;
                this.f9205l = abstractC2115d.f9205l;
                this.f9217x = abstractC2115d.f9217x;
                this.f9218y = abstractC2115d.f9218y;
                this.f9219z = abstractC2115d.f9219z;
                this.f9185A = abstractC2115d.f9185A;
                this.f9186B = abstractC2115d.f9186B;
                this.f9187C = abstractC2115d.f9187C;
                this.f9188D = abstractC2115d.f9188D;
                this.f9189E = abstractC2115d.f9189E;
                this.f9190F = abstractC2115d.f9190F;
                this.f9191G = abstractC2115d.f9191G;
                this.f9192H = abstractC2115d.f9192H;
                this.f9193I = abstractC2115d.f9193I;
                if (abstractC2115d.f9196c == m64484f) {
                    if (abstractC2115d.f9203j) {
                        this.f9204k = abstractC2115d.f9204k != null ? new Rect(abstractC2115d.f9204k) : null;
                        this.f9203j = true;
                    }
                    if (abstractC2115d.f9206m) {
                        this.f9207n = abstractC2115d.f9207n;
                        this.f9208o = abstractC2115d.f9208o;
                        this.f9209p = abstractC2115d.f9209p;
                        this.f9210q = abstractC2115d.f9210q;
                        this.f9206m = true;
                    }
                }
                if (abstractC2115d.f9211r) {
                    this.f9212s = abstractC2115d.f9212s;
                    this.f9211r = true;
                }
                if (abstractC2115d.f9213t) {
                    this.f9214u = abstractC2115d.f9214u;
                    this.f9213t = true;
                }
                Drawable[] drawableArr = abstractC2115d.f9200g;
                this.f9200g = new Drawable[drawableArr.length];
                this.f9201h = abstractC2115d.f9201h;
                SparseArray sparseArray = abstractC2115d.f9199f;
                if (sparseArray != null) {
                    this.f9199f = sparseArray.clone();
                } else {
                    this.f9199f = new SparseArray(this.f9201h);
                }
                int i2 = this.f9201h;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f9199f.put(i3, constantState);
                        } else {
                            this.f9200g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f9200g = new Drawable[10];
            this.f9201h = 0;
        }

        /* renamed from: a */
        public final int m64476a(Drawable drawable) {
            int i = this.f9201h;
            if (i >= this.f9200g.length) {
                mo64443o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f9194a);
            this.f9200g[i] = drawable;
            this.f9201h++;
            this.f9198e = drawable.getChangingConfigurations() | this.f9198e;
            m64462p();
            this.f9204k = null;
            this.f9203j = false;
            this.f9206m = false;
            this.f9215v = false;
            return i;
        }

        /* renamed from: b */
        public final void m64475b(Resources.Theme theme) {
            if (theme != null) {
                m64472e();
                int i = this.f9201h;
                Drawable[] drawableArr = this.f9200g;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null && DrawableCompat.canApplyTheme(drawable)) {
                        DrawableCompat.applyTheme(drawableArr[i2], theme);
                        this.f9198e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m64453z(C2113b.m64479c(theme));
            }
        }

        /* renamed from: c */
        public boolean m64474c() {
            if (this.f9215v) {
                return this.f9216w;
            }
            m64472e();
            this.f9215v = true;
            int i = this.f9201h;
            Drawable[] drawableArr = this.f9200g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f9216w = false;
                    return false;
                }
            }
            this.f9216w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f9201h;
            Drawable[] drawableArr = this.f9200g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    if (DrawableCompat.canApplyTheme(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f9199f.get(i2);
                    if (constantState != null && C2113b.m64481a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        public void m64473d() {
            this.f9206m = true;
            m64472e();
            int i = this.f9201h;
            Drawable[] drawableArr = this.f9200g;
            this.f9208o = -1;
            this.f9207n = -1;
            this.f9210q = 0;
            this.f9209p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f9207n) {
                    this.f9207n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f9208o) {
                    this.f9208o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f9209p) {
                    this.f9209p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f9210q) {
                    this.f9210q = minimumHeight;
                }
            }
        }

        /* renamed from: e */
        public final void m64472e() {
            SparseArray sparseArray = this.f9199f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f9200g[this.f9199f.keyAt(i)] = m64459t(((Drawable.ConstantState) this.f9199f.valueAt(i)).newDrawable(this.f9195b));
                }
                this.f9199f = null;
            }
        }

        /* renamed from: f */
        public final int m64471f() {
            return this.f9200g.length;
        }

        /* renamed from: g */
        public final Drawable m64470g(int i) {
            int indexOfKey;
            Drawable drawable = this.f9200g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f9199f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable m64459t = m64459t(((Drawable.ConstantState) this.f9199f.valueAt(indexOfKey)).newDrawable(this.f9195b));
            this.f9200g[i] = m64459t;
            this.f9199f.removeAt(indexOfKey);
            if (this.f9199f.size() == 0) {
                this.f9199f = null;
            }
            return m64459t;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f9197d | this.f9198e;
        }

        /* renamed from: h */
        public final int m64469h() {
            return this.f9201h;
        }

        /* renamed from: i */
        public final int m64468i() {
            if (!this.f9206m) {
                m64473d();
            }
            return this.f9208o;
        }

        /* renamed from: j */
        public final int m64467j() {
            if (!this.f9206m) {
                m64473d();
            }
            return this.f9210q;
        }

        /* renamed from: k */
        public final int m64466k() {
            if (!this.f9206m) {
                m64473d();
            }
            return this.f9209p;
        }

        /* renamed from: l */
        public final Rect m64465l() {
            Rect rect = null;
            if (this.f9202i) {
                return null;
            }
            Rect rect2 = this.f9204k;
            if (rect2 == null && !this.f9203j) {
                m64472e();
                Rect rect3 = new Rect();
                int i = this.f9201h;
                Drawable[] drawableArr = this.f9200g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2].getPadding(rect3)) {
                        if (rect == null) {
                            rect = new Rect(0, 0, 0, 0);
                        }
                        int i3 = rect3.left;
                        if (i3 > rect.left) {
                            rect.left = i3;
                        }
                        int i4 = rect3.top;
                        if (i4 > rect.top) {
                            rect.top = i4;
                        }
                        int i5 = rect3.right;
                        if (i5 > rect.right) {
                            rect.right = i5;
                        }
                        int i6 = rect3.bottom;
                        if (i6 > rect.bottom) {
                            rect.bottom = i6;
                        }
                    }
                }
                this.f9203j = true;
                this.f9204k = rect;
                return rect;
            }
            return rect2;
        }

        /* renamed from: m */
        public final int m64464m() {
            if (!this.f9206m) {
                m64473d();
            }
            return this.f9207n;
        }

        /* renamed from: n */
        public final int m64463n() {
            int i;
            if (this.f9211r) {
                return this.f9212s;
            }
            m64472e();
            int i2 = this.f9201h;
            Drawable[] drawableArr = this.f9200g;
            if (i2 > 0) {
                i = drawableArr[0].getOpacity();
            } else {
                i = -2;
            }
            for (int i3 = 1; i3 < i2; i3++) {
                i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
            }
            this.f9212s = i;
            this.f9211r = true;
            return i;
        }

        /* renamed from: o */
        public void mo64443o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f9200g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f9200g = drawableArr;
        }

        /* renamed from: p */
        public void m64462p() {
            this.f9211r = false;
            this.f9213t = false;
        }

        /* renamed from: q */
        public final boolean m64461q() {
            return this.f9205l;
        }

        /* renamed from: r */
        public final boolean m64460r() {
            if (this.f9213t) {
                return this.f9214u;
            }
            m64472e();
            int i = this.f9201h;
            Drawable[] drawableArr = this.f9200g;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                } else if (drawableArr[i2].isStateful()) {
                    z = true;
                    break;
                } else {
                    i2++;
                }
            }
            this.f9214u = z;
            this.f9213t = true;
            return z;
        }

        /* renamed from: s */
        public abstract void mo64442s();

        /* renamed from: t */
        public final Drawable m64459t(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                DrawableCompat.setLayoutDirection(drawable, this.f9219z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f9194a);
            return mutate;
        }

        /* renamed from: u */
        public final void m64458u(boolean z) {
            this.f9205l = z;
        }

        /* renamed from: v */
        public final void m64457v(int i) {
            this.f9185A = i;
        }

        /* renamed from: w */
        public final void m64456w(int i) {
            this.f9186B = i;
        }

        /* renamed from: x */
        public final boolean m64455x(int i, int i2) {
            boolean z;
            int i3 = this.f9201h;
            Drawable[] drawableArr = this.f9200g;
            boolean z2 = false;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        z = DrawableCompat.setLayoutDirection(drawable, i);
                    } else {
                        z = false;
                    }
                    if (i4 == i2) {
                        z2 = z;
                    }
                }
            }
            this.f9219z = i;
            return z2;
        }

        /* renamed from: y */
        public final void m64454y(boolean z) {
            this.f9202i = z;
        }

        /* renamed from: z */
        public final void m64453z(Resources resources) {
            if (resources != null) {
                this.f9195b = resources;
                int m64484f = DrawableContainerCompat.m64484f(resources, this.f9196c);
                int i = this.f9196c;
                this.f9196c = m64484f;
                if (i != m64484f) {
                    this.f9206m = false;
                    this.f9203j = false;
                }
            }
        }
    }

    /* renamed from: f */
    public static int m64484f(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return SyslogConstants.LOG_LOCAL4;
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m64488a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f9176f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f9173c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f9180j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f9175e
            r3.setAlpha(r9)
            r13.f9180j = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$d r9 = r13.f9171a
            int r9 = r9.f9185A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f9175e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f9180j = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f9174d
            if (r9 == 0) goto L65
            long r10 = r13.f9181k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f9174d = r0
            r13.f9181k = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$d r4 = r13.f9171a
            int r4 = r4.f9186B
            int r3 = r3 / r4
            int r4 = r13.f9175e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f9181k = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f9179i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.DrawableContainerCompat.m64488a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        this.f9171a.m64475b(theme);
    }

    /* renamed from: b */
    public AbstractC2115d mo64451b() {
        return this.f9171a;
    }

    /* renamed from: c */
    public int m64487c() {
        return this.f9177g;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public boolean canApplyTheme() {
        return this.f9171a.canApplyTheme();
    }

    /* renamed from: d */
    public final void m64486d(Drawable drawable) {
        if (this.f9182l == null) {
            this.f9182l = new C2114c();
        }
        drawable.setCallback(this.f9182l.m64477b(drawable.getCallback()));
        try {
            if (this.f9171a.f9185A <= 0 && this.f9176f) {
                drawable.setAlpha(this.f9175e);
            }
            AbstractC2115d abstractC2115d = this.f9171a;
            if (abstractC2115d.f9189E) {
                drawable.setColorFilter(abstractC2115d.f9188D);
            } else {
                if (abstractC2115d.f9192H) {
                    DrawableCompat.setTintList(drawable, abstractC2115d.f9190F);
                }
                AbstractC2115d abstractC2115d2 = this.f9171a;
                if (abstractC2115d2.f9193I) {
                    DrawableCompat.setTintMode(drawable, abstractC2115d2.f9191G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f9171a.f9217x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
            }
            DrawableCompat.setAutoMirrored(drawable, this.f9171a.f9187C);
            Rect rect = this.f9172b;
            if (rect != null) {
                DrawableCompat.setHotspotBounds(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f9182l.m64478a());
        } catch (Throwable th2) {
            drawable.setCallback(this.f9182l.m64478a());
            throw th2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f9173c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f9174d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public final boolean m64485e() {
        if (isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m64483g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f9177g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$d r0 = r9.f9171a
            int r0 = r0.f9186B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f9174d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f9173c
            if (r0 == 0) goto L29
            r9.f9174d = r0
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$d r0 = r9.f9171a
            int r0 = r0.f9186B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f9181k = r0
            goto L35
        L29:
            r9.f9174d = r4
            r9.f9181k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f9173c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$d r0 = r9.f9171a
            int r1 = r0.f9201h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m64470g(r10)
            r9.f9173c = r0
            r9.f9177g = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$d r10 = r9.f9171a
            int r10 = r10.f9185A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f9180j = r2
        L51:
            r9.m64486d(r0)
            goto L5a
        L55:
            r9.f9173c = r4
            r10 = -1
            r9.f9177g = r10
        L5a:
            long r0 = r9.f9180j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f9181k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f9179i
            if (r0 != 0) goto L73
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$a r0 = new androidx.appcompat.graphics.drawable.DrawableContainerCompat$a
            r0.<init>()
            r9.f9179i = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m64488a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.DrawableContainerCompat.m64483g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9175e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f9171a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f9171a.m64474c()) {
            this.f9171a.f9197d = getChangingConfigurations();
            return this.f9171a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f9173c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@NonNull Rect rect) {
        Rect rect2 = this.f9172b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f9171a.m64461q()) {
            return this.f9171a.m64468i();
        }
        Drawable drawable = this.f9173c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f9171a.m64461q()) {
            return this.f9171a.m64464m();
        }
        Drawable drawable = this.f9173c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f9171a.m64461q()) {
            return this.f9171a.m64467j();
        }
        Drawable drawable = this.f9173c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f9171a.m64461q()) {
            return this.f9171a.m64466k();
        }
        Drawable drawable = this.f9173c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f9173c;
        if (drawable != null && drawable.isVisible()) {
            return this.f9171a.m64463n();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.f9173c;
        if (drawable != null) {
            C2113b.m64480b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        boolean padding;
        Rect m64465l = this.f9171a.m64465l();
        if (m64465l != null) {
            rect.set(m64465l);
            if ((m64465l.right | m64465l.left | m64465l.top | m64465l.bottom) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.f9173c;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (m64485e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    /* renamed from: h */
    public void mo64450h(AbstractC2115d abstractC2115d) {
        this.f9171a = abstractC2115d;
        int i = this.f9177g;
        if (i >= 0) {
            Drawable m64470g = abstractC2115d.m64470g(i);
            this.f9173c = m64470g;
            if (m64470g != null) {
                m64486d(m64470g);
            }
        }
        this.f9174d = null;
    }

    /* renamed from: i */
    public final void m64482i(Resources resources) {
        this.f9171a.m64453z(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        AbstractC2115d abstractC2115d = this.f9171a;
        if (abstractC2115d != null) {
            abstractC2115d.m64462p();
        }
        if (drawable == this.f9173c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f9171a.f9187C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f9171a.m64460r();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f9174d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f9174d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f9173c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f9176f) {
                this.f9173c.setAlpha(this.f9175e);
            }
        }
        if (this.f9181k != 0) {
            this.f9181k = 0L;
            z = true;
        }
        if (this.f9180j != 0) {
            this.f9180j = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f9178h && super.mutate() == this) {
            AbstractC2115d mo64451b = mo64451b();
            mo64451b.mo64442s();
            mo64450h(mo64451b);
            this.f9178h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9174d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f9173c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f9171a.m64455x(i, m64487c());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f9174d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f9173c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        Drawable drawable = this.f9174d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f9173c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        if (drawable == this.f9173c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (!this.f9176f || this.f9175e != i) {
            this.f9176f = true;
            this.f9175e = i;
            Drawable drawable = this.f9173c;
            if (drawable != null) {
                if (this.f9180j == 0) {
                    drawable.setAlpha(i);
                } else {
                    m64488a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC2115d abstractC2115d = this.f9171a;
        if (abstractC2115d.f9187C != z) {
            abstractC2115d.f9187C = z;
            Drawable drawable = this.f9173c;
            if (drawable != null) {
                DrawableCompat.setAutoMirrored(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC2115d abstractC2115d = this.f9171a;
        abstractC2115d.f9189E = true;
        if (abstractC2115d.f9188D != colorFilter) {
            abstractC2115d.f9188D = colorFilter;
            Drawable drawable = this.f9173c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC2115d abstractC2115d = this.f9171a;
        if (abstractC2115d.f9217x != z) {
            abstractC2115d.f9217x = z;
            Drawable drawable = this.f9173c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setEnterFadeDuration(int i) {
        this.f9171a.f9185A = i;
    }

    public void setExitFadeDuration(int i) {
        this.f9171a.f9186B = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f9173c;
        if (drawable != null) {
            DrawableCompat.setHotspot(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f9172b;
        if (rect == null) {
            this.f9172b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f9173c;
        if (drawable != null) {
            DrawableCompat.setHotspotBounds(drawable, i, i2, i3, i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(@ColorInt int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC2115d abstractC2115d = this.f9171a;
        abstractC2115d.f9192H = true;
        if (abstractC2115d.f9190F != colorStateList) {
            abstractC2115d.f9190F = colorStateList;
            DrawableCompat.setTintList(this.f9173c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        AbstractC2115d abstractC2115d = this.f9171a;
        abstractC2115d.f9193I = true;
        if (abstractC2115d.f9191G != mode) {
            abstractC2115d.f9191G = mode;
            DrawableCompat.setTintMode(this.f9173c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f9174d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f9173c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        if (drawable == this.f9173c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}