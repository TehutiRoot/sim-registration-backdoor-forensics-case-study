package com.google.android.gms.internal.firebase_ml;

import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class zzge {

    /* renamed from: j */
    public static final Logger f45753j = Logger.getLogger(zzge.class.getName());

    /* renamed from: a */
    public final zzhb f45754a;

    /* renamed from: b */
    public final zzgj f45755b;

    /* renamed from: c */
    public final String f45756c;

    /* renamed from: d */
    public final String f45757d;

    /* renamed from: e */
    public final String f45758e;

    /* renamed from: f */
    public final String f45759f;

    /* renamed from: g */
    public final zzjm f45760g;

    /* renamed from: h */
    public final boolean f45761h;

    /* renamed from: i */
    public final boolean f45762i;

    /* loaded from: classes3.dex */
    public static abstract class zza {

        /* renamed from: a */
        public final zzhh f45763a;

        /* renamed from: b */
        public zzgj f45764b;

        /* renamed from: c */
        public zzhe f45765c;

        /* renamed from: d */
        public final zzjm f45766d;

        /* renamed from: e */
        public String f45767e;

        /* renamed from: f */
        public String f45768f;

        /* renamed from: g */
        public String f45769g;

        /* renamed from: h */
        public String f45770h;

        public zza(zzhh zzhhVar, String str, String str2, zzjm zzjmVar, zzhe zzheVar) {
            this.f45763a = (zzhh) zzml.checkNotNull(zzhhVar);
            this.f45766d = zzjmVar;
            zzj(str);
            zzk(str2);
            this.f45765c = zzheVar;
        }

        public zza zza(zzgj zzgjVar) {
            this.f45764b = zzgjVar;
            return this;
        }

        public zza zzj(String str) {
            this.f45767e = zzge.m47923a(str);
            return this;
        }

        public zza zzk(String str) {
            this.f45768f = zzge.m47922b(str);
            return this;
        }

        public zza zzl(String str) {
            this.f45769g = str;
            return this;
        }

        public zza zzm(String str) {
            this.f45770h = str;
            return this;
        }
    }

    public zzge(zza zzaVar) {
        zzhb zza2;
        this.f45755b = zzaVar.f45764b;
        this.f45756c = m47923a(zzaVar.f45767e);
        this.f45757d = m47922b(zzaVar.f45768f);
        this.f45758e = zzaVar.f45769g;
        if (zzmt.zzbc(zzaVar.f45770h)) {
            f45753j.logp(Level.WARNING, "com.google.api.client.googleapis.services.AbstractGoogleClient", "<init>", "Application name is not set. Call Builder#setApplicationName.");
        }
        this.f45759f = zzaVar.f45770h;
        zzhe zzheVar = zzaVar.f45765c;
        if (zzheVar == null) {
            zza2 = zzaVar.f45763a.zza(null);
        } else {
            zza2 = zzaVar.f45763a.zza(zzheVar);
        }
        this.f45754a = zza2;
        this.f45760g = zzaVar.f45766d;
        this.f45761h = false;
        this.f45762i = false;
    }

    /* renamed from: a */
    public static String m47923a(String str) {
        zzml.checkNotNull(str, "root URL cannot be null.");
        if (!str.endsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return str.concat(RemoteSettings.FORWARD_SLASH_STRING);
        }
        return str;
    }

    /* renamed from: b */
    public static String m47922b(String str) {
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
        zzgj zzgjVar = this.f45755b;
        if (zzgjVar != null) {
            zzgjVar.zza(zzggVar);
        }
    }

    public final String zzfl() {
        String valueOf = String.valueOf(this.f45756c);
        String valueOf2 = String.valueOf(this.f45757d);
        if (valueOf2.length() != 0) {
            return valueOf.concat(valueOf2);
        }
        return new String(valueOf);
    }

    public final String zzfm() {
        return this.f45759f;
    }

    public final zzhb zzfn() {
        return this.f45754a;
    }

    public zzjm zzfo() {
        return this.f45760g;
    }
}
