package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;

@QualifierMetadata({"javax.inject.Named"})
@ScopeMetadata
@DaggerGenerated
/* loaded from: classes3.dex */
public final class EventStoreModule_SchemaVersionFactory implements Factory<Integer> {

    /* renamed from: com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory$a */
    /* loaded from: classes3.dex */
    public static final class C6278a {

        /* renamed from: a */
        public static final EventStoreModule_SchemaVersionFactory f44220a = new EventStoreModule_SchemaVersionFactory();
    }

    public static EventStoreModule_SchemaVersionFactory create() {
        return C6278a.f44220a;
    }

    public static int schemaVersion() {
        return EventStoreModule.m49060c();
    }

    @Override // javax.inject.Provider
    public Integer get() {
        return Integer.valueOf(schemaVersion());
    }
}