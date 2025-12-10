package th.p047co.dtac.android.dtacone.manager;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.TemporaryCache_Factory */
/* loaded from: classes7.dex */
public final class TemporaryCache_Factory implements Factory<TemporaryCache> {

    /* renamed from: th.co.dtac.android.dtacone.manager.TemporaryCache_Factory$a */
    /* loaded from: classes7.dex */
    public static final class C14224a {

        /* renamed from: a */
        public static final TemporaryCache_Factory f84806a = new TemporaryCache_Factory();
    }

    public static TemporaryCache_Factory create() {
        return C14224a.f84806a;
    }

    public static TemporaryCache newInstance() {
        return new TemporaryCache();
    }

    @Override // javax.inject.Provider
    public TemporaryCache get() {
        return newInstance();
    }
}
