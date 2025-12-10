package th.p047co.dtac.android.dtacone.manager.cardreader;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("th.co.dtac.android.dtacone.configuration.PerActivity")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.SimCardCommand_Factory */
/* loaded from: classes7.dex */
public final class SimCardCommand_Factory implements Factory<SimCardCommand> {

    /* renamed from: th.co.dtac.android.dtacone.manager.cardreader.SimCardCommand_Factory$a */
    /* loaded from: classes7.dex */
    public static final class C14226a {

        /* renamed from: a */
        public static final SimCardCommand_Factory f84878a = new SimCardCommand_Factory();
    }

    public static SimCardCommand_Factory create() {
        return C14226a.f84878a;
    }

    public static SimCardCommand newInstance() {
        return new SimCardCommand();
    }

    @Override // javax.inject.Provider
    public SimCardCommand get() {
        return newInstance();
    }
}
