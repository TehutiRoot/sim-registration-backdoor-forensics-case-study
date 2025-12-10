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
    public static /* synthetic */ void m25092b(UncheckedFilterWriter uncheckedFilterWriter, String str) {
        uncheckedFilterWriter.m25074x(str);
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: d */
    public static /* synthetic */ void m25091d(UncheckedFilterWriter uncheckedFilterWriter, char[] cArr, int i, int i2) {
        uncheckedFilterWriter.m25076v(cArr, i, i2);
    }

    /* renamed from: g */
    public static /* synthetic */ void m25090g(UncheckedFilterWriter uncheckedFilterWriter, String str, int i, int i2) {
        uncheckedFilterWriter.m25073y(str, i, i2);
    }

    /* renamed from: i */
    public static /* synthetic */ void m25089i(UncheckedFilterWriter uncheckedFilterWriter, char[] cArr) {
        uncheckedFilterWriter.m25077u(cArr);
    }

    /* renamed from: j */
    public static /* synthetic */ void m25088j(UncheckedFilterWriter uncheckedFilterWriter) {
        uncheckedFilterWriter.m25079s();
    }

    /* renamed from: k */
    public static /* synthetic */ Writer m25087k(UncheckedFilterWriter uncheckedFilterWriter, CharSequence charSequence, int i, int i2) {
        return uncheckedFilterWriter.m25080r(charSequence, i, i2);
    }

    /* renamed from: l */
    public static /* synthetic */ Writer m25086l(UncheckedFilterWriter uncheckedFilterWriter, CharSequence charSequence) {
        return uncheckedFilterWriter.m25081q(charSequence);
    }

    /* renamed from: m */
    public static /* synthetic */ Writer m25085m(UncheckedFilterWriter uncheckedFilterWriter, char c) {
        return uncheckedFilterWriter.m25082p(c);
    }

    /* renamed from: n */
    public static /* synthetic */ void m25084n(UncheckedFilterWriter uncheckedFilterWriter, int i) {
        uncheckedFilterWriter.m25075w(i);
    }

    /* renamed from: o */
    public static /* synthetic */ void m25083o(UncheckedFilterWriter uncheckedFilterWriter) {
        uncheckedFilterWriter.m25078t();
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: PY1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC17479Da0.m68815a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterWriter.m25088j(UncheckedFilterWriter.this);
            }
        });
    }

    @Override // java.io.FilterWriter, java.io.Writer, java.io.Flushable
    public void flush() throws UncheckedIOException {
        Uncheck.run(new IORunnable() { // from class: NY1
            @Override // org.apache.commons.p028io.function.IORunnable
            public /* synthetic */ Runnable asRunnable() {
                return AbstractC17479Da0.m68815a(this);
            }

            @Override // org.apache.commons.p028io.function.IORunnable
            public final void run() {
                UncheckedFilterWriter.m25083o(UncheckedFilterWriter.this);
            }
        });
    }

    /* renamed from: p */
    public final /* synthetic */ Writer m25082p(char c) {
        return super.append(c);
    }

    /* renamed from: q */
    public final /* synthetic */ Writer m25081q(CharSequence charSequence) {
        return super.append(charSequence);
    }

    /* renamed from: r */
    public final /* synthetic */ Writer m25080r(CharSequence charSequence, int i, int i2) {
        return super.append(charSequence, i, i2);
    }

    /* renamed from: s */
    public final /* synthetic */ void m25079s() {
        super.close();
    }

    /* renamed from: t */
    public final /* synthetic */ void m25078t() {
        super.flush();
    }

    /* renamed from: u */
    public final /* synthetic */ void m25077u(char[] cArr) {
        super.write(cArr);
    }

    /* renamed from: v */
    public final /* synthetic */ void m25076v(char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
    }

    /* renamed from: w */
    public final /* synthetic */ void m25075w(int i) {
        super.write(i);
    }

    @Override // java.io.Writer
    public void write(char[] cArr) throws UncheckedIOException {
        Uncheck.accept(new IOConsumer() { // from class: QY1
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                UncheckedFilterWriter.m25089i(UncheckedFilterWriter.this, (char[]) obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return W90.m65808a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return W90.m65807b(this);
            }
        }, cArr);
    }

    /* renamed from: x */
    public final /* synthetic */ void m25074x(String str) {
        super.write(str);
    }

    /* renamed from: y */
    public final /* synthetic */ void m25073y(String str, int i, int i2) {
        super.write(str, i, i2);
    }

    public UncheckedFilterWriter(Writer writer) {
        super(writer);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(char[] cArr, int i, int i2) throws UncheckedIOException {
        Uncheck.accept(new IOTriConsumer() { // from class: MY1
            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public final void accept(Object obj, Object obj2, Object obj3) {
                UncheckedFilterWriter.m25091d(UncheckedFilterWriter.this, (char[]) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }

            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public /* synthetic */ IOTriConsumer andThen(IOTriConsumer iOTriConsumer) {
                return AbstractC18262Pb0.m66954a(this, iOTriConsumer);
            }
        }, cArr, Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(int i) throws UncheckedIOException {
        Uncheck.accept(new IOIntConsumer() { // from class: SY1
            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public final void accept(int i2) {
                UncheckedFilterWriter.m25084n(UncheckedFilterWriter.this, i2);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IOIntConsumer andThen(IOIntConsumer iOIntConsumer) {
                return AbstractC21148ma0.m26625a(this, iOIntConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ Consumer asConsumer() {
                return AbstractC21148ma0.m26624b(this);
            }

            @Override // org.apache.commons.p028io.function.IOIntConsumer
            public /* synthetic */ IntConsumer asIntConsumer() {
                return AbstractC21148ma0.m26623c(this);
            }
        }, i);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws UncheckedIOException {
        return (Writer) Uncheck.apply(new IOFunction() { // from class: KY1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedFilterWriter.m25085m(UncheckedFilterWriter.this, ((Character) obj).charValue());
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC20283ha0.m31213e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function) {
                return AbstractC20283ha0.m31212f(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC20283ha0.m31216b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
                return AbstractC20283ha0.m31211g(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function) {
                return AbstractC20283ha0.m31215c(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC20283ha0.m31210h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
                return AbstractC20283ha0.m31214d(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC20283ha0.m31209i(this, iOSupplier);
            }
        }, Character.valueOf(c));
    }

    @Override // java.io.Writer
    public void write(String str) throws UncheckedIOException {
        Uncheck.accept(new IOConsumer() { // from class: RY1
            @Override // org.apache.commons.p028io.function.IOConsumer
            public final void accept(Object obj) {
                UncheckedFilterWriter.m25092b(UncheckedFilterWriter.this, (String) obj);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return W90.m65808a(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOConsumer
            public /* synthetic */ Consumer asConsumer() {
                return W90.m65807b(this);
            }
        }, str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws UncheckedIOException {
        return (Writer) Uncheck.apply(new IOFunction() { // from class: JY1
            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(Consumer consumer) {
                return AbstractC20283ha0.m31217a(this, consumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public final Object apply(Object obj) {
                return UncheckedFilterWriter.m25086l(UncheckedFilterWriter.this, (CharSequence) obj);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ Function asFunction() {
                return AbstractC20283ha0.m31213e(this);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(Function function) {
                return AbstractC20283ha0.m31212f(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOConsumer andThen(IOConsumer iOConsumer) {
                return AbstractC20283ha0.m31216b(this, iOConsumer);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction compose(IOFunction iOFunction) {
                return AbstractC20283ha0.m31211g(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(Function function) {
                return AbstractC20283ha0.m31215c(this, function);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(Supplier supplier) {
                return AbstractC20283ha0.m31210h(this, supplier);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOFunction andThen(IOFunction iOFunction) {
                return AbstractC20283ha0.m31214d(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOFunction
            public /* synthetic */ IOSupplier compose(IOSupplier iOSupplier) {
                return AbstractC20283ha0.m31209i(this, iOSupplier);
            }
        }, charSequence);
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public void write(String str, int i, int i2) throws UncheckedIOException {
        Uncheck.accept(new IOTriConsumer() { // from class: LY1
            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public final void accept(Object obj, Object obj2, Object obj3) {
                UncheckedFilterWriter.m25090g(UncheckedFilterWriter.this, (String) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }

            @Override // org.apache.commons.p028io.function.IOTriConsumer
            public /* synthetic */ IOTriConsumer andThen(IOTriConsumer iOTriConsumer) {
                return AbstractC18262Pb0.m66954a(this, iOTriConsumer);
            }
        }, str, Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws UncheckedIOException {
        return (Writer) Uncheck.apply(new IOTriFunction() { // from class: OY1
            @Override // org.apache.commons.p028io.function.IOTriFunction
            public /* synthetic */ IOTriFunction andThen(IOFunction iOFunction) {
                return AbstractC18392Rb0.m66627a(this, iOFunction);
            }

            @Override // org.apache.commons.p028io.function.IOTriFunction
            public final Object apply(Object obj, Object obj2, Object obj3) {
                return UncheckedFilterWriter.m25087k(UncheckedFilterWriter.this, (CharSequence) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        }, charSequence, Integer.valueOf(i), Integer.valueOf(i2));
    }
}