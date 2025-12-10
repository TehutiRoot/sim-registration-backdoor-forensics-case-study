package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

/* loaded from: classes3.dex */
public class zzxs extends IOException {
    private zzys zzcpn;

    public zzxs(String str) {
        super(str);
        this.zzcpn = null;
    }

    public static zzxs zzvq() {
        return new zzxs("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static zzxs zzvr() {
        return new zzxs("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzxs zzvs() {
        return new zzxs("Protocol message contained an invalid tag (zero).");
    }

    public static zzxv zzvt() {
        return new zzxv("Protocol message tag had invalid wire type.");
    }

    public static zzxs zzvu() {
        return new zzxs("Failed to parse the message.");
    }

    public static zzxs zzvv() {
        return new zzxs("Protocol message had invalid UTF-8.");
    }

    public final zzxs zzg(zzys zzysVar) {
        this.zzcpn = zzysVar;
        return this;
    }
}