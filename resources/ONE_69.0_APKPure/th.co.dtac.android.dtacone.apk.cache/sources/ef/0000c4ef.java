package device;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import device.DeviceName;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class DeviceDatabase extends SQLiteOpenHelper {

    /* renamed from: a */
    public final File f61319a;

    /* renamed from: b */
    public final Context f61320b;

    public DeviceDatabase(Context context) {
        super(context, "android-devices.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f61320b = context.getApplicationContext();
        File databasePath = context.getDatabasePath("android-devices.db");
        this.f61319a = databasePath;
        if (!databasePath.exists()) {
            m31793d();
        }
    }

    /* renamed from: b */
    public final void m31794b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: d */
    public final void m31793d() {
        try {
            getReadableDatabase();
            close();
            m31792g();
        } catch (IOException e) {
            throw new SQLException("Error creating android-devices.db database", e);
        }
    }

    /* renamed from: g */
    public final void m31792g() {
        InputStream open = this.f61320b.getAssets().open("android-devices.db");
        FileOutputStream fileOutputStream = new FileOutputStream(this.f61319a);
        byte[] bArr = new byte[2048];
        while (true) {
            int read = open.read(bArr);
            if (read > 0) {
                fileOutputStream.write(bArr, 0, read);
            } else {
                fileOutputStream.flush();
                m31794b(fileOutputStream);
                m31794b(open);
                return;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i2 > i) {
            if (this.f61320b.deleteDatabase("android-devices.db") || this.f61319a.delete() || !this.f61319a.exists()) {
                m31793d();
            }
        }
    }

    public String query(@Nullable String str, @Nullable String str2) {
        String[] strArr;
        String str3;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        String[] strArr2 = {"name"};
        String str4 = null;
        if (str != null && str2 != null) {
            strArr = new String[]{str, str2};
            str3 = "codename LIKE ? OR model LIKE ?";
        } else if (str != null) {
            str3 = "codename LIKE ?";
            strArr = new String[]{str};
        } else {
            if (str2 != null) {
                strArr = new String[]{str2};
                str3 = "model LIKE ?";
            }
            return str4;
        }
        Cursor query = readableDatabase.query("devices", strArr2, str3, strArr, null, null, null);
        if (query.moveToFirst()) {
            str4 = query.getString(query.getColumnIndexOrThrow("name"));
        }
        m31794b(query);
        m31794b(readableDatabase);
        return str4;
    }

    public DeviceName.DeviceInfo queryToDevice(@Nullable String str, @Nullable String str2) {
        String[] strArr;
        String str3;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        String[] strArr2 = {"name", "codename", "model"};
        DeviceName.DeviceInfo deviceInfo = null;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            str3 = "codename LIKE ? OR model LIKE ?";
            strArr = new String[]{str, str2};
        } else if (!TextUtils.isEmpty(str)) {
            str3 = "codename LIKE ?";
            strArr = new String[]{str};
        } else {
            if (TextUtils.isEmpty(str2)) {
                strArr = new String[]{str2};
                str3 = "model LIKE ?";
            }
            return deviceInfo;
        }
        Cursor query = readableDatabase.query("devices", strArr2, str3, strArr, null, null, null);
        if (query.moveToFirst()) {
            deviceInfo = new DeviceName.DeviceInfo(query.getString(query.getColumnIndexOrThrow("name")), query.getString(query.getColumnIndexOrThrow("codename")), query.getString(query.getColumnIndexOrThrow("model")));
        }
        m31794b(query);
        m31794b(readableDatabase);
        return deviceInfo;
    }
}