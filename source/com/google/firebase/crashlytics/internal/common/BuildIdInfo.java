package com.google.firebase.crashlytics.internal.common;

/* loaded from: classes4.dex */
public class BuildIdInfo {

    /* renamed from: a */
    public final String f54774a;

    /* renamed from: b */
    public final String f54775b;

    /* renamed from: c */
    public final String f54776c;

    public BuildIdInfo(String str, String str2, String str3) {
        this.f54774a = str;
        this.f54775b = str2;
        this.f54776c = str3;
    }

    public String getArch() {
        return this.f54775b;
    }

    public String getBuildId() {
        return this.f54776c;
    }

    public String getLibraryName() {
        return this.f54774a;
    }
}
