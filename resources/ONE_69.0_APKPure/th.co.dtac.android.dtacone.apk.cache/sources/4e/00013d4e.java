package th.p047co.dtac.android.dtacone.view.appOne.rectify.viewmodel;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.app_one.model.rectify.OneRectifyListResponse;

@Metadata(m29143d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "rectify", "Lth/co/dtac/android/dtacone/app_one/model/rectify/OneRectifyListResponse$DataItem$RectifyItem;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.viewmodel.OneRectifyViewModel$getRectifyList$3 */
/* loaded from: classes10.dex */
public final class OneRectifyViewModel$getRectifyList$3 extends Lambda implements Function1<OneRectifyListResponse.DataItem.RectifyItem, String> {
    public static final OneRectifyViewModel$getRectifyList$3 INSTANCE = new OneRectifyViewModel$getRectifyList$3();

    public OneRectifyViewModel$getRectifyList$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(@NotNull OneRectifyListResponse.DataItem.RectifyItem rectify) {
        List split$default;
        String str;
        Intrinsics.checkNotNullParameter(rectify, "rectify");
        String createdDateTime = rectify.getCreatedDateTime();
        return (createdDateTime == null || (split$default = StringsKt__StringsKt.split$default((CharSequence) createdDateTime, new String[]{HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR}, false, 0, 6, (Object) null)) == null || (str = (String) split$default.get(0)) == null) ? "" : str;
    }
}