package th.p047co.dtac.android.dtacone.app_one.model.stv;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000e¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/model/stv/Data;", "", "", "transactionRefId", MessageBundle.TITLE_ENTRY, "", "Lth/co/dtac/android/dtacone/app_one/model/stv/PackagesItem;", "packages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lth/co/dtac/android/dtacone/app_one/model/stv/Data;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getTransactionRefId", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTitle", OperatorName.CURVE_TO, "Ljava/util/List;", "getPackages", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.model.stv.Data */
/* loaded from: classes7.dex */
public final class Data {
    public static final int $stable = 8;
    @SerializedName("transactionRefId")
    @Nullable

    /* renamed from: a */
    private final String f82202a;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable

    /* renamed from: b */
    private final String f82203b;
    @SerializedName("packages")
    @Nullable

    /* renamed from: c */
    private final List<PackagesItem> f82204c;

    public Data() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Data copy$default(Data data, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = data.f82202a;
        }
        if ((i & 2) != 0) {
            str2 = data.f82203b;
        }
        if ((i & 4) != 0) {
            list = data.f82204c;
        }
        return data.copy(str, str2, list);
    }

    @Nullable
    public final String component1() {
        return this.f82202a;
    }

    @Nullable
    public final String component2() {
        return this.f82203b;
    }

    @Nullable
    public final List<PackagesItem> component3() {
        return this.f82204c;
    }

    @NotNull
    public final Data copy(@Nullable String str, @Nullable String str2, @Nullable List<PackagesItem> list) {
        return new Data(str, str2, list);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Data) {
            Data data = (Data) obj;
            return Intrinsics.areEqual(this.f82202a, data.f82202a) && Intrinsics.areEqual(this.f82203b, data.f82203b) && Intrinsics.areEqual(this.f82204c, data.f82204c);
        }
        return false;
    }

    @Nullable
    public final List<PackagesItem> getPackages() {
        return this.f82204c;
    }

    @Nullable
    public final String getTitle() {
        return this.f82203b;
    }

    @Nullable
    public final String getTransactionRefId() {
        return this.f82202a;
    }

    public int hashCode() {
        String str = this.f82202a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f82203b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<PackagesItem> list = this.f82204c;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.f82202a;
        String str2 = this.f82203b;
        List<PackagesItem> list = this.f82204c;
        return "Data(transactionRefId=" + str + ", title=" + str2 + ", packages=" + list + ")";
    }

    public Data(@Nullable String str, @Nullable String str2, @Nullable List<PackagesItem> list) {
        this.f82202a = str;
        this.f82203b = str2;
        this.f82204c = list;
    }

    public /* synthetic */ Data(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list);
    }
}