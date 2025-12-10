package co.omise.android.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import ch.qos.logback.core.CoreConstants;
import co.omise.android.api.Endpoint;
import co.omise.android.api.RequestBuilder;
import co.omise.android.models.ChargeStatus;
import co.omise.android.models.FlowType;
import co.omise.android.models.SourceType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.mlkit.common.sdkinternal.OptionalModuleUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
@Metadata(m28851d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\bX\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0004\u008c\u0001\u008d\u0001BÛ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\u001c\b\u0002\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010$\u001a\u00020%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010(\u001a\u00020#\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\b\b\u0002\u0010,\u001a\u00020#¢\u0006\u0002\u0010-J\t\u0010c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\u001d\u0010l\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001dHÆ\u0003J\u0010\u0010m\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0002\u0010GJ\t\u0010n\u001a\u00020\u0005HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010!HÆ\u0003J\u0010\u0010p\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0002\u0010aJ\t\u0010q\u001a\u00020%HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010t\u001a\u00020#HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010+HÆ\u0003J\t\u0010w\u001a\u00020#HÆ\u0003J\t\u0010x\u001a\u00020\u0007HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\tHÆ\u0003Jå\u0002\u0010\u007f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u001c\b\u0002\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010(\u001a\u00020#2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010,\u001a\u00020#HÆ\u0001¢\u0006\u0003\u0010\u0080\u0001J\n\u0010\u0081\u0001\u001a\u00020\u001fHÖ\u0001J\u0016\u0010\u0082\u0001\u001a\u00020#2\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001HÖ\u0003J\n\u0010\u0085\u0001\u001a\u00020\u001fHÖ\u0001J\n\u0010\u0086\u0001\u001a\u00020\tHÖ\u0001J\u001e\u0010\u0087\u0001\u001a\u00030\u0088\u00012\b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u008b\u0001\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010$\u001a\u00020%8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001c\u0010*\u001a\u0004\u0018\u00010+X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b;\u00101R\u001a\u0010,\u001a\u00020#X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b@\u00101R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u001c\u0010'\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00101\"\u0004\bD\u0010ER\u001a\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010H\u001a\u0004\bF\u0010GR*\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bj\n\u0012\u0004\u0012\u00020\u001c\u0018\u0001`\u001d8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u001a\u0010(\u001a\u00020#X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010=\"\u0004\bL\u0010?R\u001c\u0010)\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u00101\"\u0004\bN\u0010ER\u0018\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bO\u00101R\u001c\u0010&\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00101\"\u0004\bQ\u0010ER\u0013\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\bR\u00101R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u00101R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u00101R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u0018\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010XR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010ZR\u0018\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u00101R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u00101R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u00101R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b^\u0010_R\u001a\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010b\u001a\u0004\b`\u0010a¨\u0006\u008e\u0001"}, m28850d2 = {"Lco/omise/android/models/Source;", "Lco/omise/android/models/Model;", "type", "Lco/omise/android/models/SourceType;", "flow", "Lco/omise/android/models/FlowType;", "amount", "", FirebaseAnalytics.Param.CURRENCY, "", OptionalModuleUtils.BARCODE, "references", "Lco/omise/android/models/References;", "storeId", "storeName", "terminalId", "name", "email", "bank", "platformType", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "mobileNumber", FirebaseAnalytics.Param.SHIPPING, "Lco/omise/android/models/Shipping;", "billing", "Lco/omise/android/models/Billing;", FirebaseAnalytics.Param.ITEMS, "Ljava/util/ArrayList;", "Lco/omise/android/models/Item;", "Lkotlin/collections/ArrayList;", "installmentTerm", "", "scannableCode", "Lco/omise/android/models/Barcode;", "zeroInterestInstallments", "", "chargeStatus", "Lco/omise/android/models/ChargeStatus;", "modelObject", "id", "livemode", FirebaseAnalytics.Param.LOCATION, "created", "Lorg/joda/time/DateTime;", "deleted", "(Lco/omise/android/models/SourceType;Lco/omise/android/models/FlowType;JLjava/lang/String;Ljava/lang/String;Lco/omise/android/models/References;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/omise/android/models/Shipping;Lco/omise/android/models/Billing;Ljava/util/ArrayList;Ljava/lang/Integer;Lco/omise/android/models/Barcode;Ljava/lang/Boolean;Lco/omise/android/models/ChargeStatus;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lorg/joda/time/DateTime;Z)V", "getAmount", "()J", "getBank", "()Ljava/lang/String;", "getBarcode", "getBilling", "()Lco/omise/android/models/Billing;", "getChargeStatus", "()Lco/omise/android/models/ChargeStatus;", "getCreated", "()Lorg/joda/time/DateTime;", "setCreated", "(Lorg/joda/time/DateTime;)V", "getCurrency", "getDeleted", "()Z", "setDeleted", "(Z)V", "getEmail", "getFlow", "()Lco/omise/android/models/FlowType;", "getId", "setId", "(Ljava/lang/String;)V", "getInstallmentTerm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getItems", "()Ljava/util/ArrayList;", "getLivemode", "setLivemode", "getLocation", "setLocation", "getMobileNumber", "getModelObject", "setModelObject", "getName", "getPhoneNumber", "getPlatformType", "getReferences", "()Lco/omise/android/models/References;", "getScannableCode", "()Lco/omise/android/models/Barcode;", "getShipping", "()Lco/omise/android/models/Shipping;", "getStoreId", "getStoreName", "getTerminalId", "getType", "()Lco/omise/android/models/SourceType;", "getZeroInterestInstallments", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lco/omise/android/models/SourceType;Lco/omise/android/models/FlowType;JLjava/lang/String;Ljava/lang/String;Lco/omise/android/models/References;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lco/omise/android/models/Shipping;Lco/omise/android/models/Billing;Ljava/util/ArrayList;Ljava/lang/Integer;Lco/omise/android/models/Barcode;Ljava/lang/Boolean;Lco/omise/android/models/ChargeStatus;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lorg/joda/time/DateTime;Z)Lco/omise/android/models/Source;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "CreateSourceRequestBuilder", "GetSourceRequestBuilder", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes3.dex */
public final class Source implements Model {
    @NotNull
    public static final Parcelable.Creator<Source> CREATOR = new Creator();
    private final long amount;
    @Nullable
    private final String bank;
    @Nullable
    private final String barcode;
    @JsonProperty("billing")
    @Nullable
    private final Billing billing;
    @JsonProperty("charge_status")
    @NotNull
    private final ChargeStatus chargeStatus;
    @Nullable
    private DateTime created;
    @Nullable
    private final String currency;
    private boolean deleted;
    @Nullable
    private final String email;
    @NotNull
    private final FlowType flow;
    @Nullable

    /* renamed from: id */
    private String f40261id;
    @JsonProperty("installment_term")
    @Nullable
    private final Integer installmentTerm;
    @JsonProperty(FirebaseAnalytics.Param.ITEMS)
    @Nullable
    private final ArrayList<Item> items;
    private boolean livemode;
    @Nullable
    private String location;
    @JsonProperty("mobile_number")
    @Nullable
    private final String mobileNumber;
    @Nullable
    private String modelObject;
    @Nullable
    private final String name;
    @JsonProperty("phone_number")
    @Nullable
    private final String phoneNumber;
    @JsonProperty("platform_type")
    @Nullable
    private final String platformType;
    @Nullable
    private final References references;
    @JsonProperty("scannable_code")
    @Nullable
    private final Barcode scannableCode;
    @JsonProperty(FirebaseAnalytics.Param.SHIPPING)
    @Nullable
    private final Shipping shipping;
    @JsonProperty("store_id")
    @Nullable
    private final String storeId;
    @JsonProperty("store_name")
    @Nullable
    private final String storeName;
    @JsonProperty("terminal_id")
    @Nullable
    private final String terminalId;
    @NotNull
    private final SourceType type;
    @JsonProperty("zero_interest_installments")
    @Nullable
    private final Boolean zeroInterestInstallments;

    @Metadata(m28851d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0017\u001a\u00020\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018J\b\u0010'\u001a\u00020\u0006H\u0016J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0006J\b\u0010(\u001a\u00020)H\u0014J\b\u0010*\u001a\u00020+H\u0016J\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0006J\u000e\u0010 \u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010!\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020,H\u0014J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010$\u001a\u00020%R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u001a\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0014\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010$\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010&¨\u0006-"}, m28850d2 = {"Lco/omise/android/models/Source$CreateSourceRequestBuilder;", "Lco/omise/android/api/RequestBuilder;", "Lco/omise/android/models/Source;", "amount", "", FirebaseAnalytics.Param.CURRENCY, "", "type", "Lco/omise/android/models/SourceType;", "(JLjava/lang/String;Lco/omise/android/models/SourceType;)V", "getAmount", "()J", "bank", OptionalModuleUtils.BARCODE, "billing", "Lco/omise/android/models/Billing;", "getCurrency", "()Ljava/lang/String;", "description", "email", "installmentTerm", "", "Ljava/lang/Integer;", FirebaseAnalytics.Param.ITEMS, "", "Lco/omise/android/models/Item;", "name", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "platformType", FirebaseAnalytics.Param.SHIPPING, "Lco/omise/android/models/Shipping;", "storeId", "storeName", "terminalId", "getType", "()Lco/omise/android/models/SourceType;", "zeroInterestInstallments", "", "Ljava/lang/Boolean;", FirebaseAnalytics.Param.METHOD, ClientCookie.PATH_ATTR, "Lokhttp3/HttpUrl;", "payload", "Lokhttp3/RequestBody;", "Ljava/lang/Class;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class CreateSourceRequestBuilder extends RequestBuilder<Source> {
        private final long amount;
        @JsonProperty("bank")
        @Nullable
        private String bank;
        @JsonProperty
        @Nullable
        private String barcode;
        @JsonProperty("billing")
        @Nullable
        private Billing billing;
        @NotNull
        private final String currency;
        @JsonProperty
        @Nullable
        private String description;
        @JsonProperty("email")
        @Nullable
        private String email;
        @JsonProperty("installment_term")
        @Nullable
        private Integer installmentTerm;
        @JsonProperty(FirebaseAnalytics.Param.ITEMS)
        @Nullable
        private List<Item> items;
        @JsonProperty("name")
        @Nullable
        private String name;
        @JsonProperty("phone_number")
        @Nullable
        private String phoneNumber;
        @JsonProperty("platform_type")
        @Nullable
        private String platformType;
        @JsonProperty(FirebaseAnalytics.Param.SHIPPING)
        @Nullable
        private Shipping shipping;
        @JsonProperty("store_id")
        @Nullable
        private String storeId;
        @JsonProperty("store_name")
        @Nullable
        private String storeName;
        @JsonProperty("terminal_id")
        @Nullable
        private String terminalId;
        @NotNull
        private final SourceType type;
        @JsonProperty("zero_interest_installments")
        @Nullable
        private Boolean zeroInterestInstallments;

        public CreateSourceRequestBuilder(@JsonProperty long j, @JsonProperty @NotNull String currency, @NotNull SourceType type) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(type, "type");
            this.amount = j;
            this.currency = currency;
            this.type = type;
            this.platformType = "android";
        }

        @NotNull
        public final CreateSourceRequestBuilder bank(@NotNull String bank) {
            Intrinsics.checkNotNullParameter(bank, "bank");
            this.bank = bank;
            return this;
        }

        @NotNull
        public final CreateSourceRequestBuilder barcode(@NotNull String barcode) {
            Intrinsics.checkNotNullParameter(barcode, "barcode");
            this.barcode = barcode;
            return this;
        }

        @NotNull
        public final CreateSourceRequestBuilder billing(@NotNull Billing billing) {
            Intrinsics.checkNotNullParameter(billing, "billing");
            this.billing = billing;
            return this;
        }

        @NotNull
        public final CreateSourceRequestBuilder description(@NotNull String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            this.description = description;
            return this;
        }

        @NotNull
        public final CreateSourceRequestBuilder email(@NotNull String email) {
            Intrinsics.checkNotNullParameter(email, "email");
            this.email = email;
            return this;
        }

        public final long getAmount() {
            return this.amount;
        }

        @NotNull
        public final String getCurrency() {
            return this.currency;
        }

        @NotNull
        public final SourceType getType() {
            return this.type;
        }

        @NotNull
        public final CreateSourceRequestBuilder installmentTerm(int i) {
            this.installmentTerm = Integer.valueOf(i);
            return this;
        }

        @NotNull
        public final CreateSourceRequestBuilder items(@NotNull List<Item> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
            return this;
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public String method() {
            return "POST";
        }

        @NotNull
        public final CreateSourceRequestBuilder name(@NotNull String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
            return this;
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public HttpUrl path() {
            return buildUrl(Endpoint.API, "sources", new String[0]);
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public RequestBody payload() throws IOException {
            return serialize();
        }

        @NotNull
        public final CreateSourceRequestBuilder phoneNumber(@NotNull String phoneNumber) {
            Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
            this.phoneNumber = phoneNumber;
            return this;
        }

        @NotNull
        public final CreateSourceRequestBuilder platformType(@NotNull String platformType) {
            Intrinsics.checkNotNullParameter(platformType, "platformType");
            this.platformType = platformType;
            return this;
        }

        @NotNull
        public final CreateSourceRequestBuilder shipping(@NotNull Shipping shipping) {
            Intrinsics.checkNotNullParameter(shipping, "shipping");
            this.shipping = shipping;
            return this;
        }

        @NotNull
        public final CreateSourceRequestBuilder storeId(@NotNull String storeId) {
            Intrinsics.checkNotNullParameter(storeId, "storeId");
            this.storeId = storeId;
            return this;
        }

        @NotNull
        public final CreateSourceRequestBuilder storeName(@NotNull String storeName) {
            Intrinsics.checkNotNullParameter(storeName, "storeName");
            this.storeName = storeName;
            return this;
        }

        @NotNull
        public final CreateSourceRequestBuilder terminalId(@NotNull String terminalId) {
            Intrinsics.checkNotNullParameter(terminalId, "terminalId");
            this.terminalId = terminalId;
            return this;
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public Class<Source> type() {
            return Source.class;
        }

        @NotNull
        public final CreateSourceRequestBuilder zeroInterestInstallments(boolean z) {
            this.zeroInterestInstallments = Boolean.valueOf(z);
            return this;
        }
    }

    @Metadata(m28849k = 3, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Source> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Source createFromParcel(@NotNull Parcel parcel) {
            String str;
            ArrayList arrayList;
            Boolean valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            SourceType create = SourceTypeParceler.INSTANCE.create(parcel);
            FlowType create2 = FlowTypeParceler.INSTANCE.create(parcel);
            long readLong = parcel.readLong();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            References createFromParcel = parcel.readInt() == 0 ? null : References.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            String readString11 = parcel.readString();
            Shipping createFromParcel2 = parcel.readInt() == 0 ? null : Shipping.CREATOR.createFromParcel(parcel);
            Billing createFromParcel3 = parcel.readInt() == 0 ? null : Billing.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                str = readString8;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                str = readString8;
                int i = 0;
                while (i != readInt) {
                    arrayList2.add(Item.CREATOR.createFromParcel(parcel));
                    i++;
                    readInt = readInt;
                }
                arrayList = arrayList2;
            }
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Barcode createFromParcel4 = parcel.readInt() == 0 ? null : Barcode.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Source(create, create2, readLong, readString, readString2, createFromParcel, readString3, readString4, readString5, readString6, readString7, str, readString9, readString10, readString11, createFromParcel2, createFromParcel3, arrayList, valueOf2, createFromParcel4, valueOf, ChargeStatusParceler.INSTANCE.create(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), (DateTime) parcel.readSerializable(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Source[] newArray(int i) {
            return new Source[i];
        }
    }

    @Metadata(m28851d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\nH\u0014J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0014R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m28850d2 = {"Lco/omise/android/models/Source$GetSourceRequestBuilder;", "Lco/omise/android/api/RequestBuilder;", "Lco/omise/android/models/Source;", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", FirebaseAnalytics.Param.METHOD, ClientCookie.PATH_ATTR, "Lokhttp3/HttpUrl;", "type", "Ljava/lang/Class;", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
    /* loaded from: classes3.dex */
    public static final class GetSourceRequestBuilder extends RequestBuilder<Source> {
        @NotNull

        /* renamed from: id */
        private final String f40262id;

        public GetSourceRequestBuilder(@NotNull String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.f40262id = id2;
        }

        @NotNull
        public final String getId() {
            return this.f40262id;
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public String method() {
            return "GET";
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public HttpUrl path() {
            return buildUrl(Endpoint.API, "sources", this.f40262id);
        }

        @Override // co.omise.android.api.RequestBuilder
        @NotNull
        public Class<Source> type() {
            return Source.class;
        }
    }

    public Source() {
        this(null, null, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, 268435455, null);
    }

    @NotNull
    public final SourceType component1() {
        return this.type;
    }

    @Nullable
    public final String component10() {
        return this.name;
    }

    @Nullable
    public final String component11() {
        return this.email;
    }

    @Nullable
    public final String component12() {
        return this.bank;
    }

    @Nullable
    public final String component13() {
        return this.platformType;
    }

    @Nullable
    public final String component14() {
        return this.phoneNumber;
    }

    @Nullable
    public final String component15() {
        return this.mobileNumber;
    }

    @Nullable
    public final Shipping component16() {
        return this.shipping;
    }

    @Nullable
    public final Billing component17() {
        return this.billing;
    }

    @Nullable
    public final ArrayList<Item> component18() {
        return this.items;
    }

    @Nullable
    public final Integer component19() {
        return this.installmentTerm;
    }

    @NotNull
    public final FlowType component2() {
        return this.flow;
    }

    @Nullable
    public final Barcode component20() {
        return this.scannableCode;
    }

    @Nullable
    public final Boolean component21() {
        return this.zeroInterestInstallments;
    }

    @NotNull
    public final ChargeStatus component22() {
        return this.chargeStatus;
    }

    @Nullable
    public final String component23() {
        return getModelObject();
    }

    @Nullable
    public final String component24() {
        return getId();
    }

    public final boolean component25() {
        return getLivemode();
    }

    @Nullable
    public final String component26() {
        return getLocation();
    }

    @Nullable
    public final DateTime component27() {
        return getCreated();
    }

    public final boolean component28() {
        return getDeleted();
    }

    public final long component3() {
        return this.amount;
    }

    @Nullable
    public final String component4() {
        return this.currency;
    }

    @Nullable
    public final String component5() {
        return this.barcode;
    }

    @Nullable
    public final References component6() {
        return this.references;
    }

    @Nullable
    public final String component7() {
        return this.storeId;
    }

    @Nullable
    public final String component8() {
        return this.storeName;
    }

    @Nullable
    public final String component9() {
        return this.terminalId;
    }

    @NotNull
    public final Source copy(@NotNull SourceType type, @NotNull FlowType flow, long j, @Nullable String str, @Nullable String str2, @Nullable References references, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Shipping shipping, @Nullable Billing billing, @Nullable ArrayList<Item> arrayList, @Nullable Integer num, @Nullable Barcode barcode, @Nullable Boolean bool, @NotNull ChargeStatus chargeStatus, @Nullable String str12, @Nullable String str13, boolean z, @Nullable String str14, @Nullable DateTime dateTime, boolean z2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(chargeStatus, "chargeStatus");
        return new Source(type, flow, j, str, str2, references, str3, str4, str5, str6, str7, str8, str9, str10, str11, shipping, billing, arrayList, num, barcode, bool, chargeStatus, str12, str13, z, str14, dateTime, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Source) {
            Source source = (Source) obj;
            return Intrinsics.areEqual(this.type, source.type) && Intrinsics.areEqual(this.flow, source.flow) && this.amount == source.amount && Intrinsics.areEqual(this.currency, source.currency) && Intrinsics.areEqual(this.barcode, source.barcode) && Intrinsics.areEqual(this.references, source.references) && Intrinsics.areEqual(this.storeId, source.storeId) && Intrinsics.areEqual(this.storeName, source.storeName) && Intrinsics.areEqual(this.terminalId, source.terminalId) && Intrinsics.areEqual(this.name, source.name) && Intrinsics.areEqual(this.email, source.email) && Intrinsics.areEqual(this.bank, source.bank) && Intrinsics.areEqual(this.platformType, source.platformType) && Intrinsics.areEqual(this.phoneNumber, source.phoneNumber) && Intrinsics.areEqual(this.mobileNumber, source.mobileNumber) && Intrinsics.areEqual(this.shipping, source.shipping) && Intrinsics.areEqual(this.billing, source.billing) && Intrinsics.areEqual(this.items, source.items) && Intrinsics.areEqual(this.installmentTerm, source.installmentTerm) && Intrinsics.areEqual(this.scannableCode, source.scannableCode) && Intrinsics.areEqual(this.zeroInterestInstallments, source.zeroInterestInstallments) && Intrinsics.areEqual(this.chargeStatus, source.chargeStatus) && Intrinsics.areEqual(getModelObject(), source.getModelObject()) && Intrinsics.areEqual(getId(), source.getId()) && getLivemode() == source.getLivemode() && Intrinsics.areEqual(getLocation(), source.getLocation()) && Intrinsics.areEqual(getCreated(), source.getCreated()) && getDeleted() == source.getDeleted();
        }
        return false;
    }

    public final long getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getBank() {
        return this.bank;
    }

    @Nullable
    public final String getBarcode() {
        return this.barcode;
    }

    @Nullable
    public final Billing getBilling() {
        return this.billing;
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

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    @Override // co.omise.android.models.Model
    public boolean getDeleted() {
        return this.deleted;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final FlowType getFlow() {
        return this.flow;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public String getId() {
        return this.f40261id;
    }

    @Nullable
    public final Integer getInstallmentTerm() {
        return this.installmentTerm;
    }

    @Nullable
    public final ArrayList<Item> getItems() {
        return this.items;
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

    @Nullable
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    @Override // co.omise.android.models.Model
    @Nullable
    public String getModelObject() {
        return this.modelObject;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    public final String getPlatformType() {
        return this.platformType;
    }

    @Nullable
    public final References getReferences() {
        return this.references;
    }

    @Nullable
    public final Barcode getScannableCode() {
        return this.scannableCode;
    }

    @Nullable
    public final Shipping getShipping() {
        return this.shipping;
    }

    @Nullable
    public final String getStoreId() {
        return this.storeId;
    }

    @Nullable
    public final String getStoreName() {
        return this.storeName;
    }

    @Nullable
    public final String getTerminalId() {
        return this.terminalId;
    }

    @NotNull
    public final SourceType getType() {
        return this.type;
    }

    @Nullable
    public final Boolean getZeroInterestInstallments() {
        return this.zeroInterestInstallments;
    }

    public int hashCode() {
        int hashCode = ((((this.type.hashCode() * 31) + this.flow.hashCode()) * 31) + AbstractC17792Ig1.m67882a(this.amount)) * 31;
        String str = this.currency;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.barcode;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        References references = this.references;
        int hashCode4 = (hashCode3 + (references == null ? 0 : references.hashCode())) * 31;
        String str3 = this.storeId;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.storeName;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.terminalId;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.name;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.email;
        int hashCode9 = (hashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.bank;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.platformType;
        int hashCode11 = (hashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.phoneNumber;
        int hashCode12 = (hashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.mobileNumber;
        int hashCode13 = (hashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Shipping shipping = this.shipping;
        int hashCode14 = (hashCode13 + (shipping == null ? 0 : shipping.hashCode())) * 31;
        Billing billing = this.billing;
        int hashCode15 = (hashCode14 + (billing == null ? 0 : billing.hashCode())) * 31;
        ArrayList<Item> arrayList = this.items;
        int hashCode16 = (hashCode15 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Integer num = this.installmentTerm;
        int hashCode17 = (hashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        Barcode barcode = this.scannableCode;
        int hashCode18 = (hashCode17 + (barcode == null ? 0 : barcode.hashCode())) * 31;
        Boolean bool = this.zeroInterestInstallments;
        int hashCode19 = (((((((hashCode18 + (bool == null ? 0 : bool.hashCode())) * 31) + this.chargeStatus.hashCode()) * 31) + (getModelObject() == null ? 0 : getModelObject().hashCode())) * 31) + (getId() == null ? 0 : getId().hashCode())) * 31;
        boolean livemode = getLivemode();
        int i = livemode;
        if (livemode) {
            i = 1;
        }
        int hashCode20 = (((((hashCode19 + i) * 31) + (getLocation() == null ? 0 : getLocation().hashCode())) * 31) + (getCreated() != null ? getCreated().hashCode() : 0)) * 31;
        boolean deleted = getDeleted();
        return hashCode20 + (deleted ? 1 : deleted);
    }

    public void setCreated(@Nullable DateTime dateTime) {
        this.created = dateTime;
    }

    public void setDeleted(boolean z) {
        this.deleted = z;
    }

    public void setId(@Nullable String str) {
        this.f40261id = str;
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
        return "Source(type=" + this.type + ", flow=" + this.flow + ", amount=" + this.amount + ", currency=" + this.currency + ", barcode=" + this.barcode + ", references=" + this.references + ", storeId=" + this.storeId + ", storeName=" + this.storeName + ", terminalId=" + this.terminalId + ", name=" + this.name + ", email=" + this.email + ", bank=" + this.bank + ", platformType=" + this.platformType + ", phoneNumber=" + this.phoneNumber + ", mobileNumber=" + this.mobileNumber + ", shipping=" + this.shipping + ", billing=" + this.billing + ", items=" + this.items + ", installmentTerm=" + this.installmentTerm + ", scannableCode=" + this.scannableCode + ", zeroInterestInstallments=" + this.zeroInterestInstallments + ", chargeStatus=" + this.chargeStatus + ", modelObject=" + getModelObject() + ", id=" + getId() + ", livemode=" + getLivemode() + ", location=" + getLocation() + ", created=" + getCreated() + ", deleted=" + getDeleted() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        SourceTypeParceler.INSTANCE.write(this.type, out, i);
        FlowTypeParceler.INSTANCE.write(this.flow, out, i);
        out.writeLong(this.amount);
        out.writeString(this.currency);
        out.writeString(this.barcode);
        References references = this.references;
        if (references == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            references.writeToParcel(out, i);
        }
        out.writeString(this.storeId);
        out.writeString(this.storeName);
        out.writeString(this.terminalId);
        out.writeString(this.name);
        out.writeString(this.email);
        out.writeString(this.bank);
        out.writeString(this.platformType);
        out.writeString(this.phoneNumber);
        out.writeString(this.mobileNumber);
        Shipping shipping = this.shipping;
        if (shipping == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shipping.writeToParcel(out, i);
        }
        Billing billing = this.billing;
        if (billing == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            billing.writeToParcel(out, i);
        }
        ArrayList<Item> arrayList = this.items;
        if (arrayList == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(arrayList.size());
            Iterator<Item> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(out, i);
            }
        }
        Integer num = this.installmentTerm;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        Barcode barcode = this.scannableCode;
        if (barcode == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            barcode.writeToParcel(out, i);
        }
        Boolean bool = this.zeroInterestInstallments;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        ChargeStatusParceler.INSTANCE.write(this.chargeStatus, out, i);
        out.writeString(this.modelObject);
        out.writeString(this.f40261id);
        out.writeInt(this.livemode ? 1 : 0);
        out.writeString(this.location);
        out.writeSerializable(this.created);
        out.writeInt(this.deleted ? 1 : 0);
    }

    public Source(@NotNull SourceType type, @NotNull FlowType flow, long j, @Nullable String str, @Nullable String str2, @Nullable References references, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable Shipping shipping, @Nullable Billing billing, @Nullable ArrayList<Item> arrayList, @Nullable Integer num, @Nullable Barcode barcode, @Nullable Boolean bool, @NotNull ChargeStatus chargeStatus, @Nullable String str12, @Nullable String str13, boolean z, @Nullable String str14, @Nullable DateTime dateTime, boolean z2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(chargeStatus, "chargeStatus");
        this.type = type;
        this.flow = flow;
        this.amount = j;
        this.currency = str;
        this.barcode = str2;
        this.references = references;
        this.storeId = str3;
        this.storeName = str4;
        this.terminalId = str5;
        this.name = str6;
        this.email = str7;
        this.bank = str8;
        this.platformType = str9;
        this.phoneNumber = str10;
        this.mobileNumber = str11;
        this.shipping = shipping;
        this.billing = billing;
        this.items = arrayList;
        this.installmentTerm = num;
        this.scannableCode = barcode;
        this.zeroInterestInstallments = bool;
        this.chargeStatus = chargeStatus;
        this.modelObject = str12;
        this.f40261id = str13;
        this.livemode = z;
        this.location = str14;
        this.created = dateTime;
        this.deleted = z2;
    }

    public /* synthetic */ Source(SourceType sourceType, FlowType flowType, long j, String str, String str2, References references, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, Shipping shipping, Billing billing, ArrayList arrayList, Integer num, Barcode barcode, Boolean bool, ChargeStatus chargeStatus, String str12, String str13, boolean z, String str14, DateTime dateTime, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new SourceType.Unknown(null) : sourceType, (i & 2) != 0 ? new FlowType.Unknown(null) : flowType, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : references, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : str7, (i & 2048) != 0 ? null : str8, (i & 4096) != 0 ? null : str9, (i & 8192) != 0 ? null : str10, (i & 16384) != 0 ? null : str11, (i & 32768) != 0 ? null : shipping, (i & 65536) != 0 ? null : billing, (i & 131072) != 0 ? new ArrayList() : arrayList, (i & 262144) != 0 ? null : num, (i & 524288) != 0 ? null : barcode, (i & 1048576) != 0 ? null : bool, (i & 2097152) != 0 ? ChargeStatus.Unknown.INSTANCE : chargeStatus, (i & 4194304) != 0 ? null : str12, (i & 8388608) != 0 ? null : str13, (i & 16777216) != 0 ? false : z, (i & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? null : str14, (i & 67108864) != 0 ? null : dateTime, (i & 134217728) == 0 ? z2 : false);
    }
}
