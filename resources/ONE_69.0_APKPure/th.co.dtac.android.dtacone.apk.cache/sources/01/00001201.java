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

/* renamed from: Sx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class HandlerC18514Sx1 extends Handler {

    /* renamed from: a */
    public PDFView f6061a;

    /* renamed from: b */
    public RectF f6062b;

    /* renamed from: c */
    public Rect f6063c;

    /* renamed from: d */
    public Matrix f6064d;

    /* renamed from: e */
    public boolean f6065e;

    /* renamed from: Sx1$a */
    /* loaded from: classes3.dex */
    public class RunnableC1330a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ PagePart f6066a;

        public RunnableC1330a(PagePart pagePart) {
            this.f6066a = pagePart;
        }

        @Override // java.lang.Runnable
        public void run() {
            HandlerC18514Sx1.this.f6061a.onBitmapRendered(this.f6066a);
        }
    }

    /* renamed from: Sx1$b */
    /* loaded from: classes3.dex */
    public class RunnableC1331b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ PageRenderingException f6068a;

        public RunnableC1331b(PageRenderingException pageRenderingException) {
            this.f6068a = pageRenderingException;
        }

        @Override // java.lang.Runnable
        public void run() {
            HandlerC18514Sx1.this.f6061a.m49307x(this.f6068a);
        }
    }

    /* renamed from: Sx1$c */
    /* loaded from: classes3.dex */
    public class C1332c {

        /* renamed from: a */
        public float f6070a;

        /* renamed from: b */
        public float f6071b;

        /* renamed from: c */
        public RectF f6072c;

        /* renamed from: d */
        public int f6073d;

        /* renamed from: e */
        public boolean f6074e;

        /* renamed from: f */
        public int f6075f;

        /* renamed from: g */
        public boolean f6076g;

        /* renamed from: h */
        public boolean f6077h;

        public C1332c(float f, float f2, RectF rectF, int i, boolean z, int i2, boolean z2, boolean z3) {
            this.f6073d = i;
            this.f6070a = f;
            this.f6071b = f2;
            this.f6072c = rectF;
            this.f6074e = z;
            this.f6075f = i2;
            this.f6076g = z2;
            this.f6077h = z3;
        }
    }

    public HandlerC18514Sx1(Looper looper, PDFView pDFView) {
        super(looper);
        this.f6062b = new RectF();
        this.f6063c = new Rect();
        this.f6064d = new Matrix();
        this.f6065e = false;
        this.f6061a = pDFView;
    }

    /* renamed from: b */
    public void m66436b(int i, float f, float f2, RectF rectF, boolean z, int i2, boolean z2, boolean z3) {
        sendMessage(obtainMessage(1, new C1332c(f, f2, rectF, i, z, i2, z2, z3)));
    }

    /* renamed from: c */
    public final void m66435c(int i, int i2, RectF rectF) {
        this.f6064d.reset();
        float f = i;
        float f2 = i2;
        this.f6064d.postTranslate((-rectF.left) * f, (-rectF.top) * f2);
        this.f6064d.postScale(1.0f / rectF.width(), 1.0f / rectF.height());
        this.f6062b.set(0.0f, 0.0f, f, f2);
        this.f6064d.mapRect(this.f6062b);
        this.f6062b.round(this.f6063c);
    }

    /* renamed from: d */
    public final PagePart m66434d(C1332c c1332c) {
        Bitmap.Config config;
        C17705Gk1 c17705Gk1 = this.f6061a.f43614h;
        c17705Gk1.m68217t(c1332c.f6073d);
        int round = Math.round(c1332c.f6070a);
        int round2 = Math.round(c1332c.f6071b);
        if (round != 0 && round2 != 0 && !c17705Gk1.m68216u(c1332c.f6073d)) {
            try {
                if (c1332c.f6076g) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap createBitmap = Bitmap.createBitmap(round, round2, config);
                m66435c(round, round2, c1332c.f6072c);
                c17705Gk1.m68211z(createBitmap, c1332c.f6073d, this.f6063c, c1332c.f6077h);
                return new PagePart(c1332c.f6073d, createBitmap, c1332c.f6072c, c1332c.f6074e, c1332c.f6075f);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    /* renamed from: e */
    public void m66433e() {
        this.f6065e = true;
    }

    /* renamed from: f */
    public void m66432f() {
        this.f6065e = false;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            PagePart m66434d = m66434d((C1332c) message.obj);
            if (m66434d != null) {
                if (this.f6065e) {
                    this.f6061a.post(new RunnableC1330a(m66434d));
                } else {
                    m66434d.getRenderedBitmap().recycle();
                }
            }
        } catch (PageRenderingException e) {
            this.f6061a.post(new RunnableC1331b(e));
        }
    }
}