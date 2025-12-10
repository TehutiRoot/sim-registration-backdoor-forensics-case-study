package org.apache.commons.cli;

import java.io.File;
import java.lang.Throwable;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.Date;

@FunctionalInterface
/* loaded from: classes6.dex */
public interface Converter<T, E extends Throwable> {
    public static final Converter<?, RuntimeException> DEFAULT = new Converter() { // from class: uy
        @Override // org.apache.commons.cli.Converter
        public final Object apply(String str) {
            return AbstractC0212Cy.m68902a(str);
        }
    };
    public static final Converter<Class<?>, ClassNotFoundException> CLASS = new Converter() { // from class: vy
        @Override // org.apache.commons.cli.Converter
        public final Object apply(String str) {
            return Class.forName(str);
        }
    };
    public static final Converter<File, NullPointerException> FILE = new Converter() { // from class: wy
        @Override // org.apache.commons.cli.Converter
        public final Object apply(String str) {
            return new File(str);
        }
    };
    public static final Converter<Path, InvalidPathException> PATH = new Converter() { // from class: xy
        @Override // org.apache.commons.cli.Converter
        public final Object apply(String str) {
            return AbstractC0212Cy.m68901b(str);
        }
    };
    public static final Converter<Number, NumberFormatException> NUMBER = new Converter() { // from class: yy
        @Override // org.apache.commons.cli.Converter
        public final Object apply(String str) {
            return AbstractC0212Cy.m68900c(str);
        }
    };
    public static final Converter<Object, ReflectiveOperationException> OBJECT = new Converter() { // from class: zy
        @Override // org.apache.commons.cli.Converter
        public final Object apply(String str) {
            return AbstractC0212Cy.m68899d(str);
        }
    };
    public static final Converter<URL, MalformedURLException> URL = new Converter() { // from class: Ay
        @Override // org.apache.commons.cli.Converter
        public final Object apply(String str) {
            return new URL(str);
        }
    };
    public static final Converter<Date, java.text.ParseException> DATE = new Converter() { // from class: By
        @Override // org.apache.commons.cli.Converter
        public final Object apply(String str) {
            return AbstractC0212Cy.m68898e(str);
        }
    };

    T apply(String str) throws Throwable;
}