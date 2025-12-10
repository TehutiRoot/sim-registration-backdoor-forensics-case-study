package th.p047co.dtac.android.dtacone.view.appOne.pre2post.viewModel;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nOnePre2PostViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnePre2PostViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/pre2post/viewModel/OnePre2PostViewModel$viewOfferPre2Post$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1993:1\n766#2:1994\n857#2,2:1995\n*S KotlinDebug\n*F\n+ 1 OnePre2PostViewModel.kt\nth/co/dtac/android/dtacone/view/appOne/pre2post/viewModel/OnePre2PostViewModel$viewOfferPre2Post$1\n*L\n884#1:1994\n884#1:1995,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.pre2post.viewModel.OnePre2PostViewModel$viewOfferPre2Post$1 */
/* loaded from: classes10.dex */
public final class OnePre2PostViewModel$viewOfferPre2Post$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ String $flowId;
    final /* synthetic */ OnePre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePre2PostViewModel$viewOfferPre2Post$1(OnePre2PostViewModel onePre2PostViewModel, String str) {
        super(1);
        this.this$0 = onePre2PostViewModel;
        this.$flowId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        OnePre2PostViewModel onePre2PostViewModel = this.this$0;
        String str = this.$flowId;
        ArrayList arrayList = new ArrayList();
        for (Object obj : onePre2PostViewModel.getFlowIds()) {
            if (!Intrinsics.areEqual((String) obj, str)) {
                arrayList.add(obj);
            }
        }
        onePre2PostViewModel.setFlowIds(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
    }
}