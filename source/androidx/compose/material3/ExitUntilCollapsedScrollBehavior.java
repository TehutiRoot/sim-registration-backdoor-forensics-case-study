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
public final class ExitUntilCollapsedScrollBehavior implements TopAppBarScrollBehavior {

    /* renamed from: a */
    public final TopAppBarState f25772a;

    /* renamed from: b */
    public final AnimationSpec f25773b;

    /* renamed from: c */
    public final DecayAnimationSpec f25774c;

    /* renamed from: d */
    public final Function0 f25775d;

    /* renamed from: e */
    public final boolean f25776e;

    /* renamed from: f */
    public NestedScrollConnection f25777f;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.ExitUntilCollapsedScrollBehavior$1 */
    /* loaded from: classes2.dex */
    final class C32881 extends Lambda implements Function0<Boolean> {
        public static final C32881 INSTANCE = new C32881();

        public C32881() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public ExitUntilCollapsedScrollBehavior(TopAppBarState state, AnimationSpec animationSpec, DecayAnimationSpec decayAnimationSpec, Function0 canScroll) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canScroll, "canScroll");
        this.f25772a = state;
        this.f25773b = animationSpec;
        this.f25774c = decayAnimationSpec;
        this.f25775d = canScroll;
        this.f25777f = new ExitUntilCollapsedScrollBehavior$nestedScrollConnection$1(this);
    }

    /* renamed from: a */
    public final Function0 m60650a() {
        return this.f25775d;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public DecayAnimationSpec getFlingAnimationSpec() {
        return this.f25774c;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return this.f25777f;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public AnimationSpec getSnapAnimationSpec() {
        return this.f25773b;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public TopAppBarState getState() {
        return this.f25772a;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public boolean isPinned() {
        return this.f25776e;
    }
}
