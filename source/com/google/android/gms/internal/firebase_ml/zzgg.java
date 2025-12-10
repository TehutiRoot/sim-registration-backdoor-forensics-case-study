package com.google.android.gms.internal.firebase_ml;

import com.google.api.client.googleapis.services.AbstractGoogleClientRequest;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzgg<T> extends zzjf {

    /* renamed from: c */
    public final zzge f45771c;

    /* renamed from: d */
    public final String f45772d;

    /* renamed from: e */
    public final String f45773e;

    /* renamed from: f */
    public final zzgt f45774f;

    /* renamed from: h */
    public zzgx f45776h;

    /* renamed from: j */
    public String f45778j;

    /* renamed from: k */
    public Class f45779k;

    /* renamed from: g */
    public zzgx f45775g = new zzgx();

    /* renamed from: i */
    public int f45777i = -1;

    public zzgg(zzge zzgeVar, String str, String str2, zzgt zzgtVar, Class<T> cls) {
        Wq2 m65555a;
        this.f45779k = (Class) zzml.checkNotNull(cls);
        this.f45771c = (zzge) zzml.checkNotNull(zzgeVar);
        this.f45772d = (String) zzml.checkNotNull(str);
        this.f45773e = (String) zzml.checkNotNull(str2);
        this.f45774f = zzgtVar;
        String zzfm = zzgeVar.zzfm();
        if (zzfm != null) {
            zzgx zzgxVar = this.f45775g;
            StringBuilder sb = new StringBuilder(zzfm.length() + 23);
            sb.append(zzfm);
            sb.append(" Google-API-Java-Client");
            zzgxVar.zzad(sb.toString());
        } else {
            this.f45775g.zzad(AbstractGoogleClientRequest.USER_AGENT_SUFFIX);
        }
        zzgx zzgxVar2 = this.f45775g;
        m65555a = Wq2.m65555a();
        zzgx zzgxVar3 = (zzgx) zzgxVar2.zzb("X-Goog-Api-Client", m65555a.m65553c(zzgeVar.getClass().getSimpleName()));
    }

    public IOException zza(zzhd zzhdVar) {
        return new zzhg(zzhdVar);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzjf
    /* renamed from: zzc */
    public zzgg<T> zzb(String str, Object obj) {
        return (zzgg) super.zzb(str, obj);
    }

    public zzge zzfq() {
        return this.f45771c;
    }

    public final zzgx zzfr() {
        return this.f45775g;
    }

    public final T zzfs() throws IOException {
        zzml.checkArgument(true);
        zzml.checkArgument(true);
        zzhc zza = zzfq().zzfn().zza(this.f45772d, new zzgu(zzhm.zza(this.f45771c.zzfl(), this.f45773e, this, true)), this.f45774f);
        new zzgb().zzb(zza);
        zza.zza(zzfq().zzfo());
        if (this.f45774f == null && (this.f45772d.equals("POST") || this.f45772d.equals("PUT") || this.f45772d.equals("PATCH"))) {
            zza.zza(new zzgp());
        }
        zza.zzgg().putAll(this.f45775g);
        zza.zza(new zzgs());
        zza.zza(new C19594dr2(this, zza.zzgi(), zza));
        zzhd zzgl = zza.zzgl();
        this.f45776h = zzgl.zzgg();
        this.f45777i = zzgl.getStatusCode();
        this.f45778j = zzgl.getStatusMessage();
        return (T) zzgl.zza(this.f45779k);
    }
}
