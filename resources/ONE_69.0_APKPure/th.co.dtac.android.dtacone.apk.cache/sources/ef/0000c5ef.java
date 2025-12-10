package p000;

/* renamed from: eg */
/* loaded from: classes5.dex */
public class C10160eg {

    /* renamed from: a */
    public final char f61625a;

    /* renamed from: b */
    public char f61626b;

    /* renamed from: c */
    public final int f61627c;

    public C10160eg(char c, char c2, int i) {
        this.f61625a = c;
        this.f61626b = c2;
        this.f61627c = i;
    }

    /* renamed from: a */
    public boolean m31657a(char c, char c2, int i) {
        char c3 = this.f61626b;
        if (c == c3 + 1 && i == ((this.f61627c + c3) - this.f61625a) + 1) {
            this.f61626b = c2;
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public int m31656b(char c) {
        char c2 = this.f61625a;
        if (c2 <= c && c <= this.f61626b) {
            return this.f61627c + (c - c2);
        }
        return -1;
    }
}