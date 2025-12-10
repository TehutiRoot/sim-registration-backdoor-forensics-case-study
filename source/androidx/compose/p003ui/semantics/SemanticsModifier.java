package androidx.compose.p003ui.semantics;

import androidx.compose.p003ui.Modifier;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, m28850d2 = {"Landroidx/compose/ui/semantics/SemanticsModifier;", "Landroidx/compose/ui/Modifier$Element;", "id", "", "getId$annotations", "()V", "getId", "()I", "semanticsConfiguration", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getSemanticsConfiguration", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.semantics.SemanticsModifier */
/* loaded from: classes2.dex */
public interface SemanticsModifier extends Modifier.Element {

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.semantics.SemanticsModifier$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull SemanticsModifier semanticsModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            boolean m30962a;
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            m30962a = AbstractC20114gt0.m30962a(semanticsModifier, predicate);
            return m30962a;
        }

        @Deprecated
        public static boolean any(@NotNull SemanticsModifier semanticsModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            boolean m30961b;
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            m30961b = AbstractC20114gt0.m30961b(semanticsModifier, predicate);
            return m30961b;
        }

        @Deprecated
        public static <R> R foldIn(@NotNull SemanticsModifier semanticsModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Object m30960c;
            Intrinsics.checkNotNullParameter(operation, "operation");
            m30960c = AbstractC20114gt0.m30960c(semanticsModifier, r, operation);
            return (R) m30960c;
        }

        @Deprecated
        public static <R> R foldOut(@NotNull SemanticsModifier semanticsModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Object m30959d;
            Intrinsics.checkNotNullParameter(operation, "operation");
            m30959d = AbstractC20114gt0.m30959d(semanticsModifier, r, operation);
            return (R) m30959d;
        }

        @Deprecated
        public static int getId(@NotNull SemanticsModifier semanticsModifier) {
            int m68522a;
            m68522a = EF1.m68522a(semanticsModifier);
            return m68522a;
        }

        @Deprecated(message = "SemanticsModifier.id is now unused and has been set to a fixed value. Retrieve the id from LayoutInfo instead.", replaceWith = @ReplaceWith(expression = "", imports = {}))
        public static /* synthetic */ void getId$annotations() {
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull SemanticsModifier semanticsModifier, @NotNull Modifier other) {
            Modifier m31254a;
            Intrinsics.checkNotNullParameter(other, "other");
            m31254a = AbstractC19942ft0.m31254a(semanticsModifier, other);
            return m31254a;
        }
    }

    int getId();

    @NotNull
    SemanticsConfiguration getSemanticsConfiguration();
}
