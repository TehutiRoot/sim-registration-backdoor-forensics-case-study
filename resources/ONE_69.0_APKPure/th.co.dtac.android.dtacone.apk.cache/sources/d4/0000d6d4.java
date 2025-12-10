package p000;

/* renamed from: j7 */
/* loaded from: classes3.dex */
public class C11498j7 {

    /* renamed from: a */
    public int f67218a;

    /* renamed from: b */
    public byte f67219b;

    /* renamed from: c */
    public byte f67220c;

    /* renamed from: d */
    public int f67221d;

    /* renamed from: e */
    public byte[] f67222e;

    /* renamed from: f */
    public C11499a[][] f67223f = new C11499a[7];

    /* renamed from: g */
    public byte[] f67224g;

    /* renamed from: h */
    public byte[] f67225h;

    /* renamed from: i */
    public int f67226i;

    /* renamed from: j */
    public int f67227j;

    /* renamed from: j7$a */
    /* loaded from: classes3.dex */
    public class C11499a {

        /* renamed from: a */
        public byte f67228a;

        /* renamed from: b */
        public boolean f67229b;

        public C11499a() {
        }
    }

    public C11498j7() {
        for (int i = 0; i < 7; i++) {
            this.f67223f[i] = new C11499a[4];
            for (int i2 = 0; i2 < 4; i2++) {
                this.f67223f[i][i2] = new C11499a();
            }
        }
        this.f67225h = new byte[15];
    }
}