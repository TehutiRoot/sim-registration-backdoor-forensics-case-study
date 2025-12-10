package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, m29142d2 = {"Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "Landroidx/compose/ui/Modifier$Element;", "onGloballyPositioned", "", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "ui_release"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.layout.OnGloballyPositionedModifier */
/* loaded from: classes2.dex */
public interface OnGloballyPositionedModifier extends Modifier.Element {

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: androidx.compose.ui.layout.OnGloballyPositionedModifier$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            boolean m26489a;
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            m26489a = AbstractC21205mt0.m26489a(onGloballyPositionedModifier, predicate);
            return m26489a;
        }

        @Deprecated
        public static boolean any(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            boolean m26488b;
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            m26488b = AbstractC21205mt0.m26488b(onGloballyPositionedModifier, predicate);
            return m26488b;
        }

        @Deprecated
        public static <R> R foldIn(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Object m26487c;
            Intrinsics.checkNotNullParameter(operation, "operation");
            m26487c = AbstractC21205mt0.m26487c(onGloballyPositionedModifier, r, operation);
            return (R) m26487c;
        }

        @Deprecated
        public static <R> R foldOut(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Object m26486d;
            Intrinsics.checkNotNullParameter(operation, "operation");
            m26486d = AbstractC21205mt0.m26486d(onGloballyPositionedModifier, r, operation);
            return (R) m26486d;
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, @NotNull Modifier other) {
            Modifier m26768a;
            Intrinsics.checkNotNullParameter(other, "other");
            m26768a = AbstractC21032lt0.m26768a(onGloballyPositionedModifier, other);
            return m26768a;
        }
    }

    void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates);
}