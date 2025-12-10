package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes4.dex */
public class BuildIdInfo {

    /* renamed from: a */
    public final String f54786a;

    /* renamed from: b */
    public final String f54787b;

    /* renamed from: c */
    public final String f54788c;

    public BuildIdInfo(String str, String str2, String str3) {
        this.f54786a = str;
        this.f54787b = str2;
        this.f54788c = str3;
    }

    public String getArch() {
        return this.f54787b;
    }

    public String getBuildId() {
        return this.f54788c;
    }

    public String getLibraryName() {
        return this.f54786a;
    }
}