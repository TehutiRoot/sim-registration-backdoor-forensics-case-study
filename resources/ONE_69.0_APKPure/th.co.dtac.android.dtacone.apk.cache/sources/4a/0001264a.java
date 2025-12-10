package th.p047co.dtac.android.dtacone.p051rx;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.rx.RxBitmap_Factory */
/* loaded from: classes8.dex */
public final class RxBitmap_Factory implements Factory<RxBitmap> {

    /* renamed from: a */
    public final Provider f86990a;

    public RxBitmap_Factory(Provider<BitmapUtil> provider) {
        this.f86990a = provider;
    }

    public static RxBitmap_Factory create(Provider<BitmapUtil> provider) {
        return new RxBitmap_Factory(provider);
    }

    public static RxBitmap newInstance(BitmapUtil bitmapUtil) {
        return new RxBitmap(bitmapUtil);
    }

    @Override // javax.inject.Provider
    public RxBitmap get() {
        return newInstance((BitmapUtil) this.f86990a.get());
    }
}