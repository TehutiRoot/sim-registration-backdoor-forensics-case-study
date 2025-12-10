package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class zzia {
    /* renamed from: a */
    public final void m47902a(boolean z, Object obj) {
        boolean z2;
        zziv zzc;
        Field zzig;
        boolean z3;
        if (obj == null) {
            return;
        }
        Class<?> cls = obj.getClass();
        if (zzix.isNull(obj)) {
            zzhf();
        } else if (obj instanceof String) {
            writeString((String) obj);
        } else {
            boolean z4 = false;
            if (obj instanceof Number) {
                if (z) {
                    writeString(obj.toString());
                } else if (obj instanceof BigDecimal) {
                    zza((BigDecimal) obj);
                } else if (obj instanceof BigInteger) {
                    zza((BigInteger) obj);
                } else if (obj instanceof Long) {
                    zze(((Long) obj).longValue());
                } else if (obj instanceof Float) {
                    float floatValue = ((Number) obj).floatValue();
                    if (!Float.isInfinite(floatValue) && !Float.isNaN(floatValue)) {
                        z4 = true;
                    }
                    zzml.checkArgument(z4);
                    zzj(floatValue);
                } else if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
                    double doubleValue = ((Number) obj).doubleValue();
                    if (!Double.isInfinite(doubleValue) && !Double.isNaN(doubleValue)) {
                        z4 = true;
                    }
                    zzml.checkArgument(z4);
                    zza(doubleValue);
                } else {
                    zzai(((Number) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                writeBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof zzje) {
                writeString(((zzje) obj).zzij());
            } else if (!(obj instanceof Iterable) && !cls.isArray()) {
                if (cls.isEnum()) {
                    String name = zzjd.zza((Enum) obj).getName();
                    if (name == null) {
                        zzhf();
                        return;
                    } else {
                        writeString(name);
                        return;
                    }
                }
                zzhd();
                if ((obj instanceof Map) && !(obj instanceof zzjf)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    zzc = null;
                } else {
                    zzc = zziv.zzc(cls);
                }
                for (Map.Entry<String, Object> entry : zzix.zzf(obj).entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        String key = entry.getKey();
                        if (z2) {
                            z3 = z;
                        } else {
                            zzjd zzao = zzc.zzao(key);
                            if (zzao == null) {
                                zzig = null;
                            } else {
                                zzig = zzao.zzig();
                            }
                            if (zzig != null && zzig.getAnnotation(zzif.class) != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                        }
                        zzan(key);
                        m47902a(z3, value);
                    }
                }
                zzhe();
            } else {
                zzhb();
                for (Object obj2 : zzjs.zzi(obj)) {
                    m47902a(z, obj2);
                }
                zzhc();
            }
        }
    }

    public abstract void flush() throws IOException;

    public abstract void writeBoolean(boolean z) throws IOException;

    public abstract void writeString(String str) throws IOException;

    public abstract void zza(double d) throws IOException;

    public abstract void zza(BigDecimal bigDecimal) throws IOException;

    public abstract void zza(BigInteger bigInteger) throws IOException;

    public abstract void zzai(int i) throws IOException;

    public abstract void zzan(String str) throws IOException;

    public final void zzd(Object obj) throws IOException {
        m47902a(false, obj);
    }

    public abstract void zze(long j) throws IOException;

    public abstract void zzhb() throws IOException;

    public abstract void zzhc() throws IOException;

    public abstract void zzhd() throws IOException;

    public abstract void zzhe() throws IOException;

    public abstract void zzhf() throws IOException;

    public void zzhg() throws IOException {
    }

    public abstract void zzj(float f) throws IOException;
}
