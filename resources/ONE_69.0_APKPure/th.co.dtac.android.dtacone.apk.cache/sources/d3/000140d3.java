package th.p047co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address;

import androidx.compose.runtime.internal.StabilityInferred;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/address/Province;", "", "", "id", "", "name", "<init>", "(ILjava/lang/String;)V", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/address/Province;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "I", "getId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/lang/String;", "getName", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.Province */
/* loaded from: classes10.dex */
public final class Province {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    public final int f98009a;

    /* renamed from: b */
    public final String f98010b;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/address/Province$Companion;", "", "()V", "mock", "Lth/co/dtac/android/dtacone/view/appOne/tol/model/customerInfo/address/Province;", "id", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.customerInfo.address.Province$Companion */
    /* loaded from: classes10.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Province mock(int i) {
            switch (i) {
                case 0:
                    return new Province(i, "กระบี่");
                case 1:
                    return new Province(i, "กรุงเทพมหานคร");
                case 2:
                    return new Province(i, "กาญจนบุรี");
                case 3:
                    return new Province(i, "กาฬสินธุ์");
                case 4:
                    return new Province(i, "กำแพงเพชร");
                case 5:
                    return new Province(i, "ขอนแก่น");
                case 6:
                    return new Province(i, "จันทบุรี");
                case 7:
                    return new Province(i, "ฉะเชิงเทรา");
                case 8:
                    return new Province(i, "ชลบุรี");
                case 9:
                    return new Province(i, "ชัยนาท");
                case 10:
                    return new Province(i, "ชัยภูมิ");
                case 11:
                    return new Province(i, "ชุมพร");
                case 12:
                    return new Province(i, "เชียงราย");
                case 13:
                    return new Province(i, "เชียงใหม่");
                case 14:
                    return new Province(i, "ตรัง");
                case 15:
                    return new Province(i, "ตราด");
                case 16:
                    return new Province(i, "ตาก");
                case 17:
                    return new Province(i, "นครนายก");
                case 18:
                    return new Province(i, "นครปฐม");
                case 19:
                    return new Province(i, "นครพนม");
                default:
                    return new Province(i, Constant.ToolbarTitle.OTHER);
            }
        }

        public Companion() {
        }
    }

    public Province(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f98009a = i;
        this.f98010b = name;
    }

    public static /* synthetic */ Province copy$default(Province province, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = province.f98009a;
        }
        if ((i2 & 2) != 0) {
            str = province.f98010b;
        }
        return province.copy(i, str);
    }

    public final int component1() {
        return this.f98009a;
    }

    @NotNull
    public final String component2() {
        return this.f98010b;
    }

    @NotNull
    public final Province copy(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Province(i, name);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Province) {
            Province province = (Province) obj;
            return this.f98009a == province.f98009a && Intrinsics.areEqual(this.f98010b, province.f98010b);
        }
        return false;
    }

    public final int getId() {
        return this.f98009a;
    }

    @NotNull
    public final String getName() {
        return this.f98010b;
    }

    public int hashCode() {
        return (this.f98009a * 31) + this.f98010b.hashCode();
    }

    @NotNull
    public String toString() {
        int i = this.f98009a;
        String str = this.f98010b;
        return "Province(id=" + i + ", name=" + str + ")";
    }
}