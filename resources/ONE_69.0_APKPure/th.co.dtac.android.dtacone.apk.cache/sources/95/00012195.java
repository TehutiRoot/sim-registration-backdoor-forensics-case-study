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

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m29142d2 = {"<anonymous>", "", "it", "kotlin.jvm.PlatformType", "invoke", "(Lkotlin/Unit;)V"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nBitmapPresenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapPresenter.kt\nth/co/dtac/android/dtacone/presenter/bitmap/BitmapPresenter$saveBitmap$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,88:1\n1#2:89\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.presenter.bitmap.BitmapPresenter$saveBitmap$3 */
/* loaded from: classes8.dex */
public final class BitmapPresenter$saveBitmap$3 extends Lambda implements Function1<Unit, Unit> {
    final /* synthetic */ BitmapCollection $bitmap;
    final /* synthetic */ BitmapPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitmapPresenter$saveBitmap$3(BitmapCollection bitmapCollection, BitmapPresenter bitmapPresenter) {
        super(1);
        this.$bitmap = bitmapCollection;
        this.this$0 = bitmapPresenter;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Unit unit) {
        invoke2(unit);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Unit unit) {
        BitmapPresenter.View view;
        String name = this.$bitmap.getName();
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