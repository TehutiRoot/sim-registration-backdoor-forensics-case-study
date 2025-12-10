package th.p047co.dtac.android.dtacone.presenter.rectify;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import th.p047co.dtac.android.dtacone.extension.format.PhoneNumberExtKt;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.rectify.RectifyListPresenterKt$getRectifyList$2 */
/* loaded from: classes8.dex */
public final class RectifyListPresenterKt$getRectifyList$2 extends Lambda implements Function1<String, String> {
    public static final RectifyListPresenterKt$getRectifyList$2 INSTANCE = new RectifyListPresenterKt$getRectifyList$2();

    public RectifyListPresenterKt$getRectifyList$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String str) {
        return PhoneNumberExtKt.toInternational(str);
    }
}