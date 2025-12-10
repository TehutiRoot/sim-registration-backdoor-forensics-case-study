package org.apache.commons.p028io.output;

import java.io.FilterWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Supplier;
import org.apache.commons.p028io.build.AbstractStreamBuilder;
import org.apache.commons.p028io.function.IOConsumer;
import org.apache.commons.p028io.function.IOFunction;
import org.apache.commons.p028io.function.IOIntConsumer;
import org.apache.commons.p028io.function.IORunnable;
import org.apache.commons.p028io.function.IOSupplier;
import org.apache.commons.p028io.function.IOTriConsumer;
import org.apache.commons.p028io.function.IOTriFunction;
import org.apache.commons.p028io.function.Uncheck;
import org.apache.commons.p028io.output.UncheckedFilterWriter;

/* renamed from: org.apache.commons.io.output.UncheckedFilterWriter */
/* loaded from: classes6.dex */
public final class UncheckedFilterWriter extends FilterWriter {

    /* renamed from: org.apache.commons.io.output.UncheckedFilterWriter$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<UncheckedFilterWriter, Builder> {
        @Override // org.apache.commons.p028io.function.IOSupplier
        public UncheckedFilterWriter get() throws IOException {
            return new UncheckedFilterWriter(getWriter());
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m24902b(UncheckedFilterWriter uncheckedFilterWriter, String str) {
        uncheckedFilterWriter.m24884x(str);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: d */
    public static /* synthetic */ void m24901d(UncheckedFilterWriter uncheckedFilterWriter, char[] cArr, int i, int i2) {
        uncheckedFilterWriter.m24886v(cArr, i, i2);
    }

    /* renamed from: g */
    public static /* synthetic */ void m24900g(UncheckedFilterWriter uncheckedFilterWriter, String str, int i, int i2) {
        uncheckedFilterWriter.m24883y(str, i, i2);
    }

    /* renamed from: i */
    public static /* synthetic */ void m24899i(UncheckedFilterWriter uncheckedFilterWriter, char[] cArr) {
        uncheckedFilterWriter.m24887u(cArr);
    }

    /* renamed from: j */
    public static /* synthetic */ void m24898j(UncheckedFilterWriter uncheckedFilterWriter) {
        uncheckedFilterWriter.m24889s();
    }

    /* renamed from: k */
    public static /* synthetic */ Writer m24897k(UncheckedFilterWriter uncheckedFilterWriter, CharSequence charSequence, int i, int i2) {
        return uncheckedFilterWriter.m24890r(charSequence, i, i2);
    }

    /* renamed from: l */
    public static /* synthetic */ Writer m24896l(UncheckedFilterWriter uncheckedFilterWriter, CharSequence charSequence) {
        return uncheckedFilterWriter.m24891q(charSequence);
    }

    /* renamed from: m */
    public static /* synthetic */ Writer m24895m(UncheckedFilterWriter uncheckedFilterWriter, char c) {
        return uncheckedFilterWriter.m24892p(c);
    }

    /* renamed from: n */
    public static /* synthetic */ void m24894n(UncheckedFilterWriter uncheckedFilterWriter, int i) {
        uncheckedFilterWriter.m24885w(i);
    }

