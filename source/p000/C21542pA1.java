package p000;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.filter.DecodeResult;
import com.tom_roush.pdfbox.filter.Filter;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: pA1  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C21542pA1 extends Filter {
    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i) {
        byte[] bArr = new byte[128];
        while (true) {
            int read = inputStream.read();
            if (read == -1 || read == 128) {
                break;
            }
            if (read <= 127) {
                int i2 = read + 1;
                while (i2 > 0) {
                    int read2 = inputStream.read(bArr, 0, i2);
                    if (read2 == -1) {
                        break;
                    }
                    outputStream.write(bArr, 0, read2);
                    i2 -= read2;
                }
            } else {
                int read3 = inputStream.read();
                if (read3 == -1) {
                    break;
                }
                for (int i3 = 0; i3 < 257 - read; i3++) {
                    outputStream.write(read3);
                }
            }
        }
        return new DecodeResult(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        Log.w("PdfBox-Android", "RunLengthDecodeFilter.encode is not implemented yet, skipping this stream.");
    }
}
