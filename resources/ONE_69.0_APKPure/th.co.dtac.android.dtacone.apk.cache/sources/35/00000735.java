package p000;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.filter.DecodeResult;
import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.p019io.IOUtils;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: Hc0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C17745Hc0 extends Filter {
    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i) {
        IOUtils.copy(inputStream, outputStream);
        outputStream.flush();
        return new DecodeResult(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        IOUtils.copy(inputStream, outputStream);
        outputStream.flush();
    }
}