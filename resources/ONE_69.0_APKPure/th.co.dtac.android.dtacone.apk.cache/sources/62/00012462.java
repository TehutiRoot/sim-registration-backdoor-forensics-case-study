package th.p047co.dtac.android.dtacone.presenter.prepaid;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "Lkotlin/text/MatchResult;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.presenter.prepaid.OCRPresenter$getCardIdFromRawText$ids$1 */
/* loaded from: classes8.dex */
public final class OCRPresenter$getCardIdFromRawText$ids$1 extends Lambda implements Function1<MatchResult, String> {
    public static final OCRPresenter$getCardIdFromRawText$ids$1 INSTANCE = new OCRPresenter$getCardIdFromRawText$ids$1();

    public OCRPresenter$getCardIdFromRawText$ids$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final String invoke(@NotNull MatchResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getGroupValues().get(0);
    }
}