package p000;

import io.realm.internal.OsCollectionChangeSet;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: Wf */
/* loaded from: classes4.dex */
public abstract class AbstractC1624Wf {
    /* renamed from: a */
    public static byte[] m65593a(Queue queue, int i) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArr = (byte[]) queue.remove();
        if (bArr.length == i) {
            return bArr;
        }
        int length = i - bArr.length;
        byte[] copyOf = Arrays.copyOf(bArr, i);
        while (length > 0) {
            byte[] bArr2 = (byte[]) queue.remove();
            int min = Math.min(length, bArr2.length);
            System.arraycopy(bArr2, 0, copyOf, i - length, min);
            length -= min;
        }
        return copyOf;
    }

    /* renamed from: b */
    public static InputStream m65592b(InputStream inputStream, long j) {
        return new C1625a(inputStream, j);
    }

    /* renamed from: c */
    public static int m65591c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* renamed from: d */
    public static byte[] m65590d(InputStream inputStream) {
        return m65589e(inputStream, new ArrayDeque(20), 0);
    }

    /* renamed from: e */
    public static byte[] m65589e(InputStream inputStream, Queue queue, int i) {
        int i2;
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i) * 2));
        while (i < 2147483639) {
            int min2 = Math.min(min, OsCollectionChangeSet.MAX_ARRAY_LENGTH - i);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = inputStream.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return m65593a(queue, i);
                }
                i3 += read;
                i += read;
            }
            long j = min;
            if (min < 4096) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            min = m65591c(j * i2);
        }
        if (inputStream.read() == -1) {
            return m65593a(queue, OsCollectionChangeSet.MAX_ARRAY_LENGTH);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }

    /* renamed from: Wf$a */
    /* loaded from: classes4.dex */
    public static final class C1625a extends FilterInputStream {

        /* renamed from: a */
        public long f7259a;

        /* renamed from: b */
        public long f7260b;

        public C1625a(InputStream inputStream, long j) {
            super(inputStream);
            this.f7260b = -1L;
            this.f7259a = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            return (int) Math.min(((FilterInputStream) this).in.available(), this.f7259a);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void mark(int i) {
            ((FilterInputStream) this).in.mark(i);
            this.f7260b = this.f7259a;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            if (this.f7259a == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read();
            if (read != -1) {
                this.f7259a--;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public synchronized void reset() {
            if (((FilterInputStream) this).in.markSupported()) {
                if (this.f7260b != -1) {
                    ((FilterInputStream) this).in.reset();
                    this.f7259a = this.f7260b;
                } else {
                    throw new IOException("Mark not set");
                }
            } else {
                throw new IOException("Mark not supported");
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) {
            long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.f7259a));
            this.f7259a -= skip;
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            long j = this.f7259a;
            if (j == 0) {
                return -1;
            }
            int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
            if (read != -1) {
                this.f7259a -= read;
            }
            return read;
        }
    }
}
