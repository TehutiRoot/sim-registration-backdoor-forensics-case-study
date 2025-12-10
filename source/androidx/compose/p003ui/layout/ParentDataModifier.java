package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0003"}, m28850d2 = {"Landroidx/compose/ui/layout/ParentDataModifier;", "Landroidx/compose/ui/Modifier$Element;", "modifyParentData", "", "Landroidx/compose/ui/unit/Density;", "parentData", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.layout.ParentDataModifier */
/* loaded from: classes2.dex */
public interface ParentDataModifier extends Modifier.Element {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.layout.ParentDataModifier$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull ParentDataModifier parentDataModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            boolean m30962a;
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            m30962a = AbstractC20114gt0.m30962a(parentDataModifier, predicate);
            return m30962a;
        }

        @Deprecated
        public static boolean any(@NotNull ParentDataModifier parentDataModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            boolean m30961b;
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            m30961b = AbstractC20114gt0.m30961b(parentDataModifier, predicate);
            return m30961b;
        }

        @Deprecated
        public static <R> R foldIn(@NotNull ParentDataModifier parentDataModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Object m30960c;
            Intrinsics.checkNotNullParameter(operation, "operation");
            m30960c = AbstractC20114gt0.m30960c(parentDataModifier, r, operation);
            return (R) m30960c;
        }

        @Deprecated
        public static <R> R foldOut(@NotNull ParentDataModifier parentDataModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Object m30959d;
            Intrinsics.checkNotNullParameter(operation, "operation");
            m30959d = AbstractC20114gt0.m30959d(parentDataModifier, r, operation);
            return (R) m30959d;
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull ParentDataModifier parentDataModifier, @NotNull Modifier other) {
            Modifier m31254a;
            Intrinsics.checkNotNullParameter(other, "other");
            m31254a = AbstractC19942ft0.m31254a(parentDataModifier, other);
            return m31254a;
        }
    }

    @Nullable
    Object modifyParentData(@NotNull Density density, @Nullable Object obj);
}
