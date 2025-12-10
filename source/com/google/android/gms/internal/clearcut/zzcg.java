package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzcg.zza;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class zzcg<MessageType extends zzcg<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzas<MessageType, BuilderType> {
    private static Map<Object, zzcg<?, ?>> zzjr = new ConcurrentHashMap();
    protected zzey zzjp = zzey.zzea();
    private int zzjq = -1;

    /* renamed from: com.google.android.gms.internal.clearcut.zzcg$a */
    /* loaded from: classes3.dex */
    public static final class C6423a implements zzca {

        /* renamed from: c */
        public final zzfl f45561c;

        /* renamed from: a */
        public final zzck f45559a = null;

        /* renamed from: b */
        public final int f45560b = 66321687;

        /* renamed from: d */
        public final boolean f45562d = false;

        /* renamed from: e */
        public final boolean f45563e = false;

        public C6423a(zzck zzckVar, int i, zzfl zzflVar, boolean z, boolean z2) {
            this.f45561c = zzflVar;
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            return this.f45560b - ((C6423a) obj).f45560b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.clearcut.zzca
        public final zzdp zza(zzdp zzdpVar, zzdo zzdoVar) {
            return ((zza) zzdpVar).zza((zza) ((zzcg) zzdoVar));
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final zzfl zzau() {
            return this.f45561c;
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final zzfq zzav() {
            return this.f45561c.zzek();
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final boolean zzaw() {
            return false;
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final boolean zzax() {
            return false;
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final int zzc() {
            return this.f45560b;
        }

        @Override // com.google.android.gms.internal.clearcut.zzca
        public final zzdv zza(zzdv zzdvVar, zzdv zzdvVar2) {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class zza<MessageType extends zzcg<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> extends zzat<MessageType, BuilderType> {

        /* renamed from: a */
        public final zzcg f45564a;
        protected MessageType zzjt;
        protected boolean zzju = false;

        public zza(MessageType messagetype) {
            this.f45564a = messagetype;
            this.zzjt = (MessageType) messagetype.zza(zzg.zzkg, null, null);
        }

        /* renamed from: a */
        public static void m48162a(zzcg zzcgVar, zzcg zzcgVar2) {
            C23013xk2.m400a().m397d(zzcgVar).mo48247f(zzcgVar, zzcgVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.clearcut.zzat
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zza zzaVar = (zza) this.f45564a.zza(zzg.zzkh, (Object) null, (Object) null);
            zzaVar.zza((zza) ((zzcg) zzbi()));
            return zzaVar;
        }

        @Override // com.google.android.gms.internal.clearcut.zzdq
        public final boolean isInitialized() {
            return zzcg.zza(this.zzjt, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.clearcut.zzat
        public final /* synthetic */ zzat zza(zzas zzasVar) {
            return zza((zza<MessageType, BuilderType>) ((zzcg) zzasVar));
        }

        @Override // com.google.android.gms.internal.clearcut.zzdq
        public final /* synthetic */ zzdo zzbe() {
            return this.f45564a;
        }

        public void zzbf() {
            if (this.zzju) {
                MessageType messagetype = (MessageType) this.zzjt.zza(zzg.zzkg, null, null);
                m48162a(messagetype, this.zzjt);
                this.zzjt = messagetype;
                this.zzju = false;
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzdp
        /* renamed from: zzbg */
        public MessageType zzbi() {
            if (this.zzju) {
                return this.zzjt;
            }
            MessageType messagetype = this.zzjt;
            C23013xk2.m400a().m397d(messagetype).zzc(messagetype);
            this.zzju = true;
            return this.zzjt;
        }

        public final MessageType zzbh() {
            MessageType messagetype = (MessageType) zzbi();
            byte byteValue = ((Byte) messagetype.zza(zzg.zzkd, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C23013xk2.m400a().m397d(messagetype).mo48248e(messagetype);
                    messagetype.zza(zzg.zzke, z ? messagetype : null, null);
                }
            }
            if (z) {
                return messagetype;
            }
            throw new zzew(messagetype);
        }

        @Override // com.google.android.gms.internal.clearcut.zzdp
        public final /* synthetic */ zzdo zzbj() {
            zzcg zzcgVar = (zzcg) zzbi();
            byte byteValue = ((Byte) zzcgVar.zza(zzg.zzkd, (Object) null, (Object) null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C23013xk2.m400a().m397d(zzcgVar).mo48248e(zzcgVar);
                    zzcgVar.zza(zzg.zzke, z ? zzcgVar : null, (Object) null);
                }
            }
            if (z) {
                return zzcgVar;
            }
            throw new zzew(zzcgVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzat
        public final /* synthetic */ zzat zzt() {
            return (zza) clone();
        }

        public final BuilderType zza(MessageType messagetype) {
            zzbf();
            m48162a(this.zzjt, messagetype);
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static class zzb<T extends zzcg<T, ?>> extends zzau<T> {

        /* renamed from: b */
        public zzcg f45565b;

        public zzb(T t) {
            this.f45565b = t;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class zzc<MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>> extends zza<MessageType, BuilderType> implements zzdq {
        public zzc(MessageType messagetype) {
            super(messagetype);
        }

        @Override // com.google.android.gms.internal.clearcut.zzcg.zza
        public final void zzbf() {
            if (this.zzju) {
                super.zzbf();
                MessageType messagetype = this.zzjt;
                ((zzd) messagetype).zzjv = (C20934lf2) ((zzd) messagetype).zzjv.clone();
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzcg.zza
        public final /* synthetic */ zzcg zzbg() {
            return (zzd) zzbi();
        }

        @Override // com.google.android.gms.internal.clearcut.zzcg.zza, com.google.android.gms.internal.clearcut.zzdp
        public final /* synthetic */ zzdo zzbi() {
            MessageType messagetype;
            if (this.zzju) {
                messagetype = this.zzjt;
            } else {
                ((zzd) this.zzjt).zzjv.m26428t();
                messagetype = (MessageType) super.zzbi();
            }
            return (zzd) messagetype;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType extends zzc<MessageType, BuilderType>> extends zzcg<MessageType, BuilderType> implements zzdq {
        protected C20934lf2 zzjv = C20934lf2.m26437k();
    }

    /* loaded from: classes3.dex */
    public static class zzf<ContainingType extends zzdo, Type> extends zzbr<ContainingType, Type> {

        /* renamed from: a */
        public final zzdo f45566a;

        /* renamed from: b */
        public final Object f45567b;

        /* renamed from: c */
        public final zzdo f45568c;

        /* renamed from: d */
        public final C6423a f45569d;

        public zzf(zzdo zzdoVar, Object obj, zzdo zzdoVar2, C6423a c6423a, Class cls) {
            if (zzdoVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (c6423a.f45561c == zzfl.zzqm && zzdoVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f45566a = zzdoVar;
            this.f45567b = obj;
            this.f45568c = zzdoVar2;
            this.f45569d = c6423a;
        }
    }

    /* loaded from: classes3.dex */
    public enum zzg {
        public static final int zzkd = 1;
        public static final int zzke = 2;
        public static final int zzkf = 3;
        public static final int zzkg = 4;
        public static final int zzkh = 5;
        public static final int zzki = 6;
        public static final int zzkj = 7;

        /* renamed from: a */
        public static final /* synthetic */ int[] f45570a = {1, 2, 3, 4, 5, 6, 7};
        public static final int zzkl = 1;
        public static final int zzkm = 2;

        /* renamed from: b */
        public static final /* synthetic */ int[] f45571b = {1, 2};
        public static final int zzko = 1;
        public static final int zzkp = 2;

        /* renamed from: c */
        public static final /* synthetic */ int[] f45572c = {1, 2};

        /* renamed from: values$50KLMJ33DTMIUPRFDTJMOP9FE1P6UT3FC9QMCBQ7CLN6ASJ1EHIM8JB5EDPM2PR59HKN8P949LIN8Q3FCHA6UIBEEPNMMP9R0 */
        public static int[] m48161x126d66cb() {
            return (int[]) f45570a.clone();
        }
    }

    /* renamed from: c */
    public static zzcg m48165c(zzcg zzcgVar, byte[] bArr) {
        zzcg zzcgVar2 = (zzcg) zzcgVar.zza(zzg.zzkg, (Object) null, (Object) null);
        try {
            C23013xk2.m400a().m397d(zzcgVar2).mo48249d(zzcgVar2, bArr, 0, bArr.length, new C20412id2());
            C23013xk2.m400a().m397d(zzcgVar2).zzc(zzcgVar2);
            if (zzcgVar2.zzex == 0) {
                return zzcgVar2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzco) {
                throw ((zzco) e.getCause());
            }
            throw new zzco(e.getMessage()).zzg(zzcgVar2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzco.zzbl().zzg(zzcgVar2);
        }
    }

    /* renamed from: d */
    public static Object m48164d(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: e */
    public static zzcg m48163e(Class cls) {
        zzcg<?, ?> zzcgVar = zzjr.get(cls);
        if (zzcgVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzcgVar = zzjr.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzcgVar == null) {
            String name = cls.getName();
            throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
        }
        return zzcgVar;
    }

    public static <ContainingType extends zzdo, Type> zzf<ContainingType, Type> zza(ContainingType containingtype, Type type, zzdo zzdoVar, zzck<?> zzckVar, int i, zzfl zzflVar, Class cls) {
        return new zzf<>(containingtype, type, zzdoVar, new C6423a(null, 66321687, zzflVar, false, false), cls);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.clearcut.zzcl, dg2] */
    public static zzcl zzaz() {
        return C19561dg2.m31799b();
    }

    public static <T extends zzcg<T, ?>> T zzb(T t, byte[] bArr) throws zzco {
        T t2 = (T) m48165c(t, bArr);
        if (t2 != null) {
            byte byteValue = ((Byte) t2.zza(zzg.zzkd, null, null)).byteValue();
            boolean z = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z = false;
                } else {
                    z = C23013xk2.m400a().m397d(t2).mo48248e(t2);
                    t2.zza(zzg.zzke, z ? t2 : null, null);
                }
            }
            if (!z) {
                throw new zzco(new zzew(t2).getMessage()).zzg(t2);
            }
        }
        return t2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Zh2, com.google.android.gms.internal.clearcut.zzcm] */
    public static zzcm zzba() {
        return C18884Zh2.m65153a();
    }

    public static <E> zzcn<E> zzbb() {
        return C17357Bk2.m68880a();
    }

    @Override // com.google.android.gms.internal.clearcut.zzas
    /* renamed from: a */
    public final void mo48167a(int i) {
        this.zzjq = i;
    }

    @Override // com.google.android.gms.internal.clearcut.zzas
    /* renamed from: b */
    public final int mo48166b() {
        return this.zzjq;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (((zzcg) zza(zzg.zzki, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return C23013xk2.m400a().m397d(this).mo48252a(this, (zzcg) obj);
        }
        return false;
    }

    public int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        int mo48250c = C23013xk2.m400a().m397d(this).mo48250c(this);
        this.zzex = mo48250c;
        return mo48250c;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdq
    public final boolean isInitialized() {
        byte byteValue = ((Byte) zza(zzg.zzkd, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo48248e = C23013xk2.m400a().m397d(this).mo48248e(this);
        zza(zzg.zzke, mo48248e ? this : null, (Object) null);
        return mo48248e;
    }

    public String toString() {
        return AbstractC6398f.m48293a(this, super.toString());
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final int zzas() {
        if (this.zzjq == -1) {
            this.zzjq = C23013xk2.m400a().m397d(this).mo48246g(this);
        }
        return this.zzjq;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final /* synthetic */ zzdp zzbc() {
        zza zzaVar = (zza) zza(zzg.zzkh, (Object) null, (Object) null);
        zzaVar.zza((zza) this);
        return zzaVar;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final /* synthetic */ zzdp zzbd() {
        return (zza) zza(zzg.zzkh, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.clearcut.zzdq
    public final /* synthetic */ zzdo zzbe() {
        return (zzcg) zza(zzg.zzki, (Object) null, (Object) null);
    }

    public static Object zza(zzdo zzdoVar, String str, Object[] objArr) {
        return new C17677Gk2(zzdoVar, str, objArr);
    }

    @Override // com.google.android.gms.internal.clearcut.zzdo
    public final void zzb(zzbn zzbnVar) throws IOException {
        C23013xk2.m400a().m399b(getClass()).mo48251b(this, C17531Ee2.m68476A(zzbnVar));
    }

    public static <T extends zzcg<?, ?>> void zza(Class<T> cls, T t) {
        zzjr.put(cls, t);
    }

    public static final <T extends zzcg<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzg.zzkd, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        return C23013xk2.m400a().m397d(t).mo48248e(t);
    }
}
