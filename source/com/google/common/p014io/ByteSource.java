package com.google.common.p014io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.hash.Funnels;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

@J2ktIncompatible
@GwtIncompatible
/* renamed from: com.google.common.io.ByteSource */
/* loaded from: classes4.dex */
public abstract class ByteSource {

    /* renamed from: com.google.common.io.ByteSource$a */
    /* loaded from: classes4.dex */
    public class C8085a extends CharSource {

        /* renamed from: a */
        public final Charset f53926a;

        public C8085a(Charset charset) {
            this.f53926a = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.p014io.CharSource
        public ByteSource asByteSource(Charset charset) {
            if (charset.equals(this.f53926a)) {
                return ByteSource.this;
            }
            return super.asByteSource(charset);
        }

        @Override // com.google.common.p014io.CharSource
        public Reader openStream() {
            return new InputStreamReader(ByteSource.this.openStream(), this.f53926a);
        }

        @Override // com.google.common.p014io.CharSource
        public String read() {
            return new String(ByteSource.this.read(), this.f53926a);
        }

        public String toString() {
            return ByteSource.this.toString() + ".asCharSource(" + this.f53926a + ")";
        }
    }

    /* renamed from: com.google.common.io.ByteSource$b */
    /* loaded from: classes4.dex */
    public static class C8086b extends ByteSource {

        /* renamed from: a */
        public final byte[] f53928a;

        /* renamed from: b */
        public final int f53929b;

        /* renamed from: c */
        public final int f53930c;

