package androidx.compose.material3;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
/* loaded from: classes2.dex */
public final class SearchBarKt$SearchBar$useFullScreenShape$2$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ State<Float> $animationProgress;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchBarKt$SearchBar$useFullScreenShape$2$1(State<Float> state) {
        super(0);
        this.$animationProgress = state;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Boolean invoke() {
        return Boolean.valueOf(this.$animationProgress.getValue().floatValue() == 1.0f);
    }
}