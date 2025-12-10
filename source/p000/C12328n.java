package p000;

import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.filter.DecodeResult;
import com.tom_roush.pdfbox.filter.Filter;
import com.tom_roush.pdfbox.util.Hex;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: n */
/* loaded from: classes5.dex */
public final class C12328n extends Filter {

    /* renamed from: a */
    public static final int[] f72107a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: a */
    public final boolean m26172a(int i) {
        if (i == 62) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m26171b(int i) {
        if (i != 0 && i != 9 && i != 10 && i != 12 && i != 13 && i != 32) {
            return false;
        }
        return true;
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public DecodeResult decode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary, int i) {
        int i2;
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                break;
            }
            while (m26171b(read)) {
                read = inputStream.read();
            }
            if (read == -1 || m26172a(read)) {
                break;
            }
            int[] iArr = f72107a;
            if (iArr[read] == -1) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid hex, int: ");
                sb.append(read);
                sb.append(" char: ");
                sb.append((char) read);
            }
            i2 = iArr[read] * 16;
            int read2 = inputStream.read();
            if (read2 == -1 || m26172a(read2)) {
                break;
            }
            if (read2 >= 0) {
                if (iArr[read2] == -1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Invalid hex, int: ");
                    sb2.append(read2);
                    sb2.append(" char: ");
                    sb2.append((char) read2);
                }
                i2 += iArr[read2];
            }
            outputStream.write(i2);
        }
        outputStream.write(i2);
        outputStream.flush();
        return new DecodeResult(cOSDictionary);
    }

    @Override // com.tom_roush.pdfbox.filter.Filter
    public void encode(InputStream inputStream, OutputStream outputStream, COSDictionary cOSDictionary) {
        while (true) {
            int read = inputStream.read();
            if (read != -1) {
                Hex.writeHexByte((byte) read, outputStream);
            } else {
                outputStream.flush();
                return;
            }
        }
    }
}
