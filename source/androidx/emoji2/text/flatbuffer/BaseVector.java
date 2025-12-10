package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class BaseVector {

    /* renamed from: a */
    public int f35213a;

    /* renamed from: b */
    public int f35214b;

    /* renamed from: bb */
    protected ByteBuffer f35215bb;

    /* renamed from: c */
    public int f35216c;

    public int __element(int i) {
        return this.f35213a + (i * this.f35216c);
    }

    public void __reset(int i, int i2, ByteBuffer byteBuffer) {
        this.f35215bb = byteBuffer;
        if (byteBuffer != null) {
            this.f35213a = i;
            this.f35214b = byteBuffer.getInt(i - 4);
            this.f35216c = i2;
            return;
        }
        this.f35213a = 0;
        this.f35214b = 0;
        this.f35216c = 0;
    }

    public int __vector() {
        return this.f35213a;
    }

    public int length() {
        return this.f35214b;
    }

    public void reset() {
        __reset(0, 0, null);
    }
}
