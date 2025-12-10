package p000;

import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.bson.json.JsonParseException;

/* renamed from: oh0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C21454oh0 implements InterfaceC18815Yg0 {

    /* renamed from: a */
    public final Reader f72758a;

    /* renamed from: b */
    public final List f72759b;

    /* renamed from: c */
    public final int f72760c;

    /* renamed from: d */
    public int f72761d;

    /* renamed from: e */
    public int f72762e;

    /* renamed from: f */
    public boolean f72763f;

    /* renamed from: g */
    public boolean f72764g;

    /* renamed from: h */
    public char[] f72765h;

    /* renamed from: i */
    public int f72766i;

    /* renamed from: j */
    public int f72767j;

    public C21454oh0(Reader reader) {
        this(reader, 16);
    }

    @Override // p000.InterfaceC18815Yg0
    /* renamed from: a */
    public void mo23629a(int i) {
        this.f72764g = false;
        if (i != -1 && this.f72762e == i) {
            this.f72763f = true;
            this.f72761d--;
        }
    }

    @Override // p000.InterfaceC18815Yg0
    /* renamed from: b */
    public void mo23628b(int i) {
        int indexOf = this.f72759b.indexOf(Integer.valueOf(i));
        if (indexOf == -1) {
            return;
        }
        List list = this.f72759b;
        list.subList(indexOf, list.size()).clear();
    }

    @Override // p000.InterfaceC18815Yg0
    /* renamed from: c */
    public void mo23627c(int i) {
        if (i <= this.f72761d) {
            int indexOf = this.f72759b.indexOf(Integer.valueOf(i));
            if (indexOf != -1) {
                if (i != this.f72761d) {
                    this.f72763f = false;
                }
                List list = this.f72759b;
                list.subList(indexOf, list.size()).clear();
                this.f72761d = i;
                return;
            }
            throw new IllegalArgumentException("mark invalidated");
        }
        throw new IllegalStateException("mark cannot reset ahead of position, only back");
    }

    /* renamed from: d */
    public final void m25885d(char c) {
        if (!this.f72759b.isEmpty()) {
            int i = this.f72767j;
            char[] cArr = this.f72765h;
            if (i == cArr.length) {
                char[] cArr2 = new char[cArr.length * 2];
                System.arraycopy(cArr, 0, cArr2, 0, i);
                this.f72765h = cArr2;
            }
            char[] cArr3 = this.f72765h;
            int i2 = this.f72767j;
            cArr3[i2] = c;
            this.f72767j = i2 + 1;
        }
    }

    /* renamed from: e */
    public final void m25884e() {
        this.f72766i = -1;
        this.f72767j = 0;
        this.f72765h = new char[this.f72760c];
    }

    @Override // p000.InterfaceC18815Yg0
    public int getPosition() {
        return this.f72761d;
    }

    @Override // p000.InterfaceC18815Yg0
    public int mark() {
        if (this.f72767j == 0) {
            this.f72766i = this.f72761d;
        }
        if (!this.f72759b.contains(Integer.valueOf(this.f72761d))) {
            this.f72759b.add(Integer.valueOf(this.f72761d));
        }
        return this.f72761d;
    }

    @Override // p000.InterfaceC18815Yg0
    public int read() {
        if (!this.f72764g) {
            if (this.f72763f) {
                this.f72763f = false;
                int i = this.f72762e;
                this.f72762e = -1;
                this.f72761d++;
                return i;
            }
            int i2 = this.f72761d;
            int i3 = this.f72766i;
            if (i2 - i3 < this.f72767j) {
                char c = this.f72765h[i2 - i3];
                this.f72762e = c;
                this.f72761d = i2 + 1;
                return c;
            }
            if (this.f72759b.isEmpty()) {
                m25884e();
            }
            try {
                int read = this.f72758a.read();
                if (read != -1) {
                    this.f72762e = read;
                    m25885d((char) read);
                }
                this.f72761d++;
                if (read == -1) {
                    this.f72764g = true;
                }
                return read;
            } catch (IOException e) {
                throw new JsonParseException(e);
            }
        }
        throw new JsonParseException("Trying to read past EOF.");
    }

    public C21454oh0(Reader reader, int i) {
        this.f72759b = new ArrayList();
        this.f72760c = i;
        this.f72758a = reader;
        m25884e();
    }
}
