package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Module;

@Module
/* loaded from: classes3.dex */
public abstract class EventStoreModule {
    /* renamed from: a */
    public static String m49065a() {
        return "com.google.android.datatransport.events";
    }

    /* renamed from: b */
    public static String m49064b(Context context) {
        return context.getPackageName();
    }

    /* renamed from: c */
    public static int m49063c() {
        return SchemaManager.f44224d;
    }

    /* renamed from: d */
    public static AbstractC1387TS m49062d() {
        return AbstractC1387TS.f6018a;
    }
}
