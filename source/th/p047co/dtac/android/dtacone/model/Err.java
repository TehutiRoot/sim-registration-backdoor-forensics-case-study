package th.p047co.dtac.android.dtacone.model;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.constant.LanguageSupport;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0003\u0010\n\u001a\u00020\u000b\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b¢\u0006\u0002\u0010\rJ\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\u000bHÆ\u0003Jc\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u000bHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u000bHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u000f\"\u0004\b\u001d\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000f\"\u0004\b\u001f\u0010\u0011R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010\u0011¨\u00063"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/Err;", "", "code", "", LanguageSupport.LANG_EN, LanguageSupport.LANG_TH, "titleEN", "titleTH", "systemMessage", "responseDateTime", "titleId", "", "messageId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getEn", "setEn", "getMessageId", "()I", "setMessageId", "(I)V", "getResponseDateTime", "setResponseDateTime", "getSystemMessage", "setSystemMessage", "getTh", "setTh", "getTitleEN", "setTitleEN", "getTitleId", "setTitleId", "getTitleTH", "setTitleTH", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.Err */
/* loaded from: classes8.dex */
public final class Err {
    public static final int $stable = 8;
    @NotNull
    private String code;
    @NotNull

    /* renamed from: en */
    private String f85036en;
    private int messageId;
    @NotNull
    private String responseDateTime;
    @NotNull
    private String systemMessage;
    @NotNull

    /* renamed from: th */
    private String f85037th;
    @NotNull
    private String titleEN;
    private int titleId;
    @NotNull
    private String titleTH;

    public Err() {
        this(null, null, null, null, null, null, null, 0, 0, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    @NotNull
    public final String component1() {
        return this.code;
    }

    @NotNull
    public final String component2() {
        return this.f85036en;
    }

    @NotNull
    public final String component3() {
        return this.f85037th;
    }

    @NotNull
    public final String component4() {
        return this.titleEN;
    }

    @NotNull
    public final String component5() {
        return this.titleTH;
    }

    @NotNull
    public final String component6() {
        return this.systemMessage;
    }

    @NotNull
    public final String component7() {
        return this.responseDateTime;
    }

    public final int component8() {
        return this.titleId;
    }

    public final int component9() {
        return this.messageId;
    }

    @NotNull
    public final Err copy(@NotNull String code, @NotNull String en, @NotNull String th2, @NotNull String titleEN, @NotNull String titleTH, @NotNull String systemMessage, @NotNull String responseDateTime, @StringRes int i, @StringRes int i2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(en, "en");
        Intrinsics.checkNotNullParameter(th2, "th");
        Intrinsics.checkNotNullParameter(titleEN, "titleEN");
        Intrinsics.checkNotNullParameter(titleTH, "titleTH");
        Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
        Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
        return new Err(code, en, th2, titleEN, titleTH, systemMessage, responseDateTime, i, i2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Err) {
            Err err = (Err) obj;
            return Intrinsics.areEqual(this.code, err.code) && Intrinsics.areEqual(this.f85036en, err.f85036en) && Intrinsics.areEqual(this.f85037th, err.f85037th) && Intrinsics.areEqual(this.titleEN, err.titleEN) && Intrinsics.areEqual(this.titleTH, err.titleTH) && Intrinsics.areEqual(this.systemMessage, err.systemMessage) && Intrinsics.areEqual(this.responseDateTime, err.responseDateTime) && this.titleId == err.titleId && this.messageId == err.messageId;
        }
        return false;
    }

    @NotNull
    public final String getCode() {
        return this.code;
    }

    @NotNull
    public final String getEn() {
        return this.f85036en;
    }

    public final int getMessageId() {
        return this.messageId;
    }

    @NotNull
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @NotNull
    public final String getSystemMessage() {
        return this.systemMessage;
    }

    @NotNull
    public final String getTh() {
        return this.f85037th;
    }

    @NotNull
    public final String getTitleEN() {
        return this.titleEN;
    }

    public final int getTitleId() {
        return this.titleId;
    }

    @NotNull
    public final String getTitleTH() {
        return this.titleTH;
    }

    public int hashCode() {
        return (((((((((((((((this.code.hashCode() * 31) + this.f85036en.hashCode()) * 31) + this.f85037th.hashCode()) * 31) + this.titleEN.hashCode()) * 31) + this.titleTH.hashCode()) * 31) + this.systemMessage.hashCode()) * 31) + this.responseDateTime.hashCode()) * 31) + this.titleId) * 31) + this.messageId;
    }

    public final void setCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final void setEn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f85036en = str;
    }

    public final void setMessageId(int i) {
        this.messageId = i;
    }

    public final void setResponseDateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.responseDateTime = str;
    }

    public final void setSystemMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.systemMessage = str;
    }

    public final void setTh(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f85037th = str;
    }

    public final void setTitleEN(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.titleEN = str;
    }

    public final void setTitleId(int i) {
        this.titleId = i;
    }

    public final void setTitleTH(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.titleTH = str;
    }

    @NotNull
    public String toString() {
        String str = this.code;
        String str2 = this.f85036en;
        String str3 = this.f85037th;
        String str4 = this.titleEN;
        String str5 = this.titleTH;
        String str6 = this.systemMessage;
        String str7 = this.responseDateTime;
        int i = this.titleId;
        int i2 = this.messageId;
        return "Err(code=" + str + ", en=" + str2 + ", th=" + str3 + ", titleEN=" + str4 + ", titleTH=" + str5 + ", systemMessage=" + str6 + ", responseDateTime=" + str7 + ", titleId=" + i + ", messageId=" + i2 + ")";
    }

    public Err(@NotNull String code, @NotNull String en, @NotNull String th2, @NotNull String titleEN, @NotNull String titleTH, @NotNull String systemMessage, @NotNull String responseDateTime, @StringRes int i, @StringRes int i2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(en, "en");
        Intrinsics.checkNotNullParameter(th2, "th");
        Intrinsics.checkNotNullParameter(titleEN, "titleEN");
        Intrinsics.checkNotNullParameter(titleTH, "titleTH");
        Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
        Intrinsics.checkNotNullParameter(responseDateTime, "responseDateTime");
        this.code = code;
        this.f85036en = en;
        this.f85037th = th2;
        this.titleEN = titleEN;
        this.titleTH = titleTH;
        this.systemMessage = systemMessage;
        this.responseDateTime = responseDateTime;
        this.titleId = i;
        this.messageId = i2;
    }

    public /* synthetic */ Err(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? "" : str6, (i3 & 64) == 0 ? str7 : "", (i3 & 128) != 0 ? 0 : i, (i3 & 256) == 0 ? i2 : 0);
    }
}
