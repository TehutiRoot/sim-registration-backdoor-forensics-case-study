package th.p047co.dtac.android.dtacone.manager.locale;

import com.squareup.sqlbrite.BriteDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* renamed from: th.co.dtac.android.dtacone.manager.locale.MessageRepository_Factory */
/* loaded from: classes7.dex */
public final class MessageRepository_Factory implements Factory<MessageRepository> {

    /* renamed from: a */
    public final Provider f84956a;

    public MessageRepository_Factory(Provider<BriteDatabase> provider) {
        this.f84956a = provider;
    }

    public static MessageRepository_Factory create(Provider<BriteDatabase> provider) {
        return new MessageRepository_Factory(provider);
    }

    public static MessageRepository newInstance(BriteDatabase briteDatabase) {
        return new MessageRepository(briteDatabase);
    }

    @Override // javax.inject.Provider
    public MessageRepository get() {
        return newInstance((BriteDatabase) this.f84956a.get());
    }
}
