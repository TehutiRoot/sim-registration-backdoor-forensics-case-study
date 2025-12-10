package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzid;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes3.dex */
public abstract class zzib {

    /* renamed from: a */
    public static WeakHashMap f45859a = new WeakHashMap();

    /* renamed from: b */
    public static final Lock f45860b = new ReentrantLock();

    /* renamed from: c */
    public static Field m47899c(Class cls) {
        boolean z;
        boolean z2;
        Field field = null;
        if (cls == null) {
            return null;
        }
        Lock lock = f45860b;
        lock.lock();
        try {
            if (f45859a.containsKey(cls)) {
                Field field2 = (Field) f45859a.get(cls);
                lock.unlock();
                return field2;
            }
            for (zzjd zzjdVar : zziv.zzc(cls).zzif()) {
                Field zzig = zzjdVar.zzig();
                zzid zzidVar = (zzid) zzig.getAnnotation(zzid.class);
                if (zzidVar != null) {
                    if (field == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Object[] objArr = {cls};
                    if (z) {
                        boolean zza = zzix.zza(zzig.getType());
                        Object[] objArr2 = {cls, zzig.getType()};
                        if (zza) {
                            zzid.zza[] zzhw = zzidVar.zzhw();
                            HashSet hashSet = new HashSet();
                            if (zzhw.length > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zzml.checkArgument(z2, "@JsonPolymorphicTypeMap must have at least one @TypeDef");
                            for (zzid.zza zzaVar : zzhw) {
                                boolean add = hashSet.add(zzaVar.zzhx());
                                Object[] objArr3 = {zzaVar.zzhx()};
                                if (!add) {
                                    throw new IllegalArgumentException(zzmt.zzb("Class contains two @TypeDef annotations with identical key: %s", objArr3));
                                }
                            }
                            field = zzig;
                        } else {
                            throw new IllegalArgumentException(zzmt.zzb("Field which has the @JsonPolymorphicTypeMap, %s, is not a supported type: %s", objArr2));
                        }
                    } else {
                        throw new IllegalArgumentException(zzmt.zzb("Class contains more than one field with @JsonPolymorphicTypeMap annotation: %s", objArr));
                    }
                }
            }
            f45859a.put(cls, field);
            return field;
        } finally {
            f45860b.unlock();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:182:0x0286, code lost:
        if (com.google.android.gms.internal.firebase_ml.zzjs.zza(r1, java.util.Map.class) == false) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0288, code lost:
        r2 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01d2 A[Catch: IllegalArgumentException -> 0x0067, TryCatch #0 {IllegalArgumentException -> 0x0067, blocks: (B:14:0x002d, B:17:0x0046, B:18:0x0066, B:22:0x006c, B:25:0x0073, B:27:0x007a, B:29:0x0082, B:31:0x0088, B:33:0x0095, B:35:0x009b, B:37:0x00a8, B:39:0x00b1, B:42:0x00c5, B:52:0x00e5, B:55:0x00ef, B:58:0x00f6, B:59:0x00fb, B:45:0x00cb, B:47:0x00d3, B:49:0x00db, B:62:0x0106, B:65:0x010d, B:67:0x0114, B:72:0x0122, B:75:0x0129, B:80:0x0133, B:84:0x013a, B:89:0x0143, B:94:0x014c, B:99:0x0155, B:102:0x015a, B:103:0x017a, B:104:0x017b, B:106:0x0184, B:108:0x018d, B:110:0x0196, B:112:0x019f, B:114:0x01a8, B:116:0x01b1, B:119:0x01b8, B:122:0x01be, B:127:0x01ca, B:129:0x01d2, B:131:0x01d6, B:133:0x01d9, B:135:0x01dc, B:136:0x01e5, B:137:0x01e6, B:141:0x01f0, B:146:0x01fa, B:151:0x0207, B:152:0x020c, B:153:0x020d, B:155:0x0213, B:160:0x0226, B:161:0x022e, B:163:0x0232, B:165:0x024b, B:157:0x021a, B:159:0x0222, B:168:0x0255, B:169:0x025e, B:170:0x025f, B:173:0x026e, B:178:0x027a, B:179:0x027f, B:181:0x0282, B:186:0x028d, B:193:0x02a3, B:195:0x02a9, B:198:0x02b0, B:200:0x02b6, B:202:0x02bc, B:205:0x02c5, B:207:0x02d4, B:209:0x02d8, B:210:0x02e2, B:212:0x02f4, B:214:0x02fa, B:241:0x039a, B:244:0x03a0, B:248:0x03b0, B:250:0x03c9, B:252:0x03d5, B:258:0x03e3, B:260:0x03ef, B:262:0x03f9, B:261:0x03f4, B:253:0x03db, B:216:0x030e, B:218:0x0312, B:220:0x031b, B:222:0x0321, B:224:0x0327, B:227:0x032e, B:228:0x0335, B:229:0x0336, B:235:0x0382, B:232:0x0368, B:234:0x037f, B:236:0x038c, B:237:0x0391, B:238:0x0392, B:239:0x0397, B:191:0x0299, B:192:0x029e, B:264:0x0417, B:265:0x0420), top: B:275:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01dc A[Catch: IllegalArgumentException -> 0x0067, TryCatch #0 {IllegalArgumentException -> 0x0067, blocks: (B:14:0x002d, B:17:0x0046, B:18:0x0066, B:22:0x006c, B:25:0x0073, B:27:0x007a, B:29:0x0082, B:31:0x0088, B:33:0x0095, B:35:0x009b, B:37:0x00a8, B:39:0x00b1, B:42:0x00c5, B:52:0x00e5, B:55:0x00ef, B:58:0x00f6, B:59:0x00fb, B:45:0x00cb, B:47:0x00d3, B:49:0x00db, B:62:0x0106, B:65:0x010d, B:67:0x0114, B:72:0x0122, B:75:0x0129, B:80:0x0133, B:84:0x013a, B:89:0x0143, B:94:0x014c, B:99:0x0155, B:102:0x015a, B:103:0x017a, B:104:0x017b, B:106:0x0184, B:108:0x018d, B:110:0x0196, B:112:0x019f, B:114:0x01a8, B:116:0x01b1, B:119:0x01b8, B:122:0x01be, B:127:0x01ca, B:129:0x01d2, B:131:0x01d6, B:133:0x01d9, B:135:0x01dc, B:136:0x01e5, B:137:0x01e6, B:141:0x01f0, B:146:0x01fa, B:151:0x0207, B:152:0x020c, B:153:0x020d, B:155:0x0213, B:160:0x0226, B:161:0x022e, B:163:0x0232, B:165:0x024b, B:157:0x021a, B:159:0x0222, B:168:0x0255, B:169:0x025e, B:170:0x025f, B:173:0x026e, B:178:0x027a, B:179:0x027f, B:181:0x0282, B:186:0x028d, B:193:0x02a3, B:195:0x02a9, B:198:0x02b0, B:200:0x02b6, B:202:0x02bc, B:205:0x02c5, B:207:0x02d4, B:209:0x02d8, B:210:0x02e2, B:212:0x02f4, B:214:0x02fa, B:241:0x039a, B:244:0x03a0, B:248:0x03b0, B:250:0x03c9, B:252:0x03d5, B:258:0x03e3, B:260:0x03ef, B:262:0x03f9, B:261:0x03f4, B:253:0x03db, B:216:0x030e, B:218:0x0312, B:220:0x031b, B:222:0x0321, B:224:0x0327, B:227:0x032e, B:228:0x0335, B:229:0x0336, B:235:0x0382, B:232:0x0368, B:234:0x037f, B:236:0x038c, B:237:0x0391, B:238:0x0392, B:239:0x0397, B:191:0x0299, B:192:0x029e, B:264:0x0417, B:265:0x0420), top: B:275:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0255 A[Catch: IllegalArgumentException -> 0x0067, TryCatch #0 {IllegalArgumentException -> 0x0067, blocks: (B:14:0x002d, B:17:0x0046, B:18:0x0066, B:22:0x006c, B:25:0x0073, B:27:0x007a, B:29:0x0082, B:31:0x0088, B:33:0x0095, B:35:0x009b, B:37:0x00a8, B:39:0x00b1, B:42:0x00c5, B:52:0x00e5, B:55:0x00ef, B:58:0x00f6, B:59:0x00fb, B:45:0x00cb, B:47:0x00d3, B:49:0x00db, B:62:0x0106, B:65:0x010d, B:67:0x0114, B:72:0x0122, B:75:0x0129, B:80:0x0133, B:84:0x013a, B:89:0x0143, B:94:0x014c, B:99:0x0155, B:102:0x015a, B:103:0x017a, B:104:0x017b, B:106:0x0184, B:108:0x018d, B:110:0x0196, B:112:0x019f, B:114:0x01a8, B:116:0x01b1, B:119:0x01b8, B:122:0x01be, B:127:0x01ca, B:129:0x01d2, B:131:0x01d6, B:133:0x01d9, B:135:0x01dc, B:136:0x01e5, B:137:0x01e6, B:141:0x01f0, B:146:0x01fa, B:151:0x0207, B:152:0x020c, B:153:0x020d, B:155:0x0213, B:160:0x0226, B:161:0x022e, B:163:0x0232, B:165:0x024b, B:157:0x021a, B:159:0x0222, B:168:0x0255, B:169:0x025e, B:170:0x025f, B:173:0x026e, B:178:0x027a, B:179:0x027f, B:181:0x0282, B:186:0x028d, B:193:0x02a3, B:195:0x02a9, B:198:0x02b0, B:200:0x02b6, B:202:0x02bc, B:205:0x02c5, B:207:0x02d4, B:209:0x02d8, B:210:0x02e2, B:212:0x02f4, B:214:0x02fa, B:241:0x039a, B:244:0x03a0, B:248:0x03b0, B:250:0x03c9, B:252:0x03d5, B:258:0x03e3, B:260:0x03ef, B:262:0x03f9, B:261:0x03f4, B:253:0x03db, B:216:0x030e, B:218:0x0312, B:220:0x031b, B:222:0x0321, B:224:0x0327, B:227:0x032e, B:228:0x0335, B:229:0x0336, B:235:0x0382, B:232:0x0368, B:234:0x037f, B:236:0x038c, B:237:0x0391, B:238:0x0392, B:239:0x0397, B:191:0x0299, B:192:0x029e, B:264:0x0417, B:265:0x0420), top: B:275:0x002d }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m47901a(java.lang.reflect.Field r20, java.lang.reflect.Type r21, java.util.ArrayList r22, java.lang.Object r23, com.google.android.gms.internal.firebase_ml.zzhv r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 1130
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzib.m47901a(java.lang.reflect.Field, java.lang.reflect.Type, java.util.ArrayList, java.lang.Object, com.google.android.gms.internal.firebase_ml.zzhv, boolean):java.lang.Object");
    }

    /* renamed from: b */
    public final void m47900b(Field field, Map map, Type type, ArrayList arrayList, zzhv zzhvVar) {
        zzih m47897e = m47897e();
        while (m47897e == zzih.FIELD_NAME) {
            String text = getText();
            zzhi();
            if (zzhvVar == null) {
                map.put(text, m47901a(field, type, arrayList, map, zzhvVar, true));
                m47897e = zzhi();
            } else {
                throw new NoSuchMethodError();
            }
        }
    }

    public abstract void close() throws IOException;

    /* renamed from: d */
    public final zzih m47898d() {
        boolean z;
        zzih zzhj = zzhj();
        if (zzhj == null) {
            zzhj = zzhi();
        }
        if (zzhj != null) {
            z = true;
        } else {
            z = false;
        }
        zzml.checkArgument(z, "no JSON input found");
        return zzhj;
    }

    /* renamed from: e */
    public final zzih m47897e() {
        zzih m47898d = m47898d();
        int i = Pw2.f4911a[m47898d.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2) {
                return zzhi();
            }
            return m47898d;
        }
        zzih zzhi = zzhi();
        if (zzhi != zzih.FIELD_NAME && zzhi != zzih.END_OBJECT) {
            z = false;
        }
        zzml.checkArgument(z, zzhi);
        return zzhi;
    }

    public abstract int getIntValue() throws IOException;

    public abstract String getText() throws IOException;

    public final <T> T zza(Class<T> cls, zzhv zzhvVar) throws IOException {
        try {
            return (T) zza(cls, false, null);
        } finally {
            close();
        }
    }

    public abstract zzhx zzhh();

    public abstract zzih zzhi() throws IOException;

    public abstract zzih zzhj();

    public abstract String zzhk() throws IOException;

    public abstract zzib zzhl() throws IOException;

    public abstract byte zzhm() throws IOException;

    public abstract short zzhn() throws IOException;

    public abstract float zzho() throws IOException;

    public abstract long zzhp() throws IOException;

    public abstract double zzhq() throws IOException;

    public abstract BigInteger zzhr() throws IOException;

    public abstract BigDecimal zzhs() throws IOException;

    public final String zza(Set<String> set) throws IOException {
        zzih m47897e = m47897e();
        while (m47897e == zzih.FIELD_NAME) {
            String text = getText();
            zzhi();
            if (set.contains(text)) {
                return text;
            }
            zzhl();
            m47897e = zzhi();
        }
        return null;
    }

    public final Object zza(Type type, boolean z, zzhv zzhvVar) throws IOException {
        try {
            if (!Void.class.equals(type)) {
                m47898d();
            }
            Object m47901a = m47901a(null, type, new ArrayList(), null, null, true);
            if (z) {
                close();
            }
            return m47901a;
        } catch (Throwable th2) {
            if (z) {
                close();
            }
            throw th2;
        }
    }
}
