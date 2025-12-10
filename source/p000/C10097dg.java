package p000;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.p019io.IOUtils;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: dg */
/* loaded from: classes5.dex */
public final class C10097dg extends Filter {
    /* renamed from: a */
    public final void m31802a(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) ((~bArr[i]) & 255);
        }
    }

    /* renamed from: b */
    public void m31801b(C5386bg c5386bg, byte[] bArr) {
        int i = 0;
        do {
            int read = c5386bg.read(bArr, i, bArr.length - i);
            if (read > -1) {
                i += read;
            } else {
                return;
            }
        } while (i < bArr.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
        if (r15 != 1) goto L21;
     */
    @Override // com.tom_roush.pdfbox.filter.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.tom_roush.pdfbox.filter.DecodeResult decode(java.io.InputStream r17, java.io.OutputStream r18, com.tom_roush.pdfbox.cos.COSDictionary r19, int r20) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C10097dg.decode(java.io.InputStream, java.io.OutputStream, com.tom_roush.pdfbox.cos.COSDictionary, int):com.tom_roush.pdfbox.filter.DecodeResult");
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        IOUtils.copy(inputStream, new C5459cg(outputStream, cOSDictionary.getInt(COSName.COLUMNS), cOSDictionary.getInt(COSName.ROWS), 1));
    }
}
