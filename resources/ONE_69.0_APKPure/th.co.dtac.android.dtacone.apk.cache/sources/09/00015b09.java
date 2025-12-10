package th.p047co.dtac.android.dtacone.viewmodel.upPass;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.TemporaryCache;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.cardreader.IdCardCommand;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.draw.DrawBitmap;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.IdCardReaderViewModelFactory_Factory */
/* loaded from: classes9.dex */
public final class IdCardReaderViewModelFactory_Factory implements Factory<IdCardReaderViewModelFactory> {

    /* renamed from: a */
    public final Provider f107123a;

    /* renamed from: b */
    public final Provider f107124b;

    /* renamed from: c */
    public final Provider f107125c;

    /* renamed from: d */
    public final Provider f107126d;

    /* renamed from: e */
    public final Provider f107127e;

    public IdCardReaderViewModelFactory_Factory(Provider<IdCardCommand> provider, Provider<CardReaderService> provider2, Provider<BitmapUtil> provider3, Provider<DrawBitmap> provider4, Provider<TemporaryCache> provider5) {
        this.f107123a = provider;
        this.f107124b = provider2;
        this.f107125c = provider3;
        this.f107126d = provider4;
        this.f107127e = provider5;
    }

    public static IdCardReaderViewModelFactory_Factory create(Provider<IdCardCommand> provider, Provider<CardReaderService> provider2, Provider<BitmapUtil> provider3, Provider<DrawBitmap> provider4, Provider<TemporaryCache> provider5) {
        return new IdCardReaderViewModelFactory_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static IdCardReaderViewModelFactory newInstance(IdCardCommand idCardCommand, CardReaderService cardReaderService, BitmapUtil bitmapUtil, DrawBitmap drawBitmap, TemporaryCache temporaryCache) {
        return new IdCardReaderViewModelFactory(idCardCommand, cardReaderService, bitmapUtil, drawBitmap, temporaryCache);
    }

    @Override // javax.inject.Provider
    public IdCardReaderViewModelFactory get() {
        return newInstance((IdCardCommand) this.f107123a.get(), (CardReaderService) this.f107124b.get(), (BitmapUtil) this.f107125c.get(), (DrawBitmap) this.f107126d.get(), (TemporaryCache) this.f107127e.get());
    }
}