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
    public final TopAppBarState f25943a;

    /* renamed from: b */
    public final Function0 f25944b;

    /* renamed from: c */
    public final boolean f25945c;

    /* renamed from: d */
    public final AnimationSpec f25946d;

    /* renamed from: e */
    public final DecayAnimationSpec f25947e;

    /* renamed from: f */
    public NestedScrollConnection f25948f;

    @Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m28850d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.material3.PinnedScrollBehavior$1 */
    /* loaded from: classes2.dex */
    final class C33511 extends Lambda implements Function0<Boolean> {
        public static final C33511 INSTANCE = new C33511();

        public C33511() {
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
        this.f25943a = state;
        this.f25944b = canScroll;
        this.f25945c = true;
        this.f25948f = new NestedScrollConnection() { // from class: androidx.compose.material3.PinnedScrollBehavior$nestedScrollConnection$1
            @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostFling-RZ2iAVY */
            public /* synthetic */ Object mo69445onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
                return VG0.m65885a(this, j, j2, continuation);
            }

            @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPostScroll-DzOQY0M */
            public long mo69446onPostScrollDzOQY0M(long j, long j2, int i) {
                if (!((Boolean) PinnedScrollBehavior.this.m60588a().invoke()).booleanValue()) {
                    return Offset.Companion.m71518getZeroF1C5BW0();
                }
                if (Offset.m71503getYimpl(j) == 0.0f && Offset.m71503getYimpl(j2) > 0.0f) {
                    PinnedScrollBehavior.this.getState().setContentOffset(0.0f);
                } else {
                    TopAppBarState state2 = PinnedScrollBehavior.this.getState();
                    state2.setContentOffset(state2.getContentOffset() + Offset.m71503getYimpl(j));
                }
                return Offset.Companion.m71518getZeroF1C5BW0();
            }

            @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreFling-QWom1Mo */
            public /* synthetic */ Object mo69447onPreFlingQWom1Mo(long j, Continuation continuation) {
                return VG0.m65883c(this, j, continuation);
            }

            @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
            /* renamed from: onPreScroll-OzD1aCk */
            public /* synthetic */ long mo69448onPreScrollOzD1aCk(long j, int i) {
                return VG0.m65882d(this, j, i);
            }
        };
    }

    /* renamed from: a */
    public final Function0 m60588a() {
        return this.f25944b;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public DecayAnimationSpec getFlingAnimationSpec() {
        return this.f25947e;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public NestedScrollConnection getNestedScrollConnection() {
        return this.f25948f;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public AnimationSpec getSnapAnimationSpec() {
        return this.f25946d;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public TopAppBarState getState() {
        return this.f25943a;
    }

    @Override // androidx.compose.material3.TopAppBarScrollBehavior
    public boolean isPinned() {
        return this.f25945c;
    }
}
