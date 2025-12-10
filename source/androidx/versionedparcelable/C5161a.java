package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import androidx.versionedparcelable.VersionedParcel;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Set;
import org.apache.http.protocol.HTTP;

/* renamed from: androidx.versionedparcelable.a */
/* loaded from: classes2.dex */
public class C5161a extends VersionedParcel {

    /* renamed from: j */
    public static final Charset f37949j = Charset.forName(HTTP.UTF_16);

    /* renamed from: a */
    public final DataInputStream f37950a;

    /* renamed from: b */
    public final DataOutputStream f37951b;

    /* renamed from: c */
    public DataInputStream f37952c;

    /* renamed from: d */
    public DataOutputStream f37953d;

    /* renamed from: e */
    public C5163b f37954e;

    /* renamed from: f */
    public boolean f37955f;

    /* renamed from: g */
    public int f37956g;

    /* renamed from: h */
    public int f37957h;

    /* renamed from: i */
    public int f37958i;

    /* renamed from: androidx.versionedparcelable.a$b */
    /* loaded from: classes2.dex */
    public static class C5163b {

        /* renamed from: a */
        public final ByteArrayOutputStream f37960a;

        /* renamed from: b */
        public final DataOutputStream f37961b;

        /* renamed from: c */
        public final int f37962c;

        /* renamed from: d */
        public final DataOutputStream f37963d;

        public C5163b(int i, DataOutputStream dataOutputStream) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f37960a = byteArrayOutputStream;
            this.f37961b = new DataOutputStream(byteArrayOutputStream);
            this.f37962c = i;
            this.f37963d = dataOutputStream;
        }

