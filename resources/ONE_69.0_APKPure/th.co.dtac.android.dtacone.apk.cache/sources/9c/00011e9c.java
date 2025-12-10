package th.p047co.dtac.android.dtacone.model.login.introduction;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/login/introduction/IntroductionItem;", "", "descreption", "", "imageUrl", MessageBundle.TITLE_ENTRY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescreption", "()Ljava/lang/String;", "getImageUrl", "getTitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.login.introduction.IntroductionItem */
/* loaded from: classes8.dex */
public final class IntroductionItem {
    public static final int $stable = 0;
    @SerializedName("descreption")
    @Nullable
    private final String descreption;
    @SerializedName("imageUrl")
    @Nullable
    private final String imageUrl;
    @SerializedName(MessageBundle.TITLE_ENTRY)
    @Nullable
    private final String title;

    public IntroductionItem() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ IntroductionItem copy$default(IntroductionItem introductionItem, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = introductionItem.descreption;
        }
        if ((i & 2) != 0) {
            str2 = introductionItem.imageUrl;
        }
        if ((i & 4) != 0) {
            str3 = introductionItem.title;
        }
        return introductionItem.copy(str, str2, str3);
    }

    @Nullable
    public final String component1() {
        return this.descreption;
    }

    @Nullable
    public final String component2() {
        return this.imageUrl;
    }

    @Nullable
    public final String component3() {
        return this.title;
    }

    @NotNull
    public final IntroductionItem copy(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        return new IntroductionItem(str, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntroductionItem) {
            IntroductionItem introductionItem = (IntroductionItem) obj;
            return Intrinsics.areEqual(this.descreption, introductionItem.descreption) && Intrinsics.areEqual(this.imageUrl, introductionItem.imageUrl) && Intrinsics.areEqual(this.title, introductionItem.title);
        }
        return false;
    }

    @Nullable
    public final String getDescreption() {
        return this.descreption;
    }

    @Nullable
    public final String getImageUrl() {
        return this.imageUrl;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.descreption;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.descreption;
        String str2 = this.imageUrl;
        String str3 = this.title;
        return "IntroductionItem(descreption=" + str + ", imageUrl=" + str2 + ", title=" + str3 + ")";
    }

    public IntroductionItem(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.descreption = str;
        this.imageUrl = str2;
        this.title = str3;
    }

    public /* synthetic */ IntroductionItem(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}