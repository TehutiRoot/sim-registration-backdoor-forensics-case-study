package p000;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.proto.C8498a;

/* renamed from: No1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C18134No1 implements ValueEncoderContext {

    /* renamed from: a */
    public boolean f4197a = false;

    /* renamed from: b */
    public boolean f4198b = false;

    /* renamed from: c */
    public FieldDescriptor f4199c;

    /* renamed from: d */
    public final C8498a f4200d;

    public C18134No1(C8498a c8498a) {
        this.f4200d = c8498a;
    }

    /* renamed from: a */
    public final void m67170a() {
        if (!this.f4197a) {
            this.f4197a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(String str) {
        m67170a();
        this.f4200d.m38745d(this.f4199c, str, this.f4198b);
        return this;
    }

    /* renamed from: b */
    public void m67169b(FieldDescriptor fieldDescriptor, boolean z) {
        this.f4197a = false;
        this.f4199c = fieldDescriptor;
        this.f4198b = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(float f) {
        m67170a();
        this.f4200d.m38746c(this.f4199c, f, this.f4198b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(double d) {
        m67170a();
        this.f4200d.m38747b(this.f4199c, d, this.f4198b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(int i) {
        m67170a();
        this.f4200d.m38743f(this.f4199c, i, this.f4198b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(long j) {
        m67170a();
        this.f4200d.m38741h(this.f4199c, j, this.f4198b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(boolean z) {
        m67170a();
        this.f4200d.m38739j(this.f4199c, z, this.f4198b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(byte[] bArr) {
        m67170a();
        this.f4200d.m38745d(this.f4199c, bArr, this.f4198b);
        return this;
    }
}
