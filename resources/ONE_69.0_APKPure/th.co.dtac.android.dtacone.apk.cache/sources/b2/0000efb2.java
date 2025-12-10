package org.apache.commons.p028io.input;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;
import java.util.function.IntPredicate;
import org.apache.commons.p028io.input.AbstractCharacterFilterReader;

/* renamed from: org.apache.commons.io.input.AbstractCharacterFilterReader */
/* loaded from: classes6.dex */
public abstract class AbstractCharacterFilterReader extends FilterReader {
    protected static final IntPredicate SKIP_NONE = new IntPredicate() { // from class: A
        @Override // java.util.function.IntPredicate
        public final boolean test(int i) {
            return AbstractCharacterFilterReader.m25352b(i);
        }
    };

    /* renamed from: a */
    public final IntPredicate f73407a;

    public AbstractCharacterFilterReader(Reader reader) {
        this(reader, SKIP_NONE);
    }

    /* renamed from: b */
    public static /* synthetic */ boolean m25352b(int i) {
        return m25351d(i);
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m25351d(int i) {
        return false;
    }

    public boolean filter(int i) {
        boolean test;
        test = this.f73407a.test(i);
        return test;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read() throws IOException {
        int read;
        do {
            read = ((FilterReader) this).in.read();
            if (read == -1) {
                break;
            }
        } while (filter(read));
        return read;
    }

    public AbstractCharacterFilterReader(Reader reader, IntPredicate intPredicate) {
        super(reader);
        this.f73407a = intPredicate == null ? SKIP_NONE : intPredicate;
    }

    @Override // java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i, int i2) throws IOException {
        int read = super.read(cArr, i, i2);
        if (read == -1) {
            return -1;
        }
        int i3 = i - 1;
        for (int i4 = i; i4 < i + read; i4++) {
            if (!filter(cArr[i4]) && (i3 = i3 + 1) < i4) {
                cArr[i3] = cArr[i4];
            }
        }
        return (i3 - i) + 1;
    }
}