package com.google.android.odml.image;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ByteBufferMlImageBuilder {

    /* renamed from: a */
    public final ByteBuffer f51594a;

    /* renamed from: b */
    public final int f51595b;

    /* renamed from: c */
    public final int f51596c;

    /* renamed from: d */
    public final int f51597d;

    /* renamed from: e */
    public int f51598e = 0;

    /* renamed from: f */
    public Rect f51599f;

    public ByteBufferMlImageBuilder(@NonNull ByteBuffer byteBuffer, int i, int i2, int i3) {
        this.f51594a = byteBuffer;
        this.f51595b = i;
        this.f51596c = i2;
        this.f51597d = i3;
        this.f51599f = new Rect(0, 0, i, i2);
    }

    @NonNull
    public MlImage build() {
        return new MlImage(new On2(this.f51594a, this.f51597d), this.f51598e, this.f51599f, 0L, this.f51595b, this.f51596c);
    }

    @NonNull
    public ByteBufferMlImageBuilder setRotation(int i) {
        MlImage.m43403g(i);
        this.f51598e = i;
        return this;
    }
}