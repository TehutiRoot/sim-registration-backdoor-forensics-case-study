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

/* renamed from: C22 */
/* loaded from: classes2.dex */
public class C22 extends VersionedParcel {

    /* renamed from: a */
    public final SparseIntArray f625a;

    /* renamed from: b */
    public final Parcel f626b;

    /* renamed from: c */
    public final int f627c;

    /* renamed from: d */
    public final int f628d;

    /* renamed from: e */
    public final String f629e;

    /* renamed from: f */
    public int f630f;

    /* renamed from: g */
    public int f631g;

    /* renamed from: h */
    public int f632h;

    public C22(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new ArrayMap(), new ArrayMap(), new ArrayMap());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void closeField() {
        int i = this.f630f;
        if (i >= 0) {
            int i2 = this.f625a.get(i);
            int dataPosition = this.f626b.dataPosition();
            this.f626b.setDataPosition(i2);
            this.f626b.writeInt(dataPosition - i2);
            this.f626b.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public VersionedParcel createSubParcel() {
        Parcel parcel = this.f626b;
        int dataPosition = parcel.dataPosition();
        int i = this.f631g;
        if (i == this.f627c) {
            i = this.f628d;
        }
        int i2 = i;
        return new C22(parcel, dataPosition, i2, this.f629e + "  ", this.mReadCache, this.mWriteCache, this.mParcelizerCache);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readBoolean() {
        if (this.f626b.readInt() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Bundle readBundle() {
        return this.f626b.readBundle(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public byte[] readByteArray() {
        int readInt = this.f626b.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f626b.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public CharSequence readCharSequence() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f626b);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public double readDouble() {
        return this.f626b.readDouble();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public boolean readField(int i) {
        while (this.f631g < this.f628d) {
            int i2 = this.f632h;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f626b.setDataPosition(this.f631g);
            int readInt = this.f626b.readInt();
            this.f632h = this.f626b.readInt();
            this.f631g += readInt;
        }
        if (this.f632h != i) {
            return false;
        }
        return true;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public float readFloat() {
        return this.f626b.readFloat();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public int readInt() {
        return this.f626b.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public long readLong() {
        return this.f626b.readLong();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public Parcelable readParcelable() {
        return this.f626b.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public String readString() {
        return this.f626b.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public IBinder readStrongBinder() {
        return this.f626b.readStrongBinder();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void setOutputField(int i) {
        closeField();
        this.f630f = i;
        this.f625a.put(i, this.f626b.dataPosition());
        writeInt(0);
        writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBoolean(boolean z) {
        this.f626b.writeInt(z ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeBundle(Bundle bundle) {
        this.f626b.writeBundle(bundle);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr) {
        if (bArr != null) {
            this.f626b.writeInt(bArr.length);
            this.f626b.writeByteArray(bArr);
            return;
        }
        this.f626b.writeInt(-1);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeCharSequence(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f626b, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeDouble(double d) {
        this.f626b.writeDouble(d);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeFloat(float f) {
        this.f626b.writeFloat(f);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeInt(int i) {
        this.f626b.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeLong(long j) {
        this.f626b.writeLong(j);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeParcelable(Parcelable parcelable) {
        this.f626b.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeString(String str) {
        this.f626b.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongBinder(IBinder iBinder) {
        this.f626b.writeStrongBinder(iBinder);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeStrongInterface(IInterface iInterface) {
        this.f626b.writeStrongInterface(iInterface);
    }

    public C22(Parcel parcel, int i, int i2, String str, ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        super(arrayMap, arrayMap2, arrayMap3);
        this.f625a = new SparseIntArray();
        this.f630f = -1;
        this.f632h = -1;
        this.f626b = parcel;
        this.f627c = i;
        this.f628d = i2;
        this.f631g = i;
        this.f629e = str;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    public void writeByteArray(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            this.f626b.writeInt(bArr.length);
            this.f626b.writeByteArray(bArr, i, i2);
            return;
        }
        this.f626b.writeInt(-1);
    }
}