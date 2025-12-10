package com.google.common.p014io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Ascii;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.collect.AbstractIterator;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import javax.annotation.CheckForNull;

@J2ktIncompatible
@GwtIncompatible
/* renamed from: com.google.common.io.CharSource */
/* loaded from: classes4.dex */
public abstract class CharSource {

    /* renamed from: com.google.common.io.CharSource$a */
    /* loaded from: classes4.dex */
    public final class C8094a extends ByteSource {

        /* renamed from: a */
        public final Charset f53942a;

        public C8094a(Charset charset) {
            this.f53942a = (Charset) Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.p014io.ByteSource
        public CharSource asCharSource(Charset charset) {
            if (charset.equals(this.f53942a)) {
                return CharSource.this;
            }
            return super.asCharSource(charset);
        }

        @Override // com.google.common.p014io.ByteSource
        public InputStream openStream() {
            return new C20456is1(CharSource.this.openStream(), this.f53942a, 8192);
        }

        public String toString() {
            return CharSource.this.toString() + ".asByteSource(" + this.f53942a + ")";
        }
    }

    /* renamed from: com.google.common.io.CharSource$b */
    /* loaded from: classes4.dex */
    public static class C8095b extends CharSource {

        /* renamed from: b */
        public static final Splitter f53944b = Splitter.onPattern("\r\n|\n|\r");

        /* renamed from: a */
        public final CharSequence f53945a;

        /* renamed from: com.google.common.io.CharSource$b$a */
        /* loaded from: classes4.dex */
        public class C8096a extends AbstractIterator {

            /* renamed from: c */
            public Iterator f53946c;

            public C8096a() {
                this.f53946c = C8095b.f53944b.split(C8095b.this.f53945a).iterator();
            }

            @Override // com.google.common.collect.AbstractIterator
            /* renamed from: b */
            public String computeNext() {
                if (this.f53946c.hasNext()) {
                    String str = (String) this.f53946c.next();
                    if (this.f53946c.hasNext() || !str.isEmpty()) {
                        return str;
                    }
                }
                return (String) endOfData();
            }
        }

        public C8095b(CharSequence charSequence) {
            this.f53945a = (CharSequence) Preconditions.checkNotNull(charSequence);
        }

        /* renamed from: c */
        public final Iterator m39997c() {
            return new C8096a();
        }

        @Override // com.google.common.p014io.CharSource
        public boolean isEmpty() {
            if (this.f53945a.length() == 0) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.p014io.CharSource
        public long length() {
            return this.f53945a.length();
        }

        @Override // com.google.common.p014io.CharSource
        public Optional lengthIfKnown() {
            return Optional.m41313of(Long.valueOf(this.f53945a.length()));
        }

        @Override // com.google.common.p014io.CharSource
        public Reader openStream() {
            return new C1634Wo(this.f53945a);
        }

        @Override // com.google.common.p014io.CharSource
        public String read() {
            return this.f53945a.toString();
        }

        @Override // com.google.common.p014io.CharSource
        public String readFirstLine() {
            Iterator m39997c = m39997c();
            if (m39997c.hasNext()) {
                return (String) m39997c.next();
            }
            return null;
        }

        @Override // com.google.common.p014io.CharSource
        public ImmutableList readLines() {
            return ImmutableList.copyOf(m39997c());
        }

        public String toString() {
            return "CharSource.wrap(" + Ascii.truncate(this.f53945a, 30, "...") + ")";
        }

        @Override // com.google.common.p014io.CharSource
        public Object readLines(LineProcessor lineProcessor) {
            Iterator m39997c = m39997c();
            while (m39997c.hasNext() && lineProcessor.processLine((String) m39997c.next())) {
            }
            return lineProcessor.getResult();
        }
    }

    /* renamed from: com.google.common.io.CharSource$c */
    /* loaded from: classes4.dex */
    public static final class C8097c extends CharSource {

        /* renamed from: a */
        public final Iterable f53948a;

        public C8097c(Iterable iterable) {
            this.f53948a = (Iterable) Preconditions.checkNotNull(iterable);
        }

