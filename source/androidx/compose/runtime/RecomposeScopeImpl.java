package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArrayIntMap;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m28851d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0000\u0018\u0000 [2\u00020\u00012\u00020\u0002:\u0001[B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0006J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J)\u0010\u0018\u001a\u00020\t2\u0018\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t0\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u0012J\u0015\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\f¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u001f2\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\t¢\u0006\u0004\b&\u0010\u0012J#\u0010)\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\t\u0018\u00010'2\u0006\u0010\u001a\u001a\u00020\u0016¢\u0006\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u00107\u001a\u0004\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010\u0017\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010;\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010,R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R*\u0010D\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030A\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR$\u0010G\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001f8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b+\u0010E\"\u0004\b.\u0010FR$\u0010I\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001f8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bH\u0010E\"\u0004\b1\u0010FR\u0011\u0010K\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bJ\u0010ER\u0011\u0010M\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bL\u0010ER$\u0010P\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bN\u0010E\"\u0004\bO\u0010FR$\u0010S\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bQ\u0010E\"\u0004\bR\u0010FR$\u0010V\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bT\u0010E\"\u0004\bU\u0010FR$\u0010Y\u001a\u00020\u001f2\u0006\u0010\r\u001a\u00020\u001f8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bW\u0010E\"\u0004\bX\u0010FR\u0011\u0010Z\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bZ\u0010E¨\u0006\\"}, m28850d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/ScopeUpdateScope;", "Landroidx/compose/runtime/RecomposeScope;", "Landroidx/compose/runtime/RecomposeScopeOwner;", Constant.REGISTER_LEVEL_OWNER, "<init>", "(Landroidx/compose/runtime/RecomposeScopeOwner;)V", "Landroidx/compose/runtime/Composer;", "composer", "", "compose", "(Landroidx/compose/runtime/Composer;)V", "", "value", "Landroidx/compose/runtime/InvalidationResult;", "invalidateForResult", "(Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "release", "()V", "adoptedBy", "invalidate", "Lkotlin/Function2;", "", "block", "updateScope", "(Lkotlin/jvm/functions/Function2;)V", "token", "start", "(I)V", "scopeSkipped", "instance", "", "recordRead", "(Ljava/lang/Object;)Z", "Landroidx/compose/runtime/collection/IdentityArraySet;", "instances", "isInvalidFor", "(Landroidx/compose/runtime/collection/IdentityArraySet;)Z", "rereadTrackedInstances", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "end", "(I)Lkotlin/jvm/functions/Function1;", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "flags", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/runtime/RecomposeScopeOwner;", "Landroidx/compose/runtime/Anchor;", OperatorName.CURVE_TO, "Landroidx/compose/runtime/Anchor;", "getAnchor", "()Landroidx/compose/runtime/Anchor;", "setAnchor", "(Landroidx/compose/runtime/Anchor;)V", "anchor", "d", "Lkotlin/jvm/functions/Function2;", "e", "currentToken", "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", OperatorName.FILL_NON_ZERO, "Landroidx/compose/runtime/collection/IdentityArrayIntMap;", "trackedInstances", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "Landroidx/compose/runtime/DerivedState;", OperatorName.NON_STROKING_GRAY, "Landroidx/compose/runtime/collection/IdentityArrayMap;", "trackedDependencies", "()Z", "(Z)V", "rereading", "getSkipped$runtime_release", "skipped", "getValid", "valid", "getCanRecompose", "canRecompose", "getUsed", "setUsed", "used", "getDefaultsInScope", "setDefaultsInScope", "defaultsInScope", "getDefaultsInvalid", "setDefaultsInvalid", "defaultsInvalid", "getRequiresRecompose", "setRequiresRecompose", "requiresRecompose", "isConditional", "Companion", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IdentityArrayIntMap.kt\nandroidx/compose/runtime/collection/IdentityArrayIntMap\n*L\n1#1,388:1\n1#2:389\n1726#3,3:390\n172#4,8:393\n161#4,8:401\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl\n*L\n297#1:390,3\n315#1:393,8\n338#1:401,8\n*E\n"})
/* loaded from: classes2.dex */
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public int f28377a;

    /* renamed from: b */
    public RecomposeScopeOwner f28378b;

    /* renamed from: c */
    public Anchor f28379c;

    /* renamed from: d */
    public Function2 f28380d;

    /* renamed from: e */
    public int f28381e;

    /* renamed from: f */
    public IdentityArrayIntMap f28382f;

    /* renamed from: g */
    public IdentityArrayMap f28383g;

    @Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\b\fJ#\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0002\b\u0010¨\u0006\u0011"}, m28850d2 = {"Landroidx/compose/runtime/RecomposeScopeImpl$Companion;", "", "()V", "adoptAnchoredScopes", "", "slots", "Landroidx/compose/runtime/SlotWriter;", "anchors", "", "Landroidx/compose/runtime/Anchor;", "newOwner", "Landroidx/compose/runtime/RecomposeScopeOwner;", "adoptAnchoredScopes$runtime_release", "hasAnchoredRecomposeScopes", "", "Landroidx/compose/runtime/SlotTable;", "hasAnchoredRecomposeScopes$runtime_release", "runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nRecomposeScopeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n+ 2 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,388:1\n33#2,6:389\n93#2,2:395\n33#2,4:397\n95#2,2:401\n38#2:403\n97#2:404\n*S KotlinDebug\n*F\n+ 1 RecomposeScopeImpl.kt\nandroidx/compose/runtime/RecomposeScopeImpl$Companion\n*L\n373#1:389,6\n383#1:395,2\n383#1:397,4\n383#1:401,2\n383#1:403\n383#1:404\n*E\n"})
    /* loaded from: classes2.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void adoptAnchoredScopes$runtime_release(@NotNull SlotWriter slots, @NotNull List<Anchor> anchors, @NotNull RecomposeScopeOwner newOwner) {
            RecomposeScopeImpl recomposeScopeImpl;
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(anchors, "anchors");
            Intrinsics.checkNotNullParameter(newOwner, "newOwner");
            if (!anchors.isEmpty()) {
                int size = anchors.size();
                for (int i = 0; i < size; i++) {
                    Object slot = slots.slot(anchors.get(i), 0);
                    if (slot instanceof RecomposeScopeImpl) {
                        recomposeScopeImpl = (RecomposeScopeImpl) slot;
                    } else {
                        recomposeScopeImpl = null;
                    }
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.adoptedBy(newOwner);
                    }
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime_release(@NotNull SlotTable slots, @NotNull List<Anchor> anchors) {
            Intrinsics.checkNotNullParameter(slots, "slots");
            Intrinsics.checkNotNullParameter(anchors, "anchors");
            if (!anchors.isEmpty()) {
                int size = anchors.size();
                for (int i = 0; i < size; i++) {
                    Anchor anchor = anchors.get(i);
                    if (slots.ownsAnchor(anchor) && (slots.slot$runtime_release(slots.anchorIndex(anchor), 0) instanceof RecomposeScopeImpl)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public Companion() {
        }
    }

    public RecomposeScopeImpl(@Nullable RecomposeScopeOwner recomposeScopeOwner) {
        this.f28378b = recomposeScopeOwner;
    }

    /* renamed from: a */
    public final boolean m60248a() {
        if ((this.f28377a & 32) != 0) {
            return true;
        }
        return false;
    }

    public final void adoptedBy(@NotNull RecomposeScopeOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f28378b = owner;
    }

    /* renamed from: b */
    public final void m60247b(boolean z) {
        if (z) {
            this.f28377a |= 32;
        } else {
            this.f28377a &= -33;
        }
    }

    /* renamed from: c */
    public final void m60246c(boolean z) {
        if (z) {
            this.f28377a |= 16;
        } else {
            this.f28377a &= -17;
        }
    }

    public final void compose(@NotNull Composer composer) {
        Unit unit;
        Intrinsics.checkNotNullParameter(composer, "composer");
        Function2 function2 = this.f28380d;
        if (function2 != null) {
            function2.invoke(composer, 1);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit != null) {
            return;
        }
        throw new IllegalStateException("Invalid restart scope".toString());
    }

    @Nullable
    public final Function1<Composition, Unit> end(int i) {
        IdentityArrayIntMap identityArrayIntMap = this.f28382f;
        if (identityArrayIntMap == null || getSkipped$runtime_release()) {
            return null;
        }
        Object[] keys = identityArrayIntMap.getKeys();
        int[] values = identityArrayIntMap.getValues();
        int size = identityArrayIntMap.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            Intrinsics.checkNotNull(keys[i2], "null cannot be cast to non-null type kotlin.Any");
            if (values[i2] != i) {
                return new RecomposeScopeImpl$end$1$2(this, i, identityArrayIntMap);
            }
        }
        return null;
    }

    @Nullable
    public final Anchor getAnchor() {
        return this.f28379c;
    }

    public final boolean getCanRecompose() {
        if (this.f28380d != null) {
            return true;
        }
        return false;
    }

    public final boolean getDefaultsInScope() {
        if ((this.f28377a & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getDefaultsInvalid() {
        if ((this.f28377a & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getRequiresRecompose() {
        if ((this.f28377a & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getSkipped$runtime_release() {
        if ((this.f28377a & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getUsed() {
        if ((this.f28377a & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getValid() {
        boolean z;
        if (this.f28378b == null) {
            return false;
        }
        Anchor anchor = this.f28379c;
        if (anchor != null) {
            z = anchor.getValid();
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.f28378b;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.invalidate(this, null);
        }
    }

    @NotNull
    public final InvalidationResult invalidateForResult(@Nullable Object obj) {
        InvalidationResult invalidate;
        RecomposeScopeOwner recomposeScopeOwner = this.f28378b;
        if (recomposeScopeOwner == null || (invalidate = recomposeScopeOwner.invalidate(this, obj)) == null) {
            return InvalidationResult.IGNORED;
        }
        return invalidate;
    }

    public final boolean isConditional() {
        if (this.f28383g != null) {
            return true;
        }
        return false;
    }

    public final boolean isInvalidFor(@Nullable IdentityArraySet<Object> identityArraySet) {
        IdentityArrayMap identityArrayMap;
        if (identityArraySet != null && (identityArrayMap = this.f28383g) != null && identityArraySet.isNotEmpty()) {
            if (!identityArraySet.isEmpty()) {
                for (Object obj : identityArraySet) {
                    if (obj instanceof DerivedState) {
                        DerivedState derivedState = (DerivedState) obj;
                        SnapshotMutationPolicy policy = derivedState.getPolicy();
                        if (policy == null) {
                            policy = SnapshotStateKt.structuralEqualityPolicy();
                        }
                        if (!policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), identityArrayMap.get(derivedState))) {
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean recordRead(@NotNull Object instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        if (m60248a()) {
            return false;
        }
        IdentityArrayIntMap identityArrayIntMap = this.f28382f;
        if (identityArrayIntMap == null) {
            identityArrayIntMap = new IdentityArrayIntMap();
            this.f28382f = identityArrayIntMap;
        }
        if (identityArrayIntMap.add(instance, this.f28381e) == this.f28381e) {
            return true;
        }
        if (instance instanceof DerivedState) {
            IdentityArrayMap identityArrayMap = this.f28383g;
            if (identityArrayMap == null) {
                identityArrayMap = new IdentityArrayMap(0, 1, null);
                this.f28383g = identityArrayMap;
            }
            identityArrayMap.set(instance, ((DerivedState) instance).getCurrentRecord().getCurrentValue());
        }
        return false;
    }

    public final void release() {
        RecomposeScopeOwner recomposeScopeOwner = this.f28378b;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.recomposeScopeReleased(this);
        }
        this.f28378b = null;
        this.f28382f = null;
        this.f28383g = null;
    }

    public final void rereadTrackedInstances() {
        IdentityArrayIntMap identityArrayIntMap;
        RecomposeScopeOwner recomposeScopeOwner = this.f28378b;
        if (recomposeScopeOwner != null && (identityArrayIntMap = this.f28382f) != null) {
            m60247b(true);
            try {
                Object[] keys = identityArrayIntMap.getKeys();
                int[] values = identityArrayIntMap.getValues();
                int size = identityArrayIntMap.getSize();
                for (int i = 0; i < size; i++) {
                    Object obj = keys[i];
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Any");
                    int i2 = values[i];
                    recomposeScopeOwner.recordReadOf(obj);
                }
            } finally {
                m60247b(false);
            }
        }
    }

    public final void scopeSkipped() {
        m60246c(true);
    }

    public final void setAnchor(@Nullable Anchor anchor) {
        this.f28379c = anchor;
    }

    public final void setDefaultsInScope(boolean z) {
        if (z) {
            this.f28377a |= 2;
        } else {
            this.f28377a &= -3;
        }
    }

    public final void setDefaultsInvalid(boolean z) {
        if (z) {
            this.f28377a |= 4;
        } else {
            this.f28377a &= -5;
        }
    }

    public final void setRequiresRecompose(boolean z) {
        if (z) {
            this.f28377a |= 8;
        } else {
            this.f28377a &= -9;
        }
    }

    public final void setUsed(boolean z) {
        if (z) {
            this.f28377a |= 1;
        } else {
            this.f28377a &= -2;
        }
    }

    public final void start(int i) {
        this.f28381e = i;
        m60246c(false);
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(@NotNull Function2<? super Composer, ? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f28380d = block;
    }
}
