package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzdx;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzed;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class zzed<MessageType extends zzed<MessageType, BuilderType>, BuilderType extends zzdx<MessageType, BuilderType>> extends zzck<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    private int zzd = -1;
    protected zzgz zzc = zzgz.zzc();

    /* renamed from: c */
    public static zzed m46879c(Class cls) {
        Map map = zza;
        zzed zzedVar = (zzed) map.get(cls);
        if (zzedVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzedVar = (zzed) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzedVar == null) {
            zzedVar = (zzed) ((zzed) AbstractC19775eu2.m31402j(cls)).zzg(6, null, null);
            if (zzedVar != null) {
                map.put(cls, zzedVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzedVar;
    }

    /* renamed from: e */
    public static Object m46877e(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* renamed from: j */
    public static zzed m46872j(zzed zzedVar, byte[] bArr, int i, int i2, zzdo zzdoVar) {
        zzed m46878d = zzedVar.m46878d();
        try {
            Rq2 m68856b = Bp2.m68857a().m68856b(m46878d.getClass());
            m68856b.mo46922a(m46878d, bArr, 0, i2, new C22657vg2(zzdoVar));
            m68856b.zzf(m46878d);
            return m46878d;
        } catch (zzeo e) {
            e.zzf(m46878d);
            throw e;
        } catch (zzgx e2) {
            zzeo zza2 = e2.zza();
            zza2.zzf(m46878d);
            throw zza2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzeo) {
                throw ((zzeo) e3.getCause());
            }
            zzeo zzeoVar = new zzeo(e3);
            zzeoVar.zzf(m46878d);
            throw zzeoVar;
        } catch (IndexOutOfBoundsException unused) {
            zzeo zzg = zzeo.zzg();
            zzg.zzf(m46878d);
            throw zzg;
        }
    }

    public static zzeb zzH(zzfo zzfoVar, Object obj, zzfo zzfoVar2, zzeg zzegVar, int i, zzho zzhoVar, Class cls) {
        return new zzeb(zzfoVar, obj, zzfoVar2, new C22497uk2(null, i, zzhoVar, false, false), cls);
    }

    public static zzed zzK(zzed zzedVar, byte[] bArr, zzdo zzdoVar) throws zzeo {
        zzed m46872j = m46872j(zzedVar, bArr, 0, bArr.length, zzdoVar);
        if (m46872j != null && !m46872j.zzac()) {
            zzeo zza2 = new zzgx(m46872j).zza();
            zza2.zzf(m46872j);
            throw zza2;
        }
        return m46872j;
    }

    public static zzei zzL() {
        return C17674Gj2.m68201a();
    }

    public static zzei zzM(zzei zzeiVar) {
        int i;
        int size = zzeiVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzeiVar.zzf(i);
    }

    public static zzej zzN() {
        return C18125Nk2.m67178b();
    }

    public static zzel zzO() {
        return Hp2.m68038a();
    }

    public static zzel zzP(zzel zzelVar) {
        int i;
        int size = zzelVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzelVar.zzd(i);
    }

    public static Object zzR(zzfo zzfoVar, String str, Object[] objArr) {
        return new Mp2(zzfoVar, str, objArr);
    }

    public static void zzU(Class cls, zzed zzedVar) {
        zzedVar.m46876f();
        zza.put(cls, zzedVar);
    }

    public static final boolean zzW(zzed zzedVar, boolean z) {
        Object obj;
        byte byteValue = ((Byte) zzedVar.zzg(1, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = Bp2.m68857a().m68856b(zzedVar.getClass()).zzk(zzedVar);
        if (z) {
            if (true != zzk) {
                obj = null;
            } else {
                obj = zzedVar;
            }
            zzedVar.zzg(2, obj, null);
        }
        return zzk;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzck
    /* renamed from: a */
    public final int mo46881a(Rq2 rq2) {
        if (m46874h()) {
            int m46873i = m46873i(rq2);
            if (m46873i >= 0) {
                return m46873i;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + m46873i);
        }
        int i = this.zzd & Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int m46873i2 = m46873i(rq2);
        if (m46873i2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | m46873i2;
            return m46873i2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + m46873i2);
    }

    /* renamed from: b */
    public final int m46880b() {
        return Bp2.m68857a().m68856b(getClass()).zzb(this);
    }

    /* renamed from: d */
    public final zzed m46878d() {
        return (zzed) zzg(4, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Bp2.m68857a().m68856b(getClass()).zzj(this, (zzed) obj);
    }

    /* renamed from: f */
    public final void m46876f() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* renamed from: g */
    public final void m46875g(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    /* renamed from: h */
    public final boolean m46874h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (!m46874h()) {
            int i = this.zzb;
            if (i == 0) {
                int m46880b = m46880b();
                this.zzb = m46880b;
                return m46880b;
            }
            return i;
        }
        return m46880b();
    }

    /* renamed from: i */
    public final int m46873i(Rq2 rq2) {
        if (rq2 == null) {
            return Bp2.m68857a().m68856b(getClass()).zza(this);
        }
        return rq2.zza(this);
    }

    public final String toString() {
        return AbstractC6569c.m46965a(this, super.toString());
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo
    public final int zzE() {
        int i;
        if (m46874h()) {
            i = m46873i(null);
            if (i < 0) {
                throw new IllegalStateException("serialized size must be non-negative, was " + i);
            }
        } else {
            i = this.zzd & Integer.MAX_VALUE;
            if (i == Integer.MAX_VALUE) {
                i = m46873i(null);
                if (i >= 0) {
                    this.zzd = (this.zzd & Integer.MIN_VALUE) | i;
                } else {
                    throw new IllegalStateException("serialized size must be non-negative, was " + i);
                }
            }
        }
        return i;
    }

    public final zzdx zzF() {
        return (zzdx) zzg(5, null, null);
    }

    public final zzdx zzG() {
        zzdx zzdxVar = (zzdx) zzg(5, null, null);
        zzdxVar.zzg(this);
        return zzdxVar;
    }

    public final void zzS() {
        Bp2.m68857a().m68856b(getClass()).zzf(this);
        m46876f();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo
    public final /* synthetic */ zzfn zzY() {
        return (zzdx) zzg(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo
    public final /* synthetic */ zzfn zzZ() {
        zzdx zzdxVar = (zzdx) zzg(5, null, null);
        zzdxVar.zzg(this);
        return zzdxVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfo
    public final void zzaa(zzdj zzdjVar) throws IOException {
        Bp2.m68857a().m68856b(getClass()).mo46921b(this, C17927Ki2.m67597K(zzdjVar));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp
    public final /* synthetic */ zzfo zzab() {
        return (zzed) zzg(6, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzfp
    public final boolean zzac() {
        return zzW(this, true);
    }

    public abstract Object zzg(int i, Object obj, Object obj2);
}
