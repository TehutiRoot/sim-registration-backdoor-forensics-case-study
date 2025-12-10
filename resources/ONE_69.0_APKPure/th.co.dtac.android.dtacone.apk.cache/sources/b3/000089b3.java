package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.DaggerGenerated;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.dagger.internal.QualifierMetadata;
import com.google.android.datatransport.runtime.dagger.internal.ScopeMetadata;
import java.util.concurrent.Executor;

@QualifierMetadata
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
/* loaded from: classes3.dex */
public final class ExecutionModule_ExecutorFactory implements Factory<Executor> {

    /* renamed from: com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory$a */
    /* loaded from: classes3.dex */
    public static final class C6251a {

        /* renamed from: a */
        public static final ExecutionModule_ExecutorFactory f44041a = new ExecutionModule_ExecutorFactory();
    }

    public static ExecutionModule_ExecutorFactory create() {
        return C6251a.f44041a;
    }

    public static Executor executor() {
        return (Executor) Preconditions.checkNotNullFromProvides(AbstractC12273mT.m26660a());
    }

    @Override // javax.inject.Provider
    public Executor get() {
        return executor();
    }
}