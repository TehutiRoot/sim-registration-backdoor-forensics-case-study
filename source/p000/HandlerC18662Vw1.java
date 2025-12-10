package p000;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.github.barteksc.pdfviewer.model.PagePart;

/* renamed from: Vw1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class HandlerC18662Vw1 extends Handler {

    /* renamed from: a */
    public PDFView f6933a;

    /* renamed from: b */
    public RectF f6934b;

    /* renamed from: c */
    public Rect f6935c;

    /* renamed from: d */
    public Matrix f6936d;

    /* renamed from: e */
    public boolean f6937e;

    /* renamed from: Vw1$a */
    /* loaded from: classes3.dex */
    public class RunnableC1573a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ PagePart f6938a;

        public RunnableC1573a(PagePart pagePart) {
            this.f6938a = pagePart;
        }

        @Override // java.lang.Runnable
        public void run() {
            HandlerC18662Vw1.this.f6933a.onBitmapRendered(this.f6938a);
        }
    }

    /* renamed from: Vw1$b */
    /* loaded from: classes3.dex */
    public class RunnableC1574b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ PageRenderingException f6940a;

        public RunnableC1574b(PageRenderingException pageRenderingException) {
            this.f6940a = pageRenderingException;
        }

        @Override // java.lang.Runnable
        public void run() {
            HandlerC18662Vw1.this.f6933a.m49310x(this.f6940a);
        }
    }

    /* renamed from: Vw1$c */
    /* loaded from: classes3.dex */
    public class C1575c {

        /* renamed from: a */
        public float f6942a;

        /* renamed from: b */
        public float f6943b;

        /* renamed from: c */
        public RectF f6944c;

        /* renamed from: d */
        public int f6945d;

        /* renamed from: e */
        public boolean f6946e;

        /* renamed from: f */
        public int f6947f;

        /* renamed from: g */
        public boolean f6948g;

        /* renamed from: h */
        public boolean f6949h;

        public C1575c(float f, float f2, RectF rectF, int i, boolean z, int i2, boolean z2, boolean z3) {
            this.f6945d = i;
            this.f6942a = f;
            this.f6943b = f2;
            this.f6944c = rectF;
            this.f6946e = z;
            this.f6947f = i2;
            this.f6948g = z2;
            this.f6949h = z3;
        }
    }

    public HandlerC18662Vw1(Looper looper, PDFView pDFView) {
        super(looper);
        this.f6934b = new RectF();
        this.f6935c = new Rect();
        this.f6936d = new Matrix();
        this.f6937e = false;
        this.f6933a = pDFView;
    }

    /* renamed from: b */
    public void m65731b(int i, float f, float f2, RectF rectF, boolean z, int i2, boolean z2, boolean z3) {
        sendMessage(obtainMessage(1, new C1575c(f, f2, rectF, i, z, i2, z2, z3)));
    }

    /* renamed from: c */
    public final void m65730c(int i, int i2, RectF rectF) {
        this.f6936d.reset();
        float f = i;
        float f2 = i2;
        this.f6936d.postTranslate((-rectF.left) * f, (-rectF.top) * f2);
        this.f6936d.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
        this.f6934b.set(0.0f, 0.0f, f, f2);
        this.f6936d.mapRect(this.f6934b);
        this.f6934b.round(this.f6935c);
    }

    /* renamed from: d */
    public final PagePart m65729d(C1575c c1575c) {
        Bitmap.Config config;
        C17865Jj1 c17865Jj1 = this.f6933a.f43602h;
        c17865Jj1.m67697t(c1575c.f6945d);
        int round = Math.round(c1575c.f6942a);
        int round2 = Math.round(c1575c.f6943b);
        if (round != 0 && round2 != 0 && !c17865Jj1.m67696u(c1575c.f6945d)) {
            try {
                if (c1575c.f6948g) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap createBitmap = Bitmap.createBitmap(round, round2, config);
                m65730c(round, round2, c1575c.f6944c);
                c17865Jj1.m67691z(createBitmap, c1575c.f6945d, this.f6935c, c1575c.f6949h);
                return new PagePart(c1575c.f6945d, createBitmap, c1575c.f6944c, c1575c.f6946e, c1575c.f6947f);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public void m65728e() {
        this.f6937e = true;
    }

    /* renamed from: f */
    public void m65727f() {
        this.f6937e = false;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            PagePart m65729d = m65729d((C1575c) message.obj);
            if (m65729d != null) {
                if (this.f6937e) {
                    this.f6933a.post(new RunnableC1573a(m65729d));
                } else {
                    m65729d.getRenderedBitmap().recycle();
                }
            }
        } catch (PageRenderingException e) {
            this.f6933a.post(new RunnableC1574b(e));
        }
    }
}
