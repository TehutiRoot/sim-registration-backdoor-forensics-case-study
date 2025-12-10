package th.p047co.dtac.android.dtacone.manager.security;

import android.util.Base64;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import th.p047co.dtac.android.dtacone.data.cache.realm_rx2.RtrRx2Repository;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;

/* renamed from: th.co.dtac.android.dtacone.manager.security.SecurePinSerializer */
/* loaded from: classes7.dex */
public class SecurePinSerializer implements JsonSerializer<SecurePin> {

    /* renamed from: a */
    public RtrRx2Repository f84977a;

    /* renamed from: b */
    public PinEncryption f84978b;

    public SecurePinSerializer(RtrRx2Repository rtrRx2Repository, PinEncryption pinEncryption) {
        this.f84977a = rtrRx2Repository;
        this.f84978b = pinEncryption;
    }

    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(SecurePin securePin, Type type, JsonSerializationContext jsonSerializationContext) {
        if (StringUtil.hasText(securePin.getPin())) {
            try {
                return new JsonPrimitive(Base64.encodeToString(this.f84978b.encrypt(securePin.getPin(), this.f84977a.getSessionNow().getToken().getToken()), 2));
            } catch (Exception unused) {
            }
        }
        return JsonNull.INSTANCE;
    }
}
