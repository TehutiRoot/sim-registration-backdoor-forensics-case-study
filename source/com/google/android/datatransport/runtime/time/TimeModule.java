package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.Module;

@Module
/* loaded from: classes3.dex */
public abstract class TimeModule {
    /* renamed from: a */
    public static Clock m48967a() {
        return new WallTimeClock();
    }

    /* renamed from: b */
    public static Clock m48966b() {
        return new UptimeClock();
    }
}
