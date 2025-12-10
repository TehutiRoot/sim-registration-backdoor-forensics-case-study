package th.p047co.dtac.android.dtacone.view.appOne.tol.model.fixedLinePlus;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/PackageList;", "", "", "code", MessageBundle.TITLE_ENTRY, "subtitle", FirebaseAnalytics.Param.PRICE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lth/co/dtac/android/dtacone/view/appOne/tol/model/fixedLinePlus/PackageList;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCode", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getTitle", OperatorName.CURVE_TO, "getSubtitle", "d", "getPrice", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.tol.model.fixedLinePlus.PackageList */
/* loaded from: classes10.dex */
public final class PackageList {
    public static final int $stable = 0;

    /* renamed from: a */
    public final String f98028a;

    /* renamed from: b */
    public final String f98029b;

    /* renamed from: c */
    public final String f98030c;

    /* renamed from: d */
    public final String f98031d;

    public PackageList(@NotNull String code, @NotNull String title, @NotNull String subtitle, @NotNull String price) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(price, "price");
        this.f98028a = code;
        this.f98029b = title;
        this.f98030c = subtitle;
        this.f98031d = price;
    }

    public static /* synthetic */ PackageList copy$default(PackageList packageList, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = packageList.f98028a;
        }
        if ((i & 2) != 0) {
            str2 = packageList.f98029b;
        }
        if ((i & 4) != 0) {
            str3 = packageList.f98030c;
        }
        if ((i & 8) != 0) {
            str4 = packageList.f98031d;
        }
        return packageList.copy(str, str2, str3, str4);
    }

    @NotNull
    public final String component1() {
        return this.f98028a;
    }

    @NotNull
    public final String component2() {
        return this.f98029b;
    }

    @NotNull
    public final String component3() {
        return this.f98030c;
    }

    @NotNull
    public final String component4() {
        return this.f98031d;
    }

    @NotNull
    public final PackageList copy(@NotNull String code, @NotNull String title, @NotNull String subtitle, @NotNull String price) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(price, "price");
        return new PackageList(code, title, subtitle, price);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PackageList) {
            PackageList packageList = (PackageList) obj;
            return Intrinsics.areEqual(this.f98028a, packageList.f98028a) && Intrinsics.areEqual(this.f98029b, packageList.f98029b) && Intrinsics.areEqual(this.f98030c, packageList.f98030c) && Intrinsics.areEqual(this.f98031d, packageList.f98031d);
        }
        return false;
    }

    @NotNull
    public final String getCode() {
        return this.f98028a;
    }

    @NotNull
    public final String getPrice() {
        return this.f98031d;
    }

    @NotNull
    public final String getSubtitle() {
        return this.f98030c;
    }

    @NotNull
    public final String getTitle() {
        return this.f98029b;
    }

    public int hashCode() {
        return (((((this.f98028a.hashCode() * 31) + this.f98029b.hashCode()) * 31) + this.f98030c.hashCode()) * 31) + this.f98031d.hashCode();
    }

    @NotNull
    public String toString() {
        String str = this.f98028a;
        String str2 = this.f98029b;
        String str3 = this.f98030c;
        String str4 = this.f98031d;
        return "PackageList(code=" + str + ", title=" + str2 + ", subtitle=" + str3 + ", price=" + str4 + ")";
    }
}