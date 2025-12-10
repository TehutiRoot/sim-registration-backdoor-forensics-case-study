package p000;

import android.content.res.AssetManager;
import androidx.emoji2.text.flatbuffer.MetadataList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* renamed from: Bs0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC17398Bs0 {

    /* renamed from: Bs0$a */
    /* loaded from: classes2.dex */
    public static class C0137a implements InterfaceC0140d {

        /* renamed from: a */
        public final ByteBuffer f565a;

        public C0137a(ByteBuffer byteBuffer) {
            this.f565a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p000.AbstractC17398Bs0.InterfaceC0140d
        /* renamed from: a */
        public int mo69035a() {
            return this.f565a.getInt();
        }

        @Override // p000.AbstractC17398Bs0.InterfaceC0140d
        public long getPosition() {
            return this.f565a.position();
        }

        @Override // p000.AbstractC17398Bs0.InterfaceC0140d
        public long readUnsignedInt() {
            return AbstractC17398Bs0.m69040e(this.f565a.getInt());
        }

        @Override // p000.AbstractC17398Bs0.InterfaceC0140d
        public int readUnsignedShort() {
            return AbstractC17398Bs0.m69039f(this.f565a.getShort());
        }

        @Override // p000.AbstractC17398Bs0.InterfaceC0140d
        public void skip(int i) {
            ByteBuffer byteBuffer = this.f565a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* renamed from: Bs0$b */
    /* loaded from: classes2.dex */
    public static class C0138b implements InterfaceC0140d {

        /* renamed from: a */
        public final byte[] f566a;

        /* renamed from: b */
        public final ByteBuffer f567b;

        /* renamed from: c */
        public final InputStream f568c;

        /* renamed from: d */
        public long f569d = 0;

        public C0138b(InputStream inputStream) {
            this.f568c = inputStream;
            byte[] bArr = new byte[4];
            this.f566a = bArr;
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            this.f567b = wrap;
            wrap.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // p000.AbstractC17398Bs0.InterfaceC0140d
        /* renamed from: a */
        public int mo69035a() {
            this.f567b.position(0);
            m69038b(4);
            return this.f567b.getInt();
        }

        /* renamed from: b */
        public final void m69038b(int i) {
            if (this.f568c.read(this.f566a, 0, i) == i) {
                this.f569d += i;
                return;
            }
            throw new IOException("read failed");
        }

        @Override // p000.AbstractC17398Bs0.InterfaceC0140d
        public long getPosition() {
            return this.f569d;
        }

        @Override // p000.AbstractC17398Bs0.InterfaceC0140d
        public long readUnsignedInt() {
            this.f567b.position(0);
            m69038b(4);
            return AbstractC17398Bs0.m69040e(this.f567b.getInt());
        }

        @Override // p000.AbstractC17398Bs0.InterfaceC0140d
        public int readUnsignedShort() {
            this.f567b.position(0);
            m69038b(2);
            return AbstractC17398Bs0.m69039f(this.f567b.getShort());
        }

        @Override // p000.AbstractC17398Bs0.InterfaceC0140d
        public void skip(int i) {
            while (i > 0) {
                int skip = (int) this.f568c.skip(i);
                if (skip >= 1) {
                    i -= skip;
                    this.f569d += skip;
                } else {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
            }
        }
    }

    /* renamed from: Bs0$c */
    /* loaded from: classes2.dex */
    public static class C0139c {

        /* renamed from: a */
        public final long f570a;

        /* renamed from: b */
        public final long f571b;

        public C0139c(long j, long j2) {
            this.f570a = j;
            this.f571b = j2;
        }

        /* renamed from: a */
        public long m69037a() {
            return this.f571b;
        }

        /* renamed from: b */
        public long m69036b() {
            return this.f570a;
        }
    }

    /* renamed from: Bs0$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC0140d {
        /* renamed from: a */
        int mo69035a();

        long getPosition();

        long readUnsignedInt();

        int readUnsignedShort();

        void skip(int i);
    }

    /* renamed from: a */
    public static C0139c m69044a(InterfaceC0140d interfaceC0140d) {
        long j;
        interfaceC0140d.skip(4);
        int readUnsignedShort = interfaceC0140d.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            interfaceC0140d.skip(6);
            int i = 0;
            while (true) {
                if (i < readUnsignedShort) {
                    int mo69035a = interfaceC0140d.mo69035a();
                    interfaceC0140d.skip(4);
                    j = interfaceC0140d.readUnsignedInt();
                    interfaceC0140d.skip(4);
                    if (1835365473 == mo69035a) {
                        break;
                    }
                    i++;
                } else {
                    j = -1;
                    break;
                }
            }
            if (j != -1) {
                interfaceC0140d.skip((int) (j - interfaceC0140d.getPosition()));
                interfaceC0140d.skip(12);
                long readUnsignedInt = interfaceC0140d.readUnsignedInt();
                for (int i2 = 0; i2 < readUnsignedInt; i2++) {
                    int mo69035a2 = interfaceC0140d.mo69035a();
                    long readUnsignedInt2 = interfaceC0140d.readUnsignedInt();
                    long readUnsignedInt3 = interfaceC0140d.readUnsignedInt();
                    if (1164798569 == mo69035a2 || 1701669481 == mo69035a2) {
                        return new C0139c(readUnsignedInt2 + j, readUnsignedInt3);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: b */
    public static MetadataList m69043b(AssetManager assetManager, String str) {
        InputStream open = assetManager.open(str);
        try {
            MetadataList m69042c = m69042c(open);
            if (open != null) {
                open.close();
            }
            return m69042c;
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
    public static MetadataList m69042c(InputStream inputStream) {
        C0138b c0138b = new C0138b(inputStream);
        C0139c m69044a = m69044a(c0138b);
        c0138b.skip((int) (m69044a.m69036b() - c0138b.getPosition()));
        ByteBuffer allocate = ByteBuffer.allocate((int) m69044a.m69037a());
        int read = inputStream.read(allocate.array());
        if (read == m69044a.m69037a()) {
            return MetadataList.getRootAsMetadataList(allocate);
        }
        throw new IOException("Needed " + m69044a.m69037a() + " bytes, got " + read);
    }

    /* renamed from: d */
    public static MetadataList m69041d(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m69044a(new C0137a(duplicate)).m69036b());
        return MetadataList.getRootAsMetadataList(duplicate);
    }

    /* renamed from: e */
    public static long m69040e(int i) {
        return i & BodyPartID.bodyIdMax;
    }

    /* renamed from: f */
    public static int m69039f(short s) {
        return s & UShort.MAX_VALUE;
    }
}