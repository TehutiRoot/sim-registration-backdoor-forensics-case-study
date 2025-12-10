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
    public static final int f73434k = FileSystem.getCurrent().getBlockSize();

    /* renamed from: a */
    public final int f73435a;

    /* renamed from: b */
    public final Charset f73436b;

    /* renamed from: c */
    public final SeekableByteChannel f73437c;

    /* renamed from: d */
    public final long f73438d;

    /* renamed from: e */
    public final long f73439e;

    /* renamed from: f */
    public final byte[][] f73440f;

    /* renamed from: g */
    public final int f73441g;

    /* renamed from: h */
    public final int f73442h;

    /* renamed from: i */
    public C12534b f73443i;

    /* renamed from: j */
    public boolean f73444j;

    /* renamed from: org.apache.commons.io.input.ReversedLinesFileReader$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<ReversedLinesFileReader, Builder> {
        public Builder() {
            setBufferSizeDefault(ReversedLinesFileReader.f73434k);
            setBufferSize(ReversedLinesFileReader.f73434k);
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
        public final long f73445a;

        /* renamed from: b */
        public final byte[] f73446b;

        /* renamed from: c */
        public byte[] f73447c;

        /* renamed from: d */
        public int f73448d;

        /* renamed from: c */
        public final void m25059c() {
            int i = this.f73448d + 1;
            if (i > 0) {
                this.f73447c = Arrays.copyOf(this.f73446b, i);
            } else {
                this.f73447c = null;
            }
            this.f73448d = -1;
        }

        /* renamed from: d */
        public final int m25058d(byte[] bArr, int i) {
            byte[][] bArr2;
            boolean z;
            for (byte[] bArr3 : ReversedLinesFileReader.this.f73440f) {
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
        public final String m25057e() {
            boolean z;
            String str;
            byte[] bArr;
            if (this.f73445a == 1) {
                z = true;
            } else {
                z = false;
            }
            int i = this.f73448d;
            while (true) {
                if (i > -1) {
                    if (!z && i < ReversedLinesFileReader.this.f73441g) {
                        m25059c();
                        break;
                    }
                    int m25058d = m25058d(this.f73446b, i);
                    if (m25058d > 0) {
                        int i2 = i + 1;
                        int i3 = (this.f73448d - i2) + 1;
                        if (i3 >= 0) {
                            str = new String(Arrays.copyOfRange(this.f73446b, i2, i3 + i2), ReversedLinesFileReader.this.f73436b);
                            this.f73448d = i - m25058d;
                        } else {
                            throw new IllegalStateException("Unexpected negative line length=" + i3);
                        }
                    } else {
                        i -= ReversedLinesFileReader.this.f73442h;
                        if (i < 0) {
                            m25059c();
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            str = null;
            if (z && (bArr = this.f73447c) != null) {
                String str2 = new String(bArr, ReversedLinesFileReader.this.f73436b);
                this.f73447c = null;
                return str2;
            }
            return str;
        }

        /* renamed from: f */
        public final C12534b m25056f() {
            if (this.f73448d <= -1) {
                long j = this.f73445a;
                if (j > 1) {
                    ReversedLinesFileReader reversedLinesFileReader = ReversedLinesFileReader.this;
                    return new C12534b(j - 1, reversedLinesFileReader.f73435a, this.f73447c);
                } else if (this.f73447c == null) {
                    return null;
                } else {
                    throw new IllegalStateException("Unexpected leftover of the last block: leftOverOfThisFilePart=" + new String(this.f73447c, ReversedLinesFileReader.this.f73436b));
                }
            }
            throw new IllegalStateException("Current currentLastCharPos unexpectedly positive... last readLine() should have returned something! currentLastCharPos=" + this.f73448d);
        }

        public C12534b(long j, int i, byte[] bArr) {
            int read;
            this.f73445a = j;
            byte[] bArr2 = new byte[(bArr != null ? bArr.length : 0) + i];
            this.f73446b = bArr2;
            long j2 = (j - 1) * ReversedLinesFileReader.this.f73435a;
            if (j > 0) {
                ReversedLinesFileReader.this.f73437c.position(j2);
                read = ReversedLinesFileReader.this.f73437c.read(ByteBuffer.wrap(bArr2, 0, i));
                if (read != i) {
                    throw new IllegalStateException("Count of requested bytes and actually read bytes don't match");
                }
            }
            if (bArr != null) {
                System.arraycopy(bArr, 0, bArr2, i, bArr.length);
            }
            this.f73448d = bArr2.length - 1;
            this.f73447c = null;
        }
    }

    @Deprecated
    public ReversedLinesFileReader(File file) throws IOException {
        this(file, f73434k, Charset.defaultCharset());
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73437c.close();
    }

    public String readLine() throws IOException {
        String m25057e = this.f73443i.m25057e();
        while (m25057e == null) {
            C12534b m25056f = this.f73443i.m25056f();
            this.f73443i = m25056f;
            if (m25056f == null) {
                break;
            }
            m25057e = m25056f.m25057e();
        }
        if ("".equals(m25057e) && !this.f73444j) {
            this.f73444j = true;
            return readLine();
        }
        return m25057e;
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
        return ZQ1.m65238a(System.lineSeparator(), readLines) + System.lineSeparator();
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
            java.nio.file.Path r1 = p000.AbstractC19496dG1.m31913a(r1)
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
            java.nio.file.Path r1 = p000.AbstractC19496dG1.m31913a(r1)
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
            java.nio.file.Path r1 = p000.AbstractC19496dG1.m31913a(r1)
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.ReversedLinesFileReader.<init>(java.io.File, int, java.lang.String):void");
    }

    @Deprecated
    public ReversedLinesFileReader(Path path, Charset charset) throws IOException {
        this(path, f73434k, charset);
    }

    @Deprecated
    public ReversedLinesFileReader(Path path, int i, Charset charset) throws IOException {
        StandardOpenOption standardOpenOption;
        SeekableByteChannel newByteChannel;
        long size;
        int i2;
        this.f73435a = i;
        Charset charset2 = Charsets.toCharset(charset);
        this.f73436b = charset2;
        if (charset2.newEncoder().maxBytesPerChar() != 1.0f && charset2 != StandardCharsets.UTF_8) {
            if (charset2 != Charset.forName("Shift_JIS") && charset2 != Charset.forName("windows-31j") && charset2 != Charset.forName("x-windows-949") && charset2 != Charset.forName("gbk") && charset2 != Charset.forName("x-windows-950")) {
                if (charset2 != StandardCharsets.UTF_16BE && charset2 != StandardCharsets.UTF_16LE) {
                    if (charset2 == StandardCharsets.UTF_16) {
                        throw new UnsupportedEncodingException("For UTF-16, you need to specify the byte order (use UTF-16BE or UTF-16LE)");
                    }
                    throw new UnsupportedEncodingException("Encoding " + charset + " is not supported yet (feel free to submit a patch)");
                }
                this.f73442h = 2;
            } else {
                this.f73442h = 1;
            }
        } else {
            this.f73442h = 1;
        }
        byte[][] bArr = {StandardLineSeparator.CRLF.getBytes(charset2), StandardLineSeparator.LF.getBytes(charset2), StandardLineSeparator.CR.getBytes(charset2)};
        this.f73440f = bArr;
        this.f73441g = bArr[0].length;
        standardOpenOption = StandardOpenOption.READ;
        newByteChannel = Files.newByteChannel(path, standardOpenOption);
        this.f73437c = newByteChannel;
        size = newByteChannel.size();
        this.f73438d = size;
        long j = i;
        int i3 = (int) (size % j);
        if (i3 > 0) {
            this.f73439e = (size / j) + 1;
        } else {
            this.f73439e = size / j;
            if (size > 0) {
                i2 = i;
                this.f73443i = new C12534b(this.f73439e, i2, null);
            }
        }
        i2 = i3;
        this.f73443i = new C12534b(this.f73439e, i2, null);
    }

    @Deprecated
    public ReversedLinesFileReader(Path path, int i, String str) throws IOException {
        this(path, i, Charsets.toCharset(str));
    }
}
