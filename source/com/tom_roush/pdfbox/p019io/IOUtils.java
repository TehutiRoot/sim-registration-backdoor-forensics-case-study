package com.tom_roush.pdfbox.p019io;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.tom_roush.pdfbox.io.IOUtils */
/* loaded from: classes5.dex */
public final class IOUtils {
    public static IOException closeAndLogException(Closeable closeable, String str, IOException iOException) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("PdfBox-Android", "Error closing " + str, e);
            if (iOException == null) {
                return e;
            }
        }
        return iOException;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static long copy(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 != read) {
                outputStream.write(bArr, 0, read);
                j += read;
            } else {
                return j;
            }
        }
    }

    public static long populateBuffer(InputStream inputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        while (length > 0) {
            int read = inputStream.read(bArr, bArr.length - length, length);
            if (read < 0) {
                break;
            }
            length -= read;
        }
        return bArr.length - length;
    }

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }
}
