package org.apache.commons.p028io.output;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import org.apache.commons.p028io.build.AbstractStreamBuilder;

/* renamed from: org.apache.commons.io.output.FileWriterWithEncoding */
/* loaded from: classes6.dex */
public class FileWriterWithEncoding extends ProxyWriter {

    /* renamed from: org.apache.commons.io.output.FileWriterWithEncoding$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<FileWriterWithEncoding, Builder> {

        /* renamed from: k */
        public boolean f73647k;

        /* renamed from: l */
        public CharsetEncoder f73648l = super.getCharset().newEncoder();

        public Builder setAppend(boolean z) {
            this.f73647k = z;
            return this;
        }

        public Builder setCharsetEncoder(CharsetEncoder charsetEncoder) {
            this.f73648l = charsetEncoder;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public FileWriterWithEncoding get() throws IOException {
            if (this.f73648l != null && getCharset() != null && !this.f73648l.charset().equals(getCharset())) {
                throw new IllegalStateException(String.format("Mismatched Charset(%s) and CharsetEncoder(%s)", getCharset(), this.f73648l.charset()));
            }
            Object obj = this.f73648l;
            if (obj == null) {
                obj = getCharset();
            }
            return new FileWriterWithEncoding(FileWriterWithEncoding.m25126d(checkOrigin().getFile(), obj, this.f73647k));
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.io.OutputStreamWriter m25126d(java.io.File r2, java.lang.Object r3, boolean r4) {
        /*
            java.lang.String r0 = "file"
            java.util.Objects.requireNonNull(r2, r0)
            boolean r0 = r2.exists()
            r1 = 0
            java.io.OutputStream r1 = org.apache.commons.p028io.FileUtils.newOutputStream(r2, r4)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r3 == 0) goto L2d
            boolean r4 = r3 instanceof java.nio.charset.Charset     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r4 == 0) goto L15
            goto L2d
        L15:
            boolean r4 = r3 instanceof java.nio.charset.CharsetEncoder     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            if (r4 == 0) goto L25
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.nio.charset.CharsetEncoder r3 = (java.nio.charset.CharsetEncoder) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r4.<init>(r1, r3)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r4
        L21:
            r3 = move-exception
            goto L39
        L23:
            r3 = move-exception
            goto L39
        L25:
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r4.<init>(r1, r3)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r4
        L2d:
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.nio.charset.Charset r3 = (java.nio.charset.Charset) r3     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            java.nio.charset.Charset r3 = org.apache.commons.p028io.Charsets.toCharset(r3)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            r4.<init>(r1, r3)     // Catch: java.lang.RuntimeException -> L21 java.io.IOException -> L23
            return r4
        L39:
            org.apache.commons.p028io.IOUtils.close(r1)     // Catch: java.io.IOException -> L3d
            goto L41
        L3d:
            r4 = move-exception
            r3.addSuppressed(r4)
        L41:
            if (r0 != 0) goto L46
            org.apache.commons.p028io.FileUtils.deleteQuietly(r2)
        L46:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.output.FileWriterWithEncoding.m25126d(java.io.File, java.lang.Object, boolean):java.io.OutputStreamWriter");
    }

    @Deprecated
    public FileWriterWithEncoding(File file, Charset charset) throws IOException {
        this(file, charset, false);
    }

    @Deprecated
    public FileWriterWithEncoding(File file, Charset charset, boolean z) throws IOException {
        this(m25126d(file, charset, z));
    }

    @Deprecated
    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder) throws IOException {
        this(file, charsetEncoder, false);
    }

    @Deprecated
    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder, boolean z) throws IOException {
        this(m25126d(file, charsetEncoder, z));
    }

    @Deprecated
    public FileWriterWithEncoding(File file, String str) throws IOException {
        this(file, str, false);
    }

    @Deprecated
    public FileWriterWithEncoding(File file, String str, boolean z) throws IOException {
        this(m25126d(file, str, z));
    }

    public FileWriterWithEncoding(OutputStreamWriter outputStreamWriter) {
        super(outputStreamWriter);
    }

    @Deprecated
    public FileWriterWithEncoding(String str, Charset charset) throws IOException {
        this(new File(str), charset, false);
    }

    @Deprecated
    public FileWriterWithEncoding(String str, Charset charset, boolean z) throws IOException {
        this(new File(str), charset, z);
    }

    @Deprecated
    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder) throws IOException {
        this(new File(str), charsetEncoder, false);
    }

    @Deprecated
    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder, boolean z) throws IOException {
        this(new File(str), charsetEncoder, z);
    }

    @Deprecated
    public FileWriterWithEncoding(String str, String str2) throws IOException {
        this(new File(str), str2, false);
    }

    @Deprecated
    public FileWriterWithEncoding(String str, String str2, boolean z) throws IOException {
        this(new File(str), str2, z);
    }
}