package th.p047co.dtac.android.dtacone.manager.cardreader;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("th.co.dtac.android.dtacone.configuration.PerActivity")
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.manager.cardreader.IdCardCommand_Factory */
/* loaded from: classes7.dex */
public final class IdCardCommand_Factory implements Factory<IdCardCommand> {

    /* renamed from: th.co.dtac.android.dtacone.manager.cardreader.IdCardCommand_Factory$a */
    /* loaded from: classes7.dex */
    public static final class C14225a {

        /* renamed from: a */
        public static final IdCardCommand_Factory f84860a = new IdCardCommand_Factory();
    }

    public static IdCardCommand_Factory create() {
        return C14225a.f84860a;
    }

    public static IdCardCommand newInstance() {
        return new IdCardCommand();
    }

    @Override // javax.inject.Provider
    public IdCardCommand get() {
        return newInstance();
    }
}
