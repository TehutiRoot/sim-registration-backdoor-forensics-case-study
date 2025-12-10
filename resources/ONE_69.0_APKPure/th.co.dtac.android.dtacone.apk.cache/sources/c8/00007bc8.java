package co.omise.android.models;

import androidx.core.p005os.EnvironmentCompat;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import com.tom_roush.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0007\u0007\b\t\n\u000b\f\rB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0006\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, m29142d2 = {"Lco/omise/android/models/ChargeStatus;", "", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Companion", PDAnnotationRubberStamp.NAME_EXPIRED, Constant.checkESimStatus.Failed, "Pending", "Reversed", "Successful", OpenTypeScript.UNKNOWN, "Lco/omise/android/models/ChargeStatus$Expired;", "Lco/omise/android/models/ChargeStatus$Failed;", "Lco/omise/android/models/ChargeStatus$Pending;", "Lco/omise/android/models/ChargeStatus$Reversed;", "Lco/omise/android/models/ChargeStatus$Successful;", "Lco/omise/android/models/ChargeStatus$Unknown;", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
/* loaded from: classes3.dex */
public abstract class ChargeStatus {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @JsonValue
    @NotNull
    private final String value;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007"}, m29142d2 = {"Lco/omise/android/models/ChargeStatus$Companion;", "", "()V", "creator", "Lco/omise/android/models/ChargeStatus;", "name", "", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @JsonCreator
        @NotNull
        public final ChargeStatus creator(@Nullable String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -1309235419:
                        if (str.equals("expired")) {
                            return Expired.INSTANCE;
                        }
                        break;
                    case -1281977283:
                        if (str.equals("failed")) {
                            return Failed.INSTANCE;
                        }
                        break;
                    case -733631846:
                        if (str.equals("successful")) {
                            return Successful.INSTANCE;
                        }
                        break;
                    case -682587753:
                        if (str.equals("pending")) {
                            return Pending.INSTANCE;
                        }
                        break;
                    case -264500798:
                        if (str.equals("reversed")) {
                            return Reversed.INSTANCE;
                        }
                        break;
                }
            }
            return Unknown.INSTANCE;
        }

        private Companion() {
        }
    }

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lco/omise/android/models/ChargeStatus$Expired;", "Lco/omise/android/models/ChargeStatus;", "()V", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Expired extends ChargeStatus {
        @NotNull
        public static final Expired INSTANCE = new Expired();

        private Expired() {
            super("expired", null);
        }
    }

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lco/omise/android/models/ChargeStatus$Failed;", "Lco/omise/android/models/ChargeStatus;", "()V", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Failed extends ChargeStatus {
        @NotNull
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super("failed", null);
        }
    }

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lco/omise/android/models/ChargeStatus$Pending;", "Lco/omise/android/models/ChargeStatus;", "()V", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Pending extends ChargeStatus {
        @NotNull
        public static final Pending INSTANCE = new Pending();

        private Pending() {
            super("pending", null);
        }
    }

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lco/omise/android/models/ChargeStatus$Reversed;", "Lco/omise/android/models/ChargeStatus;", "()V", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Reversed extends ChargeStatus {
        @NotNull
        public static final Reversed INSTANCE = new Reversed();

        private Reversed() {
            super("reversed", null);
        }
    }

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lco/omise/android/models/ChargeStatus$Successful;", "Lco/omise/android/models/ChargeStatus;", "()V", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Successful extends ChargeStatus {
        @NotNull
        public static final Successful INSTANCE = new Successful();

        private Successful() {
            super("successful", null);
        }
    }

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lco/omise/android/models/ChargeStatus$Unknown;", "Lco/omise/android/models/ChargeStatus;", "()V", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1}, m29138xi = 48)
    /* loaded from: classes3.dex */
    public static final class Unknown extends ChargeStatus {
        @NotNull
        public static final Unknown INSTANCE = new Unknown();

        private Unknown() {
            super(EnvironmentCompat.MEDIA_UNKNOWN, null);
        }
    }

    public /* synthetic */ ChargeStatus(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @JvmStatic
    @JsonCreator
    @NotNull
    public static final ChargeStatus creator(@Nullable String str) {
        return Companion.creator(str);
    }

    @NotNull
    public String getValue() {
        return this.value;
    }

    private ChargeStatus(String str) {
        this.value = str;
    }
}