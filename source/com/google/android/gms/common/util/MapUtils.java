package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

@KeepForSdk
/* loaded from: classes3.dex */
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(@NonNull StringBuilder sb, @NonNull HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(",");
            }
            String str2 = hashMap.get(str);
            sb.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                sb.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
                sb.append(str2);
                sb.append(OperatorName.SHOW_TEXT_LINE_AND_SPACE);
            }
            z = false;
        }
        sb.append("}");
    }
}
