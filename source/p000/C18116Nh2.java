package p000;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;

/* renamed from: Nh2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18116Nh2 implements ValueEncoderContext {

    /* renamed from: a */
    public boolean f4162a = false;

    /* renamed from: b */
    public boolean f4163b = false;

    /* renamed from: c */
    public FieldDescriptor f4164c;

    /* renamed from: d */
    public final C19220bh2 f4165d;

    public C18116Nh2(C19220bh2 c19220bh2) {
        this.f4165d = c19220bh2;
    }

    /* renamed from: b */
    private final void m67200b() {
        if (!this.f4162a) {
            this.f4162a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* renamed from: a */
    public final void m67201a(FieldDescriptor fieldDescriptor, boolean z) {
        this.f4162a = false;
        this.f4164c = fieldDescriptor;
        this.f4163b = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(double d) {
        m67200b();
        this.f4165d.m51903a(this.f4164c, d, this.f4163b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(float f) {
        m67200b();
        this.f4165d.m51902b(this.f4164c, f, this.f4163b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(int i) {
        m67200b();
        this.f4165d.m51900d(this.f4164c, i, this.f4163b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(long j) {
        m67200b();
        this.f4165d.m51899e(this.f4164c, j, this.f4163b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String str) {
        m67200b();
        this.f4165d.m51901c(this.f4164c, str, this.f4163b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) {
        m67200b();
        this.f4165d.m51900d(this.f4164c, z ? 1 : 0, this.f4163b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(byte[] bArr) {
        m67200b();
        this.f4165d.m51901c(this.f4164c, bArr, this.f4163b);
        return this;
    }
}
