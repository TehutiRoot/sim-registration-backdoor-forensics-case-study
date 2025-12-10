package p000;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.proto.C8487a;

/* renamed from: Kp1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17978Kp1 implements ValueEncoderContext {

    /* renamed from: a */
    public boolean f3411a = false;

    /* renamed from: b */
    public boolean f3412b = false;

    /* renamed from: c */
    public FieldDescriptor f3413c;

    /* renamed from: d */
    public final C8487a f3414d;

    public C17978Kp1(C8487a c8487a) {
        this.f3414d = c8487a;
    }

    /* renamed from: a */
    public final void m67660a() {
        if (!this.f3411a) {
            this.f3411a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(String str) {
        m67660a();
        this.f3414d.m38737d(this.f3413c, str, this.f3412b);
        return this;
    }

    /* renamed from: b */
    public void m67659b(FieldDescriptor fieldDescriptor, boolean z) {
        this.f3411a = false;
        this.f3413c = fieldDescriptor;
        this.f3412b = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(float f) {
        m67660a();
        this.f3414d.m38738c(this.f3413c, f, this.f3412b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(double d) {
        m67660a();
        this.f3414d.m38739b(this.f3413c, d, this.f3412b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(int i) {
        m67660a();
        this.f3414d.m38735f(this.f3413c, i, this.f3412b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(long j) {
        m67660a();
        this.f3414d.m38733h(this.f3413c, j, this.f3412b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(boolean z) {
        m67660a();
        this.f3414d.m38731j(this.f3413c, z, this.f3412b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public ValueEncoderContext add(byte[] bArr) {
        m67660a();
        this.f3414d.m38737d(this.f3413c, bArr, this.f3412b);
        return this;
    }
}