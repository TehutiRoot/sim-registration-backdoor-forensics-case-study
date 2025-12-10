package org.apache.commons.p028io.input;

import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Objects;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;
import org.apache.commons.p028io.input.ObservableInputStream;

@Deprecated
/* renamed from: org.apache.commons.io.input.MessageDigestCalculatingInputStream */
/* loaded from: classes6.dex */
public class MessageDigestCalculatingInputStream extends ObservableInputStream {

    /* renamed from: e */
    public final MessageDigest f73463e;

    /* renamed from: org.apache.commons.io.input.MessageDigestCalculatingInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends ObservableInputStream.AbstractBuilder<Builder> {

        /* renamed from: m */
        public MessageDigest f73464m;

        public Builder() {
            try {
                this.f73464m = MessageDigestCalculatingInputStream.m25297o();
            } catch (NoSuchAlgorithmException e) {
                throw new IllegalStateException(e);
            }
        }

        public void setMessageDigest(MessageDigest messageDigest) {
            this.f73464m = messageDigest;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public MessageDigestCalculatingInputStream get() throws IOException {
            setObservers(Arrays.asList(new MessageDigestMaintainingObserver(this.f73464m)));
            return new MessageDigestCalculatingInputStream(this);
        }

        public void setMessageDigest(String str) throws NoSuchAlgorithmException {
            this.f73464m = MessageDigest.getInstance(str);
        }
    }

    /* renamed from: org.apache.commons.io.input.MessageDigestCalculatingInputStream$MessageDigestMaintainingObserver */
    /* loaded from: classes6.dex */
    public static class MessageDigestMaintainingObserver extends ObservableInputStream.Observer {

        /* renamed from: a */
        public final MessageDigest f73465a;

        public MessageDigestMaintainingObserver(MessageDigest messageDigest) {
            Objects.requireNonNull(messageDigest, "messageDigest");
            this.f73465a = messageDigest;
        }

        @Override // org.apache.commons.p028io.input.ObservableInputStream.Observer
        public void data(byte[] bArr, int i, int i2) throws IOException {
            this.f73465a.update(bArr, i, i2);
        }

        @Override // org.apache.commons.p028io.input.ObservableInputStream.Observer
        public void data(int i) throws IOException {
            this.f73465a.update((byte) i);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* renamed from: o */
    public static MessageDigest m25297o() {
        return MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
    }

    public MessageDigest getMessageDigest() {
        return this.f73463e;
    }

    public MessageDigestCalculatingInputStream(Builder builder) {
        super(builder);
        this.f73463e = builder.f73464m;
    }

    @Deprecated
    public MessageDigestCalculatingInputStream(InputStream inputStream) throws NoSuchAlgorithmException {
        this(inputStream, m25297o());
    }

    @Deprecated
    public MessageDigestCalculatingInputStream(InputStream inputStream, MessageDigest messageDigest) {
        super(inputStream, new MessageDigestMaintainingObserver(messageDigest));
        this.f73463e = messageDigest;
    }

    @Deprecated
    public MessageDigestCalculatingInputStream(InputStream inputStream, String str) throws NoSuchAlgorithmException {
        this(inputStream, MessageDigest.getInstance(str));
    }
}