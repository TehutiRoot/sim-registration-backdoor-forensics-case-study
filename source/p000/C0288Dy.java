package p000;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.joda.time.convert.Converter;

/* renamed from: Dy */
/* loaded from: classes5.dex */
public class C0288Dy {

    /* renamed from: a */
    public final Converter[] f1159a;

    /* renamed from: b */
    public C0289a[] f1160b = new C0289a[16];

    /* renamed from: Dy$a */
    /* loaded from: classes5.dex */
    public static class C0289a {

        /* renamed from: a */
        public final Class f1161a;

        /* renamed from: b */
        public final Converter f1162b;

        public C0289a(Class cls, Converter converter) {
            this.f1161a = cls;
            this.f1162b = converter;
        }
    }

    public C0288Dy(Converter[] converterArr) {
        this.f1159a = converterArr;
    }

    /* renamed from: f */
    public static Converter m68567f(C0288Dy c0288Dy, Class cls) {
        String name;
        Converter[] converterArr = c0288Dy.f1159a;
        int length = converterArr.length;
        int i = length;
        while (true) {
            length--;
            if (length >= 0) {
                Converter converter = converterArr[length];
                Class<?> supportedType = converter.getSupportedType();
                if (supportedType == cls) {
                    return converter;
                }
                if (supportedType == null || (cls != null && !supportedType.isAssignableFrom(cls))) {
                    c0288Dy = c0288Dy.m68570c(length, null);
                    converterArr = c0288Dy.f1159a;
                    i = converterArr.length;
                }
            } else if (cls == null || i == 0) {
                return null;
            } else {
                if (i == 1) {
                    return converterArr[0];
                }
                int i2 = i;
                while (true) {
                    i--;
                    if (i < 0) {
                        break;
                    }
                    Class<?> supportedType2 = converterArr[i].getSupportedType();
                    int i3 = i2;
                    while (true) {
                        i2--;
                        if (i2 >= 0) {
                            if (i2 != i && converterArr[i2].getSupportedType().isAssignableFrom(supportedType2)) {
                                c0288Dy = c0288Dy.m68570c(i2, null);
                                converterArr = c0288Dy.f1159a;
                                i3 = converterArr.length;
                                i = i3 - 1;
                            }
                        }
                    }
                    i2 = i3;
                }
                if (i2 == 1) {
                    return converterArr[0];
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to find best converter for type \"");
                sb.append(cls.getName());
                sb.append("\" from remaining set: ");
                for (int i4 = 0; i4 < i2; i4++) {
                    Converter converter2 = converterArr[i4];
                    Class<?> supportedType3 = converter2.getSupportedType();
                    sb.append(converter2.getClass().getName());
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    if (supportedType3 == null) {
                        name = null;
                    } else {
                        name = supportedType3.getName();
                    }
                    sb.append(name);
                    sb.append("], ");
                }
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public C0288Dy m68572a(Converter converter, Converter[] converterArr) {
        Converter[] converterArr2 = this.f1159a;
        int length = converterArr2.length;
        for (int i = 0; i < length; i++) {
            Converter converter2 = converterArr2[i];
            if (converter.equals(converter2)) {
                if (converterArr != null) {
                    converterArr[0] = null;
                }
                return this;
            } else if (converter.getSupportedType() == converter2.getSupportedType()) {
                Converter[] converterArr3 = new Converter[length];
                for (int i2 = 0; i2 < length; i2++) {
                    if (i2 != i) {
                        converterArr3[i2] = converterArr2[i2];
                    } else {
                        converterArr3[i2] = converter;
                    }
                }
                if (converterArr != null) {
                    converterArr[0] = converter2;
                }
                return new C0288Dy(converterArr3);
            }
        }
        Converter[] converterArr4 = new Converter[length + 1];
        System.arraycopy(converterArr2, 0, converterArr4, 0, length);
        converterArr4[length] = converter;
        if (converterArr != null) {
            converterArr[0] = null;
        }
        return new C0288Dy(converterArr4);
    }

    /* renamed from: b */
    public void m68571b(Converter[] converterArr) {
        Converter[] converterArr2 = this.f1159a;
        System.arraycopy(converterArr2, 0, converterArr, 0, converterArr2.length);
    }

    /* renamed from: c */
    public C0288Dy m68570c(int i, Converter[] converterArr) {
        Converter[] converterArr2 = this.f1159a;
        int length = converterArr2.length;
        if (i < length) {
            if (converterArr != null) {
                converterArr[0] = converterArr2[i];
            }
            Converter[] converterArr3 = new Converter[length - 1];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (i3 != i) {
                    converterArr3[i2] = converterArr2[i3];
                    i2++;
                }
            }
            return new C0288Dy(converterArr3);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: d */
    public C0288Dy m68569d(Converter converter, Converter[] converterArr) {
        Converter[] converterArr2 = this.f1159a;
        int length = converterArr2.length;
        for (int i = 0; i < length; i++) {
            if (converter.equals(converterArr2[i])) {
                return m68570c(i, converterArr);
            }
        }
        if (converterArr != null) {
            converterArr[0] = null;
        }
        return this;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:36:0x001f A[EDGE_INSN: B:36:0x001f->B:15:0x001f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0012  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x001d -> B:6:0x000e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x005a -> B:28:0x0052). Please submit an issue!!! */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public org.joda.time.convert.Converter m68568e(java.lang.Class r10) {
        /*
            r9 = this;
            Dy$a[] r0 = r9.f1160b
            int r1 = r0.length
            r2 = 0
            if (r10 != 0) goto L7
            goto L1d
        L7:
            int r3 = r10.hashCode()
            int r4 = r1 + (-1)
            r3 = r3 & r4
        Le:
            r4 = r0[r3]
            if (r4 == 0) goto L1f
            java.lang.Class r5 = r4.f1161a
            if (r5 != r10) goto L19
            org.joda.time.convert.Converter r10 = r4.f1162b
            return r10
        L19:
            int r3 = r3 + 1
            if (r3 < r1) goto Le
        L1d:
            r3 = 0
            goto Le
        L1f:
            org.joda.time.convert.Converter r4 = m68567f(r9, r10)
            Dy$a r5 = new Dy$a
            r5.<init>(r10, r4)
            java.lang.Object r10 = r0.clone()
            Dy$a[] r10 = (p000.C0288Dy.C0289a[]) r10
            r10[r3] = r5
            r0 = 0
        L31:
            if (r0 >= r1) goto L3d
            r3 = r10[r0]
            if (r3 != 0) goto L3a
            r9.f1160b = r10
            return r4
        L3a:
            int r0 = r0 + 1
            goto L31
        L3d:
            int r0 = r1 << 1
            Dy$a[] r3 = new p000.C0288Dy.C0289a[r0]
            r5 = 0
        L42:
            if (r5 >= r1) goto L61
            r6 = r10[r5]
            java.lang.Class r7 = r6.f1161a
            if (r7 != 0) goto L4b
            goto L5a
        L4b:
            int r7 = r7.hashCode()
            int r8 = r0 + (-1)
            r7 = r7 & r8
        L52:
            r8 = r3[r7]
            if (r8 == 0) goto L5c
            int r7 = r7 + 1
            if (r7 < r0) goto L52
        L5a:
            r7 = 0
            goto L52
        L5c:
            r3[r7] = r6
            int r5 = r5 + 1
            goto L42
        L61:
            r9.f1160b = r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0288Dy.m68568e(java.lang.Class):org.joda.time.convert.Converter");
    }

    /* renamed from: g */
    public int m68566g() {
        return this.f1159a.length;
    }
}
