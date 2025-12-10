package p000;

import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.model.LinkTapEvent;
import com.github.barteksc.pdfviewer.scroll.ScrollHandle;
import com.github.barteksc.pdfviewer.util.Constants;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.util.SizeF;

/* renamed from: eK */
/* loaded from: classes3.dex */
public class GestureDetector$OnGestureListenerC10138eK implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: a */
    public PDFView f61538a;

    /* renamed from: b */
    public C0630J4 f61539b;

    /* renamed from: c */
    public GestureDetector f61540c;

    /* renamed from: d */
    public ScaleGestureDetector f61541d;

    /* renamed from: e */
    public boolean f61542e = false;

    /* renamed from: f */
    public boolean f61543f = false;

    /* renamed from: g */
    public boolean f61544g = false;

    public GestureDetector$OnGestureListenerC10138eK(PDFView pDFView, C0630J4 c0630j4) {
        this.f61538a = pDFView;
        this.f61539b = c0630j4;
        this.f61540c = new GestureDetector(pDFView.getContext(), this);
        this.f61541d = new ScaleGestureDetector(pDFView.getContext(), this);
        pDFView.setOnTouchListener(this);
    }

    /* renamed from: a */
    public final boolean m31722a(float f, float f2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (this.f61538a.isSwipeVertical()) {
            if (abs2 <= abs) {
                return false;
            }
        } else if (abs <= abs2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m31721b(float f, float f2) {
        float f3;
        int m68219r;
        int m68224m;
        PDFView pDFView = this.f61538a;
        C17705Gk1 c17705Gk1 = pDFView.f43614h;
        if (c17705Gk1 == null) {
            return false;
        }
        float f4 = (-pDFView.getCurrentXOffset()) + f;
        float f5 = (-this.f61538a.getCurrentYOffset()) + f2;
        if (this.f61538a.isSwipeVertical()) {
            f3 = f5;
        } else {
            f3 = f4;
        }
        int m68227j = c17705Gk1.m68227j(f3, this.f61538a.getZoom());
        SizeF m68220q = c17705Gk1.m68220q(m68227j, this.f61538a.getZoom());
        if (this.f61538a.isSwipeVertical()) {
            m68224m = (int) c17705Gk1.m68219r(m68227j, this.f61538a.getZoom());
            m68219r = (int) c17705Gk1.m68224m(m68227j, this.f61538a.getZoom());
        } else {
            m68219r = (int) c17705Gk1.m68219r(m68227j, this.f61538a.getZoom());
            m68224m = (int) c17705Gk1.m68224m(m68227j, this.f61538a.getZoom());
        }
        int i = m68224m;
        int i2 = m68219r;
        for (PdfDocument.Link link : c17705Gk1.m68225l(m68227j)) {
            RectF m68218s = c17705Gk1.m68218s(m68227j, i, i2, (int) m68220q.getWidth(), (int) m68220q.getHeight(), link.getBounds());
            m68218s.sort();
            if (m68218s.contains(f4, f5)) {
                this.f61538a.f43625s.callLinkHandler(new LinkTapEvent(f, f2, f4, f5, m68218s, link));
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m31720c() {
        this.f61544g = false;
    }

    /* renamed from: d */
    public void m31719d() {
        this.f61540c.setIsLongpressEnabled(false);
    }

    /* renamed from: e */
    public void m31718e() {
        this.f61544g = true;
    }

    /* renamed from: f */
    public final void m31717f() {
        ScrollHandle scrollHandle = this.f61538a.getScrollHandle();
        if (scrollHandle != null && scrollHandle.shown()) {
            scrollHandle.hideDelayed();
        }
    }

    /* renamed from: g */
    public final void m31716g(float f, float f2) {
        float f3;
        float f4;
        int currentXOffset = (int) this.f61538a.getCurrentXOffset();
        int currentYOffset = (int) this.f61538a.getCurrentYOffset();
        PDFView pDFView = this.f61538a;
        C17705Gk1 c17705Gk1 = pDFView.f43614h;
        float f5 = -c17705Gk1.m68224m(pDFView.getCurrentPage(), this.f61538a.getZoom());
        float m68226k = f5 - c17705Gk1.m68226k(this.f61538a.getCurrentPage(), this.f61538a.getZoom());
        float f6 = 0.0f;
        if (this.f61538a.isSwipeVertical()) {
            f4 = -(this.f61538a.toCurrentScale(c17705Gk1.m68229h()) - this.f61538a.getWidth());
            f3 = m68226k + this.f61538a.getHeight();
            f6 = f5;
            f5 = 0.0f;
        } else {
            float width = m68226k + this.f61538a.getWidth();
            f3 = -(this.f61538a.toCurrentScale(c17705Gk1.m68231f()) - this.f61538a.getHeight());
            f4 = width;
        }
        this.f61539b.m67931g(currentXOffset, currentYOffset, (int) f, (int) f2, (int) f4, (int) f5, (int) f3, (int) f6);
    }

    /* renamed from: h */
    public final void m31715h(MotionEvent motionEvent) {
        this.f61538a.loadPages();
        m31717f();
        if (!this.f61539b.m67932f()) {
            this.f61538a.performPageSnap();
        }
    }

    /* renamed from: i */
    public final void m31714i(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x;
        float x2;
        if (!m31722a(f, f2)) {
            return;
        }
        int i = -1;
        if (!this.f61538a.isSwipeVertical() ? f <= 0.0f : f2 <= 0.0f) {
            i = 1;
        }
        if (this.f61538a.isSwipeVertical()) {
            x = motionEvent2.getY();
            x2 = motionEvent.getY();
        } else {
            x = motionEvent2.getX();
            x2 = motionEvent.getX();
        }
        float f3 = x - x2;
        int max = Math.max(0, Math.min(this.f61538a.getPageCount() - 1, this.f61538a.m49315p(this.f61538a.getCurrentXOffset() - (this.f61538a.getZoom() * f3), this.f61538a.getCurrentYOffset() - (f3 * this.f61538a.getZoom())) + i));
        this.f61539b.m67930h(-this.f61538a.m49331A(max, this.f61538a.m49314q(max)));
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.f61538a.m49313r()) {
            return false;
        }
        if (this.f61538a.getZoom() < this.f61538a.getMidZoom()) {
            this.f61538a.zoomWithAnimation(motionEvent.getX(), motionEvent.getY(), this.f61538a.getMidZoom());
            return true;
        } else if (this.f61538a.getZoom() < this.f61538a.getMaxZoom()) {
            this.f61538a.zoomWithAnimation(motionEvent.getX(), motionEvent.getY(), this.f61538a.getMaxZoom());
            return true;
        } else {
            this.f61538a.resetZoomWithAnimation();
            return true;
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f61539b.m67925m();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float currentScale;
        int height;
        if (!this.f61538a.isSwipeEnabled()) {
            return false;
        }
        if (this.f61538a.isPageFlingEnabled()) {
            if (this.f61538a.pageFillsScreen()) {
                m31716g(f, f2);
            } else {
                m31714i(motionEvent, motionEvent2, f, f2);
            }
            return true;
        }
        int currentXOffset = (int) this.f61538a.getCurrentXOffset();
        int currentYOffset = (int) this.f61538a.getCurrentYOffset();
        PDFView pDFView = this.f61538a;
        C17705Gk1 c17705Gk1 = pDFView.f43614h;
        if (pDFView.isSwipeVertical()) {
            f3 = -(this.f61538a.toCurrentScale(c17705Gk1.m68229h()) - this.f61538a.getWidth());
            currentScale = c17705Gk1.m68232e(this.f61538a.getZoom());
            height = this.f61538a.getHeight();
        } else {
            f3 = -(c17705Gk1.m68232e(this.f61538a.getZoom()) - this.f61538a.getWidth());
            currentScale = this.f61538a.toCurrentScale(c17705Gk1.m68231f());
            height = this.f61538a.getHeight();
        }
        this.f61539b.m67931g(currentXOffset, currentYOffset, (int) f, (int) f2, (int) f3, 0, (int) (-(currentScale - height)), 0);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f61538a.f43625s.callOnLongPress(motionEvent);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float zoom = this.f61538a.getZoom() * scaleFactor;
        float min = Math.min(Constants.Pinch.MINIMUM_ZOOM, this.f61538a.getMinZoom());
        float min2 = Math.min(Constants.Pinch.MAXIMUM_ZOOM, this.f61538a.getMaxZoom());
        if (zoom < min) {
            scaleFactor = min / this.f61538a.getZoom();
        } else if (zoom > min2) {
            scaleFactor = min2 / this.f61538a.getZoom();
        }
        this.f61538a.zoomCenteredRelativeTo(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f61543f = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f61538a.loadPages();
        m31717f();
        this.f61543f = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f61542e = true;
        if (this.f61538a.isZooming() || this.f61538a.isSwipeEnabled()) {
            this.f61538a.moveRelativeTo(-f, -f2);
        }
        if (!this.f61543f || this.f61538a.doRenderDuringScale()) {
            this.f61538a.m49308w();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ScrollHandle scrollHandle;
        boolean callOnTap = this.f61538a.f43625s.callOnTap(motionEvent);
        boolean m31721b = m31721b(motionEvent.getX(), motionEvent.getY());
        if (!callOnTap && !m31721b && (scrollHandle = this.f61538a.getScrollHandle()) != null && !this.f61538a.documentFitsView()) {
            if (!scrollHandle.shown()) {
                scrollHandle.show();
            } else {
                scrollHandle.hide();
            }
        }
        this.f61538a.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        if (!this.f61544g) {
            return false;
        }
        boolean onTouchEvent = this.f61541d.onTouchEvent(motionEvent);
        if (!this.f61540c.onTouchEvent(motionEvent) && !onTouchEvent) {
            z = false;
        } else {
            z = true;
        }
        if (motionEvent.getAction() == 1 && this.f61542e) {
            this.f61542e = false;
            m31715h(motionEvent);
        }
        return z;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }
}