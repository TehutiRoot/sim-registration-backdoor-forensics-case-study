package com.google.android.gms.internal.clearcut;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class zzbn extends zzba {

    /* renamed from: b */
    public static final Logger f45535b = Logger.getLogger(zzbn.class.getName());

    /* renamed from: c */
    public static final boolean f45536c = AbstractC22850wn2.m669x();

    /* renamed from: a */
    public C17531Ee2 f45537a;

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$a */
    /* loaded from: classes3.dex */
    public static class C6419a extends zzbn {

        /* renamed from: d */
        public final byte[] f45538d;

        /* renamed from: e */
        public final int f45539e;

        /* renamed from: f */
        public final int f45540f;

        /* renamed from: g */
        public int f45541g;

        public C6419a(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.f45538d = bArr;
            this.f45539e = i;
            this.f45541g = i;
            this.f45540f = i3;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: a */
        public final void mo48172a(int i, zzdo zzdoVar, InterfaceC18637Vk2 interfaceC18637Vk2) {
            zzb(i, 2);
            zzas zzasVar = (zzas) zzdoVar;
            int mo48166b = zzasVar.mo48166b();
            if (mo48166b == -1) {
                mo48166b = interfaceC18637Vk2.mo48246g(zzasVar);
                zzasVar.mo48167a(mo48166b);
            }
            zzo(mo48166b);
            interfaceC18637Vk2.mo48251b(zzdoVar, this.f45537a);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: b */
        public final void mo48171b(zzdo zzdoVar, InterfaceC18637Vk2 interfaceC18637Vk2) {
            zzas zzasVar = (zzas) zzdoVar;
            int mo48166b = zzasVar.mo48166b();
            if (mo48166b == -1) {
                mo48166b = interfaceC18637Vk2.mo48246g(zzasVar);
                zzasVar.mo48167a(mo48166b);
            }
            zzo(mo48166b);
            interfaceC18637Vk2.mo48251b(zzdoVar, this.f45537a);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public void flush() {
        }

        /* renamed from: j */
        public final int m48174j() {
            return this.f45541g - this.f45539e;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f45538d, this.f45541g, i2);
                this.f45541g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45541g), Integer.valueOf(this.f45540f), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b) {
            try {
                byte[] bArr = this.f45538d;
                int i = this.f45541g;
                this.f45541g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45541g), Integer.valueOf(this.f45540f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return this.f45540f - this.f45541g;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, int i2) {
            zzo((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, int i2) {
            zzb(i, 0);
            zzn(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int i, int i2) {
            zzb(i, 0);
            zzo(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int i, int i2) {
            zzb(i, 5);
            zzq(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(String str) {
            int i = this.f45541g;
            try {
                int zzt = zzbn.zzt(str.length() * 3);
                int zzt2 = zzbn.zzt(str.length());
                if (zzt2 != zzt) {
                    zzo(AbstractC6403k.m48230a(str));
                    this.f45541g = AbstractC6403k.m48229b(str, this.f45538d, this.f45541g, zzag());
                    return;
                }
                int i2 = i + zzt2;
                this.f45541g = i2;
                int m48229b = AbstractC6403k.m48229b(str, this.f45538d, i2, zzag());
                this.f45541g = i;
                zzo((m48229b - i) - zzt2);
                this.f45541g = m48229b;
            } catch (zzfi e) {
                this.f45541g = i;
                m48181c(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int i) {
            if (i >= 0) {
                zzo(i);
            } else {
                zzb(i);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int i) {
            if (zzbn.f45536c && zzag() >= 10) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.f45538d;
                    int i2 = this.f45541g;
                    this.f45541g = i2 + 1;
                    AbstractC22850wn2.m682k(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.f45538d;
                int i3 = this.f45541g;
                this.f45541g = 1 + i3;
                AbstractC22850wn2.m682k(bArr2, i3, (byte) i);
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f45538d;
                    int i4 = this.f45541g;
                    this.f45541g = i4 + 1;
                    bArr3[i4] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45541g), Integer.valueOf(this.f45540f), 1), e);
                }
            }
            byte[] bArr4 = this.f45538d;
            int i5 = this.f45541g;
            this.f45541g = i5 + 1;
            bArr4[i5] = (byte) i;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int i) {
            try {
                byte[] bArr = this.f45538d;
                int i2 = this.f45541g;
                int i3 = i2 + 1;
                this.f45541g = i3;
                bArr[i2] = (byte) i;
                int i4 = i2 + 2;
                this.f45541g = i4;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i2 + 3;
                this.f45541g = i5;
                bArr[i4] = (byte) (i >> 16);
                this.f45541g = i2 + 4;
                bArr[i5] = i >> Ascii.CAN;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45541g), Integer.valueOf(this.f45540f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, long j) {
            zzb(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, zzbb zzbbVar) {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzbbVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, long j) {
            zzb(i, 1);
            zzd(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long j) {
            try {
                byte[] bArr = this.f45538d;
                int i = this.f45541g;
                int i2 = i + 1;
                this.f45541g = i2;
                bArr[i] = (byte) j;
                int i3 = i + 2;
                this.f45541g = i3;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i + 3;
                this.f45541g = i4;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i + 4;
                this.f45541g = i5;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i + 5;
                this.f45541g = i6;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i + 6;
                this.f45541g = i7;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i + 7;
                this.f45541g = i8;
                bArr[i7] = (byte) (j >> 48);
                this.f45541g = i + 8;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45541g), Integer.valueOf(this.f45540f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzbb zzbbVar) {
            zzb(i, 2);
            zza(zzbbVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, zzdo zzdoVar) {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdoVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzdo zzdoVar) {
            zzb(i, 2);
            zzb(zzdoVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, boolean z) {
            zzb(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, String str) {
            zzb(i, 2);
            zzg(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long j) {
            if (zzbn.f45536c && zzag() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f45538d;
                    int i = this.f45541g;
                    this.f45541g = i + 1;
                    AbstractC22850wn2.m682k(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f45538d;
                int i2 = this.f45541g;
                this.f45541g = 1 + i2;
                AbstractC22850wn2.m682k(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f45538d;
                    int i3 = this.f45541g;
                    this.f45541g = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f45541g), Integer.valueOf(this.f45540f), 1), e);
                }
            }
            byte[] bArr4 = this.f45538d;
            int i4 = this.f45541g;
            this.f45541g = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzbb zzbbVar) {
            zzo(zzbbVar.size());
            zzbbVar.zza(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(zzdo zzdoVar) {
            zzo(zzdoVar.zzas());
            zzdoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$b */
    /* loaded from: classes3.dex */
    public static final class C6420b extends C6419a {

        /* renamed from: h */
        public final ByteBuffer f45542h;

        /* renamed from: i */
        public int f45543i;

        public C6420b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f45542h = byteBuffer;
            this.f45543i = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn.C6419a, com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.f45542h.position(this.f45543i + m48174j());
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$c */
    /* loaded from: classes3.dex */
    public static final class C6421c extends zzbn {

        /* renamed from: d */
        public final ByteBuffer f45544d;

        /* renamed from: e */
        public final ByteBuffer f45545e;

        /* renamed from: f */
        public final int f45546f;

        public C6421c(ByteBuffer byteBuffer) {
            super();
            this.f45544d = byteBuffer;
            this.f45545e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f45546f = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: a */
        public final void mo48172a(int i, zzdo zzdoVar, InterfaceC18637Vk2 interfaceC18637Vk2) {
            zzb(i, 2);
            mo48171b(zzdoVar, interfaceC18637Vk2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: b */
        public final void mo48171b(zzdo zzdoVar, InterfaceC18637Vk2 interfaceC18637Vk2) {
            zzas zzasVar = (zzas) zzdoVar;
            int mo48166b = zzasVar.mo48166b();
            if (mo48166b == -1) {
                mo48166b = interfaceC18637Vk2.mo48246g(zzasVar);
                zzasVar.mo48167a(mo48166b);
            }
            zzo(mo48166b);
            interfaceC18637Vk2.mo48251b(zzdoVar, this.f45537a);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.f45544d.position(this.f45545e.position());
        }

        /* renamed from: j */
        public final void m48173j(String str) {
            try {
                AbstractC6403k.m48228c(str, this.f45545e);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] bArr, int i, int i2) {
            try {
                this.f45545e.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(e);
            } catch (BufferOverflowException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b) {
            try {
                this.f45545e.put(b);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return this.f45545e.remaining();
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, int i2) {
            zzo((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, int i2) {
            zzb(i, 0);
            zzn(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int i, int i2) {
            zzb(i, 0);
            zzo(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int i, int i2) {
            zzb(i, 5);
            zzq(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(String str) {
            int position = this.f45545e.position();
            try {
                int zzt = zzbn.zzt(str.length() * 3);
                int zzt2 = zzbn.zzt(str.length());
                if (zzt2 != zzt) {
                    zzo(AbstractC6403k.m48230a(str));
                    m48173j(str);
                    return;
                }
                int position2 = this.f45545e.position() + zzt2;
                this.f45545e.position(position2);
                m48173j(str);
                int position3 = this.f45545e.position();
                this.f45545e.position(position);
                zzo(position3 - position2);
                this.f45545e.position(position3);
            } catch (zzfi e) {
                this.f45545e.position(position);
                m48181c(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc(e2);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int i) {
            if (i >= 0) {
                zzo(i);
            } else {
                zzb(i);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int i) {
            while ((i & (-128)) != 0) {
                try {
                    this.f45545e.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzc(e);
                }
            }
            this.f45545e.put((byte) i);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int i) {
            try {
                this.f45545e.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, long j) {
            zzb(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, zzbb zzbbVar) {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzbbVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, long j) {
            zzb(i, 1);
            zzd(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long j) {
            try {
                this.f45545e.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzc(e);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzbb zzbbVar) {
            zzb(i, 2);
            zza(zzbbVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, zzdo zzdoVar) {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdoVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzdo zzdoVar) {
            zzb(i, 2);
            zzb(zzdoVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, boolean z) {
            zzb(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, String str) {
            zzb(i, 2);
            zzg(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long j) {
            while (((-128) & j) != 0) {
                try {
                    this.f45545e.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzc(e);
                }
            }
            this.f45545e.put((byte) j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzbb zzbbVar) {
            zzo(zzbbVar.size());
            zzbbVar.zza(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(zzdo zzdoVar) {
            zzo(zzdoVar.zzas());
            zzdoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$d */
    /* loaded from: classes3.dex */
    public static final class C6422d extends zzbn {

        /* renamed from: d */
        public final ByteBuffer f45547d;

        /* renamed from: e */
        public final ByteBuffer f45548e;

        /* renamed from: f */
        public final long f45549f;

        /* renamed from: g */
        public final long f45550g;

        /* renamed from: h */
        public final long f45551h;

        /* renamed from: i */
        public final long f45552i;

        /* renamed from: j */
        public long f45553j;

        public C6422d(ByteBuffer byteBuffer) {
            super();
            this.f45547d = byteBuffer;
            this.f45548e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long m678o = AbstractC22850wn2.m678o(byteBuffer);
            this.f45549f = m678o;
            long position = byteBuffer.position() + m678o;
            this.f45550g = position;
            long limit = m678o + byteBuffer.limit();
            this.f45551h = limit;
            this.f45552i = limit - 10;
            this.f45553j = position;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: a */
        public final void mo48172a(int i, zzdo zzdoVar, InterfaceC18637Vk2 interfaceC18637Vk2) {
            zzb(i, 2);
            mo48171b(zzdoVar, interfaceC18637Vk2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        /* renamed from: b */
        public final void mo48171b(zzdo zzdoVar, InterfaceC18637Vk2 interfaceC18637Vk2) {
            zzas zzasVar = (zzas) zzdoVar;
            int mo48166b = zzasVar.mo48166b();
            if (mo48166b == -1) {
                mo48166b = interfaceC18637Vk2.mo48246g(zzasVar);
                zzasVar.mo48167a(mo48166b);
            }
            zzo(mo48166b);
            interfaceC18637Vk2.mo48251b(zzdoVar, this.f45537a);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void flush() {
            this.f45547d.position((int) (this.f45553j - this.f45549f));
        }

        /* renamed from: j */
        public final void m48170j(long j) {
            this.f45548e.position((int) (j - this.f45549f));
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void write(byte[] bArr, int i, int i2) {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.f45553j;
                if (this.f45551h - j >= j2) {
                    AbstractC22850wn2.m681l(bArr, i, j2, j);
                    this.f45553j += j;
                    return;
                }
            }
            if (bArr != null) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f45553j), Long.valueOf(this.f45551h), Integer.valueOf(i2)));
            }
            throw new NullPointerException("value");
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(byte b) {
            long j = this.f45553j;
            if (j >= this.f45551h) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f45553j), Long.valueOf(this.f45551h), 1));
            }
            this.f45553j = 1 + j;
            AbstractC22850wn2.m690c(j, b);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final int zzag() {
            return (int) (this.f45551h - this.f45553j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, int i2) {
            zzo((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, int i2) {
            zzb(i, 0);
            zzn(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(int i, int i2) {
            zzb(i, 0);
            zzo(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzf(int i, int i2) {
            zzb(i, 5);
            zzq(i2);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzg(String str) {
            long j = this.f45553j;
            try {
                int zzt = zzbn.zzt(str.length() * 3);
                int zzt2 = zzbn.zzt(str.length());
                if (zzt2 != zzt) {
                    int m48230a = AbstractC6403k.m48230a(str);
                    zzo(m48230a);
                    m48170j(this.f45553j);
                    AbstractC6403k.m48228c(str, this.f45548e);
                    this.f45553j += m48230a;
                    return;
                }
                int i = ((int) (this.f45553j - this.f45549f)) + zzt2;
                this.f45548e.position(i);
                AbstractC6403k.m48228c(str, this.f45548e);
                int position = this.f45548e.position() - i;
                zzo(position);
                this.f45553j += position;
            } catch (zzfi e) {
                this.f45553j = j;
                m48170j(j);
                m48181c(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc(e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc(e3);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzn(int i) {
            if (i >= 0) {
                zzo(i);
            } else {
                zzb(i);
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzo(int i) {
            if (this.f45553j <= this.f45552i) {
                while ((i & (-128)) != 0) {
                    long j = this.f45553j;
                    this.f45553j = j + 1;
                    AbstractC22850wn2.m690c(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.f45553j;
                this.f45553j = 1 + j2;
                AbstractC22850wn2.m690c(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.f45553j;
                if (j3 >= this.f45551h) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f45553j), Long.valueOf(this.f45551h), 1));
                }
                if ((i & (-128)) == 0) {
                    this.f45553j = 1 + j3;
                    AbstractC22850wn2.m690c(j3, (byte) i);
                    return;
                }
                this.f45553j = j3 + 1;
                AbstractC22850wn2.m690c(j3, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzq(int i) {
            this.f45548e.putInt((int) (this.f45553j - this.f45549f), i);
            this.f45553j += 4;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, long j) {
            zzb(i, 0);
            zzb(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, zzbb zzbbVar) {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzbbVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzc(int i, long j) {
            zzb(i, 1);
            zzd(j);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzd(long j) {
            this.f45548e.putLong((int) (this.f45553j - this.f45549f), j);
            this.f45553j += 8;
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzbb zzbbVar) {
            zzb(i, 2);
            zza(zzbbVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, zzdo zzdoVar) {
            zzb(1, 3);
            zzd(2, i);
            zza(3, zzdoVar);
            zzb(1, 4);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, zzdo zzdoVar) {
            zzb(i, 2);
            zzb(zzdoVar);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(int i, boolean z) {
            zzb(i, 0);
            zza(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(int i, String str) {
            zzb(i, 2);
            zzg(str);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(long j) {
            if (this.f45553j <= this.f45552i) {
                while (true) {
                    int i = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                    long j2 = this.f45553j;
                    if (i == 0) {
                        this.f45553j = 1 + j2;
                        AbstractC22850wn2.m690c(j2, (byte) j);
                        return;
                    }
                    this.f45553j = j2 + 1;
                    AbstractC22850wn2.m690c(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            } else {
                while (true) {
                    long j3 = this.f45553j;
                    if (j3 >= this.f45551h) {
                        throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.f45553j), Long.valueOf(this.f45551h), 1));
                    }
                    if ((j & (-128)) == 0) {
                        this.f45553j = 1 + j3;
                        AbstractC22850wn2.m690c(j3, (byte) j);
                        return;
                    }
                    this.f45553j = j3 + 1;
                    AbstractC22850wn2.m690c(j3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            }
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zza(zzbb zzbbVar) {
            zzo(zzbbVar.size());
            zzbbVar.zza(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzbn
        public final void zzb(zzdo zzdoVar) {
            zzo(zzdoVar.zzas());
            zzdoVar.zzb(this);
        }

        @Override // com.google.android.gms.internal.clearcut.zzba
        public final void zza(byte[] bArr, int i, int i2) {
            write(bArr, i, i2);
        }
    }

    /* loaded from: classes3.dex */
    public static class zzc extends IOException {
        public zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public zzc(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzbn.zzc.<init>(java.lang.String):void");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public zzc(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzbn.zzc.<init>(java.lang.String, java.lang.Throwable):void");
        }

        public zzc(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }
    }

    public zzbn() {
    }

    /* renamed from: e */
    public static int m48179e(int i, zzdo zzdoVar, InterfaceC18637Vk2 interfaceC18637Vk2) {
        return zzr(i) + m48178f(zzdoVar, interfaceC18637Vk2);
    }

    /* renamed from: f */
    public static int m48178f(zzdo zzdoVar, InterfaceC18637Vk2 interfaceC18637Vk2) {
        zzas zzasVar = (zzas) zzdoVar;
        int mo48166b = zzasVar.mo48166b();
        if (mo48166b == -1) {
            mo48166b = interfaceC18637Vk2.mo48246g(zzasVar);
            zzasVar.mo48167a(mo48166b);
        }
        return zzt(mo48166b) + mo48166b;
    }

    /* renamed from: g */
    public static int m48177g(int i, zzdo zzdoVar, InterfaceC18637Vk2 interfaceC18637Vk2) {
        int zzr = zzr(i) << 1;
        zzas zzasVar = (zzas) zzdoVar;
        int mo48166b = zzasVar.mo48166b();
        if (mo48166b == -1) {
            mo48166b = interfaceC18637Vk2.mo48246g(zzasVar);
            zzasVar.mo48167a(mo48166b);
        }
        return zzr + mo48166b;
    }

    /* renamed from: h */
    public static long m48176h(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: i */
    public static int m48175i(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int zza(int i, zzcv zzcvVar) {
        int zzr = zzr(i);
        int zzas = zzcvVar.zzas();
        return zzr + zzt(zzas) + zzas;
    }

    public static int zzb(double d) {
        return 8;
    }

    public static int zzc(int i, zzbb zzbbVar) {
        int zzr = zzr(i);
        int size = zzbbVar.size();
        return zzr + zzt(size) + size;
    }

    public static int zzd(int i, long j) {
        return zzr(i) + zzf(j);
    }

    public static int zze(int i, long j) {
        return zzr(i) + zzf(j);
    }

    public static int zzf(int i, long j) {
        return zzr(i) + zzf(m48176h(j));
    }

    public static int zzg(int i, int i2) {
        return zzr(i) + zzs(i2);
    }

    public static int zzh(int i, int i2) {
        return zzr(i) + zzt(i2);
    }

    public static int zzi(int i, int i2) {
        return zzr(i) + zzt(m48175i(i2));
    }

    public static int zzj(int i, int i2) {
        return zzr(i) + 4;
    }

    public static int zzk(int i, int i2) {
        return zzr(i) + 4;
    }

    public static int zzl(int i, int i2) {
        return zzr(i) + zzs(i2);
    }

    public static int zzr(int i) {
        return zzt(i << 3);
    }

    public static int zzs(int i) {
        if (i >= 0) {
            return zzt(i);
        }
        return 10;
    }

    public static int zzt(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int zzu(int i) {
        return zzt(m48175i(i));
    }

    public static int zzv(int i) {
        return 4;
    }

    public static int zzw(int i) {
        return 4;
    }

    public static int zzx(int i) {
        return zzs(i);
    }

    @Deprecated
    public static int zzz(int i) {
        return zzt(i);
    }

    /* renamed from: a */
    public abstract void mo48172a(int i, zzdo zzdoVar, InterfaceC18637Vk2 interfaceC18637Vk2);

    /* renamed from: b */
    public abstract void mo48171b(zzdo zzdoVar, InterfaceC18637Vk2 interfaceC18637Vk2);

    /* renamed from: c */
    public final void m48181c(String str, zzfi zzfiVar) {
        f45535b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzfiVar);
        byte[] bytes = str.getBytes(zzci.f45573a);
        try {
            zzo(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (zzc e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzc(e2);
        }
    }

    public abstract void flush() throws IOException;

    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void zza(byte b) throws IOException;

    public abstract void zza(int i, long j) throws IOException;

    public abstract void zza(int i, zzbb zzbbVar) throws IOException;

    public abstract void zza(int i, zzdo zzdoVar) throws IOException;

    public abstract void zza(int i, String str) throws IOException;

    public abstract void zza(zzbb zzbbVar) throws IOException;

    public abstract int zzag();

    public abstract void zzb(int i, int i2) throws IOException;

    public abstract void zzb(int i, zzbb zzbbVar) throws IOException;

    public abstract void zzb(int i, zzdo zzdoVar) throws IOException;

    public abstract void zzb(int i, boolean z) throws IOException;

    public abstract void zzb(long j) throws IOException;

    public abstract void zzb(zzdo zzdoVar) throws IOException;

    public abstract void zzc(int i, int i2) throws IOException;

    public abstract void zzc(int i, long j) throws IOException;

    public abstract void zzd(int i, int i2) throws IOException;

    public abstract void zzd(long j) throws IOException;

    public abstract void zzf(int i, int i2) throws IOException;

    public abstract void zzg(String str) throws IOException;

    public abstract void zzn(int i) throws IOException;

    public abstract void zzo(int i) throws IOException;

    public final void zzp(int i) throws IOException {
        zzo(m48175i(i));
    }

    public abstract void zzq(int i) throws IOException;

    public static int zza(zzcv zzcvVar) {
        int zzas = zzcvVar.zzas();
        return zzt(zzas) + zzas;
    }

    public static int zzb(float f) {
        return 4;
    }

    public static int zzc(int i, zzdo zzdoVar) {
        return zzr(i) + zzc(zzdoVar);
    }

    public static int zzd(int i, zzbb zzbbVar) {
        return (zzr(1) << 1) + zzh(2, i) + zzc(3, zzbbVar);
    }

    public static int zze(long j) {
        return zzf(j);
    }

    public static int zzf(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int zzg(int i, long j) {
        return zzr(i) + 8;
    }

    public static int zzh(int i, long j) {
        return zzr(i) + 8;
    }

    public static int zzi(long j) {
        return 8;
    }

    public static zzbn zza(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C6420b(byteBuffer);
        }
        if (!byteBuffer.isDirect() || byteBuffer.isReadOnly()) {
            throw new IllegalArgumentException("ByteBuffer is read-only");
        }
        return AbstractC22850wn2.m668y() ? new C6422d(byteBuffer) : new C6421c(byteBuffer);
    }

    public static int zzb(int i, double d) {
        return zzr(i) + 8;
    }

    public static int zzc(int i, boolean z) {
        return zzr(i) + 1;
    }

    public static int zzd(int i, zzdo zzdoVar) {
        return (zzr(1) << 1) + zzh(2, i) + zzc(3, zzdoVar);
    }

    public static int zzg(long j) {
        return zzf(m48176h(j));
    }

    public static int zzh(long j) {
        return 8;
    }

    public final void zze(int i, int i2) throws IOException {
        zzd(i, m48175i(i2));
    }

    public static int zzb(int i, float f) {
        return zzr(i) + 4;
    }

    public static int zzc(zzdo zzdoVar) {
        int zzas = zzdoVar.zzas();
        return zzt(zzas) + zzas;
    }

    @Deprecated
    public static int zzd(zzdo zzdoVar) {
        return zzdoVar.zzas();
    }

    public static int zzh(String str) {
        int length;
        try {
            length = AbstractC6403k.m48230a(str);
        } catch (zzfi unused) {
            length = str.getBytes(zzci.f45573a).length;
        }
        return zzt(length) + length;
    }

    public final void zza(double d) throws IOException {
        zzd(Double.doubleToRawLongBits(d));
    }

    public static int zzb(int i, zzcv zzcvVar) {
        return (zzr(1) << 1) + zzh(2, i) + zza(3, zzcvVar);
    }

    public static zzbn zzc(byte[] bArr) {
        return new C6419a(bArr, 0, bArr.length);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        return zzt(length) + length;
    }

    public final void zza(float f) throws IOException {
        zzq(Float.floatToRawIntBits(f));
    }

    public static int zzb(int i, String str) {
        return zzr(i) + zzh(str);
    }

    public final void zza(int i, double d) throws IOException {
        zzc(i, Double.doubleToRawLongBits(d));
    }

    public final void zzc(long j) throws IOException {
        zzb(m48176h(j));
    }

    public static int zzb(zzbb zzbbVar) {
        int size = zzbbVar.size();
        return zzt(size) + size;
    }

    public final void zza(int i, float f) throws IOException {
        zzf(i, Float.floatToRawIntBits(f));
    }

    public static int zzb(boolean z) {
        return 1;
    }

    public final void zza(boolean z) throws IOException {
        zza(z ? (byte) 1 : (byte) 0);
    }

    public final void zzb(int i, long j) throws IOException {
        zza(i, m48176h(j));
    }
}
