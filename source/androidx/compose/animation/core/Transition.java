package androidx.compose.animation.core;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal.p026ws.WebSocketProtocol;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0004tu6vB#\b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0010\u0012\u0006\u0010\t\u001a\u00028\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0018\u0010\rJ'\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00028\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010#\u001a\u00020 2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u00020 2\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0000¢\u0006\u0004\b$\u0010\"J)\u0010*\u001a\u00020 2\u0018\u0010'\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030&R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b(\u0010)J)\u0010-\u001a\u00020\u000b2\u0018\u0010'\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030&R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b+\u0010,J\u0017\u00100\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00028\u0000H\u0001¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00028\u0000H\u0001¢\u0006\u0004\b1\u0010/J)\u0010-\u001a\u00020\u000b2\u0018\u00104\u001a\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u000303R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0000¢\u0006\u0004\b+\u00105R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010:R+\u0010\u001a\u001a\u00028\u00002\u0006\u0010;\u001a\u00028\u00008F@@X\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR7\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000B2\f\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000B8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010E\"\u0004\b<\u0010FR1\u0010\u001b\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bH\u0010I\u0012\u0004\bM\u0010\r\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010\u0016R+\u0010O\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bN\u0010I\u001a\u0004\b6\u0010K\"\u0004\bC\u0010\u0016R+\u0010U\u001a\u00020 2\u0006\u0010;\u001a\u00020 8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bP\u0010=\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR,\u0010Y\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030&R\b\u0012\u0004\u0012\u00028\u00000\u00000V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001e\u0010[\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010XR1\u0010]\u001a\u00020 2\u0006\u0010;\u001a\u00020 8F@@X\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\\\u0010=\u0012\u0004\b_\u0010\r\u001a\u0004\b]\u0010R\"\u0004\b^\u0010TR\"\u0010d\u001a\u00020\u000e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010K\"\u0004\bc\u0010\u0016R\u001b\u0010h\u001a\u00020\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010KR$\u0010l\u001a\u00028\u00002\u0006\u0010i\u001a\u00028\u00008F@@X\u0086\u000e¢\u0006\f\u001a\u0004\bj\u0010?\"\u0004\bk\u0010AR\u0011\u0010m\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bm\u0010RR\u001b\u0010q\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000n8F¢\u0006\u0006\u001a\u0004\bo\u0010pR)\u0010s\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0002\b\u0003\u0012\u0002\b\u00030&R\b\u0012\u0004\u0012\u00028\u00000\u00000n8F¢\u0006\u0006\u001a\u0004\br\u0010p¨\u0006w"}, m28850d2 = {"Landroidx/compose/animation/core/Transition;", "S", "", "Landroidx/compose/animation/core/MutableTransitionState;", "transitionState", "", "label", "<init>", "(Landroidx/compose/animation/core/MutableTransitionState;Ljava/lang/String;)V", "initialState", "(Ljava/lang/Object;Ljava/lang/String;)V", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()V", "", "frameTimeNanos", "", "durationScale", "onFrame$animation_core_release", "(JF)V", "onFrame", "onTransitionStart$animation_core_release", "(J)V", "onTransitionStart", "onTransitionEnd$animation_core_release", "onTransitionEnd", "targetState", "playTimeNanos", "seek", "(Ljava/lang/Object;Ljava/lang/Object;J)V", "setPlaytimeAfterInitialAndTargetStateEstablished", "transition", "", "addTransition$animation_core_release", "(Landroidx/compose/animation/core/Transition;)Z", "addTransition", "removeTransition$animation_core_release", "removeTransition", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "animation", "addAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)Z", "addAnimation", "removeAnimation$animation_core_release", "(Landroidx/compose/animation/core/Transition$TransitionAnimationState;)V", "removeAnimation", "updateTarget$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)V", "updateTarget", "animateTo$animation_core_release", "animateTo", "Landroidx/compose/animation/core/Transition$DeferredAnimation;", "deferredAnimation", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/MutableTransitionState;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", OperatorName.CURVE_TO, "Landroidx/compose/runtime/MutableState;", "getTargetState", "()Ljava/lang/Object;", "setTargetState$animation_core_release", "(Ljava/lang/Object;)V", "Landroidx/compose/animation/core/Transition$Segment;", "d", "getSegment", "()Landroidx/compose/animation/core/Transition$Segment;", "(Landroidx/compose/animation/core/Transition$Segment;)V", "segment", "e", "Landroidx/compose/runtime/MutableLongState;", "getPlayTimeNanos", "()J", "setPlayTimeNanos", "getPlayTimeNanos$annotations", OperatorName.FILL_NON_ZERO, "startTimeNanos", OperatorName.NON_STROKING_GRAY, "getUpdateChildrenNeeded$animation_core_release", "()Z", "setUpdateChildrenNeeded$animation_core_release", "(Z)V", "updateChildrenNeeded", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", OperatorName.CLOSE_PATH, "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "_animations", "i", "_transitions", OperatorName.SET_LINE_JOINSTYLE, "isSeeking", "setSeeking$animation_core_release", "isSeeking$annotations", OperatorName.NON_STROKING_CMYK, OperatorName.SET_LINE_CAPSTYLE, "getLastSeekedTimeNanos$animation_core_release", "setLastSeekedTimeNanos$animation_core_release", "lastSeekedTimeNanos", OperatorName.LINE_TO, "Landroidx/compose/runtime/State;", "getTotalDurationNanos", "totalDurationNanos", "value", "getCurrentState", "setCurrentState$animation_core_release", "currentState", "isRunning", "", "getTransitions", "()Ljava/util/List;", "transitions", "getAnimations", "animations", "DeferredAnimation", "Segment", "TransitionAnimationState", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,1156:1\n81#2:1157\n107#2,2:1158\n81#2:1160\n107#2,2:1161\n81#2:1169\n107#2,2:1170\n81#2:1172\n107#2,2:1173\n81#2:1175\n76#3:1163\n109#3,2:1164\n76#3:1166\n109#3,2:1167\n1855#4,2:1176\n1855#4,2:1178\n1855#4,2:1180\n1855#4,2:1182\n1855#4,2:1184\n1855#4,2:1193\n36#5:1186\n1097#6,6:1187\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition\n*L\n213#1:1157\n213#1:1158,2\n220#1:1160\n220#1:1161,2\n239#1:1169\n239#1:1170,2\n259#1:1172\n259#1:1173,2\n271#1:1175\n235#1:1163\n235#1:1164,2\n236#1:1166\n236#1:1167,2\n295#1:1176,2\n304#1:1178,2\n365#1:1180,2\n378#1:1182,2\n417#1:1184,2\n454#1:1193,2\n432#1:1186\n432#1:1187,6\n*E\n"})
/* loaded from: classes.dex */
public final class Transition<S> {
    public static final int $stable = 0;

