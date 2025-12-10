package p000;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;

/* renamed from: qe2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C21791qe2 implements ValueEncoderContext {

    /* renamed from: a */
    public boolean f77021a = false;

    /* renamed from: b */
    public boolean f77022b = false;

    /* renamed from: c */
    public FieldDescriptor f77023c;

    /* renamed from: d */
    public final C19555de2 f77024d;

    public C21791qe2(C19555de2 c19555de2) {
        this.f77024d = c19555de2;
    }

    /* renamed from: a */
    public final void m23463a(FieldDescriptor fieldDescriptor, boolean z) {
        this.f77021a = false;
        this.f77023c = fieldDescriptor;
        this.f77022b = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(double d) {
        m23462b();
        this.f77024d.m31825a(this.f77023c, d, this.f77022b);
        return this;
    }

    /* renamed from: b */
    public final void m23462b() {
        if (!this.f77021a) {
            this.f77021a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(float f) {
        m23462b();
        this.f77024d.m31824b(this.f77023c, f, this.f77022b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(int i) {
        m23462b();
        this.f77024d.m31822d(this.f77023c, i, this.f77022b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(long j) {
        m23462b();
        this.f77024d.m31821e(this.f77023c, j, this.f77022b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String str) {
        m23462b();
        this.f77024d.m31823c(this.f77023c, str, this.f77022b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) {
        m23462b();
        this.f77024d.m31822d(this.f77023c, z ? 1 : 0, this.f77022b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(byte[] bArr) {
        m23462b();
        this.f77024d.m31823c(this.f77023c, bArr, this.f77022b);
        return this;
    }
}
