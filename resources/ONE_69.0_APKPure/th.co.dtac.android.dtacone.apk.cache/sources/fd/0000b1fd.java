package com.google.firebase.perf.util;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class Clock {
    @NonNull
    public Timer getTime() {
        return new Timer();
    }
}