package org.apache.commons.p028io.input;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.apache.commons.p028io.Charsets;
import org.apache.commons.p028io.FileSystem;
import org.apache.commons.p028io.StandardLineSeparator;
import org.apache.commons.p028io.build.AbstractStreamBuilder;

/* renamed from: org.apache.commons.io.input.ReversedLinesFileReader */
/* loaded from: classes6.dex */
public class ReversedLinesFileReader implements Closeable {

    /* renamed from: k */
    public static final int f73518k = FileSystem.getCurrent().getBlockSize();

    /* renamed from: a */
    public final int f73519a;

    /* renamed from: b */
    public final Charset f73520b;

    /* renamed from: c */
    public final SeekableByteChannel f73521c;

    /* renamed from: d */
    public final long f73522d;

    /* renamed from: e */
    public final long f73523e;

    /* renamed from: f */
    public final byte[][] f73524f;

    /* renamed from: g */
    public final int f73525g;

    /* renamed from: h */
    public final int f73526h;

    /* renamed from: i */
    public C12534b f73527i;

    /* renamed from: j */
    public boolean f73528j;

    /* renamed from: org.apache.commons.io.input.ReversedLinesFileReader$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<ReversedLinesFileReader, Builder> {
        public Builder() {
            setBufferSizeDefault(ReversedLinesFileReader.f73518k);
            setBufferSize(ReversedLinesFileReader.f73518k);
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public ReversedLinesFileReader get() throws IOException {
            return new ReversedLinesFileReader(getPath(), getBufferSize(), getCharset());
        }
    }

    /* renamed from: org.apache.commons.io.input.ReversedLinesFileReader$b */
    /* loaded from: classes6.dex */
    public final class C12534b {

        /* renamed from: a */
        public final long f73529a;

        /* renamed from: b */
        public final byte[] f73530b;

        /* renamed from: c */
        public byte[] f73531c;

        /* renamed from: d */
        public int f73532d;

        /* renamed from: c */
        public final void m25249c() {
            int i = this.f73532d + 1;
            if (i > 0) {
                this.f73531c = Arrays.copyOf(this.f73530b, i);
            } else {
                this.f73531c = null;
            }
            this.f73532d = -1;
        }

        /* renamed from: d */
        public final int m25248d(byte[] bArr, int i) {
            byte[][] bArr2;
            boolean z;
            for (byte[] bArr3 : ReversedLinesFileReader.this.f73524f) {
                boolean z2 = true;
                for (int length = bArr3.length - 1; length >= 0; length--) {
                    int length2 = (i + length) - (bArr3.length - 1);
                    if (length2 >= 0 && bArr[length2] == bArr3[length]) {
                        z = true;
                    } else {
                        z = false;
                    }
                    z2 &= z;
                }
                if (z2) {
                    return bArr3.length;
                }
            }
            return 0;
        }

        /* renamed from: e */
        public final String m25247e() {
            boolean z;
            String str;
            byte[] bArr;
            if (this.f73529a == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = this.f73532d;
            while (true) {
                if (i > -1) {
                    if (!z && i < ReversedLinesFileReader.this.f73525g) {
                        m25249c();
                        break;
                    }
                    int m25248d = m25248d(this.f73530b, i);
                    if (m25248d > 0) {
                        int i2 = i + 1;
                        int i3 = (this.f73532d - i2) + 1;
                        if (i3 >= 0) {
                            str = new String(Arrays.copyOfRange(this.f73530b, i2, i3 + i2), ReversedLinesFileReader.this.f73520b);
                            this.f73532d = i - m25248d;
                        } else {
                            throw new IllegalStateException("Unexpected negative line length=" + i3);
                        }
                    } else {
                        i -= ReversedLinesFileReader.this.f73526h;
                        if (i < 0) {
                            m25249c();
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            str = null;
            if (z && (bArr = this.f73531c) != null) {
                String str2 = new String(bArr, ReversedLinesFileReader.this.f73520b);
                this.f73531c = null;
                return str2;
            }
            return str;
        }

        /* renamed from: f */
        public final C12534b m25246f() {
            if (this.f73532d <= -1) {
                long j = this.f73529a;
                if (j > 1) {
                    ReversedLinesFileReader reversedLinesFileReader = ReversedLinesFileReader.this;
                    return new C12534b(j - 1, reversedLinesFileReader.f73519a, this.f73531c);
                } else if (this.f73531c == null) {
                    return null;
                } else {
                    throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(this.f73531c, ReversedLinesFileReader.this.f73520b));
                }
            }
            throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.f73532d);
        }

        public C12534b(long j, int i, byte[] bArr) {
            int read;
            this.f73529a = j;
            byte[] bArr2 = new byte[(bArr != null ? bArr.length : 0) + i];
            this.f73530b = bArr2;
            long j2 = (j - 1) * ReversedLinesFileReader.this.f73519a;
            if (j > 0) {
                ReversedLinesFileReader.this.f73521c.position(j2);
                read = ReversedLinesFileReader.this.f73521c.read(ByteBuffer.wrap(bArr2, 0, i));
                if (read != i) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i, bArr.length);
            }
            this.f73532d = bArr2.length - 1;
            this.f73531c = null;
        }
    }

    @Deprecated
    public ReversedLinesFileReader(File file) throws IOException {
        this(file, f73518k, Charset.defaultCharset());
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73521c.close();
    }

    public String readLine() throws IOException {
        String m25247e = this.f73527i.m25247e();
        while (m25247e == null) {
            C12534b m25246f = this.f73527i.m25246f();
            this.f73527i = m25246f;
            if (m25246f == null) {
                break;
            }
            m25247e = m25246f.m25247e();
        }
        if ("".equals(m25247e) && !this.f73528j) {
            this.f73528j = true;
            return readLine();
        }
        return m25247e;
    }

    public List<String> readLines(int i) throws IOException {
        if (i >= 0) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                String readLine = readLine();
                if (readLine == null) {
                    return arrayList;
                }
                arrayList.add(readLine);
            }
            return arrayList;
        }
        throw new IllegalArgumentException("lineCount < 0");
    }

