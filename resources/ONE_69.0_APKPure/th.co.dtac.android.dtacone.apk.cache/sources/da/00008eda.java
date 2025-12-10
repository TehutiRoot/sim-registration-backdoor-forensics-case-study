package com.google.android.gms.internal.firebase_ml;

import java.util.List;

/* loaded from: classes3.dex */
public final class zzaaf extends RuntimeException {
    private final List<String> zzctd;

    public zzaaf(zzys zzysVar) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.zzctd = null;
    }
}