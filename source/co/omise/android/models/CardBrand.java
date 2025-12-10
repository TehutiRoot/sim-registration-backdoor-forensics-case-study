package co.omise.android.models;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.omise.android.C5511R;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import org.apache.commons.codec.language.p027bm.Rule;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0001(B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÂ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\u0010\u0010\u001f\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u000e\u0010\"\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u0003J\u0019\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006)"}, m28850d2 = {"Lco/omise/android/models/CardBrand;", "Landroid/os/Parcelable;", "name", "", "patternStr", "minLength", "", "maxLength", "logoResourceId", "(Ljava/lang/String;Ljava/lang/String;III)V", "getLogoResourceId", "()I", "getName", "()Ljava/lang/String;", "pattern", "Ljava/util/regex/Pattern;", "getPattern$annotations", "()V", "getPatternStr", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "match", "pan", "toString", "valid", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class CardBrand implements Parcelable {
    @JvmField
    @NotNull
    public static final CardBrand[] ALL;
    @JvmField
    @NotNull
    public static final CardBrand AMEX;
    @JvmField
    @NotNull
    public static final CardBrand DINERS;
    @JvmField
    @NotNull
    public static final CardBrand DISCOVER;
    @JvmField
    @NotNull
    public static final CardBrand JCB;
    @JvmField
    @NotNull
    public static final CardBrand MAESTRO;
    @JvmField
    @NotNull
    public static final CardBrand MASTERCARD;
    @JvmField
    @NotNull
    public static final CardBrand VISA;
    private final int logoResourceId;
    private final int maxLength;
    private final int minLength;
    @NotNull
    private final String name;
    @NotNull
    private final Pattern pattern;
    @NotNull
    private final String patternStr;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<CardBrand> CREATOR = new Creator();

    @Metadata(m28851d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u0010\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m28850d2 = {"Lco/omise/android/models/CardBrand$Companion;", "", "()V", Rule.ALL, "", "Lco/omise/android/models/CardBrand;", "[Lco/omise/android/models/CardBrand;", "AMEX", "DINERS", "DISCOVER", "JCB", "MAESTRO", "MASTERCARD", "VISA", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<CardBrand> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CardBrand createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardBrand(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final CardBrand[] newArray(int i) {
            return new CardBrand[i];
        }
    }

    static {
        CardBrand cardBrand = new CardBrand("amex", "^3[47]", 15, 15, C5511R.C5513drawable.brand_amex);
        AMEX = cardBrand;
        CardBrand cardBrand2 = new CardBrand("diners", "^3(0[0-5]|6)", 14, 14, C5511R.C5513drawable.brand_diners);
        DINERS = cardBrand2;
        CardBrand cardBrand3 = new CardBrand("jcb", "^35(2[89]|[3-8])", 16, 16, C5511R.C5513drawable.brand_jcb);
        JCB = cardBrand3;
        CardBrand cardBrand4 = new CardBrand("visa", "^4", 16, 16, C5511R.C5513drawable.brand_visa);
        VISA = cardBrand4;
        CardBrand cardBrand5 = new CardBrand("mastercard", "^5[1-5]", 16, 16, C5511R.C5513drawable.brand_mastercard);
        MASTERCARD = cardBrand5;
        CardBrand cardBrand6 = new CardBrand("maestro", "^(5018|5020|5038|6304|6759|676[1-3])", 12, 19, C5511R.C5513drawable.brand_maestro);
        MAESTRO = cardBrand6;
        CardBrand cardBrand7 = new CardBrand("discover", "^(6011|622(12[6-9]|1[3-9][0-9]|[2-8][0-9]{2}|9[0-1][0-9]|92[0-5]|64[4-9])|65)", 16, 16, C5511R.C5513drawable.brand_discover);
        DISCOVER = cardBrand7;
        ALL = new CardBrand[]{cardBrand, cardBrand2, cardBrand3, cardBrand4, cardBrand5, cardBrand6, cardBrand7};
    }

    public CardBrand(@NotNull String name, @NotNull String patternStr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(patternStr, "patternStr");
        this.name = name;
        this.patternStr = patternStr;
        this.minLength = i;
        this.maxLength = i2;
        this.logoResourceId = i3;
        Pattern compile = Pattern.compile(patternStr + "[0-9]+");
        Intrinsics.checkNotNullExpressionValue(compile, "compile(\"$patternStr[0-9]+\")");
        this.pattern = compile;
    }

    private final int component3() {
        return this.minLength;
    }

    private final int component4() {
        return this.maxLength;
    }

    public static /* synthetic */ CardBrand copy$default(CardBrand cardBrand, String str, String str2, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = cardBrand.name;
        }
        if ((i4 & 2) != 0) {
            str2 = cardBrand.patternStr;
        }
        String str3 = str2;
        if ((i4 & 4) != 0) {
            i = cardBrand.minLength;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = cardBrand.maxLength;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = cardBrand.logoResourceId;
        }
        return cardBrand.copy(str, str3, i5, i6, i3);
    }

    private static /* synthetic */ void getPattern$annotations() {
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.patternStr;
    }

    public final int component5() {
        return this.logoResourceId;
    }

    @NotNull
    public final CardBrand copy(@NotNull String name, @NotNull String patternStr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(patternStr, "patternStr");
        return new CardBrand(name, patternStr, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CardBrand) {
            CardBrand cardBrand = (CardBrand) obj;
            return Intrinsics.areEqual(this.name, cardBrand.name) && Intrinsics.areEqual(this.patternStr, cardBrand.patternStr) && this.minLength == cardBrand.minLength && this.maxLength == cardBrand.maxLength && this.logoResourceId == cardBrand.logoResourceId;
        }
        return false;
    }

    public final int getLogoResourceId() {
        return this.logoResourceId;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPatternStr() {
        return this.patternStr;
    }

    public int hashCode() {
        return (((((((this.name.hashCode() * 31) + this.patternStr.hashCode()) * 31) + this.minLength) * 31) + this.maxLength) * 31) + this.logoResourceId;
    }

    public final boolean match(@Nullable String str) {
        if (str != null && str.length() != 0) {
            return this.pattern.matcher(str).matches();
        }
        return false;
    }

    @NotNull
    public String toString() {
        return "CardBrand(name=" + this.name + ", patternStr=" + this.patternStr + ", minLength=" + this.minLength + ", maxLength=" + this.maxLength + ", logoResourceId=" + this.logoResourceId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public final boolean valid(@NotNull String pan) {
        Intrinsics.checkNotNullParameter(pan, "pan");
        if (match(pan) && this.minLength <= pan.length() && pan.length() <= this.maxLength) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.name);
        out.writeString(this.patternStr);
        out.writeInt(this.minLength);
        out.writeInt(this.maxLength);
        out.writeInt(this.logoResourceId);
    }
}
