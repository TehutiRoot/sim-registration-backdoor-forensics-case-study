package org.apache.commons.p028io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.Writer;

/* renamed from: org.apache.commons.io.output.ChunkedWriter */
/* loaded from: classes6.dex */
public class ChunkedWriter extends FilterWriter {

    /* renamed from: a */
    public final int f73632a;

    public ChunkedWriter(Writer writer) {
        this(writer, 8192);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        while (i2 > 0) {
            int min = Math.min(i2, this.f73632a);
            ((FilterWriter) this).out.write(cArr, i, min);
            i2 -= min;
            i += min;
        }
    }

    public ChunkedWriter(Writer writer, int i) {
        super(writer);
        if (i > 0) {
            this.f73632a = i;
            return;
        }
        throw new IllegalArgumentException();
    }
}