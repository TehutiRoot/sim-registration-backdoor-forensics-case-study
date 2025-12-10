package co.omise.android.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import ch.qos.logback.core.CoreConstants;
import co.omise.android.api.Endpoint;
import co.omise.android.api.RequestBuilder;
import co.omise.android.models.ChargeStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import okhttp3.HttpUrl;
import okhttp3.RequestBody;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Parcelize
@Metadata(m28851d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002>?Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0010J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003Jm\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\t\u00102\u001a\u000203HÖ\u0001J\u0013\u00104\u001a\u00020\u00032\b\u00105\u001a\u0004\u0018\u000106HÖ\u0003J\t\u00107\u001a\u000203HÖ\u0001J\t\u00108\u001a\u00020\tHÖ\u0001J\u0019\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u000203HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010 R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001a¨\u0006@"}, m28850d2 = {"Lco/omise/android/models/Token;", "Lco/omise/android/models/Model;", "used", "", "card", "Lco/omise/android/models/Card;", "chargeStatus", "Lco/omise/android/models/ChargeStatus;", "modelObject", "", "id", "livemode", FirebaseAnalytics.Param.LOCATION, "created", "Lorg/joda/time/DateTime;", "deleted", "(ZLco/omise/android/models/Card;Lco/omise/android/models/ChargeStatus;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lorg/joda/time/DateTime;Z)V", "getCard", "()Lco/omise/android/models/Card;", "getChargeStatus", "()Lco/omise/android/models/ChargeStatus;", "getCreated", "()Lorg/joda/time/DateTime;", "setCreated", "(Lorg/joda/time/DateTime;)V", "getDeleted", "()Z", "setDeleted", "(Z)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getLivemode", "setLivemode", "getLocation", "setLocation", "getModelObject", "setModelObject", "getUsed", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CreateTokenRequestBuilder", "GetTokenRequestBuilder", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class Token implements Model {
    @NotNull
    public static final Parcelable.Creator<Token> CREATOR = new Creator();
    @Nullable
    private final Card card;
    @JsonProperty("charge_status")
    @NotNull
    private final ChargeStatus chargeStatus;
    @Nullable
    private DateTime created;
    private boolean deleted;
    @Nullable

    /* renamed from: id */
    private String f40263id;
    private boolean livemode;
    @Nullable
    private String location;
    @Nullable
    private String modelObject;
    private final boolean used;

    @Metadata(m28851d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0014R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, m28850d2 = {"Lco/omise/android/models/Token$CreateTokenRequestBuilder;", "Lco/omise/android/api/RequestBuilder;", "Lco/omise/android/models/Token;", "card", "Lco/omise/android/models/CardParam;", "tokenization", "Lco/omise/android/models/TokenizationParam;", "(Lco/omise/android/models/CardParam;Lco/omise/android/models/TokenizationParam;)V", "getCard", "()Lco/omise/android/models/CardParam;", "getTokenization", "()Lco/omise/android/models/TokenizationParam;", FirebaseAnalytics.Param.METHOD, "", ClientCookie.PATH_ATTR, "Lokhttp3/HttpUrl;", "payload", "Lokhttp3/RequestBody;", "type", "Ljava/lang/Class;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class CreateTokenRequestBuilder extends RequestBuilder<Token> {
        @JsonProperty("card")
        @Nullable
        private final CardParam card;
        @JsonProperty("tokenization")
        @Nullable
        private final TokenizationParam tokenization;

        public CreateTokenRequestBuilder() {
            this(null, null, 3, null);
        }

        @Nullable
        public final CardParam getCard() {
            return this.card;
        }

        @Nullable
        public final TokenizationParam getTokenization() {
            return this.tokenization;
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public String method() {
            return "POST";
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public HttpUrl path() {
            return buildUrl(Endpoint.VAULT, "tokens", new String[0]);
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public RequestBody payload() throws IOException {
            return serialize();
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public Class<Token> type() {
            return Token.class;
        }

        public /* synthetic */ CreateTokenRequestBuilder(CardParam cardParam, TokenizationParam tokenizationParam, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cardParam, (i & 2) != 0 ? null : tokenizationParam);
        }

        public CreateTokenRequestBuilder(@Nullable CardParam cardParam, @Nullable TokenizationParam tokenizationParam) {
            this.card = cardParam;
            this.tokenization = tokenizationParam;
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Token> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Token createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Token(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Card.CREATOR.createFromParcel(parcel), ChargeStatusParceler.INSTANCE.create(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Token[] newArray(int i) {
            return new Token[i];
        }
    }

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\nH\u0014J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m28850d2 = {"Lco/omise/android/models/Token$GetTokenRequestBuilder;", "Lco/omise/android/api/RequestBuilder;", "Lco/omise/android/models/Token;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", FirebaseAnalytics.Param.METHOD, ClientCookie.PATH_ATTR, "Lokhttp3/HttpUrl;", "type", "Ljava/lang/Class;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class GetTokenRequestBuilder extends RequestBuilder<Token> {
        @NotNull

        /* renamed from: id */
        private final String f40264id;

        public GetTokenRequestBuilder(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f40264id = id2;
        }

        @NotNull
        public final String getId() {
            return this.f40264id;
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public String method() {
            return "GET";
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public HttpUrl path() {
            return buildUrl(Endpoint.VAULT, "tokens", this.f40264id);
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public Class<Token> type() {
            return Token.class;
        }
    }

    public Token() {
        this(false, null, null, null, null, false, null, null, false, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public final boolean component1() {
        return this.used;
    }

    @Nullable
    public final Card component2() {
        return this.card;
    }

    @NotNull
    public final ChargeStatus component3() {
        return this.chargeStatus;
    }

    @Nullable
    public final String component4() {
        return getModelObject();
    }

    @Nullable
    public final String component5() {
        return getId();
    }

    public final boolean component6() {
        return getLivemode();
    }

    @Nullable
    public final String component7() {
        return getLocation();
    }

    @Nullable
    public final DateTime component8() {
        return getCreated();
    }

    public final boolean component9() {
        return getDeleted();
    }

    @NotNull
    public final Token copy(boolean z, @Nullable Card card, @NotNull ChargeStatus chargeStatus, @Nullable String str, @Nullable String str2, boolean z2, @Nullable String str3, @Nullable DateTime dateTime, boolean z3) {
        Intrinsics.checkNotNullParameter(chargeStatus, "chargeStatus");
        return new Token(z, card, chargeStatus, str, str2, z2, str3, dateTime, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Token) {
            Token token = (Token) obj;
            return this.used == token.used && Intrinsics.areEqual(this.card, token.card) && Intrinsics.areEqual(this.chargeStatus, token.chargeStatus) && Intrinsics.areEqual(getModelObject(), token.getModelObject()) && Intrinsics.areEqual(getId(), token.getId()) && getLivemode() == token.getLivemode() && Intrinsics.areEqual(getLocation(), token.getLocation()) && Intrinsics.areEqual(getCreated(), token.getCreated()) && getDeleted() == token.getDeleted();
        }
        return false;
    }

    @Nullable
    public final Card getCard() {
        return this.card;
    }

    @NotNull
    public final ChargeStatus getChargeStatus() {
        return this.chargeStatus;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public DateTime getCreated() {
        return this.created;
    }

    @Override // co.omise.android.models.Model
    public boolean getDeleted() {
        return this.deleted;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public String getId() {
        return this.f40263id;
    }

    @Override // co.omise.android.models.Model
    public boolean getLivemode() {
        return this.livemode;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public String getLocation() {
        return this.location;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public String getModelObject() {
        return this.modelObject;
    }

    public final boolean getUsed() {
        return this.used;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        boolean z = this.used;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = i * 31;
        Card card = this.card;
        int hashCode = (((((((i2 + (card == null ? 0 : card.hashCode())) * 31) + this.chargeStatus.hashCode()) * 31) + (getModelObject() == null ? 0 : getModelObject().hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31;
        boolean livemode = getLivemode();
        int i3 = livemode;
        if (livemode) {
            i3 = 1;
        }
        int hashCode2 = (((((hashCode + i3) * 31) + (getLocation() == null ? 0 : getLocation().hashCode())) * 31) + (getCreated() != null ? getCreated().hashCode() : 0)) * 31;
        boolean deleted = getDeleted();
        return hashCode2 + (deleted ? 1 : deleted);
    }

    public void setCreated(@Nullable DateTime dateTime) {
        this.created = dateTime;
    }

    public void setDeleted(boolean z) {
        this.deleted = z;
    }

    public void setId(@Nullable String str) {
        this.f40263id = str;
    }

    public void setLivemode(boolean z) {
        this.livemode = z;
    }

    public void setLocation(@Nullable String str) {
        this.location = str;
    }

    public void setModelObject(@Nullable String str) {
        this.modelObject = str;
    }

    @NotNull
    public String toString() {
        return "Token(used=" + this.used + ", card=" + this.card + ", chargeStatus=" + this.chargeStatus + ", modelObject=" + getModelObject() + ", id=" + getId() + ", livemode=" + getLivemode() + ", location=" + getLocation() + ", created=" + getCreated() + ", deleted=" + getDeleted() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeInt(this.used ? 1 : 0);
        Card card = this.card;
        if (card == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            card.writeToParcel(out, i);
        }
        ChargeStatusParceler.INSTANCE.write(this.chargeStatus, out, i);
        out.writeString(this.modelObject);
        out.writeString(this.f40263id);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeString(this.location);
        out.writeSerializable(this.created);
        out.writeInt(this.deleted ? 1 : 0);
    }

    public Token(boolean z, @Nullable Card card, @NotNull ChargeStatus chargeStatus, @Nullable String str, @Nullable String str2, boolean z2, @Nullable String str3, @Nullable DateTime dateTime, boolean z3) {
        Intrinsics.checkNotNullParameter(chargeStatus, "chargeStatus");
        this.used = z;
        this.card = card;
        this.chargeStatus = chargeStatus;
        this.modelObject = str;
        this.f40263id = str2;
        this.livemode = z2;
        this.location = str3;
        this.created = dateTime;
        this.deleted = z3;
    }

    public /* synthetic */ Token(boolean z, Card card, ChargeStatus chargeStatus, String str, String str2, boolean z2, String str3, DateTime dateTime, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : card, (i & 4) != 0 ? ChargeStatus.Unknown.INSTANCE : chargeStatus, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : str3, (i & 128) == 0 ? dateTime : null, (i & 256) == 0 ? z3 : false);
    }
}
