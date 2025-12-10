package org.apache.commons.p028io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.p028io.ByteOrderMark;
import org.apache.commons.p028io.IOUtils;
import org.apache.commons.p028io.function.IOIntConsumer;
import org.apache.commons.p028io.input.BOMInputStream;
import org.apache.commons.p028io.input.ProxyInputStream;

/* renamed from: org.apache.commons.io.input.BOMInputStream */
/* loaded from: classes6.dex */
public class BOMInputStream extends ProxyInputStream {

    /* renamed from: l */
    public static final Comparator f73409l;

    /* renamed from: d */
    public final List f73410d;

    /* renamed from: e */
    public ByteOrderMark f73411e;

    /* renamed from: f */
    public int f73412f;

    /* renamed from: g */
    public int f73413g;

    /* renamed from: h */
    public int[] f73414h;

    /* renamed from: i */
    public final boolean f73415i;

    /* renamed from: j */
    public boolean f73416j;

    /* renamed from: k */
    public int f73417k;

    /* renamed from: org.apache.commons.io.input.BOMInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends ProxyInputStream.AbstractBuilder<BOMInputStream, Builder> {

        /* renamed from: n */
        public static final ByteOrderMark[] f73418n = {ByteOrderMark.UTF_8};

        /* renamed from: l */
        public ByteOrderMark[] f73419l = f73418n;

        /* renamed from: m */
        public boolean f73420m;

