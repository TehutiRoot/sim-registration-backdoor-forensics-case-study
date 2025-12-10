package th.p047co.dtac.android.dtacone.presenter.rectify;

import androidx.autofill.HintConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p046rx.Observable;
import th.p047co.dtac.android.dtacone.model.rectify.RectifyListCollection;

@Metadata(m29143d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001ab\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002 \u0004*0\u0012*\b\u0001\u0012&\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003 \u0004*\u0012\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00030\u0003\u0018\u00010\u00050\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0006\u001a\n \u0004*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0002\b\b"}, m29142d2 = {"<anonymous>", "Lrx/Observable;", "", "Lth/co/dtac/android/dtacone/model/rectify/RectifyListCollection;", "kotlin.jvm.PlatformType", "", HintConstants.AUTOFILL_HINT_PHONE, "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.rectify.RectifyListPresenterKt$getRectifyList$3 */
/* loaded from: classes8.dex */
public final class RectifyListPresenterKt$getRectifyList$3 extends Lambda implements Function1<String, Observable<? extends List<RectifyListCollection>>> {
    final /* synthetic */ RectifyListPresenterKt this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RectifyListPresenterKt$getRectifyList$3(RectifyListPresenterKt rectifyListPresenterKt) {
        super(1);
        this.this$0 = rectifyListPresenterKt;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Observable<? extends List<RectifyListCollection>> invoke(String str) {
        return this.this$0.getApi().getRectifyList(str);
    }
}