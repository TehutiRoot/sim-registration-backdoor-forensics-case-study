package androidx.work.impl.constraints;

import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0003\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0004\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0005\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0006\u0010\n¨\u0006\u001e"}, m28850d2 = {"Landroidx/work/impl/constraints/NetworkState;", "", "", "isConnected", "isValidated", "isMetered", "isNotRoaming", "<init>", "(ZZZZ)V", "component1", "()Z", "component2", "component3", "component4", "copy", "(ZZZZ)Landroidx/work/impl/constraints/NetworkState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Z", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "work-runtime_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NetworkState {

    /* renamed from: a */
    public final boolean f38490a;

    /* renamed from: b */
    public final boolean f38491b;

    /* renamed from: c */
    public final boolean f38492c;

    /* renamed from: d */
    public final boolean f38493d;

    public NetworkState(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f38490a = z;
        this.f38491b = z2;
        this.f38492c = z3;
        this.f38493d = z4;
    }

    public static /* synthetic */ NetworkState copy$default(NetworkState networkState, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = networkState.f38490a;
        }
        if ((i & 2) != 0) {
            z2 = networkState.f38491b;
        }
        if ((i & 4) != 0) {
            z3 = networkState.f38492c;
        }
        if ((i & 8) != 0) {
            z4 = networkState.f38493d;
        }
        return networkState.copy(z, z2, z3, z4);
    }

    public final boolean component1() {
        return this.f38490a;
    }

    public final boolean component2() {
        return this.f38491b;
    }

    public final boolean component3() {
        return this.f38492c;
    }

    public final boolean component4() {
        return this.f38493d;
    }

    @NotNull
    public final NetworkState copy(boolean z, boolean z2, boolean z3, boolean z4) {
        return new NetworkState(z, z2, z3, z4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NetworkState) {
            NetworkState networkState = (NetworkState) obj;
            return this.f38490a == networkState.f38490a && this.f38491b == networkState.f38491b && this.f38492c == networkState.f38492c && this.f38493d == networkState.f38493d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z = this.f38490a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.f38491b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.f38492c;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z2 = this.f38493d;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isConnected() {
        return this.f38490a;
    }

    public final boolean isMetered() {
        return this.f38492c;
    }

    public final boolean isNotRoaming() {
        return this.f38493d;
    }

    public final boolean isValidated() {
        return this.f38491b;
    }

    @NotNull
    public String toString() {
        return "NetworkState(isConnected=" + this.f38490a + ", isValidated=" + this.f38491b + ", isMetered=" + this.f38492c + ", isNotRoaming=" + this.f38493d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}
