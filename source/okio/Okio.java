package okio;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"kK0", "lK0"}, m28850d2 = {}, m28849k = 4, m28848mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class Okio {
    @NotNull
    public static final Sink appendingSink(@NotNull File file) throws FileNotFoundException {
        return AbstractC20711kK0.m28955b(file);
    }

    @NotNull
    public static final FileSystem asResourceFileSystem(@NotNull ClassLoader classLoader) {
        return AbstractC20711kK0.m28954c(classLoader);
    }

    @JvmName(name = "blackhole")
    @NotNull
    public static final Sink blackhole() {
        return AbstractC20883lK0.m26487a();
    }

    @NotNull
    public static final BufferedSink buffer(@NotNull Sink sink) {
        return AbstractC20883lK0.m26486b(sink);
    }

    @NotNull
    public static final CipherSink cipherSink(@NotNull Sink sink, @NotNull Cipher cipher) {
        return AbstractC20711kK0.m28953d(sink, cipher);
    }

    @NotNull
    public static final CipherSource cipherSource(@NotNull Source source, @NotNull Cipher cipher) {
        return AbstractC20711kK0.m28952e(source, cipher);
    }

    @NotNull
    public static final HashingSink hashingSink(@NotNull Sink sink, @NotNull MessageDigest messageDigest) {
        return AbstractC20711kK0.m28951f(sink, messageDigest);
    }

    @NotNull
    public static final HashingSource hashingSource(@NotNull Source source, @NotNull MessageDigest messageDigest) {
        return AbstractC20711kK0.m28949h(source, messageDigest);
    }

    public static final boolean isAndroidGetsocknameError(@NotNull AssertionError assertionError) {
        return AbstractC20711kK0.m28947j(assertionError);
    }

    @NotNull
    public static final FileSystem openZip(@NotNull FileSystem fileSystem, @NotNull Path path) throws IOException {
        return AbstractC20711kK0.m28946k(fileSystem, path);
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file) throws FileNotFoundException {
        return AbstractC20711kK0.m28945l(file);
    }

    @NotNull
    public static final Source source(@NotNull File file) throws FileNotFoundException {
        return AbstractC20711kK0.m28939r(file);
    }

    public static final <T extends Closeable, R> R use(T t, @NotNull Function1<? super T, ? extends R> function1) {
        return (R) AbstractC20883lK0.m26484d(t, function1);
    }

    @NotNull
    public static final BufferedSource buffer(@NotNull Source source) {
        return AbstractC20883lK0.m26485c(source);
    }

    @NotNull
    public static final HashingSink hashingSink(@NotNull Sink sink, @NotNull Mac mac) {
        return AbstractC20711kK0.m28950g(sink, mac);
    }

    @NotNull
    public static final HashingSource hashingSource(@NotNull Source source, @NotNull Mac mac) {
        return AbstractC20711kK0.m28948i(source, mac);
    }

    @JvmOverloads
    @NotNull
    public static final Sink sink(@NotNull File file, boolean z) throws FileNotFoundException {
        return AbstractC20711kK0.m28944m(file, z);
    }

    @NotNull
    public static final Source source(@NotNull InputStream inputStream) {
        return AbstractC20711kK0.m28938s(inputStream);
    }

    @NotNull
    public static final Sink sink(@NotNull OutputStream outputStream) {
        return AbstractC20711kK0.m28943n(outputStream);
    }

    @NotNull
    public static final Source source(@NotNull Socket socket) throws IOException {
        return AbstractC20711kK0.m28937t(socket);
    }

    @NotNull
    public static final Sink sink(@NotNull Socket socket) throws IOException {
        return AbstractC20711kK0.m28942o(socket);
    }

    @IgnoreJRERequirement
    @NotNull
    public static final Source source(@NotNull java.nio.file.Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        return AbstractC20711kK0.m28936u(path, openOptionArr);
    }

    @IgnoreJRERequirement
    @NotNull
    public static final Sink sink(@NotNull java.nio.file.Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        return AbstractC20711kK0.m28941p(path, openOptionArr);
    }
}
