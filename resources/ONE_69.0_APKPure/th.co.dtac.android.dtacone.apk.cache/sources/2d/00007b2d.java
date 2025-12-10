package p000;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;

/* renamed from: cj2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C19447cj2 implements ValueEncoderContext {

    /* renamed from: a */
    public boolean f40204a = false;

    /* renamed from: b */
    public boolean f40205b = false;

    /* renamed from: c */
    public FieldDescriptor f40206c;

    /* renamed from: d */
    public final C20655ji2 f40207d;

    public C19447cj2(C20655ji2 c20655ji2) {
        this.f40207d = c20655ji2;
    }

    /* renamed from: b */
    private final void m51302b() {
        if (!this.f40204a) {
            this.f40204a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* renamed from: a */
    public final void m51303a(FieldDescriptor fieldDescriptor, boolean z) {
        this.f40204a = false;
        this.f40206c = fieldDescriptor;
        this.f40205b = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(double d) {
        m51302b();
        this.f40207d.m29491a(this.f40206c, d, this.f40205b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(float f) {
        m51302b();
        this.f40207d.m29490b(this.f40206c, f, this.f40205b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(int i) {
        m51302b();
        this.f40207d.m29488d(this.f40206c, i, this.f40205b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(long j) {
        m51302b();
        this.f40207d.m29487e(this.f40206c, j, this.f40205b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String str) {
        m51302b();
        this.f40207d.m29489c(this.f40206c, str, this.f40205b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) {
        m51302b();
        this.f40207d.m29488d(this.f40206c, z ? 1 : 0, this.f40205b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(byte[] bArr) {
        m51302b();
        this.f40207d.m29489c(this.f40206c, bArr, this.f40205b);
        return this;
    }
}