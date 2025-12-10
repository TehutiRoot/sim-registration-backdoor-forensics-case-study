package com.google.android.gms.internal.firebase_ml;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class zzge {

    /* renamed from: j */
    public static final Logger f45765j = Logger.getLogger(zzge.class.getName());

    /* renamed from: a */
    public final zzhb f45766a;

    /* renamed from: b */
    public final zzgj f45767b;

    /* renamed from: c */
    public final String f45768c;

    /* renamed from: d */
    public final String f45769d;

    /* renamed from: e */
    public final String f45770e;

    /* renamed from: f */
    public final String f45771f;

    /* renamed from: g */
    public final zzjm f45772g;

    /* renamed from: h */
    public final boolean f45773h;

    /* renamed from: i */
    public final boolean f45774i;

    /* loaded from: classes3.dex */
    public static abstract class zza {

        /* renamed from: a */
        public final zzhh f45775a;

        /* renamed from: b */
        public zzgj f45776b;

        /* renamed from: c */
        public zzhe f45777c;

        /* renamed from: d */
        public final zzjm f45778d;

        /* renamed from: e */
        public String f45779e;

        /* renamed from: f */
        public String f45780f;

        /* renamed from: g */
        public String f45781g;

        /* renamed from: h */
        public String f45782h;

        public zza(zzhh zzhhVar, String str, String str2, zzjm zzjmVar, zzhe zzheVar) {
            this.f45775a = (zzhh) zzml.checkNotNull(zzhhVar);
            this.f45778d = zzjmVar;
            zzj(str);
            zzk(str2);
            this.f45777c = zzheVar;
        }

        public zza zza(zzgj zzgjVar) {
            this.f45776b = zzgjVar;
            return this;
        }

        public zza zzj(String str) {
            this.f45779e = zzge.m47932a(str);
            return this;
        }

        public zza zzk(String str) {
            this.f45780f = zzge.m47931b(str);
            return this;
        }

        public zza zzl(String str) {
            this.f45781g = str;
            return this;
        }

        public zza zzm(String str) {
            this.f45782h = str;
            return this;
        }
    }

    public zzge(zza zzaVar) {
        zzhb zza2;
        this.f45767b = zzaVar.f45776b;
        this.f45768c = m47932a(zzaVar.f45779e);
        this.f45769d = m47931b(zzaVar.f45780f);
        this.f45770e = zzaVar.f45781g;
        if (zzmt.zzbc(zzaVar.f45782h)) {
            f45765j.logp(Level.WARNING, "com.google.api.client.googleapis.services.AbstractGoogleClient", "<init>", "Application name is not set. Call Builder#setApplicationName.");
        }
        this.f45771f = zzaVar.f45782h;
        zzhe zzheVar = zzaVar.f45777c;
        if (zzheVar == null) {
            zza2 = zzaVar.f45775a.zza(null);
        } else {
            zza2 = zzaVar.f45775a.zza(zzheVar);
        }
        this.f45766a = zza2;
        this.f45772g = zzaVar.f45778d;
        this.f45773h = false;
        this.f45774i = false;
    }

    /* renamed from: a */
    public static String m47932a(String str) {
        zzml.checkNotNull(str, "root URL cannot be null.");
        if (!str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return str.concat(RemoteSettings.FORWARD_SLASH_STRING);
        }
        return str;
    }

    /* renamed from: b */
    public static String m47931b(String str) {
        zzml.checkNotNull(str, "service path cannot be null");
        if (str.length() == 1) {
            zzml.checkArgument(RemoteSettings.FORWARD_SLASH_STRING.equals(str), "service path must equal \"/\" if it is of length 1.");
            return "";
        } else if (str.length() > 0) {
            if (!str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str.concat(RemoteSettings.FORWARD_SLASH_STRING);
            }
            if (str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                return str.substring(1);
            }
            return str;
        } else {
            return str;
        }
    }

    public void zza(zzgg<?> zzggVar) throws IOException {
        zzgj zzgjVar = this.f45767b;
        if (zzgjVar != null) {
            zzgjVar.zza(zzggVar);
        }
    }

    public final String zzfl() {
        String valueOf = String.valueOf(this.f45768c);
        String valueOf2 = String.valueOf(this.f45769d);
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    public final String zzfm() {
        return this.f45771f;
    }

    public final zzhb zzfn() {
        return this.f45766a;
    }

    public zzjm zzfo() {
        return this.f45772g;
    }
}