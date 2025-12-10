package p000;

import org.bson.json.JsonParseException;

/* renamed from: ph0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C21626ph0 implements InterfaceC18815Yg0 {

    /* renamed from: a */
    public final String f76656a;

    /* renamed from: b */
    public int f76657b;

    /* renamed from: c */
    public boolean f76658c;

    public C21626ph0(String str) {
        this.f76656a = str;
    }

    @Override // p000.InterfaceC18815Yg0
    /* renamed from: a */
    public void mo23629a(int i) {
        this.f76658c = false;
        if (i != -1 && this.f76656a.charAt(this.f76657b - 1) == i) {
            this.f76657b--;
        }
    }

    @Override // p000.InterfaceC18815Yg0
    /* renamed from: c */
    public void mo23627c(int i) {
        if (i <= this.f76657b) {
            this.f76657b = i;
            return;
        }
        throw new IllegalStateException("mark cannot reset ahead of position, only back");
    }

    @Override // p000.InterfaceC18815Yg0
    public int getPosition() {
        return this.f76657b;
    }

    @Override // p000.InterfaceC18815Yg0
    public int mark() {
        return this.f76657b;
    }

    @Override // p000.InterfaceC18815Yg0
    public int read() {
        if (!this.f76658c) {
            if (this.f76657b >= this.f76656a.length()) {
                this.f76658c = true;
                return -1;
            }
            String str = this.f76656a;
            int i = this.f76657b;
            this.f76657b = i + 1;
            return str.charAt(i);
        }
        throw new JsonParseException("Trying to read past EOF.");
    }

    @Override // p000.InterfaceC18815Yg0
    /* renamed from: b */
    public void mo23628b(int i) {
    }
}
