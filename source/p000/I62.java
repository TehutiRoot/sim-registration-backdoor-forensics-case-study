package p000;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: I62 */
/* loaded from: classes2.dex */
public abstract class I62 {

    /* renamed from: I62$a */
    /* loaded from: classes2.dex */
    public static class C0576a {

        /* renamed from: a */
        public long f2410a;

        /* renamed from: b */
        public long f2411b;
    }

    /* renamed from: a */
    public static long m68000a(RandomAccessFile randomAccessFile, C0576a c0576a) {
        CRC32 crc32 = new CRC32();
        long j = c0576a.f2411b;
        randomAccessFile.seek(c0576a.f2410a);
        byte[] bArr = new byte[16384];
        int read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        while (read != -1) {
            crc32.update(bArr, 0, read);
            j -= read;
            if (j == 0) {
                break;
            }
            read = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j));
        }
        return crc32.getValue();
    }

    /* renamed from: b */
    public static C0576a m67999b(RandomAccessFile randomAccessFile) {
        long length = randomAccessFile.length();
        long j = length - 22;
        long j2 = 0;
        if (j >= 0) {
            long j3 = length - 65558;
            if (j3 >= 0) {
                j2 = j3;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(j);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C0576a c0576a = new C0576a();
                    c0576a.f2411b = Integer.reverseBytes(randomAccessFile.readInt()) & BodyPartID.bodyIdMax;
                    c0576a.f2410a = Integer.reverseBytes(randomAccessFile.readInt()) & BodyPartID.bodyIdMax;
                    return c0576a;
                }
                j--;
            } while (j >= j2);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    /* renamed from: c */
    public static long m67998c(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, PDPageLabelRange.STYLE_ROMAN_LOWER);
        try {
            return m68000a(randomAccessFile, m67999b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}
