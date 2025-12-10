package io.grpc;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.common.base.Preconditions;
import com.google.common.p014io.BaseEncoding;
import com.google.common.p014io.ByteStreams;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;

@NotThreadSafe
/* loaded from: classes5.dex */
public final class Metadata {
    public static final String BINARY_HEADER_SUFFIX = "-bin";

    /* renamed from: a */
    public Object[] f63293a;

    /* renamed from: b */
    public int f63294b;

    /* renamed from: c */
    public static final Logger f63291c = Logger.getLogger(Metadata.class.getName());
    public static final BinaryMarshaller<byte[]> BINARY_BYTE_MARSHALLER = new C10532a();
    public static final AsciiMarshaller<String> ASCII_STRING_MARSHALLER = new C10533b();

    /* renamed from: d */
    public static final BaseEncoding f63292d = BaseEncoding.base64().omitPadding();

    /* loaded from: classes5.dex */
    public interface AsciiMarshaller<T> {
        T parseAsciiString(String str);

        String toAsciiString(T t);
    }

    /* loaded from: classes5.dex */
    public interface BinaryMarshaller<T> {
        T parseBytes(byte[] bArr);

        byte[] toBytes(T t);
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/6575")
    /* loaded from: classes5.dex */
    public interface BinaryStreamMarshaller<T> {
        T parseStream(InputStream inputStream);

        InputStream toStream(T t);
    }

    @Immutable
    /* loaded from: classes5.dex */
    public static abstract class Key<T> {

        /* renamed from: e */
        public static final BitSet f63295e = m30379b();

        /* renamed from: a */
        public final String f63296a;

        /* renamed from: b */
        public final String f63297b;

        /* renamed from: c */
        public final byte[] f63298c;

        /* renamed from: d */
        public final Object f63299d;

        public /* synthetic */ Key(String str, boolean z, Object obj, C10532a c10532a) {
            this(str, z, obj);
        }

        /* renamed from: b */
        public static BitSet m30379b() {
            BitSet bitSet = new BitSet(127);
            bitSet.set(45);
            bitSet.set(95);
            bitSet.set(46);
            for (char c = '0'; c <= '9'; c = (char) (c + 1)) {
                bitSet.set(c);
            }
            for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
                bitSet.set(c2);
            }
            return bitSet;
        }

        /* renamed from: d */
        public static Key m30377d(String str, boolean z, AsciiMarshaller asciiMarshaller) {
            return new C10534c(str, z, asciiMarshaller, null);
        }

        /* renamed from: e */
        public static Key m30376e(String str, boolean z, InterfaceC10541i interfaceC10541i) {
            return new C10540h(str, z, interfaceC10541i, null);
        }

