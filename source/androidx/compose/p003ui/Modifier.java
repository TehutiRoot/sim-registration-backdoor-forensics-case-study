package androidx.compose.p003ui;

import androidx.compose.p003ui.node.DelegatableNode;
import androidx.compose.p003ui.node.DelegatableNodeKt;
import androidx.compose.p003ui.node.NodeCoordinator;
import androidx.compose.p003ui.node.ObserverNodeOwnerScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.joran.action.Action;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import org.apache.commons.codec.language.p027bm.Languages;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Stable
@Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J\u001c\u0010\u0007\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H&J5\u0010\b\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ5\u0010\u000e\u001a\u0002H\t\"\u0004\b\u0000\u0010\t2\u0006\u0010\n\u001a\u0002H\t2\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H\t\u0012\u0004\u0012\u0002H\t0\fH&¢\u0006\u0002\u0010\rJ\u0011\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0000H\u0096\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, m28850d2 = {"Landroidx/compose/ui/Modifier;", "", "all", "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", Languages.ANY, "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "Companion", "Element", "Node", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: androidx.compose.ui.Modifier */
/* loaded from: classes2.dex */
public interface Modifier {
    @NotNull
    public static final Companion Companion = Companion.f28845a;

    @Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J\u001c\u0010\b\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006H\u0016J5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ5\u0010\u000f\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u0002H\n2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0011\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0096\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0016¨\u0006\u0014"}, m28850d2 = {"Landroidx/compose/ui/Modifier$Companion;", "Landroidx/compose/ui/Modifier;", "()V", "all", "", "predicate", "Lkotlin/Function1;", "Landroidx/compose/ui/Modifier$Element;", Languages.ANY, "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "then", "other", "toString", "", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.Modifier$Companion */
    /* loaded from: classes2.dex */
    public static final class Companion implements Modifier {

        /* renamed from: a */
        public static final /* synthetic */ Companion f28845a = new Companion();

        @Override // androidx.compose.p003ui.Modifier
        public boolean all(@NotNull Function1<? super Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return true;
        }

        @Override // androidx.compose.p003ui.Modifier
        public boolean any(@NotNull Function1<? super Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return false;
        }

        @Override // androidx.compose.p003ui.Modifier
        public <R> R foldIn(R r, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return r;
        }

        @Override // androidx.compose.p003ui.Modifier
        public <R> R foldOut(R r, @NotNull Function2<? super Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return r;
        }

        @Override // androidx.compose.p003ui.Modifier
        @NotNull
        public Modifier then(@NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return other;
        }

        @NotNull
        public String toString() {
            return "Modifier";
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.Modifier$DefaultImpls */
    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static Modifier then(@NotNull Modifier modifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return AbstractC19942ft0.m31253b(modifier, other);
        }
    }

