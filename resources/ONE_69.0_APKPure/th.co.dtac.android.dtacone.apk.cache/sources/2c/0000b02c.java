package com.google.firebase.emulators;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class EmulatedServiceSettings {

    /* renamed from: a */
    public final String f55421a;

    /* renamed from: b */
    public final int f55422b;

    public EmulatedServiceSettings(@NonNull String str, int i) {
        this.f55421a = str;
        this.f55422b = i;
    }

    public String getHost() {
        return this.f55421a;
    }

    public int getPort() {
        return this.f55422b;
    }
}