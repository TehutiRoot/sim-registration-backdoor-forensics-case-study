package th.p047co.dtac.android.dtacone.view.appOne.eSign.response;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/eSign/response/EngagedParty;", "", "", "href", "id", "name", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/eSign/response/EngagedParty;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getHref", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getId", OperatorName.CURVE_TO, "getName", "d", "getType", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.eSign.response.EngagedParty */
/* loaded from: classes10.dex */
public final class EngagedParty {
    public static final int $stable = 0;
    @SerializedName("href")
    @NotNull

    /* renamed from: a */
    private final String f90819a;
    @SerializedName("id")
    @NotNull

    /* renamed from: b */
    private final String f90820b;
    @SerializedName("name")
    @NotNull

    /* renamed from: c */
    private final String f90821c;
    @SerializedName("type")
    @NotNull

    /* renamed from: d */
    private final String f90822d;

    public EngagedParty() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ EngagedParty copy$default(EngagedParty engagedParty, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = engagedParty.f90819a;
        }
        if ((i & 2) != 0) {
            str2 = engagedParty.f90820b;
        }
        if ((i & 4) != 0) {
            str3 = engagedParty.f90821c;
        }
        if ((i & 8) != 0) {
            str4 = engagedParty.f90822d;
        }
        return engagedParty.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.f90819a;
    }

    @NotNull
    public final String component2() {
        return this.f90820b;
    }

    @NotNull
    public final String component3() {
        return this.f90821c;
    }

    @NotNull
    public final String component4() {
        return this.f90822d;
    }

    @NotNull
    public final EngagedParty copy(@NotNull String href, @NotNull String id2, @NotNull String name, @NotNull String type) {
        Intrinsics.checkNotNullParameter(href, "href");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        return new EngagedParty(href, id2, name, type);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EngagedParty) {
            EngagedParty engagedParty = (EngagedParty) obj;
            return Intrinsics.areEqual(this.f90819a, engagedParty.f90819a) && Intrinsics.areEqual(this.f90820b, engagedParty.f90820b) && Intrinsics.areEqual(this.f90821c, engagedParty.f90821c) && Intrinsics.areEqual(this.f90822d, engagedParty.f90822d);
        }
        return false;
    }

    @NotNull
    public final String getHref() {
        return this.f90819a;
    }

    @NotNull
    public final String getId() {
        return this.f90820b;
    }

    @NotNull
    public final String getName() {
        return this.f90821c;
    }

    @NotNull
    public final String getType() {
        return this.f90822d;
    }

    public int hashCode() {
        return (((((this.f90819a.hashCode() * 31) + this.f90820b.hashCode()) * 31) + this.f90821c.hashCode()) * 31) + this.f90822d.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f90819a;
        String str2 = this.f90820b;
        String str3 = this.f90821c;
        String str4 = this.f90822d;
        return "EngagedParty(href=" + str + ", id=" + str2 + ", name=" + str3 + ", type=" + str4 + ")";
    }

    public EngagedParty(@NotNull String href, @NotNull String id2, @NotNull String name, @NotNull String type) {
        Intrinsics.checkNotNullParameter(href, "href");
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f90819a = href;
        this.f90820b = id2;
        this.f90821c = name;
        this.f90822d = type;
    }

    public /* synthetic */ EngagedParty(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}