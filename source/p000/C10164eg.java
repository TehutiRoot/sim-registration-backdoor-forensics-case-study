package p000;

/* renamed from: eg */
/* loaded from: classes5.dex */
public class C10164eg {

    /* renamed from: a */
    public final char f61559a;

    /* renamed from: b */
    public char f61560b;

    /* renamed from: c */
    public final int f61561c;

    public C10164eg(char c, char c2, int i) {
        this.f61559a = c;
        this.f61560b = c2;
        this.f61561c = i;
    }

    /* renamed from: a */
    public boolean m31514a(char c, char c2, int i) {
        char c3 = this.f61560b;
        if (c == c3 + 1 && i == ((this.f61561c + c3) - this.f61559a) + 1) {
            this.f61560b = c2;
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public int m31513b(char c) {
        char c2 = this.f61559a;
        if (c2 <= c && c <= this.f61560b) {
            return this.f61561c + (c - c2);
        }
        return -1;
    }
}
