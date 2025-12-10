package com.tom_roush.pdfbox.util.filetypedetector;

import com.google.common.base.Ascii;
import com.tom_roush.pdfbox.util.Charsets;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class FileTypeDetector {

    /* renamed from: a */
    public static final C1694Xf f60863a;

    static {
        C1694Xf c1694Xf = new C1694Xf();
        f60863a = c1694Xf;
        c1694Xf.m65461d(FileType.UNKNOWN);
        c1694Xf.m65464a(FileType.JPEG, new byte[]{-1, -40});
        FileType fileType = FileType.TIFF;
        Charset charset = Charsets.ISO_8859_1;
        c1694Xf.m65464a(fileType, "II".getBytes(charset), new byte[]{42, 0});
        c1694Xf.m65464a(fileType, "MM".getBytes(charset), new byte[]{0, 42});
        c1694Xf.m65464a(FileType.PSD, "8BPS".getBytes(charset));
        c1694Xf.m65464a(FileType.PNG, new byte[]{-119, 80, 78, 71, 13, 10, Ascii.SUB, 10, 0, 0, 0, 13, 73, 72, 68, 82});
        c1694Xf.m65464a(FileType.BMP, "BM".getBytes(charset));
        FileType fileType2 = FileType.GIF;
        c1694Xf.m65464a(fileType2, "GIF87a".getBytes(charset));
        c1694Xf.m65464a(fileType2, "GIF89a".getBytes(charset));
        c1694Xf.m65464a(FileType.ICO, new byte[]{0, 0, 1, 0});
        FileType fileType3 = FileType.PCX;
        c1694Xf.m65464a(fileType3, new byte[]{10, 0, 1});
        c1694Xf.m65464a(fileType3, new byte[]{10, 2, 1});
        c1694Xf.m65464a(fileType3, new byte[]{10, 3, 1});
        c1694Xf.m65464a(fileType3, new byte[]{10, 5, 1});
        c1694Xf.m65464a(FileType.RIFF, "RIFF".getBytes(charset));
        c1694Xf.m65464a(FileType.CRW, "II".getBytes(charset), new byte[]{Ascii.SUB, 0, 0, 0}, "HEAPCCDR".getBytes(charset));
        c1694Xf.m65464a(FileType.CR2, "II".getBytes(charset), new byte[]{42, 0, 16, 0, 0, 0, 67, 82});
        c1694Xf.m65464a(FileType.NEF, "MM".getBytes(charset), new byte[]{0, 42, 0, 0, 0, Byte.MIN_VALUE, 0});
        FileType fileType4 = FileType.ORF;
        c1694Xf.m65464a(fileType4, "IIRO".getBytes(charset), new byte[]{8, 0});
        c1694Xf.m65464a(fileType4, "IIRS".getBytes(charset), new byte[]{8, 0});
        c1694Xf.m65464a(FileType.RAF, "FUJIFILMCCD-RAW".getBytes(charset));
        c1694Xf.m65464a(FileType.RW2, "II".getBytes(charset), new byte[]{85, 0});
    }

    public static FileType detectFileType(BufferedInputStream bufferedInputStream) throws IOException {
        if (bufferedInputStream.markSupported()) {
            C1694Xf c1694Xf = f60863a;
            int m65462c = c1694Xf.m65462c();
            bufferedInputStream.mark(m65462c);
            byte[] bArr = new byte[m65462c];
            if (bufferedInputStream.read(bArr) != -1) {
                bufferedInputStream.reset();
                return (FileType) c1694Xf.m65463b(bArr);
            }
            throw new IOException("Stream ended before file's magic number could be determined.");
        }
        throw new IOException("Stream must support mark/reset");
    }

    public static FileType detectFileType(byte[] bArr) throws IOException {
        return (FileType) f60863a.m65463b(bArr);
    }
}
