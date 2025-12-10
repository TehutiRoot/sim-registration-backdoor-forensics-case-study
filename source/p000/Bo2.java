package p000;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;

/* renamed from: Bo2 */
/* loaded from: classes3.dex */
public final class Bo2 implements ValueEncoderContext {

    /* renamed from: a */
    public boolean f518a = false;

    /* renamed from: b */
    public boolean f519b = false;

    /* renamed from: c */
    public FieldDescriptor f520c;

    /* renamed from: d */
    public final C19585do2 f521d;

    public Bo2(C19585do2 c19585do2) {
        this.f521d = c19585do2;
    }

    /* renamed from: b */
    private final void m68876b() {
        if (!this.f518a) {
            this.f518a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* renamed from: a */
    public final void m68877a(FieldDescriptor fieldDescriptor, boolean z) {
        this.f518a = false;
        this.f520c = fieldDescriptor;
        this.f519b = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(double d) {
        m68876b();
        this.f521d.m31691a(this.f520c, d, this.f519b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(float f) {
        m68876b();
        this.f521d.m31690b(this.f520c, f, this.f519b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(int i) {
        m68876b();
        this.f521d.m31688d(this.f520c, i, this.f519b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(long j) {
        m68876b();
        this.f521d.m31687e(this.f520c, j, this.f519b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String str) {
        m68876b();
        this.f521d.m31689c(this.f520c, str, this.f519b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) {
        m68876b();
        this.f521d.m31688d(this.f520c, z ? 1 : 0, this.f519b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(byte[] bArr) {
        m68876b();
        this.f521d.m31689c(this.f520c, bArr, this.f519b);
        return this;
    }
}
