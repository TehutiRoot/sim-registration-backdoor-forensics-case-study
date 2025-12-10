package p000;

import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import kotlin.coroutines.Continuation;

/* renamed from: vJ */
/* loaded from: classes.dex */
public final class C16887vJ implements NestedScrollConnection {

    /* renamed from: a */
    public static final C16887vJ f107644a = new C16887vJ();

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public /* synthetic */ Object mo69445onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
        return VG0.m65885a(this, j, j2, continuation);
    }

    @Override // androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public /* synthetic */ long mo69446onPostScrollDzOQY0M(long j, long j2, int i) {
        return VG0.m65884b(this, j, j2, i);
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
