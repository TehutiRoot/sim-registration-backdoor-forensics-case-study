package com.airbnb.lottie.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.LottieComposition;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.AbstractC11719c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\n\u000b\f\rB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H ¢\u0006\u0002\b\u0007J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H ¢\u0006\u0002\b\t\u0082\u0001\u0004\u000e\u000f\u0010\u0011¨\u0006\u0012"}, m28850d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "()V", "getMaxProgress", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "getMaxProgress$lottie_compose_release", "getMinProgress", "getMinProgress$lottie_compose_release", "Frame", "Marker", "Markers", "Progress", "Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;", "lottie-compose_release"}, m28849k = 1, m28848mv = {1, 6, 0}, m28846xi = 48)
/* loaded from: classes3.dex */
public abstract class LottieClipSpec {
    public static final int $stable = 0;

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\"\u001a\u0004\b%\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0015R\u0016\u0010*\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\"¨\u0006+"}, m28850d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "min", "max", "", "maxInclusive", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)V", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "getMinProgress$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)F", "getMinProgress", "getMaxProgress$lottie_compose_release", "getMaxProgress", "component1", "()Ljava/lang/Integer;", "component2", "component3", "()Z", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Z)Lcom/airbnb/lottie/compose/LottieClipSpec$Frame;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/Integer;", "getMin", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMax", OperatorName.CURVE_TO, "Z", "getMaxInclusive", "d", "actualMaxFrame", "lottie-compose_release"}, m28849k = 1, m28848mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class Frame extends LottieClipSpec {
        public static final int $stable = 0;

        /* renamed from: a */
        public final Integer f41237a;

        /* renamed from: b */
        public final Integer f41238b;

        /* renamed from: c */
        public final boolean f41239c;

        /* renamed from: d */
        public final Integer f41240d;

        public Frame() {
            this(null, null, false, 7, null);
        }

        public static /* synthetic */ Frame copy$default(Frame frame, Integer num, Integer num2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                num = frame.f41237a;
            }
            if ((i & 2) != 0) {
                num2 = frame.f41238b;
            }
            if ((i & 4) != 0) {
                z = frame.f41239c;
            }
            return frame.copy(num, num2, z);
        }

        @Nullable
        public final Integer component1() {
            return this.f41237a;
        }

        @Nullable
        public final Integer component2() {
            return this.f41238b;
        }

        public final boolean component3() {
            return this.f41239c;
        }

        @NotNull
        public final Frame copy(@Nullable Integer num, @Nullable Integer num2, boolean z) {
            return new Frame(num, num2, z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Frame) {
                Frame frame = (Frame) obj;
                return Intrinsics.areEqual(this.f41237a, frame.f41237a) && Intrinsics.areEqual(this.f41238b, frame.f41238b) && this.f41239c == frame.f41239c;
            }
            return false;
        }

        @Nullable
        public final Integer getMax() {
            return this.f41238b;
        }

        public final boolean getMaxInclusive() {
            return this.f41239c;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            Integer num = this.f41240d;
            if (num == null) {
                return 1.0f;
            }
            return AbstractC11719c.coerceIn(num.intValue() / composition.getEndFrame(), 0.0f, 1.0f);
        }

        @Nullable
        public final Integer getMin() {
            return this.f41237a;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            Integer num = this.f41237a;
            if (num == null) {
                return 0.0f;
            }
            return AbstractC11719c.coerceIn(num.intValue() / composition.getEndFrame(), 0.0f, 1.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            Integer num = this.f41237a;
            int hashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.f41238b;
            int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
            boolean z = this.f41239c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode2 + i;
        }

        @NotNull
        public String toString() {
            return "Frame(min=" + this.f41237a + ", max=" + this.f41238b + ", maxInclusive=" + this.f41239c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ Frame(Integer num, Integer num2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? true : z);
        }

        public Frame(@Nullable Integer num, @Nullable Integer num2, boolean z) {
            super(null);
            this.f41237a = num;
            this.f41238b = num2;
            this.f41239c = z;
            if (num2 == null) {
                num2 = null;
            } else if (!z) {
                num2 = Integer.valueOf(num2.intValue() - 1);
            }
            this.f41240d = num2;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0010¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, m28850d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "marker", "<init>", "(Ljava/lang/String;)V", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "getMinProgress$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)F", "getMinProgress", "getMaxProgress$lottie_compose_release", "getMaxProgress", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/airbnb/lottie/compose/LottieClipSpec$Marker;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getMarker", "lottie-compose_release"}, m28849k = 1, m28848mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class Marker extends LottieClipSpec {
        public static final int $stable = 0;

        /* renamed from: a */
        public final String f41241a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Marker(@NotNull String marker) {
            super(null);
            Intrinsics.checkNotNullParameter(marker, "marker");
            this.f41241a = marker;
        }

        public static /* synthetic */ Marker copy$default(Marker marker, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = marker.f41241a;
            }
            return marker.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.f41241a;
        }

        @NotNull
        public final Marker copy(@NotNull String marker) {
            Intrinsics.checkNotNullParameter(marker, "marker");
            return new Marker(marker);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Marker) && Intrinsics.areEqual(this.f41241a, ((Marker) obj).f41241a);
        }

        @NotNull
        public final String getMarker() {
            return this.f41241a;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            com.airbnb.lottie.model.Marker marker = composition.getMarker(this.f41241a);
            if (marker == null) {
                return 1.0f;
            }
            return AbstractC11719c.coerceIn((marker.startFrame + marker.durationFrames) / composition.getEndFrame(), 0.0f, 1.0f);
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            float f;
            Intrinsics.checkNotNullParameter(composition, "composition");
            com.airbnb.lottie.model.Marker marker = composition.getMarker(this.f41241a);
            if (marker == null) {
                f = 0.0f;
            } else {
                f = marker.startFrame;
            }
            return AbstractC11719c.coerceIn(f / composition.getEndFrame(), 0.0f, 1.0f);
        }

        public int hashCode() {
            return this.f41241a.hashCode();
        }

        @NotNull
        public String toString() {
            return "Marker(marker=" + this.f41241a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0010¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J2\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0012R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0015¨\u0006("}, m28850d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "min", "max", "", "maxInclusive", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "getMinProgress$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)F", "getMinProgress", "getMaxProgress$lottie_compose_release", "getMaxProgress", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/airbnb/lottie/compose/LottieClipSpec$Markers;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getMin", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMax", OperatorName.CURVE_TO, "Z", "getMaxInclusive", "lottie-compose_release"}, m28849k = 1, m28848mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class Markers extends LottieClipSpec {
        public static final int $stable = 0;

        /* renamed from: a */
        public final String f41242a;

        /* renamed from: b */
        public final String f41243b;

        /* renamed from: c */
        public final boolean f41244c;

        public Markers() {
            this(null, null, false, 7, null);
        }

        public static /* synthetic */ Markers copy$default(Markers markers, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = markers.f41242a;
            }
            if ((i & 2) != 0) {
                str2 = markers.f41243b;
            }
            if ((i & 4) != 0) {
                z = markers.f41244c;
            }
            return markers.copy(str, str2, z);
        }

        @Nullable
        public final String component1() {
            return this.f41242a;
        }

        @Nullable
        public final String component2() {
            return this.f41243b;
        }

        public final boolean component3() {
            return this.f41244c;
        }

        @NotNull
        public final Markers copy(@Nullable String str, @Nullable String str2, boolean z) {
            return new Markers(str, str2, z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Markers) {
                Markers markers = (Markers) obj;
                return Intrinsics.areEqual(this.f41242a, markers.f41242a) && Intrinsics.areEqual(this.f41243b, markers.f41243b) && this.f41244c == markers.f41244c;
            }
            return false;
        }

        @Nullable
        public final String getMax() {
            return this.f41243b;
        }

        public final boolean getMaxInclusive() {
            return this.f41244c;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            int i;
            float f;
            Intrinsics.checkNotNullParameter(composition, "composition");
            String str = this.f41243b;
            if (str == null) {
                return 1.0f;
            }
            if (this.f41244c) {
                i = 0;
            } else {
                i = -1;
            }
            com.airbnb.lottie.model.Marker marker = composition.getMarker(str);
            if (marker == null) {
                f = 0.0f;
            } else {
                f = marker.startFrame + i;
            }
            return AbstractC11719c.coerceIn(f / composition.getEndFrame(), 0.0f, 1.0f);
        }

        @Nullable
        public final String getMin() {
            return this.f41242a;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            float f;
            Intrinsics.checkNotNullParameter(composition, "composition");
            String str = this.f41242a;
            if (str == null) {
                return 0.0f;
            }
            com.airbnb.lottie.model.Marker marker = composition.getMarker(str);
            if (marker == null) {
                f = 0.0f;
            } else {
                f = marker.startFrame;
            }
            return AbstractC11719c.coerceIn(f / composition.getEndFrame(), 0.0f, 1.0f);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.f41242a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f41243b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            boolean z = this.f41244c;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode2 + i;
        }

        @NotNull
        public String toString() {
            return "Markers(min=" + ((Object) this.f41242a) + ", max=" + ((Object) this.f41243b) + ", maxInclusive=" + this.f41244c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ Markers(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? true : z);
        }

        public Markers(@Nullable String str, @Nullable String str2, boolean z) {
            super(null);
            this.f41242a = str;
            this.f41243b = str2;
            this.f41244c = z;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0010¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ$\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, m28850d2 = {"Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "", "min", "max", "<init>", "(FF)V", "Lcom/airbnb/lottie/LottieComposition;", "composition", "getMinProgress$lottie_compose_release", "(Lcom/airbnb/lottie/LottieComposition;)F", "getMinProgress", "getMaxProgress$lottie_compose_release", "getMaxProgress", "component1", "()F", "component2", "copy", "(FF)Lcom/airbnb/lottie/compose/LottieClipSpec$Progress;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "F", "getMin", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getMax", "lottie-compose_release"}, m28849k = 1, m28848mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class Progress extends LottieClipSpec {
        public static final int $stable = 0;

        /* renamed from: a */
        public final float f41245a;

        /* renamed from: b */
        public final float f41246b;

        public Progress() {
            this(0.0f, 0.0f, 3, null);
        }

        public static /* synthetic */ Progress copy$default(Progress progress, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = progress.f41245a;
            }
            if ((i & 2) != 0) {
                f2 = progress.f41246b;
            }
            return progress.copy(f, f2);
        }

        public final float component1() {
            return this.f41245a;
        }

        public final float component2() {
            return this.f41246b;
        }

        @NotNull
        public final Progress copy(float f, float f2) {
            return new Progress(f, f2);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Progress) {
                Progress progress = (Progress) obj;
                return Intrinsics.areEqual((Object) Float.valueOf(this.f41245a), (Object) Float.valueOf(progress.f41245a)) && Intrinsics.areEqual((Object) Float.valueOf(this.f41246b), (Object) Float.valueOf(progress.f41246b));
            }
            return false;
        }

        public final float getMax() {
            return this.f41246b;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMaxProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            return this.f41246b;
        }

        public final float getMin() {
            return this.f41245a;
        }

        @Override // com.airbnb.lottie.compose.LottieClipSpec
        public float getMinProgress$lottie_compose_release(@NotNull LottieComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            return this.f41245a;
        }

        public int hashCode() {
            return (Float.floatToIntBits(this.f41245a) * 31) + Float.floatToIntBits(this.f41246b);
        }

        @NotNull
        public String toString() {
            return "Progress(min=" + this.f41245a + ", max=" + this.f41246b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ Progress(float f, float f2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 1.0f : f2);
        }

        public Progress(float f, float f2) {
            super(null);
            this.f41245a = f;
            this.f41246b = f2;
        }
    }

    public /* synthetic */ LottieClipSpec(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract float getMaxProgress$lottie_compose_release(@NotNull LottieComposition lottieComposition);

    public abstract float getMinProgress$lottie_compose_release(@NotNull LottieComposition lottieComposition);

    public LottieClipSpec() {
    }
}
