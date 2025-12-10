package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.core.internal.view.SupportMenu;
import com.github.barteksc.pdfviewer.exception.PageRenderingException;
import com.github.barteksc.pdfviewer.link.DefaultLinkHandler;
import com.github.barteksc.pdfviewer.link.LinkHandler;
import com.github.barteksc.pdfviewer.listener.Callbacks;
import com.github.barteksc.pdfviewer.listener.OnDrawListener;
import com.github.barteksc.pdfviewer.listener.OnErrorListener;
import com.github.barteksc.pdfviewer.listener.OnLoadCompleteListener;
import com.github.barteksc.pdfviewer.listener.OnLongPressListener;
import com.github.barteksc.pdfviewer.listener.OnPageChangeListener;
import com.github.barteksc.pdfviewer.listener.OnPageErrorListener;
import com.github.barteksc.pdfviewer.listener.OnPageScrollListener;
import com.github.barteksc.pdfviewer.listener.OnRenderListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
import com.github.barteksc.pdfviewer.model.PagePart;
import com.github.barteksc.pdfviewer.scroll.ScrollHandle;
import com.github.barteksc.pdfviewer.source.AssetSource;
import com.github.barteksc.pdfviewer.source.ByteArraySource;
import com.github.barteksc.pdfviewer.source.DocumentSource;
import com.github.barteksc.pdfviewer.source.FileSource;
import com.github.barteksc.pdfviewer.source.InputStreamSource;
import com.github.barteksc.pdfviewer.source.UriSource;
import com.github.barteksc.pdfviewer.util.Constants;
import com.github.barteksc.pdfviewer.util.FitPolicy;
import com.github.barteksc.pdfviewer.util.MathUtils;
import com.github.barteksc.pdfviewer.util.SnapEdge;
import com.github.barteksc.pdfviewer.util.Util;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class PDFView extends RelativeLayout {
    public static final float DEFAULT_MAX_SCALE = 3.0f;
    public static final float DEFAULT_MID_SCALE = 1.75f;
    public static final float DEFAULT_MIN_SCALE = 1.0f;

    /* renamed from: A */
    public boolean f43578A;

    /* renamed from: B */
    public boolean f43579B;

    /* renamed from: C */
    public boolean f43580C;

    /* renamed from: D */
    public PdfiumCore f43581D;

    /* renamed from: E */
    public ScrollHandle f43582E;

    /* renamed from: F */
    public boolean f43583F;

    /* renamed from: G */
    public boolean f43584G;

    /* renamed from: H */
    public boolean f43585H;

    /* renamed from: I */
    public boolean f43586I;

    /* renamed from: J */
    public boolean f43587J;

    /* renamed from: K */
    public PaintFlagsDrawFilter f43588K;

    /* renamed from: L */
    public int f43589L;

    /* renamed from: M */
    public boolean f43590M;

    /* renamed from: N */
    public boolean f43591N;

    /* renamed from: O */
    public List f43592O;

    /* renamed from: P */
    public boolean f43593P;

    /* renamed from: Q */
    public Configurator f43594Q;

    /* renamed from: a */
    public float f43595a;

    /* renamed from: b */
    public float f43596b;

    /* renamed from: c */
    public float f43597c;

    /* renamed from: d */
    public ScrollDir f43598d;

    /* renamed from: e */
    public C12387ng f43599e;

    /* renamed from: f */
    public C0643J4 f43600f;

    /* renamed from: g */
    public GestureDetector$OnGestureListenerC10063dK f43601g;

    /* renamed from: h */
    public C17865Jj1 f43602h;

    /* renamed from: i */
    public int f43603i;

    /* renamed from: j */
    public float f43604j;

    /* renamed from: k */
    public float f43605k;

    /* renamed from: l */
    public float f43606l;

    /* renamed from: m */
    public boolean f43607m;

    /* renamed from: n */
    public State f43608n;

    /* renamed from: o */
    public AsyncTaskC12272mE f43609o;

    /* renamed from: p */
    public HandlerThread f43610p;

    /* renamed from: q */
    public HandlerC18662Vw1 f43611q;

    /* renamed from: r */
    public C17347Bh1 f43612r;

    /* renamed from: s */
    public Callbacks f43613s;

    /* renamed from: t */
    public Paint f43614t;

    /* renamed from: u */
    public Paint f43615u;

    /* renamed from: v */
    public FitPolicy f43616v;

    /* renamed from: w */
    public boolean f43617w;

    /* renamed from: x */
    public int f43618x;

    /* renamed from: y */
    public boolean f43619y;

    /* renamed from: z */
    public boolean f43620z;

    /* loaded from: classes3.dex */
    public class Configurator {

        /* renamed from: A */
        public boolean f43621A;

        /* renamed from: B */
        public boolean f43622B;

        /* renamed from: a */
        public final DocumentSource f43624a;

        /* renamed from: b */
        public int[] f43625b;

        /* renamed from: c */
        public boolean f43626c;

        /* renamed from: d */
        public boolean f43627d;

        /* renamed from: e */
        public OnDrawListener f43628e;

        /* renamed from: f */
        public OnDrawListener f43629f;

        /* renamed from: g */
        public OnLoadCompleteListener f43630g;

        /* renamed from: h */
        public OnErrorListener f43631h;

        /* renamed from: i */
        public OnPageChangeListener f43632i;

        /* renamed from: j */
        public OnPageScrollListener f43633j;

        /* renamed from: k */
        public OnRenderListener f43634k;

        /* renamed from: l */
        public OnTapListener f43635l;

        /* renamed from: m */
        public OnLongPressListener f43636m;

        /* renamed from: n */
        public OnPageErrorListener f43637n;

        /* renamed from: o */
        public LinkHandler f43638o;

        /* renamed from: p */
        public int f43639p;

        /* renamed from: q */
        public boolean f43640q;

        /* renamed from: r */
        public boolean f43641r;

        /* renamed from: s */
        public String f43642s;

        /* renamed from: t */
        public ScrollHandle f43643t;

        /* renamed from: u */
        public boolean f43644u;

        /* renamed from: v */
        public int f43645v;

        /* renamed from: w */
        public boolean f43646w;

        /* renamed from: x */
        public FitPolicy f43647x;

        /* renamed from: y */
        public boolean f43648y;

        /* renamed from: z */
        public boolean f43649z;

        public Configurator autoSpacing(boolean z) {
            this.f43646w = z;
            return this;
        }

        public Configurator defaultPage(int i) {
            this.f43639p = i;
            return this;
        }

        public Configurator disableLongpress() {
            PDFView.this.f43601g.m31903d();
            return this;
        }

        public Configurator enableAnnotationRendering(boolean z) {
            this.f43641r = z;
            return this;
        }

        public Configurator enableAntialiasing(boolean z) {
            this.f43644u = z;
            return this;
        }

        public Configurator enableDoubletap(boolean z) {
            this.f43627d = z;
            return this;
        }

        public Configurator enableSwipe(boolean z) {
            this.f43626c = z;
            return this;
        }

        public Configurator fitEachPage(boolean z) {
            this.f43648y = z;
            return this;
        }

        public Configurator linkHandler(LinkHandler linkHandler) {
            this.f43638o = linkHandler;
            return this;
        }

        public void load() {
            if (!PDFView.this.f43593P) {
                PDFView.this.f43594Q = this;
                return;
            }
            PDFView.this.recycle();
            PDFView.this.f43613s.setOnLoadComplete(this.f43630g);
            PDFView.this.f43613s.setOnError(this.f43631h);
            PDFView.this.f43613s.setOnDraw(this.f43628e);
            PDFView.this.f43613s.setOnDrawAll(this.f43629f);
            PDFView.this.f43613s.setOnPageChange(this.f43632i);
            PDFView.this.f43613s.setOnPageScroll(this.f43633j);
            PDFView.this.f43613s.setOnRender(this.f43634k);
            PDFView.this.f43613s.setOnTap(this.f43635l);
            PDFView.this.f43613s.setOnLongPress(this.f43636m);
            PDFView.this.f43613s.setOnPageError(this.f43637n);
            PDFView.this.f43613s.setLinkHandler(this.f43638o);
            PDFView.this.setSwipeEnabled(this.f43626c);
            PDFView.this.setNightMode(this.f43622B);
            PDFView.this.m49319o(this.f43627d);
            PDFView.this.setDefaultPage(this.f43639p);
            PDFView.this.setSwipeVertical(!this.f43640q);
            PDFView.this.enableAnnotationRendering(this.f43641r);
            PDFView.this.setScrollHandle(this.f43643t);
            PDFView.this.enableAntialiasing(this.f43644u);
            PDFView.this.setSpacing(this.f43645v);
            PDFView.this.setAutoSpacing(this.f43646w);
            PDFView.this.setPageFitPolicy(this.f43647x);
            PDFView.this.setFitEachPage(this.f43648y);
            PDFView.this.setPageSnap(this.f43621A);
            PDFView.this.setPageFling(this.f43649z);
            int[] iArr = this.f43625b;
            if (iArr != null) {
                PDFView.this.m49314t(this.f43624a, this.f43642s, iArr);
            } else {
                PDFView.this.m49315s(this.f43624a, this.f43642s);
            }
        }

        public Configurator nightMode(boolean z) {
            this.f43622B = z;
            return this;
        }

        public Configurator onDraw(OnDrawListener onDrawListener) {
            this.f43628e = onDrawListener;
            return this;
        }

        public Configurator onDrawAll(OnDrawListener onDrawListener) {
            this.f43629f = onDrawListener;
            return this;
        }

        public Configurator onError(OnErrorListener onErrorListener) {
            this.f43631h = onErrorListener;
            return this;
        }

        public Configurator onLoad(OnLoadCompleteListener onLoadCompleteListener) {
            this.f43630g = onLoadCompleteListener;
            return this;
        }

        public Configurator onLongPress(OnLongPressListener onLongPressListener) {
            this.f43636m = onLongPressListener;
            return this;
        }

        public Configurator onPageChange(OnPageChangeListener onPageChangeListener) {
            this.f43632i = onPageChangeListener;
            return this;
        }

        public Configurator onPageError(OnPageErrorListener onPageErrorListener) {
            this.f43637n = onPageErrorListener;
            return this;
        }

        public Configurator onPageScroll(OnPageScrollListener onPageScrollListener) {
            this.f43633j = onPageScrollListener;
            return this;
        }

        public Configurator onRender(OnRenderListener onRenderListener) {
            this.f43634k = onRenderListener;
            return this;
        }

        public Configurator onTap(OnTapListener onTapListener) {
            this.f43635l = onTapListener;
            return this;
        }

        public Configurator pageFitPolicy(FitPolicy fitPolicy) {
            this.f43647x = fitPolicy;
            return this;
        }

        public Configurator pageFling(boolean z) {
            this.f43649z = z;
            return this;
        }

        public Configurator pageSnap(boolean z) {
            this.f43621A = z;
            return this;
        }

        public Configurator pages(int... iArr) {
            this.f43625b = iArr;
            return this;
        }

        public Configurator password(String str) {
            this.f43642s = str;
            return this;
        }

        public Configurator scrollHandle(ScrollHandle scrollHandle) {
            this.f43643t = scrollHandle;
            return this;
        }

        public Configurator spacing(int i) {
            this.f43645v = i;
            return this;
        }

        public Configurator swipeHorizontal(boolean z) {
            this.f43640q = z;
            return this;
        }

        public Configurator(DocumentSource documentSource) {
            this.f43625b = null;
            this.f43626c = true;
            this.f43627d = true;
            this.f43638o = new DefaultLinkHandler(PDFView.this);
            this.f43639p = 0;
            this.f43640q = false;
            this.f43641r = false;
            this.f43642s = null;
            this.f43643t = null;
            this.f43644u = true;
            this.f43645v = 0;
            this.f43646w = false;
            this.f43647x = FitPolicy.WIDTH;
            this.f43648y = false;
            this.f43649z = false;
            this.f43621A = false;
            this.f43622B = false;
            this.f43624a = documentSource;
        }
    }

    /* loaded from: classes3.dex */
    public enum ScrollDir {
        NONE,
        START,
        END
    }

    /* loaded from: classes3.dex */
    public enum State {
        DEFAULT,
        LOADED,
        SHOWN,
        ERROR
    }

    public PDFView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43595a = 1.0f;
        this.f43596b = 1.75f;
        this.f43597c = 3.0f;
        this.f43598d = ScrollDir.NONE;
        this.f43604j = 0.0f;
        this.f43605k = 0.0f;
        this.f43606l = 1.0f;
        this.f43607m = true;
        this.f43608n = State.DEFAULT;
        this.f43613s = new Callbacks();
        this.f43616v = FitPolicy.WIDTH;
        this.f43617w = false;
        this.f43618x = 0;
        this.f43619y = true;
        this.f43620z = true;
        this.f43578A = true;
        this.f43579B = false;
        this.f43580C = true;
        this.f43583F = false;
        this.f43584G = false;
        this.f43585H = false;
        this.f43586I = false;
        this.f43587J = true;
        this.f43588K = new PaintFlagsDrawFilter(0, 3);
        this.f43589L = 0;
        this.f43590M = false;
        this.f43591N = true;
        this.f43592O = new ArrayList(10);
        this.f43593P = false;
        this.f43610p = new HandlerThread("PDF renderer");
        if (isInEditMode()) {
            return;
        }
        this.f43599e = new C12387ng();
        C0643J4 c0643j4 = new C0643J4(this);
        this.f43600f = c0643j4;
        this.f43601g = new GestureDetector$OnGestureListenerC10063dK(this, c0643j4);
        this.f43612r = new C17347Bh1(this);
        this.f43614t = new Paint();
        Paint paint = new Paint();
        this.f43615u = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f43581D = new PdfiumCore(context);
        setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAutoSpacing(boolean z) {
        this.f43590M = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultPage(int i) {
        this.f43618x = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFitEachPage(boolean z) {
        this.f43617w = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageFitPolicy(FitPolicy fitPolicy) {
        this.f43616v = fitPolicy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScrollHandle(ScrollHandle scrollHandle) {
        this.f43582E = scrollHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpacing(int i) {
        this.f43589L = Util.getDP(getContext(), i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSwipeVertical(boolean z) {
        this.f43619y = z;
    }

    /* renamed from: A */
    public float m49334A(int i, SnapEdge snapEdge) {
        int width;
        float f;
        float m67704m = this.f43602h.m67704m(i, this.f43606l);
        if (this.f43619y) {
            width = getHeight();
        } else {
            width = getWidth();
        }
        float f2 = width;
        float m67706k = this.f43602h.m67706k(i, this.f43606l);
        if (snapEdge == SnapEdge.CENTER) {
            f = m67704m - (f2 / 2.0f);
            m67706k /= 2.0f;
        } else if (snapEdge == SnapEdge.END) {
            f = m67704m - f2;
        } else {
            return m67704m;
        }
        return f + m67706k;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        C17865Jj1 c17865Jj1 = this.f43602h;
        if (c17865Jj1 == null) {
            return true;
        }
        if (this.f43619y) {
            if (i < 0 && this.f43604j < 0.0f) {
                return true;
            }
            if (i > 0 && this.f43604j + toCurrentScale(c17865Jj1.m67709h()) > getWidth()) {
                return true;
            }
            return false;
        } else if (i < 0 && this.f43604j < 0.0f) {
            return true;
        } else {
            if (i > 0 && this.f43604j + c17865Jj1.m67712e(this.f43606l) > getWidth()) {
                return true;
            }
            return false;
        }
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i) {
        C17865Jj1 c17865Jj1 = this.f43602h;
        if (c17865Jj1 == null) {
            return true;
        }
        if (this.f43619y) {
            if (i < 0 && this.f43605k < 0.0f) {
                return true;
            }
            if (i > 0 && this.f43605k + c17865Jj1.m67712e(this.f43606l) > getHeight()) {
                return true;
            }
            return false;
        } else if (i < 0 && this.f43605k < 0.0f) {
            return true;
        } else {
            if (i > 0 && this.f43605k + toCurrentScale(c17865Jj1.m67711f()) > getHeight()) {
                return true;
            }
            return false;
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (isInEditMode()) {
            return;
        }
        this.f43600f.m67811d();
    }

    public boolean doRenderDuringScale() {
        return this.f43586I;
    }

    public boolean documentFitsView() {
        float m67712e = this.f43602h.m67712e(1.0f);
        if (this.f43619y) {
            if (m67712e >= getHeight()) {
                return false;
            }
            return true;
        } else if (m67712e >= getWidth()) {
            return false;
        } else {
            return true;
        }
    }

    public void enableAnnotationRendering(boolean z) {
        this.f43585H = z;
    }

    public void enableAntialiasing(boolean z) {
        this.f43587J = z;
    }

    public void enableRenderDuringScale(boolean z) {
        this.f43586I = z;
    }

    public void fitToWidth(int i) {
        if (this.f43608n != State.SHOWN) {
            return;
        }
        zoomTo(getWidth() / this.f43602h.m67703n(i).getWidth());
        jumpTo(i);
    }

    public Configurator fromAsset(String str) {
        return new Configurator(new AssetSource(str));
    }

    public Configurator fromBytes(byte[] bArr) {
        return new Configurator(new ByteArraySource(bArr));
    }

    public Configurator fromFile(File file) {
        return new Configurator(new FileSource(file));
    }

    public Configurator fromSource(DocumentSource documentSource) {
        return new Configurator(documentSource);
    }

    public Configurator fromStream(InputStream inputStream) {
        return new Configurator(new InputStreamSource(inputStream));
    }

    public Configurator fromUri(Uri uri) {
        return new Configurator(new UriSource(uri));
    }

    public int getCurrentPage() {
        return this.f43603i;
    }

    public float getCurrentXOffset() {
        return this.f43604j;
    }

    public float getCurrentYOffset() {
        return this.f43605k;
    }

    public PdfDocument.Meta getDocumentMeta() {
        C17865Jj1 c17865Jj1 = this.f43602h;
        if (c17865Jj1 == null) {
            return null;
        }
        return c17865Jj1.m67708i();
    }

    public List<PdfDocument.Link> getLinks(int i) {
        C17865Jj1 c17865Jj1 = this.f43602h;
        if (c17865Jj1 == null) {
            return Collections.emptyList();
        }
        return c17865Jj1.m67705l(i);
    }

    public float getMaxZoom() {
        return this.f43597c;
    }

    public float getMidZoom() {
        return this.f43596b;
    }

    public float getMinZoom() {
        return this.f43595a;
    }

    public int getPageAtPositionOffset(float f) {
        C17865Jj1 c17865Jj1 = this.f43602h;
        return c17865Jj1.m67707j(c17865Jj1.m67712e(this.f43606l) * f, this.f43606l);
    }

    public int getPageCount() {
        C17865Jj1 c17865Jj1 = this.f43602h;
        if (c17865Jj1 == null) {
            return 0;
        }
        return c17865Jj1.m67701p();
    }

    public FitPolicy getPageFitPolicy() {
        return this.f43616v;
    }

    public SizeF getPageSize(int i) {
        C17865Jj1 c17865Jj1 = this.f43602h;
        if (c17865Jj1 == null) {
            return new SizeF(0.0f, 0.0f);
        }
        return c17865Jj1.m67703n(i);
    }

    public float getPositionOffset() {
        float f;
        float m67712e;
        int width;
        if (this.f43619y) {
            f = -this.f43605k;
            m67712e = this.f43602h.m67712e(this.f43606l);
            width = getHeight();
        } else {
            f = -this.f43604j;
            m67712e = this.f43602h.m67712e(this.f43606l);
            width = getWidth();
        }
        return MathUtils.limit(f / (m67712e - width), 0.0f, 1.0f);
    }

    public ScrollHandle getScrollHandle() {
        return this.f43582E;
    }

    public int getSpacingPx() {
        return this.f43589L;
    }

    public List<PdfDocument.Bookmark> getTableOfContents() {
        C17865Jj1 c17865Jj1 = this.f43602h;
        if (c17865Jj1 == null) {
            return Collections.emptyList();
        }
        return c17865Jj1.m67713d();
    }

    public float getZoom() {
        return this.f43606l;
    }

    public boolean isAnnotationRendering() {
        return this.f43585H;
    }

    public boolean isAntialiasing() {
        return this.f43587J;
    }

    public boolean isAutoSpacingEnabled() {
        return this.f43590M;
    }

    public boolean isBestQuality() {
        return this.f43584G;
    }

    public boolean isFitEachPage() {
        return this.f43617w;
    }

    public boolean isPageFlingEnabled() {
        return this.f43591N;
    }

    public boolean isPageSnap() {
        return this.f43580C;
    }

    public boolean isRecycled() {
        return this.f43607m;
    }

    public boolean isSwipeEnabled() {
        return this.f43620z;
    }

    public boolean isSwipeVertical() {
        return this.f43619y;
    }

    public boolean isZooming() {
        if (this.f43606l != this.f43595a) {
            return true;
        }
        return false;
    }

    public void jumpTo(int i, boolean z) {
        C17865Jj1 c17865Jj1 = this.f43602h;
        if (c17865Jj1 == null) {
            return;
        }
        int m67716a = c17865Jj1.m67716a(i);
        float f = m67716a == 0 ? 0.0f : -this.f43602h.m67704m(m67716a, this.f43606l);
        if (this.f43619y) {
            if (z) {
                this.f43600f.m67805j(this.f43605k, f);
            } else {
                moveTo(this.f43604j, f);
            }
        } else if (z) {
            this.f43600f.m67806i(this.f43604j, f);
        } else {
            moveTo(f, this.f43605k);
        }
        m49308z(m67716a);
    }

    public void loadPages() {
        HandlerC18662Vw1 handlerC18662Vw1;
        if (this.f43602h != null && (handlerC18662Vw1 = this.f43611q) != null) {
            handlerC18662Vw1.removeMessages(1);
            this.f43599e.m26063i();
            this.f43612r.m68887f();
            m49309y();
        }
    }

    /* renamed from: m */
    public final void m49321m(Canvas canvas, PagePart pagePart) {
        float m67704m;
        float currentScale;
        int i;
        RectF pageRelativeBounds = pagePart.getPageRelativeBounds();
        Bitmap renderedBitmap = pagePart.getRenderedBitmap();
        if (renderedBitmap.isRecycled()) {
            return;
        }
        SizeF m67703n = this.f43602h.m67703n(pagePart.getPage());
        if (this.f43619y) {
            currentScale = this.f43602h.m67704m(pagePart.getPage(), this.f43606l);
            m67704m = toCurrentScale(this.f43602h.m67709h() - m67703n.getWidth()) / 2.0f;
        } else {
            m67704m = this.f43602h.m67704m(pagePart.getPage(), this.f43606l);
            currentScale = toCurrentScale(this.f43602h.m67711f() - m67703n.getHeight()) / 2.0f;
        }
        canvas.translate(m67704m, currentScale);
        Rect rect = new Rect(0, 0, renderedBitmap.getWidth(), renderedBitmap.getHeight());
        float currentScale2 = toCurrentScale(pageRelativeBounds.left * m67703n.getWidth());
        float currentScale3 = toCurrentScale(pageRelativeBounds.top * m67703n.getHeight());
        RectF rectF = new RectF((int) currentScale2, (int) currentScale3, (int) (currentScale2 + toCurrentScale(pageRelativeBounds.width() * m67703n.getWidth())), (int) (currentScale3 + toCurrentScale(pageRelativeBounds.height() * m67703n.getHeight())));
        float f = this.f43604j + m67704m;
        float f2 = this.f43605k + currentScale;
        if (rectF.left + f < getWidth() && f + rectF.right > 0.0f && rectF.top + f2 < getHeight() && f2 + rectF.bottom > 0.0f) {
            canvas.drawBitmap(renderedBitmap, rect, rectF, this.f43614t);
            if (Constants.DEBUG_MODE) {
                Paint paint = this.f43615u;
                if (pagePart.getPage() % 2 == 0) {
                    i = SupportMenu.CATEGORY_MASK;
                } else {
                    i = -16776961;
                }
                paint.setColor(i);
                canvas.drawRect(rectF, this.f43615u);
            }
            canvas.translate(-m67704m, -currentScale);
            return;
        }
        canvas.translate(-m67704m, -currentScale);
    }

    public void moveRelativeTo(float f, float f2) {
        moveTo(this.f43604j + f, this.f43605k + f2);
    }

    public void moveTo(float f, float f2) {
        moveTo(f, f2, true);
    }

    /* renamed from: n */
    public final void m49320n(Canvas canvas, int i, OnDrawListener onDrawListener) {
        float f;
        if (onDrawListener != null) {
            float f2 = 0.0f;
            if (this.f43619y) {
                f = this.f43602h.m67704m(i, this.f43606l);
            } else {
                f2 = this.f43602h.m67704m(i, this.f43606l);
                f = 0.0f;
            }
            canvas.translate(f2, f);
            SizeF m67703n = this.f43602h.m67703n(i);
            onDrawListener.onLayerDrawn(canvas, toCurrentScale(m67703n.getWidth()), toCurrentScale(m67703n.getHeight()), i);
            canvas.translate(-f2, -f);
        }
    }

    /* renamed from: o */
    public void m49319o(boolean z) {
        this.f43578A = z;
    }

    public void onBitmapRendered(PagePart pagePart) {
        if (this.f43608n == State.LOADED) {
            this.f43608n = State.SHOWN;
            this.f43613s.callOnRender(this.f43602h.m67701p());
        }
        if (pagePart.isThumbnail()) {
            this.f43599e.m26069c(pagePart);
        } else {
            this.f43599e.m26070b(pagePart);
        }
        m49309y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        recycle();
        HandlerThread handlerThread = this.f43610p;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.f43610p = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i;
        if (isInEditMode()) {
            return;
        }
        if (this.f43587J) {
            canvas.setDrawFilter(this.f43588K);
        }
        Drawable background = getBackground();
        if (background == null) {
            if (this.f43579B) {
                i = -16777216;
            } else {
                i = -1;
            }
            canvas.drawColor(i);
        } else {
            background.draw(canvas);
        }
        if (this.f43607m || this.f43608n != State.SHOWN) {
            return;
        }
        float f = this.f43604j;
        float f2 = this.f43605k;
        canvas.translate(f, f2);
        for (PagePart pagePart : this.f43599e.m26065g()) {
            m49321m(canvas, pagePart);
        }
        for (PagePart pagePart2 : this.f43599e.m26066f()) {
            m49321m(canvas, pagePart2);
            if (this.f43613s.getOnDrawAll() != null && !this.f43592O.contains(Integer.valueOf(pagePart2.getPage()))) {
                this.f43592O.add(Integer.valueOf(pagePart2.getPage()));
            }
        }
        for (Integer num : this.f43592O) {
            m49320n(canvas, num.intValue(), this.f43613s.getOnDrawAll());
        }
        this.f43592O.clear();
        m49320n(canvas, this.f43603i, this.f43613s.getOnDraw());
        canvas.translate(-f, -f2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float m67712e;
        float m67711f;
        this.f43593P = true;
        Configurator configurator = this.f43594Q;
        if (configurator != null) {
            configurator.load();
        }
        if (!isInEditMode() && this.f43608n == State.SHOWN) {
            float f = (-this.f43604j) + (i3 * 0.5f);
            float f2 = (-this.f43605k) + (i4 * 0.5f);
            if (this.f43619y) {
                m67712e = f / this.f43602h.m67709h();
                m67711f = this.f43602h.m67712e(this.f43606l);
            } else {
                m67712e = f / this.f43602h.m67712e(this.f43606l);
                m67711f = this.f43602h.m67711f();
            }
            float f3 = f2 / m67711f;
            this.f43600f.m67803l();
            this.f43602h.m67692y(new Size(i, i2));
            if (this.f43619y) {
                this.f43604j = ((-m67712e) * this.f43602h.m67709h()) + (i * 0.5f);
                this.f43605k = ((-f3) * this.f43602h.m67712e(this.f43606l)) + (i2 * 0.5f);
            } else {
                this.f43604j = ((-m67712e) * this.f43602h.m67712e(this.f43606l)) + (i * 0.5f);
                this.f43605k = ((-f3) * this.f43602h.m67711f()) + (i2 * 0.5f);
            }
            moveTo(this.f43604j, this.f43605k);
            m49311w();
        }
    }

    /* renamed from: p */
    public int m49318p(float f, float f2) {
        int width;
        boolean z = this.f43619y;
        if (z) {
            f = f2;
        }
        if (z) {
            width = getHeight();
        } else {
            width = getWidth();
        }
        float f3 = width;
        if (f > -1.0f) {
            return 0;
        }
        if (f < (-this.f43602h.m67712e(this.f43606l)) + f3 + 1.0f) {
            return this.f43602h.m67701p() - 1;
        }
        return this.f43602h.m67707j(-(f - (f3 / 2.0f)), this.f43606l);
    }

    public boolean pageFillsScreen() {
        float f = -this.f43602h.m67704m(this.f43603i, this.f43606l);
        float m67706k = f - this.f43602h.m67706k(this.f43603i, this.f43606l);
        if (isSwipeVertical()) {
            float f2 = this.f43605k;
            if (f <= f2 || m67706k >= f2 - getHeight()) {
                return false;
            }
            return true;
        }
        float f3 = this.f43604j;
        if (f <= f3 || m67706k >= f3 - getWidth()) {
            return false;
        }
        return true;
    }

    public void performPageSnap() {
        C17865Jj1 c17865Jj1;
        int m49318p;
        SnapEdge m49317q;
        if (!this.f43580C || (c17865Jj1 = this.f43602h) == null || c17865Jj1.m67701p() == 0 || (m49317q = m49317q((m49318p = m49318p(this.f43604j, this.f43605k)))) == SnapEdge.NONE) {
            return;
        }
        float m49334A = m49334A(m49318p, m49317q);
        if (this.f43619y) {
            this.f43600f.m67805j(this.f43605k, -m49334A);
        } else {
            this.f43600f.m67806i(this.f43604j, -m49334A);
        }
    }

    /* renamed from: q */
    public SnapEdge m49317q(int i) {
        float f;
        int width;
        if (this.f43580C && i >= 0) {
            if (this.f43619y) {
                f = this.f43605k;
            } else {
                f = this.f43604j;
            }
            float f2 = -this.f43602h.m67704m(i, this.f43606l);
            if (this.f43619y) {
                width = getHeight();
            } else {
                width = getWidth();
            }
            float m67706k = this.f43602h.m67706k(i, this.f43606l);
            float f3 = width;
            if (f3 >= m67706k) {
                return SnapEdge.CENTER;
            }
            if (f >= f2) {
                return SnapEdge.START;
            }
            if (f2 - m67706k > f - f3) {
                return SnapEdge.END;
            }
            return SnapEdge.NONE;
        }
        return SnapEdge.NONE;
    }

    /* renamed from: r */
    public boolean m49316r() {
        return this.f43578A;
    }

    public void recycle() {
        this.f43594Q = null;
        this.f43600f.m67803l();
        this.f43601g.m31904c();
        HandlerC18662Vw1 handlerC18662Vw1 = this.f43611q;
        if (handlerC18662Vw1 != null) {
            handlerC18662Vw1.m65727f();
            this.f43611q.removeMessages(1);
        }
        AsyncTaskC12272mE asyncTaskC12272mE = this.f43609o;
        if (asyncTaskC12272mE != null) {
            asyncTaskC12272mE.cancel(true);
        }
        this.f43599e.m26062j();
        ScrollHandle scrollHandle = this.f43582E;
        if (scrollHandle != null && this.f43583F) {
            scrollHandle.destroyLayout();
        }
        C17865Jj1 c17865Jj1 = this.f43602h;
        if (c17865Jj1 != null) {
            c17865Jj1.m67715b();
            this.f43602h = null;
        }
        this.f43611q = null;
        this.f43582E = null;
        this.f43583F = false;
        this.f43605k = 0.0f;
        this.f43604j = 0.0f;
        this.f43606l = 1.0f;
        this.f43607m = true;
        this.f43613s = new Callbacks();
        this.f43608n = State.DEFAULT;
    }

    public void resetZoom() {
        zoomTo(this.f43595a);
    }

    public void resetZoomWithAnimation() {
        zoomWithAnimation(this.f43595a);
    }

    /* renamed from: s */
    public final void m49315s(DocumentSource documentSource, String str) {
        m49314t(documentSource, str, null);
    }

    public void setMaxZoom(float f) {
        this.f43597c = f;
    }

    public void setMidZoom(float f) {
        this.f43596b = f;
    }

    public void setMinZoom(float f) {
        this.f43595a = f;
    }

    public void setNightMode(boolean z) {
        this.f43579B = z;
        if (z) {
            this.f43614t.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f})));
            return;
        }
        this.f43614t.setColorFilter(null);
    }

    public void setPageFling(boolean z) {
        this.f43591N = z;
    }

    public void setPageSnap(boolean z) {
        this.f43580C = z;
    }

    public void setPositionOffset(float f, boolean z) {
        if (this.f43619y) {
            moveTo(this.f43604j, ((-this.f43602h.m67712e(this.f43606l)) + getHeight()) * f, z);
        } else {
            moveTo(((-this.f43602h.m67712e(this.f43606l)) + getWidth()) * f, this.f43605k, z);
        }
        m49311w();
    }

    public void setSwipeEnabled(boolean z) {
        this.f43620z = z;
    }

    public void stopFling() {
        this.f43600f.m67802m();
    }

    /* renamed from: t */
    public final void m49314t(DocumentSource documentSource, String str, int[] iArr) {
        if (this.f43607m) {
            this.f43607m = false;
            AsyncTaskC12272mE asyncTaskC12272mE = new AsyncTaskC12272mE(documentSource, str, iArr, this, this.f43581D);
            this.f43609o = asyncTaskC12272mE;
            asyncTaskC12272mE.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
        throw new IllegalStateException("Don't call load on a PDF View without recycling it first.");
    }

    public float toCurrentScale(float f) {
        return f * this.f43606l;
    }

    public float toRealScale(float f) {
        return f / this.f43606l;
    }

    /* renamed from: u */
    public void m49313u(C17865Jj1 c17865Jj1) {
        this.f43608n = State.LOADED;
        this.f43602h = c17865Jj1;
        if (!this.f43610p.isAlive()) {
            this.f43610p.start();
        }
        HandlerC18662Vw1 handlerC18662Vw1 = new HandlerC18662Vw1(this.f43610p.getLooper(), this);
        this.f43611q = handlerC18662Vw1;
        handlerC18662Vw1.m65728e();
        ScrollHandle scrollHandle = this.f43582E;
        if (scrollHandle != null) {
            scrollHandle.setupLayout(this);
            this.f43583F = true;
        }
        this.f43601g.m31902e();
        this.f43613s.callOnLoadComplete(c17865Jj1.m67701p());
        jumpTo(this.f43618x, false);
    }

    public void useBestQuality(boolean z) {
        this.f43584G = z;
    }

    /* renamed from: v */
    public void m49312v(Throwable th2) {
        this.f43608n = State.ERROR;
        OnErrorListener onError = this.f43613s.getOnError();
        recycle();
        invalidate();
        if (onError != null) {
            onError.onError(th2);
        }
    }

    /* renamed from: w */
    public void m49311w() {
        float f;
        int width;
        if (this.f43602h.m67701p() == 0) {
            return;
        }
        if (this.f43619y) {
            f = this.f43605k;
            width = getHeight();
        } else {
            f = this.f43604j;
            width = getWidth();
        }
        int m67707j = this.f43602h.m67707j(-(f - (width / 2.0f)), this.f43606l);
        if (m67707j >= 0 && m67707j <= this.f43602h.m67701p() - 1 && m67707j != getCurrentPage()) {
            m49308z(m67707j);
        } else {
            loadPages();
        }
    }

    /* renamed from: x */
    public void m49310x(PageRenderingException pageRenderingException) {
        if (!this.f43613s.callOnPageError(pageRenderingException.getPage(), pageRenderingException.getCause())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot open page ");
            sb.append(pageRenderingException.getPage());
            pageRenderingException.getCause();
        }
    }

    /* renamed from: y */
    public void m49309y() {
        invalidate();
    }

    /* renamed from: z */
    public void m49308z(int i) {
        if (this.f43607m) {
            return;
        }
        this.f43603i = this.f43602h.m67716a(i);
        loadPages();
        if (this.f43582E != null && !documentFitsView()) {
            this.f43582E.setPageNum(this.f43603i + 1);
        }
        this.f43613s.callOnPageChange(this.f43603i, this.f43602h.m67701p());
    }

    public void zoomCenteredRelativeTo(float f, PointF pointF) {
        zoomCenteredTo(this.f43606l * f, pointF);
    }

    public void zoomCenteredTo(float f, PointF pointF) {
        float f2 = f / this.f43606l;
        zoomTo(f);
        float f3 = pointF.x;
        float f4 = pointF.y;
        moveTo((this.f43604j * f2) + (f3 - (f3 * f2)), (this.f43605k * f2) + (f4 - (f2 * f4)));
    }

    public void zoomTo(float f) {
        this.f43606l = f;
    }

    public void zoomWithAnimation(float f, float f2, float f3) {
        this.f43600f.m67804k(f, f2, this.f43606l, f3);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void moveTo(float r6, float r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.barteksc.pdfviewer.PDFView.moveTo(float, float, boolean):void");
    }

    public void zoomWithAnimation(float f) {
        this.f43600f.m67804k(getWidth() / 2, getHeight() / 2, this.f43606l, f);
    }

    public void setPositionOffset(float f) {
        setPositionOffset(f, true);
    }

    public void jumpTo(int i) {
        jumpTo(i, false);
    }
}
