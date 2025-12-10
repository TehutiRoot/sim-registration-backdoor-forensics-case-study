package org.apache.commons.p028io.input;

import java.io.FilterInputStream;
import java.io.IOException;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.commons.p028io.function.IOIntConsumer;
import org.apache.commons.p028io.input.ProxyInputStream;

/* renamed from: org.apache.commons.io.input.ChecksumInputStream */
/* loaded from: classes6.dex */
public final class ChecksumInputStream extends CountingInputStream {

    /* renamed from: e */
    public final long f73362e;

    /* renamed from: f */
    public final long f73363f;

    /* renamed from: org.apache.commons.io.input.ChecksumInputStream$Builder */
    /* loaded from: classes6.dex */
    public static class Builder extends ProxyInputStream.AbstractBuilder<ChecksumInputStream, Builder> {

        /* renamed from: l */
        public Checksum f73364l;

        /* renamed from: m */
        public long f73365m = -1;

        /* renamed from: n */
        public long f73366n;

        @Override // org.apache.commons.p028io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ IOIntConsumer getAfterRead() {
            return super.getAfterRead();
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [org.apache.commons.io.input.ChecksumInputStream$Builder, org.apache.commons.io.build.AbstractStreamBuilder] */
        @Override // org.apache.commons.p028io.input.ProxyInputStream.AbstractBuilder
        public /* bridge */ /* synthetic */ Builder setAfterRead(IOIntConsumer iOIntConsumer) {
            return super.setAfterRead(iOIntConsumer);
        }

        public Builder setChecksum(Checksum checksum) {
            this.f73364l = checksum;
            return this;
        }

        public Builder setCountThreshold(long j) {
            this.f73365m = j;
            return this;
        }

        public Builder setExpectedChecksumValue(long j) {
            this.f73366n = j;
            return this;
        }

        @Override // org.apache.commons.p028io.function.IOSupplier
        public ChecksumInputStream get() throws IOException {
            return new ChecksumInputStream(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r6 == (-1)) goto L8;
     */
    @Override // org.apache.commons.p028io.input.CountingInputStream, org.apache.commons.p028io.input.ProxyInputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void afterRead(int r6) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            super.afterRead(r6)     // Catch: java.lang.Throwable -> L17
            long r0 = r5.f73363f     // Catch: java.lang.Throwable -> L17
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L19
            long r0 = r5.getByteCount()     // Catch: java.lang.Throwable -> L17
            long r2 = r5.f73363f     // Catch: java.lang.Throwable -> L17
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L1c
            goto L19
        L17:
            r6 = move-exception
            goto L35
        L19:
            r0 = -1
            if (r6 != r0) goto L33
        L1c:
            long r0 = r5.f73362e     // Catch: java.lang.Throwable -> L17
            java.util.zip.Checksum r6 = r5.m25115d()     // Catch: java.lang.Throwable -> L17
            long r2 = r6.getValue()     // Catch: java.lang.Throwable -> L17
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L2b
            goto L33
        L2b:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "Checksum verification failed."
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L17
            throw r6     // Catch: java.lang.Throwable -> L17
        L33:
            monitor-exit(r5)
            return
        L35:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L17
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.ChecksumInputStream.afterRead(int):void");
    }

    /* renamed from: d */
    public final Checksum m25115d() {
        return ((CheckedInputStream) ((FilterInputStream) this).in).getChecksum();
    }

    public long getRemaining() {
        return this.f73363f - getByteCount();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChecksumInputStream(org.apache.commons.p028io.input.ChecksumInputStream.Builder r5) {
        /*
            r4 = this;
            java.util.zip.CheckedInputStream r0 = new java.util.zip.CheckedInputStream
            java.io.InputStream r1 = r5.getInputStream()
            java.util.zip.Checksum r2 = org.apache.commons.p028io.input.ChecksumInputStream.Builder.m25114e(r5)
            java.lang.String r3 = "builder.checksum"
            java.util.Objects.requireNonNull(r2, r3)
            java.util.zip.Checksum r2 = (java.util.zip.Checksum) r2
            r0.<init>(r1, r2)
            r4.<init>(r0, r5)
            long r0 = org.apache.commons.p028io.input.ChecksumInputStream.Builder.m25113f(r5)
            r4.f73363f = r0
            long r0 = org.apache.commons.p028io.input.ChecksumInputStream.Builder.m25112g(r5)
            r4.f73362e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p028io.input.ChecksumInputStream.<init>(org.apache.commons.io.input.ChecksumInputStream$Builder):void");
    }
}
