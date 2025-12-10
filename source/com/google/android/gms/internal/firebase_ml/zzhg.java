package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import org.apache.http.message.TokenParser;

/* loaded from: classes3.dex */
public class zzhg extends IOException {
    private final String content;
    private final int statusCode;
    private final transient zzgx zzadl;
    private final String zznz;

    public zzhg(zzhd zzhdVar) {
        this(new zzhf(zzhdVar));
    }

    public static StringBuilder zzc(zzhd zzhdVar) {
        StringBuilder sb = new StringBuilder();
        int statusCode = zzhdVar.getStatusCode();
        if (statusCode != 0) {
            sb.append(statusCode);
        }
        String statusMessage = zzhdVar.getStatusMessage();
        if (statusMessage != null) {
            if (statusCode != 0) {
                sb.append(TokenParser.f74560SP);
            }
            sb.append(statusMessage);
        }
        return sb;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public zzhg(zzhf zzhfVar) {
        super(zzhfVar.f45839e);
        this.statusCode = zzhfVar.f45835a;
        this.zznz = zzhfVar.f45836b;
        this.zzadl = zzhfVar.f45837c;
        this.content = zzhfVar.f45838d;
    }
}
