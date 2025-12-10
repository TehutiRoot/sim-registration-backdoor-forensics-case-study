package th.p047co.dtac.android.dtacone.app_one.repository.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/repository/model/SimData;", "", "", "rtrCode", "simR", "company", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getRtrCode", "()Ljava/lang/String;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getSimR", OperatorName.CURVE_TO, "getCompany", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.repository.model.SimData */
/* loaded from: classes7.dex */
public final class SimData {
    public static final int $stable = 0;
    @SerializedName("rtrCode")
    @Nullable

    /* renamed from: a */
    private final String f82381a;
    @SerializedName("simR")
    @Nullable

    /* renamed from: b */
    private final String f82382b;
    @SerializedName("company")
    @Nullable

    /* renamed from: c */
    private final String f82383c;

    public SimData() {
        this(null, null, null, 7, null);
    }

    @Nullable
    public final String getCompany() {
        return this.f82383c;
    }

    @Nullable
    public final String getRtrCode() {
        return this.f82381a;
    }

    @Nullable
    public final String getSimR() {
        return this.f82382b;
    }

    public SimData(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.f82381a = str;
        this.f82382b = str2;
        this.f82383c = str3;
    }

    public /* synthetic */ SimData(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
