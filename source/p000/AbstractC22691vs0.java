package p000;

import android.content.res.AssetManager;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: vs0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC22691vs0 {

    /* renamed from: vs0$a */
    /* loaded from: classes2.dex */
    public static class C16926a implements InterfaceC16929d {

        /* renamed from: a */
        public final ByteBuffer f107818a;

        public C16926a(ByteBuffer byteBuffer) {
            this.f107818a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p000.AbstractC22691vs0.InterfaceC16929d
        /* renamed from: a */
        public int mo972a() {
            return this.f107818a.getInt();
        }

        @Override // p000.AbstractC22691vs0.InterfaceC16929d
        public long getPosition() {
            return this.f107818a.position();
        }

        @Override // p000.AbstractC22691vs0.InterfaceC16929d
        public long readUnsignedInt() {
            return AbstractC22691vs0.m977e(this.f107818a.getInt());
        }

        @Override // p000.AbstractC22691vs0.InterfaceC16929d
        public int readUnsignedShort() {
            return AbstractC22691vs0.m976f(this.f107818a.getShort());
        }

        @Override // p000.AbstractC22691vs0.InterfaceC16929d
        public void skip(int i) {
            ByteBuffer byteBuffer = this.f107818a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* renamed from: vs0$b */
    /* loaded from: classes2.dex */
    public static class C16927b implements InterfaceC16929d {

        /* renamed from: a */
        public final byte[] f107819a;

        /* renamed from: b */
        public final ByteBuffer f107820b;

        /* renamed from: c */
        public final InputStream f107821c;

        /* renamed from: d */
        public long f107822d = 0;

        public C16927b(InputStream inputStream) {
            this.f107821c = inputStream;
            byte[] bArr = new byte[4];
            this.f107819a = bArr;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f107820b = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p000.AbstractC22691vs0.InterfaceC16929d
        /* renamed from: a */
        public int mo972a() {
            this.f107820b.position(0);
            m975b(4);
            return this.f107820b.getInt();
        }

        /* renamed from: b */
        public final void m975b(int i) {
            if (this.f107821c.read(this.f107819a, 0, i) == i) {
                this.f107822d += i;
                return;
            }
            throw new IOException("read failed");
        }

        @Override // p000.AbstractC22691vs0.InterfaceC16929d
        public long getPosition() {
            return this.f107822d;
        }

        @Override // p000.AbstractC22691vs0.InterfaceC16929d
        public long readUnsignedInt() {
            this.f107820b.position(0);
            m975b(4);
            return AbstractC22691vs0.m977e(this.f107820b.getInt());
        }

        @Override // p000.AbstractC22691vs0.InterfaceC16929d
        public int readUnsignedShort() {
            this.f107820b.position(0);
            m975b(2);
            return AbstractC22691vs0.m976f(this.f107820b.getShort());
        }

        @Override // p000.AbstractC22691vs0.InterfaceC16929d
        public void skip(int i) {
            while (i > 0) {
                int skip = (int) this.f107821c.skip(i);
                if (skip >= 1) {
                    i -= skip;
                    this.f107822d += skip;
                } else {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
            }
        }
    }

    /* renamed from: vs0$c */
    /* loaded from: classes2.dex */
    public static class C16928c {

        /* renamed from: a */
        public final long f107823a;

        /* renamed from: b */
        public final long f107824b;

        public C16928c(long j, long j2) {
            this.f107823a = j;
            this.f107824b = j2;
        }

        /* renamed from: a */
        public long m974a() {
            return this.f107824b;
        }

        /* renamed from: b */
        public long m973b() {
            return this.f107823a;
        }
    }

    /* renamed from: vs0$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC16929d {
        /* renamed from: a */
        int mo972a();

        long getPosition();

        long readUnsignedInt();

        int readUnsignedShort();

        void skip(int i);
    }

    /* renamed from: a */
    public static C16928c m981a(InterfaceC16929d interfaceC16929d) {
        long j;
        interfaceC16929d.skip(4);
        int readUnsignedShort = interfaceC16929d.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            interfaceC16929d.skip(6);
            int i = 0;
            while (true) {
                if (i < readUnsignedShort) {
                    int mo972a = interfaceC16929d.mo972a();
                    interfaceC16929d.skip(4);
                    j = interfaceC16929d.readUnsignedInt();
                    interfaceC16929d.skip(4);
                    if (1835365473 == mo972a) {
                        break;
                    }
                    i++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                interfaceC16929d.skip((int) (j - interfaceC16929d.getPosition()));
                interfaceC16929d.skip(12);
                long readUnsignedInt = interfaceC16929d.readUnsignedInt();
                for (int i2 = 0; i2 < readUnsignedInt; i2++) {
                    int mo972a2 = interfaceC16929d.mo972a();
                    long readUnsignedInt2 = interfaceC16929d.readUnsignedInt();
                    long readUnsignedInt3 = interfaceC16929d.readUnsignedInt();
                    if (1164798569 == mo972a2 || 1701669481 == mo972a2) {
                        return new C16928c(readUnsignedInt2 + j, readUnsignedInt3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    public static MetadataList m980b(AssetManager assetManager, String str) {
        InputStream open = assetManager.open(str);
        try {
            MetadataList m979c = m979c(open);
            if (open != null) {
                open.close();
            }
            return m979c;
        } catch (Throwable th2) {
            if (open != null) {
                try {
                    open.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    /* renamed from: c */
    public static MetadataList m979c(InputStream inputStream) {
        C16927b c16927b = new C16927b(inputStream);
        C16928c m981a = m981a(c16927b);
        c16927b.skip((int) (m981a.m973b() - c16927b.getPosition()));
        ByteBuffer allocate = ByteBuffer.allocate((int) m981a.m974a());
        int read = inputStream.read(allocate.array());
        if (read == m981a.m974a()) {
            return MetadataList.getRootAsMetadataList(allocate);
        }
        throw new IOException("Needed " + m981a.m974a() + " bytes, got " + read);
    }

    /* renamed from: d */
    public static MetadataList m978d(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m981a(new C16926a(duplicate)).m973b());
        return MetadataList.getRootAsMetadataList(duplicate);
    }

    /* renamed from: e */
    public static long m977e(int i) {
        return i & BodyPartID.bodyIdMax;
    }

    /* renamed from: f */
    public static int m976f(short s) {
        return s & UShort.MAX_VALUE;
    }
}
