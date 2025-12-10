package th.p047co.dtac.android.dtacone.app_one.widget.composable;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Immutable
@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001Bj\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u008b\u0001\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J(\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0014H\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0018J(\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0001ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0018J\u001a\u0010 \u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R \u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R \u0010\u0006\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010(R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010(R \u0010\b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R \u0010\t\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b3\u0010&\u001a\u0004\b4\u0010(R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010&\u001a\u0004\b6\u0010(R \u0010\u000b\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b7\u0010&\u001a\u0004\b8\u0010(R \u0010\f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b9\u0010&\u001a\u0004\b:\u0010(R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010&\u001a\u0004\b<\u0010(R \u0010\u000e\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b=\u0010&\u001a\u0004\b>\u0010(\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006?"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonColors;", "", "Landroidx/compose/ui/graphics/Color;", "activeContainerColor", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "<init>", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "copy-2qZNXz8", "(JJJJJJJJJJJJ)Lth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonColors;", "copy", "", "enabled", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "borderColor-WaAFU9c$app_prodRelease", "(ZZ)J", "borderColor", "checked", "contentColor-WaAFU9c$app_prodRelease", "contentColor", "containerColor-WaAFU9c$app_prodRelease", "containerColor", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.SET_LINE_CAPSTYLE, "getActiveContainerColor-0d7_KjU", "()J", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getActiveContentColor-0d7_KjU", OperatorName.CURVE_TO, "getActiveBorderColor-0d7_KjU", "d", "getInactiveContainerColor-0d7_KjU", "e", "getInactiveContentColor-0d7_KjU", OperatorName.FILL_NON_ZERO, "getInactiveBorderColor-0d7_KjU", OperatorName.NON_STROKING_GRAY, "getDisabledActiveContainerColor-0d7_KjU", OperatorName.CLOSE_PATH, "getDisabledActiveContentColor-0d7_KjU", "i", "getDisabledActiveBorderColor-0d7_KjU", OperatorName.SET_LINE_JOINSTYLE, "getDisabledInactiveContainerColor-0d7_KjU", OperatorName.NON_STROKING_CMYK, "getDisabledInactiveContentColor-0d7_KjU", OperatorName.LINE_TO, "getDisabledInactiveBorderColor-0d7_KjU", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneSegmentedButtonRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneSegmentedButtonRow.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,643:1\n658#2:644\n646#2:645\n658#2:646\n646#2:647\n658#2:648\n646#2:649\n658#2:650\n646#2:651\n658#2:652\n646#2:653\n658#2:654\n646#2:655\n658#2:656\n646#2:657\n658#2:658\n646#2:659\n658#2:660\n646#2:661\n658#2:662\n646#2:663\n658#2:664\n646#2:665\n658#2:666\n646#2:667\n*S KotlinDebug\n*F\n+ 1 OneSegmentedButtonRow.kt\nth/co/dtac/android/dtacone/app_one/widget/composable/SegmentedButtonColors\n*L\n498#1:644\n498#1:645\n499#1:646\n499#1:647\n500#1:648\n500#1:649\n501#1:650\n501#1:651\n502#1:652\n502#1:653\n503#1:654\n503#1:655\n504#1:656\n504#1:657\n505#1:658\n505#1:659\n506#1:660\n506#1:661\n507#1:662\n507#1:663\n508#1:664\n508#1:665\n509#1:666\n509#1:667\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.composable.SegmentedButtonColors */
/* loaded from: classes7.dex */
public final class SegmentedButtonColors {
    public static final int $stable = 0;

    /* renamed from: a */
    public final long f82887a;

    /* renamed from: b */
    public final long f82888b;

    /* renamed from: c */
    public final long f82889c;

    /* renamed from: d */
    public final long f82890d;

    /* renamed from: e */
    public final long f82891e;

    /* renamed from: f */
    public final long f82892f;

    /* renamed from: g */
    public final long f82893g;

    /* renamed from: h */
    public final long f82894h;

    /* renamed from: i */
    public final long f82895i;

    /* renamed from: j */
    public final long f82896j;

    /* renamed from: k */
    public final long f82897k;

    /* renamed from: l */
    public final long f82898l;

    public /* synthetic */ SegmentedButtonColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12);
    }

    /* renamed from: copy-2qZNXz8$default  reason: not valid java name */
    public static /* synthetic */ SegmentedButtonColors m74950copy2qZNXz8$default(SegmentedButtonColors segmentedButtonColors, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        if ((i & 1) != 0) {
            j13 = segmentedButtonColors.f82887a;
        } else {
            j13 = j;
        }
        if ((i & 2) != 0) {
            j14 = segmentedButtonColors.f82888b;
        } else {
            j14 = j2;
        }
        if ((i & 4) != 0) {
            j15 = segmentedButtonColors.f82889c;
        } else {
            j15 = j3;
        }
        if ((i & 8) != 0) {
            j16 = segmentedButtonColors.f82890d;
        } else {
            j16 = j4;
        }
        if ((i & 16) != 0) {
            j17 = segmentedButtonColors.f82891e;
        } else {
            j17 = j5;
        }
        if ((i & 32) != 0) {
            j18 = segmentedButtonColors.f82892f;
        } else {
            j18 = j6;
        }
        if ((i & 64) != 0) {
            j19 = segmentedButtonColors.f82893g;
        } else {
            j19 = j7;
        }
        long j25 = j19;
        if ((i & 128) != 0) {
            j20 = segmentedButtonColors.f82894h;
        } else {
            j20 = j8;
        }
        long j26 = j20;
        if ((i & 256) != 0) {
            j21 = segmentedButtonColors.f82895i;
        } else {
            j21 = j9;
        }
        long j27 = j21;
        if ((i & 512) != 0) {
            j22 = segmentedButtonColors.f82896j;
        } else {
            j22 = j10;
        }
        long j28 = j22;
        if ((i & 1024) != 0) {
            j23 = segmentedButtonColors.f82897k;
        } else {
            j23 = j11;
        }
        long j29 = j23;
        if ((i & 2048) != 0) {
            j24 = segmentedButtonColors.f82898l;
        } else {
            j24 = j12;
        }
        return segmentedButtonColors.m74954copy2qZNXz8(j13, j14, j15, j16, j17, j18, j25, j26, j27, j28, j29, j24);
    }

    @Stable
    /* renamed from: borderColor-WaAFU9c$app_prodRelease  reason: not valid java name */
    public final long m74951borderColorWaAFU9c$app_prodRelease(boolean z, boolean z2) {
        if (z && z2) {
            return this.f82889c;
        }
        if (z && !z2) {
            return this.f82892f;
        }
        if (!z && z2) {
            return this.f82895i;
        }
        return this.f82898l;
    }

    @Stable
    /* renamed from: containerColor-WaAFU9c$app_prodRelease  reason: not valid java name */
    public final long m74952containerColorWaAFU9c$app_prodRelease(boolean z, boolean z2) {
        if (z && z2) {
            return this.f82887a;
        }
        if (z && !z2) {
            return this.f82890d;
        }
        if (!z && z2) {
            return this.f82893g;
        }
        return this.f82896j;
    }

    @Stable
    /* renamed from: contentColor-WaAFU9c$app_prodRelease  reason: not valid java name */
    public final long m74953contentColorWaAFU9c$app_prodRelease(boolean z, boolean z2) {
        if (z && z2) {
            return this.f82888b;
        }
        if (z && !z2) {
            return this.f82891e;
        }
        if (!z && z2) {
            return this.f82894h;
        }
        return this.f82897k;
    }

    @NotNull
    /* renamed from: copy-2qZNXz8  reason: not valid java name */
    public final SegmentedButtonColors m74954copy2qZNXz8(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        Color.Companion companion = Color.Companion;
        if (j != companion.m71771getUnspecified0d7_KjU()) {
            j13 = j;
        } else {
            j13 = this.f82887a;
        }
        if (j2 != companion.m71771getUnspecified0d7_KjU()) {
            j14 = j2;
        } else {
            j14 = this.f82888b;
        }
        if (j3 != companion.m71771getUnspecified0d7_KjU()) {
            j15 = j3;
        } else {
            j15 = this.f82889c;
        }
        if (j4 != companion.m71771getUnspecified0d7_KjU()) {
            j16 = j4;
        } else {
            j16 = this.f82890d;
        }
        if (j5 != companion.m71771getUnspecified0d7_KjU()) {
            j17 = j5;
        } else {
            j17 = this.f82891e;
        }
        if (j6 != companion.m71771getUnspecified0d7_KjU()) {
            j18 = j6;
        } else {
            j18 = this.f82892f;
        }
        if (j7 != companion.m71771getUnspecified0d7_KjU()) {
            j19 = j7;
        } else {
            j19 = this.f82893g;
        }
        if (j8 != companion.m71771getUnspecified0d7_KjU()) {
            j20 = j8;
        } else {
            j20 = this.f82894h;
        }
        if (j9 != companion.m71771getUnspecified0d7_KjU()) {
            j21 = j9;
        } else {
            j21 = this.f82895i;
        }
        if (j10 != companion.m71771getUnspecified0d7_KjU()) {
            j22 = j10;
        } else {
            j22 = this.f82896j;
        }
        if (j11 != companion.m71771getUnspecified0d7_KjU()) {
            j23 = j11;
        } else {
            j23 = this.f82897k;
        }
        if (j12 != companion.m71771getUnspecified0d7_KjU()) {
            j24 = j12;
        } else {
            j24 = this.f82898l;
        }
        return new SegmentedButtonColors(j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || SegmentedButtonColors.class != obj.getClass()) {
            return false;
        }
        SegmentedButtonColors segmentedButtonColors = (SegmentedButtonColors) obj;
        if (Color.m71736equalsimpl0(this.f82889c, segmentedButtonColors.f82889c) && Color.m71736equalsimpl0(this.f82888b, segmentedButtonColors.f82888b) && Color.m71736equalsimpl0(this.f82887a, segmentedButtonColors.f82887a) && Color.m71736equalsimpl0(this.f82892f, segmentedButtonColors.f82892f) && Color.m71736equalsimpl0(this.f82891e, segmentedButtonColors.f82891e) && Color.m71736equalsimpl0(this.f82890d, segmentedButtonColors.f82890d) && Color.m71736equalsimpl0(this.f82895i, segmentedButtonColors.f82895i) && Color.m71736equalsimpl0(this.f82894h, segmentedButtonColors.f82894h) && Color.m71736equalsimpl0(this.f82893g, segmentedButtonColors.f82893g) && Color.m71736equalsimpl0(this.f82898l, segmentedButtonColors.f82898l) && Color.m71736equalsimpl0(this.f82897k, segmentedButtonColors.f82897k) && Color.m71736equalsimpl0(this.f82896j, segmentedButtonColors.f82896j)) {
            return true;
        }
        return false;
    }

    /* renamed from: getActiveBorderColor-0d7_KjU  reason: not valid java name */
    public final long m74955getActiveBorderColor0d7_KjU() {
        return this.f82889c;
    }

    /* renamed from: getActiveContainerColor-0d7_KjU  reason: not valid java name */
    public final long m74956getActiveContainerColor0d7_KjU() {
        return this.f82887a;
    }

    /* renamed from: getActiveContentColor-0d7_KjU  reason: not valid java name */
    public final long m74957getActiveContentColor0d7_KjU() {
        return this.f82888b;
    }

    /* renamed from: getDisabledActiveBorderColor-0d7_KjU  reason: not valid java name */
    public final long m74958getDisabledActiveBorderColor0d7_KjU() {
        return this.f82895i;
    }

    /* renamed from: getDisabledActiveContainerColor-0d7_KjU  reason: not valid java name */
    public final long m74959getDisabledActiveContainerColor0d7_KjU() {
        return this.f82893g;
    }

    /* renamed from: getDisabledActiveContentColor-0d7_KjU  reason: not valid java name */
    public final long m74960getDisabledActiveContentColor0d7_KjU() {
        return this.f82894h;
    }

    /* renamed from: getDisabledInactiveBorderColor-0d7_KjU  reason: not valid java name */
    public final long m74961getDisabledInactiveBorderColor0d7_KjU() {
        return this.f82898l;
    }

    /* renamed from: getDisabledInactiveContainerColor-0d7_KjU  reason: not valid java name */
    public final long m74962getDisabledInactiveContainerColor0d7_KjU() {
        return this.f82896j;
    }

    /* renamed from: getDisabledInactiveContentColor-0d7_KjU  reason: not valid java name */
    public final long m74963getDisabledInactiveContentColor0d7_KjU() {
        return this.f82897k;
    }

    /* renamed from: getInactiveBorderColor-0d7_KjU  reason: not valid java name */
    public final long m74964getInactiveBorderColor0d7_KjU() {
        return this.f82892f;
    }

    /* renamed from: getInactiveContainerColor-0d7_KjU  reason: not valid java name */
    public final long m74965getInactiveContainerColor0d7_KjU() {
        return this.f82890d;
    }

    /* renamed from: getInactiveContentColor-0d7_KjU  reason: not valid java name */
    public final long m74966getInactiveContentColor0d7_KjU() {
        return this.f82891e;
    }

    public int hashCode() {
        return (((((((((((((((((((((Color.m71742hashCodeimpl(this.f82889c) * 31) + Color.m71742hashCodeimpl(this.f82888b)) * 31) + Color.m71742hashCodeimpl(this.f82887a)) * 31) + Color.m71742hashCodeimpl(this.f82892f)) * 31) + Color.m71742hashCodeimpl(this.f82891e)) * 31) + Color.m71742hashCodeimpl(this.f82890d)) * 31) + Color.m71742hashCodeimpl(this.f82895i)) * 31) + Color.m71742hashCodeimpl(this.f82894h)) * 31) + Color.m71742hashCodeimpl(this.f82893g)) * 31) + Color.m71742hashCodeimpl(this.f82898l)) * 31) + Color.m71742hashCodeimpl(this.f82897k)) * 31) + Color.m71742hashCodeimpl(this.f82896j);
    }

    public SegmentedButtonColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        this.f82887a = j;
        this.f82888b = j2;
        this.f82889c = j3;
        this.f82890d = j4;
        this.f82891e = j5;
        this.f82892f = j6;
        this.f82893g = j7;
        this.f82894h = j8;
        this.f82895i = j9;
        this.f82896j = j10;
        this.f82897k = j11;
        this.f82898l = j12;
    }
}
