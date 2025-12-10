package com.github.barteksc.pdfviewer.scroll;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.R;
import com.github.barteksc.pdfviewer.util.Util;

/* loaded from: classes3.dex */
public class DefaultScrollHandle extends RelativeLayout implements ScrollHandle {

    /* renamed from: a */
    public float f43686a;

    /* renamed from: b */
    public boolean f43687b;

    /* renamed from: c */
    public PDFView f43688c;
    protected Context context;

    /* renamed from: d */
    public float f43689d;

    /* renamed from: e */
    public Handler f43690e;

    /* renamed from: f */
    public Runnable f43691f;
    protected TextView textView;

    /* renamed from: com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle$a */
    /* loaded from: classes3.dex */
    public class RunnableC6156a implements Runnable {
        public RunnableC6156a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DefaultScrollHandle.this.hide();
        }
    }

    public DefaultScrollHandle(Context context) {
        this(context, false);
    }

    private void setPosition(float f) {
        int width;
        if (!Float.isInfinite(f) && !Float.isNaN(f)) {
            if (this.f43688c.isSwipeVertical()) {
                width = this.f43688c.getHeight();
            } else {
                width = this.f43688c.getWidth();
            }
            float f2 = width;
            float f3 = f - this.f43686a;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            } else if (f3 > f2 - Util.getDP(this.context, 40)) {
                f3 = f2 - Util.getDP(this.context, 40);
            }
            if (this.f43688c.isSwipeVertical()) {
                setY(f3);
            } else {
                setX(f3);
            }
            m49302a();
            invalidate();
        }
    }

    /* renamed from: a */
    public final void m49302a() {
        float x;
        float width;
        int width2;
        if (this.f43688c.isSwipeVertical()) {
            x = getY();
            width = getHeight();
            width2 = this.f43688c.getHeight();
        } else {
            x = getX();
            width = getWidth();
            width2 = this.f43688c.getWidth();
        }
        this.f43686a = ((x + this.f43686a) / width2) * width;
    }

    /* renamed from: b */
    public final boolean m49301b() {
        PDFView pDFView = this.f43688c;
        if (pDFView != null && pDFView.getPageCount() > 0 && !this.f43688c.documentFitsView()) {
            return true;
        }
        return false;
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void destroyLayout() {
        this.f43688c.removeView(this);
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void hide() {
        setVisibility(4);
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void hideDelayed() {
        this.f43690e.postDelayed(this.f43691f, 1000L);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.m49301b()
            if (r0 != 0) goto Lb
            boolean r5 = super.onTouchEvent(r5)
            return r5
        Lb:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 == r1) goto L25
            r2 = 2
            if (r0 == r2) goto L59
            r2 = 3
            if (r0 == r2) goto L25
            r2 = 5
            if (r0 == r2) goto L2e
            r2 = 6
            if (r0 == r2) goto L25
            boolean r5 = super.onTouchEvent(r5)
            return r5
        L25:
            r4.hideDelayed()
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f43688c
            r5.performPageSnap()
            return r1
        L2e:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f43688c
            r0.stopFling()
            android.os.Handler r0 = r4.f43690e
            java.lang.Runnable r2 = r4.f43691f
            r0.removeCallbacks(r2)
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f43688c
            boolean r0 = r0.isSwipeVertical()
            if (r0 == 0) goto L4e
            float r0 = r5.getRawY()
            float r2 = r4.getY()
            float r0 = r0 - r2
            r4.f43689d = r0
            goto L59
        L4e:
            float r0 = r5.getRawX()
            float r2 = r4.getX()
            float r0 = r0 - r2
            r4.f43689d = r0
        L59:
            com.github.barteksc.pdfviewer.PDFView r0 = r4.f43688c
            boolean r0 = r0.isSwipeVertical()
            r2 = 0
            if (r0 == 0) goto L7d
            float r5 = r5.getRawY()
            float r0 = r4.f43689d
            float r5 = r5 - r0
            float r0 = r4.f43686a
            float r5 = r5 + r0
            r4.setPosition(r5)
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f43688c
            float r0 = r4.f43686a
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.setPositionOffset(r0, r2)
            goto L97
        L7d:
            float r5 = r5.getRawX()
            float r0 = r4.f43689d
            float r5 = r5 - r0
            float r0 = r4.f43686a
            float r5 = r5 + r0
            r4.setPosition(r5)
            com.github.barteksc.pdfviewer.PDFView r5 = r4.f43688c
            float r0 = r4.f43686a
            int r3 = r4.getWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            r5.setPositionOffset(r0, r2)
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void setPageNum(int i) {
        String valueOf = String.valueOf(i);
        if (!this.textView.getText().equals(valueOf)) {
            this.textView.setText(valueOf);
        }
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void setScroll(float f) {
        int width;
        if (!shown()) {
            show();
        } else {
            this.f43690e.removeCallbacks(this.f43691f);
        }
        PDFView pDFView = this.f43688c;
        if (pDFView != null) {
            if (pDFView.isSwipeVertical()) {
                width = this.f43688c.getHeight();
            } else {
                width = this.f43688c.getWidth();
            }
            setPosition(width * f);
        }
    }

    public void setTextColor(int i) {
        this.textView.setTextColor(i);
    }

    public void setTextSize(int i) {
        this.textView.setTextSize(1, i);
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void setupLayout(PDFView pDFView) {
        Drawable drawable;
        int i;
        int i2 = 40;
        int i3 = 65;
        if (pDFView.isSwipeVertical()) {
            if (this.f43687b) {
                drawable = ContextCompat.getDrawable(this.context, R.drawable.default_scroll_handle_left);
                i = 9;
            } else {
                drawable = ContextCompat.getDrawable(this.context, R.drawable.default_scroll_handle_right);
                i = 11;
            }
            i2 = 65;
            i3 = 40;
        } else if (this.f43687b) {
            drawable = ContextCompat.getDrawable(this.context, R.drawable.default_scroll_handle_top);
            i = 10;
        } else {
            drawable = ContextCompat.getDrawable(this.context, R.drawable.default_scroll_handle_bottom);
            i = 12;
        }
        setBackground(drawable);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(Util.getDP(this.context, i2), Util.getDP(this.context, i3));
        layoutParams.setMargins(0, 0, 0, 0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13, -1);
        addView(this.textView, layoutParams2);
        layoutParams.addRule(i);
        pDFView.addView(this, layoutParams);
        this.f43688c = pDFView;
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public void show() {
        setVisibility(0);
    }

    @Override // com.github.barteksc.pdfviewer.scroll.ScrollHandle
    public boolean shown() {
        if (getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public DefaultScrollHandle(Context context, boolean z) {
        super(context);
        this.f43686a = 0.0f;
        this.f43690e = new Handler();
        this.f43691f = new RunnableC6156a();
        this.context = context;
        this.f43687b = z;
        this.textView = new TextView(context);
        setVisibility(4);
        setTextColor(-16777216);
        setTextSize(16);
    }
}