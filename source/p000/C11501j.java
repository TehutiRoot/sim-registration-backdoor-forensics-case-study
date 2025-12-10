package p000;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.filter.DecodeResult;
import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.p019io.IOUtils;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: j */
/* loaded from: classes5.dex */
public final class C11501j extends Filter {
    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i) {
        C11614k c11614k;
        C11614k c11614k2 = null;
        try {
            c11614k = new C11614k(inputStream);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            IOUtils.copy(c11614k, outputStream);
            outputStream.flush();
            IOUtils.closeQuietly(c11614k);
            return new DecodeResult(cOSDictionary);
        } catch (Throwable th3) {
            th = th3;
            c11614k2 = c11614k;
            IOUtils.closeQuietly(c11614k2);
            throw th;
        }
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        C12187l c12187l = new C12187l(outputStream);
        IOUtils.copy(inputStream, c12187l);
        c12187l.close();
        outputStream.flush();
    }
}