    /* renamed from: a */
    public final MutableTransitionState f12593a;

    /* renamed from: b */
    public final String f12594b;

    /* renamed from: c */
    public final MutableState f12595c;

    /* renamed from: d */
    public final MutableState f12596d;

    /* renamed from: e */
    public final MutableLongState f12597e;

    /* renamed from: f */
    public final MutableLongState f12598f;

    /* renamed from: g */
    public final MutableState f12599g;

    /* renamed from: h */
    public final SnapshotStateList f12600h;

    /* renamed from: i */
    public final SnapshotStateList f12601i;

    /* renamed from: j */
    public final MutableState f12602j;

    /* renamed from: k */
    public long f12603k;

    /* renamed from: l */
    public final State f12604l;

    @Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\u00020\u0004:\u0001-B%\b\u0000\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ[\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00142#\u0010\u000f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\u000b¢\u0006\u0002\b\u000e2!\u0010\u0013\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0017H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R{\u0010,\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010#R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000$2.\u0010%\u001a*\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0018\u00010#R\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000R\b\u0012\u0004\u0012\u00028\u00000$8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006."}, m28850d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Lkotlin/ParameterName;", "name", RemoteConfigConstants.ResponseFieldKey.STATE, "targetValueByState", "Landroidx/compose/runtime/State;", "animate", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/State;", "", "setupSeeking$animation_core_release", "()V", "setupSeeking", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "Landroidx/compose/animation/core/Transition;", "<set-?>", OperatorName.CURVE_TO, "Landroidx/compose/runtime/MutableState;", "getData$animation_core_release", "()Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "setData$animation_core_release", "(Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;)V", "data", "DeferredAnimationData", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @InternalAnimationApi
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1156:1\n81#2:1157\n107#2,2:1158\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$DeferredAnimation\n*L\n656#1:1157\n656#1:1158,2\n*E\n"})
    /* loaded from: classes.dex */
    public final class DeferredAnimation<T, V extends AnimationVector> {

        /* renamed from: a */
        public final TwoWayConverter f12605a;

        /* renamed from: b */
        public final String f12606b;

        /* renamed from: c */
        public final MutableState f12607c;

        /* renamed from: d */
        public final /* synthetic */ Transition f12608d;

        @Metadata(m28851d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0013\b\u0080\u0004\u0018\u0000*\u0004\b\u0003\u0010\u0001*\b\b\u0004\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00030\u0004Bm\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012#\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b¢\u0006\u0002\b\u000b\u0012!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00030\b¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u0015\u0010\u0016R-\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u0005R\b\u0012\u0004\u0012\u00028\u00000\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR?\u0010\f\u001a\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\n0\b¢\u0006\u0002\b\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R=\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00028\u00030\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\u0014\u0010&\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, m28850d2 = {"Landroidx/compose/animation/core/Transition$DeferredAnimation$DeferredAnimationData;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/State;", "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "Landroidx/compose/animation/core/Transition;", "animation", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Lkotlin/ExtensionFunctionType;", "transitionSpec", "Lkotlin/ParameterName;", "name", RemoteConfigConstants.ResponseFieldKey.STATE, "targetValueByState", "<init>", "(Landroidx/compose/animation/core/Transition$DeferredAnimation;Landroidx/compose/animation/core/Transition$TransitionAnimationState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "segment", "", "updateAnimationStates", "(Landroidx/compose/animation/core/Transition$Segment;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "getAnimation", "()Landroidx/compose/animation/core/Transition$TransitionAnimationState;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlin/jvm/functions/Function1;", "getTransitionSpec", "()Lkotlin/jvm/functions/Function1;", "setTransitionSpec", "(Lkotlin/jvm/functions/Function1;)V", OperatorName.CURVE_TO, "getTargetValueByState", "setTargetValueByState", "getValue", "()Ljava/lang/Object;", "value", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
        /* loaded from: classes.dex */
        public final class DeferredAnimationData<T, V extends AnimationVector> implements State<T> {

            /* renamed from: a */
            public final TransitionAnimationState f12609a;

            /* renamed from: b */
            public Function1 f12610b;

            /* renamed from: c */
            public Function1 f12611c;

            /* renamed from: d */
            public final /* synthetic */ DeferredAnimation f12612d;

            public DeferredAnimationData(@NotNull DeferredAnimation deferredAnimation, @NotNull Transition<S>.TransitionAnimationState<T, V> animation, @NotNull Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec, Function1<? super S, ? extends T> targetValueByState) {
                Intrinsics.checkNotNullParameter(animation, "animation");
                Intrinsics.checkNotNullParameter(transitionSpec, "transitionSpec");
                Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
                this.f12612d = deferredAnimation;
                this.f12609a = animation;
                this.f12610b = transitionSpec;
                this.f12611c = targetValueByState;
            }

            @NotNull
            public final Transition<S>.TransitionAnimationState<T, V> getAnimation() {
                return this.f12609a;
            }

            @NotNull
            public final Function1<S, T> getTargetValueByState() {
                return this.f12611c;
            }

            @NotNull
            public final Function1<Segment<S>, FiniteAnimationSpec<T>> getTransitionSpec() {
                return this.f12610b;
            }

            @Override // androidx.compose.runtime.State
            public T getValue() {
                updateAnimationStates(this.f12612d.f12608d.getSegment());
                return (T) this.f12609a.getValue();
            }

            public final void setTargetValueByState(@NotNull Function1<? super S, ? extends T> function1) {
                Intrinsics.checkNotNullParameter(function1, "<set-?>");
                this.f12611c = function1;
            }

            public final void setTransitionSpec(@NotNull Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> function1) {
                Intrinsics.checkNotNullParameter(function1, "<set-?>");
                this.f12610b = function1;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public final void updateAnimationStates(@NotNull Segment<S> segment) {
                Intrinsics.checkNotNullParameter(segment, "segment");
                Object invoke = this.f12611c.invoke(segment.getTargetState());
                if (this.f12612d.f12608d.isSeeking()) {
                    this.f12609a.updateInitialAndTargetValue$animation_core_release(this.f12611c.invoke(segment.getInitialState()), invoke, (FiniteAnimationSpec) this.f12610b.invoke(segment));
                    return;
                }
                this.f12609a.updateTargetValue$animation_core_release(invoke, (FiniteAnimationSpec) this.f12610b.invoke(segment));
            }
        }

        public DeferredAnimation(@NotNull Transition transition, @NotNull TwoWayConverter<T, V> typeConverter, String label) {
            MutableState m31891g;
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f12608d = transition;
            this.f12605a = typeConverter;
            this.f12606b = label;
            m31891g = AbstractC19508dK1.m31891g(null, null, 2, null);
            this.f12607c = m31891g;
        }

        @NotNull
        public final State<T> animate(@NotNull Function1<? super Segment<S>, ? extends FiniteAnimationSpec<T>> transitionSpec, @NotNull Function1<? super S, ? extends T> targetValueByState) {
            Intrinsics.checkNotNullParameter(transitionSpec, "transitionSpec");
            Intrinsics.checkNotNullParameter(targetValueByState, "targetValueByState");
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release == null) {
                Transition transition = this.f12608d;
                data$animation_core_release = new DeferredAnimationData<>(this, new TransitionAnimationState(transition, targetValueByState.invoke((Object) transition.getCurrentState()), AnimationStateKt.createZeroVectorFrom(this.f12605a, targetValueByState.invoke((Object) this.f12608d.getCurrentState())), this.f12605a, this.f12606b), transitionSpec, targetValueByState);
                Transition transition2 = this.f12608d;
                setData$animation_core_release(data$animation_core_release);
                transition2.addAnimation$animation_core_release(data$animation_core_release.getAnimation());
            }
            Transition transition3 = this.f12608d;
            data$animation_core_release.setTargetValueByState(targetValueByState);
            data$animation_core_release.setTransitionSpec(transitionSpec);
            data$animation_core_release.updateAnimationStates(transition3.getSegment());
            return data$animation_core_release;
        }

        @Nullable
        public final Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> getData$animation_core_release() {
            return (DeferredAnimationData) this.f12607c.getValue();
        }

        @NotNull
        public final String getLabel() {
            return this.f12606b;
        }

        @NotNull
        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.f12605a;
        }

        public final void setData$animation_core_release(@Nullable Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> deferredAnimationData) {
            this.f12607c.setValue(deferredAnimationData);
        }

        public final void setupSeeking$animation_core_release() {
            Transition<S>.DeferredAnimationData<T, V>.DeferredAnimationData<T, V> data$animation_core_release = getData$animation_core_release();
            if (data$animation_core_release != null) {
                Transition transition = this.f12608d;
                data$animation_core_release.getAnimation().updateInitialAndTargetValue$animation_core_release(data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getInitialState()), data$animation_core_release.getTargetValueByState().invoke(transition.getSegment().getTargetState()), data$animation_core_release.getTransitionSpec().invoke(transition.getSegment()));
            }
        }
    }

