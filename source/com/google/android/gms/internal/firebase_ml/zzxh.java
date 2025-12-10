package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzxh;
import com.google.android.gms.internal.firebase_ml.zzxh.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class zzxh<MessageType extends zzxh<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzvt<MessageType, BuilderType> {
    private static Map<Object, zzxh<?, ?>> zzcoo = new ConcurrentHashMap();
    protected zzaah zzcom = zzaah.zzxl();
    private int zzcon = -1;

    /* loaded from: classes3.dex */
    public static class zza<T extends zzxh<T, ?>> extends zzvu<T> {

        /* renamed from: b */
        public final zzxh f46107b;

        public zza(T t) {
            this.f46107b = t;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType extends zzd<MessageType, BuilderType>> extends zzxh<MessageType, BuilderType> implements zzyu {
        protected OK2 zzcot = OK2.m67077r();

        /* renamed from: f */
        public final OK2 m47424f() {
            if (this.zzcot.m67093b()) {
                this.zzcot = (OK2) this.zzcot.clone();
            }
            return this.zzcot;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class zzd<MessageType extends zzc<MessageType, BuilderType>, BuilderType extends zzd<MessageType, BuilderType>> extends zzb<MessageType, BuilderType> implements zzyu {
        public zzd(MessageType messagetype) {
            super(messagetype);
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh.zzb
        public void zzvj() {
            super.zzvj();
            MessageType messagetype = this.zzcor;
            ((zzc) messagetype).zzcot = (OK2) ((zzc) messagetype).zzcot.clone();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh.zzb
        public /* synthetic */ zzxh zzvk() {
            return (zzc) zzvm();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzxh.zzb, com.google.android.gms.internal.firebase_ml.zzyv
        public /* synthetic */ zzys zzvm() {
            if (this.zzcos) {
                return (zzc) this.zzcor;
            }
            ((zzc) this.zzcor).zzcot.m67078q();
            return (zzc) super.zzvm();
        }
    }

    /* loaded from: classes3.dex */
    public static class zze<ContainingType extends zzys, Type> extends zzwu<ContainingType, Type> {
    }

    /* loaded from: classes3.dex */
    public enum zzg {
        public static final int zzcow = 1;
        public static final int zzcox = 2;
        public static final int zzcoy = 3;
        public static final int zzcoz = 4;
        public static final int zzcpa = 5;
        public static final int zzcpb = 6;
        public static final int zzcpc = 7;

        /* renamed from: a */
        public static final /* synthetic */ int[] f46109a = {1, 2, 3, 4, 5, 6, 7};
        public static final int zzcpe = 1;
        public static final int zzcpf = 2;

        /* renamed from: b */
        public static final /* synthetic */ int[] f46110b = {1, 2};
        public static final int zzcph = 1;
        public static final int zzcpi = 2;

        /* renamed from: c */
        public static final /* synthetic */ int[] f46111c = {1, 2};

        /* renamed from: values$50KLMJ33DTMIUPRFDTJMOP9FE1P6UT3FC9QMCBQ7CLN6ASJ1EHIM8JB5EDPM2PR59HKN8P949LIN8Q3FCHA6UIBEEPNMMP9R0 */
        public static int[] m47423x126d66cb() {
            return (int[]) f46109a.clone();
        }
    }

    /* renamed from: c */
    public static zzxh m47428c(zzxh zzxhVar, byte[] bArr, int i, int i2, zzww zzwwVar) {
        zzxh zzxhVar2 = (zzxh) zzxhVar.zza(zzg.zzcoz, (Object) null, (Object) null);
        try {
            OL2 m67397a = ML2.m67395c().m67397a(zzxhVar2);
            m67397a.mo48002e(zzxhVar2, bArr, 0, i2, new C22261tK2(zzwwVar));
            m67397a.mo48000g(zzxhVar2);
            if (zzxhVar2.zzckg == 0) {
                return zzxhVar2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzxs) {
                throw ((zzxs) e.getCause());
            }
            throw new zzxs(e.getMessage()).zzg(zzxhVar2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzxs.zzvq().zzg(zzxhVar2);
        }
    }

    /* renamed from: d */
    public static Object m47427d(Method method, Object obj, Object... objArr) {
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

    /* renamed from: e */
    public static zzxh m47426e(Class cls) {
        zzxh<?, ?> zzxhVar = zzcoo.get(cls);
        if (zzxhVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzxhVar = zzcoo.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzxhVar == null) {
            zzxhVar = (zzxh) ((zzxh) AbstractC17455Da2.m68615v(cls)).zza(zzg.zzcpb, (Object) null, (Object) null);
            if (zzxhVar != null) {
                zzcoo.put(cls, zzxhVar);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzxhVar;
    }

    public static <T extends zzxh<?, ?>> void zza(Class<T> cls, T t) {
        zzcoo.put(cls, t);
    }

    public static zzxo zzvb() {
        return ZK2.m65241c();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mL2, com.google.android.gms.internal.firebase_ml.zzxq] */
    public static zzxq zzvc() {
        return C21060mL2.m26261d();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.firebase_ml.zzxp, XK2] */
    public static zzxp zzvd() {
        return XK2.m65511d();
    }

    public static <E> zzxt<E> zzve() {
        return LL2.m67523c();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvt
    /* renamed from: a */
    public final void mo47430a(int i) {
        this.zzcon = i;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvt
    /* renamed from: b */
    public final int mo47429b() {
        return this.zzcon;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ML2.m67395c().m67397a(this).mo48006a(this, (zzxh) obj);
    }

    public int hashCode() {
        int i = this.zzckg;
        if (i != 0) {
            return i;
        }
        int mo48004c = ML2.m67395c().m67397a(this).mo48004c(this);
        this.zzckg = mo48004c;
        return mo48004c;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzyu
    public final boolean isInitialized() {
        return zza(this, true);
    }

    public String toString() {
        return AbstractC6439H0.m48010a(this, super.toString());
    }

    public abstract Object zza(int i, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.firebase_ml.zzys
    public final void zzb(zzwq zzwqVar) throws IOException {
        ML2.m67395c().m67397a(this).mo48001f(this, LK2.m67531h(zzwqVar));
    }

    public final <MessageType extends zzxh<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzuz() {
        return (BuilderType) zza(zzg.zzcpa, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzys
    public final int zzva() {
        if (this.zzcon == -1) {
            this.zzcon = ML2.m67395c().m67397a(this).mo48005b(this);
        }
        return this.zzcon;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzys
    public final /* synthetic */ zzyv zzvf() {
        zzb zzbVar = (zzb) zza(zzg.zzcpa, (Object) null, (Object) null);
        zzbVar.zza((zzb) this);
        return zzbVar;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzys
    public final /* synthetic */ zzyv zzvg() {
        return (zzb) zza(zzg.zzcpa, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzyu
    public final /* synthetic */ zzys zzvh() {
        return (zzxh) zza(zzg.zzcpb, (Object) null, (Object) null);
    }

    public static Object zza(zzys zzysVar, String str, Object[] objArr) {
        return new NL2(zzysVar, str, objArr);
    }

    public static final <T extends zzxh<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zzg.zzcow, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo48003d = ML2.m67395c().m67397a(t).mo48003d(t);
        if (z) {
            t.zza(zzg.zzcox, mo48003d ? t : null, null);
        }
        return mo48003d;
    }

    /* loaded from: classes3.dex */
    public static abstract class zzb<MessageType extends zzxh<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzvs<MessageType, BuilderType> {

        /* renamed from: a */
        public final zzxh f46108a;
        protected MessageType zzcor;
        protected boolean zzcos = false;

        public zzb(MessageType messagetype) {
            this.f46108a = messagetype;
            this.zzcor = (MessageType) messagetype.zza(zzg.zzcoz, null, null);
        }

        /* renamed from: a */
        public static void m47425a(zzxh zzxhVar, zzxh zzxhVar2) {
            ML2.m67395c().m67397a(zzxhVar).mo47999h(zzxhVar, zzxhVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.firebase_ml.zzvs
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.f46108a.zza(zzg.zzcpa, (Object) null, (Object) null);
            zzbVar.zza((zzb) ((zzxh) zzvm()));
            return zzbVar;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzyu
        public final boolean isInitialized() {
            return zzxh.zza(this.zzcor, false);
        }

        public final BuilderType zza(MessageType messagetype) {
            if (this.zzcos) {
                zzvj();
                this.zzcos = false;
            }
            m47425a(this.zzcor, messagetype);
            return this;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzvs
        public final /* synthetic */ zzvs zztr() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzyu
        public final /* synthetic */ zzys zzvh() {
            return this.f46108a;
        }

        public void zzvj() {
            MessageType messagetype = (MessageType) this.zzcor.zza(zzg.zzcoz, null, null);
            m47425a(messagetype, this.zzcor);
            this.zzcor = messagetype;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzyv
        /* renamed from: zzvk */
        public MessageType zzvm() {
            if (this.zzcos) {
                return this.zzcor;
            }
            MessageType messagetype = this.zzcor;
            ML2.m67395c().m67397a(messagetype).mo48000g(messagetype);
            this.zzcos = true;
            return this.zzcor;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzyv
        /* renamed from: zzvl */
        public final MessageType zzvn() {
            MessageType messagetype = (MessageType) zzvm();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzaaf(messagetype);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.firebase_ml.zzvs
        public final /* synthetic */ zzvs zza(zzvt zzvtVar) {
            return zza((zzb<MessageType, BuilderType>) ((zzxh) zzvtVar));
        }
    }

    public static zzxo zza(zzxo zzxoVar) {
        int size = zzxoVar.size();
        return zzxoVar.zzdw(size == 0 ? 10 : size << 1);
    }

    public static <E> zzxt<E> zza(zzxt<E> zzxtVar) {
        int size = zzxtVar.size();
        return zzxtVar.zzda(size == 0 ? 10 : size << 1);
    }

    public static <T extends zzxh<T, ?>> T zza(T t, byte[] bArr, zzww zzwwVar) throws zzxs {
        T t2 = (T) m47428c(t, bArr, 0, bArr.length, zzwwVar);
        if (t2 == null || t2.isInitialized()) {
            return t2;
        }
        throw new zzxs(new zzaaf(t2).getMessage()).zzg(t2);
    }
}
