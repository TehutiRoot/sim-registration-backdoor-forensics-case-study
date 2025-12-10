package com.google.firebase.appdistribution.gradle.models;

import com.google.gson.annotations.SerializedName;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\nJ@\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\n¨\u0006!"}, m29142d2 = {"Lcom/google/firebase/appdistribution/gradle/models/TestDevice;", "", "", "locale", "model", "orientation", ClientCookie.VERSION_ATTR, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/firebase/appdistribution/gradle/models/TestDevice;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/lang/String;", "getLocale", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "getModel", OperatorName.CURVE_TO, "getOrientation", "d", "getVersion", "appdistribution-gradle"}, m29141k = 1, m29140mv = {1, 8, 0})
/* loaded from: classes4.dex */
public final class TestDevice {
    @SerializedName("locale")
    @Nullable

    /* renamed from: a */
    private final String f54656a;
    @SerializedName("model")
    @Nullable

    /* renamed from: b */
    private final String f54657b;
    @SerializedName("orientation")
    @Nullable

    /* renamed from: c */
    private final String f54658c;
    @SerializedName(ClientCookie.VERSION_ATTR)
    @Nullable

    /* renamed from: d */
    private final String f54659d;

    public TestDevice() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ TestDevice copy$default(TestDevice testDevice, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = testDevice.f54656a;
        }
        if ((i & 2) != 0) {
            str2 = testDevice.f54657b;
        }
        if ((i & 4) != 0) {
            str3 = testDevice.f54658c;
        }
        if ((i & 8) != 0) {
            str4 = testDevice.f54659d;
        }
        return testDevice.copy(str, str2, str3, str4);
    }

    @Nullable
    public final String component1() {
        return this.f54656a;
    }

    @Nullable
    public final String component2() {
        return this.f54657b;
    }

    @Nullable
    public final String component3() {
        return this.f54658c;
    }

    @Nullable
    public final String component4() {
        return this.f54659d;
    }

    @NotNull
    public final TestDevice copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        return new TestDevice(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TestDevice) {
            TestDevice testDevice = (TestDevice) obj;
            return Intrinsics.areEqual(this.f54656a, testDevice.f54656a) && Intrinsics.areEqual(this.f54657b, testDevice.f54657b) && Intrinsics.areEqual(this.f54658c, testDevice.f54658c) && Intrinsics.areEqual(this.f54659d, testDevice.f54659d);
        }
        return false;
    }

    @Nullable
    public final String getLocale() {
        return this.f54656a;
    }

    @Nullable
    public final String getModel() {
        return this.f54657b;
    }

    @Nullable
    public final String getOrientation() {
        return this.f54658c;
    }

    @Nullable
    public final String getVersion() {
        return this.f54659d;
    }

    public int hashCode() {
        String str = this.f54656a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f54657b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f54658c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f54659d;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TestDevice{model='" + this.f54657b + "'version='" + this.f54659d + "'orientation='" + this.f54658c + "'locale='" + this.f54656a + "'}";
    }

    public TestDevice(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f54656a = str;
        this.f54657b = str2;
        this.f54658c = str3;
        this.f54659d = str4;
    }

    public /* synthetic */ TestDevice(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}