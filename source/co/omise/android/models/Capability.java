package co.omise.android.models;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import co.omise.android.api.Endpoint;
import co.omise.android.api.RequestBuilder;
import co.omise.android.models.PaymentMethod;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.android.parcel.Parcelize;
import okhttp3.HttpUrl;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.DateTime;

@Parcelize
@Metadata(m28851d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002PQB¡\u0001\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0002\u0010\u0015J\u0011\u00107\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010:\u001a\u00020\nHÆ\u0003J\u0011\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010=\u001a\u00020\nHÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010B\u001a\u00020\nHÆ\u0003J¥\u0001\u0010C\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0010\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\nHÆ\u0001J\t\u0010D\u001a\u00020EHÖ\u0001J\u0013\u0010F\u001a\u00020\n2\b\u0010G\u001a\u0004\u0018\u00010HHÖ\u0003J\t\u0010I\u001a\u00020EHÖ\u0001J\t\u0010J\u001a\u00020\u0004HÖ\u0001J\u0019\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020EHÖ\u0001R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0014\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001b\"\u0004\b%\u0010&R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0010\u001a\u00020\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001b\"\u0004\b.\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0004X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001b\"\u0004\b0\u0010&R&\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0017\"\u0004\b2\u0010\u0019R&\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u0019R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010!\"\u0004\b6\u0010#¨\u0006R"}, m28850d2 = {"Lco/omise/android/models/Capability;", "Lco/omise/android/models/Model;", "banks", "", "", "paymentMethods", "", "Lco/omise/android/models/PaymentMethod;", "tokenizationMethods", "zeroInterestInstallments", "", "limits", "Lco/omise/android/models/Limits;", "country", "modelObject", "id", "livemode", FirebaseAnalytics.Param.LOCATION, "created", "Lorg/joda/time/DateTime;", "deleted", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLco/omise/android/models/Limits;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lorg/joda/time/DateTime;Z)V", "getBanks", "()Ljava/util/List;", "setBanks", "(Ljava/util/List;)V", "getCountry", "()Ljava/lang/String;", "getCreated", "()Lorg/joda/time/DateTime;", "setCreated", "(Lorg/joda/time/DateTime;)V", "getDeleted", "()Z", "setDeleted", "(Z)V", "getId", "setId", "(Ljava/lang/String;)V", "getLimits", "()Lco/omise/android/models/Limits;", "setLimits", "(Lco/omise/android/models/Limits;)V", "getLivemode", "setLivemode", "getLocation", "setLocation", "getModelObject", "setModelObject", "getPaymentMethods", "setPaymentMethods", "getTokenizationMethods", "setTokenizationMethods", "getZeroInterestInstallments", "setZeroInterestInstallments", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "GetCapabilitiesRequestBuilder", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class Capability implements Model {
    @Nullable
    private List<String> banks;
    @JsonProperty
    @Nullable
    private final String country;
    @Nullable
    private DateTime created;
    private boolean deleted;
    @Nullable

    /* renamed from: id */
    private String f40256id;
    @JsonProperty("limits")
    @Nullable
    private Limits limits;
    private boolean livemode;
    @Nullable
    private String location;
    @Nullable
    private String modelObject;
    @JsonProperty("payment_methods")
    @Nullable
    private List<PaymentMethod> paymentMethods;
    @JsonProperty("tokenization_methods")
    @Nullable
    private List<String> tokenizationMethods;
    @JsonProperty("zero_interest_installments")
    private boolean zeroInterestInstallments;
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    public static final Parcelable.Creator<Capability> CREATOR = new Creator();

    @Metadata(m28851d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\b\b\u0002\u0010\f\u001a\u00020\u0006H\u0007¨\u0006\r"}, m28850d2 = {"Lco/omise/android/models/Capability$Companion;", "", "()V", "create", "Lco/omise/android/models/Capability;", "allowCreditCard", "", "sourceTypes", "", "Lco/omise/android/models/SourceType;", "tokenizationMethods", "Lco/omise/android/models/TokenizationMethod;", "zeroInterestInstallments", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Capability create$default(Companion companion, boolean z, List list, List list2, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            if ((i & 4) != 0) {
                list2 = CollectionsKt__CollectionsKt.emptyList();
            }
            if ((i & 8) != 0) {
                z2 = false;
            }
            return companion.create(z, list, list2, z2);
        }

        @JvmStatic
        @NotNull
        public final Capability create(boolean z, @NotNull List<? extends SourceType> sourceTypes, @NotNull List<? extends TokenizationMethod> tokenizationMethods, boolean z2) {
            Intrinsics.checkNotNullParameter(sourceTypes, "sourceTypes");
            Intrinsics.checkNotNullParameter(tokenizationMethods, "tokenizationMethods");
            ArrayList arrayList = new ArrayList();
            if (z) {
                arrayList.add(PaymentMethod.Companion.createCreditCardMethod());
            }
            PaymentMethod.Companion companion = PaymentMethod.Companion;
            ArrayList arrayList2 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(sourceTypes, 10));
            for (SourceType sourceType : sourceTypes) {
                arrayList2.add(companion.createSourceTypeMethod(sourceType));
            }
            arrayList.addAll(arrayList2);
            Limits limits = new Limits(new InstallmentAmount(200000L));
            ArrayList arrayList3 = new ArrayList(AbstractC10176es.collectionSizeOrDefault(tokenizationMethods, 10));
            for (TokenizationMethod tokenizationMethod : tokenizationMethods) {
                String name = tokenizationMethod.getName();
                Intrinsics.checkNotNull(name);
                arrayList3.add(name);
            }
            return new Capability(null, arrayList, arrayList3, z2, limits, null, null, null, false, null, null, false, 4065, null);
        }

        private Companion() {
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Capability> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Capability createFromParcel(@NotNull Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(PaymentMethod.CREATOR.createFromParcel(parcel));
                }
            }
            return new Capability(createStringArrayList, arrayList, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0 ? Limits.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Capability[] newArray(int i) {
            return new Capability[i];
        }
    }

    @Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0014¨\u0006\b"}, m28850d2 = {"Lco/omise/android/models/Capability$GetCapabilitiesRequestBuilder;", "Lco/omise/android/api/RequestBuilder;", "Lco/omise/android/models/Capability;", "()V", ClientCookie.PATH_ATTR, "Lokhttp3/HttpUrl;", "type", "Ljava/lang/Class;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class GetCapabilitiesRequestBuilder extends RequestBuilder<Capability> {
        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public HttpUrl path() {
            return buildUrl(Endpoint.API, "capability", new String[0]);
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public Class<Capability> type() {
            return Capability.class;
        }
    }

    public Capability() {
        this(null, null, null, false, null, null, null, null, false, null, null, false, 4095, null);
    }

    @JvmStatic
    @NotNull
    public static final Capability create(boolean z, @NotNull List<? extends SourceType> list, @NotNull List<? extends TokenizationMethod> list2, boolean z2) {
        return Companion.create(z, list, list2, z2);
    }

    @Nullable
    public final List<String> component1() {
        return this.banks;
    }

    @Nullable
    public final String component10() {
        return getLocation();
    }

    @Nullable
    public final DateTime component11() {
        return getCreated();
    }

    public final boolean component12() {
        return getDeleted();
    }

    @Nullable
    public final List<PaymentMethod> component2() {
        return this.paymentMethods;
    }

    @Nullable
    public final List<String> component3() {
        return this.tokenizationMethods;
    }

    public final boolean component4() {
        return this.zeroInterestInstallments;
    }

    @Nullable
    public final Limits component5() {
        return this.limits;
    }

    @Nullable
    public final String component6() {
        return this.country;
    }

    @Nullable
    public final String component7() {
        return getModelObject();
    }

    @Nullable
    public final String component8() {
        return getId();
    }

    public final boolean component9() {
        return getLivemode();
    }

    @NotNull
    public final Capability copy(@Nullable List<String> list, @Nullable List<PaymentMethod> list2, @Nullable List<String> list3, boolean z, @Nullable Limits limits, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z2, @Nullable String str4, @Nullable DateTime dateTime, boolean z3) {
        return new Capability(list, list2, list3, z, limits, str, str2, str3, z2, str4, dateTime, z3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Capability) {
            Capability capability = (Capability) obj;
            return Intrinsics.areEqual(this.banks, capability.banks) && Intrinsics.areEqual(this.paymentMethods, capability.paymentMethods) && Intrinsics.areEqual(this.tokenizationMethods, capability.tokenizationMethods) && this.zeroInterestInstallments == capability.zeroInterestInstallments && Intrinsics.areEqual(this.limits, capability.limits) && Intrinsics.areEqual(this.country, capability.country) && Intrinsics.areEqual(getModelObject(), capability.getModelObject()) && Intrinsics.areEqual(getId(), capability.getId()) && getLivemode() == capability.getLivemode() && Intrinsics.areEqual(getLocation(), capability.getLocation()) && Intrinsics.areEqual(getCreated(), capability.getCreated()) && getDeleted() == capability.getDeleted();
        }
        return false;
    }

    @Nullable
    public final List<String> getBanks() {
        return this.banks;
    }

    @Nullable
    public final String getCountry() {
        return this.country;
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
        return this.f40256id;
    }

    @Nullable
    public final Limits getLimits() {
        return this.limits;
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

    @Nullable
    public final List<PaymentMethod> getPaymentMethods() {
        return this.paymentMethods;
    }

    @Nullable
    public final List<String> getTokenizationMethods() {
        return this.tokenizationMethods;
    }

    public final boolean getZeroInterestInstallments() {
        return this.zeroInterestInstallments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        List<String> list = this.banks;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<PaymentMethod> list2 = this.paymentMethods;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.tokenizationMethods;
        int hashCode3 = (hashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        boolean z = this.zeroInterestInstallments;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode3 + i) * 31;
        Limits limits = this.limits;
        int hashCode4 = (i2 + (limits == null ? 0 : limits.hashCode())) * 31;
        String str = this.country;
        int hashCode5 = (((((hashCode4 + (str == null ? 0 : str.hashCode())) * 31) + (getModelObject() == null ? 0 : getModelObject().hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31;
        boolean livemode = getLivemode();
        int i3 = livemode;
        if (livemode) {
            i3 = 1;
        }
        int hashCode6 = (((((hashCode5 + i3) * 31) + (getLocation() == null ? 0 : getLocation().hashCode())) * 31) + (getCreated() != null ? getCreated().hashCode() : 0)) * 31;
        boolean deleted = getDeleted();
        return hashCode6 + (deleted ? 1 : deleted);
    }

    public final void setBanks(@Nullable List<String> list) {
        this.banks = list;
    }

    public void setCreated(@Nullable DateTime dateTime) {
        this.created = dateTime;
    }

    public void setDeleted(boolean z) {
        this.deleted = z;
    }

    public void setId(@Nullable String str) {
        this.f40256id = str;
    }

    public final void setLimits(@Nullable Limits limits) {
        this.limits = limits;
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

    public final void setPaymentMethods(@Nullable List<PaymentMethod> list) {
        this.paymentMethods = list;
    }

    public final void setTokenizationMethods(@Nullable List<String> list) {
        this.tokenizationMethods = list;
    }

    public final void setZeroInterestInstallments(boolean z) {
        this.zeroInterestInstallments = z;
    }

    @NotNull
    public String toString() {
        return "Capability(banks=" + this.banks + ", paymentMethods=" + this.paymentMethods + ", tokenizationMethods=" + this.tokenizationMethods + ", zeroInterestInstallments=" + this.zeroInterestInstallments + ", limits=" + this.limits + ", country=" + this.country + ", modelObject=" + getModelObject() + ", id=" + getId() + ", livemode=" + getLivemode() + ", location=" + getLocation() + ", created=" + getCreated() + ", deleted=" + getDeleted() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeStringList(this.banks);
        List<PaymentMethod> list = this.paymentMethods;
        if (list == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(list.size());
            for (PaymentMethod paymentMethod : list) {
                paymentMethod.writeToParcel(out, i);
            }
        }
        out.writeStringList(this.tokenizationMethods);
        out.writeInt(this.zeroInterestInstallments ? 1 : 0);
        Limits limits = this.limits;
        if (limits == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            limits.writeToParcel(out, i);
        }
        out.writeString(this.country);
        out.writeString(this.modelObject);
        out.writeString(this.f40256id);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeString(this.location);
        out.writeSerializable(this.created);
        out.writeInt(this.deleted ? 1 : 0);
    }

    public Capability(@Nullable List<String> list, @Nullable List<PaymentMethod> list2, @Nullable List<String> list3, boolean z, @Nullable Limits limits, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z2, @Nullable String str4, @Nullable DateTime dateTime, boolean z3) {
        this.banks = list;
        this.paymentMethods = list2;
        this.tokenizationMethods = list3;
        this.zeroInterestInstallments = z;
        this.limits = limits;
        this.country = str;
        this.modelObject = str2;
        this.f40256id = str3;
        this.livemode = z2;
        this.location = str4;
        this.created = dateTime;
        this.deleted = z3;
    }

    public /* synthetic */ Capability(List list, List list2, List list3, boolean z, Limits limits, String str, String str2, String str3, boolean z2, String str4, DateTime dateTime, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : list3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : limits, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : str4, (i & 1024) == 0 ? dateTime : null, (i & 2048) == 0 ? z3 : false);
    }
}
