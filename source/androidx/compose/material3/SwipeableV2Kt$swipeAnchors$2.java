package androidx.compose.material3;

import androidx.compose.p003ui.unit.IntSize;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m28850d2 = {"<anonymous>", "", "T", "layoutSize", "Landroidx/compose/ui/unit/IntSize;", "invoke-ozmzZPI", "(J)V"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nSwipeableV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Kt$swipeAnchors$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,692:1\n1855#2,2:693\n*S KotlinDebug\n*F\n+ 1 SwipeableV2.kt\nandroidx/compose/material3/SwipeableV2Kt$swipeAnchors$2\n*L\n118#1:693,2\n*E\n"})
/* loaded from: classes2.dex */
public final class SwipeableV2Kt$swipeAnchors$2 extends Lambda implements Function1<IntSize, Unit> {
    final /* synthetic */ AnchorChangeHandler<T> $anchorChangeHandler;
    final /* synthetic */ Function2<T, IntSize, Float> $calculateAnchor;
    final /* synthetic */ Set<T> $possibleValues;
    final /* synthetic */ SwipeableV2State<T> $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwipeableV2Kt$swipeAnchors$2(SwipeableV2State<T> swipeableV2State, Set<? extends T> set, AnchorChangeHandler<T> anchorChangeHandler, Function2<? super T, ? super IntSize, Float> function2) {
        super(1);
        this.$state = swipeableV2State;
        this.$possibleValues = set;
        this.$anchorChangeHandler = anchorChangeHandler;
        this.$calculateAnchor = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
        m70643invokeozmzZPI(intSize.m73822unboximpl());
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-ozmzZPI  reason: not valid java name */
    public final void m70643invokeozmzZPI(long j) {
        AnchorChangeHandler<T> anchorChangeHandler;
        Map anchors$material3_release = this.$state.getAnchors$material3_release();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Function2<T, IntSize, Float> function2 = this.$calculateAnchor;
        for (Object obj : this.$possibleValues) {
            Float invoke = function2.invoke(obj, IntSize.m73810boximpl(j));
            if (invoke != null) {
                linkedHashMap.put(obj, invoke);
            }
        }
        if (!Intrinsics.areEqual(anchors$material3_release, linkedHashMap)) {
            Object targetValue = this.$state.getTargetValue();
            if (this.$state.updateAnchors$material3_release(linkedHashMap) && (anchorChangeHandler = this.$anchorChangeHandler) != 0) {
                anchorChangeHandler.onAnchorsChanged(targetValue, anchors$material3_release, linkedHashMap);
            }
        }
    }
}
