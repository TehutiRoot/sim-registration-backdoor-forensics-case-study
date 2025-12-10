package androidx.compose.material.ripple;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Size;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 @2\u00020\u0001:\u0001@B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJQ\u0010+\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\r\u0010,\u001a\u00020\b¢\u0006\u0004\b,\u0010\u0018J3\u0010/\u001a\u00020\b2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.J\r\u00100\u001a\u00020\b¢\u0006\u0004\b0\u0010\u0018J\u0017\u0010\u0014\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\nR\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u00105R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006A"}, m28850d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "", "pressed", "", "setRippleState", "(Z)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", OperatorName.LINE_TO, "t", PDPageLabelRange.STYLE_ROMAN_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "onLayout", "(ZIIII)V", "refreshDrawableState", "()V", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "(Landroid/graphics/drawable/Drawable;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "bounded", "Landroidx/compose/ui/geometry/Size;", "size", "radius", "Landroidx/compose/ui/graphics/Color;", TypedValues.Custom.S_COLOR, "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "addRipple-KOepWvA", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;ZJIJFLkotlin/jvm/functions/Function0;)V", "addRipple", "removeRipple", "updateRippleProperties-biQXAtU", "(JIJF)V", "updateRippleProperties", "disposeRipple", "Landroidx/compose/material/ripple/UnprojectedRipple;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroidx/compose/material/ripple/UnprojectedRipple;", "ripple", "Ljava/lang/Boolean;", "", OperatorName.CURVE_TO, "Ljava/lang/Long;", "lastRippleStateChangeTimeMillis", "Ljava/lang/Runnable;", "d", "Ljava/lang/Runnable;", "resetRippleRunnable", "e", "Lkotlin/jvm/functions/Function0;", "Companion", "material-ripple_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class RippleHostView extends View {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: f */
    public static final int[] f25497f = {16842919, 16842910};

    /* renamed from: g */
    public static final int[] f25498g = new int[0];

    /* renamed from: a */
    public UnprojectedRipple f25499a;

    /* renamed from: b */
    public Boolean f25500b;

    /* renamed from: c */
    public Long f25501c;

    /* renamed from: d */
    public Runnable f25502d;

    /* renamed from: e */
    public Function0 f25503e;

    @Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m28850d2 = {"Landroidx/compose/material/ripple/RippleHostView$Companion;", "", "()V", "MinimumRippleStateChangeTime", "", "PressedState", "", "ResetRippleDelayDuration", "RestingState", "material-ripple_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleHostView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: a */
    public static /* synthetic */ void m60715a(RippleHostView rippleHostView) {
        setRippleState$lambda$2(rippleHostView);
    }

    private final void setRippleState(boolean z) {
        long j;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f25502d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.f25501c;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentAnimationTimeMillis - j;
        if (!z && j2 < 5) {
            Runnable runnable2 = new Runnable() { // from class: xy1
                {
                    RippleHostView.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    RippleHostView.m60715a(RippleHostView.this);
                }
            };
            this.f25502d = runnable2;
            postDelayed(runnable2, 50L);
        } else {
            if (z) {
                iArr = f25497f;
            } else {
                iArr = f25498g;
            }
            UnprojectedRipple unprojectedRipple = this.f25499a;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        }
        this.f25501c = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$2(RippleHostView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UnprojectedRipple unprojectedRipple = this$0.f25499a;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(f25498g);
        }
        this$0.f25502d = null;
    }

    /* renamed from: addRipple-KOepWvA */
    public final void m70177addRippleKOepWvA(@NotNull PressInteraction.Press interaction, boolean z, long j, int i, long j2, float f, @NotNull Function0<Unit> onInvalidateRipple) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(onInvalidateRipple, "onInvalidateRipple");
        if (this.f25499a == null || !Intrinsics.areEqual(Boolean.valueOf(z), this.f25500b)) {
            m60714b(z);
            this.f25500b = Boolean.valueOf(z);
        }
        UnprojectedRipple unprojectedRipple = this.f25499a;
        Intrinsics.checkNotNull(unprojectedRipple);
        this.f25503e = onInvalidateRipple;
        m70178updateRipplePropertiesbiQXAtU(j, i, j2, f);
        if (z) {
            unprojectedRipple.setHotspot(Offset.m71502getXimpl(interaction.m69459getPressPositionF1C5BW0()), Offset.m71503getYimpl(interaction.m69459getPressPositionF1C5BW0()));
        } else {
            unprojectedRipple.setHotspot(unprojectedRipple.getBounds().centerX(), unprojectedRipple.getBounds().centerY());
        }
        setRippleState(true);
    }

    /* renamed from: b */
    public final void m60714b(boolean z) {
        UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z);
        setBackground(unprojectedRipple);
        this.f25499a = unprojectedRipple;
    }

    public final void disposeRipple() {
        this.f25503e = null;
        Runnable runnable = this.f25502d;
        if (runnable != null) {
            removeCallbacks(runnable);
            Runnable runnable2 = this.f25502d;
            Intrinsics.checkNotNull(runnable2);
            runnable2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.f25499a;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(f25498g);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.f25499a;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        Function0 function0 = this.f25503e;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* renamed from: updateRippleProperties-biQXAtU */
    public final void m70178updateRipplePropertiesbiQXAtU(long j, int i, long j2, float f) {
        UnprojectedRipple unprojectedRipple = this.f25499a;
        if (unprojectedRipple == null) {
            return;
        }
        unprojectedRipple.m60706c(i);
        unprojectedRipple.m60707b(j2, f);
        Rect rect = new Rect(0, 0, AbstractC21140mr0.roundToInt(Size.m71571getWidthimpl(j)), AbstractC21140mr0.roundToInt(Size.m71568getHeightimpl(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        unprojectedRipple.setBounds(rect);
    }
}
