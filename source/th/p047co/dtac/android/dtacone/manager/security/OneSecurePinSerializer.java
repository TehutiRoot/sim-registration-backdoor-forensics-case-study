package th.p047co.dtac.android.dtacone.manager.security;

import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.util.AESCryptUtil;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J-\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, m28850d2 = {"Lth/co/dtac/android/dtacone/manager/security/OneSecurePinSerializer;", "Lcom/google/gson/JsonSerializer;", "Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "repository", "<init>", "(Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;)V", "src", "Ljava/lang/reflect/Type;", "typeOfSrc", "Lcom/google/gson/JsonSerializationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lcom/google/gson/JsonElement;", "serialize", "(Lth/co/dtac/android/dtacone/manager/security/OneSecurePin;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement;", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "()Ljava/lang/String;", "Lth/co/dtac/android/dtacone/data/cache/realm_rx2/RtrRx2Repository;", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOneSecurePinSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneSecurePinSerializer.kt\nth/co/dtac/android/dtacone/manager/security/OneSecurePinSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,33:1\n1#2:34\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.manager.security.OneSecurePinSerializer */
/* loaded from: classes7.dex */
public final class OneSecurePinSerializer implements JsonSerializer<OneSecurePin> {
    public static final int $stable = 8;

    /* renamed from: a */
    public RtrRx2Repository f84973a;

    public OneSecurePinSerializer(@NotNull RtrRx2Repository repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f84973a = repository;
    }

    /* renamed from: a */
    public final String m19247a() {
        String str = this.f84973a.getMobileConfigNow().get("dataPrivacy.encryption.aes256cbc.key");
        if (str == null) {
            str = "QD3jnECG3TFl3jOmIhLJMiqX2WAABxKx";
        }
        return str;
    }

    @Override // com.google.gson.JsonSerializer
    @Nullable
    public JsonElement serialize(@NotNull OneSecurePin src, @Nullable Type type, @Nullable JsonSerializationContext jsonSerializationContext) {
        Intrinsics.checkNotNullParameter(src, "src");
        if (StringUtil.hasText(src.getPin())) {
            try {
                return new JsonPrimitive(AESCryptUtil.encryptCBC(src.getPin(), m19247a()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return JsonNull.INSTANCE;
    }
}
