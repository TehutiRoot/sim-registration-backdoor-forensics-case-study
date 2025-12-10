package p000;

import android.os.AsyncTask;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.source.DocumentSource;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.lang.ref.WeakReference;

/* renamed from: nE */
/* loaded from: classes3.dex */
public class AsyncTaskC12336nE extends AsyncTask {

    /* renamed from: a */
    public boolean f72291a = false;

    /* renamed from: b */
    public WeakReference f72292b;

    /* renamed from: c */
    public PdfiumCore f72293c;

    /* renamed from: d */
    public String f72294d;

    /* renamed from: e */
    public DocumentSource f72295e;

    /* renamed from: f */
    public int[] f72296f;

    /* renamed from: g */
    public C17705Gk1 f72297g;

    public AsyncTaskC12336nE(DocumentSource documentSource, String str, int[] iArr, PDFView pDFView, PdfiumCore pdfiumCore) {
        this.f72295e = documentSource;
        this.f72296f = iArr;
        this.f72292b = new WeakReference(pDFView);
        this.f72294d = str;
        this.f72293c = pdfiumCore;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Throwable doInBackground(Void... voidArr) {
        try {
            PDFView pDFView = (PDFView) this.f72292b.get();
            if (pDFView != null) {
                this.f72297g = new C17705Gk1(this.f72293c, this.f72295e.createDocument(pDFView.getContext(), this.f72293c, this.f72294d), pDFView.getPageFitPolicy(), m26442b(pDFView), this.f72296f, pDFView.isSwipeVertical(), pDFView.getSpacingPx(), pDFView.isAutoSpacingEnabled(), pDFView.isFitEachPage());
                return null;
            }
            return new NullPointerException("pdfView == null");
        } catch (Throwable th2) {
            return th2;
        }
    }

    /* renamed from: b */
    public final Size m26442b(PDFView pDFView) {
        return new Size(pDFView.getWidth(), pDFView.getHeight());
    }

    @Override // android.os.AsyncTask
    /* renamed from: c */
    public void onPostExecute(Throwable th2) {
        PDFView pDFView = (PDFView) this.f72292b.get();
        if (pDFView != null) {
            if (th2 != null) {
                pDFView.m49309v(th2);
            } else if (!this.f72291a) {
                pDFView.m49310u(this.f72297g);
            }
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        this.f72291a = true;
    }
}