        /* renamed from: a */
        public void m52499a() {
            int i;
            this.f37961b.flush();
            int size = this.f37960a.size();
            int i2 = this.f37962c << 16;
            if (size >= 65535) {
                i = 65535;
            } else {
                i = size;
            }
            this.f37963d.writeInt(i2 | i);
            if (size >= 65535) {
                this.f37963d.writeInt(size);
            }
            this.f37960a.writeTo(this.f37963d);
        }
    }

    public C5161a(InputStream inputStream, OutputStream outputStream) {
        this(inputStream, outputStream, new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
        C5163b c5163b = this.f37954e;
        if (c5163b != null) {
            try {
                if (c5163b.f37960a.size() != 0) {
                    this.f37954e.m52499a();
                }
                this.f37954e = null;
            } catch (IOException e) {
                throw new VersionedParcel.ParcelException(e);
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel createSubParcel() {
        return new C5161a(this.f37952c, this.f37953d, this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean isStream() {
        return true;
    }

    /* renamed from: m */
    public final void m52501m(int i, String str, Bundle bundle) {
        switch (i) {
            case 0:
                bundle.putParcelable(str, null);
                return;
            case 1:
                bundle.putBundle(str, readBundle());
                return;
            case 2:
                bundle.putBundle(str, readBundle());
                return;
            case 3:
                bundle.putString(str, readString());
                return;
            case 4:
                bundle.putStringArray(str, (String[]) readArray(new String[0]));
                return;
            case 5:
                bundle.putBoolean(str, readBoolean());
                return;
            case 6:
                bundle.putBooleanArray(str, readBooleanArray());
                return;
            case 7:
                bundle.putDouble(str, readDouble());
                return;
            case 8:
                bundle.putDoubleArray(str, readDoubleArray());
                return;
            case 9:
                bundle.putInt(str, readInt());
                return;
            case 10:
                bundle.putIntArray(str, readIntArray());
                return;
            case 11:
                bundle.putLong(str, readLong());
                return;
            case 12:
                bundle.putLongArray(str, readLongArray());
                return;
            case 13:
                bundle.putFloat(str, readFloat());
                return;
            case 14:
                bundle.putFloatArray(str, readFloatArray());
                return;
            default:
                throw new RuntimeException("Unknown type " + i);
        }
    }

    /* renamed from: n */
    public final void m52500n(Object obj) {
        if (obj == null) {
            writeInt(0);
        } else if (obj instanceof Bundle) {
            writeInt(1);
            writeBundle((Bundle) obj);
        } else if (obj instanceof String) {
            writeInt(3);
            writeString((String) obj);
        } else if (obj instanceof String[]) {
            writeInt(4);
            writeArray((String[]) obj);
        } else if (obj instanceof Boolean) {
            writeInt(5);
            writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof boolean[]) {
            writeInt(6);
            writeBooleanArray((boolean[]) obj);
        } else if (obj instanceof Double) {
            writeInt(7);
            writeDouble(((Double) obj).doubleValue());
        } else if (obj instanceof double[]) {
            writeInt(8);
            writeDoubleArray((double[]) obj);
        } else if (obj instanceof Integer) {
            writeInt(9);
            writeInt(((Integer) obj).intValue());
        } else if (obj instanceof int[]) {
            writeInt(10);
            writeIntArray((int[]) obj);
        } else if (obj instanceof Long) {
            writeInt(11);
            writeLong(((Long) obj).longValue());
        } else if (obj instanceof long[]) {
            writeInt(12);
            writeLongArray((long[]) obj);
        } else if (obj instanceof Float) {
            writeInt(13);
            writeFloat(((Float) obj).floatValue());
        } else if (obj instanceof float[]) {
            writeInt(14);
            writeFloatArray((float[]) obj);
        } else {
            throw new IllegalArgumentException("Unsupported type " + obj.getClass());
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
        try {
            return this.f37952c.readBoolean();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle readBundle() {
        int readInt = readInt();
        if (readInt < 0) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (int i = 0; i < readInt; i++) {
            m52501m(readInt(), readString(), bundle);
        }
        return bundle;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
        try {
            int readInt = this.f37952c.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                this.f37952c.readFully(bArr);
                return bArr;
            }
            return null;
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public CharSequence readCharSequence() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double readDouble() {
        try {
            return this.f37952c.readDouble();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int i) {
        while (true) {
            try {
                int i2 = this.f37957h;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                int i3 = this.f37956g;
                int i4 = this.f37958i;
                if (i3 < i4) {
                    this.f37950a.skip(i4 - i3);
                }
                this.f37958i = -1;
                int readInt = this.f37950a.readInt();
                this.f37956g = 0;
                int i5 = readInt & 65535;
                if (i5 == 65535) {
                    i5 = this.f37950a.readInt();
                }
                this.f37957h = (readInt >> 16) & 65535;
                this.f37958i = i5;
            } catch (IOException unused) {
                return false;
            }
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float readFloat() {
        try {
            return this.f37952c.readFloat();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
        try {
            return this.f37952c.readInt();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long readLong() {
        try {
            return this.f37952c.readLong();
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Parcelable readParcelable() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String readString() {
        try {
            int readInt = this.f37952c.readInt();
            if (readInt > 0) {
                byte[] bArr = new byte[readInt];
                this.f37952c.readFully(bArr);
                return new String(bArr, f37949j);
            }
            return null;
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder readStrongBinder() {
        return null;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int i) {
        closeField();
        C5163b c5163b = new C5163b(i, this.f37951b);
        this.f37954e = c5163b;
        this.f37953d = c5163b.f37961b;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setSerializationFlags(boolean z, boolean z2) {
        if (z) {
            this.f37955f = z2;
            return;
        }
        throw new RuntimeException("Serialization of this object is not allowed");
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean z) {
        try {
            this.f37953d.writeBoolean(z);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBundle(Bundle bundle) {
        try {
            if (bundle != null) {
                Set<String> keySet = bundle.keySet();
                this.f37953d.writeInt(keySet.size());
                for (String str : keySet) {
                    writeString(str);
                    m52500n(bundle.get(str));
                }
                return;
            }
            this.f37953d.writeInt(-1);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr) {
        try {
            if (bArr != null) {
                this.f37953d.writeInt(bArr.length);
                this.f37953d.write(bArr);
                return;
            }
            this.f37953d.writeInt(-1);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeCharSequence(CharSequence charSequence) {
        if (this.f37955f) {
            return;
        }
        throw new RuntimeException("CharSequence cannot be written to an OutputStream");
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeDouble(double d) {
        try {
            this.f37953d.writeDouble(d);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeFloat(float f) {
        try {
            this.f37953d.writeFloat(f);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int i) {
        try {
            this.f37953d.writeInt(i);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeLong(long j) {
        try {
            this.f37953d.writeLong(j);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(Parcelable parcelable) {
        if (this.f37955f) {
            return;
        }
        throw new RuntimeException("Parcelables cannot be written to an OutputStream");
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(String str) {
        try {
            if (str != null) {
                byte[] bytes = str.getBytes(f37949j);
                this.f37953d.writeInt(bytes.length);
                this.f37953d.write(bytes);
                return;
            }
            this.f37953d.writeInt(-1);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongBinder(IBinder iBinder) {
        if (this.f37955f) {
            return;
        }
        throw new RuntimeException("Binders cannot be written to an OutputStream");
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongInterface(IInterface iInterface) {
        if (this.f37955f) {
            return;
        }
        throw new RuntimeException("Binders cannot be written to an OutputStream");
    }

    public C5161a(InputStream inputStream, OutputStream outputStream, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f37956g = 0;
        this.f37957h = -1;
        this.f37958i = -1;
        DataInputStream dataInputStream = inputStream != null ? new DataInputStream(new C5162a(inputStream)) : null;
        this.f37950a = dataInputStream;
        DataOutputStream dataOutputStream = outputStream != null ? new DataOutputStream(outputStream) : null;
        this.f37951b = dataOutputStream;
        this.f37952c = dataInputStream;
        this.f37953d = dataOutputStream;
    }

    /* renamed from: androidx.versionedparcelable.a$a */
    /* loaded from: classes2.dex */
    public class C5162a extends FilterInputStream {
        public C5162a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() {
            C5161a c5161a = C5161a.this;
            int i = c5161a.f37958i;
            if (i != -1 && c5161a.f37956g >= i) {
                throw new IOException();
            }
            int read = super.read();
            C5161a.this.f37956g++;
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public long skip(long j) {
            C5161a c5161a = C5161a.this;
            int i = c5161a.f37958i;
            if (i != -1 && c5161a.f37956g >= i) {
                throw new IOException();
            }
            long skip = super.skip(j);
            if (skip > 0) {
                C5161a.this.f37956g += (int) skip;
            }
            return skip;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            C5161a c5161a = C5161a.this;
            int i3 = c5161a.f37958i;
            if (i3 != -1 && c5161a.f37956g >= i3) {
                throw new IOException();
            }
            int read = super.read(bArr, i, i2);
            if (read > 0) {
                C5161a.this.f37956g += read;
            }
            return read;
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr, int i, int i2) {
        try {
            if (bArr != null) {
                this.f37953d.writeInt(i2);
                this.f37953d.write(bArr, i, i2);
                return;
            }
            this.f37953d.writeInt(-1);
        } catch (IOException e) {
            throw new VersionedParcel.ParcelException(e);
        }
    }
}