    @Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0005H\u0016J5\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fJ5\u0010\r\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u0002H\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016¢\u0006\u0002\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0003"}, m28850d2 = {"Landroidx/compose/ui/Modifier$Element;", "Landroidx/compose/ui/Modifier;", "all", "", "predicate", "Lkotlin/Function1;", Languages.ANY, "foldIn", "R", "initial", "operation", "Lkotlin/Function2;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldOut", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: androidx.compose.ui.Modifier$Element */
    /* loaded from: classes2.dex */
    public interface Element extends Modifier {

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* renamed from: androidx.compose.ui.Modifier$Element$DefaultImpls */
        /* loaded from: classes2.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(@NotNull Element element, @NotNull Function1<? super Element, Boolean> predicate) {
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                return AbstractC20114gt0.m30958e(element, predicate);
            }

            @Deprecated
            public static boolean any(@NotNull Element element, @NotNull Function1<? super Element, Boolean> predicate) {
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                return AbstractC20114gt0.m30957f(element, predicate);
            }

            @Deprecated
            public static <R> R foldIn(@NotNull Element element, R r, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return (R) AbstractC20114gt0.m30956g(element, r, operation);
            }

            @Deprecated
            public static <R> R foldOut(@NotNull Element element, R r, @NotNull Function2<? super Element, ? super R, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return (R) AbstractC20114gt0.m30955h(element, r, operation);
            }

            @Deprecated
            @NotNull
            public static Modifier then(@NotNull Element element, @NotNull Modifier other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return AbstractC20114gt0.m30954i(element, other);
            }
        }

        @Override // androidx.compose.p003ui.Modifier
        boolean all(@NotNull Function1<? super Element, Boolean> function1);

        @Override // androidx.compose.p003ui.Modifier
        boolean any(@NotNull Function1<? super Element, Boolean> function1);

        @Override // androidx.compose.p003ui.Modifier
        <R> R foldIn(R r, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

        @Override // androidx.compose.p003ui.Modifier
        <R> R foldOut(R r, @NotNull Function2<? super Element, ? super R, ? extends R> function2);
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b#\b'\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000f\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0080\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u001d\u0010\u001f\u001a\u00020\u00062\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\"\u0010#R*\u0010+\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u00008\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u0003\u001a\u0004\b(\u0010)R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\"\u00107\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\"\u0010;\u001a\u0002008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u00102\u001a\u0004\b9\u00104\"\u0004\b:\u00106R$\u0010?\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010'\u001a\u0004\b=\u0010)\"\u0004\b>\u0010#R$\u0010C\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b@\u0010'\u001a\u0004\bA\u0010)\"\u0004\bB\u0010#R$\u0010K\u001a\u0004\u0018\u00010D8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010%\u001a\u0004\u0018\u00010\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\"\u0010V\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\u0016\u0010\\\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010QR\u0016\u0010^\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010QR$\u0010`\u001a\u00020\f2\u0006\u0010%\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b_\u0010Q\u001a\u0004\b`\u0010SR\u001a\u0010c\u001a\u00020\f8VX\u0096\u0004¢\u0006\f\u0012\u0004\bb\u0010\u0003\u001a\u0004\ba\u0010SR\u0011\u0010f\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\bd\u0010e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006g"}, m28850d2 = {"Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DelegatableNode;", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "", "updateCoordinator$ui_release", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "updateCoordinator", "Landroidx/compose/ui/node/NodeKind;", "kind", "", "isKind-H91voCI$ui_release", "(I)Z", "isKind", "markAsAttached$ui_release", "markAsAttached", "runAttachLifecycle$ui_release", "runAttachLifecycle", "runDetachLifecycle$ui_release", "runDetachLifecycle", "markAsDetached$ui_release", "markAsDetached", "reset$ui_release", "reset", "onAttach", "onDetach", "onReset", "Lkotlin/Function0;", "effect", "sideEffect", "(Lkotlin/jvm/functions/Function0;)V", Constant.REGISTER_LEVEL_OWNER, "setAsDelegateTo$ui_release", "(Landroidx/compose/ui/Modifier$Node;)V", "setAsDelegateTo", "<set-?>", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/ui/Modifier$Node;", "getNode", "()Landroidx/compose/ui/Modifier$Node;", "getNode$annotations", "node", "Lkotlinx/coroutines/CoroutineScope;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/coroutines/CoroutineScope;", Action.SCOPE_ATTRIBUTE, "", OperatorName.CURVE_TO, "I", "getKindSet$ui_release", "()I", "setKindSet$ui_release", "(I)V", "kindSet", "d", "getAggregateChildKindSet$ui_release", "setAggregateChildKindSet$ui_release", "aggregateChildKindSet", "e", "getParent$ui_release", "setParent$ui_release", "parent", OperatorName.FILL_NON_ZERO, "getChild$ui_release", "setChild$ui_release", "child", "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "getOwnerScope$ui_release", "()Landroidx/compose/ui/node/ObserverNodeOwnerScope;", "setOwnerScope$ui_release", "(Landroidx/compose/ui/node/ObserverNodeOwnerScope;)V", "ownerScope", OperatorName.CLOSE_PATH, "Landroidx/compose/ui/node/NodeCoordinator;", "getCoordinator$ui_release", "()Landroidx/compose/ui/node/NodeCoordinator;", "i", "Z", "getInsertedNodeAwaitingAttachForInvalidation$ui_release", "()Z", "setInsertedNodeAwaitingAttachForInvalidation$ui_release", "(Z)V", "insertedNodeAwaitingAttachForInvalidation", OperatorName.SET_LINE_JOINSTYLE, "getUpdatedNodeAwaitingAttachForInvalidation$ui_release", "setUpdatedNodeAwaitingAttachForInvalidation$ui_release", "updatedNodeAwaitingAttachForInvalidation", OperatorName.NON_STROKING_CMYK, "onAttachRunExpected", OperatorName.LINE_TO, "onDetachRunExpected", OperatorName.MOVE_TO, "isAttached", "getShouldAutoInvalidate", "getShouldAutoInvalidate$annotations", "shouldAutoInvalidate", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "ui_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    /* renamed from: androidx.compose.ui.Modifier$Node */
    /* loaded from: classes2.dex */
    public static abstract class Node implements DelegatableNode {
        public static final int $stable = 8;

