package th.p047co.dtac.android.dtacone.util.p052enum;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/enum/PackageType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "MainPackage", "AddtionalPackage", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.util.enum.PackageType */
/* loaded from: classes8.dex */
public enum PackageType {
    MainPackage("MAIN"),
    AddtionalPackage("ADDITIONAL");
    
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String type;

    @Metadata(m29143d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/enum/PackageType$Companion;", "", "()V", "fromValue", "Lth/co/dtac/android/dtacone/util/enum/PackageType;", "value", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.util.enum.PackageType$Companion */
    /* loaded from: classes8.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PackageType fromValue(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            String upperCase = value.toUpperCase();
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            if (Intrinsics.areEqual(upperCase, "MAIN")) {
                return PackageType.MainPackage;
            }
            if (Intrinsics.areEqual(upperCase, "ADDITIONAL")) {
                return PackageType.AddtionalPackage;
            }
            return PackageType.MainPackage;
        }

        public Companion() {
        }
    }

    PackageType(String str) {
        this.type = str;
    }

    @NotNull
    public final String getType() {
        return this.type;
    }
}