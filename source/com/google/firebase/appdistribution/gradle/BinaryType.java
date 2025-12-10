package com.google.firebase.appdistribution.gradle;

import javax.annotation.Nullable;

/* loaded from: classes4.dex */
public enum BinaryType {
    APK,
    AAB,
    UNKNOWN;

    public static BinaryType fromPath(@Nullable String str) {
        if (str == null) {
            return UNKNOWN;
        }
        if (str.endsWith(".aab")) {
            return AAB;
        }
        return APK;
    }
}
