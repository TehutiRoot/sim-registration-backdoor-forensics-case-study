package org.apache.commons.p028io;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;

/* renamed from: org.apache.commons.io.LineIterator */
/* loaded from: classes6.dex */
public class LineIterator implements Iterator<String>, Closeable {

    /* renamed from: a */
    public final BufferedReader f73256a;

    /* renamed from: b */
    public String f73257b;

    /* renamed from: c */
    public boolean f73258c;

    public LineIterator(Reader reader) {
        Objects.requireNonNull(reader, "reader");
        if (reader instanceof BufferedReader) {
            this.f73256a = (BufferedReader) reader;
        } else {
            this.f73256a = new BufferedReader(reader);
        }
    }

    @Deprecated
    public static void closeQuietly(LineIterator lineIterator) {
        IOUtils.closeQuietly(lineIterator);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73258c = true;
        this.f73257b = null;
        IOUtils.close(this.f73256a);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        String readLine;
        if (this.f73257b != null) {
            return true;
        }
        if (this.f73258c) {
            return false;
        }
        do {
            try {
                readLine = this.f73256a.readLine();
                if (readLine == null) {
                    this.f73258c = true;
                    return false;
                }
            } catch (IOException e) {
                IOUtils.closeQuietly(this, new Consumer() { // from class: Yi0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        e.addSuppressed((IOException) obj);
                    }
                });
                throw new IllegalStateException(e);
            }
        } while (!isValidLine(readLine));
        this.f73257b = readLine;
        return true;
    }

    public boolean isValidLine(String str) {
        return true;
    }

    @Deprecated
    public String nextLine() {
        if (hasNext()) {
            String str = this.f73257b;
            this.f73257b = null;
            return str;
        }
        throw new NoSuchElementException("No more lines");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove not supported");
    }

    @Override // java.util.Iterator
    public String next() {
        return nextLine();
    }
}
