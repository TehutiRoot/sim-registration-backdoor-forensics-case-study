package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IdentityScopeMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.navigation.compose.ComposeNavigator;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b!\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001bB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\"\u0010\u000f\u001a\u00020\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\"\u0010\u0015\u001a\u00020\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u000f\u0010\u0016\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001b\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010!\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0019H\u0016¢\u0006\u0004\b&\u0010%J\u000f\u0010'\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010(J+\u0010-\u001a\u00020\f2\u001a\u0010,\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020+\u0012\u0006\u0012\u0004\u0018\u00010+0*0)H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\fH\u0016¢\u0006\u0004\b3\u0010\u0017J\u000f\u00104\u001a\u00020\fH\u0016¢\u0006\u0004\b4\u0010\u0017J\u000f\u00105\u001a\u00020\fH\u0016¢\u0006\u0004\b5\u0010\u0017J\u000f\u00106\u001a\u00020\fH\u0016¢\u0006\u0004\b6\u0010\u0017J\u000f\u00107\u001a\u00020\fH\u0016¢\u0006\u0004\b7\u0010\u0017J5\u0010;\u001a\u00028\u0000\"\u0004\b\u0000\u001082\b\u00109\u001a\u0004\u0018\u00010\u00012\u0006\u0010:\u001a\u00020\u00112\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0016¢\u0006\u0004\b;\u0010<J!\u0010A\u001a\u00020@2\u0006\u0010>\u001a\u00020=2\b\u0010?\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010C\u001a\u00020\f2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\f2\u0006\u0010?\u001a\u00020\u00192\u0006\u0010>\u001a\u00020=H\u0000¢\u0006\u0004\bE\u0010FJ\u001b\u0010K\u001a\u00020\f2\n\u00100\u001a\u0006\u0012\u0002\b\u00030HH\u0000¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020\fH\u0002¢\u0006\u0004\bL\u0010\u0017J\u000f\u0010M\u001a\u00020\fH\u0002¢\u0006\u0004\bM\u0010\u0017JK\u0010Q\u001a\u0016\u0012\u0004\u0012\u00020=\u0018\u00010Nj\n\u0012\u0004\u0012\u00020=\u0018\u0001`O*\u0016\u0012\u0004\u0012\u00020=\u0018\u00010Nj\n\u0012\u0004\u0012\u00020=\u0018\u0001`O2\u0006\u0010#\u001a\u00020\u00192\u0006\u0010P\u001a\u00020\u001dH\u0002¢\u0006\u0004\bQ\u0010RJ%\u0010S\u001a\u00020\f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010P\u001a\u00020\u001dH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\fH\u0002¢\u0006\u0004\bU\u0010\u0017J\u0017\u0010V\u001a\u00020\f2\u0006\u0010#\u001a\u00020\u0019H\u0002¢\u0006\u0004\bV\u0010%Jj\u0010a\u001a\u00020\f2Y\u0010`\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110[¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\\\u0012\u0013\u0012\u00110]¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(^\u0012\u0004\u0012\u00020\f0Xj\u0002`_0WH\u0002¢\u0006\u0004\ba\u0010.J\u000f\u0010b\u001a\u00020\fH\u0002¢\u0006\u0004\bb\u0010\u0017J!\u0010c\u001a\u00020\u001d2\u0006\u0010>\u001a\u00020=2\b\u0010?\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\bc\u0010dJ)\u0010g\u001a\u00020@2\u0006\u0010>\u001a\u00020=2\u0006\u0010f\u001a\u00020e2\b\u0010?\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\bg\u0010hJ#\u0010k\u001a\u0016\u0012\u0004\u0012\u00020=\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010j0iH\u0002¢\u0006\u0004\bk\u0010lJ\u0017\u0010o\u001a\u00020\f2\u0006\u0010n\u001a\u00020mH\u0002¢\u0006\u0004\bo\u0010pR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010qR\u0018\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010rR(\u0010v\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00190sj\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019`t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010uR\u0014\u0010x\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010wR$\u0010{\u001a\u0012\u0012\u0004\u0012\u00020y0Nj\b\u0012\u0004\u0012\u00020y`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010zR\u001a\u0010n\u001a\u00020m8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010|\u001a\u0004\b}\u0010~R\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020=0\u007f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bM\u0010\u0080\u0001R&\u0010\u0083\u0001\u001a\u0012\u0012\u0004\u0012\u00020=0Nj\b\u0012\u0004\u0012\u00020=`O8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010zR \u0010\u0084\u0001\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030H0\u007f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bg\u0010\u0080\u0001Rh\u0010`\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110[¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\\\u0012\u0013\u0012\u00110]¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(^\u0012\u0004\u0012\u00020\f0Xj\u0002`_0W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bV\u0010\u0085\u0001Ri\u0010\u0086\u0001\u001aU\u0012Q\u0012O\u0012\u0017\u0012\u0015\u0012\u0002\b\u00030\u0005¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110[¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(\\\u0012\u0013\u0012\u00110]¢\u0006\f\bY\u0012\b\bZ\u0012\u0004\b\b(^\u0012\u0004\u0012\u00020\f0Xj\u0002`_0W8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bk\u0010\u0085\u0001R\u001c\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020=0\u007f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bc\u0010\u0080\u0001R,\u0010\u0089\u0001\u001a\u0016\u0012\u0004\u0012\u00020=\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010j0i8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bo\u0010\u0088\u0001R(\u0010\u008f\u0001\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010(\"\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0019\u0010\u0095\u0001\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u0019\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001b\u0010\u009e\u0001\u001a\u00020\u001d8\u0006¢\u0006\u000f\n\u0006\b\u009d\u0001\u0010\u008b\u0001\u001a\u0005\b\u009e\u0001\u0010(R\u0019\u0010 \u0001\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u008b\u0001R3\u0010¦\u0001\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0005\b¥\u0001\u0010\u0010R\u001d\u0010©\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190)8@X\u0080\u0004¢\u0006\b\u001a\u0006\b§\u0001\u0010¨\u0001R\u001d\u0010«\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190)8@X\u0080\u0004¢\u0006\b\u001a\u0006\bª\u0001\u0010¨\u0001R\u001d\u0010\u00ad\u0001\u001a\b\u0012\u0004\u0012\u00020=0)8@X\u0080\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010¨\u0001R\u0013\u0010\b\u001a\u00020\u00078F¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0016\u0010°\u0001\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010(R\u0016\u0010±\u0001\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b±\u0001\u0010(R\u0016\u0010³\u0001\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010(R\u0016\u0010µ\u0001\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b´\u0001\u0010(R\u0016\u0010¶\u0001\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010(¨\u0006·\u0001"}, m28850d2 = {"Landroidx/compose/runtime/CompositionImpl;", "Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/CompositionContext;", "parent", "Landroidx/compose/runtime/Applier;", "applier", "Lkotlin/coroutines/CoroutineContext;", "recomposeContext", "<init>", "(Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/Applier;Lkotlin/coroutines/CoroutineContext;)V", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "content", "setContent", "(Lkotlin/jvm/functions/Function2;)V", "", Action.KEY_ATTRIBUTE, "invalidateGroupsWithKey", "(I)V", "composeContent", "dispose", "()V", "", "", "values", "recordModificationsOf", "(Ljava/util/Set;)V", "", "observesAnyOf", "(Ljava/util/Set;)Z", "block", "prepareCompose", "(Lkotlin/jvm/functions/Function0;)V", "value", "recordReadOf", "(Ljava/lang/Object;)V", "recordWriteOf", "recompose", "()Z", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContent", "(Ljava/util/List;)V", "Landroidx/compose/runtime/MovableContentState;", RemoteConfigConstants.ResponseFieldKey.STATE, "disposeUnusedMovableContent", "(Landroidx/compose/runtime/MovableContentState;)V", "applyChanges", "applyLateChanges", "changesApplied", "invalidateAll", "verifyConsistent", "R", TypedValues.TransitionType.S_TO, "groupIndex", "delegateInvalidations", "(Landroidx/compose/runtime/ControlledComposition;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/RecomposeScopeImpl;", Action.SCOPE_ATTRIBUTE, "instance", "Landroidx/compose/runtime/InvalidationResult;", "invalidate", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "recomposeScopeReleased", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation$runtime_release", "(Ljava/lang/Object;Landroidx/compose/runtime/RecomposeScopeImpl;)V", "removeObservation", "Landroidx/compose/runtime/DerivedState;", "removeDerivedStateObservation$runtime_release", "(Landroidx/compose/runtime/DerivedState;)V", "removeDerivedStateObservation", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "forgetConditionalScopes", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Ljava/util/HashSet;Ljava/lang/Object;Z)Ljava/util/HashSet;", OperatorName.CURVE_TO, "(Ljava/util/Set;Z)V", "e", OperatorName.SET_LINE_JOINSTYLE, "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "Landroidx/compose/runtime/SlotWriter;", "slots", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "Landroidx/compose/runtime/Change;", "changes", "d", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.LINE_TO, "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "Landroidx/compose/runtime/Anchor;", "anchor", "i", "(Landroidx/compose/runtime/RecomposeScopeImpl;Landroidx/compose/runtime/Anchor;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/collection/IdentityArraySet;", OperatorName.NON_STROKING_CMYK, "()Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/SlotTable;", "slotTable", OperatorName.MOVE_TO, "(Landroidx/compose/runtime/SlotTable;)V", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/Applier;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "Ljava/lang/Object;", "lock", "Landroidx/compose/runtime/RememberObserver;", "Ljava/util/HashSet;", "abandonSet", "Landroidx/compose/runtime/SlotTable;", "getSlotTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "Landroidx/compose/runtime/collection/IdentityScopeMap;", "observations", OperatorName.CLOSE_PATH, "conditionallyInvalidatedScopes", "derivedStates", "Ljava/util/List;", "lateChanges", "observationsProcessed", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "invalidations", OperatorName.ENDPATH, "Z", "getPendingInvalidScopes$runtime_release", "setPendingInvalidScopes$runtime_release", "(Z)V", "pendingInvalidScopes", "o", "Landroidx/compose/runtime/CompositionImpl;", "invalidationDelegate", "p", "I", "invalidationDelegateGroup", "Landroidx/compose/runtime/ComposerImpl;", OperatorName.SAVE, "Landroidx/compose/runtime/ComposerImpl;", "composer", PDPageLabelRange.STYLE_ROMAN_LOWER, "Lkotlin/coroutines/CoroutineContext;", "_recomposeContext", OperatorName.CLOSE_AND_STROKE, "isRoot", "t", "disposed", "u", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", ComposeNavigator.NAME, "getObservedObjects$runtime_release", "()Ljava/util/List;", "observedObjects", "getDerivedStateDependencies$runtime_release", "derivedStateDependencies", "getConditionalScopes$runtime_release", "conditionalScopes", "getRecomposeContext", "()Lkotlin/coroutines/CoroutineContext;", "isComposing", "isDisposed", "getHasPendingChanges", "hasPendingChanges", "getHasInvalidations", "hasInvalidations", "areChildrenComposing", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 7 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 8 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySetKt\n+ 9 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 10 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 11 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 12 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1277:1\n891#1,2:1291\n1045#1,3:1293\n881#1,6:1297\n1048#1,7:1303\n893#1,4:1310\n891#1,2:1541\n1045#1,3:1543\n881#1,6:1546\n1048#1,7:1552\n893#1,4:1559\n891#1,2:1572\n1045#1,10:1574\n893#1,4:1584\n891#1,2:1666\n1045#1,10:1668\n893#1,4:1678\n891#1,2:1683\n1045#1,10:1685\n893#1,4:1695\n891#1,2:1700\n1045#1,10:1702\n893#1,4:1712\n1045#1,10:1716\n70#2:1278\n70#2:1280\n70#2:1296\n70#2:1314\n70#2:1323\n70#2:1324\n70#2:1528\n70#2:1540\n70#2:1665\n70#2:1682\n70#2:1699\n70#2:1726\n70#2:1729\n70#2:1730\n70#2:1731\n1#3:1279\n1#3:1742\n93#4,2:1281\n33#4,4:1283\n95#4,2:1287\n38#4:1289\n97#4:1290\n110#4,2:1563\n33#4,6:1565\n112#4:1571\n33#4,6:1603\n33#4,6:1745\n162#5,8:1315\n162#5,8:1588\n162#5,4:1599\n167#5,3:1609\n80#6,3:1325\n84#6:1335\n80#6,3:1343\n84#6:1353\n228#6:1366\n244#6,8:1367\n229#6:1375\n230#6:1395\n252#6,17:1396\n231#6:1413\n228#6:1414\n244#6,8:1415\n229#6:1423\n230#6:1443\n252#6,17:1444\n231#6:1461\n228#6:1462\n244#6,8:1463\n229#6:1471\n230#6:1491\n252#6,17:1492\n231#6:1509\n80#6,3:1517\n84#6:1527\n80#6,3:1529\n84#6:1539\n228#6:1616\n244#6,8:1617\n229#6:1625\n230#6:1645\n252#6,17:1646\n231#6:1663\n108#7,7:1328\n108#7,5:1338\n108#7,7:1346\n114#7:1354\n108#7,7:1357\n269#7,19:1376\n269#7,19:1424\n269#7,19:1472\n108#7,7:1520\n108#7,7:1532\n269#7,19:1626\n384#8,2:1336\n387#8:1355\n389#8:1365\n1855#9:1356\n1856#9:1364\n1271#10,7:1510\n46#11,3:1596\n50#11:1612\n46#11,3:1613\n50#11:1664\n13579#12,2:1727\n11653#12,9:1732\n13579#12:1741\n13580#12:1743\n11662#12:1744\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n584#1:1291,2\n584#1:1293,3\n587#1:1297,6\n584#1:1303,7\n584#1:1310,4\n779#1:1541,2\n779#1:1543,3\n780#1:1546,6\n779#1:1552,7\n779#1:1559,4\n793#1:1572,2\n793#1:1574,10\n793#1:1584,4\n848#1:1666,2\n848#1:1668,10\n848#1:1678,4\n857#1:1683,2\n857#1:1685,10\n857#1:1695,4\n867#1:1700,2\n867#1:1702,10\n867#1:1712,4\n892#1:1716,10\n515#1:1278\n524#1:1280\n585#1:1296\n595#1:1314\n637#1:1323\n658#1:1324\n767#1:1528\n777#1:1540\n847#1:1665\n856#1:1682\n866#1:1699\n906#1:1726\n912#1:1729\n947#1:1730\n970#1:1731\n1032#1:1742\n531#1:1281,2\n531#1:1283,4\n531#1:1287,2\n531#1:1289\n531#1:1290\n792#1:1563,2\n792#1:1565,6\n792#1:1571\n817#1:1603,6\n1033#1:1745,6\n622#1:1315,8\n801#1:1588,8\n815#1:1599,4\n815#1:1609,3\n681#1:1325,3\n681#1:1335\n706#1:1343,3\n706#1:1353\n714#1:1366\n714#1:1367,8\n714#1:1375\n714#1:1395\n714#1:1396,17\n714#1:1413\n721#1:1414\n721#1:1415,8\n721#1:1423\n721#1:1443\n721#1:1444,17\n721#1:1461\n728#1:1462\n728#1:1463,8\n728#1:1471\n728#1:1491\n728#1:1492,17\n728#1:1509\n759#1:1517,3\n759#1:1527\n772#1:1529,3\n772#1:1539\n834#1:1616\n834#1:1617,8\n834#1:1625\n834#1:1645\n834#1:1646,17\n834#1:1663\n681#1:1328,7\n700#1:1338,5\n706#1:1346,7\n700#1:1354\n706#1:1357,7\n714#1:1376,19\n721#1:1424,19\n728#1:1472,19\n759#1:1520,7\n772#1:1532,7\n834#1:1626,19\n700#1:1336,2\n700#1:1355\n700#1:1365\n700#1:1356\n700#1:1364\n730#1:1510,7\n811#1:1596,3\n811#1:1612\n832#1:1613,3\n832#1:1664\n907#1:1727,2\n1032#1:1732,9\n1032#1:1741\n1032#1:1743\n1032#1:1744\n*E\n"})
/* loaded from: classes2.dex */
public final class CompositionImpl implements ControlledComposition, RecomposeScopeOwner {

