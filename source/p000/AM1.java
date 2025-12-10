package p000;

import java.io.InputStream;
import java.io.OutputStream;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p023io.encoding.Base64;
import kotlin.p023io.encoding.C11709a;
import kotlin.p023io.encoding.ExperimentalEncodingApi;
import org.jetbrains.annotations.NotNull;

/* renamed from: AM1 */
/* loaded from: classes5.dex */
public abstract class AM1 {
    @ExperimentalEncodingApi
    @SinceKotlin(version = "1.8")
    @NotNull
    public static final InputStream decodingWith(@NotNull InputStream inputStream, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(base64, "base64");
        return new C10211fE(inputStream, base64);
    }

    @ExperimentalEncodingApi
    @SinceKotlin(version = "1.8")
    @NotNull
    public static final OutputStream encodingWith(@NotNull OutputStream outputStream, @NotNull Base64 base64) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(base64, "base64");
        return new C11709a(outputStream, base64);
    }
}
