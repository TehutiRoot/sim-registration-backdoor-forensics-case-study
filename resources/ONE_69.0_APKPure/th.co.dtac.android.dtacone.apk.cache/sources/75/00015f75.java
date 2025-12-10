package p000;

import org.bson.json.JsonParseException;

/* renamed from: vh0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C22726vh0 implements InterfaceC19785eh0 {

    /* renamed from: a */
    public final String f108176a;

    /* renamed from: b */
    public int f108177b;

    /* renamed from: c */
    public boolean f108178c;

    public C22726vh0(String str) {
        this.f108176a = str;
    }

    @Override // p000.InterfaceC19785eh0
    /* renamed from: a */
    public void mo878a(int i) {
        this.f108178c = false;
        if (i != -1 && this.f108176a.charAt(this.f108177b - 1) == i) {
            this.f108177b--;
        }
    }

    @Override // p000.InterfaceC19785eh0
    /* renamed from: c */
    public void mo876c(int i) {
        if (i <= this.f108177b) {
            this.f108177b = i;
            return;
        }
        throw new IllegalStateException("mark cannot reset ahead of position, only back");
    }

    @Override // p000.InterfaceC19785eh0
    public int getPosition() {
        return this.f108177b;
    }

    @Override // p000.InterfaceC19785eh0
    public int mark() {
        return this.f108177b;
    }

    @Override // p000.InterfaceC19785eh0
    public int read() {
        if (!this.f108178c) {
            if (this.f108177b >= this.f108176a.length()) {
                this.f108178c = true;
                return -1;
            }
            String str = this.f108176a;
            int i = this.f108177b;
            this.f108177b = i + 1;
            return str.charAt(i);
        }
        throw new JsonParseException("Trying to read past EOF.");
    }

    @Override // p000.InterfaceC19785eh0
    /* renamed from: b */
    public void mo877b(int i) {
    }
}