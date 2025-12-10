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
/* renamed from: th.co.dtac.android.dtacone.viewmodel.upPass.IdCardReaderViewModel_Factory */
/* loaded from: classes9.dex */
public final class IdCardReaderViewModel_Factory implements Factory<IdCardReaderViewModel> {

    /* renamed from: a */
    public final Provider f107128a;

    /* renamed from: b */
    public final Provider f107129b;

    /* renamed from: c */
    public final Provider f107130c;

    /* renamed from: d */
    public final Provider f107131d;

    /* renamed from: e */
    public final Provider f107132e;

    public IdCardReaderViewModel_Factory(Provider<IdCardCommand> provider, Provider<CardReaderService> provider2, Provider<BitmapUtil> provider3, Provider<DrawBitmap> provider4, Provider<TemporaryCache> provider5) {
        this.f107128a = provider;
        this.f107129b = provider2;
        this.f107130c = provider3;
        this.f107131d = provider4;
        this.f107132e = provider5;
    }

    public static IdCardReaderViewModel_Factory create(Provider<IdCardCommand> provider, Provider<CardReaderService> provider2, Provider<BitmapUtil> provider3, Provider<DrawBitmap> provider4, Provider<TemporaryCache> provider5) {
        return new IdCardReaderViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static IdCardReaderViewModel newInstance(IdCardCommand idCardCommand, CardReaderService cardReaderService, BitmapUtil bitmapUtil, DrawBitmap drawBitmap, TemporaryCache temporaryCache) {
        return new IdCardReaderViewModel(idCardCommand, cardReaderService, bitmapUtil, drawBitmap, temporaryCache);
    }

    @Override // javax.inject.Provider
    public IdCardReaderViewModel get() {
        return newInstance((IdCardCommand) this.f107128a.get(), (CardReaderService) this.f107129b.get(), (BitmapUtil) this.f107130c.get(), (DrawBitmap) this.f107131d.get(), (TemporaryCache) this.f107132e.get());
    }
}