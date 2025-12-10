package com.google.android.gms.internal.firebase_ml;

import ch.qos.logback.core.joran.action.Action;
import java.io.IOException;

/* loaded from: classes3.dex */
public class zzgk implements zzgj {

    /* renamed from: a */
    public final String f45792a;

    /* renamed from: b */
    public final String f45793b;

    public zzgk() {
        this(null);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzgj
    public void zza(zzgg<?> zzggVar) throws IOException {
        String str = this.f45792a;
        if (str != null) {
            zzggVar.put(Action.KEY_ATTRIBUTE, str);
        }
    }

    public zzgk(String str) {
        this(str, null);
    }

    public zzgk(String str, String str2) {
        this.f45792a = str;
        this.f45793b = null;
    }
}