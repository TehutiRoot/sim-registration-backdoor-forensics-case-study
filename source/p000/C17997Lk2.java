package p000;

import com.google.android.gms.internal.clearcut.zzcb;
import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: Lk2  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17997Lk2 {

    /* renamed from: A */
    public int f3550A;

    /* renamed from: B */
    public int f3551B;

    /* renamed from: C */
    public Field f3552C;

    /* renamed from: D */
    public Object f3553D;

    /* renamed from: E */
    public Object f3554E;

    /* renamed from: F */
    public Object f3555F;

    /* renamed from: a */
    public final C18253Pk2 f3556a;

    /* renamed from: b */
    public final Object[] f3557b;

    /* renamed from: c */
    public Class f3558c;

    /* renamed from: d */
    public final int f3559d;

    /* renamed from: e */
    public final int f3560e;

    /* renamed from: f */
    public final int f3561f;

    /* renamed from: g */
    public final int f3562g;

    /* renamed from: h */
    public final int f3563h;

    /* renamed from: i */
    public final int f3564i;

    /* renamed from: j */
    public final int f3565j;

    /* renamed from: k */
    public final int f3566k;

    /* renamed from: l */
    public final int f3567l;

    /* renamed from: m */
    public final int f3568m;

    /* renamed from: n */
    public final int[] f3569n;

    /* renamed from: o */
    public int f3570o;

    /* renamed from: p */
    public int f3571p;

    /* renamed from: q */
    public int f3572q = Integer.MAX_VALUE;

    /* renamed from: r */
    public int f3573r = Integer.MIN_VALUE;

    /* renamed from: s */
    public int f3574s = 0;

    /* renamed from: t */
    public int f3575t = 0;

    /* renamed from: u */
    public int f3576u = 0;

    /* renamed from: v */
    public int f3577v = 0;

    /* renamed from: w */
    public int f3578w = 0;

    /* renamed from: x */
    public int f3579x;

    /* renamed from: y */
    public int f3580y;

    /* renamed from: z */
    public int f3581z;

    public C17997Lk2(Class cls, String str, Object[] objArr) {
        this.f3558c = cls;
        C18253Pk2 c18253Pk2 = new C18253Pk2(str);
        this.f3556a = c18253Pk2;
        this.f3557b = objArr;
        this.f3559d = c18253Pk2.m66735b();
        int m66735b = c18253Pk2.m66735b();
        this.f3560e = m66735b;
        if (m66735b == 0) {
            this.f3561f = 0;
            this.f3562g = 0;
            this.f3563h = 0;
            this.f3564i = 0;
            this.f3565j = 0;
            this.f3567l = 0;
            this.f3566k = 0;
            this.f3568m = 0;
            this.f3569n = null;
            return;
        }
        int m66735b2 = c18253Pk2.m66735b();
        this.f3561f = m66735b2;
        int m66735b3 = c18253Pk2.m66735b();
        this.f3562g = m66735b3;
        this.f3563h = c18253Pk2.m66735b();
        this.f3564i = c18253Pk2.m66735b();
        this.f3567l = c18253Pk2.m66735b();
        this.f3566k = c18253Pk2.m66735b();
        this.f3565j = c18253Pk2.m66735b();
        this.f3568m = c18253Pk2.m66735b();
        int m66735b4 = c18253Pk2.m66735b();
        this.f3569n = m66735b4 != 0 ? new int[m66735b4] : null;
        this.f3570o = (m66735b2 << 1) + m66735b3;
    }

    /* renamed from: c */
    public static Field m67486c(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
        if (m67480i() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
        r5.f3554E = m67483f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014b, code lost:
        if ((r5.f3580y & 2048) != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0153, code lost:
        if (m67480i() != false) goto L31;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m67488a() {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C17997Lk2.m67488a():boolean");
    }

    /* renamed from: f */
    public final Object m67483f() {
        Object[] objArr = this.f3557b;
        int i = this.f3570o;
        this.f3570o = i + 1;
        return objArr[i];
    }

    /* renamed from: g */
    public final int m67482g() {
        return this.f3579x;
    }

    /* renamed from: h */
    public final int m67481h() {
        return this.f3581z;
    }

    /* renamed from: i */
    public final boolean m67480i() {
        if ((this.f3559d & 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m67478k() {
        if (this.f3581z > zzcb.zziw.m48168id()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final Field m67477l() {
        int i = this.f3550A << 1;
        Object obj = this.f3557b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field m67486c = m67486c(this.f3558c, (String) obj);
        this.f3557b[i] = m67486c;
        return m67486c;
    }

    /* renamed from: m */
    public final Field m67476m() {
        int i = (this.f3550A << 1) + 1;
        Object obj = this.f3557b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field m67486c = m67486c(this.f3558c, (String) obj);
        this.f3557b[i] = m67486c;
        return m67486c;
    }

    /* renamed from: n */
    public final Field m67475n() {
        return this.f3552C;
    }

    /* renamed from: o */
    public final boolean m67474o() {
        if (m67480i() && this.f3581z <= zzcb.zzhp.m48168id()) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public final Field m67473p() {
        int i = (this.f3561f << 1) + (this.f3551B / 32);
        Object obj = this.f3557b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field m67486c = m67486c(this.f3558c, (String) obj);
        this.f3557b[i] = m67486c;
        return m67486c;
    }

    /* renamed from: q */
    public final int m67472q() {
        return this.f3551B % 32;
    }

    /* renamed from: r */
    public final boolean m67471r() {
        if ((this.f3580y & 256) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final boolean m67470s() {
        if ((this.f3580y & 512) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public final Object m67469t() {
        return this.f3553D;
    }

    /* renamed from: u */
    public final Object m67468u() {
        return this.f3554E;
    }

    /* renamed from: v */
    public final Object m67467v() {
        return this.f3555F;
    }
}
