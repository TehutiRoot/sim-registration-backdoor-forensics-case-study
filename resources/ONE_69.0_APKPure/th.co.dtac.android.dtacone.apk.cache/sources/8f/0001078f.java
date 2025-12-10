package p000;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: r70  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC21939r70 {

    /* renamed from: r70$a */
    /* loaded from: classes4.dex */
    public static final class C13232a extends FilterInputStream {

        /* renamed from: a */
        public int f77403a;

        public C13232a(InputStream inputStream) {
            super(inputStream);
            this.f77403a = 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int available() {
            if (this.f77403a > -1) {
                return Integer.MAX_VALUE;
            }
            return 0;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            int read = super.read();
            this.f77403a = read;
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr) {
            int read = super.read(bArr);
            this.f77403a = read;
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read = super.read(bArr, i, i2);
            this.f77403a = read;
            return read;
        }
    }

    /* renamed from: a */
    public static GZIPInputStream m23541a(InputStream inputStream) {
        return new GZIPInputStream(new C13232a(inputStream));
    }
}