        @Override // org.apache.commons.p028io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ IOIntConsumer getAfterRead() {
            return super.getAfterRead();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.apache.commons.io.build.AbstractStreamBuilder, org.apache.commons.io.input.BOMInputStream$Builder] */
        @Override // org.apache.commons.p028io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ Builder setAfterRead(IOIntConsumer iOIntConsumer) {
            return super.setAfterRead(iOIntConsumer);
        }

        public Builder setByteOrderMarks(ByteOrderMark... byteOrderMarkArr) {
            ByteOrderMark[] byteOrderMarkArr2;
            if (byteOrderMarkArr != null) {
                byteOrderMarkArr2 = (ByteOrderMark[]) byteOrderMarkArr.clone();
            } else {
                byteOrderMarkArr2 = f73418n;
            }
            this.f73419l = byteOrderMarkArr2;
            return this;
        }

        public Builder setInclude(boolean z) {
            this.f73420m = z;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public BOMInputStream get() throws IOException {
            return new BOMInputStream(this);
        }
    }

    static {
        Comparator comparing;
        Comparator reversed;
        comparing = Comparator.comparing(new Function() { // from class: V9
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((ByteOrderMark) obj).length());
            }
        });
        reversed = comparing.reversed();
        f73409l = reversed;
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: d */
    public static /* synthetic */ boolean m25349d(BOMInputStream bOMInputStream, ByteOrderMark byteOrderMark) {
        return bOMInputStream.m25347i(byteOrderMark);
    }

    /* renamed from: g */
    public final ByteOrderMark m25348g() {
        Stream stream;
        Stream filter;
        Optional findFirst;
        Object orElse;
        stream = this.f73410d.stream();
        filter = stream.filter(new Predicate() { // from class: U9
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return BOMInputStream.m25349d(BOMInputStream.this, (ByteOrderMark) obj);
            }
        });
        findFirst = filter.findFirst();
        orElse = findFirst.orElse(null);
        return (ByteOrderMark) orElse;
    }

    public ByteOrderMark getBOM() throws IOException {
        if (this.f73414h == null) {
            this.f73413g = 0;
            this.f73414h = new int[((ByteOrderMark) this.f73410d.get(0)).length()];
            int i = 0;
            while (true) {
                int[] iArr = this.f73414h;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = ((FilterInputStream) this).in.read();
                afterRead(this.f73414h[i]);
                this.f73413g++;
                if (this.f73414h[i] < 0) {
                    break;
                }
                i++;
            }
            ByteOrderMark m25348g = m25348g();
            this.f73411e = m25348g;
            if (m25348g != null && !this.f73415i) {
                if (m25348g.length() < this.f73414h.length) {
                    this.f73412f = this.f73411e.length();
                } else {
                    this.f73413g = 0;
                }
            }
        }
        return this.f73411e;
    }

    public String getBOMCharsetName() throws IOException {
        getBOM();
        ByteOrderMark byteOrderMark = this.f73411e;
        if (byteOrderMark == null) {
            return null;
        }
        return byteOrderMark.getCharsetName();
    }

    public boolean hasBOM() throws IOException {
        return getBOM() != null;
    }

    /* renamed from: i */
    public final boolean m25347i(ByteOrderMark byteOrderMark) {
        for (int i = 0; i < byteOrderMark.length(); i++) {
            if (byteOrderMark.get(i) != this.f73414h[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final int m25346j() {
        getBOM();
        int i = this.f73412f;
        if (i < this.f73413g) {
            int[] iArr = this.f73414h;
            this.f73412f = i + 1;
            return iArr[i];
        }
        return -1;
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        boolean z;
        this.f73417k = this.f73412f;
        if (this.f73414h == null) {
            z = true;
        } else {
            z = false;
        }
        this.f73416j = z;
        ((FilterInputStream) this).in.mark(i);
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        m25282b();
        int m25346j = m25346j();
        return m25346j >= 0 ? m25346j : ((FilterInputStream) this).in.read();
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        try {
            this.f73412f = this.f73417k;
            if (this.f73416j) {
                this.f73414h = null;
            }
            ((FilterInputStream) this).in.reset();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long j2;
        int i = 0;
        while (true) {
            j2 = i;
            if (j <= j2 || m25346j() < 0) {
                break;
            }
            i++;
        }
        return ((FilterInputStream) this).in.skip(j - j2) + j2;
    }

    public BOMInputStream(Builder builder) {
        super(builder);
        if (IOUtils.length(builder.f73419l) != 0) {
            this.f73415i = builder.f73420m;
            List asList = Arrays.asList(builder.f73419l);
            asList.sort(f73409l);
            this.f73410d = asList;
            return;
        }
        throw new IllegalArgumentException("No BOMs specified");
    }

    public boolean hasBOM(ByteOrderMark byteOrderMark) throws IOException {
        if (this.f73410d.contains(byteOrderMark)) {
            return Objects.equals(getBOM(), byteOrderMark);
        }
        throw new IllegalArgumentException("Stream not configured to detect " + byteOrderMark);
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        int i4 = 0;
        while (i2 > 0 && i3 >= 0) {
            i3 = m25346j();
            if (i3 >= 0) {
                bArr[i] = (byte) (i3 & 255);
                i2--;
                i4++;
                i++;
            }
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        afterRead(read);
        if (read < 0) {
            if (i4 > 0) {
                return i4;
            }
            return -1;
        }
        return i4 + read;
    }

    @Deprecated
    public BOMInputStream(InputStream inputStream) {
        this(inputStream, false, Builder.f73418n);
    }

    @Deprecated
    public BOMInputStream(InputStream inputStream, boolean z) {
        this(inputStream, z, Builder.f73418n);
    }

    @Deprecated
    public BOMInputStream(InputStream inputStream, boolean z, ByteOrderMark... byteOrderMarkArr) {
        super(inputStream);
        if (IOUtils.length(byteOrderMarkArr) != 0) {
            this.f73415i = z;
            List asList = Arrays.asList(byteOrderMarkArr);
            asList.sort(f73409l);
            this.f73410d = asList;
            return;
        }
        throw new IllegalArgumentException("No BOMs specified");
    }

    @Deprecated
    public BOMInputStream(InputStream inputStream, ByteOrderMark... byteOrderMarkArr) {
        this(inputStream, false, byteOrderMarkArr);
    }
}