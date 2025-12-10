package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.zip.Checksum;

/* JADX INFO: Access modifiers changed from: package-private */
@Immutable
/* loaded from: classes4.dex */
public final class ChecksumHashFunction extends AbstractC0698K implements Serializable {
    private static final long serialVersionUID = 0;
    private final int bits;
    private final InterfaceC18463Sd0 checksumSupplier;
    private final String toString;

    /* renamed from: com.google.common.hash.ChecksumHashFunction$b */
    /* loaded from: classes4.dex */
    public final class C8033b extends AbstractC17092y {

        /* renamed from: b */
        public final Checksum f53847b;

        @Override // p000.AbstractC17092y
        /* renamed from: b */
        public void mo451b(byte b) {
            this.f53847b.update(b);
        }

        @Override // p000.AbstractC17092y
        /* renamed from: e */
        public void mo448e(byte[] bArr, int i, int i2) {
            this.f53847b.update(bArr, i, i2);
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            long value = this.f53847b.getValue();
            if (ChecksumHashFunction.this.bits == 32) {
                return HashCode.fromInt((int) value);
            }
            return HashCode.fromLong(value);
        }

        public C8033b(Checksum checksum) {
            this.f53847b = (Checksum) Preconditions.checkNotNull(checksum);
        }
    }

    public ChecksumHashFunction(InterfaceC18463Sd0 interfaceC18463Sd0, int i, String str) {
        boolean z;
        this.checksumSupplier = (InterfaceC18463Sd0) Preconditions.checkNotNull(interfaceC18463Sd0);
        if (i != 32 && i != 64) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkArgument(z, "bits (%s) must be either 32 or 64", i);
        this.bits = i;
        this.toString = (String) Preconditions.checkNotNull(str);
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return this.bits;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new C8033b((Checksum) this.checksumSupplier.get());
    }

    public String toString() {
        return this.toString;
    }
}