    @Metadata(m28851d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001a\u0010\b\u001a\u00020\t*\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0001H\u0096\u0004¢\u0006\u0002\u0010\nR\u0012\u0010\u0003\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00028\u0001X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, m28850d2 = {"Landroidx/compose/animation/core/Transition$Segment;", "S", "", "initialState", "getInitialState", "()Ljava/lang/Object;", "targetState", "getTargetState", "isTransitioningTo", "", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public interface Segment<S> {

        @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static <S> boolean isTransitioningTo(@NotNull Segment<S> segment, S s, S s2) {
                boolean m30637a;
                m30637a = AbstractC20392iV1.m30637a(segment, s, s2);
                return m30637a;
            }
        }

        S getInitialState();

        S getTargetState();

        boolean isTransitioningTo(S s, S s2);
    }

    @Metadata(m28851d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\u0004\u0018\u0000*\u0004\b\u0001\u0010\u0001*\b\b\u0002\u0010\u0003*\u00020\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B5\b\u0000\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00028\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u001a\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00028\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010#\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH\u0000¢\u0006\u0004\b!\u0010\"J#\u0010&\u001a\u00020\u00112\b\b\u0002\u0010\u0005\u001a\u00028\u00012\b\b\u0002\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'R#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R+\u0010\u001b\u001a\u00028\u00012\u0006\u00100\u001a\u00028\u00018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b1\u00103\"\u0004\b4\u00105R7\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00102\u001a\u0004\b7\u00108\"\u0004\b9\u0010:RC\u0010?\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020;2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020;8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b9\u00102\u001a\u0004\b<\u0010=\"\u0004\b6\u0010>R+\u0010E\u001a\u00020$2\u0006\u00100\u001a\u00020$8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b@\u00102\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR+\u0010I\u001a\u00020\r2\u0006\u00100\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\b,\u0010H\"\u0004\bF\u0010\u0016R+\u0010J\u001a\u00020$2\u0006\u00100\u001a\u00020$8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b4\u00102\u001a\u0004\b(\u0010B\"\u0004\b@\u0010DR+\u0010M\u001a\u00028\u00012\u0006\u00100\u001a\u00028\u00018V@PX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b&\u00102\u001a\u0004\bK\u00103\"\u0004\bL\u00105R\u0016\u0010P\u001a\u00028\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\r8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bT\u0010H¨\u0006V"}, m28850d2 = {"Landroidx/compose/animation/core/Transition$TransitionAnimationState;", "T", "Landroidx/compose/animation/core/AnimationVector;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/compose/runtime/State;", "initialValue", "initialVelocityVector", "Landroidx/compose/animation/core/TwoWayConverter;", "typeConverter", "", "label", "<init>", "(Landroidx/compose/animation/core/Transition;Ljava/lang/Object;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/String;)V", "", "playTimeNanos", "", "durationScale", "", "onPlayTimeChanged$animation_core_release", "(JF)V", "onPlayTimeChanged", "seekTo$animation_core_release", "(J)V", "seekTo", "resetAnimation$animation_core_release", "()V", "resetAnimation", "targetValue", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "animationSpec", "updateTargetValue$animation_core_release", "(Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateTargetValue", "updateInitialAndTargetValue$animation_core_release", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "updateInitialAndTargetValue", "", "isInterrupted", "i", "(Ljava/lang/Object;Z)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/animation/core/TwoWayConverter;", "getTypeConverter", "()Landroidx/compose/animation/core/TwoWayConverter;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "<set-?>", OperatorName.CURVE_TO, "Landroidx/compose/runtime/MutableState;", "()Ljava/lang/Object;", OperatorName.CLOSE_PATH, "(Ljava/lang/Object;)V", "d", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "e", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "Landroidx/compose/animation/core/TargetBasedAnimation;", "getAnimation", "()Landroidx/compose/animation/core/TargetBasedAnimation;", "(Landroidx/compose/animation/core/TargetBasedAnimation;)V", "animation", OperatorName.FILL_NON_ZERO, "isFinished$animation_core_release", "()Z", "setFinished$animation_core_release", "(Z)V", "isFinished", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/runtime/MutableLongState;", "()J", "offsetTimeNanos", "needsReset", "getValue", "setValue$animation_core_release", "value", OperatorName.SET_LINE_JOINSTYLE, "Landroidx/compose/animation/core/AnimationVector;", "velocityVector", OperatorName.NON_STROKING_CMYK, "Landroidx/compose/animation/core/FiniteAnimationSpec;", "interruptionSpec", "getDurationNanos$animation_core_release", "durationNanos", "animation-core_release"}, m28849k = 1, m28848mv = {1, 8, 0})
    @Stable
    @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotLongStateKt__SnapshotLongStateKt\n*L\n1#1,1156:1\n81#2:1157\n107#2,2:1158\n81#2:1160\n107#2,2:1161\n81#2:1163\n107#2,2:1164\n81#2:1166\n107#2,2:1167\n81#2:1172\n107#2,2:1173\n81#2:1175\n107#2,2:1176\n76#3:1169\n109#3,2:1170\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/Transition$TransitionAnimationState\n*L\n477#1:1157\n477#1:1158,2\n483#1:1160\n483#1:1161,2\n490#1:1163\n490#1:1164,2\n498#1:1166\n498#1:1167,2\n500#1:1172\n500#1:1173,2\n503#1:1175\n503#1:1176,2\n499#1:1169\n499#1:1170,2\n*E\n"})
    /* loaded from: classes.dex */
    public final class TransitionAnimationState<T, V extends AnimationVector> implements State<T> {

        /* renamed from: a */
        public final TwoWayConverter f12613a;

        /* renamed from: b */
        public final String f12614b;

        /* renamed from: c */
        public final MutableState f12615c;

        /* renamed from: d */
        public final MutableState f12616d;

        /* renamed from: e */
        public final MutableState f12617e;

        /* renamed from: f */
        public final MutableState f12618f;

        /* renamed from: g */
        public final MutableLongState f12619g;

        /* renamed from: h */
        public final MutableState f12620h;

        /* renamed from: i */
        public final MutableState f12621i;

        /* renamed from: j */
        public AnimationVector f12622j;

        /* renamed from: k */
        public final FiniteAnimationSpec f12623k;

        /* renamed from: l */
        public final /* synthetic */ Transition f12624l;

        public TransitionAnimationState(Transition transition, @NotNull T t, @NotNull V initialVelocityVector, @NotNull TwoWayConverter<T, V> typeConverter, String label) {
            MutableState m31891g;
            MutableState m31891g2;
            MutableState m31891g3;
            MutableState m31891g4;
            MutableState m31891g5;
            MutableState m31891g6;
            T t2;
            Intrinsics.checkNotNullParameter(initialVelocityVector, "initialVelocityVector");
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f12624l = transition;
            this.f12613a = typeConverter;
            this.f12614b = label;
            m31891g = AbstractC19508dK1.m31891g(t, null, 2, null);
            this.f12615c = m31891g;
            m31891g2 = AbstractC19508dK1.m31891g(AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), null, 2, null);
            this.f12616d = m31891g2;
            m31891g3 = AbstractC19508dK1.m31891g(new TargetBasedAnimation(getAnimationSpec(), typeConverter, t, m61673c(), initialVelocityVector), null, 2, null);
            this.f12617e = m31891g3;
            m31891g4 = AbstractC19508dK1.m31891g(Boolean.TRUE, null, 2, null);
            this.f12618f = m31891g4;
            this.f12619g = SnapshotLongStateKt.mutableLongStateOf(0L);
            m31891g5 = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
            this.f12620h = m31891g5;
            m31891g6 = AbstractC19508dK1.m31891g(t, null, 2, null);
            this.f12621i = m31891g6;
            this.f12622j = initialVelocityVector;
            Float f = VisibilityThresholdsKt.getVisibilityThresholdMap().get(typeConverter);
            if (f != null) {
                float floatValue = f.floatValue();
                V invoke = typeConverter.getConvertToVector().invoke(t);
                int size$animation_core_release = invoke.getSize$animation_core_release();
                for (int i = 0; i < size$animation_core_release; i++) {
                    invoke.set$animation_core_release(i, floatValue);
                }
                t2 = this.f12613a.getConvertFromVector().invoke(invoke);
            } else {
                t2 = null;
            }
            this.f12623k = AnimationSpecKt.spring$default(0.0f, 0.0f, t2, 3, null);
        }

        /* renamed from: j */
        public static /* synthetic */ void m61666j(TransitionAnimationState transitionAnimationState, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = transitionAnimationState.getValue();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            transitionAnimationState.m61667i(obj, z);
        }

        /* renamed from: a */
        public final boolean m61675a() {
            return ((Boolean) this.f12620h.getValue()).booleanValue();
        }

        /* renamed from: b */
        public final long m61674b() {
            return this.f12619g.getLongValue();
        }

        /* renamed from: c */
        public final Object m61673c() {
            return this.f12615c.getValue();
        }

        /* renamed from: d */
        public final void m61672d(TargetBasedAnimation targetBasedAnimation) {
            this.f12617e.setValue(targetBasedAnimation);
        }

        /* renamed from: e */
        public final void m61671e(FiniteAnimationSpec finiteAnimationSpec) {
            this.f12616d.setValue(finiteAnimationSpec);
        }

        /* renamed from: f */
        public final void m61670f(boolean z) {
            this.f12620h.setValue(Boolean.valueOf(z));
        }

        /* renamed from: g */
        public final void m61669g(long j) {
            this.f12619g.setLongValue(j);
        }

        @NotNull
        public final TargetBasedAnimation<T, V> getAnimation() {
            return (TargetBasedAnimation) this.f12617e.getValue();
        }

        @NotNull
        public final FiniteAnimationSpec<T> getAnimationSpec() {
            return (FiniteAnimationSpec) this.f12616d.getValue();
        }

        public final long getDurationNanos$animation_core_release() {
            return getAnimation().getDurationNanos();
        }

        @NotNull
        public final String getLabel() {
            return this.f12614b;
        }

        @NotNull
        public final TwoWayConverter<T, V> getTypeConverter() {
            return this.f12613a;
        }

        @Override // androidx.compose.runtime.State
        public T getValue() {
            return this.f12621i.getValue();
        }

        /* renamed from: h */
        public final void m61668h(Object obj) {
            this.f12615c.setValue(obj);
        }

        /* renamed from: i */
        public final void m61667i(Object obj, boolean z) {
            FiniteAnimationSpec<T> animationSpec;
            if (z) {
                if (getAnimationSpec() instanceof SpringSpec) {
                    animationSpec = getAnimationSpec();
                } else {
                    animationSpec = this.f12623k;
                }
            } else {
                animationSpec = getAnimationSpec();
            }
            m61672d(new TargetBasedAnimation(animationSpec, this.f12613a, obj, m61673c(), this.f12622j));
            this.f12624l.m61678b();
        }

        public final boolean isFinished$animation_core_release() {
            return ((Boolean) this.f12618f.getValue()).booleanValue();
        }

        public final void onPlayTimeChanged$animation_core_release(long j, float f) {
            long durationNanos;
            if (f > 0.0f) {
                float m61674b = ((float) (j - m61674b())) / f;
                if (!Float.isNaN(m61674b)) {
                    durationNanos = m61674b;
                } else {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f + ",playTimeNanos: " + j + ", offsetTimeNanos: " + m61674b()).toString());
                }
            } else {
                durationNanos = getAnimation().getDurationNanos();
            }
            setValue$animation_core_release(getAnimation().getValueFromNanos(durationNanos));
            this.f12622j = getAnimation().getVelocityVectorFromNanos(durationNanos);
            if (getAnimation().isFinishedFromNanos(durationNanos)) {
                setFinished$animation_core_release(true);
                m61669g(0L);
            }
        }

