package th.p047co.dtac.android.dtacone.life_cycle.file;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.life_cycle.file.ClearFileObserver$clearFileObservable$clearFileObservable$2 */
/* loaded from: classes7.dex */
public final class ClearFileObserver$clearFileObservable$clearFileObservable$2 extends Lambda implements Function1<String, Boolean> {
    final /* synthetic */ ClearFileObserver this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearFileObserver$clearFileObservable$clearFileObservable$2(ClearFileObserver clearFileObserver) {
        super(1);
        this.this$0 = clearFileObserver;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(this.this$0.getFileUtil().deleteInternalFile(it));
    }
}
