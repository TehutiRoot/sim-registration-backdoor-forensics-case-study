package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjb;
import com.google.android.gms.internal.vision.zzjb.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class zzjb<MessageType extends zzjb<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhf<MessageType, BuilderType> {
    private static Map<Object, zzjb<?, ?>> zzd = new ConcurrentHashMap();
    protected zzlx zzb = zzlx.zza();
    private int zzc = -1;

    /* renamed from: com.google.android.gms.internal.vision.zzjb$a */
    /* loaded from: classes3.dex */
    public static final class C6653a implements zziw {

        /* renamed from: c */
        public final zzml f47634c;

        /* renamed from: a */
        public final zzjh f47632a = null;

        /* renamed from: b */
        public final int f47633b = 202056002;

        /* renamed from: d */
        public final boolean f47635d = true;

        /* renamed from: e */
        public final boolean f47636e = false;

        public C6653a(zzjh zzjhVar, int i, zzml zzmlVar, boolean z, boolean z2) {
            this.f47634c = zzmlVar;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return this.f47633b - ((C6653a) obj).f47633b;
        }

        @Override // com.google.android.gms.internal.vision.zziw
        public final int zza() {
            return this.f47633b;
        }

        @Override // com.google.android.gms.internal.vision.zziw
        public final zzml zzb() {
            return this.f47634c;
        }

        @Override // com.google.android.gms.internal.vision.zziw
        public final zzmo zzc() {
            return this.f47634c.zza();
        }

        @Override // com.google.android.gms.internal.vision.zziw
        public final boolean zzd() {
            return this.f47635d;
        }

        @Override // com.google.android.gms.internal.vision.zziw
        public final boolean zze() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.vision.zziw
        public final zzkn zza(zzkn zzknVar, zzkk zzkkVar) {
            return ((zzb) zzknVar).zza((zzb) ((zzjb) zzkkVar));
        }

        @Override // com.google.android.gms.internal.vision.zziw
        public final zzkt zza(zzkt zzktVar, zzkt zzktVar2) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes3.dex */
    public static class zza<T extends zzjb<T, ?>> extends zzhg<T> {

        /* renamed from: b */
        public final zzjb f47637b;

        public zza(T t) {
            this.f47637b = t;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType extends zzd<MessageType, BuilderType>> extends zzjb<MessageType, BuilderType> implements zzkm {
        protected Iy2 zzc = Iy2.m67831e();

        /* renamed from: i */
        public final Iy2 m46424i() {
            if (this.zzc.m67822n()) {
                this.zzc = (Iy2) this.zzc.clone();
            }
            return this.zzc;
        }

        /* JADX WARN: Type inference failed for: r1v6, types: [Type, java.util.List, java.util.ArrayList] */
        public final <Type> Type zzb(zzim<MessageType, Type> zzimVar) {
            zze m46428h = zzjb.m46428h(zzimVar);
            if (m46428h.f47639a == ((zzjb) zzr())) {
                Type type = (Type) this.zzc.m67833c(m46428h.f47642d);
                if (type == null) {
                    return (Type) m46428h.f47640b;
                }
                C6653a c6653a = m46428h.f47642d;
                if (c6653a.f47635d) {
                    if (c6653a.f47634c.zza() == zzmo.ENUM) {
                        ?? r1 = (Type) new ArrayList();
                        for (Object obj : (List) type) {
                            r1.add(m46428h.m46423a(obj));
                        }
                        return r1;
                    }
                    return type;
                }
                return (Type) m46428h.m46423a(type);
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class zzd<MessageType extends zzc<MessageType, BuilderType>, BuilderType extends zzd<MessageType, BuilderType>> extends zzb<MessageType, BuilderType> implements zzkm {
        public zzd(MessageType messagetype) {
            super(messagetype);
        }

        @Override // com.google.android.gms.internal.vision.zzjb.zzb
        public void zzb() {
            super.zzb();
            MessageType messagetype = this.zza;
            ((zzc) messagetype).zzc = (Iy2) ((zzc) messagetype).zzc.clone();
        }

        @Override // com.google.android.gms.internal.vision.zzjb.zzb
        public /* synthetic */ zzjb zzc() {
            return (zzc) zze();
        }

        @Override // com.google.android.gms.internal.vision.zzjb.zzb, com.google.android.gms.internal.vision.zzkn
        public /* synthetic */ zzkk zze() {
            if (this.zzb) {
                return (zzc) this.zza;
            }
            ((zzc) this.zza).zzc.m67827i();
            return (zzc) super.zze();
        }
    }

    /* loaded from: classes3.dex */
    public static class zze<ContainingType extends zzkk, Type> extends zzim<ContainingType, Type> {

        /* renamed from: a */
        public final zzkk f47639a;

        /* renamed from: b */
        public final Object f47640b;

        /* renamed from: c */
        public final zzkk f47641c;

        /* renamed from: d */
        public final C6653a f47642d;

        public zze(zzkk zzkkVar, Object obj, zzkk zzkkVar2, C6653a c6653a, Class cls) {
            if (zzkkVar != null) {
                if (c6653a.f47634c == zzml.zzk && zzkkVar2 == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.f47639a = zzkkVar;
                this.f47640b = obj;
                this.f47641c = zzkkVar2;
                this.f47642d = c6653a;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        /* renamed from: a */
        public final Object m46423a(Object obj) {
            if (this.f47642d.f47634c.zza() != zzmo.ENUM) {
                return obj;
            }
            ((Integer) obj).intValue();
            throw null;
        }
    }

    /* loaded from: classes3.dex */
    public enum zzg {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47643a = {1, 2, 3, 4, 5, 6, 7};
        public static final int zza = 1;
        public static final int zzb = 2;
        public static final int zzc = 3;
        public static final int zzd = 4;
        public static final int zze = 5;
        public static final int zzf = 6;
        public static final int zzg = 7;

        public static int[] zza() {
            return (int[]) f47643a.clone();
        }
    }

    /* renamed from: d */
    public static zzjb m46432d(zzjb zzjbVar) {
        if (zzjbVar != null && !zzjbVar.zzk()) {
            throw new zzjk(new zzlv(zzjbVar).getMessage()).zza(zzjbVar);
        }
        return zzjbVar;
    }

    /* renamed from: e */
    public static zzjb m46431e(zzjb zzjbVar, byte[] bArr, int i, int i2, zzio zzioVar) {
        zzjb zzjbVar2 = (zzjb) zzjbVar.zza(zzg.zzd, (Object) null, (Object) null);
        try {
            InterfaceC19835fE2 m68671c = DD2.m68673a().m68671c(zzjbVar2);
            m68671c.mo31331e(zzjbVar2, bArr, 0, i2, new Nu2(zzioVar));
            m68671c.zzc(zzjbVar2);
            if (zzjbVar2.zza == 0) {
                return zzjbVar2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzjk) {
                throw ((zzjk) e.getCause());
            }
            throw new zzjk(e.getMessage()).zza(zzjbVar2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzjk.zza().zza(zzjbVar2);
        }
    }

    /* renamed from: f */
    public static zzjb m46430f(Class cls) {
        zzjb<?, ?> zzjbVar = zzd.get(cls);
        if (zzjbVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzjbVar = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzjbVar == null) {
            zzjbVar = (zzjb) ((zzjb) AbstractC20013gG2.m31194c(cls)).zza(zzg.zzf, (Object) null, (Object) null);
            if (zzjbVar != null) {
                zzd.put(cls, zzjbVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzjbVar;
    }

    /* renamed from: g */
    public static Object m46429g(Method method, Object obj, Object... objArr) {
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

    /* renamed from: h */
    public static zze m46428h(zzim zzimVar) {
        return (zze) zzimVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.zzjj, Oz2] */
    public static zzjj zzn() {
        return Oz2.m66935c();
    }

    public static <E> zzjl<E> zzo() {
        return C19147bE2.m52035c();
    }

    @Override // com.google.android.gms.internal.vision.zzhf
    /* renamed from: a */
    public final void mo46435a(int i) {
        this.zzc = i;
    }

    @Override // com.google.android.gms.internal.vision.zzhf
    /* renamed from: b */
    public final int mo46434b() {
        return this.zzc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return DD2.m68673a().m68671c(this).zza(this, (zzjb) obj);
    }

    public int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zza2 = DD2.m68673a().m68671c(this).zza(this);
        this.zza = zza2;
        return zza2;
    }

    public String toString() {
        return AbstractC6617B.m46613a(this, super.toString());
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.vision.zzkk
    public final void zza(zzii zziiVar) throws IOException {
        DD2.m68673a().m68671c(this).mo31333c(this, Cx2.m68717K(zziiVar));
    }

    public final <MessageType extends zzjb<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzj() {
        return (BuilderType) zza(zzg.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.vision.zzkm
    public final boolean zzk() {
        return zza(this, true);
    }

    public final BuilderType zzl() {
        BuilderType buildertype = (BuilderType) zza(zzg.zze, (Object) null, (Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.vision.zzkk
    public final int zzm() {
        if (this.zzc == -1) {
            this.zzc = DD2.m68673a().m68671c(this).zzb(this);
        }
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.vision.zzkk
    public final /* synthetic */ zzkn zzp() {
        zzb zzbVar = (zzb) zza(zzg.zze, (Object) null, (Object) null);
        zzbVar.zza((zzb) this);
        return zzbVar;
    }

    @Override // com.google.android.gms.internal.vision.zzkk
    public final /* synthetic */ zzkn zzq() {
        return (zzb) zza(zzg.zze, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.vision.zzkm
    public final /* synthetic */ zzkk zzr() {
        return (zzjb) zza(zzg.zzf, (Object) null, (Object) null);
    }

    /* loaded from: classes3.dex */
    public static abstract class zzb<MessageType extends zzjb<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzhe<MessageType, BuilderType> {

        /* renamed from: a */
        public final zzjb f47638a;
        protected MessageType zza;
        protected boolean zzb = false;

        public zzb(MessageType messagetype) {
            this.f47638a = messagetype;
            this.zza = (MessageType) messagetype.zza(zzg.zzd, null, null);
        }

        /* renamed from: a */
        public static void m46427a(zzjb zzjbVar, zzjb zzjbVar2) {
            DD2.m68673a().m68671c(zzjbVar).mo31334b(zzjbVar, zzjbVar2);
        }

        @Override // com.google.android.gms.internal.vision.zzhe
        /* renamed from: b */
        public final zzb zza(zzif zzifVar, zzio zzioVar) {
            if (this.zzb) {
                zzb();
                this.zzb = false;
            }
            try {
                DD2.m68673a().m68671c(this.zza).mo31332d(this.zza, Yw2.m65280w(zzifVar), zzioVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        /* renamed from: c */
        public final zzb m46425c(byte[] bArr, int i, int i2, zzio zzioVar) {
            if (this.zzb) {
                zzb();
                this.zzb = false;
            }
            try {
                DD2.m68673a().m68671c(this.zza).mo31331e(this.zza, bArr, 0, i2, new Nu2(zzioVar));
                return this;
            } catch (zzjk e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzjk.zza();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.vision.zzhe
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.f47638a.zza(zzg.zze, (Object) null, (Object) null);
            zzbVar.zza((zzb) ((zzjb) zze()));
            return zzbVar;
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzb) {
                zzb();
                this.zzb = false;
            }
            m46427a(this.zza, messagetype);
            return this;
        }

        public void zzb() {
            MessageType messagetype = (MessageType) this.zza.zza(zzg.zzd, null, null);
            m46427a(messagetype, this.zza);
            this.zza = messagetype;
        }

        @Override // com.google.android.gms.internal.vision.zzkn
        /* renamed from: zzc */
        public MessageType zze() {
            if (this.zzb) {
                return this.zza;
            }
            MessageType messagetype = this.zza;
            DD2.m68673a().m68671c(messagetype).zzc(messagetype);
            this.zzb = true;
            return this.zza;
        }

        @Override // com.google.android.gms.internal.vision.zzkn
        /* renamed from: zzd */
        public final MessageType zzf() {
            MessageType messagetype = (MessageType) zze();
            if (messagetype.zzk()) {
                return messagetype;
            }
            throw new zzlv(messagetype);
        }

        @Override // com.google.android.gms.internal.vision.zzkm
        public final boolean zzk() {
            return zzjb.zza(this.zza, false);
        }

        @Override // com.google.android.gms.internal.vision.zzkm
        public final /* synthetic */ zzkk zzr() {
            return this.f47638a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.vision.zzhe
        public final /* synthetic */ zzhe zza(zzhf zzhfVar) {
            return zza((zzb<MessageType, BuilderType>) ((zzjb) zzhfVar));
        }

        @Override // com.google.android.gms.internal.vision.zzhe
        public final /* synthetic */ zzhe zza(byte[] bArr, int i, int i2, zzio zzioVar) throws zzjk {
            return m46425c(bArr, 0, i2, zzioVar);
        }

        @Override // com.google.android.gms.internal.vision.zzhe
        public final /* synthetic */ zzhe zza() {
            return (zzb) clone();
        }
    }

    public static <T extends zzjb<?, ?>> void zza(Class<T> cls, T t) {
        zzd.put(cls, t);
    }

    public static Object zza(zzkk zzkkVar, String str, Object[] objArr) {
        return new XD2(zzkkVar, str, objArr);
    }

    public static <ContainingType extends zzkk, Type> zze<ContainingType, Type> zza(ContainingType containingtype, zzkk zzkkVar, zzjh<?> zzjhVar, int i, zzml zzmlVar, boolean z, Class cls) {
        return new zze<>(containingtype, Collections.emptyList(), zzkkVar, new C6653a(null, 202056002, zzmlVar, true, false), cls);
    }

    public static final <T extends zzjb<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzg.zza, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo31335a = DD2.m68673a().m68671c(t).mo31335a(t);
        if (z) {
            t.zza(zzg.zzb, mo31335a ? t : null, null);
        }
        return mo31335a;
    }

    public static <E> zzjl<E> zza(zzjl<E> zzjlVar) {
        int size = zzjlVar.size();
        return zzjlVar.zza(size == 0 ? 10 : size << 1);
    }

    public static <T extends zzjb<T, ?>> T zza(T t, byte[] bArr) throws zzjk {
        return (T) m46432d(m46431e(t, bArr, 0, bArr.length, zzio.zzb()));
    }

    public static <T extends zzjb<T, ?>> T zza(T t, byte[] bArr, zzio zzioVar) throws zzjk {
        return (T) m46432d(m46431e(t, bArr, 0, bArr.length, zzioVar));
    }
}
