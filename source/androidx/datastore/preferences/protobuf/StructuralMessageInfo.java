package androidx.datastore.preferences.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class StructuralMessageInfo implements InterfaceC20971ls0 {

    /* renamed from: a */
    public final ProtoSyntax f34874a;

    /* renamed from: b */
    public final boolean f34875b;

    /* renamed from: c */
    public final int[] f34876c;

    /* renamed from: d */
    public final FieldInfo[] f34877d;

    /* renamed from: e */
    public final MessageLite f34878e;

    public StructuralMessageInfo(ProtoSyntax protoSyntax, boolean z, int[] iArr, FieldInfo[] fieldInfoArr, Object obj) {
        this.f34874a = protoSyntax;
        this.f34875b = z;
        this.f34876c = iArr;
        this.f34877d = fieldInfoArr;
        this.f34878e = (MessageLite) Internal.m55729b(obj, "defaultInstance");
    }

    @Override // p000.InterfaceC20971ls0
    /* renamed from: a */
    public boolean mo26414a() {
        return this.f34875b;
    }

    @Override // p000.InterfaceC20971ls0
    /* renamed from: b */
    public MessageLite mo26413b() {
        return this.f34878e;
    }

    /* renamed from: c */
    public int[] m55558c() {
        return this.f34876c;
    }

    /* renamed from: d */
    public FieldInfo[] m55557d() {
        return this.f34877d;
    }

    @Override // p000.InterfaceC20971ls0
    public ProtoSyntax getSyntax() {
        return this.f34874a;
    }

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a */
        public final List f34879a;

        /* renamed from: b */
        public ProtoSyntax f34880b;

        /* renamed from: c */
        public boolean f34881c;

        /* renamed from: d */
        public boolean f34882d;

        /* renamed from: e */
        public int[] f34883e;

        /* renamed from: f */
        public Object f34884f;

        public Builder() {
            this.f34883e = null;
            this.f34879a = new ArrayList();
        }

        public StructuralMessageInfo build() {
            if (!this.f34881c) {
                if (this.f34880b != null) {
                    this.f34881c = true;
                    Collections.sort(this.f34879a);
                    return new StructuralMessageInfo(this.f34880b, this.f34882d, this.f34883e, (FieldInfo[]) this.f34879a.toArray(new FieldInfo[0]), this.f34884f);
                }
                throw new IllegalStateException("Must specify a proto syntax");
            }
            throw new IllegalStateException("Builder can only build once");
        }

        public void withCheckInitialized(int[] iArr) {
            this.f34883e = iArr;
        }

        public void withDefaultInstance(Object obj) {
            this.f34884f = obj;
        }

        public void withField(FieldInfo fieldInfo) {
            if (!this.f34881c) {
                this.f34879a.add(fieldInfo);
                return;
            }
            throw new IllegalStateException("Builder can only build once");
        }

        public void withMessageSetWireFormat(boolean z) {
            this.f34882d = z;
        }

        public void withSyntax(ProtoSyntax protoSyntax) {
            this.f34880b = (ProtoSyntax) Internal.m55729b(protoSyntax, "syntax");
        }

        public Builder(int i) {
            this.f34883e = null;
            this.f34879a = new ArrayList(i);
        }
    }
}