        /* renamed from: b */
        public CoroutineScope f28847b;

        /* renamed from: c */
        public int f28848c;

        /* renamed from: e */
        public Node f28850e;

        /* renamed from: f */
        public Node f28851f;

        /* renamed from: g */
        public ObserverNodeOwnerScope f28852g;

        /* renamed from: h */
        public NodeCoordinator f28853h;

        /* renamed from: i */
        public boolean f28854i;

        /* renamed from: j */
        public boolean f28855j;

        /* renamed from: k */
        public boolean f28856k;

        /* renamed from: l */
        public boolean f28857l;

        /* renamed from: m */
        public boolean f28858m;

        /* renamed from: a */
        public Node f28846a = this;

        /* renamed from: d */
        public int f28849d = -1;

        public static /* synthetic */ void getNode$annotations() {
        }

        public static /* synthetic */ void getShouldAutoInvalidate$annotations() {
        }

        public final int getAggregateChildKindSet$ui_release() {
            return this.f28849d;
        }

        @Nullable
        public final Node getChild$ui_release() {
            return this.f28851f;
        }

        @Nullable
        public final NodeCoordinator getCoordinator$ui_release() {
            return this.f28853h;
        }

        @NotNull
        public final CoroutineScope getCoroutineScope() {
            CoroutineScope coroutineScope = this.f28847b;
            if (coroutineScope == null) {
                CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(DelegatableNodeKt.requireOwner(this).getCoroutineContext().plus(JobKt.Job((Job) DelegatableNodeKt.requireOwner(this).getCoroutineContext().get(Job.Key))));
                this.f28847b = CoroutineScope;
                return CoroutineScope;
            }
            return coroutineScope;
        }

        public final boolean getInsertedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.f28854i;
        }

        public final int getKindSet$ui_release() {
            return this.f28848c;
        }

        @Override // androidx.compose.p003ui.node.DelegatableNode
        @NotNull
        public final Node getNode() {
            return this.f28846a;
        }

        @Nullable
        public final ObserverNodeOwnerScope getOwnerScope$ui_release() {
            return this.f28852g;
        }

        @Nullable
        public final Node getParent$ui_release() {
            return this.f28850e;
        }

        public boolean getShouldAutoInvalidate() {
            return true;
        }

        public final boolean getUpdatedNodeAwaitingAttachForInvalidation$ui_release() {
            return this.f28855j;
        }

        public final boolean isAttached() {
            return this.f28858m;
        }

        /* renamed from: isKind-H91voCI$ui_release */
        public final boolean m71408isKindH91voCI$ui_release(int i) {
            if ((i & getKindSet$ui_release()) != 0) {
                return true;
            }
            return false;
        }

