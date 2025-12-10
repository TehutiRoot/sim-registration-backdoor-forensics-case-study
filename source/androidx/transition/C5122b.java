package androidx.transition;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.transition.b */
/* loaded from: classes2.dex */
public class C5122b extends ViewGroup implements InterfaceC21185n60 {

    /* renamed from: a */
    public ViewGroup f37831a;

    /* renamed from: b */
    public View f37832b;

    /* renamed from: c */
    public final View f37833c;

    /* renamed from: d */
    public int f37834d;

    /* renamed from: e */
    public Matrix f37835e;

    /* renamed from: f */
    public final ViewTreeObserver.OnPreDrawListener f37836f;

    /* renamed from: androidx.transition.b$a */
    /* loaded from: classes2.dex */
    public class ViewTreeObserver$OnPreDrawListenerC5123a implements ViewTreeObserver.OnPreDrawListener {
        public ViewTreeObserver$OnPreDrawListenerC5123a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            View view;
            ViewCompat.postInvalidateOnAnimation(C5122b.this);
            C5122b c5122b = C5122b.this;
            ViewGroup viewGroup = c5122b.f37831a;
            if (viewGroup != null && (view = c5122b.f37832b) != null) {
                viewGroup.endViewTransition(view);
                ViewCompat.postInvalidateOnAnimation(C5122b.this.f37831a);
                C5122b c5122b2 = C5122b.this;
                c5122b2.f37831a = null;
                c5122b2.f37832b = null;
                return true;
            }
            return true;
        }
    }

    public C5122b(View view) {
        super(view.getContext());
        this.f37836f = new ViewTreeObserver$OnPreDrawListenerC5123a();
        this.f37833c = view;
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    /* renamed from: b */
    public static C5122b m52595b(View view, ViewGroup viewGroup, Matrix matrix) {
        int i;
        C5121a c5121a;
        if (view.getParent() instanceof ViewGroup) {
            C5121a m52601b = C5121a.m52601b(viewGroup);
            C5122b m52592e = m52592e(view);
            if (m52592e != null && (c5121a = (C5121a) m52592e.getParent()) != m52601b) {
                i = m52592e.f37834d;
                c5121a.removeView(m52592e);
                m52592e = null;
            } else {
                i = 0;
            }
            if (m52592e == null) {
                if (matrix == null) {
                    matrix = new Matrix();
                    m52594c(view, viewGroup, matrix);
                }
                m52592e = new C5122b(view);
                m52592e.m52589h(matrix);
                if (m52601b == null) {
                    m52601b = new C5121a(viewGroup);
                } else {
                    m52601b.m52596g();
                }
                m52593d(viewGroup, m52601b);
                m52593d(viewGroup, m52592e);
                m52601b.m52602a(m52592e);
                m52592e.f37834d = i;
            } else if (matrix != null) {
                m52592e.m52589h(matrix);
            }
            m52592e.f37834d++;
            return m52592e;
        }
        throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
    }

    /* renamed from: c */
    public static void m52594c(View view, ViewGroup viewGroup, Matrix matrix) {
        ViewGroup viewGroup2 = (ViewGroup) view.getParent();
        matrix.reset();
        AbstractC22210t32.m22521j(viewGroup2, matrix);
        matrix.preTranslate(-viewGroup2.getScrollX(), -viewGroup2.getScrollY());
        AbstractC22210t32.m22520k(viewGroup, matrix);
    }

    /* renamed from: d */
    public static void m52593d(View view, View view2) {
        AbstractC22210t32.m22524g(view2, view2.getLeft(), view2.getTop(), view2.getLeft() + view.getWidth(), view2.getTop() + view.getHeight());
    }

    /* renamed from: e */
    public static C5122b m52592e(View view) {
        return (C5122b) view.getTag(R.id.ghost_view);
    }

    /* renamed from: f */
    public static void m52591f(View view) {
        C5122b m52592e = m52592e(view);
        if (m52592e != null) {
            int i = m52592e.f37834d - 1;
            m52592e.f37834d = i;
            if (i <= 0) {
                ((C5121a) m52592e.getParent()).removeView(m52592e);
            }
        }
    }

    /* renamed from: g */
    public static void m52590g(View view, C5122b c5122b) {
        view.setTag(R.id.ghost_view, c5122b);
    }

    @Override // p000.InterfaceC21185n60
    /* renamed from: a */
    public void mo25968a(ViewGroup viewGroup, View view) {
        this.f37831a = viewGroup;
        this.f37832b = view;
    }

    /* renamed from: h */
    public void m52589h(Matrix matrix) {
        this.f37835e = matrix;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m52590g(this.f37833c, this);
        this.f37833c.getViewTreeObserver().addOnPreDrawListener(this.f37836f);
        AbstractC22210t32.m22522i(this.f37833c, 4);
        if (this.f37833c.getParent() != null) {
            ((View) this.f37833c.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f37833c.getViewTreeObserver().removeOnPreDrawListener(this.f37836f);
        AbstractC22210t32.m22522i(this.f37833c, 0);
        m52590g(this.f37833c, null);
        if (this.f37833c.getParent() != null) {
            ((View) this.f37833c.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        AbstractC16915vl.m1006a(canvas, true);
        canvas.setMatrix(this.f37835e);
        AbstractC22210t32.m22522i(this.f37833c, 0);
        this.f37833c.invalidate();
        AbstractC22210t32.m22522i(this.f37833c, 4);
        drawChild(canvas, this.f37833c, getDrawingTime());
        AbstractC16915vl.m1006a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View, p000.InterfaceC21185n60
    public void setVisibility(int i) {
        int i2;
        super.setVisibility(i);
        if (m52592e(this.f37833c) == this) {
            if (i == 0) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            AbstractC22210t32.m22522i(this.f37833c, i2);
        }
    }
}