        public C8086b(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // com.google.common.p014io.ByteSource
        public long copyTo(OutputStream outputStream) {
            outputStream.write(this.f53928a, this.f53929b, this.f53930c);
            return this.f53930c;
        }

        @Override // com.google.common.p014io.ByteSource
        public HashCode hash(HashFunction hashFunction) {
            return hashFunction.hashBytes(this.f53928a, this.f53929b, this.f53930c);
        }

        @Override // com.google.common.p014io.ByteSource
        public boolean isEmpty() {
            if (this.f53930c == 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openBufferedStream() {
            return openStream();
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openStream() {
            return new ByteArrayInputStream(this.f53928a, this.f53929b, this.f53930c);
        }

        @Override // com.google.common.p014io.ByteSource
        public byte[] read() {
            byte[] bArr = this.f53928a;
            int i = this.f53929b;
            return Arrays.copyOfRange(bArr, i, this.f53930c + i);
        }

        @Override // com.google.common.p014io.ByteSource
        public long size() {
            return this.f53930c;
        }

        @Override // com.google.common.p014io.ByteSource
        public Optional sizeIfKnown() {
            return Optional.m41313of(Long.valueOf(this.f53930c));
        }

        @Override // com.google.common.p014io.ByteSource
        public ByteSource slice(long j, long j2) {
            boolean z;
            boolean z2 = false;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "offset (%s) may not be negative", j);
            if (j2 >= 0) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "length (%s) may not be negative", j2);
            long min = Math.min(j, this.f53930c);
            long min2 = Math.min(j2, this.f53930c - min);
            return new C8086b(this.f53928a, this.f53929b + ((int) min), (int) min2);
        }

        public String toString() {
            return "ByteSource.wrap(" + Ascii.truncate(BaseEncoding.base16().encode(this.f53928a, this.f53929b, this.f53930c), 30, "...") + ")";
        }

        public C8086b(byte[] bArr, int i, int i2) {
            this.f53928a = bArr;
            this.f53929b = i;
            this.f53930c = i2;
        }

        @Override // com.google.common.p014io.ByteSource
        public Object read(ByteProcessor byteProcessor) {
            byteProcessor.processBytes(this.f53928a, this.f53929b, this.f53930c);
            return byteProcessor.getResult();
        }
    }

    /* renamed from: com.google.common.io.ByteSource$c */
    /* loaded from: classes4.dex */
    public static final class C8087c extends ByteSource {

        /* renamed from: a */
        public final Iterable f53931a;

        public C8087c(Iterable iterable) {
            this.f53931a = (Iterable) Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.p014io.ByteSource
        public boolean isEmpty() {
            for (ByteSource byteSource : this.f53931a) {
                if (!byteSource.isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openStream() {
            return new C20011gG0(this.f53931a.iterator());
        }

        @Override // com.google.common.p014io.ByteSource
        public long size() {
            long j = 0;
            for (ByteSource byteSource : this.f53931a) {
                j += byteSource.size();
                if (j < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return j;
        }

        @Override // com.google.common.p014io.ByteSource
        public Optional sizeIfKnown() {
            Iterable<ByteSource> iterable = this.f53931a;
            if (!(iterable instanceof Collection)) {
                return Optional.absent();
            }
            long j = 0;
            for (ByteSource byteSource : iterable) {
                Optional<Long> sizeIfKnown = byteSource.sizeIfKnown();
                if (!sizeIfKnown.isPresent()) {
                    return Optional.absent();
                }
                j += sizeIfKnown.get().longValue();
                if (j < 0) {
                    return Optional.m41313of(Long.MAX_VALUE);
                }
            }
            return Optional.m41313of(Long.valueOf(j));
        }

        public String toString() {
            return "ByteSource.concat(" + this.f53931a + ")";
        }
    }

    /* renamed from: com.google.common.io.ByteSource$d */
    /* loaded from: classes4.dex */
    public static final class C8088d extends C8086b {

        /* renamed from: d */
        public static final C8088d f53932d = new C8088d();

        public C8088d() {
            super(new byte[0]);
        }

        @Override // com.google.common.p014io.ByteSource
        public CharSource asCharSource(Charset charset) {
            Preconditions.checkNotNull(charset);
            return CharSource.empty();
        }

        @Override // com.google.common.p014io.ByteSource.C8086b, com.google.common.p014io.ByteSource
        public byte[] read() {
            return this.f53928a;
        }

        @Override // com.google.common.p014io.ByteSource.C8086b
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    /* renamed from: com.google.common.io.ByteSource$e */
    /* loaded from: classes4.dex */
    public final class C8089e extends ByteSource {

        /* renamed from: a */
        public final long f53933a;

        /* renamed from: b */
        public final long f53934b;

        public C8089e(long j, long j2) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "offset (%s) may not be negative", j);
            Preconditions.checkArgument(j2 >= 0, "length (%s) may not be negative", j2);
            this.f53933a = j;
            this.f53934b = j2;
        }

        /* renamed from: b */
        public final InputStream m40006b(InputStream inputStream) {
            long j = this.f53933a;
            if (j > 0) {
                try {
                    if (ByteStreams.m40002d(inputStream, j) < this.f53933a) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } finally {
                }
            }
            return ByteStreams.limit(inputStream, this.f53934b);
        }

        @Override // com.google.common.p014io.ByteSource
        public boolean isEmpty() {
            if (this.f53934b != 0 && !super.isEmpty()) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openBufferedStream() {
            return m40006b(ByteSource.this.openBufferedStream());
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openStream() {
            return m40006b(ByteSource.this.openStream());
        }

        @Override // com.google.common.p014io.ByteSource
        public Optional sizeIfKnown() {
            Optional<Long> sizeIfKnown = ByteSource.this.sizeIfKnown();
            if (sizeIfKnown.isPresent()) {
                long longValue = sizeIfKnown.get().longValue();
                return Optional.m41313of(Long.valueOf(Math.min(this.f53934b, longValue - Math.min(this.f53933a, longValue))));
            }
            return Optional.absent();
        }

        @Override // com.google.common.p014io.ByteSource
        public ByteSource slice(long j, long j2) {
            boolean z;
            boolean z2 = false;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "offset (%s) may not be negative", j);
            if (j2 >= 0) {
                z2 = true;
            }
            Preconditions.checkArgument(z2, "length (%s) may not be negative", j2);
            long j3 = this.f53934b - j;
            if (j3 <= 0) {
                return ByteSource.empty();
            }
            return ByteSource.this.slice(this.f53933a + j, Math.min(j2, j3));
        }

        public String toString() {
            return ByteSource.this.toString() + ".slice(" + this.f53933a + ", " + this.f53934b + ")";
        }
    }

    public static ByteSource concat(Iterable<? extends ByteSource> iterable) {
        return new C8087c(iterable);
    }

    public static ByteSource empty() {
        return C8088d.f53932d;
    }

    public static ByteSource wrap(byte[] bArr) {
        return new C8086b(bArr);
    }

    /* renamed from: a */
    public final long m40007a(InputStream inputStream) {
        long j = 0;
        while (true) {
            long m40002d = ByteStreams.m40002d(inputStream, 2147483647L);
            if (m40002d > 0) {
                j += m40002d;
            } else {
                return j;
            }
        }
    }

    public CharSource asCharSource(Charset charset) {
        return new C8085a(charset);
    }

    public boolean contentEquals(ByteSource byteSource) throws IOException {
        int read;
        Preconditions.checkNotNull(byteSource);
        byte[] m40004b = ByteStreams.m40004b();
        byte[] m40004b2 = ByteStreams.m40004b();
        Closer create = Closer.create();
        try {
            InputStream inputStream = (InputStream) create.register(openStream());
            InputStream inputStream2 = (InputStream) create.register(byteSource.openStream());
            do {
                read = ByteStreams.read(inputStream, m40004b, 0, m40004b.length);
                if (read == ByteStreams.read(inputStream2, m40004b2, 0, m40004b2.length) && Arrays.equals(m40004b, m40004b2)) {
                }
                return false;
            } while (read == m40004b.length);
            create.close();
            return true;
        } catch (Throwable th2) {
            try {
                throw create.rethrow(th2);
            } finally {
                create.close();
            }
        }
    }

    @CanIgnoreReturnValue
    public long copyTo(OutputStream outputStream) throws IOException {
        Preconditions.checkNotNull(outputStream);
        try {
            return ByteStreams.copy((InputStream) Closer.create().register(openStream()), outputStream);
        } finally {
        }
    }

    public HashCode hash(HashFunction hashFunction) throws IOException {
        Hasher newHasher = hashFunction.newHasher();
        copyTo(Funnels.asOutputStream(newHasher));
        return newHasher.hash();
    }

    public boolean isEmpty() throws IOException {
        Optional<Long> sizeIfKnown = sizeIfKnown();
        boolean z = false;
        if (sizeIfKnown.isPresent()) {
            if (sizeIfKnown.get().longValue() != 0) {
                return false;
            }
            return true;
        }
        Closer create = Closer.create();
        try {
            if (((InputStream) create.register(openStream())).read() == -1) {
                z = true;
            }
            return z;
        } catch (Throwable th2) {
            try {
                throw create.rethrow(th2);
            } finally {
                create.close();
            }
        }
    }

    public InputStream openBufferedStream() throws IOException {
        InputStream openStream = openStream();
        if (openStream instanceof BufferedInputStream) {
            return (BufferedInputStream) openStream;
        }
        return new BufferedInputStream(openStream);
    }

    public abstract InputStream openStream() throws IOException;

    public byte[] read() throws IOException {
        byte[] byteArray;
        Closer create = Closer.create();
        try {
            InputStream inputStream = (InputStream) create.register(openStream());
            Optional<Long> sizeIfKnown = sizeIfKnown();
            if (sizeIfKnown.isPresent()) {
                byteArray = ByteStreams.m40001e(inputStream, sizeIfKnown.get().longValue());
            } else {
                byteArray = ByteStreams.toByteArray(inputStream);
            }
            return byteArray;
        } catch (Throwable th2) {
            try {
                throw create.rethrow(th2);
            } finally {
                create.close();
            }
        }
    }

    public long size() throws IOException {
        Optional<Long> sizeIfKnown = sizeIfKnown();
        if (sizeIfKnown.isPresent()) {
            return sizeIfKnown.get().longValue();
        }
        Closer create = Closer.create();
        try {
            return m40007a((InputStream) create.register(openStream()));
        } catch (IOException unused) {
            create.close();
            try {
                return ByteStreams.exhaust((InputStream) Closer.create().register(openStream()));
            } finally {
            }
        } finally {
        }
    }

    public Optional<Long> sizeIfKnown() {
        return Optional.absent();
    }

    public ByteSource slice(long j, long j2) {
        return new C8089e(j, j2);
    }

    public static ByteSource concat(Iterator<? extends ByteSource> it) {
        return concat(ImmutableList.copyOf(it));
    }

    public static ByteSource concat(ByteSource... byteSourceArr) {
        return concat(ImmutableList.copyOf(byteSourceArr));
    }

    @CanIgnoreReturnValue
    public long copyTo(ByteSink byteSink) throws IOException {
        Preconditions.checkNotNull(byteSink);
        Closer create = Closer.create();
        try {
            return ByteStreams.copy((InputStream) create.register(openStream()), (OutputStream) create.register(byteSink.openStream()));
        } finally {
        }
    }

    @CanIgnoreReturnValue
    public <T> T read(ByteProcessor<T> byteProcessor) throws IOException {
        Preconditions.checkNotNull(byteProcessor);
        try {
            return (T) ByteStreams.readBytes((InputStream) Closer.create().register(openStream()), byteProcessor);
        } finally {
        }
    }
}
