package th.p047co.dtac.android.dtacone.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\"\u0010\"\u001a\u00020\u00108\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0016¨\u0006$"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/view/TriStateToggle;", "Landroid/widget/ImageButton;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "extraSpace", "", "onCreateDrawableState", "(I)[I", "", "performClick", "()Z", "Lth/co/dtac/android/dtacone/widget/view/TriStateToggle$TriStateEnum;", "getState", "()Lth/co/dtac/android/dtacone/widget/view/TriStateToggle$TriStateEnum;", RemoteConfigConstants.ResponseFieldKey.STATE, "", "setState", "(Lth/co/dtac/android/dtacone/widget/view/TriStateToggle$TriStateEnum;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "[I", "IDLE_STATE", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "OFF_STATE", OperatorName.CURVE_TO, "ON_STATE", "d", "Lth/co/dtac/android/dtacone/widget/view/TriStateToggle$TriStateEnum;", "getInternalState$app_prodRelease", "setInternalState$app_prodRelease", "internalState", "TriStateEnum", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.view.TriStateToggle */
/* loaded from: classes9.dex */
public final class TriStateToggle extends ImageButton {
    public static final int $stable = 8;

    /* renamed from: a */
    public final int[] f107466a;

    /* renamed from: b */
    public final int[] f107467b;

    /* renamed from: c */
    public final int[] f107468c;

    /* renamed from: d */
    public TriStateEnum f107469d;

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/view/TriStateToggle$TriStateEnum;", "", "(Ljava/lang/String;I)V", "IDLE", "OFF", "ON", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.view.TriStateToggle$TriStateEnum */
    /* loaded from: classes9.dex */
    public enum TriStateEnum {
        IDLE,
        OFF,
        ON
    }

    @Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.view.TriStateToggle$WhenMappings */
    /* loaded from: classes9.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TriStateEnum.values().length];
            try {
                iArr[TriStateEnum.IDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TriStateEnum.OFF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TriStateEnum.ON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriStateToggle(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.f107466a = new int[]{R.attr.TRI_STATE_IDLE_STATE};
        this.f107467b = new int[]{R.attr.TRI_STATE_OFF_STATE};
        this.f107468c = new int[]{R.attr.TRI_STATE_ON_STATE};
        this.f107469d = TriStateEnum.IDLE;
    }

    @NotNull
    public final TriStateEnum getInternalState$app_prodRelease() {
        return this.f107469d;
    }

    @NotNull
    public final TriStateEnum getState() {
        return this.f107469d;
    }

    @Override // android.widget.ImageView, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int i) {
        int[] drawableState = super.onCreateDrawableState(i + 1);
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.f107469d.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    View.mergeDrawableStates(drawableState, this.f107468c);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                View.mergeDrawableStates(drawableState, this.f107467b);
            }
        } else {
            View.mergeDrawableStates(drawableState, this.f107466a);
        }
        Intrinsics.checkNotNullExpressionValue(drawableState, "drawableState");
        return drawableState;
    }

    @Override // android.view.View
    public boolean performClick() {
        super.performClick();
        int ordinal = (this.f107469d.ordinal() + 1) % TriStateEnum.values().length;
        TriStateEnum[] values = TriStateEnum.values();
        if (ordinal == 0) {
            ordinal++;
        }
        this.f107469d = values[ordinal];
        return true;
    }

    public final void setInternalState$app_prodRelease(@NotNull TriStateEnum triStateEnum) {
        Intrinsics.checkNotNullParameter(triStateEnum, "<set-?>");
        this.f107469d = triStateEnum;
    }

    public final void setState(@NotNull TriStateEnum state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f107469d = state;
    }
}