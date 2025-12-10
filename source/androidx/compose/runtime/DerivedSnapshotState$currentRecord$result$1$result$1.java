package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.snapshots.StateObject;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "", "T", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class DerivedSnapshotState$currentRecord$result$1$result$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ int $nestedCalculationLevel;
    final /* synthetic */ IdentityArrayMap<StateObject, Integer> $newDependencies;
    final /* synthetic */ DerivedSnapshotState this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DerivedSnapshotState$currentRecord$result$1$result$1(DerivedSnapshotState derivedSnapshotState, IdentityArrayMap<StateObject, Integer> identityArrayMap, int i) {
        super(1);
        this.this$0 = derivedSnapshotState;
        this.$newDependencies = identityArrayMap;
        this.$nestedCalculationLevel = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Object it) {
        SnapshotThreadLocal snapshotThreadLocal;
        Intrinsics.checkNotNullParameter(it, "it");
        if (it != this.this$0) {
            if (it instanceof StateObject) {
                snapshotThreadLocal = AbstractC19164bK1.f39010a;
                Object obj = snapshotThreadLocal.get();
                Intrinsics.checkNotNull(obj);
                int intValue = ((Number) obj).intValue();
                IdentityArrayMap<StateObject, Integer> identityArrayMap = this.$newDependencies;
                int i = intValue - this.$nestedCalculationLevel;
                Integer num = identityArrayMap.get(it);
                identityArrayMap.set(it, Integer.valueOf(Math.min(i, num != null ? num.intValue() : Integer.MAX_VALUE)));
                return;
            }
            return;
        }
        throw new IllegalStateException("A derived state calculation cannot read itself".toString());
    }
}