        /* renamed from: i */
        public static String m30375i(String str, boolean z) {
            Preconditions.checkNotNull(str, "name");
            Preconditions.checkArgument(!str.isEmpty(), "token must have at least 1 tchar");
            if (str.equals("connection")) {
                Metadata.f63291c.log(Level.WARNING, "Metadata key is 'Connection', which should not be used. That is used by HTTP/1 for connection-specific headers which are not to be forwarded. There is probably an HTTP/1 conversion bug. Simply removing the Connection header is not enough; you should remove all headers it references as well. See RFC 7230 section 6.1", (Throwable) new RuntimeException("exception to show backtrace"));
            }
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!z || charAt != ':' || i != 0) {
                    Preconditions.checkArgument(f63295e.get(charAt), "Invalid character '%s' in key name '%s'", charAt, (Object) str);
                }
            }
            return str;
        }

        /* renamed from: of */
        public static <T> Key<T> m30373of(String str, BinaryMarshaller<T> binaryMarshaller) {
            return new C10535d(str, binaryMarshaller, null);
        }

        /* renamed from: a */
        public byte[] m30380a() {
            return this.f63298c;
        }

        /* renamed from: c */
        public final Object m30378c(Class cls) {
            if (cls.isInstance(this.f63299d)) {
                return cls.cast(this.f63299d);
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                return this.f63297b.equals(((Key) obj).f63297b);
            }
            return false;
        }

        /* renamed from: f */
        public abstract Object mo30359f(byte[] bArr);

        /* renamed from: g */
        public boolean mo30365g() {
            return false;
        }

        /* renamed from: h */
        public abstract byte[] mo30358h(Object obj);

        public final int hashCode() {
            return this.f63297b.hashCode();
        }

        public final String name() {
            return this.f63297b;
        }

        public final String originalName() {
            return this.f63296a;
        }

        public String toString() {
            return "Key{name='" + this.f63297b + "'}";
        }

        public Key(String str, boolean z, Object obj) {
            String str2 = (String) Preconditions.checkNotNull(str, "name");
            this.f63296a = str2;
            String m30375i = m30375i(str2.toLowerCase(Locale.ROOT), z);
            this.f63297b = m30375i;
            this.f63298c = m30375i.getBytes(StandardCharsets.US_ASCII);
            this.f63299d = obj;
        }

        @ExperimentalApi("https://github.com/grpc/grpc-java/issues/6575")
        /* renamed from: of */
        public static <T> Key<T> m30372of(String str, BinaryStreamMarshaller<T> binaryStreamMarshaller) {
            return new C10538f(str, binaryStreamMarshaller, null);
        }

        /* renamed from: of */
        public static <T> Key<T> m30374of(String str, AsciiMarshaller<T> asciiMarshaller) {
            return m30377d(str, false, asciiMarshaller);
        }
    }

    /* renamed from: io.grpc.Metadata$a */
    /* loaded from: classes5.dex */
    public class C10532a implements BinaryMarshaller {
        @Override // io.grpc.Metadata.BinaryMarshaller
        /* renamed from: a */
        public byte[] parseBytes(byte[] bArr) {
            return bArr;
        }

        @Override // io.grpc.Metadata.BinaryMarshaller
        /* renamed from: b */
        public byte[] toBytes(byte[] bArr) {
            return bArr;
        }
    }

    /* renamed from: io.grpc.Metadata$b */
    /* loaded from: classes5.dex */
    public class C10533b implements AsciiMarshaller {
        @Override // io.grpc.Metadata.AsciiMarshaller
        /* renamed from: a */
        public String parseAsciiString(String str) {
            return str;
        }

        @Override // io.grpc.Metadata.AsciiMarshaller
        /* renamed from: b */
        public String toAsciiString(String str) {
            return str;
        }
    }

    /* renamed from: io.grpc.Metadata$c */
    /* loaded from: classes5.dex */
    public static class C10534c extends Key {

        /* renamed from: f */
        public final AsciiMarshaller f63300f;

        public /* synthetic */ C10534c(String str, boolean z, AsciiMarshaller asciiMarshaller, C10532a c10532a) {
            this(str, z, asciiMarshaller);
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: f */
        public Object mo30359f(byte[] bArr) {
            return this.f63300f.parseAsciiString(new String(bArr, StandardCharsets.US_ASCII));
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: h */
        public byte[] mo30358h(Object obj) {
            return ((String) Preconditions.checkNotNull(this.f63300f.toAsciiString(obj), "null marshaller.toAsciiString()")).getBytes(StandardCharsets.US_ASCII);
        }

        public C10534c(String str, boolean z, AsciiMarshaller asciiMarshaller) {
            super(str, z, asciiMarshaller, null);
            Preconditions.checkArgument(!str.endsWith(Metadata.BINARY_HEADER_SUFFIX), "ASCII header is named %s.  Only binary headers may end with %s", str, Metadata.BINARY_HEADER_SUFFIX);
            this.f63300f = (AsciiMarshaller) Preconditions.checkNotNull(asciiMarshaller, "marshaller");
        }
    }

    /* renamed from: io.grpc.Metadata$d */
    /* loaded from: classes5.dex */
    public static class C10535d extends Key {

        /* renamed from: f */
        public final BinaryMarshaller f63301f;

        public /* synthetic */ C10535d(String str, BinaryMarshaller binaryMarshaller, C10532a c10532a) {
            this(str, binaryMarshaller);
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: f */
        public Object mo30359f(byte[] bArr) {
            return this.f63301f.parseBytes(bArr);
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: h */
        public byte[] mo30358h(Object obj) {
            return (byte[]) Preconditions.checkNotNull(this.f63301f.toBytes(obj), "null marshaller.toBytes()");
        }

        public C10535d(String str, BinaryMarshaller binaryMarshaller) {
            super(str, false, binaryMarshaller, null);
            Preconditions.checkArgument(str.endsWith(Metadata.BINARY_HEADER_SUFFIX), "Binary header is named %s. It must end with %s", str, Metadata.BINARY_HEADER_SUFFIX);
            Preconditions.checkArgument(str.length() > 4, "empty key name");
            this.f63301f = (BinaryMarshaller) Preconditions.checkNotNull(binaryMarshaller, "marshaller is null");
        }
    }

    /* renamed from: io.grpc.Metadata$e */
    /* loaded from: classes5.dex */
    public final class C10536e implements Iterable {

        /* renamed from: a */
        public final Key f63302a;

        /* renamed from: b */
        public int f63303b;

        /* renamed from: io.grpc.Metadata$e$a */
        /* loaded from: classes5.dex */
        public class C10537a implements Iterator {

            /* renamed from: a */
            public boolean f63305a = true;

            /* renamed from: b */
            public int f63306b;

            public C10537a() {
                C10536e.this = r2;
                this.f63306b = r2.f63303b;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                if (this.f63305a) {
                    return true;
                }
                while (this.f63306b < Metadata.this.f63294b) {
                    C10536e c10536e = C10536e.this;
                    if (Metadata.this.m30398g(c10536e.f63302a.m30380a(), Metadata.this.m30390o(this.f63306b))) {
                        this.f63305a = true;
                        return true;
                    }
                    this.f63306b++;
                }
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                if (hasNext()) {
                    this.f63305a = false;
                    C10536e c10536e = C10536e.this;
                    Metadata metadata = Metadata.this;
                    int i = this.f63306b;
                    this.f63306b = i + 1;
                    return metadata.m30381x(i, c10536e.f63302a);
                }
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        public /* synthetic */ C10536e(Metadata metadata, Key key, int i, C10532a c10532a) {
            this(key, i);
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new C10537a();
        }

        public C10536e(Key key, int i) {
            Metadata.this = r1;
            this.f63302a = key;
            this.f63303b = i;
        }
    }

    /* renamed from: io.grpc.Metadata$f */
    /* loaded from: classes5.dex */
    public static class C10538f extends Key {

        /* renamed from: f */
        public final BinaryStreamMarshaller f63308f;

        public /* synthetic */ C10538f(String str, BinaryStreamMarshaller binaryStreamMarshaller, C10532a c10532a) {
            this(str, binaryStreamMarshaller);
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: f */
        public Object mo30359f(byte[] bArr) {
            return this.f63308f.parseStream(new ByteArrayInputStream(bArr));
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: g */
        public boolean mo30365g() {
            return true;
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: h */
        public byte[] mo30358h(Object obj) {
            return Metadata.m30387r((InputStream) Preconditions.checkNotNull(this.f63308f.toStream(obj), "null marshaller.toStream()"));
        }

        public C10538f(String str, BinaryStreamMarshaller binaryStreamMarshaller) {
            super(str, false, binaryStreamMarshaller, null);
            Preconditions.checkArgument(str.endsWith(Metadata.BINARY_HEADER_SUFFIX), "Binary header is named %s. It must end with %s", str, Metadata.BINARY_HEADER_SUFFIX);
            Preconditions.checkArgument(str.length() > 4, "empty key name");
            this.f63308f = (BinaryStreamMarshaller) Preconditions.checkNotNull(binaryStreamMarshaller, "marshaller is null");
        }
    }

    /* renamed from: io.grpc.Metadata$g */
    /* loaded from: classes5.dex */
    public static final class C10539g {

        /* renamed from: a */
        public final BinaryStreamMarshaller f63309a;

        /* renamed from: b */
        public final Object f63310b;

        /* renamed from: c */
        public volatile byte[] f63311c;

        public C10539g(BinaryStreamMarshaller binaryStreamMarshaller, Object obj) {
            this.f63309a = binaryStreamMarshaller;
            this.f63310b = obj;
        }

        /* renamed from: a */
        public static C10539g m30364a(Key key, Object obj) {
            return new C10539g((BinaryStreamMarshaller) Preconditions.checkNotNull(m30363b(key)), obj);
        }

        /* renamed from: b */
        public static BinaryStreamMarshaller m30363b(Key key) {
            return (BinaryStreamMarshaller) key.m30378c(BinaryStreamMarshaller.class);
        }

        /* renamed from: c */
        public byte[] m30362c() {
            if (this.f63311c == null) {
                synchronized (this) {
                    try {
                        if (this.f63311c == null) {
                            this.f63311c = Metadata.m30387r(m30360e());
                        }
                    } finally {
                    }
                }
            }
            return this.f63311c;
        }

        /* renamed from: d */
        public Object m30361d(Key key) {
            BinaryStreamMarshaller m30363b;
            if (key.mo30365g() && (m30363b = m30363b(key)) != null) {
                return m30363b.parseStream(m30360e());
            }
            return key.mo30359f(m30362c());
        }

        /* renamed from: e */
        public InputStream m30360e() {
            return (InputStream) Preconditions.checkNotNull(this.f63309a.toStream(this.f63310b), "null marshaller.toStream()");
        }
    }

    /* renamed from: io.grpc.Metadata$h */
    /* loaded from: classes5.dex */
    public static final class C10540h extends Key {

        /* renamed from: f */
        public final InterfaceC10541i f63312f;

        public /* synthetic */ C10540h(String str, boolean z, InterfaceC10541i interfaceC10541i, C10532a c10532a) {
            this(str, z, interfaceC10541i);
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: f */
        public Object mo30359f(byte[] bArr) {
            return this.f63312f.parseAsciiString(bArr);
        }

        @Override // io.grpc.Metadata.Key
        /* renamed from: h */
        public byte[] mo30358h(Object obj) {
            return (byte[]) Preconditions.checkNotNull(this.f63312f.toAsciiString(obj), "null marshaller.toAsciiString()");
        }

        public C10540h(String str, boolean z, InterfaceC10541i interfaceC10541i) {
            super(str, z, interfaceC10541i, null);
            Preconditions.checkArgument(!str.endsWith(Metadata.BINARY_HEADER_SUFFIX), "ASCII header is named %s.  Only binary headers may end with %s", str, Metadata.BINARY_HEADER_SUFFIX);
            this.f63312f = (InterfaceC10541i) Preconditions.checkNotNull(interfaceC10541i, "marshaller");
        }
    }

    /* renamed from: io.grpc.Metadata$i */
    /* loaded from: classes5.dex */
    public interface InterfaceC10541i {
        Object parseAsciiString(byte[] bArr);

        byte[] toAsciiString(Object obj);
    }

    public Metadata(byte[]... bArr) {
        this(bArr.length / 2, bArr);
    }

    /* renamed from: r */
    public static byte[] m30387r(InputStream inputStream) {
        try {
            return ByteStreams.toByteArray(inputStream);
        } catch (IOException e) {
            throw new RuntimeException("failure reading serialized stream", e);
        }
    }

    public boolean containsKey(Key<?> key) {
        for (int i = 0; i < this.f63294b; i++) {
            if (m30398g(key.m30380a(), m30390o(i))) {
                return true;
            }
        }
        return false;
    }

    @ExperimentalApi("https://github.com/grpc/grpc-java/issues/4691")
    public <T> void discardAll(Key<T> key) {
        if (m30394k()) {
            return;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f63294b; i2++) {
            if (!m30398g(key.m30380a(), m30390o(i2))) {
                m30391n(i, m30390o(i2));
                m30385t(i, m30386s(i2));
                i++;
            }
        }
        Arrays.fill(this.f63293a, i * 2, m30393l(), (Object) null);
        this.f63294b = i;
    }

    /* renamed from: g */
    public final boolean m30398g(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    @Nullable
    public <T> T get(Key<T> key) {
        for (int i = this.f63294b - 1; i >= 0; i--) {
            if (m30398g(key.m30380a(), m30390o(i))) {
                return (T) m30381x(i, key);
            }
        }
        return null;
    }

    @Nullable
    public <T> Iterable<T> getAll(Key<T> key) {
        for (int i = 0; i < this.f63294b; i++) {
            if (m30398g(key.m30380a(), m30390o(i))) {
                return new C10536e(this, key, i, null);
            }
        }
        return null;
    }

    /* renamed from: h */
    public final int m30397h() {
        Object[] objArr = this.f63293a;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    /* renamed from: i */
    public final void m30396i(int i) {
        Object[] objArr = new Object[i];
        if (!m30394k()) {
            System.arraycopy(this.f63293a, 0, objArr, 0, m30393l());
        }
        this.f63293a = objArr;
    }

    /* renamed from: j */
    public int m30395j() {
        return this.f63294b;
    }

    /* renamed from: k */
    public final boolean m30394k() {
        if (this.f63294b == 0) {
            return true;
        }
        return false;
    }

    public Set<String> keys() {
        if (m30394k()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(this.f63294b);
        for (int i = 0; i < this.f63294b; i++) {
            hashSet.add(new String(m30390o(i), 0));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: l */
    public final int m30393l() {
        return this.f63294b * 2;
    }

    /* renamed from: m */
    public final void m30392m() {
        if (m30393l() == 0 || m30393l() == m30397h()) {
            m30396i(Math.max(m30393l() * 2, 8));
        }
    }

    public void merge(Metadata metadata) {
        if (metadata.m30394k()) {
            return;
        }
        int m30397h = m30397h() - m30393l();
        if (m30394k() || m30397h < metadata.m30393l()) {
            m30396i(m30393l() + metadata.m30393l());
        }
        System.arraycopy(metadata.f63293a, 0, this.f63293a, m30393l(), metadata.m30393l());
        this.f63294b += metadata.f63294b;
    }

    /* renamed from: n */
    public final void m30391n(int i, byte[] bArr) {
        this.f63293a[i * 2] = bArr;
    }

    /* renamed from: o */
    public final byte[] m30390o(int i) {
        return (byte[]) this.f63293a[i * 2];
    }

    /* renamed from: p */
    public byte[][] m30389p() {
        byte[][] bArr = new byte[m30393l()];
        Object[] objArr = this.f63293a;
        if (objArr instanceof byte[][]) {
            System.arraycopy(objArr, 0, bArr, 0, m30393l());
        } else {
            for (int i = 0; i < this.f63294b; i++) {
                int i2 = i * 2;
                bArr[i2] = m30390o(i);
                bArr[i2 + 1] = m30383v(i);
            }
        }
        return bArr;
    }

    public <T> void put(Key<T> key, T t) {
        Preconditions.checkNotNull(key, Action.KEY_ATTRIBUTE);
        Preconditions.checkNotNull(t, "value");
        m30392m();
        m30391n(this.f63294b, key.m30380a());
        if (key.mo30365g()) {
            m30385t(this.f63294b, C10539g.m30364a(key, t));
        } else {
            m30384u(this.f63294b, key.mo30358h(t));
        }
        this.f63294b++;
    }

    /* renamed from: q */
    public Object[] m30388q() {
        Object[] objArr = new Object[m30393l()];
        for (int i = 0; i < this.f63294b; i++) {
            int i2 = i * 2;
            objArr[i2] = m30390o(i);
            objArr[i2 + 1] = m30382w(i);
        }
        return objArr;
    }

    public <T> boolean remove(Key<T> key, T t) {
        Preconditions.checkNotNull(key, Action.KEY_ATTRIBUTE);
        Preconditions.checkNotNull(t, "value");
        for (int i = 0; i < this.f63294b; i++) {
            if (m30398g(key.m30380a(), m30390o(i)) && t.equals(m30381x(i, key))) {
                int i2 = i * 2;
                int i3 = (i + 1) * 2;
                Object[] objArr = this.f63293a;
                System.arraycopy(objArr, i3, objArr, i2, m30393l() - i3);
                int i4 = this.f63294b - 1;
                this.f63294b = i4;
                m30391n(i4, null);
                m30384u(this.f63294b, null);
                return true;
            }
        }
        return false;
    }

    public <T> Iterable<T> removeAll(Key<T> key) {
        if (m30394k()) {
            return null;
        }
        ArrayList arrayList = null;
        int i = 0;
        for (int i2 = 0; i2 < this.f63294b; i2++) {
            if (m30398g(key.m30380a(), m30390o(i2))) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(m30381x(i2, key));
            } else {
                m30391n(i, m30390o(i2));
                m30385t(i, m30386s(i2));
                i++;
            }
        }
        Arrays.fill(this.f63293a, i * 2, m30393l(), (Object) null);
        this.f63294b = i;
        return arrayList;
    }

    /* renamed from: s */
    public final Object m30386s(int i) {
        return this.f63293a[(i * 2) + 1];
    }

    /* renamed from: t */
    public final void m30385t(int i, Object obj) {
        if (this.f63293a instanceof byte[][]) {
            m30396i(m30397h());
        }
        this.f63293a[(i * 2) + 1] = obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Metadata(");
        for (int i = 0; i < this.f63294b; i++) {
            if (i != 0) {
                sb.append(',');
            }
            byte[] m30390o = m30390o(i);
            Charset charset = StandardCharsets.US_ASCII;
            String str = new String(m30390o, charset);
            sb.append(str);
            sb.append('=');
            if (str.endsWith(BINARY_HEADER_SUFFIX)) {
                sb.append(f63292d.encode(m30383v(i)));
            } else {
                sb.append(new String(m30383v(i), charset));
            }
        }
        sb.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        return sb.toString();
    }

    /* renamed from: u */
    public final void m30384u(int i, byte[] bArr) {
        this.f63293a[(i * 2) + 1] = bArr;
    }

    /* renamed from: v */
    public final byte[] m30383v(int i) {
        Object m30386s = m30386s(i);
        if (m30386s instanceof byte[]) {
            return (byte[]) m30386s;
        }
        return ((C10539g) m30386s).m30362c();
    }

    /* renamed from: w */
    public final Object m30382w(int i) {
        Object m30386s = m30386s(i);
        if (m30386s instanceof byte[]) {
            return m30386s;
        }
        return ((C10539g) m30386s).m30360e();
    }

    /* renamed from: x */
    public final Object m30381x(int i, Key key) {
        Object m30386s = m30386s(i);
        if (m30386s instanceof byte[]) {
            return key.mo30359f((byte[]) m30386s);
        }
        return ((C10539g) m30386s).m30361d(key);
    }

    public Metadata(int i, byte[]... bArr) {
        this(i, (Object[]) bArr);
    }

    public Metadata(int i, Object[] objArr) {
        this.f63294b = i;
        this.f63293a = objArr;
    }

    public Metadata() {
    }

    public void merge(Metadata metadata, Set<Key<?>> set) {
        Preconditions.checkNotNull(metadata, "other");
        HashMap hashMap = new HashMap(set.size());
        for (Key<?> key : set) {
            hashMap.put(ByteBuffer.wrap(key.m30380a()), key);
        }
        for (int i = 0; i < metadata.f63294b; i++) {
            if (hashMap.containsKey(ByteBuffer.wrap(metadata.m30390o(i)))) {
                m30392m();
                m30391n(this.f63294b, metadata.m30390o(i));
                m30385t(this.f63294b, metadata.m30386s(i));
                this.f63294b++;
            }
        }
    }
}
