package th.p047co.dtac.android.dtacone.view.appOne.eSign.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.Attachment;
import th.p047co.dtac.android.dtacone.view.appOne.eSign.response.Individual;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015Jf\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b\u0007\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010,\u001a\u0004\b\b\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b\t\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b\n\u0010\u0015R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b\r\u0010\u0015¨\u00064"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/model/CustomerConfig;", "", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Individual;", "individual", "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Attachment;", "attachment", "", "isAllowKyc", "isRequireLiveNess", "isRequireOcrOwner", "isRequireOcr", "", "identificationType", "isAttorney", "<init>", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Individual;Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Attachment;ZZZZLjava/lang/String;Z)V", "component1", "()Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Individual;", "component2", "()Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Attachment;", "component3", "()Z", "component4", "component5", "component6", "component7", "()Ljava/lang/String;", "component8", "copy", "(Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Individual;Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Attachment;ZZZZLjava/lang/String;Z)Lth/co/dtac/android/dtacone/view/appOne/eSign/model/CustomerConfig;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Individual;", "getIndividual", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lth/co/dtac/android/dtacone/view/appOne/eSign/response/Attachment;", "getAttachment", OperatorName.CURVE_TO, "Z", "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, "Ljava/lang/String;", "getIdentificationType", OperatorName.CLOSE_PATH, "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.model.CustomerConfig */
/* loaded from: classes10.dex */
public final class CustomerConfig {
    public static final int $stable = 8;

    /* renamed from: a */
    public final Individual f90767a;

    /* renamed from: b */
    public final Attachment f90768b;

    /* renamed from: c */
    public final boolean f90769c;

    /* renamed from: d */
    public final boolean f90770d;

    /* renamed from: e */
    public final boolean f90771e;

    /* renamed from: f */
    public final boolean f90772f;

    /* renamed from: g */
    public final String f90773g;

    /* renamed from: h */
    public final boolean f90774h;

    public CustomerConfig() {
        this(null, null, false, false, false, false, null, false, 255, null);
    }

    @Nullable
    public final Individual component1() {
        return this.f90767a;
    }

    @Nullable
    public final Attachment component2() {
        return this.f90768b;
    }

    public final boolean component3() {
        return this.f90769c;
    }

    public final boolean component4() {
        return this.f90770d;
    }

    public final boolean component5() {
        return this.f90771e;
    }

    public final boolean component6() {
        return this.f90772f;
    }

    @Nullable
    public final String component7() {
        return this.f90773g;
    }

    public final boolean component8() {
        return this.f90774h;
    }

    @NotNull
    public final CustomerConfig copy(@Nullable Individual individual, @Nullable Attachment attachment, boolean z, boolean z2, boolean z3, boolean z4, @Nullable String str, boolean z5) {
        return new CustomerConfig(individual, attachment, z, z2, z3, z4, str, z5);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CustomerConfig) {
            CustomerConfig customerConfig = (CustomerConfig) obj;
            return Intrinsics.areEqual(this.f90767a, customerConfig.f90767a) && Intrinsics.areEqual(this.f90768b, customerConfig.f90768b) && this.f90769c == customerConfig.f90769c && this.f90770d == customerConfig.f90770d && this.f90771e == customerConfig.f90771e && this.f90772f == customerConfig.f90772f && Intrinsics.areEqual(this.f90773g, customerConfig.f90773g) && this.f90774h == customerConfig.f90774h;
        }
        return false;
    }

    @Nullable
    public final Attachment getAttachment() {
        return this.f90768b;
    }

    @Nullable
    public final String getIdentificationType() {
        return this.f90773g;
    }

    @Nullable
    public final Individual getIndividual() {
        return this.f90767a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Individual individual = this.f90767a;
        int hashCode = (individual == null ? 0 : individual.hashCode()) * 31;
        Attachment attachment = this.f90768b;
        int hashCode2 = (hashCode + (attachment == null ? 0 : attachment.hashCode())) * 31;
        boolean z = this.f90769c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.f90770d;
        int i3 = z2;
        if (z2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z3 = this.f90771e;
        int i5 = z3;
        if (z3 != 0) {
            i5 = 1;
        }
        int i6 = (i4 + i5) * 31;
        boolean z4 = this.f90772f;
        int i7 = z4;
        if (z4 != 0) {
            i7 = 1;
        }
        int i8 = (i6 + i7) * 31;
        String str = this.f90773g;
        int hashCode3 = (i8 + (str != null ? str.hashCode() : 0)) * 31;
        boolean z5 = this.f90774h;
        return hashCode3 + (z5 ? 1 : z5 ? 1 : 0);
    }

    public final boolean isAllowKyc() {
        return this.f90769c;
    }

    public final boolean isAttorney() {
        return this.f90774h;
    }

    public final boolean isRequireLiveNess() {
        return this.f90770d;
    }

    public final boolean isRequireOcr() {
        return this.f90772f;
    }

    public final boolean isRequireOcrOwner() {
        return this.f90771e;
    }

    @NotNull
    public String toString() {
        Individual individual = this.f90767a;
        Attachment attachment = this.f90768b;
        boolean z = this.f90769c;
        boolean z2 = this.f90770d;
        boolean z3 = this.f90771e;
        boolean z4 = this.f90772f;
        String str = this.f90773g;
        boolean z5 = this.f90774h;
        return "CustomerConfig(individual=" + individual + ", attachment=" + attachment + ", isAllowKyc=" + z + ", isRequireLiveNess=" + z2 + ", isRequireOcrOwner=" + z3 + ", isRequireOcr=" + z4 + ", identificationType=" + str + ", isAttorney=" + z5 + ")";
    }

    public CustomerConfig(@Nullable Individual individual, @Nullable Attachment attachment, boolean z, boolean z2, boolean z3, boolean z4, @Nullable String str, boolean z5) {
        this.f90767a = individual;
        this.f90768b = attachment;
        this.f90769c = z;
        this.f90770d = z2;
        this.f90771e = z3;
        this.f90772f = z4;
        this.f90773g = str;
        this.f90774h = z5;
    }

    public /* synthetic */ CustomerConfig(Individual individual, Attachment attachment, boolean z, boolean z2, boolean z3, boolean z4, String str, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : individual, (i & 2) != 0 ? null : attachment, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4, (i & 64) == 0 ? str : null, (i & 128) == 0 ? z5 : false);
    }
}