        public final void resetAnimation$animation_core_release() {
            m61670f(true);
        }

        public final void seekTo$animation_core_release(long j) {
            setValue$animation_core_release(getAnimation().getValueFromNanos(j));
            this.f12622j = getAnimation().getVelocityVectorFromNanos(j);
        }

        public final void setFinished$animation_core_release(boolean z) {
            this.f12618f.setValue(Boolean.valueOf(z));
        }

        public void setValue$animation_core_release(T t) {
            this.f12621i.setValue(t);
        }

        public final void updateInitialAndTargetValue$animation_core_release(T t, T t2, @NotNull FiniteAnimationSpec<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            m61668h(t2);
            m61671e(animationSpec);
            if (Intrinsics.areEqual(getAnimation().getInitialValue(), t) && Intrinsics.areEqual(getAnimation().getTargetValue(), t2)) {
                return;
            }
            m61666j(this, t, false, 2, null);
        }

        public final void updateTargetValue$animation_core_release(T t, @NotNull FiniteAnimationSpec<T> animationSpec) {
            Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
            if (!Intrinsics.areEqual(m61673c(), t) || m61675a()) {
                m61668h(t);
                m61671e(animationSpec);
                m61666j(this, null, !isFinished$animation_core_release(), 1, null);
                setFinished$animation_core_release(false);
                m61669g(this.f12624l.getPlayTimeNanos());
                m61670f(false);
            }
        }
    }

    /* renamed from: androidx.compose.animation.core.Transition$a */
    /* loaded from: classes.dex */
    public static final class C2747a implements Segment {

        /* renamed from: a */
        public final Object f12625a;

        /* renamed from: b */
        public final Object f12626b;

        public C2747a(Object obj, Object obj2) {
            this.f12625a = obj;
            this.f12626b = obj2;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Segment) {
                Segment segment = (Segment) obj;
                if (Intrinsics.areEqual(getInitialState(), segment.getInitialState()) && Intrinsics.areEqual(getTargetState(), segment.getTargetState())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public Object getInitialState() {
            return this.f12625a;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public Object getTargetState() {
            return this.f12626b;
        }

        public int hashCode() {
            int i;
            Object initialState = getInitialState();
            int i2 = 0;
            if (initialState != null) {
                i = initialState.hashCode();
            } else {
                i = 0;
            }
            int i3 = i * 31;
            Object targetState = getTargetState();
            if (targetState != null) {
                i2 = targetState.hashCode();
            }
            return i3 + i2;
        }

        @Override // androidx.compose.animation.core.Transition.Segment
        public /* synthetic */ boolean isTransitioningTo(Object obj, Object obj2) {
            return AbstractC20392iV1.m30637a(this, obj, obj2);
        }
    }

    @PublishedApi
    public Transition(@NotNull MutableTransitionState<S> transitionState, @Nullable String str) {
        MutableState m31891g;
        MutableState m31891g2;
        MutableState m31891g3;
        MutableState m31891g4;
        Intrinsics.checkNotNullParameter(transitionState, "transitionState");
        this.f12593a = transitionState;
        this.f12594b = str;
        m31891g = AbstractC19508dK1.m31891g(getCurrentState(), null, 2, null);
        this.f12595c = m31891g;
        m31891g2 = AbstractC19508dK1.m31891g(new C2747a(getCurrentState(), getCurrentState()), null, 2, null);
        this.f12596d = m31891g2;
        this.f12597e = SnapshotLongStateKt.mutableLongStateOf(0L);
        this.f12598f = SnapshotLongStateKt.mutableLongStateOf(Long.MIN_VALUE);
        m31891g3 = AbstractC19508dK1.m31891g(Boolean.TRUE, null, 2, null);
        this.f12599g = m31891g3;
        this.f12600h = SnapshotStateKt.mutableStateListOf();
        this.f12601i = SnapshotStateKt.mutableStateListOf();
        m31891g4 = AbstractC19508dK1.m31891g(Boolean.FALSE, null, 2, null);
        this.f12602j = m31891g4;
        this.f12604l = SnapshotStateKt.derivedStateOf(new Transition$totalDurationNanos$2(this));
    }

    @InternalAnimationApi
    public static /* synthetic */ void getPlayTimeNanos$annotations() {
    }

    @InternalAnimationApi
    public static /* synthetic */ void isSeeking$annotations() {
    }

    /* renamed from: a */
    public final long m61679a() {
        return this.f12598f.getLongValue();
    }

    public final boolean addAnimation$animation_core_release(@NotNull Transition<S>.TransitionAnimationState<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        return this.f12600h.add(animation);
    }

    public final boolean addTransition$animation_core_release(@NotNull Transition<?> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        return this.f12601i.add(transition);
    }

    @Composable
    public final void animateTo$animation_core_release(S s, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-1493585151);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1493585151, i2, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:425)");
            }
            if (!isSeeking()) {
                updateTarget$animation_core_release(s, startRestartGroup, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                if (!Intrinsics.areEqual(s, getCurrentState()) || isRunning() || getUpdateChildrenNeeded$animation_core_release()) {
                    int i5 = (i2 >> 3) & 14;
                    startRestartGroup.startReplaceableGroup(1157296644);
                    boolean changed = startRestartGroup.changed(this);
                    Object rememberedValue = startRestartGroup.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                        rememberedValue = new Transition$animateTo$1$1(this, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    startRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(this, (Function2) rememberedValue, startRestartGroup, i5 | 64);
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Transition$animateTo$2(this, s, i));
        }
    }

    /* renamed from: b */
    public final void m61678b() {
        setUpdateChildrenNeeded$animation_core_release(true);
        if (isSeeking()) {
            long j = 0;
            for (TransitionAnimationState transitionAnimationState : this.f12600h) {
                j = Math.max(j, transitionAnimationState.getDurationNanos$animation_core_release());
                transitionAnimationState.seekTo$animation_core_release(this.f12603k);
            }
            setUpdateChildrenNeeded$animation_core_release(false);
        }
    }

    /* renamed from: c */
    public final void m61677c(Segment segment) {
        this.f12596d.setValue(segment);
    }

    /* renamed from: d */
    public final void m61676d(long j) {
        this.f12598f.setLongValue(j);
    }

    @NotNull
    public final List<Transition<S>.TransitionAnimationState<?, ?>> getAnimations() {
        return this.f12600h;
    }

    public final S getCurrentState() {
        return (S) this.f12593a.getCurrentState();
    }

    @Nullable
    public final String getLabel() {
        return this.f12594b;
    }

    public final long getLastSeekedTimeNanos$animation_core_release() {
        return this.f12603k;
    }

    public final long getPlayTimeNanos() {
        return this.f12597e.getLongValue();
    }

    @NotNull
    public final Segment<S> getSegment() {
        return (Segment) this.f12596d.getValue();
    }

    public final S getTargetState() {
        return (S) this.f12595c.getValue();
    }

    public final long getTotalDurationNanos() {
        return ((Number) this.f12604l.getValue()).longValue();
    }

    @NotNull
    public final List<Transition<?>> getTransitions() {
        return this.f12601i;
    }

    public final boolean getUpdateChildrenNeeded$animation_core_release() {
        return ((Boolean) this.f12599g.getValue()).booleanValue();
    }

    public final boolean isRunning() {
        if (m61679a() != Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public final boolean isSeeking() {
        return ((Boolean) this.f12602j.getValue()).booleanValue();
    }

    public final void onFrame$animation_core_release(long j, float f) {
        if (m61679a() == Long.MIN_VALUE) {
            onTransitionStart$animation_core_release(j);
        }
        setUpdateChildrenNeeded$animation_core_release(false);
        setPlayTimeNanos(j - m61679a());
        boolean z = true;
        for (TransitionAnimationState transitionAnimationState : this.f12600h) {
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                transitionAnimationState.onPlayTimeChanged$animation_core_release(getPlayTimeNanos(), f);
            }
            if (!transitionAnimationState.isFinished$animation_core_release()) {
                z = false;
            }
        }
        for (Transition transition : this.f12601i) {
            if (!Intrinsics.areEqual(transition.getTargetState(), transition.getCurrentState())) {
                transition.onFrame$animation_core_release(getPlayTimeNanos(), f);
            }
            if (!Intrinsics.areEqual(transition.getTargetState(), transition.getCurrentState())) {
                z = false;
            }
        }
        if (z) {
            onTransitionEnd$animation_core_release();
        }
    }

    public final void onTransitionEnd$animation_core_release() {
        m61676d(Long.MIN_VALUE);
        setCurrentState$animation_core_release(getTargetState());
        setPlayTimeNanos(0L);
        this.f12593a.setRunning$animation_core_release(false);
    }

    public final void onTransitionStart$animation_core_release(long j) {
        m61676d(j);
        this.f12593a.setRunning$animation_core_release(true);
    }

    public final void removeAnimation$animation_core_release(@NotNull Transition<S>.TransitionAnimationState<?, ?> animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        this.f12600h.remove(animation);
    }

    public final boolean removeTransition$animation_core_release(@NotNull Transition<?> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        return this.f12601i.remove(transition);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmName(name = "seek")
    public final void seek(S s, S s2, long j) {
        m61676d(Long.MIN_VALUE);
        this.f12593a.setRunning$animation_core_release(false);
        if (!isSeeking() || !Intrinsics.areEqual(getCurrentState(), s) || !Intrinsics.areEqual(getTargetState(), s2)) {
            setCurrentState$animation_core_release(s);
            setTargetState$animation_core_release(s2);
            setSeeking$animation_core_release(true);
            m61677c(new C2747a(s, s2));
        }
        for (Transition transition : this.f12601i) {
            Intrinsics.checkNotNull(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.isSeeking()) {
                transition.seek(transition.getCurrentState(), transition.getTargetState(), j);
            }
        }
        for (TransitionAnimationState transitionAnimationState : this.f12600h) {
            transitionAnimationState.seekTo$animation_core_release(j);
        }
        this.f12603k = j;
    }

    public final void setCurrentState$animation_core_release(S s) {
        this.f12593a.setCurrentState$animation_core_release(s);
    }

    public final void setLastSeekedTimeNanos$animation_core_release(long j) {
        this.f12603k = j;
    }

    public final void setPlayTimeNanos(long j) {
        this.f12597e.setLongValue(j);
    }

    public final void setSeeking$animation_core_release(boolean z) {
        this.f12602j.setValue(Boolean.valueOf(z));
    }

    public final void setTargetState$animation_core_release(S s) {
        this.f12595c.setValue(s);
    }

    public final void setUpdateChildrenNeeded$animation_core_release(boolean z) {
        this.f12599g.setValue(Boolean.valueOf(z));
    }

    @Composable
    public final void updateTarget$animation_core_release(S s, @Nullable Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        Composer startRestartGroup = composer.startRestartGroup(-583974681);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(s)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            if (startRestartGroup.changed(this)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-583974681, i, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:400)");
            }
            if (!isSeeking() && !Intrinsics.areEqual(getTargetState(), s)) {
                m61677c(new C2747a(getTargetState(), s));
                setCurrentState$animation_core_release(getTargetState());
                setTargetState$animation_core_release(s);
                if (!isRunning()) {
                    setUpdateChildrenNeeded$animation_core_release(true);
                }
                for (TransitionAnimationState transitionAnimationState : this.f12600h) {
                    transitionAnimationState.resetAnimation$animation_core_release();
                }
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Transition$updateTarget$2(this, s, i));
        }
    }

    public final void removeAnimation$animation_core_release(@NotNull Transition<S>.DeferredAnimation<?, ?> deferredAnimation) {
        Transition<S>.TransitionAnimationState<?, ?> animation;
        Intrinsics.checkNotNullParameter(deferredAnimation, "deferredAnimation");
        Transition<S>.DeferredAnimationData<?, V>.DeferredAnimationData<?, ?> data$animation_core_release = deferredAnimation.getData$animation_core_release();
        if (data$animation_core_release == null || (animation = data$animation_core_release.getAnimation()) == null) {
            return;
        }
        removeAnimation$animation_core_release(animation);
    }

    public /* synthetic */ Transition(MutableTransitionState mutableTransitionState, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableTransitionState, (i & 2) != 0 ? null : str);
    }

    public Transition(S s, @Nullable String str) {
        this(new MutableTransitionState(s), str);
    }
}
