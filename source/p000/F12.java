package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.collection.ArrayMap;
import androidx.versionedparcelable.VersionedParcel;

/* renamed from: F12 */
/* loaded from: classes2.dex */
public class F12 extends VersionedParcel {

    /* renamed from: a */
    public final SparseIntArray f1478a;

    /* renamed from: b */
    public final Parcel f1479b;

    /* renamed from: c */
    public final int f1480c;

    /* renamed from: d */
    public final int f1481d;

    /* renamed from: e */
    public final String f1482e;

    /* renamed from: f */
    public int f1483f;

    /* renamed from: g */
    public int f1484g;

    /* renamed from: h */
    public int f1485h;

    public F12(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
        int i = this.f1483f;
        if (i >= 0) {
            int i2 = this.f1478a.get(i);
            int dataPosition = this.f1479b.dataPosition();
            this.f1479b.setDataPosition(i2);
            this.f1479b.writeInt(dataPosition - i2);
            this.f1479b.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel createSubParcel() {
        Parcel parcel = this.f1479b;
        int dataPosition = parcel.dataPosition();
        int i = this.f1484g;
        if (i == this.f1480c) {
            i = this.f1481d;
        }
        int i2 = i;
        return new F12(parcel, dataPosition, i2, this.f1482e + "  ", this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
        if (this.f1479b.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle readBundle() {
        return this.f1479b.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
        int readInt = this.f1479b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f1479b.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public CharSequence readCharSequence() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f1479b);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double readDouble() {
        return this.f1479b.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int i) {
        while (this.f1484g < this.f1481d) {
            int i2 = this.f1485h;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f1479b.setDataPosition(this.f1484g);
            int readInt = this.f1479b.readInt();
            this.f1485h = this.f1479b.readInt();
            this.f1484g += readInt;
        }
        if (this.f1485h != i) {
            return false;
        }
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float readFloat() {
        return this.f1479b.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
        return this.f1479b.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long readLong() {
        return this.f1479b.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Parcelable readParcelable() {
        return this.f1479b.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String readString() {
        return this.f1479b.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder readStrongBinder() {
        return this.f1479b.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int i) {
        closeField();
        this.f1483f = i;
        this.f1478a.put(i, this.f1479b.dataPosition());
        writeInt(0);
        writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean z) {
        this.f1479b.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBundle(Bundle bundle) {
        this.f1479b.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr) {
        if (bArr != null) {
            this.f1479b.writeInt(bArr.length);
            this.f1479b.writeByteArray(bArr);
            return;
        }
        this.f1479b.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeCharSequence(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f1479b, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeDouble(double d) {
        this.f1479b.writeDouble(d);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeFloat(float f) {
        this.f1479b.writeFloat(f);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int i) {
        this.f1479b.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeLong(long j) {
        this.f1479b.writeLong(j);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(Parcelable parcelable) {
        this.f1479b.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(String str) {
        this.f1479b.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongBinder(IBinder iBinder) {
        this.f1479b.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongInterface(IInterface iInterface) {
        this.f1479b.writeStrongInterface(iInterface);
    }

    public F12(Parcel parcel, int i, int i2, String str, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f1478a = new SparseIntArray();
        this.f1483f = -1;
        this.f1485h = -1;
        this.f1479b = parcel;
        this.f1480c = i;
        this.f1481d = i2;
        this.f1484g = i;
        this.f1482e = str;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.f1479b.writeInt(bArr.length);
            this.f1479b.writeByteArray(bArr, i, i2);
            return;
        }
        this.f1479b.writeInt(-1);
    }
}