    public String toString(int i) throws IOException {
        List<String> readLines = readLines(i);
        Collections.reverse(readLines);
        if (readLines.isEmpty()) {
            return "";
        }
        return WR1.m65759a(System.lineSeparator(), readLines) + System.lineSeparator();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ReversedLinesFileReader(java.io.File r1, java.nio.charset.Charset r2) throws java.io.IOException {
        /*
            r0 = this;
            java.nio.file.Path r1 = p000.AbstractC19024aH1.m65162a(r1)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.ReversedLinesFileReader.<init>(java.io.File, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ReversedLinesFileReader(java.io.File r1, int r2, java.nio.charset.Charset r3) throws java.io.IOException {
        /*
            r0 = this;
            java.nio.file.Path r1 = p000.AbstractC19024aH1.m65162a(r1)
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.ReversedLinesFileReader.<init>(java.io.File, int, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ReversedLinesFileReader(java.io.File r1, int r2, java.lang.String r3) throws java.io.IOException {
        /*
            r0 = this;
            java.nio.file.Path r1 = p000.AbstractC19024aH1.m65162a(r1)
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.ReversedLinesFileReader.<init>(java.io.File, int, java.lang.String):void");
    }

    @Deprecated
    public ReversedLinesFileReader(Path path, Charset charset) throws IOException {
        this(path, f73518k, charset);
    }

    @Deprecated
    public ReversedLinesFileReader(Path path, int i, Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        SeekableByteChannel newByteChannel;
        long size;
        int i2;
        this.f73519a = i;
        Charset charset2 = Charsets.toCharset(charset);
        this.f73520b = charset2;
        if (charset2.newEncoder().maxBytesPerChar() != 1.0f && charset2 != StandardCharsets.UTF_8) {
            if (charset2 != Charset.forName("Shift_JIS") && charset2 != Charset.forName("windows-31j") && charset2 != Charset.forName("x-windows-949") && charset2 != Charset.forName("gbk") && charset2 != Charset.forName("x-windows-950")) {
                if (charset2 != StandardCharsets.UTF_16BE && charset2 != StandardCharsets.UTF_16LE) {
                    if (charset2 == StandardCharsets.UTF_16) {
                        throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
                    }
                    throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
                }
                this.f73526h = 2;
            } else {
                this.f73526h = 1;
            }
        } else {
            this.f73526h = 1;
        }
        byte[][] bArr = {StandardLineSeparator.CRLF.getBytes(charset2), StandardLineSeparator.LF.getBytes(charset2), StandardLineSeparator.CR.getBytes(charset2)};
        this.f73524f = bArr;
        this.f73525g = bArr[0].length;
        standardOpenOption = StandardOpenOption.READ;
        newByteChannel = Files.newByteChannel(path, standardOpenOption);
        this.f73521c = newByteChannel;
        size = newByteChannel.size();
        this.f73522d = size;
        long j = i;
        int i3 = (int) (size % j);
        if (i3 > 0) {
            this.f73523e = (size / j) + 1;
        } else {
            this.f73523e = size / j;
            if (size > 0) {
                i2 = i;
                this.f73527i = new C12534b(this.f73523e, i2, null);
            }
        }
        i2 = i3;
        this.f73527i = new C12534b(this.f73523e, i2, null);
    }

    @Deprecated
    public ReversedLinesFileReader(Path path, int i, String str) throws IOException {
        this(path, i, Charsets.toCharset(str));
    }
}