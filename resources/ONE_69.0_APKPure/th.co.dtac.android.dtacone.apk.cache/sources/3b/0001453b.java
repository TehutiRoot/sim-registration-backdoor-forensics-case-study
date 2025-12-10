package th.p047co.dtac.android.dtacone.view.appOne.tol.viewmodel;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.manager.cardreader.CardReaderService;
import th.p047co.dtac.android.dtacone.manager.cardreader.IdCardCommand;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;
import th.p047co.dtac.android.dtacone.util.bitmap.draw.DrawBitmap;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModel_Factory */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineIdCardReaderViewModel_Factory implements Factory<OneRegisterTrueOnlineIdCardReaderViewModel> {

    /* renamed from: a */
    public final Provider f98119a;

    /* renamed from: b */
    public final Provider f98120b;

    /* renamed from: c */
    public final Provider f98121c;

    /* renamed from: d */
    public final Provider f98122d;

    public OneRegisterTrueOnlineIdCardReaderViewModel_Factory(Provider<IdCardCommand> provider, Provider<CardReaderService> provider2, Provider<BitmapUtil> provider3, Provider<DrawBitmap> provider4) {
        this.f98119a = provider;
        this.f98120b = provider2;
        this.f98121c = provider3;
        this.f98122d = provider4;
    }

    public static OneRegisterTrueOnlineIdCardReaderViewModel_Factory create(Provider<IdCardCommand> provider, Provider<CardReaderService> provider2, Provider<BitmapUtil> provider3, Provider<DrawBitmap> provider4) {
        return new OneRegisterTrueOnlineIdCardReaderViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static OneRegisterTrueOnlineIdCardReaderViewModel newInstance(IdCardCommand idCardCommand, CardReaderService cardReaderService, BitmapUtil bitmapUtil, DrawBitmap drawBitmap) {
        return new OneRegisterTrueOnlineIdCardReaderViewModel(idCardCommand, cardReaderService, bitmapUtil, drawBitmap);
    }

    @Override // javax.inject.Provider
    public OneRegisterTrueOnlineIdCardReaderViewModel get() {
        return newInstance((IdCardCommand) this.f98119a.get(), (CardReaderService) this.f98120b.get(), (BitmapUtil) this.f98121c.get(), (DrawBitmap) this.f98122d.get());
    }
}