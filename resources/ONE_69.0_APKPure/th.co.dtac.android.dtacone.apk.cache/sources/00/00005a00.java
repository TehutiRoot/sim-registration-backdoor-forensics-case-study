package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class PinnedScrollBehavior implements TopAppBarScrollBehavior {

    /* renamed from: a */
    public final TopAppBarState f26031a;

    /* renamed from: b */
    public final Function0 f26032b;

    /* renamed from: c */
    public final boolean f26033c;

    /* renamed from: d */
    public final AnimationSpec f26034d;

    /* renamed from: e */
    public final DecayAnimationSpec f26035e;

    /* renamed from: f */
    public NestedScrollConnection f26036f;

    @Metadata(m29143d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m29142d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.material3.PinnedScrollBehavior$1 */
    /* loaded from: classes2.dex */
    final class C33331 extends Lambda implements Function0<Boolean> {
        public static final C33331 INSTANCE = new C33331();

        public C33331() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    public PinnedScrollBehavior(TopAppBarState state, Function0 canScroll) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(canScroll, "canScroll");
        this.f26031a = state;
        this.f26032b = canScroll;
        this.f26033c = true;
        this.f26036f = new NestedScrollConnection() { // from class: androidx.compose.material3.PinnedScrollBehavior$nestedScrollConnection$1
            @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public /* synthetic */ Object mo69629onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
                return AbstractC19201bH0.m51974a(this, j, j2, continuation);
            }

            @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo69630onPostScrollDzOQY0M(long j, long j2, int i) {
                if (!((Boolean) PinnedScrollBehavior.this.m60538a().invoke()).booleanValue()) {
                    return Offset.Companion.m71702getZeroF1C5BW0();
                }
                if (Offset.m71687getYimpl(j) == 0.0f && Offset.m71687getYimpl(j2) > 0.0f) {
                    PinnedScrollBehavior.this.getState().setContentOffset(0.0f);
                } else {
                    TopAppBarState state2 = PinnedScrollBehavior.this.getState();
                    state2.setContentOffset(state2.getContentOffset() + Offset.m71687getYimpl(j));
                }
                return Offset.Companion.m71702getZeroF1C5BW0();
            }

            @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public /* synthetic */ Object mo69631onPreFlingQWom1Mo(long j, Continuation continuation) {
                return AbstractC19201bH0.m51972c(this, j, continuation);
            }

            @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public /* synthetic */ long mo69632onPreScrollOzD1aCk(long j, int i) {
                return AbstractC19201bH0.m51971d(this, j, i);
            }
        };
    }

    /* renamed from: a */
    public final Function0 m60538a() {
        return this.f26032b;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public DecayAnimationSpec getFlingAnimationSpec() {
        return this.f26035e;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return this.f26036f;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public AnimationSpec getSnapAnimationSpec() {
        return this.f26034d;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public TopAppBarState getState() {
        return this.f26031a;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public boolean isPinned() {
        return this.f26033c;
    }
}