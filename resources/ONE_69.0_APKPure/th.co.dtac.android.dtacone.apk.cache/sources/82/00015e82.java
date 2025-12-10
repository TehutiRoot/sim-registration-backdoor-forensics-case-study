package p000;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.bson.json.JsonParseException;

/* renamed from: uh0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C22553uh0 implements InterfaceC19785eh0 {

    /* renamed from: a */
    public final Reader f107840a;

    /* renamed from: b */
    public final List f107841b;

    /* renamed from: c */
    public final int f107842c;

    /* renamed from: d */
    public int f107843d;

    /* renamed from: e */
    public int f107844e;

    /* renamed from: f */
    public boolean f107845f;

    /* renamed from: g */
    public boolean f107846g;

    /* renamed from: h */
    public char[] f107847h;

    /* renamed from: i */
    public int f107848i;

    /* renamed from: j */
    public int f107849j;

    public C22553uh0(Reader reader) {
        this(reader, 16);
    }

    @Override // p000.InterfaceC19785eh0
    /* renamed from: a */
    public void mo878a(int i) {
        this.f107846g = false;
        if (i != -1 && this.f107844e == i) {
            this.f107845f = true;
            this.f107843d--;
        }
    }

    @Override // p000.InterfaceC19785eh0
    /* renamed from: b */
    public void mo877b(int i) {
        int indexOf = this.f107841b.indexOf(Integer.valueOf(i));
        if (indexOf == -1) {
            return;
        }
        List list = this.f107841b;
        list.subList(indexOf, list.size()).clear();
    }

    @Override // p000.InterfaceC19785eh0
    /* renamed from: c */
    public void mo876c(int i) {
        if (i <= this.f107843d) {
            int indexOf = this.f107841b.indexOf(Integer.valueOf(i));
            if (indexOf != -1) {
                if (i != this.f107843d) {
                    this.f107845f = false;
                }
                List list = this.f107841b;
                list.subList(indexOf, list.size()).clear();
                this.f107843d = i;
                return;
            }
            throw new IllegalArgumentException("mark invalidated");
        }
        throw new IllegalStateException("mark cannot reset ahead of position, only back");
    }

    /* renamed from: d */
    public final void m1076d(char c) {
        if (!this.f107841b.isEmpty()) {
            int i = this.f107849j;
            char[] cArr = this.f107847h;
            if (i == cArr.length) {
                char[] cArr2 = new char[cArr.length * 2];
                System.arraycopy(cArr, 0, cArr2, 0, i);
                this.f107847h = cArr2;
            }
            char[] cArr3 = this.f107847h;
            int i2 = this.f107849j;
            cArr3[i2] = c;
            this.f107849j = i2 + 1;
        }
    }

    /* renamed from: e */
    public final void m1075e() {
        this.f107848i = -1;
        this.f107849j = 0;
        this.f107847h = new char[this.f107842c];
    }

    @Override // p000.InterfaceC19785eh0
    public int getPosition() {
        return this.f107843d;
    }

    @Override // p000.InterfaceC19785eh0
    public int mark() {
        if (this.f107849j == 0) {
            this.f107848i = this.f107843d;
        }
        if (!this.f107841b.contains(Integer.valueOf(this.f107843d))) {
            this.f107841b.add(Integer.valueOf(this.f107843d));
        }
        return this.f107843d;
    }

    @Override // p000.InterfaceC19785eh0
    public int read() {
        if (!this.f107846g) {
            if (this.f107845f) {
                this.f107845f = false;
                int i = this.f107844e;
                this.f107844e = -1;
                this.f107843d++;
                return i;
            }
            int i2 = this.f107843d;
            int i3 = this.f107848i;
            if (i2 - i3 < this.f107849j) {
                char c = this.f107847h[i2 - i3];
                this.f107844e = c;
                this.f107843d = i2 + 1;
                return c;
            }
            if (this.f107841b.isEmpty()) {
                m1075e();
            }
            try {
                int read = this.f107840a.read();
                if (read != -1) {
                    this.f107844e = read;
                    m1076d((char) read);
                }
                this.f107843d++;
                if (read == -1) {
                    this.f107846g = true;
                }
                return read;
            } catch (IOException e) {
                throw new JsonParseException(e);
            }
        }
        throw new JsonParseException("Trying to read past EOF.");
    }

    public C22553uh0(Reader reader, int i) {
        this.f107841b = new ArrayList();
        this.f107842c = i;
        this.f107840a = reader;
        m1075e();
    }
}