    /* renamed from: o */
    public static /* synthetic */ void m24893o(UncheckedFilterWriter uncheckedFilterWriter) {
        uncheckedFilterWriter.m24888t();
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: SX1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC22981xa0.m424a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterWriter.m24898j(UncheckedFilterWriter.this);
            }
        });
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: QX1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC22981xa0.m424a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterWriter.m24893o(UncheckedFilterWriter.this);
            }
        });
    }

    /* renamed from: p */
    public final /* synthetic */ Writer m24892p(char c) {
        return super.append(c);
    }

    /* renamed from: q */
    public final /* synthetic */ Writer m24891q(CharSequence charSequence) {
        return super.append(charSequence);
    }

    /* renamed from: r */
    public final /* synthetic */ Writer m24890r(CharSequence charSequence, int i, int i2) {
        return super.append(charSequence, i, i2);
    }

    /* renamed from: s */
    public final /* synthetic */ void m24889s() {
        super.close();
    }

    /* renamed from: t */
    public final /* synthetic */ void m24888t() {
        super.flush();
    }

    /* renamed from: u */
    public final /* synthetic */ void m24887u(char[] cArr) {
        super.write(cArr);
    }

    /* renamed from: v */
    public final /* synthetic */ void m24886v(char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
    }

    /* renamed from: w */
    public final /* synthetic */ void m24885w(int i) {
        super.write(i);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws UncheckedIOException {
        Uncheck.accept(new IOConsumer() { // from class: TX1
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                UncheckedFilterWriter.m24899i(UncheckedFilterWriter.this, (char[]) obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        }, cArr);
    }

    /* renamed from: x */
    public final /* synthetic */ void m24884x(String str) {
        super.write(str);
    }

    /* renamed from: y */
    public final /* synthetic */ void m24883y(String str, int i, int i2) {
        super.write(str, i, i2);
    }

    public UncheckedFilterWriter(Writer writer) {
        super(writer);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws UncheckedIOException {
        Uncheck.accept(new IOTriConsumer() { // from class: PX1
            {
                UncheckedFilterWriter.this = this;
            }

            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public final void accept(Object obj, Object obj2, Object obj3) {
                UncheckedFilterWriter.m24901d(UncheckedFilterWriter.this, (char[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }

            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public /* synthetic */ IOTriConsumer andThen(IOTriConsumer iOTriConsumer) {
                return AbstractC17840Jb0.m67741a(this, iOTriConsumer);
            }
        }, cArr, Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i) throws UncheckedIOException {
        Uncheck.accept(new IOIntConsumer() { // from class: VX1
            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public final void accept(int i2) {
                UncheckedFilterWriter.m24894n(UncheckedFilterWriter.this, i2);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IOIntConsumer andThen(IOIntConsumer iOIntConsumer) {
                return AbstractC20057ga0.m31095a(this, iOIntConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ Consumer asConsumer() {
                return AbstractC20057ga0.m31094b(this);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IntConsumer asIntConsumer() {
                return AbstractC20057ga0.m31093c(this);
            }
        }, i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws UncheckedIOException {
        return (Writer) Uncheck.apply(new IOFunction() { // from class: NX1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedFilterWriter.m24895m(UncheckedFilterWriter.this, ((Character) obj).charValue());
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC19197ba0.m51985e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function) {
                return AbstractC19197ba0.m51984f(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC19197ba0.m51988b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
                return AbstractC19197ba0.m51983g(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function) {
                return AbstractC19197ba0.m51987c(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC19197ba0.m51982h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
                return AbstractC19197ba0.m51986d(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC19197ba0.m51981i(this, iOSupplier);
            }
        }, Character.valueOf(c));
    }

    @Override // java.io.Writer
    public void write(String str) throws UncheckedIOException {
        Uncheck.accept(new IOConsumer() { // from class: UX1
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                UncheckedFilterWriter.m24902b(UncheckedFilterWriter.this, (String) obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return Q90.m66654a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return Q90.m66653b(this);
            }
        }, str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws UncheckedIOException {
        return (Writer) Uncheck.apply(new IOFunction() { // from class: MX1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC19197ba0.m51989a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedFilterWriter.m24896l(UncheckedFilterWriter.this, (CharSequence) obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC19197ba0.m51985e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function) {
                return AbstractC19197ba0.m51984f(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC19197ba0.m51988b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
                return AbstractC19197ba0.m51983g(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function) {
                return AbstractC19197ba0.m51987c(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC19197ba0.m51982h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
                return AbstractC19197ba0.m51986d(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC19197ba0.m51981i(this, iOSupplier);
            }
        }, charSequence);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i, int i2) throws UncheckedIOException {
        Uncheck.accept(new IOTriConsumer() { // from class: OX1
            {
                UncheckedFilterWriter.this = this;
            }

            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public final void accept(Object obj, Object obj2, Object obj3) {
                UncheckedFilterWriter.m24900g(UncheckedFilterWriter.this, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }

            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public /* synthetic */ IOTriConsumer andThen(IOTriConsumer iOTriConsumer) {
                return AbstractC17840Jb0.m67741a(this, iOTriConsumer);
            }
        }, str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws UncheckedIOException {
        return (Writer) Uncheck.apply(new IOTriFunction() { // from class: RX1
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC17968Lb0.m67508a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return UncheckedFilterWriter.m24897k(UncheckedFilterWriter.this, (CharSequence) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, charSequence, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
