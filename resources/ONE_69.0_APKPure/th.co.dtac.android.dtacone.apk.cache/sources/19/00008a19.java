package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Module;

@Module
/* loaded from: classes3.dex */
public abstract class EventStoreModule {
    /* renamed from: a */
    public static String m49062a() {
        return "com.google.android.datatransport.events";
    }

    /* renamed from: b */
    public static String m49061b(Context context) {
        return context.getPackageName();
    }

    /* renamed from: c */
    public static int m49060c() {
        return SchemaManager.f44236d;
    }

    /* renamed from: d */
    public static AbstractC1667XS m49059d() {
        return AbstractC1667XS.f7559a;
    }
}