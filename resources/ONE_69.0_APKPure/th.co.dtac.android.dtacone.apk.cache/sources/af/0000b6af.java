package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class StructuralMessageInfo implements InterfaceC21894qs0 {

    /* renamed from: a */
    public final ProtoSyntax f57427a;

    /* renamed from: b */
    public final boolean f57428b;

    /* renamed from: c */
    public final int[] f57429c;

    /* renamed from: d */
    public final FieldInfo[] f57430d;

    /* renamed from: e */
    public final MessageLite f57431e;

    public StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
        this.f57427a = protoSyntax;
        this.f57428b = z;
        this.f57429c = iArr;
        this.f57430d = fieldInfoArr;
        this.f57431e = (MessageLite) Internal.m35777b(obj, "defaultInstance");
    }

    @Override // p000.InterfaceC21894qs0
    /* renamed from: a */
    public boolean mo23570a() {
        return this.f57428b;
    }

    @Override // p000.InterfaceC21894qs0
    /* renamed from: b */
    public MessageLite mo23569b() {
        return this.f57431e;
    }

    /* renamed from: c */
    public int[] m35619c() {
        return this.f57429c;
    }

    /* renamed from: d */
    public FieldInfo[] m35618d() {
        return this.f57430d;
    }

    @Override // p000.InterfaceC21894qs0
    public ProtoSyntax getSyntax() {
        return this.f57427a;
    }

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        public final List f57432a;

        /* renamed from: b */
        public ProtoSyntax f57433b;

        /* renamed from: c */
        public boolean f57434c;

        /* renamed from: d */
        public boolean f57435d;

        /* renamed from: e */
        public int[] f57436e;

        /* renamed from: f */
        public Object f57437f;

        public Builder() {
            this.f57436e = null;
            this.f57432a = new ArrayList();
        }

        public StructuralMessageInfo build() {
            if (!this.f57434c) {
                if (this.f57433b != null) {
                    this.f57434c = true;
                    Collections.sort(this.f57432a);
                    return new StructuralMessageInfo(this.f57433b, this.f57435d, this.f57436e, (FieldInfo[]) this.f57432a.toArray(new FieldInfo[0]), this.f57437f);
                }
                throw new IllegalStateException("Must specify a proto syntax");
            }
            throw new IllegalStateException("Builder can only build once");
        }

        public void withCheckInitialized(int[] iArr) {
            this.f57436e = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.f57437f = obj;
        }

        public void withField(FieldInfo fieldInfo) {
            if (!this.f57434c) {
                this.f57432a.add(fieldInfo);
                return;
            }
            throw new IllegalStateException("Builder can only build once");
        }

        public void withMessageSetWireFormat(boolean z) {
            this.f57435d = z;
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
            this.f57433b = (ProtoSyntax) Internal.m35777b(protoSyntax, "syntax");
        }

        public Builder(int i) {
            this.f57436e = null;
            this.f57432a = new ArrayList(i);
        }
    }
}