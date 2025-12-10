package com.google.firebase.appdistribution.gradle.models;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJR\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b)\u0010\u000eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\u000e¨\u0006,"}, m28850d2 = {"Lcom/google/firebase/appdistribution/gradle/models/ReleaseTest;", "", "", "createTime", "", "Lcom/google/firebase/appdistribution/gradle/models/DeviceExecution;", "deviceExecutions", "Lcom/google/firebase/appdistribution/gradle/models/LoginCredential;", "loginCredential", "name", "testCase", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/google/firebase/appdistribution/gradle/models/LoginCredential;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/google/firebase/appdistribution/gradle/models/LoginCredential;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/google/firebase/appdistribution/gradle/models/LoginCredential;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/ReleaseTest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getCreateTime", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Ljava/util/List;", "getDeviceExecutions", OperatorName.CURVE_TO, "Lcom/google/firebase/appdistribution/gradle/models/LoginCredential;", "getLoginCredential", "d", "getName", "e", "getTestCase", "appdistribution-gradle"}, m28849k = 1, m28848mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class ReleaseTest {
    @SerializedName("createTime")
    @Nullable

    /* renamed from: a */
    private final String f54634a;
    @SerializedName("deviceExecutions")
    @Nullable

    /* renamed from: b */
    private final List<DeviceExecution> f54635b;
    @SerializedName("loginCredential")
    @Nullable

    /* renamed from: c */
    private final LoginCredential f54636c;
    @SerializedName("name")
    @Nullable

    /* renamed from: d */
    private final String f54637d;
    @SerializedName("testCase")
    @Nullable

    /* renamed from: e */
    private final String f54638e;

    public ReleaseTest() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ ReleaseTest copy$default(ReleaseTest releaseTest, String str, List list, LoginCredential loginCredential, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = releaseTest.f54634a;
        }
        List<DeviceExecution> list2 = list;
        if ((i & 2) != 0) {
            list2 = releaseTest.f54635b;
        }
        List list3 = list2;
        if ((i & 4) != 0) {
            loginCredential = releaseTest.f54636c;
        }
        LoginCredential loginCredential2 = loginCredential;
        if ((i & 8) != 0) {
            str2 = releaseTest.f54637d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            str3 = releaseTest.f54638e;
        }
        return releaseTest.copy(str, list3, loginCredential2, str4, str3);
    }

    @Nullable
    public final String component1() {
        return this.f54634a;
    }

    @Nullable
    public final List<DeviceExecution> component2() {
        return this.f54635b;
    }

    @Nullable
    public final LoginCredential component3() {
        return this.f54636c;
    }

    @Nullable
    public final String component4() {
        return this.f54637d;
    }

    @Nullable
    public final String component5() {
        return this.f54638e;
    }

    @NotNull
    public final ReleaseTest copy(@Nullable String str, @Nullable List<DeviceExecution> list, @Nullable LoginCredential loginCredential, @Nullable String str2, @Nullable String str3) {
        return new ReleaseTest(str, list, loginCredential, str2, str3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReleaseTest) {
            ReleaseTest releaseTest = (ReleaseTest) obj;
            return Intrinsics.areEqual(this.f54634a, releaseTest.f54634a) && Intrinsics.areEqual(this.f54635b, releaseTest.f54635b) && Intrinsics.areEqual(this.f54636c, releaseTest.f54636c) && Intrinsics.areEqual(this.f54637d, releaseTest.f54637d) && Intrinsics.areEqual(this.f54638e, releaseTest.f54638e);
        }
        return false;
    }

    @Nullable
    public final String getCreateTime() {
        return this.f54634a;
    }

    @Nullable
    public final List<DeviceExecution> getDeviceExecutions() {
        return this.f54635b;
    }

    @Nullable
    public final LoginCredential getLoginCredential() {
        return this.f54636c;
    }

    @Nullable
    public final String getName() {
        return this.f54637d;
    }

    @Nullable
    public final String getTestCase() {
        return this.f54638e;
    }

    public int hashCode() {
        String str = this.f54634a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<DeviceExecution> list = this.f54635b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        LoginCredential loginCredential = this.f54636c;
        int hashCode3 = (hashCode2 + (loginCredential == null ? 0 : loginCredential.hashCode())) * 31;
        String str2 = this.f54637d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f54638e;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReleaseTest(createTime=" + this.f54634a + ", deviceExecutions=" + this.f54635b + ", loginCredential=" + this.f54636c + ", name=" + this.f54637d + ", testCase=" + this.f54638e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public ReleaseTest(@Nullable String str, @Nullable List<DeviceExecution> list, @Nullable LoginCredential loginCredential, @Nullable String str2, @Nullable String str3) {
        this.f54634a = str;
        this.f54635b = list;
        this.f54636c = loginCredential;
        this.f54637d = str2;
        this.f54638e = str3;
    }

    public /* synthetic */ ReleaseTest(String str, List list, LoginCredential loginCredential, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : loginCredential, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3);
    }
}
