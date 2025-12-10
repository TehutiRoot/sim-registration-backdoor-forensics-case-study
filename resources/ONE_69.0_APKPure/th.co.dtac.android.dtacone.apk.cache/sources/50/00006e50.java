package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class StructuralMessageInfo implements InterfaceC22067rs0 {

    /* renamed from: a */
    public final ProtoSyntax f34962a;

    /* renamed from: b */
    public final boolean f34963b;

    /* renamed from: c */
    public final int[] f34964c;

    /* renamed from: d */
    public final FieldInfo[] f34965d;

    /* renamed from: e */
    public final MessageLite f34966e;

    public StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
        this.f34962a = protoSyntax;
        this.f34963b = z;
        this.f34964c = iArr;
        this.f34965d = fieldInfoArr;
        this.f34966e = (MessageLite) Internal.m55679b(obj, "defaultInstance");
    }

    @Override // p000.InterfaceC22067rs0
    /* renamed from: a */
    public boolean mo23435a() {
        return this.f34963b;
    }

    @Override // p000.InterfaceC22067rs0
    /* renamed from: b */
    public MessageLite mo23434b() {
        return this.f34966e;
    }

    /* renamed from: c */
    public int[] m55508c() {
        return this.f34964c;
    }

    /* renamed from: d */
    public FieldInfo[] m55507d() {
        return this.f34965d;
    }

    @Override // p000.InterfaceC22067rs0
    public ProtoSyntax getSyntax() {
        return this.f34962a;
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public final List f34967a;

        /* renamed from: b */
        public ProtoSyntax f34968b;

        /* renamed from: c */
        public boolean f34969c;

        /* renamed from: d */
        public boolean f34970d;

        /* renamed from: e */
        public int[] f34971e;

        /* renamed from: f */
        public Object f34972f;

        public Builder() {
            this.f34971e = null;
            this.f34967a = new ArrayList();
        }

        public StructuralMessageInfo build() {
            if (!this.f34969c) {
                if (this.f34968b != null) {
                    this.f34969c = true;
                    Collections.sort(this.f34967a);
                    return new StructuralMessageInfo(this.f34968b, this.f34970d, this.f34971e, (FieldInfo[]) this.f34967a.toArray(new FieldInfo[0]), this.f34972f);
                }
                throw new IllegalStateException("Must specify a proto syntax");
            }
            throw new IllegalStateException("Builder can only build once");
        }

        public void withCheckInitialized(int[] iArr) {
            this.f34971e = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.f34972f = obj;
        }

        public void withField(FieldInfo fieldInfo) {
            if (!this.f34969c) {
                this.f34967a.add(fieldInfo);
                return;
            }
            throw new IllegalStateException("Builder can only build once");
        }

        public void withMessageSetWireFormat(boolean z) {
            this.f34970d = z;
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
            this.f34968b = (ProtoSyntax) Internal.m55679b(protoSyntax, "syntax");
        }

        public Builder(int i) {
            this.f34971e = null;
            this.f34967a = new ArrayList(i);
        }
    }
}