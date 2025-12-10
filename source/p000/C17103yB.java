package p000;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.filter.DecodeOptions;
import com.tom_roush.pdfbox.filter.DecodeResult;
import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.p019io.IOUtils;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: yB */
/* loaded from: classes5.dex */
public final class C17103yB extends Filter {
    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i, DecodeOptions decodeOptions) {
        IOUtils.copy(inputStream, outputStream);
        return new DecodeResult(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        throw new UnsupportedOperationException("DCTFilter encoding not implemented, use the JPEGFactory methods instead");
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i) {
        return decode(inputStream, outputStream, cOSDictionary, i, DecodeOptions.DEFAULT);
    }
}
