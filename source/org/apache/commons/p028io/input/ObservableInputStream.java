package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.p028io.IOUtils;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOIntConsumer;
import org.apache.commons.p028io.input.ObservableInputStream;
import org.apache.commons.p028io.input.ProxyInputStream;

/* renamed from: org.apache.commons.io.input.ObservableInputStream */
/* loaded from: classes6.dex */
public class ObservableInputStream extends ProxyInputStream {

    /* renamed from: d */
    public final List f73398d;

    /* renamed from: org.apache.commons.io.input.ObservableInputStream$AbstractBuilder */
    /* loaded from: classes6.dex */
    public static abstract class AbstractBuilder<T extends AbstractBuilder<T>> extends ProxyInputStream.AbstractBuilder<ObservableInputStream, T> {

        /* renamed from: l */
        public List f73399l;

        @Override // org.apache.commons.p028io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ IOIntConsumer getAfterRead() {
            return super.getAfterRead();
        }

        @Override // org.apache.commons.p028io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ AbstractStreamBuilder setAfterRead(IOIntConsumer iOIntConsumer) {
            return super.setAfterRead(iOIntConsumer);
        }

        public void setObservers(List<Observer> list) {
            this.f73399l = list;
        }
    }

    /* renamed from: org.apache.commons.io.input.ObservableInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractBuilder<Builder> {
        @Override // org.apache.commons.p028io.function.IOSupplier
        public ObservableInputStream get() throws IOException {
            return new ObservableInputStream(this);
        }
    }

    /* renamed from: org.apache.commons.io.input.ObservableInputStream$Observer */
    /* loaded from: classes6.dex */
    public static abstract class Observer {
        public void closed() throws IOException {
        }

        public void data(int i) throws IOException {
        }

        public void finished() throws IOException {
        }

        public void data(byte[] bArr, int i, int i2) throws IOException {
        }

        public void error(IOException iOException) throws IOException {
            throw iOException;
        }
    }

    public ObservableInputStream(AbstractBuilder abstractBuilder) {
        super(abstractBuilder);
        this.f73398d = abstractBuilder.f73399l;
    }

    /* renamed from: d */
    public static /* synthetic */ void m25101d(int i, Observer observer) {
        observer.data(i);
    }

    /* renamed from: g */
    public static /* synthetic */ void m25100g(IOException iOException, Observer observer) {
        observer.error(iOException);
    }

    /* renamed from: i */
    public static /* synthetic */ void m25099i(byte[] bArr, int i, int i2, Observer observer) {
        observer.data(bArr, i, i2);
    }

    public void add(Observer observer) {
        this.f73398d.add(observer);
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            super.close();
            e = null;
        } catch (IOException e) {
            e = e;
        }
        if (e == null) {
            noteClosed();
        } else {
            noteError(e);
        }
    }

    public void consume() throws IOException {
        IOUtils.consume(this);
    }

    public List<Observer> getObservers() {
        return new ArrayList(this.f73398d);
    }

    /* renamed from: j */
    public final void m25098j(IOConsumer iOConsumer) {
        Q90.m66650e(iOConsumer, this.f73398d);
    }

    /* renamed from: n */
    public final void m25094n(byte[] bArr, int i, int i2, IOException iOException) {
        if (iOException == null) {
            if (i2 == -1) {
                noteFinished();
                return;
            } else if (i2 > 0) {
                noteDataBytes(bArr, i, i2);
                return;
            } else {
                return;
            }
        }
        noteError(iOException);
        throw iOException;
    }

    public void noteClosed() throws IOException {
        m25098j(new IOConsumer() { // from class: ZJ0
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ((ObservableInputStream.Observer) obj).closed();
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

    public void noteDataByte(final int i) throws IOException {
        m25098j(new IOConsumer() { // from class: XJ0
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ObservableInputStream.m25101d(i, (ObservableInputStream.Observer) obj);
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

    public void noteDataBytes(final byte[] bArr, final int i, final int i2) throws IOException {
        m25098j(new IOConsumer() { // from class: aK0
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ObservableInputStream.m25099i(bArr, i, i2, (ObservableInputStream.Observer) obj);
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

    public void noteError(final IOException iOException) throws IOException {
        m25098j(new IOConsumer() { // from class: bK0
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ObservableInputStream.m25100g(iOException, (ObservableInputStream.Observer) obj);
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

    public void noteFinished() throws IOException {
        m25098j(new IOConsumer() { // from class: YJ0
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                ((ObservableInputStream.Observer) obj).finished();
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

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i;
        try {
            i = super.read();
            e = null;
        } catch (IOException e) {
            e = e;
            i = 0;
        }
        if (e != null) {
            noteError(e);
            throw e;
        }
        if (i == -1) {
            noteFinished();
        } else {
            noteDataByte(i);
        }
        return i;
    }

    public void remove(Observer observer) {
        this.f73398d.remove(observer);
    }

    public void removeAllObservers() {
        this.f73398d.clear();
    }

    public ObservableInputStream(InputStream inputStream) {
        this(inputStream, new ArrayList());
    }

    public ObservableInputStream(InputStream inputStream, List list) {
        super(inputStream);
        this.f73398d = list;
    }

    public ObservableInputStream(InputStream inputStream, Observer... observerArr) {
        this(inputStream, Arrays.asList(observerArr));
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i;
        try {
            i = super.read(bArr);
            e = null;
        } catch (IOException e) {
            e = e;
            i = 0;
        }
        m25094n(bArr, 0, i, e);
        return i;
    }

    @Override // org.apache.commons.p028io.input.ProxyInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        try {
            i3 = super.read(bArr, i, i2);
            e = null;
        } catch (IOException e) {
            e = e;
            i3 = 0;
        }
        m25094n(bArr, i, i3, e);
        return i3;
    }
}
