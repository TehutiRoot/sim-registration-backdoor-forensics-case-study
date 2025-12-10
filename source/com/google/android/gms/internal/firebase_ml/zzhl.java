package com.google.android.gms.internal.firebase_ml;

import ch.qos.logback.classic.spi.CallerData;
import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.text.Typography;

/* loaded from: classes3.dex */
enum zzhl {
    PLUS('+', "", ",", false, true),
    HASH('#', "#", ",", false, true),
    DOT('.', ".", ".", false, false),
    FORWARD_SLASH('/', RemoteSettings.FORWARD_SLASH_STRING, RemoteSettings.FORWARD_SLASH_STRING, false, false),
    SEMI_COLON(';', ";", ";", true, false),
    QUERY('?', CallerData.f39639NA, "&", true, false),
    AMP(Character.valueOf(Typography.amp), "&", "&", true, false),
    SIMPLE(null, "", ",", false, false);
    
    private final Character zzaes;
    private final String zzaet;
    private final String zzaeu;
    private final boolean zzaev;
    private final boolean zzaew;

    zzhl(Character ch2, String str, String str2, boolean z, boolean z2) {
        this.zzaes = ch2;
        this.zzaet = (String) zzml.checkNotNull(str);
        this.zzaeu = (String) zzml.checkNotNull(str2);
        this.zzaev = z;
        this.zzaew = z2;
        if (ch2 != null) {
            zzhm.f45846a.put(ch2, this);
        }
    }

    public final String zzak(String str) {
        if (this.zzaew) {
            return zzjw.zzas(str);
        }
        return zzjw.zzaq(str);
    }

    public final String zzgt() {
        return this.zzaet;
    }

    public final String zzgu() {
        return this.zzaeu;
    }

    public final boolean zzgv() {
        return this.zzaev;
    }

    public final int zzgw() {
        if (this.zzaes == null) {
            return 0;
        }
        return 1;
    }

    public final boolean zzgx() {
        return this.zzaew;
    }
}
