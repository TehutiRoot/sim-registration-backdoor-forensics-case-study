package th.p047co.dtac.android.dtacone.view.appOne.onlineRegister.adapter;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import java.util.List;
import javax.inject.Provider;
import th.p047co.dtac.android.dtacone.model.online_register.additional_image.AdditionalImageItem;
import th.p047co.dtac.android.dtacone.util.bitmap.BitmapUtil;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* renamed from: th.co.dtac.android.dtacone.view.appOne.onlineRegister.adapter.OneAdditionalImageAdapter_Factory */
/* loaded from: classes10.dex */
public final class OneAdditionalImageAdapter_Factory implements Factory<OneAdditionalImageAdapter> {

    /* renamed from: a */
    public final Provider f92531a;

    /* renamed from: b */
    public final Provider f92532b;

    /* renamed from: c */
    public final Provider f92533c;

    /* renamed from: d */
    public final Provider f92534d;

    public OneAdditionalImageAdapter_Factory(Provider<Context> provider, Provider<BitmapUtil> provider2, Provider<List<AdditionalImageItem>> provider3, Provider<Boolean> provider4) {
        this.f92531a = provider;
        this.f92532b = provider2;
        this.f92533c = provider3;
        this.f92534d = provider4;
    }

    public static OneAdditionalImageAdapter_Factory create(Provider<Context> provider, Provider<BitmapUtil> provider2, Provider<List<AdditionalImageItem>> provider3, Provider<Boolean> provider4) {
        return new OneAdditionalImageAdapter_Factory(provider, provider2, provider3, provider4);
    }

    public static OneAdditionalImageAdapter newInstance(Context context, BitmapUtil bitmapUtil, List<AdditionalImageItem> list, boolean z) {
        return new OneAdditionalImageAdapter(context, bitmapUtil, list, z);
    }

    @Override // javax.inject.Provider
    public OneAdditionalImageAdapter get() {
        return newInstance((Context) this.f92531a.get(), (BitmapUtil) this.f92532b.get(), (List) this.f92533c.get(), ((Boolean) this.f92534d.get()).booleanValue());
    }
}