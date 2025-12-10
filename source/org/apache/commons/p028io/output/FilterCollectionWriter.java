package org.apache.commons.p028io.output;

import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.apache.commons.p028io.function.IOConsumer;

/* renamed from: org.apache.commons.io.output.FilterCollectionWriter */
/* loaded from: classes6.dex */
public class FilterCollectionWriter extends Writer {
    protected final Collection<Writer> EMPTY_WRITERS;
    protected final Collection<Writer> writers;

    public FilterCollectionWriter(Collection<Writer> collection) {
        List emptyList = Collections.emptyList();
        this.EMPTY_WRITERS = emptyList;
        this.writers = collection == null ? emptyList : collection;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m24927n(new IOConsumer() { // from class: J00
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ((Writer) obj).close();
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        });
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        m24927n(new IOConsumer() { // from class: O00
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ((Writer) obj).flush();
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        });
    }

    /* renamed from: n */
    public final FilterCollectionWriter m24927n(IOConsumer iOConsumer) {
        Q90.m66649f(iOConsumer, m24918w());
        return this;
    }

    /* renamed from: w */
    public final Stream m24918w() {
        Stream stream;
        Stream filter;
        stream = this.writers.stream();
        filter = stream.filter(new Predicate() { // from class: I00
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return G00.m68320a((Writer) obj);
            }
        });
        return filter;
    }

    @Override // java.io.Writer
    public void write(final char[] cArr) throws IOException {
        m24927n(new IOConsumer() { // from class: M00
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ((Writer) obj).write(cArr);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        });
    }

    @Override // java.io.Writer
    public void write(final char[] cArr, final int i, final int i2) throws IOException {
        m24927n(new IOConsumer() { // from class: N00
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ((Writer) obj).write(cArr, i, i2);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        });
    }

    @Override // java.io.Writer
    public void write(final int i) throws IOException {
        m24927n(new IOConsumer() { // from class: Q00
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ((Writer) obj).write(i);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        });
    }

    public FilterCollectionWriter(Writer... writerArr) {
        List emptyList = Collections.emptyList();
        this.EMPTY_WRITERS = emptyList;
        this.writers = writerArr != null ? Arrays.asList(writerArr) : emptyList;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(final char c) throws IOException {
        return m24927n(new IOConsumer() { // from class: R00
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ((Writer) obj).append(c);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        });
    }

    @Override // java.io.Writer
    public void write(final String str) throws IOException {
        m24927n(new IOConsumer() { // from class: K00
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ((Writer) obj).write(str);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        });
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(final CharSequence charSequence) throws IOException {
        return m24927n(new IOConsumer() { // from class: L00
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ((Writer) obj).append(charSequence);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        });
    }

    @Override // java.io.Writer
    public void write(final String str, final int i, final int i2) throws IOException {
        m24927n(new IOConsumer() { // from class: P00
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ((Writer) obj).write(str, i, i2);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        });
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(final CharSequence charSequence, final int i, final int i2) throws IOException {
        return m24927n(new IOConsumer() { // from class: H00
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ((Writer) obj).append(charSequence, i, i2);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        });
    }
}
