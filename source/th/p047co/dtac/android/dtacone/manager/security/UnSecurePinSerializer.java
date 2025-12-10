package th.p047co.dtac.android.dtacone.manager.security;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

/* renamed from: th.co.dtac.android.dtacone.manager.security.UnSecurePinSerializer */
/* loaded from: classes7.dex */
public class UnSecurePinSerializer implements JsonSerializer<SecurePin> {
    @Override // com.google.gson.JsonSerializer
    public JsonElement serialize(SecurePin securePin, Type type, JsonSerializationContext jsonSerializationContext) {
        return new JsonPrimitive(securePin.getPin());
    }
}
