package androidx.lifecycle.compose;

import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.lifecycle.LifecycleOwner;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a<\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aF\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0013\u001aP\u0010\u0010\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0015\u001aJ\u0010\u0010\u001a\u00020\u00052\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0016\"\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0018\u001a8\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\f2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001a<\u0010\u001e\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u0011\u001aF\u0010\u001e\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u0013\u001aP\u0010\u001e\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u0015\u001aJ\u0010\u001e\u001a\u00020\u00052\u0016\u0010\u0017\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\u0016\"\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u000b¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u0018\u001a8\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u001c2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u000b¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0004\b\u001f\u0010 ¨\u0006\"²\u0006\u0012\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, m29142d2 = {"Landroidx/lifecycle/Lifecycle$Event;", "event", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function0;", "", "onEvent", "LifecycleEventEffect", "(Landroidx/lifecycle/Lifecycle$Event;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "", "key1", "Lkotlin/Function1;", "Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;", "Landroidx/lifecycle/compose/LifecycleStopOrDisposeEffectResult;", "Lkotlin/ExtensionFunctionType;", "effects", "LifecycleStartEffect", "(Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key2", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "key3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "", UserMetadata.KEYDATA_FILENAME, "([Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", Action.SCOPE_ATTRIBUTE, OperatorName.CURVE_TO, "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleStartStopEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;", "Landroidx/lifecycle/compose/LifecyclePauseOrDisposeEffectResult;", "LifecycleResumeEffect", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/compose/LifecycleResumePauseEffectScope;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "currentOnEvent", "lifecycle-runtime-compose_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,706:1\n76#2:707\n76#2:708\n76#2:717\n76#2:728\n76#2:738\n76#2:748\n76#2:757\n76#2:768\n76#2:778\n50#3:709\n49#3:710\n67#3,3:718\n66#3:721\n83#3,3:729\n83#3,3:739\n50#3:749\n49#3:750\n67#3,3:758\n66#3:761\n83#3,3:769\n83#3,3:779\n955#4,6:711\n955#4,6:722\n955#4,6:732\n955#4,6:742\n955#4,6:751\n955#4,6:762\n955#4,6:772\n955#4,6:782\n89#5:788\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n*L\n57#1:707\n135#1:708\n198#1:717\n263#1:728\n324#1:738\n447#1:748\n510#1:757\n575#1:768\n636#1:778\n138#1:709\n138#1:710\n201#1:718,3\n201#1:721\n266#1:729,3\n327#1:739,3\n450#1:749\n450#1:750\n513#1:758,3\n513#1:761\n578#1:769,3\n639#1:779,3\n138#1:711,6\n201#1:722,6\n266#1:732,6\n327#1:742,6\n450#1:751,6\n513#1:762,6\n578#1:772,6\n639#1:782,6\n67#1:788\n*E\n"})
/* loaded from: classes2.dex */
public final class LifecycleEffectKt {
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0061, code lost:
        if (r2 != 0) goto L29;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LifecycleEventEffect(@org.jetbrains.annotations.NotNull androidx.lifecycle.Lifecycle.Event r8, @org.jetbrains.annotations.Nullable androidx.lifecycle.LifecycleOwner r9, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r10, @org.jetbrains.annotations.Nullable androidx.compose.runtime.Composer r11, int r12, int r13) {
        /*
            r0 = -709389590(0xffffffffd5b792ea, float:-2.52302024E13)
            androidx.compose.runtime.Composer r11 = r11.startRestartGroup(r0)
            r0 = r13 & 1
            r1 = 2
            if (r0 == 0) goto Lf
            r0 = r12 | 6
            goto L1f
        Lf:
            r0 = r12 & 14
            if (r0 != 0) goto L1e
            boolean r0 = r11.changed(r8)
            if (r0 == 0) goto L1b
            r0 = 4
            goto L1c
        L1b:
            r0 = 2
        L1c:
            r0 = r0 | r12
            goto L1f
        L1e:
            r0 = r12
        L1f:
            r2 = r13 & 2
            if (r2 == 0) goto L25
            r0 = r0 | 16
        L25:
            r3 = r13 & 4
            if (r3 == 0) goto L2c
            r0 = r0 | 384(0x180, float:5.38E-43)
            goto L3c
        L2c:
            r3 = r12 & 896(0x380, float:1.256E-42)
            if (r3 != 0) goto L3c
            boolean r3 = r11.changed(r10)
            if (r3 == 0) goto L39
            r3 = 256(0x100, float:3.59E-43)
            goto L3b
        L39:
            r3 = 128(0x80, float:1.794E-43)
        L3b:
            r0 = r0 | r3
        L3c:
            if (r2 != r1) goto L50
            r1 = r0 & 731(0x2db, float:1.024E-42)
            r3 = 146(0x92, float:2.05E-43)
            if (r1 != r3) goto L50
            boolean r1 = r11.getSkipping()
            if (r1 != 0) goto L4b
            goto L50
        L4b:
            r11.skipToGroupEnd()
        L4e:
            r4 = r9
            goto L8d
        L50:
            r11.startDefaults()
            r1 = r12 & 1
            if (r1 == 0) goto L66
            boolean r1 = r11.getDefaultsInvalid()
            if (r1 == 0) goto L5e
            goto L66
        L5e:
            r11.skipToGroupEnd()
            if (r2 == 0) goto L73
        L63:
            r0 = r0 & (-113(0xffffffffffffff8f, float:NaN))
            goto L73
        L66:
            if (r2 == 0) goto L73
            androidx.compose.runtime.ProvidableCompositionLocal r9 = androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt.getLocalLifecycleOwner()
            java.lang.Object r9 = r11.consume(r9)
            androidx.lifecycle.LifecycleOwner r9 = (androidx.lifecycle.LifecycleOwner) r9
            goto L63
        L73:
            r11.endDefaults()
            androidx.lifecycle.Lifecycle$Event r1 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r8 == r1) goto La1
            int r0 = r0 >> 6
            r0 = r0 & 14
            androidx.compose.runtime.State r0 = androidx.compose.runtime.SnapshotStateKt.rememberUpdatedState(r10, r11, r0)
            androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$1 r1 = new androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$1
            r1.<init>(r9, r8, r0)
            r0 = 8
            androidx.compose.runtime.EffectsKt.DisposableEffect(r9, r1, r11, r0)
            goto L4e
        L8d:
            androidx.compose.runtime.ScopeUpdateScope r9 = r11.endRestartGroup()
            if (r9 == 0) goto La0
            androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$2 r11 = new androidx.lifecycle.compose.LifecycleEffectKt$LifecycleEventEffect$2
            r2 = r11
            r3 = r8
            r5 = r10
            r6 = r12
            r7 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            r9.updateScope(r11)
        La0:
            return
        La1:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked."
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleEventEffect(androidx.lifecycle.Lifecycle$Event, androidx.lifecycle.LifecycleOwner, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public static final void LifecycleResumeEffect(@Nullable Object obj, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, @Nullable Composer composer, int i, int i2) {
        LifecycleOwner lifecycleOwner2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(1220373486);
        if ((i2 & 2) != 0) {
            i3 = i & (-113);
            lifecycleOwner2 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        startRestartGroup.startReplaceableGroup(-3686552);
        boolean changed = startRestartGroup.changed(obj) | startRestartGroup.changed(lifecycleOwner2);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        m54032b(lifecycleOwner2, (LifecycleResumePauseEffectScope) rememberedValue, function1, startRestartGroup, (i3 & 896) | 72);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LifecycleEffectKt$LifecycleResumeEffect$1(obj, lifecycleOwner2, function1, i, i2));
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@Nullable Object obj, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, @Nullable Composer composer, int i, int i2) {
        LifecycleOwner lifecycleOwner2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1408314671);
        if ((i2 & 2) != 0) {
            i3 = i & (-113);
            lifecycleOwner2 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        startRestartGroup.startReplaceableGroup(-3686552);
        boolean changed = startRestartGroup.changed(obj) | startRestartGroup.changed(lifecycleOwner2);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        m54031c(lifecycleOwner2, (LifecycleStartStopEffectScope) rememberedValue, function1, startRestartGroup, (i3 & 896) | 72);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LifecycleEffectKt$LifecycleStartEffect$1(obj, lifecycleOwner2, function1, i, i2));
        }
    }

    /* renamed from: a */
    public static final Function0 m54033a(State state) {
        return (Function0) state.getValue();
    }

    /* renamed from: b */
    public static final void m54032b(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, Function1 function1, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(912823238);
        EffectsKt.DisposableEffect(lifecycleOwner, lifecycleResumePauseEffectScope, new LifecycleEffectKt$LifecycleResumeEffectImpl$1(lifecycleOwner, lifecycleResumePauseEffectScope, function1), startRestartGroup, 72);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LifecycleEffectKt$LifecycleResumeEffectImpl$2(lifecycleOwner, lifecycleResumePauseEffectScope, function1, i));
        }
    }

    /* renamed from: c */
    public static final void m54031c(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, Function1 function1, Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(228371534);
        EffectsKt.DisposableEffect(lifecycleOwner, lifecycleStartStopEffectScope, new LifecycleEffectKt$LifecycleStartEffectImpl$1(lifecycleOwner, lifecycleStartStopEffectScope, function1), startRestartGroup, 72);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LifecycleEffectKt$LifecycleStartEffectImpl$2(lifecycleOwner, lifecycleStartStopEffectScope, function1, i));
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, @Nullable Composer composer, int i, int i2) {
        LifecycleOwner lifecycleOwner2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(752680142);
        if ((i2 & 4) != 0) {
            i3 = i & (-897);
            lifecycleOwner2 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        startRestartGroup.startReplaceableGroup(-3686095);
        boolean changed = startRestartGroup.changed(obj) | startRestartGroup.changed(obj2) | startRestartGroup.changed(lifecycleOwner2);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        m54032b(lifecycleOwner2, (LifecycleResumePauseEffectScope) rememberedValue, function1, startRestartGroup, ((i3 >> 3) & 896) | 72);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LifecycleEffectKt$LifecycleResumeEffect$2(obj, obj2, lifecycleOwner2, function1, i, i2));
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, @Nullable Composer composer, int i, int i2) {
        LifecycleOwner lifecycleOwner2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(696924721);
        if ((i2 & 4) != 0) {
            i3 = i & (-897);
            lifecycleOwner2 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        startRestartGroup.startReplaceableGroup(-3686095);
        boolean changed = startRestartGroup.changed(obj) | startRestartGroup.changed(obj2) | startRestartGroup.changed(lifecycleOwner2);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        m54031c(lifecycleOwner2, (LifecycleStartStopEffectScope) rememberedValue, function1, startRestartGroup, ((i3 >> 3) & 896) | 72);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LifecycleEffectKt$LifecycleStartEffect$2(obj, obj2, lifecycleOwner2, function1, i, i2));
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, @Nullable Composer composer, int i, int i2) {
        LifecycleOwner lifecycleOwner2;
        int i3;
        int i4 = 0;
        Composer startRestartGroup = composer.startRestartGroup(-485941842);
        if ((i2 & 8) != 0) {
            i3 = i & (-7169);
            lifecycleOwner2 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        Object[] objArr = {obj, obj2, obj3, lifecycleOwner2};
        startRestartGroup.startReplaceableGroup(-3685570);
        boolean z = false;
        while (i4 < 4) {
            Object obj4 = objArr[i4];
            i4++;
            z |= startRestartGroup.changed(obj4);
        }
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        m54032b(lifecycleOwner2, (LifecycleResumePauseEffectScope) rememberedValue, function1, startRestartGroup, ((i3 >> 6) & 896) | 72);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LifecycleEffectKt$LifecycleResumeEffect$3(obj, obj2, obj3, lifecycleOwner2, function1, i, i2));
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, @Nullable Composer composer, int i, int i2) {
        LifecycleOwner lifecycleOwner2;
        int i3;
        int i4 = 0;
        Composer startRestartGroup = composer.startRestartGroup(574812561);
        if ((i2 & 8) != 0) {
            i3 = i & (-7169);
            lifecycleOwner2 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        Object[] objArr = {obj, obj2, obj3, lifecycleOwner2};
        startRestartGroup.startReplaceableGroup(-3685570);
        boolean z = false;
        while (i4 < 4) {
            Object obj4 = objArr[i4];
            i4++;
            z |= startRestartGroup.changed(obj4);
        }
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        m54031c(lifecycleOwner2, (LifecycleStartStopEffectScope) rememberedValue, function1, startRestartGroup, ((i3 >> 6) & 896) | 72);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LifecycleEffectKt$LifecycleStartEffect$3(obj, obj2, obj3, lifecycleOwner2, function1, i, i2));
        }
    }

    @Composable
    public static final void LifecycleResumeEffect(@NotNull Object[] objArr, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> function1, @Nullable Composer composer, int i, int i2) {
        LifecycleOwner lifecycleOwner2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-781756895);
        if ((i2 & 2) != 0) {
            i3 = i & (-113);
            lifecycleOwner2 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(objArr);
        spreadBuilder.add(lifecycleOwner2);
        Object[] array = spreadBuilder.toArray(new Object[spreadBuilder.size()]);
        startRestartGroup.startReplaceableGroup(-3685570);
        int length = array.length;
        int i4 = 0;
        boolean z = false;
        while (i4 < length) {
            Object obj = array[i4];
            i4++;
            z |= startRestartGroup.changed(obj);
        }
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        m54032b(lifecycleOwner2, (LifecycleResumePauseEffectScope) rememberedValue, function1, startRestartGroup, (i3 & 896) | 72);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LifecycleEffectKt$LifecycleResumeEffect$4(objArr, lifecycleOwner2, function1, i, i2));
        }
    }

    @Composable
    public static final void LifecycleStartEffect(@NotNull Object[] objArr, @Nullable LifecycleOwner lifecycleOwner, @NotNull Function1<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> function1, @Nullable Composer composer, int i, int i2) {
        LifecycleOwner lifecycleOwner2;
        int i3;
        Composer startRestartGroup = composer.startRestartGroup(-1510305724);
        if ((i2 & 2) != 0) {
            i3 = i & (-113);
            lifecycleOwner2 = (LifecycleOwner) startRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        } else {
            lifecycleOwner2 = lifecycleOwner;
            i3 = i;
        }
        SpreadBuilder spreadBuilder = new SpreadBuilder(2);
        spreadBuilder.addSpread(objArr);
        spreadBuilder.add(lifecycleOwner2);
        Object[] array = spreadBuilder.toArray(new Object[spreadBuilder.size()]);
        startRestartGroup.startReplaceableGroup(-3685570);
        int length = array.length;
        int i4 = 0;
        boolean z = false;
        while (i4 < length) {
            Object obj = array[i4];
            i4++;
            z |= startRestartGroup.changed(obj);
        }
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (z || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner2.getLifecycle());
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        m54031c(lifecycleOwner2, (LifecycleStartStopEffectScope) rememberedValue, function1, startRestartGroup, (i3 & 896) | 72);
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LifecycleEffectKt$LifecycleStartEffect$4(objArr, lifecycleOwner2, function1, i, i2));
        }
    }
}