    /* renamed from: a */
    public final CompositionContext f28278a;

    /* renamed from: b */
    public final Applier f28279b;

    /* renamed from: c */
    public final AtomicReference f28280c;

    /* renamed from: d */
    public final Object f28281d;

    /* renamed from: e */
    public final HashSet f28282e;

    /* renamed from: f */
    public final SlotTable f28283f;

    /* renamed from: g */
    public final IdentityScopeMap f28284g;

    /* renamed from: h */
    public final HashSet f28285h;

    /* renamed from: i */
    public final IdentityScopeMap f28286i;

    /* renamed from: j */
    public final List f28287j;

    /* renamed from: k */
    public final List f28288k;

    /* renamed from: l */
    public final IdentityScopeMap f28289l;

    /* renamed from: m */
    public IdentityArrayMap f28290m;

    /* renamed from: n */
    public boolean f28291n;

    /* renamed from: o */
    public CompositionImpl f28292o;

    /* renamed from: p */
    public int f28293p;

    /* renamed from: q */
    public final ComposerImpl f28294q;

    /* renamed from: r */
    public final CoroutineContext f28295r;

    /* renamed from: s */
    public final boolean f28296s;

    /* renamed from: t */
    public boolean f28297t;

    /* renamed from: u */
    public Function2 f28298u;

