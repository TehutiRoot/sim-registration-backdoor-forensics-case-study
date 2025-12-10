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
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.viewmodel.OneRegisterTrueOnlineIdCardReaderViewModelFactory_Factory */
/* loaded from: classes10.dex */
public final class OneRegisterTrueOnlineIdCardReaderViewModelFactory_Factory implements Factory<OneRegisterTrueOnlineIdCardReaderViewModelFactory> {

    /* renamed from: a */
    public final Provider f98115a;

    /* renamed from: b */
    public final Provider f98116b;

    /* renamed from: c */
    public final Provider f98117c;

    /* renamed from: d */
    public final Provider f98118d;

    public OneRegisterTrueOnlineIdCardReaderViewModelFactory_Factory(Provider<IdCardCommand> provider, Provider<CardReaderService> provider2, Provider<BitmapUtil> provider3, Provider<DrawBitmap> provider4) {
        this.f98115a = provider;
        this.f98116b = provider2;
        this.f98117c = provider3;
        this.f98118d = provider4;
    }

    public static OneRegisterTrueOnlineIdCardReaderViewModelFactory_Factory create(Provider<IdCardCommand> provider, Provider<CardReaderService> provider2, Provider<BitmapUtil> provider3, Provider<DrawBitmap> provider4) {
        return new OneRegisterTrueOnlineIdCardReaderViewModelFactory_Factory(provider, provider2, provider3, provider4);
    }

    public static OneRegisterTrueOnlineIdCardReaderViewModelFactory newInstance(IdCardCommand idCardCommand, CardReaderService cardReaderService, BitmapUtil bitmapUtil, DrawBitmap drawBitmap) {
        return new OneRegisterTrueOnlineIdCardReaderViewModelFactory(idCardCommand, cardReaderService, bitmapUtil, drawBitmap);
    }

    @Override // javax.inject.Provider
    public OneRegisterTrueOnlineIdCardReaderViewModelFactory get() {
        return newInstance((IdCardCommand) this.f98115a.get(), (CardReaderService) this.f98116b.get(), (BitmapUtil) this.f98117c.get(), (DrawBitmap) this.f98118d.get());
    }
}