package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsInfo;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.BeyondBoundsLayout;
import androidx.compose.p003ui.layout.BeyondBoundsLayoutKt;
import androidx.compose.p003ui.modifier.ModifierLocalProvider;
import androidx.compose.p003ui.modifier.ProvidableModifierLocal;
import androidx.compose.p003ui.unit.LayoutDirection;
import ch.qos.logback.core.joran.action.Action;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 02\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0002:\u00010B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0019\u0010\u0015\u001a\u0015\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0012¢\u0006\u0002\b\u0014H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u0007*\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u0007*\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u0007*\u00020\u0010H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u001c\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u00061"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal;", "Landroidx/compose/ui/modifier/ModifierLocalProvider;", "Landroidx/compose/ui/layout/BeyondBoundsLayout;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", RemoteConfigConstants.ResponseFieldKey.STATE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "beyondBoundsInfo", "", "reverseLayout", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;ZLandroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/foundation/gestures/Orientation;)V", "T", "Landroidx/compose/ui/layout/BeyondBoundsLayout$LayoutDirection;", "direction", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/BeyondBoundsLayout$BeyondBoundsScope;", "Lkotlin/ExtensionFunctionType;", "block", "layout-o7g1Pn8", "(ILkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "layout", "e", "(I)Z", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "currentInterval", OperatorName.CURVE_TO, "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;", "d", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo$Interval;I)Z", OperatorName.FILL_NON_ZERO, PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsState;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsInfo;", "Z", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/foundation/gestures/Orientation;", "Landroidx/compose/ui/modifier/ProvidableModifierLocal;", "getKey", "()Landroidx/compose/ui/modifier/ProvidableModifierLocal;", Action.KEY_ATTRIBUTE, "getValue", "()Landroidx/compose/ui/layout/BeyondBoundsLayout;", "value", "Companion", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class LazyLayoutBeyondBoundsModifierLocal implements ModifierLocalProvider<BeyondBoundsLayout>, BeyondBoundsLayout {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final C2927x8f1df05a f13621f = new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1

        /* renamed from: a */
        public final boolean f13627a;

        @Override // androidx.compose.p003ui.layout.BeyondBoundsLayout.BeyondBoundsScope
        public boolean getHasMoreContent() {
            return this.f13627a;
        }
    };

    /* renamed from: a */
    public final LazyLayoutBeyondBoundsState f13622a;

    /* renamed from: b */
    public final LazyLayoutBeyondBoundsInfo f13623b;

    /* renamed from: c */
    public final boolean f13624c;

    /* renamed from: d */
    public final LayoutDirection f13625d;

    /* renamed from: e */
    public final Orientation f13626e;

    @Metadata(m28851d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\b\u0003*\u0001\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005¨\u0006\u0006"}, m28850d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal$Companion;", "", "()V", "emptyBeyondBoundsScope", "androidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1", "Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierLocal$Companion$emptyBeyondBoundsScope$1;", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public LazyLayoutBeyondBoundsModifierLocal(@NotNull LazyLayoutBeyondBoundsState state, @NotNull LazyLayoutBeyondBoundsInfo beyondBoundsInfo, boolean z, @NotNull LayoutDirection layoutDirection, @NotNull Orientation orientation) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(beyondBoundsInfo, "beyondBoundsInfo");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        this.f13622a = state;
        this.f13623b = beyondBoundsInfo;
        this.f13624c = z;
        this.f13625d = layoutDirection;
        this.f13626e = orientation;
    }

    /* renamed from: access$hasMoreContent-FR3nfPY */
    public static final /* synthetic */ boolean m69638access$hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsModifierLocal lazyLayoutBeyondBoundsModifierLocal, LazyLayoutBeyondBoundsInfo.Interval interval, int i) {
        return lazyLayoutBeyondBoundsModifierLocal.m61215d(interval, i);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean all(Function1 function1) {
        return AbstractC20114gt0.m30962a(this, function1);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ boolean any(Function1 function1) {
        return AbstractC20114gt0.m30961b(this, function1);
    }

    /* renamed from: c */
    public final LazyLayoutBeyondBoundsInfo.Interval m61216c(LazyLayoutBeyondBoundsInfo.Interval interval, int i) {
        int start = interval.getStart();
        int end = interval.getEnd();
        if (m61214e(i)) {
            end++;
        } else {
            start--;
        }
        return this.f13623b.addInterval(start, end);
    }

    /* renamed from: d */
    public final boolean m61215d(LazyLayoutBeyondBoundsInfo.Interval interval, int i) {
        if (m61213f(i)) {
            return false;
        }
        if (m61214e(i)) {
            if (interval.getEnd() >= this.f13622a.getItemCount() - 1) {
                return false;
            }
        } else if (interval.getStart() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m61214e(int i) {
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        if (BeyondBoundsLayout.LayoutDirection.m72795equalsimpl0(i, companion.m72801getBeforehoxUOeE())) {
            return false;
        }
        if (!BeyondBoundsLayout.LayoutDirection.m72795equalsimpl0(i, companion.m72800getAfterhoxUOeE())) {
            if (BeyondBoundsLayout.LayoutDirection.m72795equalsimpl0(i, companion.m72799getAbovehoxUOeE())) {
                return this.f13624c;
            }
            if (BeyondBoundsLayout.LayoutDirection.m72795equalsimpl0(i, companion.m72802getBelowhoxUOeE())) {
                if (this.f13624c) {
                    return false;
                }
            } else if (BeyondBoundsLayout.LayoutDirection.m72795equalsimpl0(i, companion.m72803getLefthoxUOeE())) {
                int i2 = WhenMappings.$EnumSwitchMapping$0[this.f13625d.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        if (this.f13624c) {
                            return false;
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    return this.f13624c;
                }
            } else if (!BeyondBoundsLayout.LayoutDirection.m72795equalsimpl0(i, companion.m72804getRighthoxUOeE())) {
                LazyLayoutBeyondBoundsModifierLocalKt.m61212a();
                throw new KotlinNothingValueException();
            } else {
                int i3 = WhenMappings.$EnumSwitchMapping$0[this.f13625d.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        return this.f13624c;
                    }
                    throw new NoWhenBranchMatchedException();
                } else if (this.f13624c) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: f */
    public final boolean m61213f(int i) {
        boolean m72795equalsimpl0;
        boolean m72795equalsimpl02;
        BeyondBoundsLayout.LayoutDirection.Companion companion = BeyondBoundsLayout.LayoutDirection.Companion;
        boolean z = true;
        if (BeyondBoundsLayout.LayoutDirection.m72795equalsimpl0(i, companion.m72799getAbovehoxUOeE())) {
            m72795equalsimpl0 = true;
        } else {
            m72795equalsimpl0 = BeyondBoundsLayout.LayoutDirection.m72795equalsimpl0(i, companion.m72802getBelowhoxUOeE());
        }
        if (m72795equalsimpl0) {
            if (this.f13626e == Orientation.Horizontal) {
                return true;
            }
        } else {
            if (BeyondBoundsLayout.LayoutDirection.m72795equalsimpl0(i, companion.m72803getLefthoxUOeE())) {
                m72795equalsimpl02 = true;
            } else {
                m72795equalsimpl02 = BeyondBoundsLayout.LayoutDirection.m72795equalsimpl0(i, companion.m72804getRighthoxUOeE());
            }
            if (m72795equalsimpl02) {
                if (this.f13626e == Orientation.Vertical) {
                    return true;
                }
            } else {
                if (!BeyondBoundsLayout.LayoutDirection.m72795equalsimpl0(i, companion.m72801getBeforehoxUOeE())) {
                    z = BeyondBoundsLayout.LayoutDirection.m72795equalsimpl0(i, companion.m72800getAfterhoxUOeE());
                }
                if (!z) {
                    LazyLayoutBeyondBoundsModifierLocalKt.m61212a();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return false;
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30960c(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.Modifier.Element, androidx.compose.p003ui.Modifier
    public /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return AbstractC20114gt0.m30959d(this, obj, function2);
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalProvider
    @NotNull
    public ProvidableModifierLocal<BeyondBoundsLayout> getKey() {
        return BeyondBoundsLayoutKt.getModifierLocalBeyondBoundsLayout();
    }

    @Override // androidx.compose.p003ui.modifier.ModifierLocalProvider
    @NotNull
    public BeyondBoundsLayout getValue() {
        return this;
    }

    @Override // androidx.compose.p003ui.layout.BeyondBoundsLayout
    @Nullable
    /* renamed from: layout-o7g1Pn8 */
    public <T> T mo69639layouto7g1Pn8(final int i, @NotNull Function1<? super BeyondBoundsLayout.BeyondBoundsScope, ? extends T> block) {
        int firstPlacedIndex;
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.f13622a.getItemCount() > 0 && this.f13622a.getHasVisibleItems()) {
            if (m61214e(i)) {
                firstPlacedIndex = this.f13622a.getLastPlacedIndex();
            } else {
                firstPlacedIndex = this.f13622a.getFirstPlacedIndex();
            }
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = (T) this.f13623b.addInterval(firstPlacedIndex, firstPlacedIndex);
            T t = null;
            while (t == null && m61215d((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, i)) {
                this.f13623b.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
                objectRef.element = (T) m61216c((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, i);
                this.f13622a.remeasure();
                t = block.invoke(new BeyondBoundsLayout.BeyondBoundsScope() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal$layout$2
                    @Override // androidx.compose.p003ui.layout.BeyondBoundsLayout.BeyondBoundsScope
                    public boolean getHasMoreContent() {
                        return LazyLayoutBeyondBoundsModifierLocal.m69638access$hasMoreContentFR3nfPY(LazyLayoutBeyondBoundsModifierLocal.this, (LazyLayoutBeyondBoundsInfo.Interval) objectRef.element, i);
                    }
                });
            }
            this.f13623b.removeInterval((LazyLayoutBeyondBoundsInfo.Interval) objectRef.element);
            this.f13622a.remeasure();
            return t;
        }
        return block.invoke(f13621f);
    }

    @Override // androidx.compose.p003ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return AbstractC19942ft0.m31254a(this, modifier);
    }
}
