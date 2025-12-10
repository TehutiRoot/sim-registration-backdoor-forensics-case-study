package p000;

import com.google.firebase.encoders.EncodingException;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ValueEncoderContext;

/* renamed from: Ki2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17960Ki2 implements ValueEncoderContext {

    /* renamed from: a */
    public boolean f3378a = false;

    /* renamed from: b */
    public boolean f3379b = false;

    /* renamed from: c */
    public FieldDescriptor f3380c;

    /* renamed from: d */
    public final C18867Yh2 f3381d;

    public C17960Ki2(C18867Yh2 c18867Yh2) {
        this.f3381d = c18867Yh2;
    }

    /* renamed from: b */
    private final void m67686b() {
        if (!this.f3378a) {
            this.f3378a = true;
            return;
        }
        throw new EncodingException("Cannot encode a second value in the ValueEncoderContext");
    }

    /* renamed from: a */
    public final void m67687a(FieldDescriptor fieldDescriptor, boolean z) {
        this.f3378a = false;
        this.f3380c = fieldDescriptor;
        this.f3379b = z;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(double d) {
        m67686b();
        this.f3381d.m65425a(this.f3380c, d, this.f3379b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(float f) {
        m67686b();
        this.f3381d.m65424b(this.f3380c, f, this.f3379b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(int i) {
        m67686b();
        this.f3381d.m65422d(this.f3380c, i, this.f3379b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(long j) {
        m67686b();
        this.f3381d.m65421e(this.f3380c, j, this.f3379b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(String str) {
        m67686b();
        this.f3381d.m65423c(this.f3380c, str, this.f3379b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(boolean z) {
        m67686b();
        this.f3381d.m65422d(this.f3380c, z ? 1 : 0, this.f3379b);
        return this;
    }

    @Override // com.google.firebase.encoders.ValueEncoderContext
    public final ValueEncoderContext add(byte[] bArr) {
        m67686b();
        this.f3381d.m65423c(this.f3380c, bArr, this.f3379b);
        return this;
    }
}