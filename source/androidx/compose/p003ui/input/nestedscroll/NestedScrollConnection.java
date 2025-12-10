package androidx.compose.p003ui.input.nestedscroll;

import androidx.compose.p003ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m28850d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollConnection */
/* loaded from: classes2.dex */
public interface NestedScrollConnection {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollConnection$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Deprecated
        @Nullable
        /* renamed from: onPostFling-RZ2iAVY  reason: not valid java name */
        public static Object m72612onPostFlingRZ2iAVY(@NotNull NestedScrollConnection nestedScrollConnection, long j, long j2, @NotNull Continuation<? super Velocity> continuation) {
            Object m65885a;
            m65885a = VG0.m65885a(nestedScrollConnection, j, j2, continuation);
            return m65885a;
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M  reason: not valid java name */
        public static long m72613onPostScrollDzOQY0M(@NotNull NestedScrollConnection nestedScrollConnection, long j, long j2, int i) {
            long m65884b;
            m65884b = VG0.m65884b(nestedScrollConnection, j, j2, i);
            return m65884b;
        }

        @Deprecated
        @Nullable
        /* renamed from: onPreFling-QWom1Mo  reason: not valid java name */
        public static Object m72614onPreFlingQWom1Mo(@NotNull NestedScrollConnection nestedScrollConnection, long j, @NotNull Continuation<? super Velocity> continuation) {
            Object m65883c;
            m65883c = VG0.m65883c(nestedScrollConnection, j, continuation);
            return m65883c;
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk  reason: not valid java name */
        public static long m72615onPreScrollOzD1aCk(@NotNull NestedScrollConnection nestedScrollConnection, long j, int i) {
            long m65882d;
            m65882d = VG0.m65882d(nestedScrollConnection, j, i);
            return m65882d;
        }
    }

    @Nullable
    /* renamed from: onPostFling-RZ2iAVY */
    Object mo69445onPostFlingRZ2iAVY(long j, long j2, @NotNull Continuation<? super Velocity> continuation);

    /* renamed from: onPostScroll-DzOQY0M */
    long mo69446onPostScrollDzOQY0M(long j, long j2, int i);

    @Nullable
    /* renamed from: onPreFling-QWom1Mo */
    Object mo69447onPreFlingQWom1Mo(long j, @NotNull Continuation<? super Velocity> continuation);

    /* renamed from: onPreScroll-OzD1aCk */
    long mo69448onPreScrollOzD1aCk(long j, int i);
}
