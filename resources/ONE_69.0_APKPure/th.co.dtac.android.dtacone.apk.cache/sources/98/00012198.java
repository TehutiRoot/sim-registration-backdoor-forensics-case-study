package th.p047co.dtac.android.dtacone.presenter.bitmap;

import com.google.android.gms.analytics.ecommerce.Promotion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import th.p047co.dtac.android.dtacone.model.bitmap.BitmapCollection;
import th.p047co.dtac.android.dtacone.presenter.bitmap.BitmapPresenter;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nBitmapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapPresenter.kt\nth/co/dtac/android/dtacone/presenter/bitmap/BitmapPresenter$saveBitmapBothOriginalAndWatermark$4\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.BitmapPresenter$saveBitmapBothOriginalAndWatermark$4 */
/* loaded from: classes8.dex */
public final class BitmapPresenter$saveBitmapBothOriginalAndWatermark$4 extends Lambda implements Function1<byte[], Unit> {
    final /* synthetic */ BitmapCollection $bitmapOriginal;
    final /* synthetic */ BitmapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapPresenter$saveBitmapBothOriginalAndWatermark$4(BitmapCollection bitmapCollection, BitmapPresenter bitmapPresenter) {
        super(1);
        this.$bitmapOriginal = bitmapCollection;
        this.this$0 = bitmapPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(byte[] bArr) {
        invoke2(bArr);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(byte[] bArr) {
        BitmapPresenter.View view;
        String name = this.$bitmapOriginal.getName();
        if (name != null) {
            view = this.this$0.f85286e;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view = null;
            }
            view.onSaveBitmapSuccess(name);
        }
    }
}