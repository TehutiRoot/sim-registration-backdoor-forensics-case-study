package p000;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;

/* renamed from: gc2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C20065gc2 implements ValueEncoderContext {

    /* renamed from: a */
    public boolean f62207a = false;

    /* renamed from: b */
    public boolean f62208b = false;

    /* renamed from: c */
    public FieldDescriptor f62209c;

    /* renamed from: d */
    public final C18546Ub2 f62210d;

    public C20065gc2(C18546Ub2 c18546Ub2) {
        this.f62210d = c18546Ub2;
    }

    /* renamed from: b */
    private final void m31077b() {
        if (!this.f62207a) {
            this.f62207a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* renamed from: a */
    public final void m31078a(FieldDescriptor fieldDescriptor, boolean z) {
        this.f62207a = false;
        this.f62209c = fieldDescriptor;
        this.f62208b = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(double d) {
        m31077b();
        this.f62210d.m66016a(this.f62209c, d, this.f62208b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(float f) {
        m31077b();
        this.f62210d.m66015b(this.f62209c, f, this.f62208b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(int i) {
        m31077b();
        this.f62210d.m66013d(this.f62209c, i, this.f62208b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(long j) {
        m31077b();
        this.f62210d.m66012e(this.f62209c, j, this.f62208b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String str) {
        m31077b();
        this.f62210d.m66014c(this.f62209c, str, this.f62208b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) {
        m31077b();
        this.f62210d.m66013d(this.f62209c, z ? 1 : 0, this.f62208b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(byte[] bArr) {
        m31077b();
        this.f62210d.m66014c(this.f62209c, bArr, this.f62208b);
        return this;
    }
}
