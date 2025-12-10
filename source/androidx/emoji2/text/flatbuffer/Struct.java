package androidx.emoji2.text.flatbuffer;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class Struct {

    /* renamed from: bb */
    protected ByteBuffer f35264bb;
    protected int bb_pos;

    public void __reset(int i, ByteBuffer byteBuffer) {
        this.f35264bb = byteBuffer;
        if (byteBuffer != null) {
            this.bb_pos = i;
        } else {
            this.bb_pos = 0;
        }
    }

    public void __reset() {
        __reset(0, null);
    }
}
