package p000;

import android.net.Uri;
import co.omise.android.AuthorizingPaymentURLVerifier;
import co.omise.android.api.Client;
import co.omise.android.models.NetceteraConfig;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.netcetera.threeds.sdk.api.exceptions.InvalidInputException;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m29142d2 = {"LThreeDSConfigProvider;", "", "", "authUrl", "createThreeDSConfigUrl", "Lco/omise/android/models/NetceteraConfig;", "getThreeDSConfigs", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lco/omise/android/AuthorizingPaymentURLVerifier;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lco/omise/android/AuthorizingPaymentURLVerifier;", "urlVerifier", "Lco/omise/android/api/Client;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Lco/omise/android/api/Client;", "client", "<init>", "(Lco/omise/android/AuthorizingPaymentURLVerifier;Lco/omise/android/api/Client;)V", "sdk_productionRelease"}, m29141k = 1, m29140mv = {1, 7, 1})
/* renamed from: ThreeDSConfigProvider */
/* loaded from: classes10.dex */
public final class ThreeDSConfigProvider {

    /* renamed from: a */
    public final AuthorizingPaymentURLVerifier f6399a;

    /* renamed from: b */
    public final Client f6400b;

    public ThreeDSConfigProvider(@NotNull AuthorizingPaymentURLVerifier urlVerifier, @NotNull Client client) {
        Intrinsics.checkNotNullParameter(urlVerifier, "urlVerifier");
        Intrinsics.checkNotNullParameter(client, "client");
        this.f6399a = urlVerifier;
        this.f6400b = client;
    }

    @NotNull
    public final String createThreeDSConfigUrl(@NotNull String authUrl) {
        Intrinsics.checkNotNullParameter(authUrl, "authUrl");
        try {
            new URL(authUrl);
            String uri = Uri.parse(authUrl).buildUpon().clearQuery().build().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "base.toString()");
            List mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) StringsKt__StringsKt.split$default((CharSequence) uri, new char[]{'/'}, false, 0, 6, (Object) null));
            mutableList.set(CollectionsKt__CollectionsKt.getLastIndex(mutableList), "config");
            String joinToString$default = CollectionsKt___CollectionsKt.joinToString$default(mutableList, RemoteSettings.FORWARD_SLASH_STRING, null, null, 0, null, null, 62, null);
            new URL(joinToString$default);
            return joinToString$default;
        } catch (Exception e) {
            throw new InvalidInputException("Invalid URL: " + authUrl, e);
        }
    }

    @Nullable
    public final Object getThreeDSConfigs(@NotNull Continuation<? super NetceteraConfig> continuation) {
        return this.f6400b.send(new NetceteraConfig.NetceteraConfigRequestBuilder().configUrl(createThreeDSConfigUrl(this.f6399a.getAuthorizedURLString())).build(), continuation);
    }
}