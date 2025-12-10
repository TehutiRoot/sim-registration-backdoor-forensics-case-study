package org.apache.commons.p028io.output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import org.apache.commons.p028io.Charsets;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.input.XmlStreamReader;

/* renamed from: org.apache.commons.io.output.XmlStreamWriter */
/* loaded from: classes6.dex */
public class XmlStreamWriter extends Writer {

    /* renamed from: a */
    public final OutputStream f73586a;

    /* renamed from: b */
    public final Charset f73587b;

    /* renamed from: c */
    public StringWriter f73588c;

    /* renamed from: d */
    public Writer f73589d;

    /* renamed from: e */
    public Charset f73590e;

    /* renamed from: org.apache.commons.io.output.XmlStreamWriter$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<XmlStreamWriter, Builder> {
        public Builder() {
            Charset charset = StandardCharsets.UTF_8;
            setCharsetDefault(charset);
            setCharset(charset);
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public XmlStreamWriter get() throws IOException {
            return new XmlStreamWriter(getOutputStream(), getCharset());
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: b */
    public final void m24875b(char[] cArr, int i, int i2) {
        int i3;
        StringBuffer buffer = this.f73588c.getBuffer();
        if (buffer.length() + i2 > 8192) {
            i3 = 8192 - buffer.length();
        } else {
            i3 = i2;
        }
        this.f73588c.write(cArr, i, i3);
        if (buffer.length() >= 5) {
            if (buffer.substring(0, 5).equals("<?xml")) {
                int indexOf = buffer.indexOf("?>");
                if (indexOf > 0) {
                    Matcher matcher = XmlStreamReader.ENCODING_PATTERN.matcher(buffer.substring(0, indexOf));
                    if (matcher.find()) {
                        String upperCase = matcher.group(1).toUpperCase(Locale.ROOT);
                        this.f73590e = Charset.forName(upperCase.substring(1, upperCase.length() - 1));
                    } else {
                        this.f73590e = this.f73587b;
                    }
                } else if (buffer.length() >= 8192) {
                    this.f73590e = this.f73587b;
                }
            } else {
                this.f73590e = this.f73587b;
            }
            if (this.f73590e != null) {
                this.f73588c = null;
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f73586a, this.f73590e);
                this.f73589d = outputStreamWriter;
                outputStreamWriter.write(buffer.toString());
                if (i2 > i3) {
                    this.f73589d.write(cArr, i + i3, i2 - i3);
                }
            }
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f73589d == null) {
            this.f73590e = this.f73587b;
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(this.f73586a, this.f73590e);
            this.f73589d = outputStreamWriter;
            outputStreamWriter.write(this.f73588c.toString());
        }
        this.f73589d.close();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        Writer writer = this.f73589d;
        if (writer != null) {
            writer.flush();
        }
    }

    public String getDefaultEncoding() {
        return this.f73587b.name();
    }

    public String getEncoding() {
        return this.f73590e.name();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        if (this.f73588c != null) {
            m24875b(cArr, i, i2);
        } else {
            this.f73589d.write(cArr, i, i2);
        }
    }

    @Deprecated
    public XmlStreamWriter(File file) throws FileNotFoundException {
        this(file, (String) null);
    }

    @Deprecated
    public XmlStreamWriter(File file, String str) throws FileNotFoundException {
        this(new FileOutputStream(file), str);
    }

    @Deprecated
    public XmlStreamWriter(OutputStream outputStream) {
        this(outputStream, StandardCharsets.UTF_8);
    }

    public XmlStreamWriter(OutputStream outputStream, Charset charset) {
        this.f73588c = new StringWriter(8192);
        this.f73586a = outputStream;
        Objects.requireNonNull(charset);
        this.f73587b = charset;
    }

    @Deprecated
    public XmlStreamWriter(OutputStream outputStream, String str) {
        this(outputStream, Charsets.toCharset(str, StandardCharsets.UTF_8));
    }
}