        @Override // com.google.common.p014io.CharSource
        public boolean isEmpty() {
            for (CharSource charSource : this.f53948a) {
                if (!charSource.isEmpty()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.p014io.CharSource
        public long length() {
            long j = 0;
            for (CharSource charSource : this.f53948a) {
                j += charSource.length();
            }
            return j;
        }

        @Override // com.google.common.p014io.CharSource
        public Optional lengthIfKnown() {
            long j = 0;
            for (CharSource charSource : this.f53948a) {
                Optional<Long> lengthIfKnown = charSource.lengthIfKnown();
                if (!lengthIfKnown.isPresent()) {
                    return Optional.absent();
                }
                j += lengthIfKnown.get().longValue();
            }
            return Optional.m41313of(Long.valueOf(j));
        }

        @Override // com.google.common.p014io.CharSource
        public Reader openStream() {
            return new C20871lG0(this.f53948a.iterator());
        }

        public String toString() {
            return "CharSource.concat(" + this.f53948a + ")";
        }
    }

    /* renamed from: com.google.common.io.CharSource$d */
    /* loaded from: classes4.dex */
    public static final class C8098d extends C8099e {

        /* renamed from: c */
        public static final C8098d f53949c = new C8098d();

        public C8098d() {
            super("");
        }

        @Override // com.google.common.p014io.CharSource.C8095b
        public String toString() {
            return "CharSource.empty()";
        }
    }

    public static CharSource concat(Iterable<? extends CharSource> iterable) {
        return new C8097c(iterable);
    }

    public static CharSource empty() {
        return C8098d.f53949c;
    }

    public static CharSource wrap(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return new C8099e((String) charSequence);
        }
        return new C8095b(charSequence);
    }

    /* renamed from: a */
    public final long m39999a(Reader reader) {
        long j = 0;
        while (true) {
            long skip = reader.skip(Long.MAX_VALUE);
            if (skip != 0) {
                j += skip;
            } else {
                return j;
            }
        }
    }

    public ByteSource asByteSource(Charset charset) {
        return new C8094a(charset);
    }

    @CanIgnoreReturnValue
    public long copyTo(Appendable appendable) throws IOException {
        Preconditions.checkNotNull(appendable);
        try {
            return CharStreams.copy((Reader) Closer.create().register(openStream()), appendable);
        } finally {
        }
    }

    public boolean isEmpty() throws IOException {
        Optional<Long> lengthIfKnown = lengthIfKnown();
        boolean z = false;
        if (lengthIfKnown.isPresent()) {
            if (lengthIfKnown.get().longValue() != 0) {
                return false;
            }
            return true;
        }
        Closer create = Closer.create();
        try {
            if (((Reader) create.register(openStream())).read() == -1) {
                z = true;
            }
            return z;
        } catch (Throwable th2) {
            try {
                throw create.rethrow(th2);
            } finally {
                create.close();
            }
        }
    }

    public long length() throws IOException {
        Optional<Long> lengthIfKnown = lengthIfKnown();
        if (lengthIfKnown.isPresent()) {
            return lengthIfKnown.get().longValue();
        }
        try {
            return m39999a((Reader) Closer.create().register(openStream()));
        } finally {
        }
    }

    public Optional<Long> lengthIfKnown() {
        return Optional.absent();
    }

    public BufferedReader openBufferedStream() throws IOException {
        Reader openStream = openStream();
        if (openStream instanceof BufferedReader) {
            return (BufferedReader) openStream;
        }
        return new BufferedReader(openStream);
    }

    public abstract Reader openStream() throws IOException;

    public String read() throws IOException {
        try {
            return CharStreams.toString((Reader) Closer.create().register(openStream()));
        } finally {
        }
    }

    @CheckForNull
    public String readFirstLine() throws IOException {
        try {
            return ((BufferedReader) Closer.create().register(openBufferedStream())).readLine();
        } finally {
        }
    }

    public ImmutableList<String> readLines() throws IOException {
        try {
            BufferedReader bufferedReader = (BufferedReader) Closer.create().register(openBufferedStream());
            ArrayList newArrayList = Lists.newArrayList();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    newArrayList.add(readLine);
                } else {
                    return ImmutableList.copyOf((Collection) newArrayList);
                }
            }
        } finally {
        }
    }

    /* renamed from: com.google.common.io.CharSource$e */
    /* loaded from: classes4.dex */
    public static class C8099e extends C8095b {
        public C8099e(String str) {
            super(str);
        }

        @Override // com.google.common.p014io.CharSource
        public long copyTo(Appendable appendable) {
            appendable.append(this.f53945a);
            return this.f53945a.length();
        }

        @Override // com.google.common.p014io.CharSource.C8095b, com.google.common.p014io.CharSource
        public Reader openStream() {
            return new StringReader((String) this.f53945a);
        }

        @Override // com.google.common.p014io.CharSource
        public long copyTo(CharSink charSink) {
            Closer create;
            Preconditions.checkNotNull(charSink);
            try {
                ((Writer) Closer.create().register(charSink.openStream())).write((String) this.f53945a);
                return this.f53945a.length();
            } finally {
            }
        }
    }

    public static CharSource concat(Iterator<? extends CharSource> it) {
        return concat(ImmutableList.copyOf(it));
    }

    public static CharSource concat(CharSource... charSourceArr) {
        return concat(ImmutableList.copyOf(charSourceArr));
    }

    @CanIgnoreReturnValue
    public long copyTo(CharSink charSink) throws IOException {
        Preconditions.checkNotNull(charSink);
        Closer create = Closer.create();
        try {
            return CharStreams.copy((Reader) create.register(openStream()), (Writer) create.register(charSink.openStream()));
        } finally {
        }
    }

    @CanIgnoreReturnValue
    public <T> T readLines(LineProcessor<T> lineProcessor) throws IOException {
        Preconditions.checkNotNull(lineProcessor);
        try {
            return (T) CharStreams.readLines((Reader) Closer.create().register(openStream()), lineProcessor);
        } finally {
        }
    }
}
