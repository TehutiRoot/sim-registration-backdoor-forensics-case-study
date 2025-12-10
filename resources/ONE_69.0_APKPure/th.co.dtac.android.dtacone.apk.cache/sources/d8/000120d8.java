package th.p047co.dtac.android.dtacone.model.upPass;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.util.Constant;

@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/upPass/UpPassFormOwnerType;", "", "typeKey", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeKey", "()Ljava/lang/String;", "Owner", "Attorney", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.upPass.UpPassFormOwnerType */
/* loaded from: classes8.dex */
public enum UpPassFormOwnerType {
    Owner(Constant.REGISTER_LEVEL_OWNER),
    Attorney("attorney");
    
    @NotNull
    private final String typeKey;

    UpPassFormOwnerType(String str) {
        this.typeKey = str;
    }

    @NotNull
    public final String getTypeKey() {
        return this.typeKey;
    }
}