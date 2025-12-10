package org.apache.commons.p028io.serialization;

import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.regex.Pattern;
import org.apache.commons.p028io.build.AbstractStreamBuilder;

/* renamed from: org.apache.commons.io.serialization.ValidatingObjectInputStream */
/* loaded from: classes6.dex */
public class ValidatingObjectInputStream extends ObjectInputStream {

    /* renamed from: a */
    public final ObjectStreamClassPredicate f73677a;

    /* renamed from: org.apache.commons.io.serialization.ValidatingObjectInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends AbstractStreamBuilder<ValidatingObjectInputStream, Builder> {

        /* renamed from: k */
        public ObjectStreamClassPredicate f73678k = new ObjectStreamClassPredicate();

        public Builder accept(Class<?>... clsArr) {
            this.f73678k.accept(clsArr);
            return this;
        }

        public ObjectStreamClassPredicate getPredicate() {
            return this.f73678k;
        }

        public Builder reject(Class<?>... clsArr) {
            this.f73678k.reject(clsArr);
            return this;
        }

        public Builder setPredicate(ObjectStreamClassPredicate objectStreamClassPredicate) {
            if (objectStreamClassPredicate == null) {
                objectStreamClassPredicate = new ObjectStreamClassPredicate();
            }
            this.f73678k = objectStreamClassPredicate;
            return this;
        }

        public Builder accept(ClassNameMatcher classNameMatcher) {
            this.f73678k.accept(classNameMatcher);
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public ValidatingObjectInputStream get() throws IOException {
            return new ValidatingObjectInputStream(getInputStream(), this.f73678k);
        }

        public Builder reject(ClassNameMatcher classNameMatcher) {
            this.f73678k.reject(classNameMatcher);
            return this;
        }

        public Builder accept(Pattern pattern) {
            this.f73678k.accept(pattern);
            return this;
        }

        public Builder reject(Pattern pattern) {
            this.f73678k.reject(pattern);
            return this;
        }

        public Builder accept(String... strArr) {
            this.f73678k.accept(strArr);
            return this;
        }

        public Builder reject(String... strArr) {
            this.f73678k.reject(strArr);
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    public ValidatingObjectInputStream accept(Class<?>... clsArr) {
        this.f73677a.accept(clsArr);
        return this;
    }

    /* renamed from: b */
    public final void m25060b(String str) {
        if (!this.f73677a.test(str)) {
            invalidClassNameFound(str);
        }
    }

    public void invalidClassNameFound(String str) throws InvalidClassException {
        throw new InvalidClassException("Class name not accepted: " + str);
    }

    public <T> T readObjectCast() throws ClassNotFoundException, IOException {
        return (T) super.readObject();
    }

    public ValidatingObjectInputStream reject(Class<?>... clsArr) {
        this.f73677a.reject(clsArr);
        return this;
    }

    @Override // java.io.ObjectInputStream
    public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
        m25060b(objectStreamClass.getName());
        return super.resolveClass(objectStreamClass);
    }

    @Deprecated
    public ValidatingObjectInputStream(InputStream inputStream) throws IOException {
        this(inputStream, new ObjectStreamClassPredicate());
    }

    public ValidatingObjectInputStream accept(ClassNameMatcher classNameMatcher) {
        this.f73677a.accept(classNameMatcher);
        return this;
    }

    public ValidatingObjectInputStream reject(ClassNameMatcher classNameMatcher) {
        this.f73677a.reject(classNameMatcher);
        return this;
    }

    public ValidatingObjectInputStream(InputStream inputStream, ObjectStreamClassPredicate objectStreamClassPredicate) {
        super(inputStream);
        this.f73677a = objectStreamClassPredicate;
    }

    public ValidatingObjectInputStream accept(Pattern pattern) {
        this.f73677a.accept(pattern);
        return this;
    }

    public ValidatingObjectInputStream reject(Pattern pattern) {
        this.f73677a.reject(pattern);
        return this;
    }

    public ValidatingObjectInputStream accept(String... strArr) {
        this.f73677a.accept(strArr);
        return this;
    }

    public ValidatingObjectInputStream reject(String... strArr) {
        this.f73677a.reject(strArr);
        return this;
    }
}