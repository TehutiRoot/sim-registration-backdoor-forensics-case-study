package com.google.android.gms.common.data;

import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@KeepForSdk
@KeepName
@SafeParcelable.Class(creator = "DataHolderCreator", validate = true)
/* loaded from: classes3.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();

    /* renamed from: k */
    public static final Builder f44976k = new C6350a(new String[0], null);

    /* renamed from: a */
    public final int f44977a;

    /* renamed from: b */
    public final String[] f44978b;

    /* renamed from: c */
    public Bundle f44979c;

    /* renamed from: d */
    public final CursorWindow[] f44980d;

    /* renamed from: e */
    public final int f44981e;

    /* renamed from: f */
    public final Bundle f44982f;

    /* renamed from: g */
    public int[] f44983g;

    /* renamed from: h */
    public int f44984h;

    /* renamed from: i */
    public boolean f44985i;

    /* renamed from: j */
    public boolean f44986j;

    @KeepForSdk
    /* loaded from: classes3.dex */
    public static class Builder {

        /* renamed from: a */
        public final String[] f44987a;

        /* renamed from: b */
        public final ArrayList f44988b = new ArrayList();

        /* renamed from: c */
        public final HashMap f44989c = new HashMap();

        public /* synthetic */ Builder(String[] strArr, String str, zac zacVar) {
            this.f44987a = (String[]) Preconditions.checkNotNull(strArr);
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i) {
            return new DataHolder(this, i);
        }

        @NonNull
        @CanIgnoreReturnValue
        @KeepForSdk
        public Builder withRow(@NonNull ContentValues contentValues) {
            Asserts.checkNotNull(contentValues);
            HashMap hashMap = new HashMap(contentValues.size());
            for (Map.Entry<String, Object> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return zaa(hashMap);
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder zaa(@NonNull HashMap hashMap) {
            Asserts.checkNotNull(hashMap);
            this.f44988b.add(hashMap);
            return this;
        }

        @NonNull
        @KeepForSdk
        public DataHolder build(int i, @NonNull Bundle bundle) {
            return new DataHolder(this, i, bundle);
        }
    }

    @NonNull
    @KeepForSdk
    public static Builder builder(@NonNull String[] strArr) {
        return new Builder(strArr, null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0128, code lost:
        if (r5 != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012a, code lost:
        r5 = new java.lang.StringBuilder();
        r5.append("Couldn't populate window data for row ");
        r5.append(r4);
        r5.append(" - allocating new window.");
        r2.freeLastRow();
        r2 = new android.database.CursorWindow(false);
        r2.setStartPosition(r4);
        r2.setNumColumns(r12.f44987a.length);
        r3.add(r2);
        r4 = r4 - 1;
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015f, code lost:
        throw new com.google.android.gms.common.data.zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.database.CursorWindow[] m48446d(com.google.android.gms.common.data.DataHolder.Builder r12, int r13) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.m48446d(com.google.android.gms.common.data.DataHolder$Builder, int):android.database.CursorWindow[]");
    }

    @NonNull
    @KeepForSdk
    public static DataHolder empty(int i) {
        return new DataHolder(f44976k, i, (Bundle) null);
    }

    /* renamed from: b */
    public final void m48447b(String str, int i) {
        Bundle bundle = this.f44979c;
        if (bundle != null && bundle.containsKey(str)) {
            if (!isClosed()) {
                if (i >= 0 && i < this.f44984h) {
                    return;
                }
                throw new CursorIndexOutOfBoundsException(i, this.f44984h);
            }
            throw new IllegalArgumentException("Buffer is closed.");
        }
        throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @KeepForSdk
    public void close() {
        synchronized (this) {
            try {
                if (!this.f44985i) {
                    this.f44985i = true;
                    int i = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f44980d;
                        if (i >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i].close();
                        i++;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() throws Throwable {
        try {
            if (this.f44986j && this.f44980d.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder();
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public boolean getBoolean(@NonNull String str, int i, int i2) {
        m48447b(str, i);
        if (this.f44980d[i2].getLong(i, this.f44979c.getInt(str)) == 1) {
            return true;
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public byte[] getByteArray(@NonNull String str, int i, int i2) {
        m48447b(str, i);
        return this.f44980d[i2].getBlob(i, this.f44979c.getInt(str));
    }

    @KeepForSdk
    public int getCount() {
        return this.f44984h;
    }

    @KeepForSdk
    public int getInteger(@NonNull String str, int i, int i2) {
        m48447b(str, i);
        return this.f44980d[i2].getInt(i, this.f44979c.getInt(str));
    }

    @KeepForSdk
    public long getLong(@NonNull String str, int i, int i2) {
        m48447b(str, i);
        return this.f44980d[i2].getLong(i, this.f44979c.getInt(str));
    }

    @Nullable
    @KeepForSdk
    public Bundle getMetadata() {
        return this.f44982f;
    }

    @KeepForSdk
    public int getStatusCode() {
        return this.f44981e;
    }

    @NonNull
    @KeepForSdk
    public String getString(@NonNull String str, int i, int i2) {
        m48447b(str, i);
        return this.f44980d[i2].getString(i, this.f44979c.getInt(str));
    }

    @KeepForSdk
    public int getWindowIndex(int i) {
        boolean z;
        int length;
        int i2 = 0;
        if (i >= 0 && i < this.f44984h) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z);
        while (true) {
            int[] iArr = this.f44983g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        if (i2 == length) {
            return i2 - 1;
        }
        return i2;
    }

    @KeepForSdk
    public boolean hasColumn(@NonNull String str) {
        return this.f44979c.containsKey(str);
    }

    @KeepForSdk
    public boolean hasNull(@NonNull String str, int i, int i2) {
        m48447b(str, i);
        return this.f44980d[i2].isNull(i, this.f44979c.getInt(str));
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f44985i;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        String[] strArr = this.f44978b;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeStringArray(parcel, 1, strArr, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f44980d, i, false);
        SafeParcelWriter.writeInt(parcel, 3, getStatusCode());
        SafeParcelWriter.writeBundle(parcel, 4, getMetadata(), false);
        SafeParcelWriter.writeInt(parcel, 1000, this.f44977a);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
        if ((i & 1) != 0) {
            close();
        }
    }

    public final double zaa(@NonNull String str, int i, int i2) {
        m48447b(str, i);
        return this.f44980d[i2].getDouble(i, this.f44979c.getInt(str));
    }

    public final float zab(@NonNull String str, int i, int i2) {
        m48447b(str, i);
        return this.f44980d[i2].getFloat(i, this.f44979c.getInt(str));
    }

    public final void zac(@NonNull String str, int i, int i2, @NonNull CharArrayBuffer charArrayBuffer) {
        m48447b(str, i);
        this.f44980d[i2].copyStringToBuffer(i, this.f44979c.getInt(str), charArrayBuffer);
    }

    public final void zad() {
        this.f44979c = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f44978b;
            if (i2 >= strArr.length) {
                break;
            }
            this.f44979c.putInt(strArr[i2], i2);
            i2++;
        }
        this.f44983g = new int[this.f44980d.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f44980d;
            if (i < cursorWindowArr.length) {
                this.f44983g[i] = i3;
                i3 += this.f44980d[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f44984h = i3;
                return;
            }
        }
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f44985i = false;
        this.f44986j = true;
        this.f44977a = i;
        this.f44978b = strArr;
        this.f44980d = cursorWindowArr;
        this.f44981e = i2;
        this.f44982f = bundle;
    }

    @KeepForSdk
    public DataHolder(@NonNull String[] strArr, @NonNull CursorWindow[] cursorWindowArr, int i, @Nullable Bundle bundle) {
        this.f44985i = false;
        this.f44986j = true;
        this.f44977a = 1;
        this.f44978b = (String[]) Preconditions.checkNotNull(strArr);
        this.f44980d = (CursorWindow[]) Preconditions.checkNotNull(cursorWindowArr);
        this.f44981e = i;
        this.f44982f = bundle;
        zad();
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public DataHolder(@androidx.annotation.NonNull android.database.Cursor r8, int r9, @androidx.annotation.Nullable android.os.Bundle r10) {
        /*
            r7 = this;
            com.google.android.gms.common.sqlite.CursorWrapper r0 = new com.google.android.gms.common.sqlite.CursorWrapper
            r0.<init>(r8)
            java.lang.String[] r8 = r0.getColumnNames()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L2e
            android.database.CursorWindow r3 = r0.getWindow()     // Catch: java.lang.Throwable -> L2e
            r4 = 0
            r5 = 0
            if (r3 == 0) goto L30
            int r6 = r3.getStartPosition()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L30
            r3.acquireReference()     // Catch: java.lang.Throwable -> L2e
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L2e
            r1.add(r3)     // Catch: java.lang.Throwable -> L2e
            int r3 = r3.getNumRows()     // Catch: java.lang.Throwable -> L2e
            goto L31
        L2e:
            r8 = move-exception
            goto L78
        L30:
            r3 = 0
        L31:
            if (r3 >= r2) goto L65
            boolean r6 = r0.moveToPosition(r3)     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L65
            android.database.CursorWindow r6 = r0.getWindow()     // Catch: java.lang.Throwable -> L2e
            if (r6 == 0) goto L46
            r6.acquireReference()     // Catch: java.lang.Throwable -> L2e
            r0.setWindow(r4)     // Catch: java.lang.Throwable -> L2e
            goto L51
        L46:
            android.database.CursorWindow r6 = new android.database.CursorWindow     // Catch: java.lang.Throwable -> L2e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L2e
            r6.setStartPosition(r3)     // Catch: java.lang.Throwable -> L2e
            r0.fillWindow(r3, r6)     // Catch: java.lang.Throwable -> L2e
        L51:
            int r3 = r6.getNumRows()     // Catch: java.lang.Throwable -> L2e
            if (r3 != 0) goto L58
            goto L65
        L58:
            r1.add(r6)     // Catch: java.lang.Throwable -> L2e
            int r3 = r6.getStartPosition()     // Catch: java.lang.Throwable -> L2e
            int r6 = r6.getNumRows()     // Catch: java.lang.Throwable -> L2e
            int r3 = r3 + r6
            goto L31
        L65:
            r0.close()
            int r0 = r1.size()
            android.database.CursorWindow[] r0 = new android.database.CursorWindow[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            android.database.CursorWindow[] r0 = (android.database.CursorWindow[]) r0
            r7.<init>(r8, r0, r9, r10)
            return
        L78:
            r0.close()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.data.DataHolder.<init>(android.database.Cursor, int, android.os.Bundle):void");
    }

    public DataHolder(Builder builder, int i, Bundle bundle) {
        this(builder.f44987a, m48446d(builder, -1), i, (Bundle) null);
    }
}