        public void markAsAttached$ui_release() {
            if (!this.f28858m) {
                if (this.f28853h != null) {
                    this.f28858m = true;
                    this.f28856k = true;
                    return;
                }
                throw new IllegalStateException("attach invoked on a node without a coordinator".toString());
            }
            throw new IllegalStateException("node attached multiple times".toString());
        }

        public void markAsDetached$ui_release() {
            if (this.f28858m) {
                if (!this.f28856k) {
                    if (!this.f28857l) {
                        this.f28858m = false;
                        CoroutineScope coroutineScope = this.f28847b;
                        if (coroutineScope != null) {
                            CoroutineScopeKt.cancel(coroutineScope, new ModifierNodeDetachedCancellationException());
                            this.f28847b = null;
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Must run runDetachLifecycle() before markAsDetached()".toString());
                }
                throw new IllegalStateException("Must run runAttachLifecycle() before markAsDetached()".toString());
            }
            throw new IllegalStateException("Cannot detach a node that is not attached".toString());
        }

        public void onAttach() {
        }

        public void onDetach() {
        }

        public void onReset() {
        }

        public void reset$ui_release() {
            if (this.f28858m) {
                onReset();
                return;
            }
            throw new IllegalStateException("Check failed.".toString());
        }

        public void runAttachLifecycle$ui_release() {
            if (this.f28858m) {
                if (this.f28856k) {
                    this.f28856k = false;
                    onAttach();
                    this.f28857l = true;
                    return;
                }
                throw new IllegalStateException("Must run runAttachLifecycle() only once after markAsAttached()".toString());
            }
            throw new IllegalStateException("Must run markAsAttached() prior to runAttachLifecycle".toString());
        }

        public void runDetachLifecycle$ui_release() {
            if (this.f28858m) {
                if (this.f28853h != null) {
                    if (this.f28857l) {
                        this.f28857l = false;
                        onDetach();
                        return;
                    }
                    throw new IllegalStateException("Must run runDetachLifecycle() once after runAttachLifecycle() and before markAsDetached()".toString());
                }
                throw new IllegalStateException("detach invoked on a node without a coordinator".toString());
            }
            throw new IllegalStateException("node detached multiple times".toString());
        }

        public final void setAggregateChildKindSet$ui_release(int i) {
            this.f28849d = i;
        }

        public final void setAsDelegateTo$ui_release(@NotNull Node owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            this.f28846a = owner;
        }

        public final void setChild$ui_release(@Nullable Node node) {
            this.f28851f = node;
        }

        public final void setInsertedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.f28854i = z;
        }

        public final void setKindSet$ui_release(int i) {
            this.f28848c = i;
        }

        public final void setOwnerScope$ui_release(@Nullable ObserverNodeOwnerScope observerNodeOwnerScope) {
            this.f28852g = observerNodeOwnerScope;
        }

        public final void setParent$ui_release(@Nullable Node node) {
            this.f28850e = node;
        }

        public final void setUpdatedNodeAwaitingAttachForInvalidation$ui_release(boolean z) {
            this.f28855j = z;
        }

        @ExperimentalComposeUiApi
        public final void sideEffect(@NotNull Function0<Unit> effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            DelegatableNodeKt.requireOwner(this).registerOnEndApplyChangesListener(effect);
        }

        public void updateCoordinator$ui_release(@Nullable NodeCoordinator nodeCoordinator) {
            this.f28853h = nodeCoordinator;
        }
    }

    boolean all(@NotNull Function1<? super Element, Boolean> function1);

    boolean any(@NotNull Function1<? super Element, Boolean> function1);

    <R> R foldIn(R r, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

    <R> R foldOut(R r, @NotNull Function2<? super Element, ? super R, ? extends R> function2);

    @NotNull
    Modifier then(@NotNull Modifier modifier);
}
