package com.google.firebase.emulators;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class EmulatedServiceSettings {

    /* renamed from: a */
    public final String f55409a;

    /* renamed from: b */
    public final int f55410b;

    public EmulatedServiceSettings(@NonNull String str, int i) {
        this.f55409a = str;
        this.f55410b = i;
    }

    public String getHost() {
        return this.f55409a;
    }

    public int getPort() {
        return this.f55410b;
    }
}
