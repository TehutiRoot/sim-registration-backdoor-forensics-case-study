package p000;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;

/* renamed from: fi2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19911fi2 implements ValueEncoderContext {

    /* renamed from: a */
    public boolean f61896a = false;

    /* renamed from: b */
    public boolean f61897b = false;

    /* renamed from: c */
    public FieldDescriptor f61898c;

    /* renamed from: d */
    public final C21112mh2 f61899d;

    public C19911fi2(C21112mh2 c21112mh2) {
        this.f61899d = c21112mh2;
    }

    /* renamed from: b */
    private final void m31262b() {
        if (!this.f61896a) {
            this.f61896a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* renamed from: a */
    public final void m31263a(FieldDescriptor fieldDescriptor, boolean z) {
        this.f61896a = false;
        this.f61898c = fieldDescriptor;
        this.f61897b = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(double d) {
        m31262b();
        this.f61899d.m26224a(this.f61898c, d, this.f61897b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(float f) {
        m31262b();
        this.f61899d.m26223b(this.f61898c, f, this.f61897b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(int i) {
        m31262b();
        this.f61899d.m26221d(this.f61898c, i, this.f61897b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(long j) {
        m31262b();
        this.f61899d.m26220e(this.f61898c, j, this.f61897b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String str) {
        m31262b();
        this.f61899d.m26222c(this.f61898c, str, this.f61897b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) {
        m31262b();
        this.f61899d.m26221d(this.f61898c, z ? 1 : 0, this.f61897b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(byte[] bArr) {
        m31262b();
        this.f61899d.m26222c(this.f61898c, bArr, this.f61897b);
        return this;
    }
}
