package p000;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: ET */
/* loaded from: classes5.dex */
public final class C0317ET {

    /* renamed from: a */
    public final boolean f1361a;

    /* renamed from: b */
    public final DataCharacter f1362b;

    /* renamed from: c */
    public final DataCharacter f1363c;

    /* renamed from: d */
    public final FinderPattern f1364d;

    public C0317ET(DataCharacter dataCharacter, DataCharacter dataCharacter2, FinderPattern finderPattern, boolean z) {
        this.f1362b = dataCharacter;
        this.f1363c = dataCharacter2;
        this.f1364d = finderPattern;
        this.f1361a = z;
    }

    /* renamed from: a */
    public static boolean m68655a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: e */
    public static int m68651e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: b */
    public FinderPattern m68654b() {
        return this.f1364d;
    }

    /* renamed from: c */
    public DataCharacter m68653c() {
        return this.f1362b;
    }

    /* renamed from: d */
    public DataCharacter m68652d() {
        return this.f1363c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0317ET)) {
            return false;
        }
        C0317ET c0317et = (C0317ET) obj;
        if (!m68655a(this.f1362b, c0317et.f1362b) || !m68655a(this.f1363c, c0317et.f1363c) || !m68655a(this.f1364d, c0317et.f1364d)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public boolean m68650f() {
        if (this.f1363c == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (m68651e(this.f1362b) ^ m68651e(this.f1363c)) ^ m68651e(this.f1364d);
    }

    public String toString() {
        Object valueOf;
        StringBuilder sb = new StringBuilder("[ ");
        sb.append(this.f1362b);
        sb.append(" , ");
        sb.append(this.f1363c);
        sb.append(" : ");
        FinderPattern finderPattern = this.f1364d;
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