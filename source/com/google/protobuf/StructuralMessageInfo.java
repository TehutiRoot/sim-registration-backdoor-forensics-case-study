package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class StructuralMessageInfo implements InterfaceC20799ks0 {

    /* renamed from: a */
    public final ProtoSyntax f57415a;

    /* renamed from: b */
    public final boolean f57416b;

    /* renamed from: c */
    public final int[] f57417c;

    /* renamed from: d */
    public final FieldInfo[] f57418d;

    /* renamed from: e */
    public final MessageLite f57419e;

    public StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
        this.f57415a = protoSyntax;
        this.f57416b = z;
        this.f57417c = iArr;
        this.f57418d = fieldInfoArr;
        this.f57419e = (MessageLite) Internal.m35785b(obj, "defaultInstance");
    }

    @Override // p000.InterfaceC20799ks0
    /* renamed from: a */
    public boolean mo26594a() {
        return this.f57416b;
    }

    @Override // p000.InterfaceC20799ks0
    /* renamed from: b */
    public MessageLite mo26593b() {
        return this.f57419e;
    }

    /* renamed from: c */
    public int[] m35627c() {
        return this.f57417c;
    }

    /* renamed from: d */
    public FieldInfo[] m35626d() {
        return this.f57418d;
    }

    @Override // p000.InterfaceC20799ks0
    public ProtoSyntax getSyntax() {
        return this.f57415a;
    }

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public final List f57420a;

        /* renamed from: b */
        public ProtoSyntax f57421b;

        /* renamed from: c */
        public boolean f57422c;

        /* renamed from: d */
        public boolean f57423d;

        /* renamed from: e */
        public int[] f57424e;

        /* renamed from: f */
        public Object f57425f;

        public Builder() {
            this.f57424e = null;
            this.f57420a = new ArrayList();
        }

        public StructuralMessageInfo build() {
            if (!this.f57422c) {
                if (this.f57421b != null) {
                    this.f57422c = true;
                    Collections.sort(this.f57420a);
                    return new StructuralMessageInfo(this.f57421b, this.f57423d, this.f57424e, (FieldInfo[]) this.f57420a.toArray(new FieldInfo[0]), this.f57425f);
                }
                throw new IllegalStateException("Must specify a proto syntax");
            }
            throw new IllegalStateException("Builder can only build once");
        }

        public void withCheckInitialized(int[] iArr) {
            this.f57424e = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.f57425f = obj;
        }

        public void withField(FieldInfo fieldInfo) {
            if (!this.f57422c) {
                this.f57420a.add(fieldInfo);
                return;
            }
            throw new IllegalStateException("Builder can only build once");
        }

        public void withMessageSetWireFormat(boolean z) {
            this.f57423d = z;
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
            this.f57421b = (ProtoSyntax) Internal.m35785b(protoSyntax, "syntax");
        }

        public Builder(int i) {
            this.f57424e = null;
            this.f57420a = new ArrayList(i);
        }
    }
}
