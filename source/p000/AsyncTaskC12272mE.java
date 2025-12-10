package p000;

import android.os.AsyncTask;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.source.DocumentSource;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import java.lang.ref.WeakReference;

/* renamed from: mE */
/* loaded from: classes3.dex */
public class AsyncTaskC12272mE extends AsyncTask {

    /* renamed from: a */
    public boolean f71846a = false;

    /* renamed from: b */
    public WeakReference f71847b;

    /* renamed from: c */
    public PdfiumCore f71848c;

    /* renamed from: d */
    public String f71849d;

    /* renamed from: e */
    public DocumentSource f71850e;

    /* renamed from: f */
    public int[] f71851f;

    /* renamed from: g */
    public C17865Jj1 f71852g;

    public AsyncTaskC12272mE(DocumentSource documentSource, String str, int[] iArr, PDFView pDFView, PdfiumCore pdfiumCore) {
        this.f71850e = documentSource;
        this.f71851f = iArr;
        this.f71847b = new WeakReference(pDFView);
        this.f71849d = str;
        this.f71848c = pdfiumCore;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a */
    public Throwable doInBackground(Void... voidArr) {
        try {
            PDFView pDFView = (PDFView) this.f71847b.get();
            if (pDFView != null) {
                this.f71852g = new C17865Jj1(this.f71848c, this.f71850e.createDocument(pDFView.getContext(), this.f71848c, this.f71849d), pDFView.getPageFitPolicy(), m26368b(pDFView), this.f71851f, pDFView.isSwipeVertical(), pDFView.getSpacingPx(), pDFView.isAutoSpacingEnabled(), pDFView.isFitEachPage());
                return null;
            }
            return new NullPointerException("pdfView == null");
        } catch (Throwable th2) {
            return th2;
        }
    }

    /* renamed from: b */
    public final Size m26368b(PDFView pDFView) {
        return new Size(pDFView.getWidth(), pDFView.getHeight());
    }

    @Override // android.os.AsyncTask
    /* renamed from: c */
    public void onPostExecute(Throwable th2) {
        PDFView pDFView = (PDFView) this.f71847b.get();
        if (pDFView != null) {
            if (th2 != null) {
                pDFView.m49312v(th2);
            } else if (!this.f71846a) {
                pDFView.m49313u(this.f71852g);
            }
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        this.f71846a = true;
    }
}
