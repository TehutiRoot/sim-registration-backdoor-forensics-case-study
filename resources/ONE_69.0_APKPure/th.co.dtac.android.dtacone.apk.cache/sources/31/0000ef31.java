package org.apache.commons.p028io;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Objects;
import org.apache.commons.p028io.output.CloseShieldOutputStream;
import org.apache.http.message.TokenParser;

/* renamed from: org.apache.commons.io.HexDump */
/* loaded from: classes6.dex */
public class HexDump {
    @Deprecated
    public static final String EOL = System.lineSeparator();

    /* renamed from: a */
    public static final char[] f73330a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b */
    public static final int[] f73331b = {28, 24, 20, 16, 12, 8, 4, 0};

    /* renamed from: a */
    public static StringBuilder m25529a(StringBuilder sb, byte b) {
        for (int i = 0; i < 2; i++) {
            sb.append(f73330a[(b >> f73331b[i + 6]) & 15]);
        }
        return sb;
    }

    /* renamed from: b */
    public static StringBuilder m25528b(StringBuilder sb, long j) {
        for (int i = 0; i < 8; i++) {
            sb.append(f73330a[((int) (j >> f73331b[i])) & 15]);
        }
        return sb;
    }

    public static void dump(byte[] bArr, Appendable appendable) throws IOException {
        dump(bArr, 0L, appendable, 0, bArr.length);
    }

    public static void dump(byte[] bArr, long j, Appendable appendable, int i, int i2) throws IOException, ArrayIndexOutOfBoundsException {
        int i3;
        Objects.requireNonNull(appendable, "appendable");
        if (i >= 0 && i < bArr.length) {
            long j2 = j + i;
            StringBuilder sb = new StringBuilder(74);
            if (i2 < 0 || (i3 = i + i2) > bArr.length) {
                throw new ArrayIndexOutOfBoundsException(String.format("Range [%s, %<s + %s) out of bounds for length %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
            }
            while (i < i3) {
                int i4 = i3 - i;
                if (i4 > 16) {
                    i4 = 16;
                }
                m25528b(sb, j2).append(TokenParser.f74644SP);
                for (int i5 = 0; i5 < 16; i5++) {
                    if (i5 < i4) {
                        m25529a(sb, bArr[i5 + i]);
                    } else {
                        sb.append("  ");
                    }
                    sb.append(TokenParser.f74644SP);
                }
                for (int i6 = 0; i6 < i4; i6++) {
                    byte b = bArr[i6 + i];
                    if (b >= 32 && b < Byte.MAX_VALUE) {
                        sb.append((char) b);
                    } else {
                        sb.append('.');
                    }
                }
                sb.append(System.lineSeparator());
                appendable.append(sb);
                sb.setLength(0);
                j2 += i4;
                i += 16;
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("illegal index: " + i + " into array of length " + bArr.length);
    }

    public static void dump(byte[] bArr, long j, OutputStream outputStream, int i) throws IOException, ArrayIndexOutOfBoundsException {
        Objects.requireNonNull(outputStream, "stream");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(CloseShieldOutputStream.wrap(outputStream), Charset.defaultCharset());
        try {
            dump(bArr, j, outputStreamWriter, i, bArr.length - i);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}