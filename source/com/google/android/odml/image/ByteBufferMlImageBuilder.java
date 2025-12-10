package com.google.android.odml.image;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ByteBufferMlImageBuilder {

    /* renamed from: a */
    public final ByteBuffer f51582a;

    /* renamed from: b */
    public final int f51583b;

    /* renamed from: c */
    public final int f51584c;

    /* renamed from: d */
    public final int f51585d;

    /* renamed from: e */
    public int f51586e = 0;

    /* renamed from: f */
    public Rect f51587f;

    public ByteBufferMlImageBuilder(@NonNull ByteBuffer byteBuffer, int i, int i2, int i3) {
        this.f51582a = byteBuffer;
        this.f51583b = i;
        this.f51584c = i2;
        this.f51585d = i3;
        this.f51587f = new Rect(0, 0, i, i2);
    }

    @NonNull
    public MlImage build() {
        return new MlImage(new Rm2(this.f51582a, this.f51585d), this.f51586e, this.f51587f, 0L, this.f51583b, this.f51584c);
    }

    @NonNull
    public ByteBufferMlImageBuilder setRotation(int i) {
        MlImage.m43416g(i);
        this.f51586e = i;
        return this;
    }
}
