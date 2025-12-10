package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class EnterAlwaysScrollBehavior implements TopAppBarScrollBehavior {

    /* renamed from: a */
    public final TopAppBarState f25765a;

    /* renamed from: b */
    public final AnimationSpec f25766b;

    /* renamed from: c */
    public final DecayAnimationSpec f25767c;

    /* renamed from: d */
    public final Function0 f25768d;

    /* renamed from: e */
    public final boolean f25769e;

    /* renamed from: f */
    public NestedScrollConnection f25770f;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.EnterAlwaysScrollBehavior$1 */
    /* loaded from: classes2.dex */
    final class C32871 extends Lambda implements Function0<Boolean> {
        public static final C32871 INSTANCE = new C32871();

        public C32871() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public EnterAlwaysScrollBehavior(TopAppBarState state, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function0 canScroll) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canScroll, "canScroll");
        this.f25765a = state;
        this.f25766b = animationSpec;
        this.f25767c = decayAnimationSpec;
        this.f25768d = canScroll;
        this.f25770f = new EnterAlwaysScrollBehavior$nestedScrollConnection$1(this);
    }

    /* renamed from: a */
    public final Function0 m60651a() {
        return this.f25768d;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public DecayAnimationSpec getFlingAnimationSpec() {
        return this.f25767c;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return this.f25770f;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public AnimationSpec getSnapAnimationSpec() {
        return this.f25766b;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public TopAppBarState getState() {
        return this.f25765a;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public boolean isPinned() {
        return this.f25769e;
    }
}
