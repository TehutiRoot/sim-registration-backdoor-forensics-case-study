package co.omise.android;

import ch.qos.logback.core.joran.action.Action;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, m28850d2 = {"Lco/omise/android/EncryptionUtils;", "", "()V", "aesDecrypt", "", "ciphertext", Action.KEY_ATTRIBUTE, "hash512", "data", "", "sdk_productionRelease"}, m28849k = 1, m28848mv = {1, 7, 1}, m28846xi = 48)
/* loaded from: classes2.dex */
public final class EncryptionUtils {
    @NotNull
    public static final EncryptionUtils INSTANCE = new EncryptionUtils();

    private EncryptionUtils() {
    }

    @NotNull
    public final byte[] aesDecrypt(@NotNull byte[] ciphertext, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(ciphertext, "ciphertext");
        Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
        cipher.init(2, new SecretKeySpec(bArr, "AES"), new IvParameterSpec(ArraysKt___ArraysJvmKt.copyOfRange(ciphertext, 0, 16)));
        byte[] doFinal = cipher.doFinal(ArraysKt___ArraysJvmKt.copyOfRange(ciphertext, 16, ciphertext.length));
        Intrinsics.checkNotNullExpressionValue(doFinal, "cipher.doFinal(ciphertex…nge(16, ciphertext.size))");
        return doFinal;
    }

    @NotNull
    public final byte[] hash512(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
        byte[] bytes = data.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "hasher.digest(data.toByteArray(Charsets.UTF_8))");
        return digest;
    }
}
