package androidx.room;

import androidx.room.AmbiguousColumnResolver;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"", "Landroidx/room/AmbiguousColumnResolver$a;", "it", "", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, m28849k = 3, m28848mv = {1, 8, 0})
/* loaded from: classes2.dex */
public final class AmbiguousColumnResolver$resolve$4 extends Lambda implements Function1<List<? extends AmbiguousColumnResolver.C4980a>, Unit> {
    final /* synthetic */ Ref.ObjectRef<AmbiguousColumnResolver.Solution> $bestSolution;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmbiguousColumnResolver$resolve$4(Ref.ObjectRef<AmbiguousColumnResolver.Solution> objectRef) {
        super(1);
        this.$bestSolution = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(List<? extends AmbiguousColumnResolver.C4980a> list) {
        invoke2((List<AmbiguousColumnResolver.C4980a>) list);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, androidx.room.AmbiguousColumnResolver$Solution] */
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull List<AmbiguousColumnResolver.C4980a> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        ?? build = AmbiguousColumnResolver.Solution.f37236d.build(it);
        if (build.compareTo(this.$bestSolution.element) < 0) {
            this.$bestSolution.element = build;
        }
    }
}
