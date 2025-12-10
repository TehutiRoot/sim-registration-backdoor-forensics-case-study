package p000;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: F72 */
/* loaded from: classes2.dex */
public abstract class F72 {

    /* renamed from: F72$a */
    /* loaded from: classes2.dex */
    public static class C0362a {

        /* renamed from: a */
        public long f1589a;

        /* renamed from: b */
        public long f1590b;
    }

    /* renamed from: a */
    public static long m68512a(RandomAccessFile randomAccessFile, C0362a c0362a) {
        CRC32 crc32 = new CRC32();
        long j = c0362a.f1590b;
        randomAccessFile.seek(c0362a.f1589a);
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
    public static C0362a m68511b(RandomAccessFile randomAccessFile) {
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
                    C0362a c0362a = new C0362a();
                    c0362a.f1590b = Integer.reverseBytes(randomAccessFile.readInt()) & BodyPartID.bodyIdMax;
                    c0362a.f1589a = Integer.reverseBytes(randomAccessFile.readInt()) & BodyPartID.bodyIdMax;
                    return c0362a;
                }
                j--;
            } while (j >= j2);
            throw new ZipException("End Of Central Directory signature not found");
        }
        throw new ZipException("File too short to be a zip file: " + randomAccessFile.length());
    }

    /* renamed from: c */
    public static long m68510c(File file) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, PDPageLabelRange.STYLE_ROMAN_LOWER);
        try {
            return m68512a(randomAccessFile, m68511b(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }
}