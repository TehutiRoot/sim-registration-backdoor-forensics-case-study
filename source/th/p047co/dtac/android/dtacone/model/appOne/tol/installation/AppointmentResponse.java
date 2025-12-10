package th.p047co.dtac.android.dtacone.model.appOne.tol.installation;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.cli.HelpFormatter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentDateItem;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u000bHÆ\u0003Jc\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006&"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentResponse;", "", "codeType", "", "code", "desc", "systemMessage", "replaceMessage", "", "responseDateTime", "data", "Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentData;)V", "getCode", "()Ljava/lang/String;", "getCodeType", "getData", "()Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentData;", "getDesc", "getReplaceMessage", "()Ljava/util/List;", "getResponseDateTime", "getSystemMessage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentResponse */
/* loaded from: classes8.dex */
public final class AppointmentResponse {
    @SerializedName("code")
    @Nullable
    private final String code;
    @SerializedName("codeType")
    @Nullable
    private final String codeType;
    @SerializedName("data")
    @Nullable
    private final AppointmentData data;
    @SerializedName("desc")
    @Nullable
    private final String desc;
    @SerializedName("replaceMessage")
    @Nullable
    private final List<String> replaceMessage;
    @SerializedName("responseDateTime")
    @Nullable
    private final String responseDateTime;
    @SerializedName("systemMessage")
    @Nullable
    private final String systemMessage;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m28850d2 = {"Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentResponse$Companion;", "", "()V", "mock", "Lth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentResponse;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    @SourceDebugExtension({"SMAP\nAppointmentResponse.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppointmentResponse.kt\nth/co/dtac/android/dtacone/model/appOne/tol/installation/AppointmentResponse$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
    /* renamed from: th.co.dtac.android.dtacone.model.appOne.tol.installation.AppointmentResponse$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AppointmentResponse mock() {
            String m19135a;
            String m19134b;
            String m19135a2;
            Date date = new Date();
            Calendar cal = Calendar.getInstance(Locale.US);
            cal.setTime(date);
            Intrinsics.checkNotNullExpressionValue(cal, "cal");
            m19135a = AppointmentResponseKt.m19135a(cal);
            m19134b = AppointmentResponseKt.m19134b(cal);
            String str = m19135a + HelpFormatter.DEFAULT_LONG_OPT_SEPARATOR + m19134b;
            List emptyList = CollectionsKt__CollectionsKt.emptyList();
            ArrayList arrayList = new ArrayList(90);
            int i = 0;
            while (i < 90) {
                Object clone = cal.clone();
                Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type java.util.Calendar");
                Calendar calendar = (Calendar) clone;
                i++;
                calendar.add(5, i);
                AppointmentDateItem.Companion companion = AppointmentDateItem.Companion;
                m19135a2 = AppointmentResponseKt.m19135a(calendar);
                arrayList.add(companion.mock(m19135a2));
            }
            return new AppointmentResponse("S", "200", FirebaseAnalytics.Param.SUCCESS, "", emptyList, str, new AppointmentData(FirebaseAnalytics.Param.SUCCESS, true, arrayList));
        }

        private Companion() {
        }
    }

    public AppointmentResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ AppointmentResponse copy$default(AppointmentResponse appointmentResponse, String str, String str2, String str3, String str4, List list, String str5, AppointmentData appointmentData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appointmentResponse.codeType;
        }
        if ((i & 2) != 0) {
            str2 = appointmentResponse.code;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = appointmentResponse.desc;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = appointmentResponse.systemMessage;
        }
        String str8 = str4;
        List<String> list2 = list;
        if ((i & 16) != 0) {
            list2 = appointmentResponse.replaceMessage;
        }
        List list3 = list2;
        if ((i & 32) != 0) {
            str5 = appointmentResponse.responseDateTime;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            appointmentData = appointmentResponse.data;
        }
        return appointmentResponse.copy(str, str6, str7, str8, list3, str9, appointmentData);
    }

    @Nullable
    public final String component1() {
        return this.codeType;
    }

    @Nullable
    public final String component2() {
        return this.code;
    }

    @Nullable
    public final String component3() {
        return this.desc;
    }

    @Nullable
    public final String component4() {
        return this.systemMessage;
    }

    @Nullable
    public final List<String> component5() {
        return this.replaceMessage;
    }

    @Nullable
    public final String component6() {
        return this.responseDateTime;
    }

    @Nullable
    public final AppointmentData component7() {
        return this.data;
    }

    @NotNull
    public final AppointmentResponse copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable AppointmentData appointmentData) {
        return new AppointmentResponse(str, str2, str3, str4, list, str5, appointmentData);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppointmentResponse) {
            AppointmentResponse appointmentResponse = (AppointmentResponse) obj;
            return Intrinsics.areEqual(this.codeType, appointmentResponse.codeType) && Intrinsics.areEqual(this.code, appointmentResponse.code) && Intrinsics.areEqual(this.desc, appointmentResponse.desc) && Intrinsics.areEqual(this.systemMessage, appointmentResponse.systemMessage) && Intrinsics.areEqual(this.replaceMessage, appointmentResponse.replaceMessage) && Intrinsics.areEqual(this.responseDateTime, appointmentResponse.responseDateTime) && Intrinsics.areEqual(this.data, appointmentResponse.data);
        }
        return false;
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final String getCodeType() {
        return this.codeType;
    }

    @Nullable
    public final AppointmentData getData() {
        return this.data;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final List<String> getReplaceMessage() {
        return this.replaceMessage;
    }

    @Nullable
    public final String getResponseDateTime() {
        return this.responseDateTime;
    }

    @Nullable
    public final String getSystemMessage() {
        return this.systemMessage;
    }

    public int hashCode() {
        String str = this.codeType;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.systemMessage;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.replaceMessage;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str5 = this.responseDateTime;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AppointmentData appointmentData = this.data;
        return hashCode6 + (appointmentData != null ? appointmentData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.codeType;
        String str2 = this.code;
        String str3 = this.desc;
        String str4 = this.systemMessage;
        List<String> list = this.replaceMessage;
        String str5 = this.responseDateTime;
        AppointmentData appointmentData = this.data;
        return "AppointmentResponse(codeType=" + str + ", code=" + str2 + ", desc=" + str3 + ", systemMessage=" + str4 + ", replaceMessage=" + list + ", responseDateTime=" + str5 + ", data=" + appointmentData + ")";
    }

    public AppointmentResponse(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list, @Nullable String str5, @Nullable AppointmentData appointmentData) {
        this.codeType = str;
        this.code = str2;
        this.desc = str3;
        this.systemMessage = str4;
        this.replaceMessage = list;
        this.responseDateTime = str5;
        this.data = appointmentData;
    }

    public /* synthetic */ AppointmentResponse(String str, String str2, String str3, String str4, List list, String str5, AppointmentData appointmentData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : appointmentData);
    }
}
