package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzka;
import com.google.android.gms.internal.measurement.zzke;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class zzke<MessageType extends zzke<MessageType, BuilderType>, BuilderType extends zzka<MessageType, BuilderType>> extends zzin<MessageType, BuilderType> {
    private static final Map zza = new ConcurrentHashMap();
    protected zzmo zzc = zzmo.zzc();
    protected int zzd = -1;

    /* renamed from: c */
    public static Object m47155c(Method method, Object obj, Object... objArr) {
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

    /* renamed from: d */
    public static zzke m47154d(Class cls) {
        Map map = zza;
        zzke zzkeVar = (zzke) map.get(cls);
        if (zzkeVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzkeVar = (zzke) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzkeVar == null) {
            zzkeVar = (zzke) ((zzke) BH2.m68940j(cls)).zzl(6, null, null);
            if (zzkeVar != null) {
                map.put(cls, zzkeVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzkeVar;
    }

    public static zzkj zzbA() {
        return C21205nC2.m26153b();
    }

    public static zzkk zzbB() {
        return YD2.m65383a();
    }

    public static zzkk zzbC(zzkk zzkkVar) {
        int i;
        int size = zzkkVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzkkVar.zze(i);
    }

    public static zzkl zzbD() {
        return C22074sF2.m22654a();
    }

    public static zzkl zzbE(zzkl zzklVar) {
        int i;
        int size = zzklVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzklVar.zzd(i);
    }

    public static Object zzbI(zzll zzllVar, String str, Object[] objArr) {
        return new C22934xF2(zzllVar, str, objArr);
    }

    public static void zzbJ(Class cls, zzke zzkeVar) {
        zza.put(cls, zzkeVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzin
    /* renamed from: a */
    public final int mo47157a() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.measurement.zzin
    /* renamed from: b */
    public final void mo47156b(int i) {
        this.zzd = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C21214nF2.m26147a().m26146b(getClass()).zzj(this, (zzke) obj);
    }

    public final int hashCode() {
        int i = this.zzb;
        if (i != 0) {
            return i;
        }
        int zzb = C21214nF2.m26147a().m26146b(getClass()).zzb(this);
        this.zzb = zzb;
        return zzb;
    }

    public final String toString() {
        return AbstractC6530d.m47401a(this, super.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final /* synthetic */ zzlk zzbF() {
        return (zzka) zzl(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final /* synthetic */ zzlk zzbG() {
        zzka zzkaVar = (zzka) zzl(5, null, null);
        zzkaVar.zzaC(this);
        return zzkaVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final void zzbK(zzjl zzjlVar) throws IOException {
        C21214nF2.m26147a().m26146b(getClass()).mo47360a(this, C22059sA2.m22684J(zzjlVar));
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final /* synthetic */ zzll zzbO() {
        return (zzke) zzl(6, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzll
    public final int zzbw() {
        int i = this.zzd;
        if (i == -1) {
            int zza2 = C21214nF2.m26147a().m26146b(getClass()).zza(this);
            this.zzd = zza2;
            return zza2;
        }
        return i;
    }

    public final zzka zzbx() {
        return (zzka) zzl(5, null, null);
    }

    public final zzka zzby() {
        zzka zzkaVar = (zzka) zzl(5, null, null);
        zzkaVar.zzaC(this);
        return zzkaVar;
    }

    public abstract Object zzl(int i, Object obj, Object obj2);
}
