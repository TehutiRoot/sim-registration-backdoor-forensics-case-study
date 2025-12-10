package th.p047co.dtac.android.dtacone.configuration;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/EndpointDecision;", "", "()V", "Companion", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
/* renamed from: th.co.dtac.android.dtacone.configuration.EndpointDecision */
/* loaded from: classes7.dex */
public final class EndpointDecision {
    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = new Companion(null);

    @Metadata(m28851d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\u0007"}, m28850d2 = {"Lth/co/dtac/android/dtacone/configuration/EndpointDecision$Companion;", "", "()V", "getApiFlow", "", "flow", "getApiFlowBlacklist", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.configuration.EndpointDecision$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final String getApiFlow(@NotNull String flow) {
            String str;
            Intrinsics.checkNotNullParameter(flow, "flow");
            switch (flow.hashCode()) {
                case -1308948058:
                    if (!flow.equals(Constant.withDevicePathFlow.WITH_DEVICE_PRE2POST)) {
                        return "postpaid-registration";
                    }
                    return "postpaid-registration/pre2post";
                case -1146441138:
                    if (!flow.equals(Constant.withDevicePathFlow.WITH_DEVICE_SALE_ORDER)) {
                        return "postpaid-registration";
                    }
                    return "postpaid-registration/saleorder";
                case -945135620:
                    str = Constant.withDevicePathFlow.BLACKLIST_WITH_DEVICE_POSTPAID;
                    break;
                case 220572369:
                    str = Constant.withDevicePathFlow.WITH_DEVICE_DTAC_AT_HOME;
                    break;
                default:
                    return "postpaid-registration";
            }
            flow.equals(str);
            return "postpaid-registration";
        }

        @JvmStatic
        @NotNull
        public final String getApiFlowBlacklist(@NotNull String flow) {
            String str;
            Intrinsics.checkNotNullParameter(flow, "flow");
            switch (flow.hashCode()) {
                case -1308948058:
                    if (!flow.equals(Constant.withDevicePathFlow.WITH_DEVICE_PRE2POST)) {
                        return "postpaid-registration/blacklist";
                    }
                    return "postpaid-registration/pre2post";
                case -1146441138:
                    if (!flow.equals(Constant.withDevicePathFlow.WITH_DEVICE_SALE_ORDER)) {
                        return "postpaid-registration/blacklist";
                    }
                    return "postpaid-registration/saleorder";
                case -945135620:
                    str = Constant.withDevicePathFlow.BLACKLIST_WITH_DEVICE_POSTPAID;
                    break;
                case 220572369:
                    str = Constant.withDevicePathFlow.WITH_DEVICE_DTAC_AT_HOME;
                    break;
                default:
                    return "postpaid-registration/blacklist";
            }
            flow.equals(str);
            return "postpaid-registration/blacklist";
        }

        public Companion() {
        }
    }

    @JvmStatic
    @NotNull
    public static final String getApiFlow(@NotNull String str) {
        return Companion.getApiFlow(str);
    }

    @JvmStatic
    @NotNull
    public static final String getApiFlowBlacklist(@NotNull String str) {
        return Companion.getApiFlowBlacklist(str);
    }
}
