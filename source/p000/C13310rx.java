package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p003ui.unit.Velocity;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: rx */
/* loaded from: classes.dex */
public final class C13310rx implements NestedScrollConnection {

    /* renamed from: a */
    public final Orientation f77515a;

    public C13310rx(Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f77515a = orientation;
    }

    /* renamed from: a */
    public final long m23220a(long j, Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == Orientation.Vertical) {
            return Offset.m71496copydBAh8RU$default(j, 0.0f, 0.0f, 2, null);
        }
        return Offset.m71496copydBAh8RU$default(j, 0.0f, 0.0f, 1, null);
    }

    /* renamed from: b */
    public final long m23219b(long j, Orientation orientation) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        if (orientation == Orientation.Vertical) {
            return Velocity.m73879copyOhffZ5M$default(j, 0.0f, 0.0f, 2, null);
        }
        return Velocity.m73879copyOhffZ5M$default(j, 0.0f, 0.0f, 1, null);
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo69445onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return Velocity.m73874boximpl(m23219b(j2, this.f77515a));
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo69446onPostScrollDzOQY0M(long j, long j2, int i) {
        if (NestedScrollSource.m72623equalsimpl0(i, NestedScrollSource.Companion.m72629getFlingWNlRxjI())) {
            return m23220a(j2, this.f77515a);
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
}
