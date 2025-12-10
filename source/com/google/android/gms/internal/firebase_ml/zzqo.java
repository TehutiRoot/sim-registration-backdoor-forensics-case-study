package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import androidx.core.p005os.ConfigurationCompat;
import androidx.core.p005os.LocaleListCompat;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zznq;
import com.google.android.gms.internal.firebase_ml.zzoe;
import com.google.android.gms.internal.firebase_ml.zzqo;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.Dependency;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class zzqo {

    /* renamed from: n */
    public static List f45970n;

    /* renamed from: a */
    public final String f45973a;

    /* renamed from: b */
    public final String f45974b;

    /* renamed from: c */
    public final String f45975c;

    /* renamed from: d */
    public final String f45976d;

    /* renamed from: e */
    public final String f45977e;

    /* renamed from: f */
    public final zzb f45978f;

    /* renamed from: g */
    public final zzrc f45979g;

    /* renamed from: h */
    public final Task f45980h;

    /* renamed from: i */
    public final Task f45981i;

    /* renamed from: j */
    public final Map f45982j;

    /* renamed from: k */
    public final Map f45983k;

    /* renamed from: l */
    public final int f45984l;

    /* renamed from: m */
    public static final GmsLogger f45969m = new GmsLogger("MlStatsLogger", "");

    /* renamed from: o */
    public static boolean f45971o = false;

    /* renamed from: p */
    public static boolean f45972p = false;
    public static final Component<?> zzbmk = Component.builder(zza.class).add(Dependency.required(zzqn.class)).add(Dependency.required(Context.class)).add(Dependency.required(zzrc.class)).add(Dependency.required(zzb.class)).factory(ZI2.f8012a).build();

    /* loaded from: classes3.dex */
    public static class zza extends zzqa<Integer, zzqo> {

        /* renamed from: b */
        public final zzqn f45985b;

        /* renamed from: c */
        public final Context f45986c;

        /* renamed from: d */
        public final zzrc f45987d;

        /* renamed from: e */
        public final zzb f45988e;

        public zza(zzqn zzqnVar, Context context, zzrc zzrcVar, zzb zzbVar) {
            this.f45985b = zzqnVar;
            this.f45986c = context;
            this.f45987d = zzrcVar;
            this.f45988e = zzbVar;
        }

        @Override // com.google.android.gms.internal.firebase_ml.zzqa
        public final /* synthetic */ zzqo create(Integer num) {
            return new zzqo(this.f45985b, this.f45986c, this.f45987d, this.f45988e, num.intValue());
        }
    }

    /* loaded from: classes3.dex */
    public interface zzb {
        void zza(zznq.zzad zzadVar);
    }

    public zzqo(zzqn zzqnVar, Context context, zzrc zzrcVar, zzb zzbVar, int i) {
        String projectId;
        String gcmSenderId;
        String apiKey;
        this.f45982j = new HashMap();
        this.f45983k = new HashMap();
        this.f45984l = i;
        FirebaseApp zzos = zzqnVar.zzos();
        String str = "";
        this.f45975c = (zzos == null || (projectId = zzos.getOptions().getProjectId()) == null) ? "" : projectId;
        FirebaseApp zzos2 = zzqnVar.zzos();
        this.f45976d = (zzos2 == null || (gcmSenderId = zzos2.getOptions().getGcmSenderId()) == null) ? "" : gcmSenderId;
        FirebaseApp zzos3 = zzqnVar.zzos();
        if (zzos3 != null && (apiKey = zzos3.getOptions().getApiKey()) != null) {
            str = apiKey;
        }
        this.f45977e = str;
        this.f45973a = context.getPackageName();
        this.f45974b = zzqb.zzb(context);
        this.f45979g = zzrcVar;
        this.f45978f = zzbVar;
        this.f45980h = zzqf.zzoq().zza(YI2.f7739a);
        zzqf zzoq = zzqf.zzoq();
        zzrcVar.getClass();
        this.f45981i = zzoq.zza(XI2.m65525a(zzrcVar));
    }

    /* renamed from: b */
    public static final /* synthetic */ zza m47508b(ComponentContainer componentContainer) {
        return new zza((zzqn) componentContainer.get(zzqn.class), (Context) componentContainer.get(Context.class), (zzrc) componentContainer.get(zzrc.class), (zzb) componentContainer.get(zzb.class));
    }

    /* renamed from: d */
    public static synchronized List m47506d() {
        synchronized (zzqo.class) {
            try {
                List list = f45970n;
                if (list != null) {
                    return list;
                }
                LocaleListCompat locales = ConfigurationCompat.getLocales(Resources.getSystem().getConfiguration());
                f45970n = new ArrayList(locales.size());
                for (int i = 0; i < locales.size(); i++) {
                    f45970n.add(zzqb.m47516a(locales.get(i)));
                }
                return f45970n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static zzqo zza(@NonNull zzqn zzqnVar, int i) {
        Preconditions.checkNotNull(zzqnVar);
        return ((zza) zzqnVar.get(zza.class)).get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public final /* synthetic */ void m47509a(zznq.zzad.zza zzaVar, zzoe zzoeVar) {
        String version;
        if (!m47507c()) {
            f45969m.m48408d("MlStatsLogger", "Logging is disabled.");
            return;
        }
        String zzoi = zzaVar.zzmf().zzoi();
        zznq.zzbh.zza zzx = zznq.zzbh.zzoj().zzbp(this.f45973a).zzbq(this.f45974b).zzbr(this.f45975c).zzbu(this.f45976d).zzbv(this.f45977e).zzbt(("NA".equals(zzoi) || "".equals(zzoi)) ? "NA" : "NA").zzx(m47506d());
        if (this.f45980h.isSuccessful()) {
            version = (String) this.f45980h.getResult();
        } else {
            version = zzqd.zzoo().getVersion("firebase-ml-common");
        }
        zzaVar.zzb(zzoeVar).zza(zzx.zzbs(version));
        try {
            this.f45978f.zza((zznq.zzad) ((zzxh) zzaVar.zzvn()));
        } catch (RuntimeException e) {
            f45969m.m48405e("MlStatsLogger", "Exception thrown from the logging side", e);
        }
    }

    /* renamed from: c */
    public final boolean m47507c() {
        int i = this.f45984l;
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4 || i == 5) {
                    return true;
                }
                return false;
            }
            return this.f45979g.zzpb();
        }
        return this.f45979g.zzpa();
    }

    public final void zza(@NonNull final zznq.zzad.zza zzaVar, @NonNull final zzoe zzoeVar) {
        zzqf.zzop().execute(new Runnable(this, zzaVar, zzoeVar) { // from class: aJ2

            /* renamed from: a */
            public final zzqo f8296a;

            /* renamed from: b */
            public final zznq.zzad.zza f8297b;

            /* renamed from: c */
            public final zzoe f8298c;

            {
                this.f8296a = this;
                this.f8297b = zzaVar;
                this.f8298c = zzoeVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8296a.m47509a(this.f8297b, this.f8298c);
            }
        });
    }

    @WorkerThread
    public final void zza(@NonNull zzqw zzqwVar, @NonNull zzoe zzoeVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (m47507c()) {
            if (this.f45982j.get(zzoeVar) != null && elapsedRealtime - ((Long) this.f45982j.get(zzoeVar)).longValue() <= TimeUnit.SECONDS.toMillis(30L)) {
                return;
            }
            this.f45982j.put(zzoeVar, Long.valueOf(elapsedRealtime));
            zza(zzqwVar.zzov(), zzoeVar);
        }
    }

    @WorkerThread
    public final <K> void zza(@NonNull K k, long j, @NonNull zzoe zzoeVar, @NonNull zzqu<K> zzquVar) {
        m47507c();
    }
}
