package com.google.common.p014io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

@J2ktIncompatible
@GwtIncompatible
/* renamed from: com.google.common.io.Resources */
/* loaded from: classes4.dex */
public final class Resources {

    /* renamed from: com.google.common.io.Resources$a */
    /* loaded from: classes4.dex */
    public class C8101a implements LineProcessor {

        /* renamed from: a */
        public final List f53993a = Lists.newArrayList();

        @Override // com.google.common.p014io.LineProcessor
        /* renamed from: a */
        public List getResult() {
            return this.f53993a;
        }

        @Override // com.google.common.p014io.LineProcessor
        public boolean processLine(String str) {
            this.f53993a.add(str);
            return true;
        }
    }

    /* renamed from: com.google.common.io.Resources$b */
    /* loaded from: classes4.dex */
    public static final class C8102b extends ByteSource {

        /* renamed from: a */
        public final URL f53994a;

        public /* synthetic */ C8102b(URL url, C8101a c8101a) {
            this(url);
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openStream() {
            return this.f53994a.openStream();
        }

        public String toString() {
            return "Resources.asByteSource(" + this.f53994a + ")";
        }

        public C8102b(URL url) {
            this.f53994a = (URL) Preconditions.checkNotNull(url);
        }
    }

    public static ByteSource asByteSource(URL url) {
        return new C8102b(url, null);
    }

    public static CharSource asCharSource(URL url, Charset charset) {
        return asByteSource(url).asCharSource(charset);
    }

    public static void copy(URL url, OutputStream outputStream) throws IOException {
        asByteSource(url).copyTo(outputStream);
    }

    @CanIgnoreReturnValue
    public static URL getResource(String str) {
        URL resource = ((ClassLoader) MoreObjects.firstNonNull(Thread.currentThread().getContextClassLoader(), Resources.class.getClassLoader())).getResource(str);
        Preconditions.checkArgument(resource != null, "resource %s not found.", str);
        return resource;
    }

    @CanIgnoreReturnValue
    public static <T> T readLines(URL url, Charset charset, LineProcessor<T> lineProcessor) throws IOException {
        return (T) asCharSource(url, charset).readLines(lineProcessor);
    }

    public static byte[] toByteArray(URL url) throws IOException {
        return asByteSource(url).read();
    }

    public static String toString(URL url, Charset charset) throws IOException {
        return asCharSource(url, charset).read();
    }

    public static List<String> readLines(URL url, Charset charset) throws IOException {
        return (List) readLines(url, charset, new C8101a());
    }

    @CanIgnoreReturnValue
    public static URL getResource(Class<?> cls, String str) {
        URL resource = cls.getResource(str);
        Preconditions.checkArgument(resource != null, "resource %s relative to %s not found.", str, cls.getName());
        return resource;
    }
}