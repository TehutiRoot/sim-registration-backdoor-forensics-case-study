package th.p047co.dtac.android.dtacone.model.upPass;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0014"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/CommonOrderType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "toString", "ppRegister", "poRegister", "convergenceRegister", "ppChangeOwner", "poChangeOwner", "convergenceChangeOwner", "changeSim", "ppMnp", "poMnp", "prepaidToPostpaid", "mdidRegister", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upPass.CommonOrderType */
/* loaded from: classes8.dex */
public enum CommonOrderType {
    ppRegister("PP Register"),
    poRegister("PO Register"),
    convergenceRegister("Convergence Register"),
    ppChangeOwner("PP Change Owner"),
    poChangeOwner("PO Change Owner"),
    convergenceChangeOwner("Convergence Change Owner"),
    changeSim("Change SIM"),
    ppMnp("PP MNP"),
    poMnp("PO MNP"),
    prepaidToPostpaid("Prepaid to Postpaid"),
    mdidRegister("MDID Register");
    
    @NotNull
    public static final Companion Companion;
    @NotNull
    private static final String name;
    @NotNull
    private final String value;

    @Metadata(m29143d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/CommonOrderType$Companion;", "", "()V", "name", "", "getName", "()Ljava/lang/String;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.model.upPass.CommonOrderType$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getName() {
            return CommonOrderType.name;
        }

        private Companion() {
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        String simpleName = companion.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        name = simpleName;
    }

    CommonOrderType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.value;
    }
}