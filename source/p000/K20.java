package p000;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.filter.DecodeResult;
import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.filter.Predictor;
import com.tom_roush.pdfbox.p019io.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* renamed from: K20 */
/* loaded from: classes5.dex */
public final class K20 extends Filter {
    /* renamed from: a */
    public final void m67651a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[2048];
        inputStream.read();
        inputStream.read();
        int read = inputStream.read(bArr);
        if (read > 0) {
            Inflater inflater = new Inflater(true);
            inflater.setInput(bArr, 0, read);
            byte[] bArr2 = new byte[1024];
            boolean z = false;
            while (true) {
                try {
                    try {
                        int inflate = inflater.inflate(bArr2);
                        if (inflate != 0) {
                            outputStream.write(bArr2, 0, inflate);
                            z = true;
                        } else if (inflater.finished() || inflater.needsDictionary() || inputStream.available() == 0) {
                            break;
                        } else {
                            inflater.setInput(bArr, 0, inputStream.read(bArr));
                        }
                    } catch (DataFormatException e) {
                        if (z) {
                            Log.w("PdfBox-Android", "FlateFilter: premature end of stream due to a DataFormatException");
                        } else {
                            throw e;
                        }
                    }
                } finally {
                    inflater.end();
                }
            }
        }
        outputStream.flush();
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i) {
        try {
            m67651a(inputStream, Predictor.m32769e(outputStream, getDecodeParams(cOSDictionary, i)));
            return new DecodeResult(cOSDictionary);
        } catch (DataFormatException e) {
            throw new IOException(e);
        }
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        Deflater deflater = new Deflater(Filter.getCompressionLevel());
        DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(outputStream, deflater);
        IOUtils.copy(inputStream, deflaterOutputStream);
        deflaterOutputStream.close();
        outputStream.flush();
        deflater.end();
    }
}
