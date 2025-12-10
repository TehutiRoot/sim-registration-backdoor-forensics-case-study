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

/* renamed from: dK */
/* loaded from: classes3.dex */
public class GestureDetector$OnGestureListenerC10063dK implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener {

    /* renamed from: a */
    public PDFView f61136a;

    /* renamed from: b */
    public C0643J4 f61137b;

    /* renamed from: c */
    public GestureDetector f61138c;

    /* renamed from: d */
    public ScaleGestureDetector f61139d;

    /* renamed from: e */
    public boolean f61140e = false;

    /* renamed from: f */
    public boolean f61141f = false;

    /* renamed from: g */
    public boolean f61142g = false;

    public GestureDetector$OnGestureListenerC10063dK(PDFView pDFView, C0643J4 c0643j4) {
        this.f61136a = pDFView;
        this.f61137b = c0643j4;
        this.f61138c = new GestureDetector(pDFView.getContext(), this);
        this.f61139d = new ScaleGestureDetector(pDFView.getContext(), this);
        pDFView.setOnTouchListener(this);
    }

    /* renamed from: a */
    public final boolean m31906a(float f, float f2) {
        float abs = Math.abs(f);
        float abs2 = Math.abs(f2);
        if (this.f61136a.isSwipeVertical()) {
            if (abs2 <= abs) {
                return false;
            }
        } else if (abs <= abs2) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean m31905b(float f, float f2) {
        float f3;
        int m67699r;
        int m67704m;
        PDFView pDFView = this.f61136a;
        C17865Jj1 c17865Jj1 = pDFView.f43602h;
        if (c17865Jj1 == null) {
            return false;
        }
        float f4 = (-pDFView.getCurrentXOffset()) + f;
        float f5 = (-this.f61136a.getCurrentYOffset()) + f2;
        if (this.f61136a.isSwipeVertical()) {
            f3 = f5;
        } else {
            f3 = f4;
        }
        int m67707j = c17865Jj1.m67707j(f3, this.f61136a.getZoom());
        SizeF m67700q = c17865Jj1.m67700q(m67707j, this.f61136a.getZoom());
        if (this.f61136a.isSwipeVertical()) {
            m67704m = (int) c17865Jj1.m67699r(m67707j, this.f61136a.getZoom());
            m67699r = (int) c17865Jj1.m67704m(m67707j, this.f61136a.getZoom());
        } else {
            m67699r = (int) c17865Jj1.m67699r(m67707j, this.f61136a.getZoom());
            m67704m = (int) c17865Jj1.m67704m(m67707j, this.f61136a.getZoom());
        }
        int i = m67704m;
        int i2 = m67699r;
        for (PdfDocument.Link link : c17865Jj1.m67705l(m67707j)) {
            RectF m67698s = c17865Jj1.m67698s(m67707j, i, i2, (int) m67700q.getWidth(), (int) m67700q.getHeight(), link.getBounds());
            m67698s.sort();
            if (m67698s.contains(f4, f5)) {
                this.f61136a.f43613s.callLinkHandler(new LinkTapEvent(f, f2, f4, f5, m67698s, link));
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void m31904c() {
        this.f61142g = false;
    }

    /* renamed from: d */
    public void m31903d() {
        this.f61138c.setIsLongpressEnabled(false);
    }

    /* renamed from: e */
    public void m31902e() {
        this.f61142g = true;
    }

    /* renamed from: f */
    public final void m31901f() {
        ScrollHandle scrollHandle = this.f61136a.getScrollHandle();
        if (scrollHandle != null && scrollHandle.shown()) {
            scrollHandle.hideDelayed();
        }
    }

    /* renamed from: g */
    public final void m31900g(float f, float f2) {
        float f3;
        float f4;
        int currentXOffset = (int) this.f61136a.getCurrentXOffset();
        int currentYOffset = (int) this.f61136a.getCurrentYOffset();
        PDFView pDFView = this.f61136a;
        C17865Jj1 c17865Jj1 = pDFView.f43602h;
        float f5 = -c17865Jj1.m67704m(pDFView.getCurrentPage(), this.f61136a.getZoom());
        float m67706k = f5 - c17865Jj1.m67706k(this.f61136a.getCurrentPage(), this.f61136a.getZoom());
        float f6 = 0.0f;
        if (this.f61136a.isSwipeVertical()) {
            f4 = -(this.f61136a.toCurrentScale(c17865Jj1.m67709h()) - this.f61136a.getWidth());
            f3 = m67706k + this.f61136a.getHeight();
            f6 = f5;
            f5 = 0.0f;
        } else {
            float width = m67706k + this.f61136a.getWidth();
            f3 = -(this.f61136a.toCurrentScale(c17865Jj1.m67711f()) - this.f61136a.getHeight());
            f4 = width;
        }
        this.f61137b.m67808g(currentXOffset, currentYOffset, (int) f, (int) f2, (int) f4, (int) f5, (int) f3, (int) f6);
    }

    /* renamed from: h */
    public final void m31899h(MotionEvent motionEvent) {
        this.f61136a.loadPages();
        m31901f();
        if (!this.f61137b.m67809f()) {
            this.f61136a.performPageSnap();
        }
    }

    /* renamed from: i */
    public final void m31898i(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x;
        float x2;
        if (!m31906a(f, f2)) {
            return;
        }
        int i = -1;
        if (!this.f61136a.isSwipeVertical() ? f <= 0.0f : f2 <= 0.0f) {
            i = 1;
        }
        if (this.f61136a.isSwipeVertical()) {
            x = motionEvent2.getY();
            x2 = motionEvent.getY();
        } else {
            x = motionEvent2.getX();
            x2 = motionEvent.getX();
        }
        float f3 = x - x2;
        int max = Math.max(0, Math.min(this.f61136a.getPageCount() - 1, this.f61136a.m49318p(this.f61136a.getCurrentXOffset() - (this.f61136a.getZoom() * f3), this.f61136a.getCurrentYOffset() - (f3 * this.f61136a.getZoom())) + i));
        this.f61137b.m67807h(-this.f61136a.m49334A(max, this.f61136a.m49317q(max)));
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent motionEvent) {
        if (!this.f61136a.m49316r()) {
            return false;
        }
        if (this.f61136a.getZoom() < this.f61136a.getMidZoom()) {
            this.f61136a.zoomWithAnimation(motionEvent.getX(), motionEvent.getY(), this.f61136a.getMidZoom());
            return true;
        } else if (this.f61136a.getZoom() < this.f61136a.getMaxZoom()) {
            this.f61136a.zoomWithAnimation(motionEvent.getX(), motionEvent.getY(), this.f61136a.getMaxZoom());
            return true;
        } else {
            this.f61136a.resetZoomWithAnimation();
            return true;
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f61137b.m67802m();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float currentScale;
        int height;
        if (!this.f61136a.isSwipeEnabled()) {
            return false;
        }
        if (this.f61136a.isPageFlingEnabled()) {
            if (this.f61136a.pageFillsScreen()) {
                m31900g(f, f2);
            } else {
                m31898i(motionEvent, motionEvent2, f, f2);
            }
            return true;
        }
        int currentXOffset = (int) this.f61136a.getCurrentXOffset();
        int currentYOffset = (int) this.f61136a.getCurrentYOffset();
        PDFView pDFView = this.f61136a;
        C17865Jj1 c17865Jj1 = pDFView.f43602h;
        if (pDFView.isSwipeVertical()) {
            f3 = -(this.f61136a.toCurrentScale(c17865Jj1.m67709h()) - this.f61136a.getWidth());
            currentScale = c17865Jj1.m67712e(this.f61136a.getZoom());
            height = this.f61136a.getHeight();
        } else {
            f3 = -(c17865Jj1.m67712e(this.f61136a.getZoom()) - this.f61136a.getWidth());
            currentScale = this.f61136a.toCurrentScale(c17865Jj1.m67711f());
            height = this.f61136a.getHeight();
        }
        this.f61137b.m67808g(currentXOffset, currentYOffset, (int) f, (int) f2, (int) f3, 0, (int) (-(currentScale - height)), 0);
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
        this.f61136a.f43613s.callOnLongPress(motionEvent);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        float zoom = this.f61136a.getZoom() * scaleFactor;
        float min = Math.min(Constants.Pinch.MINIMUM_ZOOM, this.f61136a.getMinZoom());
        float min2 = Math.min(Constants.Pinch.MAXIMUM_ZOOM, this.f61136a.getMaxZoom());
        if (zoom < min) {
            scaleFactor = min / this.f61136a.getZoom();
        } else if (zoom > min2) {
            scaleFactor = min2 / this.f61136a.getZoom();
        }
        this.f61136a.zoomCenteredRelativeTo(scaleFactor, new PointF(scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY()));
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.f61141f = true;
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.f61136a.loadPages();
        m31901f();
        this.f61141f = false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        this.f61140e = true;
        if (this.f61136a.isZooming() || this.f61136a.isSwipeEnabled()) {
            this.f61136a.moveRelativeTo(-f, -f2);
        }
        if (!this.f61141f || this.f61136a.doRenderDuringScale()) {
            this.f61136a.m49311w();
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ScrollHandle scrollHandle;
        boolean callOnTap = this.f61136a.f43613s.callOnTap(motionEvent);
        boolean m31905b = m31905b(motionEvent.getX(), motionEvent.getY());
        if (!callOnTap && !m31905b && (scrollHandle = this.f61136a.getScrollHandle()) != null && !this.f61136a.documentFitsView()) {
            if (!scrollHandle.shown()) {
                scrollHandle.show();
            } else {
                scrollHandle.hide();
            }
        }
        this.f61136a.performClick();
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        if (!this.f61142g) {
            return false;
        }
        boolean onTouchEvent = this.f61139d.onTouchEvent(motionEvent);
        if (!this.f61138c.onTouchEvent(motionEvent) && !onTouchEvent) {
            z = false;
        } else {
            z = true;
        }
        if (motionEvent.getAction() == 1 && this.f61140e) {
            this.f61140e = false;
            m31899h(motionEvent);
        }
        return z;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }
}
