package androidx.compose.foundation;

import android.os.Build;
import androidx.compose.p003ui.unit.C3641Dp;
import androidx.compose.p003ui.unit.DpSize;
import androidx.compose.runtime.Stable;
import ch.qos.logback.core.CoreConstants;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Stable
@ExperimentalFoundationApi
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B<\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fB>\b\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010\b\u001a\u00020\u00068\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u001aR\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010\u0018\u001a\u0004\b(\u0010\u001aR\u0011\u0010)\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b)\u0010\u001a\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, m28850d2 = {"Landroidx/compose/foundation/MagnifierStyle;", "", "", "useTextDefault", "Landroidx/compose/ui/unit/DpSize;", "size", "Landroidx/compose/ui/unit/Dp;", "cornerRadius", "elevation", "clippingEnabled", "fishEyeEnabled", "<init>", "(ZJFFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "(JFFZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", "getUseTextDefault$foundation_release", "()Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.SET_LINE_CAPSTYLE, "getSize-MYxV2XQ$foundation_release", "()J", OperatorName.CURVE_TO, "F", "getCornerRadius-D9Ej5fM$foundation_release", "()F", "d", "getElevation-D9Ej5fM$foundation_release", "e", "getClippingEnabled$foundation_release", OperatorName.FILL_NON_ZERO, "getFishEyeEnabled$foundation_release", "isSupported", "Companion", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class MagnifierStyle {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: g */
    public static final MagnifierStyle f12866g;

    /* renamed from: h */
    public static final MagnifierStyle f12867h;

    /* renamed from: a */
    public final boolean f12868a;

    /* renamed from: b */
    public final long f12869b;

    /* renamed from: c */
    public final float f12870c;

    /* renamed from: d */
    public final float f12871d;

    /* renamed from: e */
    public final boolean f12872e;

    /* renamed from: f */
    public final boolean f12873f;

    @Metadata(m28851d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0010R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007¨\u0006\u0011"}, m28850d2 = {"Landroidx/compose/foundation/MagnifierStyle$Companion;", "", "()V", Constant.OnePostpaidVerifyKey.Default, "Landroidx/compose/foundation/MagnifierStyle;", "getDefault$annotations", "getDefault", "()Landroidx/compose/foundation/MagnifierStyle;", "TextDefault", "getTextDefault$annotations", "getTextDefault", "isStyleSupported", "", "style", RemoteConfigConstants.RequestFieldKey.SDK_VERSION, "", "isStyleSupported$foundation_release", "foundation_release"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getDefault$annotations() {
        }

        @ExperimentalFoundationApi
        public static /* synthetic */ void getTextDefault$annotations() {
        }

        public static /* synthetic */ boolean isStyleSupported$foundation_release$default(Companion companion, MagnifierStyle magnifierStyle, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = Build.VERSION.SDK_INT;
            }
            return companion.isStyleSupported$foundation_release(magnifierStyle, i);
        }

        @NotNull
        public final MagnifierStyle getDefault() {
            return MagnifierStyle.f12866g;
        }

        @NotNull
        public final MagnifierStyle getTextDefault() {
            return MagnifierStyle.f12867h;
        }

        public final boolean isStyleSupported$foundation_release(@NotNull MagnifierStyle style, int i) {
            Intrinsics.checkNotNullParameter(style, "style");
            if (!MagnifierKt.isPlatformMagnifierSupported(i) || style.getFishEyeEnabled$foundation_release()) {
                return false;
            }
            if (!style.getUseTextDefault$foundation_release() && !Intrinsics.areEqual(style, getDefault()) && i < 29) {
                return false;
            }
            return true;
        }

        public Companion() {
        }
    }

    static {
        MagnifierStyle magnifierStyle = new MagnifierStyle(0L, 0.0f, 0.0f, false, false, 31, (DefaultConstructorMarker) null);
        f12866g = magnifierStyle;
        f12867h = new MagnifierStyle(true, magnifierStyle.f12869b, magnifierStyle.f12870c, magnifierStyle.f12871d, magnifierStyle.f12872e, magnifierStyle.f12873f, (DefaultConstructorMarker) null);
    }

    @ExperimentalFoundationApi
    public /* synthetic */ MagnifierStyle(long j, float f, float f2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, f2, z, z2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MagnifierStyle)) {
            return false;
        }
        MagnifierStyle magnifierStyle = (MagnifierStyle) obj;
        if (this.f12868a == magnifierStyle.f12868a && DpSize.m73753equalsimpl0(this.f12869b, magnifierStyle.f12869b) && C3641Dp.m73663equalsimpl0(this.f12870c, magnifierStyle.f12870c) && C3641Dp.m73663equalsimpl0(this.f12871d, magnifierStyle.f12871d) && this.f12872e == magnifierStyle.f12872e && this.f12873f == magnifierStyle.f12873f) {
            return true;
        }
        return false;
    }

    public final boolean getClippingEnabled$foundation_release() {
        return this.f12872e;
    }

    /* renamed from: getCornerRadius-D9Ej5fM$foundation_release  reason: not valid java name */
    public final float m69367getCornerRadiusD9Ej5fM$foundation_release() {
        return this.f12870c;
    }

    /* renamed from: getElevation-D9Ej5fM$foundation_release  reason: not valid java name */
    public final float m69368getElevationD9Ej5fM$foundation_release() {
        return this.f12871d;
    }

    public final boolean getFishEyeEnabled$foundation_release() {
        return this.f12873f;
    }

    /* renamed from: getSize-MYxV2XQ$foundation_release  reason: not valid java name */
    public final long m69369getSizeMYxV2XQ$foundation_release() {
        return this.f12869b;
    }

    public final boolean getUseTextDefault$foundation_release() {
        return this.f12868a;
    }

    public int hashCode() {
        return (((((((((AbstractC1705Xp.m65430a(this.f12868a) * 31) + DpSize.m73758hashCodeimpl(this.f12869b)) * 31) + C3641Dp.m73664hashCodeimpl(this.f12870c)) * 31) + C3641Dp.m73664hashCodeimpl(this.f12871d)) * 31) + AbstractC1705Xp.m65430a(this.f12872e)) * 31) + AbstractC1705Xp.m65430a(this.f12873f);
    }

    public final boolean isSupported() {
        return Companion.isStyleSupported$foundation_release$default(Companion, this, 0, 2, null);
    }

    @NotNull
    public String toString() {
        if (this.f12868a) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + ((Object) DpSize.m73763toStringimpl(this.f12869b)) + ", cornerRadius=" + ((Object) C3641Dp.m73669toStringimpl(this.f12870c)) + ", elevation=" + ((Object) C3641Dp.m73669toStringimpl(this.f12871d)) + ", clippingEnabled=" + this.f12872e + ", fishEyeEnabled=" + this.f12873f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ MagnifierStyle(boolean z, long j, float f, float f2, boolean z2, boolean z3, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, j, f, f2, z2, z3);
    }

    public MagnifierStyle(boolean z, long j, float f, float f2, boolean z2, boolean z3) {
        this.f12868a = z;
        this.f12869b = j;
        this.f12870c = f;
        this.f12871d = f2;
        this.f12872e = z2;
        this.f12873f = z3;
    }

    public /* synthetic */ MagnifierStyle(long j, float f, float f2, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DpSize.Companion.m73765getUnspecifiedMYxV2XQ() : j, (i & 2) != 0 ? C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM() : f, (i & 4) != 0 ? C3641Dp.Companion.m73678getUnspecifiedD9Ej5fM() : f2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2, (DefaultConstructorMarker) null);
    }

    public MagnifierStyle(long j, float f, float f2, boolean z, boolean z2) {
        this(false, j, f, f2, z, z2, (DefaultConstructorMarker) null);
    }
}
