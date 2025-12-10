package th.p047co.dtac.android.dtacone.view.appOne.rectify.viewmodel;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.view.appOne.rectify.repository.OneRectifyRepository;

@Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.view.appOne.rectify.viewmodel.OneRectifyViewModel$getRectifyList$obs$1 */
/* loaded from: classes10.dex */
public final class OneRectifyViewModel$getRectifyList$obs$1 extends Lambda implements Function1<String, String> {
    final /* synthetic */ OneRectifyViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneRectifyViewModel$getRectifyList$obs$1(OneRectifyViewModel oneRectifyViewModel) {
        super(1);
        this.this$0 = oneRectifyViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(@NotNull String it) {
        OneRectifyRepository oneRectifyRepository;
        Intrinsics.checkNotNullParameter(it, "it");
        oneRectifyRepository = this.this$0.f96159b;
        oneRectifyRepository.setCustomerPhoneNumber(it);
        return it;
    }
}