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
    public final BufferedReader f73340a;

    /* renamed from: b */
    public String f73341b;

    /* renamed from: c */
    public boolean f73342c;

    public LineIterator(Reader reader) {
        Objects.requireNonNull(reader, "reader");
        if (reader instanceof BufferedReader) {
            this.f73340a = (BufferedReader) reader;
        } else {
            this.f73340a = new BufferedReader(reader);
        }
    }

    @Deprecated
    public static void closeQuietly(LineIterator lineIterator) {
        IOUtils.closeQuietly(lineIterator);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f73342c = true;
        this.f73341b = null;
        IOUtils.close(this.f73340a);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        String readLine;
        if (this.f73341b != null) {
            return true;
        }
        if (this.f73342c) {
            return false;
        }
        do {
            try {
                readLine = this.f73340a.readLine();
                if (readLine == null) {
                    this.f73342c = true;
                    return false;
                }
            } catch (IOException e) {
                IOUtils.closeQuietly(this, new Consumer() { // from class: ej0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        e.addSuppressed((IOException) obj);
                    }
                });
                throw new IllegalStateException(e);
            }
        } while (!isValidLine(readLine));
        this.f73341b = readLine;
        return true;
    }

    public boolean isValidLine(String str) {
        return true;
    }

    @Deprecated
    public String nextLine() {
        if (hasNext()) {
            String str = this.f73341b;
            this.f73341b = null;
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