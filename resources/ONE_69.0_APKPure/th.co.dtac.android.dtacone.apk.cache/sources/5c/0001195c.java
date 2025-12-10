package th.p047co.dtac.android.dtacone.extension.format;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u000bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/extension/format/WrapData;", "", "", OperatorName.CLOSE_AND_STROKE, "", "counter", "<init>", "(Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "copy", "(Ljava/lang/String;I)Lth/co/dtac/android/dtacone/extension/format/WrapData;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getS", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "I", "getCounter", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.extension.format.WrapData */
/* loaded from: classes7.dex */
public final class WrapData {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f84875a;

    /* renamed from: b */
    public final int f84876b;

    public WrapData(@NotNull String s, int i) {
        Intrinsics.checkNotNullParameter(s, "s");
        this.f84875a = s;
        this.f84876b = i;
    }

    public static /* synthetic */ WrapData copy$default(WrapData wrapData, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = wrapData.f84875a;
        }
        if ((i2 & 2) != 0) {
            i = wrapData.f84876b;
        }
        return wrapData.copy(str, i);
    }

    @NotNull
    public final String component1() {
        return this.f84875a;
    }

    public final int component2() {
        return this.f84876b;
    }

    @NotNull
    public final WrapData copy(@NotNull String s, int i) {
        Intrinsics.checkNotNullParameter(s, "s");
        return new WrapData(s, i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WrapData) {
            WrapData wrapData = (WrapData) obj;
            return Intrinsics.areEqual(this.f84875a, wrapData.f84875a) && this.f84876b == wrapData.f84876b;
        }
        return false;
    }

    public final int getCounter() {
        return this.f84876b;
    }

    @NotNull
    public final String getS() {
        return this.f84875a;
    }

    public int hashCode() {
        return (this.f84875a.hashCode() * 31) + this.f84876b;
    }

    @NotNull
    public String toString() {
        String str = this.f84875a;
        int i = this.f84876b;
        return "WrapData(s=" + str + ", counter=" + i + ")";
    }
}