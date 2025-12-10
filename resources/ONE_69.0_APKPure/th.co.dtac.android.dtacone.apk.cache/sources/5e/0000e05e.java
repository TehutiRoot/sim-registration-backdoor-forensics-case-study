package kotlin.reflect.jvm.internal.impl.name;

import com.google.firebase.sessions.settings.RemoteSettings;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class CallableId {

    /* renamed from: e */
    public static final C11875a f69619e = new C11875a(null);

    /* renamed from: f */
    public static final Name f69620f;

    /* renamed from: g */
    public static final FqName f69621g;

    /* renamed from: a */
    public final FqName f69622a;

    /* renamed from: b */
    public final FqName f69623b;

    /* renamed from: c */
    public final Name f69624c;

    /* renamed from: d */
    public final FqName f69625d;

    /* renamed from: kotlin.reflect.jvm.internal.impl.name.CallableId$a */
    /* loaded from: classes6.dex */
    public static final class C11875a {
        public /* synthetic */ C11875a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C11875a() {
        }
    }

    static {
        Name name = SpecialNames.LOCAL;
        f69620f = name;
        FqName fqName = FqName.topLevel(name);
        Intrinsics.checkNotNullExpressionValue(fqName, "topLevel(LOCAL_NAME)");
        f69621g = fqName;
    }

    public CallableId(@NotNull FqName packageName, @Nullable FqName fqName, @NotNull Name callableName, @Nullable FqName fqName2) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
        this.f69622a = packageName;
        this.f69623b = fqName;
        this.f69624c = callableName;
        this.f69625d = fqName2;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CallableId) {
            CallableId callableId = (CallableId) obj;
            return Intrinsics.areEqual(this.f69622a, callableId.f69622a) && Intrinsics.areEqual(this.f69623b, callableId.f69623b) && Intrinsics.areEqual(this.f69624c, callableId.f69624c) && Intrinsics.areEqual(this.f69625d, callableId.f69625d);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f69622a.hashCode() * 31;
        FqName fqName = this.f69623b;
        int hashCode2 = (((hashCode + (fqName == null ? 0 : fqName.hashCode())) * 31) + this.f69624c.hashCode()) * 31;
        FqName fqName2 = this.f69625d;
        return hashCode2 + (fqName2 != null ? fqName2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String asString = this.f69622a.asString();
        Intrinsics.checkNotNullExpressionValue(asString, "packageName.asString()");
        sb.append(AbstractC19741eO1.replace$default(asString, '.', '/', false, 4, (Object) null));
        sb.append(RemoteSettings.FORWARD_SLASH_STRING);
        FqName fqName = this.f69623b;
        if (fqName != null) {
            sb.append(fqName);
            sb.append(".");
        }
        sb.append(this.f69624c);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public /* synthetic */ CallableId(FqName fqName, FqName fqName2, Name name, FqName fqName3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(fqName, fqName2, name, (i & 8) != 0 ? null : fqName3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CallableId(@NotNull FqName packageName, @NotNull Name callableName) {
        this(packageName, null, callableName, null, 8, null);
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(callableName, "callableName");
    }
}