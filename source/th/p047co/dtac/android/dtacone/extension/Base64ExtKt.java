package th.p047co.dtac.android.dtacone.extension;

import android.util.Base64;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.ByteArrayInputStream;
import java.net.URLConnection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0003"}, m28850d2 = {"getBase64Image", "", "getBase64Type", "app_prodRelease"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
@SourceDebugExtension({"SMAP\nBase64Ext.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64Ext.kt\nth/co/dtac/android/dtacone/extension/Base64ExtKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,37:1\n37#2,2:38\n*S KotlinDebug\n*F\n+ 1 Base64Ext.kt\nth/co/dtac/android/dtacone/extension/Base64ExtKt\n*L\n21#1:38,2\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.extension.Base64ExtKt */
/* loaded from: classes7.dex */
public final class Base64ExtKt {
    @NotNull
    public static final String getBase64Image(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            List split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
            return (String) split$default.get(split$default.size() - 1);
        } catch (Exception unused) {
            return str;
        }
    }

    @NotNull
    public static final String getBase64Type(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            List split$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
            String str2 = ((String[]) StringsKt__StringsKt.split$default((CharSequence) URLConnection.guessContentTypeFromStream(new ByteArrayInputStream(Base64.decode((String) split$default.get(split$default.size() - 1), 0))), new String[]{RemoteSettings.FORWARD_SLASH_STRING}, false, 0, 6, (Object) null).toArray(new String[0]))[1];
            return "data:image/" + str2 + ";base64,";
        } catch (Exception unused) {
            return "";
        }
    }
}
