package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Supplier;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.Uncheck;
import org.apache.commons.p028io.input.SequenceReader;

/* renamed from: org.apache.commons.io.input.SequenceReader */
/* loaded from: classes6.dex */
public class SequenceReader extends Reader {

    /* renamed from: a */
    public Reader f73450a;

    /* renamed from: b */
    public final Iterator f73451b;

    public SequenceReader(Iterable<? extends Reader> iterable) {
        Objects.requireNonNull(iterable, "readers");
        this.f73451b = iterable.iterator();
        this.f73450a = (Reader) Uncheck.get(new IOSupplier() { // from class: IF1
            {
                SequenceReader.this = this;
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Supplier asSupplier() {
                return AbstractC17712Hb0.m68064a(this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public final Object get() {
                return SequenceReader.m25055b(SequenceReader.this);
            }

            @Override // org.apache.commons.p028io.function.IOSupplier
            public /* synthetic */ Object getUnchecked() {
                return AbstractC17712Hb0.m68063b(this);
            }
        });
    }

    /* renamed from: b */
    public static /* synthetic */ Reader m25055b(SequenceReader sequenceReader) {
        return sequenceReader.m25054d();
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        do {
        } while (m25054d() != null);
    }

    /* renamed from: d */
    public final Reader m25054d() {
        Reader reader = this.f73450a;
        if (reader != null) {
            reader.close();
        }
        if (this.f73451b.hasNext()) {
            this.f73450a = (Reader) this.f73451b.next();
        } else {
            this.f73450a = null;
        }
        return this.f73450a;
    }

    @Override // java.io.Reader
    public int read() throws IOException {
        int i = -1;
        while (true) {
            Reader reader = this.f73450a;
            if (reader == null || (i = reader.read()) != -1) {
                break;
            }
            m25054d();
        }
        return i;
    }

    public SequenceReader(Reader... readerArr) {
        this(Arrays.asList(readerArr));
    }

    @Override // java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        Objects.requireNonNull(cArr, "cbuf");
        if (i2 < 0 || i < 0 || i + i2 > cArr.length) {
            throw new IndexOutOfBoundsException("Array Size=" + cArr.length + ", offset=" + i + ", length=" + i2);
        }
        int i3 = 0;
        while (true) {
            Reader reader = this.f73450a;
            if (reader == null) {
                break;
            }
            int read = reader.read(cArr, i, i2);
            if (read == -1) {
                m25054d();
            } else {
                i3 += read;
                i += read;
                i2 -= read;
                if (i2 <= 0) {
                    break;
                }
            }
        }
        if (i3 > 0) {
            return i3;
        }
        return -1;
    }
}
