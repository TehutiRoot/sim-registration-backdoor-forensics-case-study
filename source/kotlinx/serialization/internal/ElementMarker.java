package kotlinx.serialization.internal;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;

@CoreFriendModuleApi
@Metadata(m28851d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0014B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R&\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, m28850d2 = {"Lkotlinx/serialization/internal/ElementMarker;", "", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlin/Function2;", "", "", "readIfAbsent", "<init>", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function2;)V", FirebaseAnalytics.Param.INDEX, "", "mark", "(I)V", "nextUnmarkedIndex", "()I", "elementsCount", "", OperatorName.CURVE_TO, "(I)[J", PDPageLabelRange.STYLE_LETTERS_LOWER, OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlin/jvm/functions/Function2;", "", OperatorName.SET_LINE_CAPSTYLE, "lowerMarks", "d", "[J", "highMarksArray", "e", "kotlinx-serialization-core"}, m28849k = 1, m28848mv = {1, 9, 0})
/* loaded from: classes6.dex */
public final class ElementMarker {

    /* renamed from: e */
    public static final C12161a f71187e = new C12161a(null);

    /* renamed from: f */
    public static final long[] f71188f = new long[0];

    /* renamed from: a */
    public final SerialDescriptor f71189a;

    /* renamed from: b */
    public final Function2 f71190b;

    /* renamed from: c */
    public long f71191c;

    /* renamed from: d */
    public final long[] f71192d;

    /* renamed from: kotlinx.serialization.internal.ElementMarker$a */
    /* loaded from: classes6.dex */
    public static final class C12161a {
        public /* synthetic */ C12161a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C12161a() {
        }
    }

    public ElementMarker(@NotNull SerialDescriptor descriptor, @NotNull Function2<? super SerialDescriptor, ? super Integer, Boolean> readIfAbsent) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent, "readIfAbsent");
        this.f71189a = descriptor;
        this.f71190b = readIfAbsent;
        int elementsCount = descriptor.getElementsCount();
        if (elementsCount <= 64) {
            this.f71191c = elementsCount != 64 ? (-1) << elementsCount : 0L;
            this.f71192d = f71188f;
            return;
        }
        this.f71191c = 0L;
        this.f71192d = m26713c(elementsCount);
    }

    /* renamed from: a */
    public final void m26715a(int i) {
        int i2 = (i >>> 6) - 1;
        long[] jArr = this.f71192d;
        jArr[i2] = jArr[i2] | (1 << (i & 63));
    }

    /* renamed from: b */
    public final int m26714b() {
        int length = this.f71192d.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = i2 * 64;
            long j = this.f71192d[i];
            while (j != -1) {
                int numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                j |= 1 << numberOfTrailingZeros;
                int i4 = numberOfTrailingZeros + i3;
                if (((Boolean) this.f71190b.invoke(this.f71189a, Integer.valueOf(i4))).booleanValue()) {
                    this.f71192d[i] = j;
                    return i4;
                }
            }
            this.f71192d[i] = j;
            i = i2;
        }
        return -1;
    }

    /* renamed from: c */
    public final long[] m26713c(int i) {
        long[] jArr = new long[(i - 1) >>> 6];
        if ((i & 63) != 0) {
            jArr[ArraysKt___ArraysKt.getLastIndex(jArr)] = (-1) << i;
        }
        return jArr;
    }

    public final void mark(int i) {
        if (i < 64) {
            this.f71191c |= 1 << i;
        } else {
            m26715a(i);
        }
    }

    public final int nextUnmarkedIndex() {
        int numberOfTrailingZeros;
        int elementsCount = this.f71189a.getElementsCount();
        do {
            long j = this.f71191c;
            if (j != -1) {
                numberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
                this.f71191c |= 1 << numberOfTrailingZeros;
            } else if (elementsCount > 64) {
                return m26714b();
            } else {
                return -1;
            }
        } while (!((Boolean) this.f71190b.invoke(this.f71189a, Integer.valueOf(numberOfTrailingZeros))).booleanValue());
        return numberOfTrailingZeros;
    }
}
