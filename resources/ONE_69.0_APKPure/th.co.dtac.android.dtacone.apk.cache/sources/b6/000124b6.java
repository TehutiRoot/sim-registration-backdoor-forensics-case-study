package th.p047co.dtac.android.dtacone.presenter.rectify;

import com.google.android.gms.analytics.ecommerce.Promotion;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.presenter.rectify.RectifyListPresenterKt;

@Metadata(m29143d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, m29142d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "", "kotlin.jvm.PlatformType", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.rectify.RectifyListPresenterKt$getRectifyList$8 */
/* loaded from: classes8.dex */
public final class RectifyListPresenterKt$getRectifyList$8 extends Lambda implements Function1<ArrayList<Object>, Unit> {
    final /* synthetic */ String $customerPhoneNumber;
    final /* synthetic */ RectifyListPresenterKt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectifyListPresenterKt$getRectifyList$8(RectifyListPresenterKt rectifyListPresenterKt, String str) {
        super(1);
        this.this$0 = rectifyListPresenterKt;
        this.$customerPhoneNumber = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ArrayList<Object> arrayList) {
        invoke2(arrayList);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(ArrayList<Object> it) {
        RectifyListPresenterKt.View view;
        RectifyListPresenterKt.View view2;
        RectifyListPresenterKt.View view3 = null;
        if (it.size() == 0) {
            view2 = this.this$0.f86294e;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
                view2 = null;
            }
            view2.displayRectifyEmpty(this.$customerPhoneNumber, "ไม่พบรายการ", null);
            return;
        }
        view = this.this$0.f86294e;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException(Promotion.ACTION_VIEW);
        } else {
            view3 = view;
        }
        String str = this.$customerPhoneNumber;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        view3.displayRectifyList(str, it);
    }
}