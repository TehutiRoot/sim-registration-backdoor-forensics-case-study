package androidx.compose.p003ui.draw;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\f\u0010\u0002\u001a\u00020\u0003*\u00020\u0004H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0003"}, m28850d2 = {"Landroidx/compose/ui/draw/DrawModifier;", "Landroidx/compose/ui/Modifier$Element;", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.draw.DrawModifier */
/* loaded from: classes2.dex */
public interface DrawModifier extends Modifier.Element {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.draw.DrawModifier$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull DrawModifier drawModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            boolean m30962a;
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            m30962a = AbstractC20114gt0.m30962a(drawModifier, predicate);
            return m30962a;
        }

        @Deprecated
        public static boolean any(@NotNull DrawModifier drawModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            boolean m30961b;
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            m30961b = AbstractC20114gt0.m30961b(drawModifier, predicate);
            return m30961b;
        }

        @Deprecated
        public static <R> R foldIn(@NotNull DrawModifier drawModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Object m30960c;
            Intrinsics.checkNotNullParameter(operation, "operation");
            m30960c = AbstractC20114gt0.m30960c(drawModifier, r, operation);
            return (R) m30960c;
        }

        @Deprecated
        public static <R> R foldOut(@NotNull DrawModifier drawModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Object m30959d;
            Intrinsics.checkNotNullParameter(operation, "operation");
            m30959d = AbstractC20114gt0.m30959d(drawModifier, r, operation);
            return (R) m30959d;
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull DrawModifier drawModifier, @NotNull Modifier other) {
            Modifier m31254a;
            Intrinsics.checkNotNullParameter(other, "other");
            m31254a = AbstractC19942ft0.m31254a(drawModifier, other);
            return m31254a;
        }
    }

    void draw(@NotNull ContentDrawScope contentDrawScope);
}