    /* renamed from: androidx.compose.runtime.CompositionImpl$a */
    /* loaded from: classes2.dex */
    public static final class C3441a implements RememberManager {

        /* renamed from: a */
        public final Set f28299a;

        /* renamed from: b */
        public final List f28300b;

        /* renamed from: c */
        public final List f28301c;

        /* renamed from: d */
        public final List f28302d;

        /* renamed from: e */
        public List f28303e;

        /* renamed from: f */
        public List f28304f;

        public C3441a(Set abandoning) {
            Intrinsics.checkNotNullParameter(abandoning, "abandoning");
            this.f28299a = abandoning;
            this.f28300b = new ArrayList();
            this.f28301c = new ArrayList();
            this.f28302d = new ArrayList();
        }

        /* renamed from: a */
        public final void m60280a() {
            if (!this.f28299a.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:abandons");
                try {
                    Iterator it = this.f28299a.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        ((RememberObserver) it.next()).onAbandoned();
                    }
                    Unit unit = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(beginSection);
                } catch (Throwable th2) {
                    Trace.INSTANCE.endSection(beginSection);
                    throw th2;
                }
            }
        }

        /* renamed from: b */
        public final void m60279b() {
            Object beginSection;
            List list = this.f28303e;
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                beginSection = Trace.INSTANCE.beginSection("Compose:deactivations");
                try {
                    for (int size = list.size() - 1; -1 < size; size--) {
                        ((ComposeNodeLifecycleCallback) list.get(size)).onDeactivate();
                    }
                    Unit unit = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(beginSection);
                    list.clear();
                } finally {
                }
            }
            if (!this.f28301c.isEmpty()) {
                beginSection = Trace.INSTANCE.beginSection("Compose:onForgotten");
                try {
                    for (int size2 = this.f28301c.size() - 1; -1 < size2; size2--) {
                        RememberObserver rememberObserver = (RememberObserver) this.f28301c.get(size2);
                        if (!this.f28299a.contains(rememberObserver)) {
                            rememberObserver.onForgotten();
                        }
                    }
                    Unit unit2 = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(beginSection);
                } finally {
                }
            }
            if (!this.f28300b.isEmpty()) {
                Object beginSection2 = Trace.INSTANCE.beginSection("Compose:onRemembered");
                try {
                    List list3 = this.f28300b;
                    int size3 = list3.size();
                    for (int i = 0; i < size3; i++) {
                        RememberObserver rememberObserver2 = (RememberObserver) list3.get(i);
                        this.f28299a.remove(rememberObserver2);
                        rememberObserver2.onRemembered();
                    }
                    Unit unit3 = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(beginSection2);
                } finally {
                    Trace.INSTANCE.endSection(beginSection2);
                }
            }
            List list4 = this.f28304f;
            List list5 = list4;
            if (list5 != null && !list5.isEmpty()) {
                beginSection = Trace.INSTANCE.beginSection("Compose:releases");
                try {
                    for (int size4 = list4.size() - 1; -1 < size4; size4--) {
                        ((ComposeNodeLifecycleCallback) list4.get(size4)).onRelease();
                    }
                    Unit unit4 = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(beginSection);
                    list4.clear();
                } finally {
                    Trace.INSTANCE.endSection(beginSection);
                }
            }
        }

        /* renamed from: c */
        public final void m60278c() {
            if (!this.f28302d.isEmpty()) {
                Object beginSection = Trace.INSTANCE.beginSection("Compose:sideeffects");
                try {
                    List list = this.f28302d;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((Function0) list.get(i)).invoke();
                    }
                    this.f28302d.clear();
                    Unit unit = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(beginSection);
                } catch (Throwable th2) {
                    Trace.INSTANCE.endSection(beginSection);
                    throw th2;
                }
            }
        }

        @Override // androidx.compose.runtime.RememberManager
        public void deactivating(ComposeNodeLifecycleCallback instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            List list = this.f28303e;
            if (list == null) {
                list = new ArrayList();
                this.f28303e = list;
            }
            list.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void forgetting(RememberObserver instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int lastIndexOf = this.f28300b.lastIndexOf(instance);
            if (lastIndexOf >= 0) {
                this.f28300b.remove(lastIndexOf);
                this.f28299a.remove(instance);
                return;
            }
            this.f28301c.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void releasing(ComposeNodeLifecycleCallback instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            List list = this.f28304f;
            if (list == null) {
                list = new ArrayList();
                this.f28304f = list;
            }
            list.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void remembering(RememberObserver instance) {
            Intrinsics.checkNotNullParameter(instance, "instance");
            int lastIndexOf = this.f28301c.lastIndexOf(instance);
            if (lastIndexOf >= 0) {
                this.f28301c.remove(lastIndexOf);
                this.f28299a.remove(instance);
                return;
            }
            this.f28300b.add(instance);
        }

        @Override // androidx.compose.runtime.RememberManager
        public void sideEffect(Function0 effect) {
            Intrinsics.checkNotNullParameter(effect, "effect");
            this.f28302d.add(effect);
        }
    }

    public CompositionImpl(@NotNull CompositionContext parent, @NotNull Applier<?> applier, @Nullable CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(applier, "applier");
        this.f28278a = parent;
        this.f28279b = applier;
        this.f28280c = new AtomicReference(null);
        this.f28281d = new Object();
        HashSet hashSet = new HashSet();
        this.f28282e = hashSet;
        SlotTable slotTable = new SlotTable();
        this.f28283f = slotTable;
        this.f28284g = new IdentityScopeMap();
        this.f28285h = new HashSet();
        this.f28286i = new IdentityScopeMap();
        ArrayList arrayList = new ArrayList();
        this.f28287j = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f28288k = arrayList2;
        this.f28289l = new IdentityScopeMap();
        this.f28290m = new IdentityArrayMap(0, 1, null);
        ComposerImpl composerImpl = new ComposerImpl(applier, parent, slotTable, hashSet, arrayList, arrayList2, this);
        parent.registerComposer$runtime_release(composerImpl);
        this.f28294q = composerImpl;
        this.f28295r = coroutineContext;
        this.f28296s = parent instanceof Recomposer;
        this.f28298u = ComposableSingletons$CompositionKt.INSTANCE.m71378getLambda1$runtime_release();
    }

    /* renamed from: a */
    public final void m60293a() {
        this.f28280c.set(null);
        this.f28287j.clear();
        this.f28288k.clear();
        this.f28282e.clear();
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyChanges() {
        synchronized (this.f28281d) {
            try {
                m60290d(this.f28287j);
                m60287g();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f28282e.isEmpty()) {
                            new C3441a(this.f28282e).m60280a();
                        }
                        throw th2;
                    } catch (Exception e) {
                        m60293a();
                        throw e;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void applyLateChanges() {
        synchronized (this.f28281d) {
            try {
                if (!this.f28288k.isEmpty()) {
                    m60290d(this.f28288k);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f28282e.isEmpty()) {
                            new C3441a(this.f28282e).m60280a();
                        }
                        throw th2;
                    } catch (Exception e) {
                        m60293a();
                        throw e;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    /* renamed from: b */
    public final HashSet m60292b(HashSet hashSet, Object obj, boolean z) {
        IdentityScopeMap identityScopeMap = this.f28284g;
        int m60104a = identityScopeMap.m60104a(obj);
        if (m60104a >= 0) {
            IdentityArraySet m60101d = identityScopeMap.m60101d(m60104a);
            Object[] values = m60101d.getValues();
            int size = m60101d.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = values[i];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
                if (!this.f28289l.remove(obj, recomposeScopeImpl) && recomposeScopeImpl.invalidateForResult(obj) != InvalidationResult.IGNORED) {
                    if (recomposeScopeImpl.isConditional() && !z) {
                        this.f28285h.add(recomposeScopeImpl);
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet();
                        }
                        hashSet.add(recomposeScopeImpl);
                    }
                }
            }
        }
        return hashSet;
    }

    /* renamed from: c */
    public final void m60291c(Set set, boolean z) {
        HashSet hashSet;
        int i;
        if (set instanceof IdentityArraySet) {
            IdentityArraySet identityArraySet = (IdentityArraySet) set;
            Object[] values = identityArraySet.getValues();
            int size = identityArraySet.size();
            hashSet = null;
            for (int i2 = 0; i2 < size; i2++) {
                Object obj = values[i2];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (obj instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj).invalidateForResult(null);
                } else {
                    hashSet = m60292b(hashSet, obj, z);
                    IdentityScopeMap identityScopeMap = this.f28286i;
                    int m60104a = identityScopeMap.m60104a(obj);
                    if (m60104a >= 0) {
                        IdentityArraySet m60101d = identityScopeMap.m60101d(m60104a);
                        Object[] values2 = m60101d.getValues();
                        int size2 = m60101d.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            Object obj2 = values2[i3];
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            hashSet = m60292b(hashSet, (DerivedState) obj2, z);
                        }
                    }
                }
            }
        } else {
            hashSet = null;
            for (Object obj3 : set) {
                if (obj3 instanceof RecomposeScopeImpl) {
                    ((RecomposeScopeImpl) obj3).invalidateForResult(null);
                } else {
                    HashSet m60292b = m60292b(hashSet, obj3, z);
                    IdentityScopeMap identityScopeMap2 = this.f28286i;
                    int m60104a2 = identityScopeMap2.m60104a(obj3);
                    if (m60104a2 >= 0) {
                        IdentityArraySet m60101d2 = identityScopeMap2.m60101d(m60104a2);
                        Object[] values3 = m60101d2.getValues();
                        int size3 = m60101d2.size();
                        for (int i4 = 0; i4 < size3; i4++) {
                            Object obj4 = values3[i4];
                            Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            m60292b = m60292b(m60292b, (DerivedState) obj4, z);
                        }
                    }
                    hashSet = m60292b;
                }
            }
        }
        if (z && (!this.f28285h.isEmpty())) {
            IdentityScopeMap identityScopeMap3 = this.f28284g;
            int[] valueOrder = identityScopeMap3.getValueOrder();
            IdentityArraySet[] scopeSets = identityScopeMap3.getScopeSets();
            Object[] values4 = identityScopeMap3.getValues();
            int size4 = identityScopeMap3.getSize();
            int i5 = 0;
            int i6 = 0;
            while (i5 < size4) {
                int i7 = valueOrder[i5];
                IdentityArraySet identityArraySet2 = scopeSets[i7];
                Intrinsics.checkNotNull(identityArraySet2);
                Object[] values5 = identityArraySet2.getValues();
                int size5 = identityArraySet2.size();
                int i8 = 0;
                int i9 = 0;
                while (i8 < size5) {
                    Object obj5 = values5[i8];
                    Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    IdentityArraySet[] identityArraySetArr = scopeSets;
                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj5;
                    int i10 = size4;
                    if (!this.f28285h.contains(recomposeScopeImpl)) {
                        if (hashSet != null && hashSet.contains(recomposeScopeImpl)) {
                            i = i9;
                        }
                        int i11 = i9;
                        if (i11 != i8) {
                            values5[i11] = obj5;
                        }
                        i9 = i11 + 1;
                        i8++;
                        scopeSets = identityArraySetArr;
                        size4 = i10;
                    } else {
                        i = i9;
                    }
                    i9 = i;
                    i8++;
                    scopeSets = identityArraySetArr;
                    size4 = i10;
                }
                IdentityArraySet[] identityArraySetArr2 = scopeSets;
                int i12 = size4;
                int i13 = i9;
                for (int i14 = i13; i14 < size5; i14++) {
                    values5[i14] = null;
                }
                identityArraySet2.f28492a = i13;
                if (identityArraySet2.size() > 0) {
                    if (i6 != i5) {
                        int i15 = valueOrder[i6];
                        valueOrder[i6] = i7;
                        valueOrder[i5] = i15;
                    }
                    i6++;
                }
                i5++;
                scopeSets = identityArraySetArr2;
                size4 = i12;
            }
            int size6 = identityScopeMap3.getSize();
            for (int i16 = i6; i16 < size6; i16++) {
                values4[valueOrder[i16]] = null;
            }
            identityScopeMap3.setSize(i6);
            this.f28285h.clear();
            m60289e();
        } else if (hashSet != null) {
            IdentityScopeMap identityScopeMap4 = this.f28284g;
            int[] valueOrder2 = identityScopeMap4.getValueOrder();
            IdentityArraySet[] scopeSets2 = identityScopeMap4.getScopeSets();
            Object[] values6 = identityScopeMap4.getValues();
            int size7 = identityScopeMap4.getSize();
            int i17 = 0;
            int i18 = 0;
            while (i17 < size7) {
                int i19 = valueOrder2[i17];
                IdentityArraySet identityArraySet3 = scopeSets2[i19];
                Intrinsics.checkNotNull(identityArraySet3);
                Object[] values7 = identityArraySet3.getValues();
                int size8 = identityArraySet3.size();
                int i20 = 0;
                int i21 = 0;
                while (i20 < size8) {
                    Object obj6 = values7[i20];
                    Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                    IdentityArraySet[] identityArraySetArr3 = scopeSets2;
                    if (!hashSet.contains((RecomposeScopeImpl) obj6)) {
                        if (i21 != i20) {
                            values7[i21] = obj6;
                        }
                        i21++;
                    }
                    i20++;
                    scopeSets2 = identityArraySetArr3;
                }
                IdentityArraySet[] identityArraySetArr4 = scopeSets2;
                for (int i22 = i21; i22 < size8; i22++) {
                    values7[i22] = null;
                }
                identityArraySet3.f28492a = i21;
                if (identityArraySet3.size() > 0) {
                    if (i18 != i17) {
                        int i23 = valueOrder2[i18];
                        valueOrder2[i18] = i19;
                        valueOrder2[i17] = i23;
                    }
                    i18++;
                }
                i17++;
                scopeSets2 = identityArraySetArr4;
            }
            int size9 = identityScopeMap4.getSize();
            for (int i24 = i18; i24 < size9; i24++) {
                values6[valueOrder2[i24]] = null;
            }
            identityScopeMap4.setSize(i18);
            m60289e();
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void changesApplied() {
        synchronized (this.f28281d) {
            try {
                this.f28294q.changesApplied$runtime_release();
                if (!this.f28282e.isEmpty()) {
                    new C3441a(this.f28282e).m60280a();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                try {
                    try {
                        if (!this.f28282e.isEmpty()) {
                            new C3441a(this.f28282e).m60280a();
                        }
                        throw th2;
                    } catch (Exception e) {
                        m60293a();
                        throw e;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void composeContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        try {
            synchronized (this.f28281d) {
                m60288f();
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> m60283k = m60283k();
                try {
                    this.f28294q.composeContent$runtime_release(m60283k, content);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    this.f28290m = m60283k;
                    throw e;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.f28282e.isEmpty()) {
                    new C3441a(this.f28282e).m60280a();
                }
                throw th2;
            } catch (Exception e2) {
                m60293a();
                throw e2;
            }
        }
    }

    /* renamed from: d */
    public final void m60290d(List list) {
        C3441a c3441a = new C3441a(this.f28282e);
        try {
            if (list.isEmpty()) {
                if (this.f28288k.isEmpty()) {
                    c3441a.m60280a();
                    return;
                }
                return;
            }
            Object beginSection = Trace.INSTANCE.beginSection("Compose:applyChanges");
            this.f28279b.onBeginChanges();
            SlotWriter openWriter = this.f28283f.openWriter();
            try {
                Applier applier = this.f28279b;
                int size = list.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function3) list.get(i2)).invoke(applier, openWriter, c3441a);
                }
                list.clear();
                Unit unit = Unit.INSTANCE;
                openWriter.close();
                this.f28279b.onEndChanges();
                Trace trace = Trace.INSTANCE;
                trace.endSection(beginSection);
                c3441a.m60279b();
                c3441a.m60278c();
                if (this.f28291n) {
                    Object beginSection2 = trace.beginSection("Compose:unobserve");
                    this.f28291n = false;
                    IdentityScopeMap identityScopeMap = this.f28284g;
                    int[] valueOrder = identityScopeMap.getValueOrder();
                    IdentityArraySet[] scopeSets = identityScopeMap.getScopeSets();
                    Object[] values = identityScopeMap.getValues();
                    int size2 = identityScopeMap.getSize();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < size2) {
                        int i5 = valueOrder[i3];
                        IdentityArraySet identityArraySet = scopeSets[i5];
                        Intrinsics.checkNotNull(identityArraySet);
                        Object[] values2 = identityArraySet.getValues();
                        int size3 = identityArraySet.size();
                        int i6 = 0;
                        while (i < size3) {
                            IdentityArraySet[] identityArraySetArr = scopeSets;
                            Object obj = values2[i];
                            int i7 = size2;
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                            if (!(!((RecomposeScopeImpl) obj).getValid())) {
                                if (i6 != i) {
                                    values2[i6] = obj;
                                }
                                i6++;
                            }
                            i++;
                            scopeSets = identityArraySetArr;
                            size2 = i7;
                        }
                        IdentityArraySet[] identityArraySetArr2 = scopeSets;
                        int i8 = size2;
                        for (int i9 = i6; i9 < size3; i9++) {
                            values2[i9] = null;
                        }
                        identityArraySet.f28492a = i6;
                        if (identityArraySet.size() > 0) {
                            if (i4 != i3) {
                                int i10 = valueOrder[i4];
                                valueOrder[i4] = i5;
                                valueOrder[i3] = i10;
                            }
                            i4++;
                        }
                        i3++;
                        scopeSets = identityArraySetArr2;
                        size2 = i8;
                        i = 0;
                    }
                    int size4 = identityScopeMap.getSize();
                    for (int i11 = i4; i11 < size4; i11++) {
                        values[valueOrder[i11]] = null;
                    }
                    identityScopeMap.setSize(i4);
                    m60289e();
                    Unit unit2 = Unit.INSTANCE;
                    Trace.INSTANCE.endSection(beginSection2);
                }
                if (this.f28288k.isEmpty()) {
                    c3441a.m60280a();
                }
            } finally {
                openWriter.close();
            }
        } finally {
            if (this.f28288k.isEmpty()) {
                c3441a.m60280a();
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public <R> R delegateInvalidations(@Nullable ControlledComposition controlledComposition, int i, @NotNull Function0<? extends R> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (controlledComposition != null && !Intrinsics.areEqual(controlledComposition, this) && i >= 0) {
            this.f28292o = (CompositionImpl) controlledComposition;
            this.f28293p = i;
            try {
                return block.invoke();
            } finally {
                this.f28292o = null;
                this.f28293p = 0;
            }
        }
        return block.invoke();
    }

    @Override // androidx.compose.runtime.Composition
    public void dispose() {
        boolean z;
        synchronized (this.f28281d) {
            try {
                if (!this.f28297t) {
                    this.f28297t = true;
                    this.f28298u = ComposableSingletons$CompositionKt.INSTANCE.m71379getLambda2$runtime_release();
                    List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> deferredChanges$runtime_release = this.f28294q.getDeferredChanges$runtime_release();
                    if (deferredChanges$runtime_release != null) {
                        m60290d(deferredChanges$runtime_release);
                    }
                    if (this.f28283f.getGroupsSize() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z || (true ^ this.f28282e.isEmpty())) {
                        C3441a c3441a = new C3441a(this.f28282e);
                        if (z) {
                            this.f28279b.onBeginChanges();
                            SlotWriter openWriter = this.f28283f.openWriter();
                            ComposerKt.removeCurrentGroup(openWriter, c3441a);
                            Unit unit = Unit.INSTANCE;
                            openWriter.close();
                            this.f28279b.clear();
                            this.f28279b.onEndChanges();
                            c3441a.m60279b();
                        }
                        c3441a.m60280a();
                    }
                    this.f28294q.dispose$runtime_release();
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f28278a.unregisterComposition$runtime_release(this);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void disposeUnusedMovableContent(@NotNull MovableContentState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        C3441a c3441a = new C3441a(this.f28282e);
        SlotWriter openWriter = state.getSlotTable$runtime_release().openWriter();
        try {
            ComposerKt.removeCurrentGroup(openWriter, c3441a);
            Unit unit = Unit.INSTANCE;
            openWriter.close();
            c3441a.m60279b();
        } catch (Throwable th2) {
            openWriter.close();
            throw th2;
        }
    }

    /* renamed from: e */
    public final void m60289e() {
        IdentityScopeMap identityScopeMap = this.f28286i;
        int[] valueOrder = identityScopeMap.getValueOrder();
        IdentityArraySet[] scopeSets = identityScopeMap.getScopeSets();
        Object[] values = identityScopeMap.getValues();
        int size = identityScopeMap.getSize();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int i3 = valueOrder[i];
            IdentityArraySet identityArraySet = scopeSets[i3];
            Intrinsics.checkNotNull(identityArraySet);
            Object[] values2 = identityArraySet.getValues();
            int size2 = identityArraySet.size();
            int i4 = 0;
            int i5 = 0;
            while (i4 < size2) {
                Object obj = values2[i4];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                IdentityArraySet[] identityArraySetArr = scopeSets;
                if (!(!this.f28284g.contains((DerivedState) obj))) {
                    if (i5 != i4) {
                        values2[i5] = obj;
                    }
                    i5++;
                }
                i4++;
                scopeSets = identityArraySetArr;
            }
            IdentityArraySet[] identityArraySetArr2 = scopeSets;
            for (int i6 = i5; i6 < size2; i6++) {
                values2[i6] = null;
            }
            identityArraySet.f28492a = i5;
            if (identityArraySet.size() > 0) {
                if (i2 != i) {
                    int i7 = valueOrder[i2];
                    valueOrder[i2] = i3;
                    valueOrder[i] = i7;
                }
                i2++;
            }
            i++;
            scopeSets = identityArraySetArr2;
        }
        int size3 = identityScopeMap.getSize();
        for (int i8 = i2; i8 < size3; i8++) {
            values[valueOrder[i8]] = null;
        }
        identityScopeMap.setSize(i2);
        if (!this.f28285h.isEmpty()) {
            Iterator it = this.f28285h.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator()");
            while (it.hasNext()) {
                if (!((RecomposeScopeImpl) it.next()).isConditional()) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: f */
    public final void m60288f() {
        Object obj;
        Object obj2;
        AtomicReference atomicReference = this.f28280c;
        obj = CompositionKt.f28305a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = CompositionKt.f28305a;
            if (!Intrinsics.areEqual(andSet, obj2)) {
                if (andSet instanceof Set) {
                    m60291c((Set) andSet, true);
                    return;
                } else if (andSet instanceof Object[]) {
                    for (Set set : (Set[]) andSet) {
                        m60291c(set, true);
                    }
                    return;
                } else {
                    ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.f28280c);
                    throw new KotlinNothingValueException();
                }
            }
            ComposerKt.composeRuntimeError("pending composition has not been applied");
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: g */
    public final void m60287g() {
        Object obj;
        Object andSet = this.f28280c.getAndSet(null);
        obj = CompositionKt.f28305a;
        if (!Intrinsics.areEqual(andSet, obj)) {
            if (andSet instanceof Set) {
                m60291c((Set) andSet, false);
            } else if (andSet instanceof Object[]) {
                for (Set set : (Set[]) andSet) {
                    m60291c(set, false);
                }
            } else if (andSet == null) {
                ComposerKt.composeRuntimeError("calling recordModificationsOf and applyChanges concurrently is not supported");
                throw new KotlinNothingValueException();
            } else {
                ComposerKt.composeRuntimeError("corrupt pendingModifications drain: " + this.f28280c);
                throw new KotlinNothingValueException();
            }
        }
    }

    @NotNull
    public final Function2<Composer, Integer, Unit> getComposable() {
        return this.f28298u;
    }

    @NotNull
    public final List<RecomposeScopeImpl> getConditionalScopes$runtime_release() {
        return CollectionsKt___CollectionsKt.toList(this.f28285h);
    }

    @NotNull
    public final List<Object> getDerivedStateDependencies$runtime_release() {
        return ArraysKt___ArraysKt.filterNotNull(this.f28286i.getValues());
    }

    @Override // androidx.compose.runtime.Composition
    public boolean getHasInvalidations() {
        boolean z;
        synchronized (this.f28281d) {
            if (this.f28290m.getSize() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean getHasPendingChanges() {
        boolean hasPendingChanges$runtime_release;
        synchronized (this.f28281d) {
            hasPendingChanges$runtime_release = this.f28294q.getHasPendingChanges$runtime_release();
        }
        return hasPendingChanges$runtime_release;
    }

    @NotNull
    public final List<Object> getObservedObjects$runtime_release() {
        return ArraysKt___ArraysKt.filterNotNull(this.f28284g.getValues());
    }

    public final boolean getPendingInvalidScopes$runtime_release() {
        return this.f28291n;
    }

    @NotNull
    public final CoroutineContext getRecomposeContext() {
        CoroutineContext coroutineContext = this.f28295r;
        if (coroutineContext == null) {
            return this.f28278a.getRecomposeCoroutineContext$runtime_release();
        }
        return coroutineContext;
    }

    @NotNull
    public final SlotTable getSlotTable$runtime_release() {
        return this.f28283f;
    }

    /* renamed from: h */
    public final boolean m60286h() {
        return this.f28294q.getAreChildrenComposing$runtime_release();
    }

    /* renamed from: i */
    public final InvalidationResult m60285i(RecomposeScopeImpl recomposeScopeImpl, Anchor anchor, Object obj) {
        synchronized (this.f28281d) {
            try {
                CompositionImpl compositionImpl = this.f28292o;
                if (compositionImpl == null || !this.f28283f.groupContainsAnchor(this.f28293p, anchor)) {
                    compositionImpl = null;
                }
                if (compositionImpl == null) {
                    if (m60282l(recomposeScopeImpl, obj)) {
                        return InvalidationResult.IMMINENT;
                    } else if (obj != null) {
                        CompositionKt.m60277a(this.f28290m, recomposeScopeImpl, obj);
                    } else {
                        this.f28290m.set(recomposeScopeImpl, null);
                    }
                }
                if (compositionImpl != null) {
                    return compositionImpl.m60285i(recomposeScopeImpl, anchor, obj);
                }
                this.f28278a.invalidate$runtime_release(this);
                if (isComposing()) {
                    return InvalidationResult.DEFERRED;
                }
                return InvalidationResult.SCHEDULED;
            } finally {
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void insertMovableContent(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        Intrinsics.checkNotNullParameter(references, "references");
        int size = references.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < size) {
                if (!Intrinsics.areEqual(references.get(i).getFirst().getComposition$runtime_release(), this)) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        ComposerKt.runtimeCheck(z);
        try {
            this.f28294q.insertMovableContentReferences(references);
            Unit unit = Unit.INSTANCE;
        } finally {
        }
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    @NotNull
    public InvalidationResult invalidate(@NotNull RecomposeScopeImpl scope, @Nullable Object obj) {
        CompositionImpl compositionImpl;
        Intrinsics.checkNotNullParameter(scope, "scope");
        if (scope.getDefaultsInScope()) {
            scope.setDefaultsInvalid(true);
        }
        Anchor anchor = scope.getAnchor();
        if (anchor != null && anchor.getValid()) {
            if (!this.f28283f.ownsAnchor(anchor)) {
                synchronized (this.f28281d) {
                    compositionImpl = this.f28292o;
                }
                if (compositionImpl != null && compositionImpl.m60282l(scope, obj)) {
                    return InvalidationResult.IMMINENT;
                }
                return InvalidationResult.IGNORED;
            } else if (!scope.getCanRecompose()) {
                return InvalidationResult.IGNORED;
            } else {
                return m60285i(scope, anchor, obj);
            }
        }
        return InvalidationResult.IGNORED;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void invalidateAll() {
        Object[] slots;
        RecomposeScopeImpl recomposeScopeImpl;
        synchronized (this.f28281d) {
            try {
                for (Object obj : this.f28283f.getSlots()) {
                    if (obj instanceof RecomposeScopeImpl) {
                        recomposeScopeImpl = (RecomposeScopeImpl) obj;
                    } else {
                        recomposeScopeImpl = null;
                    }
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void invalidateGroupsWithKey(int i) {
        List<RecomposeScopeImpl> invalidateGroupsWithKey$runtime_release;
        synchronized (this.f28281d) {
            invalidateGroupsWithKey$runtime_release = this.f28283f.invalidateGroupsWithKey$runtime_release(i);
        }
        if (invalidateGroupsWithKey$runtime_release != null) {
            int size = invalidateGroupsWithKey$runtime_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (invalidateGroupsWithKey$runtime_release.get(i2).invalidateForResult(null) != InvalidationResult.IGNORED) {
                }
            }
            return;
        }
        if (this.f28294q.forceRecomposeScopes$runtime_release()) {
            this.f28278a.invalidate$runtime_release(this);
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean isComposing() {
        return this.f28294q.isComposing$runtime_release();
    }

    @Override // androidx.compose.runtime.Composition
    public boolean isDisposed() {
        return this.f28297t;
    }

    public final boolean isRoot() {
        return this.f28296s;
    }

    /* renamed from: j */
    public final void m60284j(Object obj) {
        IdentityScopeMap identityScopeMap = this.f28284g;
        int m60104a = identityScopeMap.m60104a(obj);
        if (m60104a >= 0) {
            IdentityArraySet m60101d = identityScopeMap.m60101d(m60104a);
            Object[] values = m60101d.getValues();
            int size = m60101d.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = values[i];
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj2;
                if (recomposeScopeImpl.invalidateForResult(obj) == InvalidationResult.IMMINENT) {
                    this.f28289l.add(obj, recomposeScopeImpl);
                }
            }
        }
    }

    /* renamed from: k */
    public final IdentityArrayMap m60283k() {
        IdentityArrayMap identityArrayMap = this.f28290m;
        this.f28290m = new IdentityArrayMap(0, 1, null);
        return identityArrayMap;
    }

    /* renamed from: l */
    public final boolean m60282l(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        if (isComposing() && this.f28294q.tryImminentInvalidation$runtime_release(recomposeScopeImpl, obj)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public final void m60281m(SlotTable slotTable) {
        RecomposeScopeImpl recomposeScopeImpl;
        Object[] slots = slotTable.getSlots();
        ArrayList arrayList = new ArrayList();
        for (Object obj : slots) {
            if (obj instanceof RecomposeScopeImpl) {
                recomposeScopeImpl = (RecomposeScopeImpl) obj;
            } else {
                recomposeScopeImpl = null;
            }
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i);
            Anchor anchor = recomposeScopeImpl2.getAnchor();
            if (anchor != null && !slotTable.slotsOf$runtime_release(anchor.toIndexFor(slotTable)).contains(recomposeScopeImpl2)) {
                throw new IllegalStateException(("Misaligned anchor " + anchor + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ArraysKt___ArraysKt.indexOf((RecomposeScopeImpl[]) slotTable.getSlots(), recomposeScopeImpl2)).toString());
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x000f  */
    @Override // androidx.compose.runtime.ControlledComposition
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean observesAnyOf(@org.jetbrains.annotations.NotNull java.util.Set<? extends java.lang.Object> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L25
            java.lang.Object r0 = r3.next()
            androidx.compose.runtime.collection.IdentityScopeMap r1 = r2.f28284g
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L23
            androidx.compose.runtime.collection.IdentityScopeMap r1 = r2.f28286i
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L9
        L23:
            r3 = 1
            return r3
        L25:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.CompositionImpl.observesAnyOf(java.util.Set):boolean");
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void prepareCompose(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f28294q.prepareCompose$runtime_release(block);
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public boolean recompose() {
        boolean recompose$runtime_release;
        synchronized (this.f28281d) {
            try {
                m60288f();
                IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> m60283k = m60283k();
                try {
                    recompose$runtime_release = this.f28294q.recompose$runtime_release(m60283k);
                    if (!recompose$runtime_release) {
                        m60287g();
                    }
                } catch (Exception e) {
                    this.f28290m = m60283k;
                    throw e;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return recompose$runtime_release;
    }

    @Override // androidx.compose.runtime.RecomposeScopeOwner
    public void recomposeScopeReleased(@NotNull RecomposeScopeImpl scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f28291n = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // androidx.compose.runtime.ControlledComposition
    public void recordModificationsOf(@NotNull Set<? extends Object> values) {
        Object obj;
        Object obj2;
        boolean areEqual;
        Set<? extends Object> set;
        Intrinsics.checkNotNullParameter(values, "values");
        do {
            obj = this.f28280c.get();
            if (obj != null) {
                obj2 = CompositionKt.f28305a;
                areEqual = Intrinsics.areEqual(obj, obj2);
            } else {
                areEqual = true;
            }
            if (areEqual) {
                set = values;
            } else if (obj instanceof Set) {
                set = new Set[]{obj, values};
            } else if (obj instanceof Object[]) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                set = ArraysKt___ArraysJvmKt.plus((Set<? extends Object>[]) obj, values);
            } else {
                throw new IllegalStateException(("corrupt pendingModifications: " + this.f28280c).toString());
            }
        } while (!AbstractC17300An1.m69050a(this.f28280c, obj, set));
        if (obj == null) {
            synchronized (this.f28281d) {
                m60287g();
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition, androidx.compose.runtime.RecomposeScopeOwner
    public void recordReadOf(@NotNull Object value) {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        Object[] dependencies;
        Intrinsics.checkNotNullParameter(value, "value");
        if (!m60286h() && (currentRecomposeScope$runtime_release = this.f28294q.getCurrentRecomposeScope$runtime_release()) != null) {
            currentRecomposeScope$runtime_release.setUsed(true);
            if (!currentRecomposeScope$runtime_release.recordRead(value)) {
                this.f28284g.add(value, currentRecomposeScope$runtime_release);
                if (value instanceof DerivedState) {
                    this.f28286i.removeScope(value);
                    for (Object obj : ((DerivedState) value).getCurrentRecord().getDependencies()) {
                        if (obj != null) {
                            this.f28286i.add(obj, value);
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void recordWriteOf(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f28281d) {
            try {
                m60284j(value);
                IdentityScopeMap identityScopeMap = this.f28286i;
                int m60104a = identityScopeMap.m60104a(value);
                if (m60104a >= 0) {
                    IdentityArraySet m60101d = identityScopeMap.m60101d(m60104a);
                    Object[] values = m60101d.getValues();
                    int size = m60101d.size();
                    for (int i = 0; i < size; i++) {
                        Object obj = values[i];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        m60284j((DerivedState) obj);
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void removeDerivedStateObservation$runtime_release(@NotNull DerivedState<?> state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (!this.f28284g.contains(state)) {
            this.f28286i.removeScope(state);
        }
    }

    public final void removeObservation$runtime_release(@NotNull Object instance, @NotNull RecomposeScopeImpl scope) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f28284g.remove(instance, scope);
    }

    public final void setComposable(@NotNull Function2<? super Composer, ? super Integer, Unit> function2) {
        Intrinsics.checkNotNullParameter(function2, "<set-?>");
        this.f28298u = function2;
    }

    @Override // androidx.compose.runtime.Composition
    public void setContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (!this.f28297t) {
            this.f28298u = content;
            this.f28278a.composeInitial$runtime_release(this, content);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    public final void setPendingInvalidScopes$runtime_release(boolean z) {
        this.f28291n = z;
    }

    @Override // androidx.compose.runtime.ControlledComposition
    public void verifyConsistent() {
        synchronized (this.f28281d) {
            try {
                if (!isComposing()) {
                    this.f28294q.verifyConsistent$runtime_release();
                    this.f28283f.verifyWellFormed();
                    m60281m(this.f28283f);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ CompositionImpl(CompositionContext compositionContext, Applier applier, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(compositionContext, applier, (i & 4) != 0 ? null : coroutineContext);
    }
}
