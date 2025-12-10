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
    public AbstractC2133d f9083a;

    /* renamed from: b */
    public Rect f9084b;

    /* renamed from: c */
    public Drawable f9085c;

    /* renamed from: d */
    public Drawable f9086d;

    /* renamed from: f */
    public boolean f9088f;

    /* renamed from: h */
    public boolean f9090h;

    /* renamed from: i */
    public Runnable f9091i;

    /* renamed from: j */
    public long f9092j;

    /* renamed from: k */
    public long f9093k;

    /* renamed from: l */
    public C2132c f9094l;

    /* renamed from: e */
    public int f9087e = 255;

    /* renamed from: g */
    public int f9089g = -1;

    /* renamed from: androidx.appcompat.graphics.drawable.DrawableContainerCompat$a */
    /* loaded from: classes.dex */
    public class RunnableC2130a implements Runnable {
        public RunnableC2130a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DrawableContainerCompat.this.m64537a(true);
            DrawableContainerCompat.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.DrawableContainerCompat$b */
    /* loaded from: classes.dex */
    public static class C2131b {
        /* renamed from: a */
        public static boolean m64530a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        /* renamed from: b */
        public static void m64529b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        /* renamed from: c */
        public static Resources m64528c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.DrawableContainerCompat$c */
    /* loaded from: classes.dex */
    public static class C2132c implements Drawable.Callback {

        /* renamed from: a */
        public Drawable.Callback f9096a;

        /* renamed from: a */
        public Drawable.Callback m64527a() {
            Drawable.Callback callback = this.f9096a;
            this.f9096a = null;
            return callback;
        }

        /* renamed from: b */
        public C2132c m64526b(Drawable.Callback callback) {
            this.f9096a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Drawable.Callback callback = this.f9096a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f9096a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* renamed from: androidx.appcompat.graphics.drawable.DrawableContainerCompat$d */
    /* loaded from: classes.dex */
    public static abstract class AbstractC2133d extends Drawable.ConstantState {

        /* renamed from: A */
        public int f9097A;

        /* renamed from: B */
        public int f9098B;

        /* renamed from: C */
        public boolean f9099C;

        /* renamed from: D */
        public ColorFilter f9100D;

        /* renamed from: E */
        public boolean f9101E;

        /* renamed from: F */
        public ColorStateList f9102F;

        /* renamed from: G */
        public PorterDuff.Mode f9103G;

        /* renamed from: H */
        public boolean f9104H;

        /* renamed from: I */
        public boolean f9105I;

        /* renamed from: a */
        public final DrawableContainerCompat f9106a;

        /* renamed from: b */
        public Resources f9107b;

        /* renamed from: c */
        public int f9108c;

        /* renamed from: d */
        public int f9109d;

        /* renamed from: e */
        public int f9110e;

        /* renamed from: f */
        public SparseArray f9111f;

        /* renamed from: g */
        public Drawable[] f9112g;

        /* renamed from: h */
        public int f9113h;

        /* renamed from: i */
        public boolean f9114i;

        /* renamed from: j */
        public boolean f9115j;

        /* renamed from: k */
        public Rect f9116k;

        /* renamed from: l */
        public boolean f9117l;

        /* renamed from: m */
        public boolean f9118m;

        /* renamed from: n */
        public int f9119n;

        /* renamed from: o */
        public int f9120o;

        /* renamed from: p */
        public int f9121p;

        /* renamed from: q */
        public int f9122q;

        /* renamed from: r */
        public boolean f9123r;

        /* renamed from: s */
        public int f9124s;

        /* renamed from: t */
        public boolean f9125t;

        /* renamed from: u */
        public boolean f9126u;

        /* renamed from: v */
        public boolean f9127v;

        /* renamed from: w */
        public boolean f9128w;

        /* renamed from: x */
        public boolean f9129x;

        /* renamed from: y */
        public boolean f9130y;

        /* renamed from: z */
        public int f9131z;

        public AbstractC2133d(AbstractC2133d abstractC2133d, DrawableContainerCompat drawableContainerCompat, Resources resources) {
            Resources resources2;
            int i;
            this.f9114i = false;
            this.f9117l = false;
            this.f9129x = true;
            this.f9097A = 0;
            this.f9098B = 0;
            this.f9106a = drawableContainerCompat;
            if (resources != null) {
                resources2 = resources;
            } else if (abstractC2133d != null) {
                resources2 = abstractC2133d.f9107b;
            } else {
                resources2 = null;
            }
            this.f9107b = resources2;
            if (abstractC2133d != null) {
                i = abstractC2133d.f9108c;
            } else {
                i = 0;
            }
            int m64533f = DrawableContainerCompat.m64533f(resources, i);
            this.f9108c = m64533f;
            if (abstractC2133d != null) {
                this.f9109d = abstractC2133d.f9109d;
                this.f9110e = abstractC2133d.f9110e;
                this.f9127v = true;
                this.f9128w = true;
                this.f9114i = abstractC2133d.f9114i;
                this.f9117l = abstractC2133d.f9117l;
                this.f9129x = abstractC2133d.f9129x;
                this.f9130y = abstractC2133d.f9130y;
                this.f9131z = abstractC2133d.f9131z;
                this.f9097A = abstractC2133d.f9097A;
                this.f9098B = abstractC2133d.f9098B;
                this.f9099C = abstractC2133d.f9099C;
                this.f9100D = abstractC2133d.f9100D;
                this.f9101E = abstractC2133d.f9101E;
                this.f9102F = abstractC2133d.f9102F;
                this.f9103G = abstractC2133d.f9103G;
                this.f9104H = abstractC2133d.f9104H;
                this.f9105I = abstractC2133d.f9105I;
                if (abstractC2133d.f9108c == m64533f) {
                    if (abstractC2133d.f9115j) {
                        this.f9116k = abstractC2133d.f9116k != null ? new Rect(abstractC2133d.f9116k) : null;
                        this.f9115j = true;
                    }
                    if (abstractC2133d.f9118m) {
                        this.f9119n = abstractC2133d.f9119n;
                        this.f9120o = abstractC2133d.f9120o;
                        this.f9121p = abstractC2133d.f9121p;
                        this.f9122q = abstractC2133d.f9122q;
                        this.f9118m = true;
                    }
                }
                if (abstractC2133d.f9123r) {
                    this.f9124s = abstractC2133d.f9124s;
                    this.f9123r = true;
                }
                if (abstractC2133d.f9125t) {
                    this.f9126u = abstractC2133d.f9126u;
                    this.f9125t = true;
                }
                Drawable[] drawableArr = abstractC2133d.f9112g;
                this.f9112g = new Drawable[drawableArr.length];
                this.f9113h = abstractC2133d.f9113h;
                SparseArray sparseArray = abstractC2133d.f9111f;
                if (sparseArray != null) {
                    this.f9111f = sparseArray.clone();
                } else {
                    this.f9111f = new SparseArray(this.f9113h);
                }
                int i2 = this.f9113h;
                for (int i3 = 0; i3 < i2; i3++) {
                    Drawable drawable = drawableArr[i3];
                    if (drawable != null) {
                        Drawable.ConstantState constantState = drawable.getConstantState();
                        if (constantState != null) {
                            this.f9111f.put(i3, constantState);
                        } else {
                            this.f9112g[i3] = drawableArr[i3];
                        }
                    }
                }
                return;
            }
            this.f9112g = new Drawable[10];
            this.f9113h = 0;
        }

        /* renamed from: a */
        public final int m64525a(Drawable drawable) {
            int i = this.f9113h;
            if (i >= this.f9112g.length) {
                mo64492o(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f9106a);
            this.f9112g[i] = drawable;
            this.f9113h++;
            this.f9110e = drawable.getChangingConfigurations() | this.f9110e;
            m64511p();
            this.f9116k = null;
            this.f9115j = false;
            this.f9118m = false;
            this.f9127v = false;
            return i;
        }

        /* renamed from: b */
        public final void m64524b(Resources.Theme theme) {
            if (theme != null) {
                m64521e();
                int i = this.f9113h;
                Drawable[] drawableArr = this.f9112g;
                for (int i2 = 0; i2 < i; i2++) {
                    Drawable drawable = drawableArr[i2];
                    if (drawable != null && DrawableCompat.canApplyTheme(drawable)) {
                        DrawableCompat.applyTheme(drawableArr[i2], theme);
                        this.f9110e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                m64502z(C2131b.m64528c(theme));
            }
        }

        /* renamed from: c */
        public boolean m64523c() {
            if (this.f9127v) {
                return this.f9128w;
            }
            m64521e();
            this.f9127v = true;
            int i = this.f9113h;
            Drawable[] drawableArr = this.f9112g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f9128w = false;
                    return false;
                }
            }
            this.f9128w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i = this.f9113h;
            Drawable[] drawableArr = this.f9112g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null) {
                    if (DrawableCompat.canApplyTheme(drawable)) {
                        return true;
                    }
                } else {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f9111f.get(i2);
                    if (constantState != null && C2131b.m64530a(constantState)) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* renamed from: d */
        public void m64522d() {
            this.f9118m = true;
            m64521e();
            int i = this.f9113h;
            Drawable[] drawableArr = this.f9112g;
            this.f9120o = -1;
            this.f9119n = -1;
            this.f9122q = 0;
            this.f9121p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f9119n) {
                    this.f9119n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f9120o) {
                    this.f9120o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f9121p) {
                    this.f9121p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f9122q) {
                    this.f9122q = minimumHeight;
                }
            }
        }

        /* renamed from: e */
        public final void m64521e() {
            SparseArray sparseArray = this.f9111f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f9112g[this.f9111f.keyAt(i)] = m64508t(((Drawable.ConstantState) this.f9111f.valueAt(i)).newDrawable(this.f9107b));
                }
                this.f9111f = null;
            }
        }

        /* renamed from: f */
        public final int m64520f() {
            return this.f9112g.length;
        }

        /* renamed from: g */
        public final Drawable m64519g(int i) {
            int indexOfKey;
            Drawable drawable = this.f9112g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f9111f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
                return null;
            }
            Drawable m64508t = m64508t(((Drawable.ConstantState) this.f9111f.valueAt(indexOfKey)).newDrawable(this.f9107b));
            this.f9112g[i] = m64508t;
            this.f9111f.removeAt(indexOfKey);
            if (this.f9111f.size() == 0) {
                this.f9111f = null;
            }
            return m64508t;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f9109d | this.f9110e;
        }

        /* renamed from: h */
        public final int m64518h() {
            return this.f9113h;
        }

        /* renamed from: i */
        public final int m64517i() {
            if (!this.f9118m) {
                m64522d();
            }
            return this.f9120o;
        }

        /* renamed from: j */
        public final int m64516j() {
            if (!this.f9118m) {
                m64522d();
            }
            return this.f9122q;
        }

        /* renamed from: k */
        public final int m64515k() {
            if (!this.f9118m) {
                m64522d();
            }
            return this.f9121p;
        }

        /* renamed from: l */
        public final Rect m64514l() {
            Rect rect = null;
            if (this.f9114i) {
                return null;
            }
            Rect rect2 = this.f9116k;
            if (rect2 == null && !this.f9115j) {
                m64521e();
                Rect rect3 = new Rect();
                int i = this.f9113h;
                Drawable[] drawableArr = this.f9112g;
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
                this.f9115j = true;
                this.f9116k = rect;
                return rect;
            }
            return rect2;
        }

        /* renamed from: m */
        public final int m64513m() {
            if (!this.f9118m) {
                m64522d();
            }
            return this.f9119n;
        }

        /* renamed from: n */
        public final int m64512n() {
            int i;
            if (this.f9123r) {
                return this.f9124s;
            }
            m64521e();
            int i2 = this.f9113h;
            Drawable[] drawableArr = this.f9112g;
            if (i2 > 0) {
                i = drawableArr[0].getOpacity();
            } else {
                i = -2;
            }
            for (int i3 = 1; i3 < i2; i3++) {
                i = Drawable.resolveOpacity(i, drawableArr[i3].getOpacity());
            }
            this.f9124s = i;
            this.f9123r = true;
            return i;
        }

        /* renamed from: o */
        public void mo64492o(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = this.f9112g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            this.f9112g = drawableArr;
        }

        /* renamed from: p */
        public void m64511p() {
            this.f9123r = false;
            this.f9125t = false;
        }

        /* renamed from: q */
        public final boolean m64510q() {
            return this.f9117l;
        }

        /* renamed from: r */
        public final boolean m64509r() {
            if (this.f9125t) {
                return this.f9126u;
            }
            m64521e();
            int i = this.f9113h;
            Drawable[] drawableArr = this.f9112g;
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
            this.f9126u = z;
            this.f9125t = true;
            return z;
        }

        /* renamed from: s */
        public abstract void mo64491s();

        /* renamed from: t */
        public final Drawable m64508t(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                DrawableCompat.setLayoutDirection(drawable, this.f9131z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f9106a);
            return mutate;
        }

        /* renamed from: u */
        public final void m64507u(boolean z) {
            this.f9117l = z;
        }

        /* renamed from: v */
        public final void m64506v(int i) {
            this.f9097A = i;
        }

        /* renamed from: w */
        public final void m64505w(int i) {
            this.f9098B = i;
        }

        /* renamed from: x */
        public final boolean m64504x(int i, int i2) {
            boolean z;
            int i3 = this.f9113h;
            Drawable[] drawableArr = this.f9112g;
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
            this.f9131z = i;
            return z2;
        }

        /* renamed from: y */
        public final void m64503y(boolean z) {
            this.f9114i = z;
        }

        /* renamed from: z */
        public final void m64502z(Resources resources) {
            if (resources != null) {
                this.f9107b = resources;
                int m64533f = DrawableContainerCompat.m64533f(resources, this.f9108c);
                int i = this.f9108c;
                this.f9108c = m64533f;
                if (i != m64533f) {
                    this.f9118m = false;
                    this.f9115j = false;
                }
            }
        }
    }

    /* renamed from: f */
    public static int m64533f(Resources resources, int i) {
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
    public void m64537a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f9088f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f9085c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L38
            long r9 = r13.f9092j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L3a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f9087e
            r3.setAlpha(r9)
            r13.f9092j = r6
            goto L3a
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$d r9 = r13.f9083a
            int r9 = r9.f9097A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f9087e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L3b
        L38:
            r13.f9092j = r6
        L3a:
            r3 = 0
        L3b:
            android.graphics.drawable.Drawable r9 = r13.f9086d
            if (r9 == 0) goto L65
            long r10 = r13.f9093k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L67
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L52
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f9086d = r0
            r13.f9093k = r6
            goto L67
        L52:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$d r4 = r13.f9083a
            int r4 = r4.f9098B
            int r3 = r3 / r4
            int r4 = r13.f9087e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L68
        L65:
            r13.f9093k = r6
        L67:
            r0 = r3
        L68:
            if (r14 == 0) goto L74
            if (r0 == 0) goto L74
            java.lang.Runnable r14 = r13.f9091i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.DrawableContainerCompat.m64537a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void applyTheme(@NonNull Resources.Theme theme) {
        this.f9083a.m64524b(theme);
    }

    /* renamed from: b */
    public AbstractC2133d mo64500b() {
        return this.f9083a;
    }

    /* renamed from: c */
    public int m64536c() {
        return this.f9089g;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public boolean canApplyTheme() {
        return this.f9083a.canApplyTheme();
    }

    /* renamed from: d */
    public final void m64535d(Drawable drawable) {
        if (this.f9094l == null) {
            this.f9094l = new C2132c();
        }
        drawable.setCallback(this.f9094l.m64526b(drawable.getCallback()));
        try {
            if (this.f9083a.f9097A <= 0 && this.f9088f) {
                drawable.setAlpha(this.f9087e);
            }
            AbstractC2133d abstractC2133d = this.f9083a;
            if (abstractC2133d.f9101E) {
                drawable.setColorFilter(abstractC2133d.f9100D);
            } else {
                if (abstractC2133d.f9104H) {
                    DrawableCompat.setTintList(drawable, abstractC2133d.f9102F);
                }
                AbstractC2133d abstractC2133d2 = this.f9083a;
                if (abstractC2133d2.f9105I) {
                    DrawableCompat.setTintMode(drawable, abstractC2133d2.f9103G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f9083a.f9129x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                DrawableCompat.setLayoutDirection(drawable, DrawableCompat.getLayoutDirection(this));
            }
            DrawableCompat.setAutoMirrored(drawable, this.f9083a.f9099C);
            Rect rect = this.f9084b;
            if (rect != null) {
                DrawableCompat.setHotspotBounds(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            drawable.setCallback(this.f9094l.m64527a());
        } catch (Throwable th2) {
            drawable.setCallback(this.f9094l.m64527a());
            throw th2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Drawable drawable = this.f9085c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f9086d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* renamed from: e */
    public final boolean m64534e() {
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
    public boolean m64532g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f9089g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$d r0 = r9.f9083a
            int r0 = r0.f9098B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f9086d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f9085c
            if (r0 == 0) goto L29
            r9.f9086d = r0
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$d r0 = r9.f9083a
            int r0 = r0.f9098B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f9093k = r0
            goto L35
        L29:
            r9.f9086d = r4
            r9.f9093k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f9085c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$d r0 = r9.f9083a
            int r1 = r0.f9113h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.m64519g(r10)
            r9.f9085c = r0
            r9.f9089g = r10
            if (r0 == 0) goto L5a
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$d r10 = r9.f9083a
            int r10 = r10.f9097A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f9092j = r2
        L51:
            r9.m64535d(r0)
            goto L5a
        L55:
            r9.f9085c = r4
            r10 = -1
            r9.f9089g = r10
        L5a:
            long r0 = r9.f9092j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f9093k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f9091i
            if (r0 != 0) goto L73
            androidx.appcompat.graphics.drawable.DrawableContainerCompat$a r0 = new androidx.appcompat.graphics.drawable.DrawableContainerCompat$a
            r0.<init>()
            r9.f9091i = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.m64537a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.graphics.drawable.DrawableContainerCompat.m64532g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f9087e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f9083a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f9083a.m64523c()) {
            this.f9083a.f9109d = getChangingConfigurations();
            return this.f9083a;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable getCurrent() {
        return this.f9085c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(@NonNull Rect rect) {
        Rect rect2 = this.f9084b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f9083a.m64510q()) {
            return this.f9083a.m64517i();
        }
        Drawable drawable = this.f9085c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f9083a.m64510q()) {
            return this.f9083a.m64513m();
        }
        Drawable drawable = this.f9085c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f9083a.m64510q()) {
            return this.f9083a.m64516j();
        }
        Drawable drawable = this.f9085c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f9083a.m64510q()) {
            return this.f9083a.m64515k();
        }
        Drawable drawable = this.f9085c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f9085c;
        if (drawable != null && drawable.isVisible()) {
            return this.f9083a.m64512n();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    @RequiresApi(21)
    public void getOutline(@NonNull Outline outline) {
        Drawable drawable = this.f9085c;
        if (drawable != null) {
            C2131b.m64529b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        boolean padding;
        Rect m64514l = this.f9083a.m64514l();
        if (m64514l != null) {
            rect.set(m64514l);
            if ((m64514l.right | m64514l.left | m64514l.top | m64514l.bottom) != 0) {
                padding = true;
            } else {
                padding = false;
            }
        } else {
            Drawable drawable = this.f9085c;
            if (drawable != null) {
                padding = drawable.getPadding(rect);
            } else {
                padding = super.getPadding(rect);
            }
        }
        if (m64534e()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    /* renamed from: h */
    public void mo64499h(AbstractC2133d abstractC2133d) {
        this.f9083a = abstractC2133d;
        int i = this.f9089g;
        if (i >= 0) {
            Drawable m64519g = abstractC2133d.m64519g(i);
            this.f9085c = m64519g;
            if (m64519g != null) {
                m64535d(m64519g);
            }
        }
        this.f9086d = null;
    }

    /* renamed from: i */
    public final void m64531i(Resources resources) {
        this.f9083a.m64502z(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NonNull Drawable drawable) {
        AbstractC2133d abstractC2133d = this.f9083a;
        if (abstractC2133d != null) {
            abstractC2133d.m64511p();
        }
        if (drawable == this.f9085c && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f9083a.f9099C;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f9083a.m64509r();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f9086d;
        boolean z2 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f9086d = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f9085c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f9088f) {
                this.f9085c.setAlpha(this.f9087e);
            }
        }
        if (this.f9093k != 0) {
            this.f9093k = 0L;
            z = true;
        }
        if (this.f9092j != 0) {
            this.f9092j = 0L;
        } else {
            z2 = z;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f9090h && super.mutate() == this) {
            AbstractC2133d mo64500b = mo64500b();
            mo64500b.mo64491s();
            mo64499h(mo64500b);
            this.f9090h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9086d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f9085c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        return this.f9083a.m64504x(i, m64536c());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f9086d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f9085c;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(@NonNull int[] iArr) {
        Drawable drawable = this.f9086d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f9085c;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable, long j) {
        if (drawable == this.f9085c && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (!this.f9088f || this.f9087e != i) {
            this.f9088f = true;
            this.f9087e = i;
            Drawable drawable = this.f9085c;
            if (drawable != null) {
                if (this.f9092j == 0) {
                    drawable.setAlpha(i);
                } else {
                    m64537a(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        AbstractC2133d abstractC2133d = this.f9083a;
        if (abstractC2133d.f9099C != z) {
            abstractC2133d.f9099C = z;
            Drawable drawable = this.f9085c;
            if (drawable != null) {
                DrawableCompat.setAutoMirrored(drawable, z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        AbstractC2133d abstractC2133d = this.f9083a;
        abstractC2133d.f9101E = true;
        if (abstractC2133d.f9100D != colorFilter) {
            abstractC2133d.f9100D = colorFilter;
            Drawable drawable = this.f9085c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z) {
        AbstractC2133d abstractC2133d = this.f9083a;
        if (abstractC2133d.f9129x != z) {
            abstractC2133d.f9129x = z;
            Drawable drawable = this.f9085c;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setEnterFadeDuration(int i) {
        this.f9083a.f9097A = i;
    }

    public void setExitFadeDuration(int i) {
        this.f9083a.f9098B = i;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f9085c;
        if (drawable != null) {
            DrawableCompat.setHotspot(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f9084b;
        if (rect == null) {
            this.f9084b = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f9085c;
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
        AbstractC2133d abstractC2133d = this.f9083a;
        abstractC2133d.f9104H = true;
        if (abstractC2133d.f9102F != colorStateList) {
            abstractC2133d.f9102F = colorStateList;
            DrawableCompat.setTintList(this.f9085c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@NonNull PorterDuff.Mode mode) {
        AbstractC2133d abstractC2133d = this.f9083a;
        abstractC2133d.f9105I = true;
        if (abstractC2133d.f9103G != mode) {
            abstractC2133d.f9103G = mode;
            DrawableCompat.setTintMode(this.f9085c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f9086d;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f9085c;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@NonNull Drawable drawable, @NonNull Runnable runnable) {
        if (drawable == this.f9085c && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }
}
