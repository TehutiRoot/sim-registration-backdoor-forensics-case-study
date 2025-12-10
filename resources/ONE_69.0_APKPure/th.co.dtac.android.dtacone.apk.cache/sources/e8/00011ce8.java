package th.p047co.dtac.android.dtacone.model.buy_dol;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\t"}, m29142d2 = {"Lth/co/dtac/android/dtacone/model/buy_dol/TokenCountRequest;", "", "tokenFee", "", "tokenSaveCard", "(ZZ)V", "getTokenFee", "()Z", "getTokenSaveCard", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.model.buy_dol.TokenCountRequest */
/* loaded from: classes8.dex */
public final class TokenCountRequest {
    public static final int $stable = 0;
    private final boolean tokenFee;
    private final boolean tokenSaveCard;

    public TokenCountRequest() {
        this(false, false, 3, null);
    }

    public final boolean getTokenFee() {
        return this.tokenFee;
    }

    public final boolean getTokenSaveCard() {
        return this.tokenSaveCard;
    }

    public TokenCountRequest(boolean z, boolean z2) {
        this.tokenFee = z;
        this.tokenSaveCard = z2;
    }

    public /* synthetic */ TokenCountRequest(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}