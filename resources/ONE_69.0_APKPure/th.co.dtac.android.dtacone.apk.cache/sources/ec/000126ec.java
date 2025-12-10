package th.p047co.dtac.android.dtacone.util.bitmap.draw;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.util.bitmap.draw.DrawBitmap_Factory */
/* loaded from: classes8.dex */
public final class DrawBitmap_Factory implements Factory<DrawBitmap> {

    /* renamed from: a */
    public final Provider f87120a;

    /* renamed from: b */
    public final Provider f87121b;

    public DrawBitmap_Factory(Provider<Application> provider, Provider<BitmapUtil> provider2) {
        this.f87120a = provider;
        this.f87121b = provider2;
    }

    public static DrawBitmap_Factory create(Provider<Application> provider, Provider<BitmapUtil> provider2) {
        return new DrawBitmap_Factory(provider, provider2);
    }

    public static DrawBitmap newInstance(Application application, BitmapUtil bitmapUtil) {
        return new DrawBitmap(application, bitmapUtil);
    }

    @Override // javax.inject.Provider
    public DrawBitmap get() {
        return newInstance((Application) this.f87120a.get(), (BitmapUtil) this.f87121b.get());
    }
}