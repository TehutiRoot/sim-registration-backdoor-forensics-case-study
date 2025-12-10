package p000;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: l70  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC20844l70 {

    /* renamed from: l70$a */
    /* loaded from: classes4.dex */
    public static final class C12198a extends FilterInputStream {

        /* renamed from: a */
        public int f71537a;

        public C12198a(InputStream inputStream) {
            super(inputStream);
            this.f71537a = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            if (this.f71537a > -1) {
                return Integer.MAX_VALUE;
            }
            return 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            this.f71537a = read;
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr) {
            int read = super.read(bArr);
            this.f71537a = read;
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            this.f71537a = read;
            return read;
        }
    }

    /* renamed from: a */
    public static GZIPInputStream m26558a(InputStream inputStream) {
        return new GZIPInputStream(new C12198a(inputStream));
    }
}
