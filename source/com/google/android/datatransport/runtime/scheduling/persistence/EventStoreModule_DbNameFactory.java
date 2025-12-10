package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes3.dex */
public final class EventStoreModule_DbNameFactory implements Factory<String> {

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory$a */
    /* loaded from: classes3.dex */
    public static final class C6288a {

        /* renamed from: a */
        public static final EventStoreModule_DbNameFactory f44206a = new EventStoreModule_DbNameFactory();
    }

    public static EventStoreModule_DbNameFactory create() {
        return C6288a.f44206a;
    }

    public static String dbName() {
        return (String) Preconditions.checkNotNullFromProvides(EventStoreModule.m49065a());
    }

    @Override // javax.inject.Provider
    public String get() {
        return dbName();
    }
}
