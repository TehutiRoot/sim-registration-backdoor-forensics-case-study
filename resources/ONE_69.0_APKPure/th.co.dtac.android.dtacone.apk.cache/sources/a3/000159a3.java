package th.p047co.dtac.android.dtacone.viewmodel.mrtr_pre2post;

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
import th.p047co.dtac.android.dtacone.repository.mrtr_pre2post.MrtrPre2PostRepository;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m29142d2 = {"<anonymous>", "", "it", "", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nMrtrPre2PostViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MrtrPre2PostViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/mrtr_pre2post/MrtrPre2PostViewModel$viewOfferPre2Post$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1035:1\n766#2:1036\n857#2,2:1037\n*S KotlinDebug\n*F\n+ 1 MrtrPre2PostViewModel.kt\nth/co/dtac/android/dtacone/viewmodel/mrtr_pre2post/MrtrPre2PostViewModel$viewOfferPre2Post$1\n*L\n742#1:1036\n742#1:1037,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.viewmodel.mrtr_pre2post.MrtrPre2PostViewModel$viewOfferPre2Post$1 */
/* loaded from: classes9.dex */
public final class MrtrPre2PostViewModel$viewOfferPre2Post$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ String $flowId;
    final /* synthetic */ MrtrPre2PostViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MrtrPre2PostViewModel$viewOfferPre2Post$1(MrtrPre2PostViewModel mrtrPre2PostViewModel, String str) {
        super(1);
        this.this$0 = mrtrPre2PostViewModel;
        this.$flowId = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
        invoke2(th2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Throwable it) {
        MrtrPre2PostRepository mrtrPre2PostRepository;
        MrtrPre2PostRepository mrtrPre2PostRepository2;
        Intrinsics.checkNotNullParameter(it, "it");
        mrtrPre2PostRepository = this.this$0.f106609c;
        mrtrPre2PostRepository2 = this.this$0.f106609c;
        String str = this.$flowId;
        ArrayList arrayList = new ArrayList();
        for (Object obj : mrtrPre2PostRepository2.getFlowIds()) {
            if (!Intrinsics.areEqual((String) obj, str)) {
                arrayList.add(obj);
            }
        }
        mrtrPre2PostRepository.setFlowIds(CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList));
    }
}