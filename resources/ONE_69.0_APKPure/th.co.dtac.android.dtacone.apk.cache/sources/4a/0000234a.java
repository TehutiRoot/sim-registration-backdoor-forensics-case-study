package androidx.compose.animation.graphics.vector;

import androidx.compose.p003ui.graphics.vector.PathNode;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m29142d2 = {"<anonymous>", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "invoke"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes.dex */
public final class PathPropertyValues$createState$1$1 extends Lambda implements Function0<List<? extends PathNode>> {
    final /* synthetic */ State<Float> $timeState;
    final /* synthetic */ PathPropertyValues this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PathPropertyValues$createState$1$1(PathPropertyValues pathPropertyValues, State<Float> state) {
        super(0);
        this.this$0 = pathPropertyValues;
        this.$timeState = state;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<? extends PathNode> invoke() {
        List<? extends PathNode> m61603b;
        m61603b = this.this$0.m61603b(this.$timeState.getValue().floatValue());
        return m61603b;
    }
}