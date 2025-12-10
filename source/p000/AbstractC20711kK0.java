package p000;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import okio.CipherSink;
import okio.CipherSource;
import okio.FileSystem;
import okio.HashingSink;
import okio.HashingSource;
import okio.Okio;
import okio.Path;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import okio.internal.ResourceFileSystem;
import okio.internal.ZipKt;

/* renamed from: kK0 */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC20711kK0 {

    /* renamed from: a */
    public static final Logger f67890a = Logger.getLogger("okio.Okio");

    /* renamed from: b */
    public static final Sink m28955b(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return Okio.sink(new FileOutputStream(file, true));
    }

    /* renamed from: c */
    public static final FileSystem m28954c(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        return new ResourceFileSystem(classLoader, true);
    }

    /* renamed from: d */
    public static final CipherSink m28953d(Sink sink, Cipher cipher) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        return new CipherSink(Okio.buffer(sink), cipher);
    }

    /* renamed from: e */
    public static final CipherSource m28952e(Source source, Cipher cipher) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        return new CipherSource(Okio.buffer(source), cipher);
    }

    /* renamed from: f */
    public static final HashingSink m28951f(Sink sink, MessageDigest digest) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(digest, "digest");
        return new HashingSink(sink, digest);
    }

    /* renamed from: g */
    public static final HashingSink m28950g(Sink sink, Mac mac) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        Intrinsics.checkNotNullParameter(mac, "mac");
        return new HashingSink(sink, mac);
    }

    /* renamed from: h */
    public static final HashingSource m28949h(Source source, MessageDigest digest) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(digest, "digest");
        return new HashingSource(source, digest);
    }

    /* renamed from: i */
    public static final HashingSource m28948i(Source source, Mac mac) {
        Intrinsics.checkNotNullParameter(source, "<this>");
        Intrinsics.checkNotNullParameter(mac, "mac");
        return new HashingSource(source, mac);
    }

    /* renamed from: j */
    public static final boolean m28947j(AssertionError assertionError) {
        boolean z;
        Intrinsics.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() == null) {
            return false;
        }
        String message = assertionError.getMessage();
        if (message != null) {
            z = StringsKt__StringsKt.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null);
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static final FileSystem m28946k(FileSystem fileSystem, Path zipPath) {
        Intrinsics.checkNotNullParameter(fileSystem, "<this>");
        Intrinsics.checkNotNullParameter(zipPath, "zipPath");
        return ZipKt.openZip$default(zipPath, fileSystem, null, 4, null);
    }

    /* renamed from: l */
    public static final Sink m28945l(File file) {
        Sink m28940q;
        Intrinsics.checkNotNullParameter(file, "<this>");
        m28940q = m28940q(file, false, 1, null);
        return m28940q;
    }

    /* renamed from: m */
    public static final Sink m28944m(File file, boolean z) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return Okio.sink(new FileOutputStream(file, z));
    }

    /* renamed from: n */
    public static final Sink m28943n(OutputStream outputStream) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        return new C18048Mg1(outputStream, new Timeout());
    }

    /* renamed from: o */
    public static final Sink m28942o(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        C19680eK1 c19680eK1 = new C19680eK1(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream()");
        return c19680eK1.sink(new C18048Mg1(outputStream, c19680eK1));
    }

    /* renamed from: p */
    public static final Sink m28941p(java.nio.file.Path path, OpenOption... options) {
        OutputStream newOutputStream;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(newOutputStream, "newOutputStream(this, *options)");
        return Okio.sink(newOutputStream);
    }

    /* renamed from: q */
    public static /* synthetic */ Sink m28940q(File file, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return Okio.sink(file, z);
    }

    /* renamed from: r */
    public static final Source m28939r(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new C18361Re0(new FileInputStream(file), Timeout.NONE);
    }

    /* renamed from: s */
    public static final Source m28938s(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new C18361Re0(inputStream, new Timeout());
    }

    /* renamed from: t */
    public static final Source m28937t(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        C19680eK1 c19680eK1 = new C19680eK1(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream()");
        return c19680eK1.source(new C18361Re0(inputStream, c19680eK1));
    }

    /* renamed from: u */
    public static final Source m28936u(java.nio.file.Path path, OpenOption... options) {
        InputStream newInputStream;
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(options, options.length));
        Intrinsics.checkNotNullExpressionValue(newInputStream, "newInputStream(this, *options)");
        return Okio.source(newInputStream);
    }
}
