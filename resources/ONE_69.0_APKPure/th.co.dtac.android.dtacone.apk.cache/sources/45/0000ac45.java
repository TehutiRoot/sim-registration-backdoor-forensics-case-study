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
    public class C8074a extends CharSource {

        /* renamed from: a */
        public final Charset f53938a;

        public C8074a(Charset charset) {
            this.f53938a = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.p014io.CharSource
        public ByteSource asByteSource(Charset charset) {
            if (charset.equals(this.f53938a)) {
                return ByteSource.this;
            }
            return super.asByteSource(charset);
        }

        @Override // com.google.common.p014io.CharSource
        public Reader openStream() {
            return new InputStreamReader(ByteSource.this.openStream(), this.f53938a);
        }

        @Override // com.google.common.p014io.CharSource
        public String read() {
            return new String(ByteSource.this.read(), this.f53938a);
        }

        public String toString() {
            return ByteSource.this.toString() + ".asCharSource(" + this.f53938a + ")";
        }
    }

    /* renamed from: com.google.common.io.ByteSource$b */
    /* loaded from: classes4.dex */
    public static class C8075b extends ByteSource {

        /* renamed from: a */
        public final byte[] f53940a;

        /* renamed from: b */
        public final int f53941b;

        /* renamed from: c */
        public final int f53942c;

        public C8075b(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // com.google.common.p014io.ByteSource
        public long copyTo(OutputStream outputStream) {
            outputStream.write(this.f53940a, this.f53941b, this.f53942c);
            return this.f53942c;
        }

        @Override // com.google.common.p014io.ByteSource
        public HashCode hash(HashFunction hashFunction) {
            return hashFunction.hashBytes(this.f53940a, this.f53941b, this.f53942c);
        }

        @Override // com.google.common.p014io.ByteSource
        public boolean isEmpty() {
            if (this.f53942c == 0) {
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
            return new ByteArrayInputStream(this.f53940a, this.f53941b, this.f53942c);
        }

        @Override // com.google.common.p014io.ByteSource
        public byte[] read() {
            byte[] bArr = this.f53940a;
            int i = this.f53941b;
            return Arrays.copyOfRange(bArr, i, this.f53942c + i);
        }

        @Override // com.google.common.p014io.ByteSource
        public long size() {
            return this.f53942c;
        }

        @Override // com.google.common.p014io.ByteSource
        public Optional sizeIfKnown() {
            return Optional.m41300of(Long.valueOf(this.f53942c));
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
            long min = Math.min(j, this.f53942c);
            long min2 = Math.min(j2, this.f53942c - min);
            return new C8075b(this.f53940a, this.f53941b + ((int) min), (int) min2);
        }

        public String toString() {
            return "ByteSource.wrap(" + Ascii.truncate(BaseEncoding.base16().encode(this.f53940a, this.f53941b, this.f53942c), 30, "...") + ")";
        }

        public C8075b(byte[] bArr, int i, int i2) {
            this.f53940a = bArr;
            this.f53941b = i;
            this.f53942c = i2;
        }

        @Override // com.google.common.p014io.ByteSource
        public Object read(ByteProcessor byteProcessor) {
            byteProcessor.processBytes(this.f53940a, this.f53941b, this.f53942c);
            return byteProcessor.getResult();
        }
    }

    /* renamed from: com.google.common.io.ByteSource$c */
    /* loaded from: classes4.dex */
    public static final class C8076c extends ByteSource {

        /* renamed from: a */
        public final Iterable f53943a;

        public C8076c(Iterable iterable) {
            this.f53943a = (Iterable) Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.p014io.ByteSource
        public boolean isEmpty() {
            for (ByteSource byteSource : this.f53943a) {
                if (!byteSource.isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openStream() {
            return new C21101mG0(this.f53943a.iterator());
        }

        @Override // com.google.common.p014io.ByteSource
        public long size() {
            long j = 0;
            for (ByteSource byteSource : this.f53943a) {
                j += byteSource.size();
                if (j < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return j;
        }

        @Override // com.google.common.p014io.ByteSource
        public Optional sizeIfKnown() {
            Iterable<ByteSource> iterable = this.f53943a;
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
                    return Optional.m41300of(Long.MAX_VALUE);
                }
            }
            return Optional.m41300of(Long.valueOf(j));
        }

        public String toString() {
            return "ByteSource.concat(" + this.f53943a + ")";
        }
    }

    /* renamed from: com.google.common.io.ByteSource$d */
    /* loaded from: classes4.dex */
    public static final class C8077d extends C8075b {

        /* renamed from: d */
        public static final C8077d f53944d = new C8077d();

        public C8077d() {
            super(new byte[0]);
        }

        @Override // com.google.common.p014io.ByteSource
        public CharSource asCharSource(Charset charset) {
            Preconditions.checkNotNull(charset);
            return CharSource.empty();
        }

        @Override // com.google.common.p014io.ByteSource.C8075b, com.google.common.p014io.ByteSource
        public byte[] read() {
            return this.f53940a;
        }

        @Override // com.google.common.p014io.ByteSource.C8075b
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    /* renamed from: com.google.common.io.ByteSource$e */
    /* loaded from: classes4.dex */
    public final class C8078e extends ByteSource {

        /* renamed from: a */
        public final long f53945a;

        /* renamed from: b */
        public final long f53946b;

        public C8078e(long j, long j2) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkArgument(z, "offset (%s) may not be negative", j);
            Preconditions.checkArgument(j2 >= 0, "length (%s) may not be negative", j2);
            this.f53945a = j;
            this.f53946b = j2;
        }

        /* renamed from: b */
        public final InputStream m39997b(InputStream inputStream) {
            long j = this.f53945a;
            if (j > 0) {
                try {
                    if (ByteStreams.m39993d(inputStream, j) < this.f53945a) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } finally {
                }
            }
            return ByteStreams.limit(inputStream, this.f53946b);
        }

        @Override // com.google.common.p014io.ByteSource
        public boolean isEmpty() {
            if (this.f53946b != 0 && !super.isEmpty()) {
                return false;
            }
            return true;
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openBufferedStream() {
            return m39997b(ByteSource.this.openBufferedStream());
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openStream() {
            return m39997b(ByteSource.this.openStream());
        }

        @Override // com.google.common.p014io.ByteSource
        public Optional sizeIfKnown() {
            Optional<Long> sizeIfKnown = ByteSource.this.sizeIfKnown();
            if (sizeIfKnown.isPresent()) {
                long longValue = sizeIfKnown.get().longValue();
                return Optional.m41300of(Long.valueOf(Math.min(this.f53946b, longValue - Math.min(this.f53945a, longValue))));
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
            long j3 = this.f53946b - j;
            if (j3 <= 0) {
                return ByteSource.empty();
            }
            return ByteSource.this.slice(this.f53945a + j, Math.min(j2, j3));
        }

        public String toString() {
            return ByteSource.this.toString() + ".slice(" + this.f53945a + ", " + this.f53946b + ")";
        }
    }

    public static ByteSource concat(Iterable<? extends ByteSource> iterable) {
        return new C8076c(iterable);
    }

    public static ByteSource empty() {
        return C8077d.f53944d;
    }

    public static ByteSource wrap(byte[] bArr) {
        return new C8075b(bArr);
    }

    /* renamed from: a */
    public final long m39998a(InputStream inputStream) {
        long j = 0;
        while (true) {
            long m39993d = ByteStreams.m39993d(inputStream, 2147483647L);
            if (m39993d > 0) {
                j += m39993d;
            } else {
                return j;
            }
        }
    }

    public CharSource asCharSource(Charset charset) {
        return new C8074a(charset);
    }

    public boolean contentEquals(ByteSource byteSource) throws IOException {
        int read;
        Preconditions.checkNotNull(byteSource);
        byte[] m39995b = ByteStreams.m39995b();
        byte[] m39995b2 = ByteStreams.m39995b();
        Closer create = Closer.create();
        try {
            InputStream inputStream = (InputStream) create.register(openStream());
            InputStream inputStream2 = (InputStream) create.register(byteSource.openStream());
            do {
                read = ByteStreams.read(inputStream, m39995b, 0, m39995b.length);
                if (read == ByteStreams.read(inputStream2, m39995b2, 0, m39995b2.length) && Arrays.equals(m39995b, m39995b2)) {
                }
                return false;
            } while (read == m39995b.length);
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
                byteArray = ByteStreams.m39992e(inputStream, sizeIfKnown.get().longValue());
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
            return m39998a((InputStream) create.register(openStream()));
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
        return new C8078e(j, j2);
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