package p000;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: AT */
/* loaded from: classes5.dex */
public final class C0033AT {

    /* renamed from: a */
    public final boolean f110a;

    /* renamed from: b */
    public final DataCharacter f111b;

    /* renamed from: c */
    public final DataCharacter f112c;

    /* renamed from: d */
    public final FinderPattern f113d;

    public C0033AT(DataCharacter dataCharacter, DataCharacter dataCharacter2, FinderPattern finderPattern, boolean z) {
        this.f111b = dataCharacter;
        this.f112c = dataCharacter2;
        this.f113d = finderPattern;
        this.f110a = z;
    }

    /* renamed from: a */
    public static boolean m69099a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: e */
    public static int m69095e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: b */
    public FinderPattern m69098b() {
        return this.f113d;
    }

    /* renamed from: c */
    public DataCharacter m69097c() {
        return this.f111b;
    }

    /* renamed from: d */
    public DataCharacter m69096d() {
        return this.f112c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0033AT)) {
            return false;
        }
        C0033AT c0033at = (C0033AT) obj;
        if (!m69099a(this.f111b, c0033at.f111b) || !m69099a(this.f112c, c0033at.f112c) || !m69099a(this.f113d, c0033at.f113d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m69094f() {
        if (this.f112c == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (m69095e(this.f111b) ^ m69095e(this.f112c)) ^ m69095e(this.f113d);
    }

    public String toString() {
        Object valueOf;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f111b);
        sb.append(" , ");
        sb.append(this.f112c);
        sb.append(" : ");
        FinderPattern finderPattern = this.f113d;
        if (finderPattern == null) {
            valueOf = AbstractJsonLexerKt.NULL;
        } else {
            valueOf = Integer.valueOf(finderPattern.getValue());
        }
        sb.append(valueOf);
        sb.append(" ]");
        return sb.toString();
    }
}
